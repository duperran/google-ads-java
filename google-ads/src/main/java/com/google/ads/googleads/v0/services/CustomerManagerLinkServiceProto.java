// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/customer_manager_link_service.proto

package com.google.ads.googleads.v0.services;

public final class CustomerManagerLinkServiceProto {
  private CustomerManagerLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetCustomerManagerLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetCustomerManagerLinkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v0/services/custo" +
      "mer_manager_link_service.proto\022 google.a" +
      "ds.googleads.v0.services\032=google/ads/goo" +
      "gleads/v0/resources/customer_manager_lin" +
      "k.proto\032\034google/api/annotations.proto\"6\n" +
      "\035GetCustomerManagerLinkRequest\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\360\001\n\032CustomerManagerLinkSer" +
      "vice\022\321\001\n\026GetCustomerManagerLink\022?.google" +
      ".ads.googleads.v0.services.GetCustomerMa" +
      "nagerLinkRequest\0326.google.ads.googleads." +
      "v0.resources.CustomerManagerLink\">\202\323\344\223\0028" +
      "\0226/v0/{resource_name=customers/*/custome" +
      "rManagerLinks/*}B\337\001\n$com.google.ads.goog" +
      "leads.v0.servicesB\037CustomerManagerLinkSe" +
      "rviceProtoP\001ZHgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v0/services;se" +
      "rvices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V0.S" +
      "ervices\312\002 Google\\Ads\\GoogleAds\\V0\\Servic" +
      "esb\006proto3"
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
          com.google.ads.googleads.v0.resources.CustomerManagerLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetCustomerManagerLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetCustomerManagerLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetCustomerManagerLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.CustomerManagerLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
