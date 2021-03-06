// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group.proto

package com.google.ads.googleads.v0.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v0/resources/ad_g" +
      "roup.proto\022!google.ads.googleads.v0.reso" +
      "urces\0325google/ads/googleads/v0/common/cu" +
      "stom_parameter.proto\032=google/ads/googlea" +
      "ds/v0/enums/ad_group_ad_rotation_mode.pr" +
      "oto\0323google/ads/googleads/v0/enums/ad_gr" +
      "oup_status.proto\0321google/ads/googleads/v" +
      "0/enums/ad_group_type.proto\032\036google/prot" +
      "obuf/wrappers.proto\"\203\007\n\007AdGroup\022\025\n\rresou" +
      "rce_name\030\001 \001(\t\022\'\n\002id\030\003 \001(\0132\033.google.prot" +
      "obuf.Int64Value\022*\n\004name\030\004 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022N\n\006status\030\005 \001(\0162>.go" +
      "ogle.ads.googleads.v0.enums.AdGroupStatu" +
      "sEnum.AdGroupStatus\022H\n\004type\030\014 \001(\0162:.goog" +
      "le.ads.googleads.v0.enums.AdGroupTypeEnu" +
      "m.AdGroupType\022h\n\020ad_rotation_mode\030\026 \001(\0162" +
      "N.google.ads.googleads.v0.enums.AdGroupA" +
      "dRotationModeEnum.AdGroupAdRotationMode\022" +
      ";\n\025tracking_url_template\030\r \001(\0132\034.google." +
      "protobuf.StringValue\022N\n\025url_custom_param" +
      "eters\030\006 \003(\0132/.google.ads.googleads.v0.co" +
      "mmon.CustomParameter\022.\n\010campaign\030\n \001(\0132\034" +
      ".google.protobuf.StringValue\0223\n\016cpc_bid_" +
      "micros\030\016 \001(\0132\033.google.protobuf.Int64Valu" +
      "e\0223\n\016cpm_bid_micros\030\017 \001(\0132\033.google.proto" +
      "buf.Int64Value\0223\n\016cpa_bid_micros\030\020 \001(\0132\033" +
      ".google.protobuf.Int64Value\0223\n\016cpv_bid_m" +
      "icros\030\021 \001(\0132\033.google.protobuf.Int64Value" +
      "\022:\n\024target_roas_override\030\023 \001(\0132\034.google." +
      "protobuf.DoubleValue\022;\n\026percent_cpc_bid_" +
      "micros\030\024 \001(\0132\033.google.protobuf.Int64Valu" +
      "eB\321\001\n%com.google.ads.googleads.v0.resour" +
      "cesB\014AdGroupProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v0/reso" +
      "urces;resources\242\002\003GAA\252\002!Google.Ads.Googl" +
      "eAds.V0.Resources\312\002!Google\\Ads\\GoogleAds" +
      "\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdGroupTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "CpmBidMicros", "CpaBidMicros", "CpvBidMicros", "TargetRoasOverride", "PercentCpcBidMicros", });
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdGroupTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
