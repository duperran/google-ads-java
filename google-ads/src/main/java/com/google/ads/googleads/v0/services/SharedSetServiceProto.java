// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/shared_set_service.proto

package com.google.ads.googleads.v0.services;

public final class SharedSetServiceProto {
  private SharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetSharedSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetSharedSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v0/services/share" +
      "d_set_service.proto\022 google.ads.googlead" +
      "s.v0.services\0322google/ads/googleads/v0/r" +
      "esources/shared_set.proto\032\034google/api/an" +
      "notations.proto\032 google/protobuf/field_m" +
      "ask.proto\",\n\023GetSharedSetRequest\022\025\n\rreso" +
      "urce_name\030\001 \001(\t\"x\n\027MutateSharedSetsReque" +
      "st\022\023\n\013customer_id\030\001 \001(\t\022H\n\noperations\030\002 " +
      "\003(\01324.google.ads.googleads.v0.services.S" +
      "haredSetOperation\"\344\001\n\022SharedSetOperation" +
      "\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf." +
      "FieldMask\022>\n\006create\030\001 \001(\0132,.google.ads.g" +
      "oogleads.v0.resources.SharedSetH\000\022>\n\006upd" +
      "ate\030\002 \001(\0132,.google.ads.googleads.v0.reso" +
      "urces.SharedSetH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\to" +
      "peration\"d\n\030MutateSharedSetsResponse\022H\n\007" +
      "results\030\002 \003(\01327.google.ads.googleads.v0." +
      "services.MutateSharedSetResult\".\n\025Mutate" +
      "SharedSetResult\022\025\n\rresource_name\030\001 \001(\t2\206" +
      "\003\n\020SharedSetService\022\251\001\n\014GetSharedSet\0225.g" +
      "oogle.ads.googleads.v0.services.GetShare" +
      "dSetRequest\032,.google.ads.googleads.v0.re" +
      "sources.SharedSet\"4\202\323\344\223\002.\022,/v0/{resource" +
      "_name=customers/*/sharedSets/*}\022\305\001\n\020Muta" +
      "teSharedSets\0229.google.ads.googleads.v0.s" +
      "ervices.MutateSharedSetsRequest\032:.google" +
      ".ads.googleads.v0.services.MutateSharedS" +
      "etsResponse\":\202\323\344\223\0024\"//v0/customers/{cust" +
      "omer_id=*}/sharedSets:mutate:\001*B\325\001\n$com." +
      "google.ads.googleads.v0.servicesB\025Shared" +
      "SetServiceProtoP\001ZHgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v0/servic" +
      "es;services\242\002\003GAA\252\002 Google.Ads.GoogleAds" +
      ".V0.Services\312\002 Google\\Ads\\GoogleAds\\V0\\S" +
      "ervicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.SharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetSharedSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetSharedSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetSharedSetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_SharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_SharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SharedSetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedSetsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateSharedSetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.SharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
