// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/recommendation_error.proto

package com.google.ads.googleads.v0.errors;

public final class RecommendationErrorProto {
  private RecommendationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_RecommendationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_RecommendationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v0/errors/recomme" +
      "ndation_error.proto\022\036google.ads.googlead" +
      "s.v0.errors\"\255\002\n\027RecommendationErrorEnum\"" +
      "\221\002\n\023RecommendationError\022\017\n\013UNSPECIFIED\020\000" +
      "\022\013\n\007UNKNOWN\020\001\022\033\n\027BUDGET_AMOUNT_TOO_SMALL" +
      "\020\002\022\033\n\027BUDGET_AMOUNT_TOO_LARGE\020\003\022\031\n\025INVAL" +
      "ID_BUDGET_AMOUNT\020\004\022\020\n\014POLICY_ERROR\020\005\022\026\n\022" +
      "INVALID_BID_AMOUNT\020\006\022\031\n\025ADGROUP_KEYWORD_" +
      "LIMIT\020\007\022\"\n\036RECOMMENDATION_ALREADY_APPLIE" +
      "D\020\010\022\036\n\032RECOMMENDATION_INVALIDATED\020\tB\316\001\n\"" +
      "com.google.ads.googleads.v0.errorsB\030Reco" +
      "mmendationErrorProtoP\001ZDgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v0/e" +
      "rrors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAd" +
      "s.V0.Errors\312\002\036Google\\Ads\\GoogleAds\\V0\\Er" +
      "rorsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_RecommendationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_RecommendationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_RecommendationErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
