// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/google_ads_service.proto

package com.google.ads.googleads.v0.services;

public final class GoogleAdsServiceProto {
  private GoogleAdsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SearchGoogleAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SearchGoogleAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GoogleAdsRow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GoogleAdsRow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v0/services/googl" +
      "e_ads_service.proto\022 google.ads.googlead" +
      "s.v0.services\032,google/ads/googleads/v0/c" +
      "ommon/metrics.proto\0323google/ads/googlead" +
      "s/v0/enums/ad_network_type.proto\032/google" +
      "/ads/googleads/v0/enums/day_of_week.prot" +
      "o\032*google/ads/googleads/v0/enums/device." +
      "proto\0321google/ads/googleads/v0/enums/mon" +
      "th_of_year.proto\032(google/ads/googleads/v" +
      "0/enums/slot.proto\0326google/ads/googleads" +
      "/v0/resources/account_budget.proto\032?goog" +
      "le/ads/googleads/v0/resources/account_bu" +
      "dget_proposal.proto\0320google/ads/googlead" +
      "s/v0/resources/ad_group.proto\0323google/ad" +
      "s/googleads/v0/resources/ad_group_ad.pro" +
      "to\032>google/ads/googleads/v0/resources/ad" +
      "_group_audience_view.proto\032=google/ads/g" +
      "oogleads/v0/resources/ad_group_bid_modif" +
      "ier.proto\032:google/ads/googleads/v0/resou" +
      "rces/ad_group_criterion.proto\0326google/ad" +
      "s/googleads/v0/resources/age_range_view." +
      "proto\0328google/ads/googleads/v0/resources" +
      "/bidding_strategy.proto\0325google/ads/goog" +
      "leads/v0/resources/billing_setup.proto\0320" +
      "google/ads/googleads/v0/resources/campai" +
      "gn.proto\032=google/ads/googleads/v0/resour" +
      "ces/campaign_bid_modifier.proto\0327google/" +
      "ads/googleads/v0/resources/campaign_budg" +
      "et.proto\032:google/ads/googleads/v0/resour" +
      "ces/campaign_criterion.proto\0326google/ads" +
      "/googleads/v0/resources/campaign_group.p" +
      "roto\032;google/ads/googleads/v0/resources/" +
      "campaign_shared_set.proto\0325google/ads/go" +
      "ogleads/v0/resources/change_status.proto" +
      "\0320google/ads/googleads/v0/resources/cust" +
      "omer.proto\032<google/ads/googleads/v0/reso" +
      "urces/customer_client_link.proto\032=google" +
      "/ads/googleads/v0/resources/customer_man" +
      "ager_link.proto\032<google/ads/googleads/v0" +
      "/resources/display_keyword_view.proto\0323g" +
      "oogle/ads/googleads/v0/resources/gender_" +
      "view.proto\032;google/ads/googleads/v0/reso" +
      "urces/geo_target_constant.proto\0328google/" +
      "ads/googleads/v0/resources/hotel_group_v" +
      "iew.proto\0324google/ads/googleads/v0/resou" +
      "rces/keyword_view.proto\032>google/ads/goog" +
      "leads/v0/resources/managed_placement_vie" +
      "w.proto\032<google/ads/googleads/v0/resourc" +
      "es/parental_status_view.proto\032:google/ad" +
      "s/googleads/v0/resources/product_group_v" +
      "iew.proto\0326google/ads/googleads/v0/resou" +
      "rces/recommendation.proto\0328google/ads/go" +
      "ogleads/v0/resources/shared_criterion.pr" +
      "oto\0322google/ads/googleads/v0/resources/s" +
      "hared_set.proto\0326google/ads/googleads/v0" +
      "/resources/topic_constant.proto\0322google/" +
      "ads/googleads/v0/resources/topic_view.pr" +
      "oto\032-google/ads/googleads/v0/resources/v" +
      "ideo.proto\032\034google/api/annotations.proto" +
      "\032 google/protobuf/field_mask.proto\032\036goog" +
      "le/protobuf/wrappers.proto\"c\n\026SearchGoog" +
      "leAdsRequest\022\023\n\013customer_id\030\001 \001(\t\022\r\n\005que" +
      "ry\030\002 \001(\t\022\022\n\npage_token\030\003 \001(\t\022\021\n\tpage_siz" +
      "e\030\004 \001(\005\"\300\001\n\027SearchGoogleAdsResponse\022?\n\007r" +
      "esults\030\001 \003(\0132..google.ads.googleads.v0.s" +
      "ervices.GoogleAdsRow\022\027\n\017next_page_token\030" +
      "\002 \001(\t\022\033\n\023total_results_count\030\003 \001(\003\022.\n\nfi" +
      "eld_mask\030\005 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\"\357\031\n\014GoogleAdsRow\022H\n\016account_budget\030* " +
      "\001(\01320.google.ads.googleads.v0.resources." +
      "AccountBudget\022Y\n\027account_budget_proposal" +
      "\030+ \001(\01328.google.ads.googleads.v0.resourc" +
      "es.AccountBudgetProposal\022<\n\010ad_group\030\003 \001" +
      "(\0132*.google.ads.googleads.v0.resources.A" +
      "dGroup\022A\n\013ad_group_ad\030\020 \001(\0132,.google.ads" +
      ".googleads.v0.resources.AdGroupAd\022V\n\026ad_" +
      "group_audience_view\0309 \001(\01326.google.ads.g" +
      "oogleads.v0.resources.AdGroupAudienceVie" +
      "w\022T\n\025ad_group_bid_modifier\030\030 \001(\01325.googl" +
      "e.ads.googleads.v0.resources.AdGroupBidM" +
      "odifier\022O\n\022ad_group_criterion\030\021 \001(\01323.go" +
      "ogle.ads.googleads.v0.resources.AdGroupC" +
      "riterion\022G\n\016age_range_view\0300 \001(\0132/.googl" +
      "e.ads.googleads.v0.resources.AgeRangeVie" +
      "w\022L\n\020bidding_strategy\030\022 \001(\01322.google.ads" +
      ".googleads.v0.resources.BiddingStrategy\022" +
      "F\n\rbilling_setup\030) \001(\0132/.google.ads.goog" +
      "leads.v0.resources.BillingSetup\022J\n\017campa" +
      "ign_budget\030\023 \001(\01321.google.ads.googleads." +
      "v0.resources.CampaignBudget\022=\n\010campaign\030" +
      "\002 \001(\0132+.google.ads.googleads.v0.resource" +
      "s.Campaign\022U\n\025campaign_bid_modifier\030\032 \001(" +
      "\01326.google.ads.googleads.v0.resources.Ca" +
      "mpaignBidModifier\022P\n\022campaign_criterion\030" +
      "\024 \001(\01324.google.ads.googleads.v0.resource" +
      "s.CampaignCriterion\022H\n\016campaign_group\030\031 " +
      "\001(\01320.google.ads.googleads.v0.resources." +
      "CampaignGroup\022Q\n\023campaign_shared_set\030\036 \001" +
      "(\01324.google.ads.googleads.v0.resources.C" +
      "ampaignSharedSet\022F\n\rchange_status\030% \001(\0132" +
      "/.google.ads.googleads.v0.resources.Chan" +
      "geStatus\022=\n\010customer\030\001 \001(\0132+.google.ads." +
      "googleads.v0.resources.Customer\022U\n\025custo" +
      "mer_manager_link\030= \001(\01326.google.ads.goog" +
      "leads.v0.resources.CustomerManagerLink\022S" +
      "\n\024customer_client_link\030> \001(\01325.google.ad" +
      "s.googleads.v0.resources.CustomerClientL" +
      "ink\022S\n\024display_keyword_view\030/ \001(\01325.goog" +
      "le.ads.googleads.v0.resources.DisplayKey" +
      "wordView\022B\n\013gender_view\030( \001(\0132-.google.a" +
      "ds.googleads.v0.resources.GenderView\022Q\n\023" +
      "geo_target_constant\030\027 \001(\01324.google.ads.g" +
      "oogleads.v0.resources.GeoTargetConstant\022" +
      "K\n\020hotel_group_view\0303 \001(\01321.google.ads.g" +
      "oogleads.v0.resources.HotelGroupView\022D\n\014" +
      "keyword_view\030\025 \001(\0132..google.ads.googlead" +
      "s.v0.resources.KeywordView\022W\n\026managed_pl" +
      "acement_view\0305 \001(\01327.google.ads.googlead" +
      "s.v0.resources.ManagedPlacementView\022S\n\024p" +
      "arental_status_view\030- \001(\01325.google.ads.g" +
      "oogleads.v0.resources.ParentalStatusView" +
      "\022O\n\022product_group_view\0306 \001(\01323.google.ad" +
      "s.googleads.v0.resources.ProductGroupVie" +
      "w\022I\n\016recommendation\030\026 \001(\01321.google.ads.g" +
      "oogleads.v0.resources.Recommendation\022L\n\020" +
      "shared_criterion\030\035 \001(\01322.google.ads.goog" +
      "leads.v0.resources.SharedCriterion\022@\n\nsh" +
      "ared_set\030\033 \001(\0132,.google.ads.googleads.v0" +
      ".resources.SharedSet\022@\n\ntopic_view\030, \001(\013" +
      "2,.google.ads.googleads.v0.resources.Top" +
      "icView\022H\n\016topic_constant\030\037 \001(\01320.google." +
      "ads.googleads.v0.resources.TopicConstant" +
      "\0227\n\005video\030\' \001(\0132(.google.ads.googleads.v" +
      "0.resources.Video\0228\n\007metrics\030\004 \001(\0132\'.goo" +
      "gle.ads.googleads.v0.common.Metrics\022W\n\017a" +
      "d_network_type\030\005 \001(\0162>.google.ads.google" +
      "ads.v0.enums.AdNetworkTypeEnum.AdNetwork" +
      "Type\022*\n\004date\030\006 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022K\n\013day_of_week\030\007 \001(\01626.google.a" +
      "ds.googleads.v0.enums.DayOfWeekEnum.DayO" +
      "fWeek\022@\n\006device\030\010 \001(\01620.google.ads.googl" +
      "eads.v0.enums.DeviceEnum.Device\022)\n\004hour\030" +
      "\t \001(\0132\033.google.protobuf.Int32Value\022+\n\005mo" +
      "nth\030\n \001(\0132\034.google.protobuf.StringValue\022" +
      "Q\n\rmonth_of_year\030\034 \001(\0162:.google.ads.goog" +
      "leads.v0.enums.MonthOfYearEnum.MonthOfYe" +
      "ar\022-\n\007quarter\030\014 \001(\0132\034.google.protobuf.St" +
      "ringValue\022:\n\004slot\030\r \001(\0162,.google.ads.goo" +
      "gleads.v0.enums.SlotEnum.Slot\022*\n\004week\030\016 " +
      "\001(\0132\034.google.protobuf.StringValue\022)\n\004yea" +
      "r\030\017 \001(\0132\033.google.protobuf.Int32Value2\315\001\n" +
      "\020GoogleAdsService\022\270\001\n\006Search\0228.google.ad" +
      "s.googleads.v0.services.SearchGoogleAdsR" +
      "equest\0329.google.ads.googleads.v0.service" +
      "s.SearchGoogleAdsResponse\"9\202\323\344\223\0023\"./v0/c" +
      "ustomers/{customer_id=*}/googleAds:searc" +
      "h:\001*B\325\001\n$com.google.ads.googleads.v0.ser" +
      "vicesB\025GoogleAdsServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v0/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V0.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.common.MetricsProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.SlotProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AccountBudgetProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AccountBudgetProposalProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdGroupProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdGroupAdProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdGroupAudienceViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdGroupBidModifierProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.AgeRangeViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.BiddingStrategyProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.BillingSetupProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignBidModifierProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignBudgetProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignCriterionProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignGroupProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CampaignSharedSetProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.ChangeStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CustomerProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CustomerClientLinkProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.CustomerManagerLinkProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.DisplayKeywordViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.GenderViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.GeoTargetConstantProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.HotelGroupViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.KeywordViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.ManagedPlacementViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.ParentalStatusViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.ProductGroupViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.RecommendationProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.SharedCriterionProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.SharedSetProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.TopicConstantProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.TopicViewProto.getDescriptor(),
          com.google.ads.googleads.v0.resources.VideoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SearchGoogleAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Query", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SearchGoogleAdsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", "TotalResultsCount", "FieldMask", });
    internal_static_google_ads_googleads_v0_services_GoogleAdsRow_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_GoogleAdsRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GoogleAdsRow_descriptor,
        new java.lang.String[] { "AccountBudget", "AccountBudgetProposal", "AdGroup", "AdGroupAd", "AdGroupAudienceView", "AdGroupBidModifier", "AdGroupCriterion", "AgeRangeView", "BiddingStrategy", "BillingSetup", "CampaignBudget", "Campaign", "CampaignBidModifier", "CampaignCriterion", "CampaignGroup", "CampaignSharedSet", "ChangeStatus", "Customer", "CustomerManagerLink", "CustomerClientLink", "DisplayKeywordView", "GenderView", "GeoTargetConstant", "HotelGroupView", "KeywordView", "ManagedPlacementView", "ParentalStatusView", "ProductGroupView", "Recommendation", "SharedCriterion", "SharedSet", "TopicView", "TopicConstant", "Video", "Metrics", "AdNetworkType", "Date", "DayOfWeek", "Device", "Hour", "Month", "MonthOfYear", "Quarter", "Slot", "Week", "Year", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.common.MetricsProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v0.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v0.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v0.enums.SlotProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AccountBudgetProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AccountBudgetProposalProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdGroupProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdGroupAdProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdGroupAudienceViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdGroupBidModifierProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AdGroupCriterionProto.getDescriptor();
    com.google.ads.googleads.v0.resources.AgeRangeViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.BiddingStrategyProto.getDescriptor();
    com.google.ads.googleads.v0.resources.BillingSetupProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignBidModifierProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignBudgetProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignCriterionProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignGroupProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CampaignSharedSetProto.getDescriptor();
    com.google.ads.googleads.v0.resources.ChangeStatusProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CustomerProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CustomerClientLinkProto.getDescriptor();
    com.google.ads.googleads.v0.resources.CustomerManagerLinkProto.getDescriptor();
    com.google.ads.googleads.v0.resources.DisplayKeywordViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.GenderViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.GeoTargetConstantProto.getDescriptor();
    com.google.ads.googleads.v0.resources.HotelGroupViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.KeywordViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.ManagedPlacementViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.ParentalStatusViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.ProductGroupViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.RecommendationProto.getDescriptor();
    com.google.ads.googleads.v0.resources.SharedCriterionProto.getDescriptor();
    com.google.ads.googleads.v0.resources.SharedSetProto.getDescriptor();
    com.google.ads.googleads.v0.resources.TopicConstantProto.getDescriptor();
    com.google.ads.googleads.v0.resources.TopicViewProto.getDescriptor();
    com.google.ads.googleads.v0.resources.VideoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
