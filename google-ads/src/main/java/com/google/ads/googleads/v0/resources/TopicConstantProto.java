// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/topic_constant.proto

package com.google.ads.googleads.v0.resources;

public final class TopicConstantProto {
  private TopicConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_TopicConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_TopicConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v0/resources/topi" +
      "c_constant.proto\022!google.ads.googleads.v" +
      "0.resources\032\036google/protobuf/wrappers.pr" +
      "oto\"\270\001\n\rTopicConstant\022\025\n\rresource_name\030\001" +
      " \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobuf.Int64" +
      "Value\022;\n\025topic_constant_parent\030\003 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022*\n\004path\030\004 \003(\013" +
      "2\034.google.protobuf.StringValueB\327\001\n%com.g" +
      "oogle.ads.googleads.v0.resourcesB\022TopicC" +
      "onstantProtoP\001ZJgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v0/resources" +
      ";resources\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V0.Resources\312\002!Google\\Ads\\GoogleAds\\V0\\R" +
      "esourcesb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_TopicConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_TopicConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_TopicConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "TopicConstantParent", "Path", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
