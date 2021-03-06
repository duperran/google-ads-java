// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/media_file_service.proto

package com.google.ads.googleads.v0.services;

public interface MutateMediaFilesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.MutateMediaFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose media files are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose media files are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual media file.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MediaFileOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v0.services.MediaFileOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual media file.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MediaFileOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.MediaFileOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual media file.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MediaFileOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual media file.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MediaFileOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.services.MediaFileOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual media file.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.MediaFileOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.MediaFileOperationOrBuilder getOperationsOrBuilder(
      int index);
}
