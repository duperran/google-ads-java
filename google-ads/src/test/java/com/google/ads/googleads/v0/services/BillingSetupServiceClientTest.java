/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.BillingSetup;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class BillingSetupServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupAudienceViewService mockAdGroupAudienceViewService;
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupService mockAdGroupService;
  private static MockAgeRangeViewService mockAgeRangeViewService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignGroupService mockCampaignGroupService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockConversionActionService mockConversionActionService;
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockCustomerService mockCustomerService;
  private static MockDisplayKeywordViewService mockDisplayKeywordViewService;
  private static MockGenderViewService mockGenderViewService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockManagedPlacementViewService mockManagedPlacementViewService;
  private static MockMediaFileService mockMediaFileService;
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockRecommendationService mockRecommendationService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private BillingSetupServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupAudienceViewService = new MockAdGroupAudienceViewService();
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupService = new MockAdGroupService();
    mockAgeRangeViewService = new MockAgeRangeViewService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignGroupService = new MockCampaignGroupService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockChangeStatusService = new MockChangeStatusService();
    mockConversionActionService = new MockConversionActionService();
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockCustomerService = new MockCustomerService();
    mockDisplayKeywordViewService = new MockDisplayKeywordViewService();
    mockGenderViewService = new MockGenderViewService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockKeywordViewService = new MockKeywordViewService();
    mockManagedPlacementViewService = new MockManagedPlacementViewService();
    mockMediaFileService = new MockMediaFileService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockRecommendationService = new MockRecommendationService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
                mockAdGroupAdService,
                mockAdGroupAudienceViewService,
                mockAdGroupBidModifierService,
                mockAdGroupCriterionService,
                mockAdGroupService,
                mockAgeRangeViewService,
                mockBiddingStrategyService,
                mockBillingSetupService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignGroupService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockChangeStatusService,
                mockConversionActionService,
                mockCustomerClientLinkService,
                mockCustomerManagerLinkService,
                mockCustomerService,
                mockDisplayKeywordViewService,
                mockGenderViewService,
                mockGeoTargetConstantService,
                mockGoogleAdsFieldService,
                mockGoogleAdsService,
                mockHotelGroupViewService,
                mockKeywordViewService,
                mockManagedPlacementViewService,
                mockMediaFileService,
                mockParentalStatusViewService,
                mockProductGroupViewService,
                mockRecommendationService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockTopicConstantService,
                mockTopicViewService,
                mockVideoService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    BillingSetupServiceSettings settings =
        BillingSetupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BillingSetupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getBillingSetupTest() {
    String resourceName2 = "resourceName2625949903";
    BillingSetup expectedResponse =
        BillingSetup.newBuilder().setResourceName(resourceName2).build();
    mockBillingSetupService.addResponse(expectedResponse);

    String formattedResourceName =
        BillingSetupServiceClient.formatBillingSetupName("[CUSTOMER]", "[BILLING_SETUP]");

    BillingSetup actualResponse = client.getBillingSetup(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockBillingSetupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBillingSetupRequest actualRequest = (GetBillingSetupRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getBillingSetupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockBillingSetupService.addException(exception);

    try {
      String formattedResourceName =
          BillingSetupServiceClient.formatBillingSetupName("[CUSTOMER]", "[BILLING_SETUP]");

      client.getBillingSetup(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBillingSetupTest() {
    MutateBillingSetupResponse expectedResponse = MutateBillingSetupResponse.newBuilder().build();
    mockBillingSetupService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    BillingSetupOperation operation = BillingSetupOperation.newBuilder().build();

    MutateBillingSetupResponse actualResponse = client.mutateBillingSetup(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockBillingSetupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBillingSetupRequest actualRequest = (MutateBillingSetupRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBillingSetupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockBillingSetupService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      BillingSetupOperation operation = BillingSetupOperation.newBuilder().build();

      client.mutateBillingSetup(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
