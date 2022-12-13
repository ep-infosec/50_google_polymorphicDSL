Feature: PDSL Jave Reports

Rule: Reporting
Reports generated by the Test Runner provide traceability for test scenarios. For example, if a test
is run for the API as well as a Unit test a report will show in which contexts the test passes or fails.

Scenario: Traceable Reporting
If PDSL tests are run as part of a @PdslTestSuite then very powerful diagnostic reports will be created.
Because a test resource can be executed in separate test runners in different contexts it is possible for the test to pass in one context and fail in another. For example, "Unit" tests may pass for that feature but "API" tests might fail. It is useful to trace failures to _where in the application stack it failed_.

This is also useful because an application may be deployed on multiple platforms. Knowing whether or not a specific capability is possible by platform and being able to compare it to the others lets you know if the issue is widespread or local to that specific app at a glance.

Given a suite of PDSL tests:
"""
		@RunWith(PdslTestSuite.class)
		@Suite.SuiteClasses(value = {UnitTests.class, ApiTests.class})
		@PdslTestSuite.PdslSuiteClasses(
						systemUnderTest = "Polymorphic DSL Test Framework"
		)
		public class UserAcceptanceTestSuiteTest {}
		"""
And the PDSL test suite contains a test for application "MyApp" and context "Unit"
And the PDSL test suite contains a test for application "MyApp" and context "API"
And the context "Unit" test will pass
But the context "API" test will fail
When the test runner executes
Then a report is generated
And the report shows that the test passes in the "Unit" context
And the report shows that the test fails in the "API" context

Scenario: Traceable Reporting with custom report Generator
Given a suite of PDSL tests
And the PDSL test suite specifies a "reportGenerator" parameter:
"""
			@RunWith(PdslTestSuite.class)
			@Suite.SuiteClasses(value = {UnitTests.class, ApiTests.class})
			@PdslTestSuite.PdslSuiteClasses(
							systemUnderTest = "Polymorphic DSL Test Framework",
							reportGenerator = DefaultAsciidoctorReportGeneratorProvider.class
			)
			public class UserAcceptanceTestSuiteTest {}
			"""
And the PDSL test suite contains a test for application "MyApp" and context "Unit"
And the PDSL test suite contains a test for application "MyApp" and context "API"
And the context "Unit" test will pass
But the context "API" test will fail
When the test runner executes
Then a report is generated
And the report shows that the test passes in the "Unit" context
And the report shows that the test fails in the "API" context