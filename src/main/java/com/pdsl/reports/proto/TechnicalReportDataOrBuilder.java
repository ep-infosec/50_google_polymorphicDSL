// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/pdsl/reports/proto/StrategicReportData.proto

package com.pdsl.reports.proto;

public interface TechnicalReportDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.pdsl.reports.proto.TechnicalReportData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string test_case_title = 1;</code>
   */
  java.lang.String getTestCaseTitle();
  /**
   * <code>string test_case_title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTestCaseTitleBytes();

  /**
   * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>.com.pdsl.reports.proto.TechnicalReportData.Status status = 2;</code>
   */
  com.pdsl.reports.proto.TechnicalReportData.Status getStatus();

  /**
   * <code>string failing_phrase = 3;</code>
   */
  java.lang.String getFailingPhrase();
  /**
   * <code>string failing_phrase = 3;</code>
   */
  com.google.protobuf.ByteString
      getFailingPhraseBytes();

  /**
   * <code>string failure_reason = 4;</code>
   */
  java.lang.String getFailureReason();
  /**
   * <code>string failure_reason = 4;</code>
   */
  com.google.protobuf.ByteString
      getFailureReasonBytes();

  /**
   * <code>uint32 failing_phrase_index = 5;</code>
   */
  int getFailingPhraseIndex();

  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  java.util.List<java.lang.String>
      getFilteredPhraseBodyList();
  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  int getFilteredPhraseBodyCount();
  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  java.lang.String getFilteredPhraseBody(int index);
  /**
   * <code>repeated string filtered_phrase_body = 6;</code>
   */
  com.google.protobuf.ByteString
      getFilteredPhraseBodyBytes(int index);

  /**
   * <code>uint32 phrases_skipped_due_to_failure = 7;</code>
   */
  int getPhrasesSkippedDueToFailure();
}