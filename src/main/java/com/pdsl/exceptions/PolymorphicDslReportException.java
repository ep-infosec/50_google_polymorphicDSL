package com.pdsl.exceptions;

/** Error that is used when the reports generated by PDSL have a fault.
 *
 * This more or less implies that the tests finished executing but the application crashes purely due to a failure
 * when describing the test results.
 */
public class PolymorphicDslReportException extends RuntimeException {

    public PolymorphicDslReportException(String message) {
        super(message);
    }
}
