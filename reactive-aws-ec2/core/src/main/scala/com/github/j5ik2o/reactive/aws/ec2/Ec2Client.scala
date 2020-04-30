// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2

import software.amazon.awssdk.services.ec2.model._

trait Ec2Client[M[_]] {

    def acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest): M[AcceptReservedInstancesExchangeQuoteResponse]

    def acceptTransitGatewayPeeringAttachment(acceptTransitGatewayPeeringAttachmentRequest: AcceptTransitGatewayPeeringAttachmentRequest): M[AcceptTransitGatewayPeeringAttachmentResponse]

    def acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest): M[AcceptTransitGatewayVpcAttachmentResponse]

    def acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest): M[AcceptVpcEndpointConnectionsResponse]

    def acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest): M[AcceptVpcPeeringConnectionResponse]

    def advertiseByoipCidr(advertiseByoipCidrRequest: AdvertiseByoipCidrRequest): M[AdvertiseByoipCidrResponse]

    def allocateAddress(allocateAddressRequest: AllocateAddressRequest): M[AllocateAddressResponse]

    def allocateAddress(): M[AllocateAddressResponse]

    def allocateHosts(allocateHostsRequest: AllocateHostsRequest): M[AllocateHostsResponse]

    def applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest): M[ApplySecurityGroupsToClientVpnTargetNetworkResponse]

    def assignIpv6Addresses(assignIpv6AddressesRequest: AssignIpv6AddressesRequest): M[AssignIpv6AddressesResponse]

    def assignPrivateIpAddresses(assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest): M[AssignPrivateIpAddressesResponse]

    def associateAddress(associateAddressRequest: AssociateAddressRequest): M[AssociateAddressResponse]

    def associateAddress(): M[AssociateAddressResponse]

    def associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest): M[AssociateClientVpnTargetNetworkResponse]

    def associateDhcpOptions(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest): M[AssociateDhcpOptionsResponse]

    def associateIamInstanceProfile(associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest): M[AssociateIamInstanceProfileResponse]

    def associateRouteTable(associateRouteTableRequest: AssociateRouteTableRequest): M[AssociateRouteTableResponse]

    def associateSubnetCidrBlock(associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest): M[AssociateSubnetCidrBlockResponse]

    def associateTransitGatewayMulticastDomain(associateTransitGatewayMulticastDomainRequest: AssociateTransitGatewayMulticastDomainRequest): M[AssociateTransitGatewayMulticastDomainResponse]

    def associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest): M[AssociateTransitGatewayRouteTableResponse]

    def associateVpcCidrBlock(associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest): M[AssociateVpcCidrBlockResponse]

    def attachClassicLinkVpc(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest): M[AttachClassicLinkVpcResponse]

    def attachInternetGateway(attachInternetGatewayRequest: AttachInternetGatewayRequest): M[AttachInternetGatewayResponse]

    def attachNetworkInterface(attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest): M[AttachNetworkInterfaceResponse]

    def attachVolume(attachVolumeRequest: AttachVolumeRequest): M[AttachVolumeResponse]

    def attachVpnGateway(attachVpnGatewayRequest: AttachVpnGatewayRequest): M[AttachVpnGatewayResponse]

    def authorizeClientVpnIngress(authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest): M[AuthorizeClientVpnIngressResponse]

    def authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest): M[AuthorizeSecurityGroupEgressResponse]

    def authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest): M[AuthorizeSecurityGroupIngressResponse]

    def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): M[BundleInstanceResponse]

    def cancelBundleTask(cancelBundleTaskRequest: CancelBundleTaskRequest): M[CancelBundleTaskResponse]

    def cancelCapacityReservation(cancelCapacityReservationRequest: CancelCapacityReservationRequest): M[CancelCapacityReservationResponse]

    def cancelConversionTask(cancelConversionTaskRequest: CancelConversionTaskRequest): M[CancelConversionTaskResponse]

    def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): M[CancelExportTaskResponse]

    def cancelImportTask(cancelImportTaskRequest: CancelImportTaskRequest): M[CancelImportTaskResponse]

    def cancelReservedInstancesListing(cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest): M[CancelReservedInstancesListingResponse]

    def cancelSpotFleetRequests(cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest): M[CancelSpotFleetRequestsResponse]

    def cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest): M[CancelSpotInstanceRequestsResponse]

    def confirmProductInstance(confirmProductInstanceRequest: ConfirmProductInstanceRequest): M[ConfirmProductInstanceResponse]

    def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): M[CopyFpgaImageResponse]

    def copyImage(copyImageRequest: CopyImageRequest): M[CopyImageResponse]

    def copySnapshot(copySnapshotRequest: CopySnapshotRequest): M[CopySnapshotResponse]

    def createCapacityReservation(createCapacityReservationRequest: CreateCapacityReservationRequest): M[CreateCapacityReservationResponse]

    def createClientVpnEndpoint(createClientVpnEndpointRequest: CreateClientVpnEndpointRequest): M[CreateClientVpnEndpointResponse]

    def createClientVpnRoute(createClientVpnRouteRequest: CreateClientVpnRouteRequest): M[CreateClientVpnRouteResponse]

    def createCustomerGateway(createCustomerGatewayRequest: CreateCustomerGatewayRequest): M[CreateCustomerGatewayResponse]

    def createDefaultSubnet(createDefaultSubnetRequest: CreateDefaultSubnetRequest): M[CreateDefaultSubnetResponse]

    def createDefaultVpc(createDefaultVpcRequest: CreateDefaultVpcRequest): M[CreateDefaultVpcResponse]

    def createDefaultVpc(): M[CreateDefaultVpcResponse]

    def createDhcpOptions(createDhcpOptionsRequest: CreateDhcpOptionsRequest): M[CreateDhcpOptionsResponse]

    def createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest): M[CreateEgressOnlyInternetGatewayResponse]

    def createFleet(createFleetRequest: CreateFleetRequest): M[CreateFleetResponse]

    def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): M[CreateFlowLogsResponse]

    def createFpgaImage(createFpgaImageRequest: CreateFpgaImageRequest): M[CreateFpgaImageResponse]

    def createImage(createImageRequest: CreateImageRequest): M[CreateImageResponse]

    def createInstanceExportTask(createInstanceExportTaskRequest: CreateInstanceExportTaskRequest): M[CreateInstanceExportTaskResponse]

    def createInternetGateway(createInternetGatewayRequest: CreateInternetGatewayRequest): M[CreateInternetGatewayResponse]

    def createInternetGateway(): M[CreateInternetGatewayResponse]

    def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): M[CreateKeyPairResponse]

    def createLaunchTemplate(createLaunchTemplateRequest: CreateLaunchTemplateRequest): M[CreateLaunchTemplateResponse]

    def createLaunchTemplateVersion(createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest): M[CreateLaunchTemplateVersionResponse]

    def createLocalGatewayRoute(createLocalGatewayRouteRequest: CreateLocalGatewayRouteRequest): M[CreateLocalGatewayRouteResponse]

    def createLocalGatewayRouteTableVpcAssociation(createLocalGatewayRouteTableVpcAssociationRequest: CreateLocalGatewayRouteTableVpcAssociationRequest): M[CreateLocalGatewayRouteTableVpcAssociationResponse]

    def createNatGateway(createNatGatewayRequest: CreateNatGatewayRequest): M[CreateNatGatewayResponse]

    def createNetworkAcl(createNetworkAclRequest: CreateNetworkAclRequest): M[CreateNetworkAclResponse]

    def createNetworkAclEntry(createNetworkAclEntryRequest: CreateNetworkAclEntryRequest): M[CreateNetworkAclEntryResponse]

    def createNetworkInterface(createNetworkInterfaceRequest: CreateNetworkInterfaceRequest): M[CreateNetworkInterfaceResponse]

    def createNetworkInterfacePermission(createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest): M[CreateNetworkInterfacePermissionResponse]

    def createPlacementGroup(createPlacementGroupRequest: CreatePlacementGroupRequest): M[CreatePlacementGroupResponse]

    def createReservedInstancesListing(createReservedInstancesListingRequest: CreateReservedInstancesListingRequest): M[CreateReservedInstancesListingResponse]

    def createRoute(createRouteRequest: CreateRouteRequest): M[CreateRouteResponse]

    def createRouteTable(createRouteTableRequest: CreateRouteTableRequest): M[CreateRouteTableResponse]

    def createSecurityGroup(createSecurityGroupRequest: CreateSecurityGroupRequest): M[CreateSecurityGroupResponse]

    def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): M[CreateSnapshotResponse]

    def createSnapshots(createSnapshotsRequest: CreateSnapshotsRequest): M[CreateSnapshotsResponse]

    def createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest): M[CreateSpotDatafeedSubscriptionResponse]

    def createSubnet(createSubnetRequest: CreateSubnetRequest): M[CreateSubnetResponse]

    def createTags(createTagsRequest: CreateTagsRequest): M[CreateTagsResponse]

    def createTrafficMirrorFilter(createTrafficMirrorFilterRequest: CreateTrafficMirrorFilterRequest): M[CreateTrafficMirrorFilterResponse]

    def createTrafficMirrorFilterRule(createTrafficMirrorFilterRuleRequest: CreateTrafficMirrorFilterRuleRequest): M[CreateTrafficMirrorFilterRuleResponse]

    def createTrafficMirrorSession(createTrafficMirrorSessionRequest: CreateTrafficMirrorSessionRequest): M[CreateTrafficMirrorSessionResponse]

    def createTrafficMirrorTarget(createTrafficMirrorTargetRequest: CreateTrafficMirrorTargetRequest): M[CreateTrafficMirrorTargetResponse]

    def createTransitGateway(createTransitGatewayRequest: CreateTransitGatewayRequest): M[CreateTransitGatewayResponse]

    def createTransitGateway(): M[CreateTransitGatewayResponse]

    def createTransitGatewayMulticastDomain(createTransitGatewayMulticastDomainRequest: CreateTransitGatewayMulticastDomainRequest): M[CreateTransitGatewayMulticastDomainResponse]

    def createTransitGatewayPeeringAttachment(createTransitGatewayPeeringAttachmentRequest: CreateTransitGatewayPeeringAttachmentRequest): M[CreateTransitGatewayPeeringAttachmentResponse]

    def createTransitGatewayRoute(createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest): M[CreateTransitGatewayRouteResponse]

    def createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest): M[CreateTransitGatewayRouteTableResponse]

    def createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest): M[CreateTransitGatewayVpcAttachmentResponse]

    def createVolume(createVolumeRequest: CreateVolumeRequest): M[CreateVolumeResponse]

    def createVpc(createVpcRequest: CreateVpcRequest): M[CreateVpcResponse]

    def createVpcEndpoint(createVpcEndpointRequest: CreateVpcEndpointRequest): M[CreateVpcEndpointResponse]

    def createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest): M[CreateVpcEndpointConnectionNotificationResponse]

    def createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest): M[CreateVpcEndpointServiceConfigurationResponse]

    def createVpcPeeringConnection(createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest): M[CreateVpcPeeringConnectionResponse]

    def createVpnConnection(createVpnConnectionRequest: CreateVpnConnectionRequest): M[CreateVpnConnectionResponse]

    def createVpnConnectionRoute(createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest): M[CreateVpnConnectionRouteResponse]

    def createVpnGateway(createVpnGatewayRequest: CreateVpnGatewayRequest): M[CreateVpnGatewayResponse]

    def deleteClientVpnEndpoint(deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest): M[DeleteClientVpnEndpointResponse]

    def deleteClientVpnRoute(deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest): M[DeleteClientVpnRouteResponse]

    def deleteCustomerGateway(deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest): M[DeleteCustomerGatewayResponse]

    def deleteDhcpOptions(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): M[DeleteDhcpOptionsResponse]

    def deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest): M[DeleteEgressOnlyInternetGatewayResponse]

    def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): M[DeleteFleetsResponse]

    def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): M[DeleteFlowLogsResponse]

    def deleteFpgaImage(deleteFpgaImageRequest: DeleteFpgaImageRequest): M[DeleteFpgaImageResponse]

    def deleteInternetGateway(deleteInternetGatewayRequest: DeleteInternetGatewayRequest): M[DeleteInternetGatewayResponse]

    def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): M[DeleteKeyPairResponse]

    def deleteLaunchTemplate(deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest): M[DeleteLaunchTemplateResponse]

    def deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest): M[DeleteLaunchTemplateVersionsResponse]

    def deleteLocalGatewayRoute(deleteLocalGatewayRouteRequest: DeleteLocalGatewayRouteRequest): M[DeleteLocalGatewayRouteResponse]

    def deleteLocalGatewayRouteTableVpcAssociation(deleteLocalGatewayRouteTableVpcAssociationRequest: DeleteLocalGatewayRouteTableVpcAssociationRequest): M[DeleteLocalGatewayRouteTableVpcAssociationResponse]

    def deleteNatGateway(deleteNatGatewayRequest: DeleteNatGatewayRequest): M[DeleteNatGatewayResponse]

    def deleteNetworkAcl(deleteNetworkAclRequest: DeleteNetworkAclRequest): M[DeleteNetworkAclResponse]

    def deleteNetworkAclEntry(deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest): M[DeleteNetworkAclEntryResponse]

    def deleteNetworkInterface(deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest): M[DeleteNetworkInterfaceResponse]

    def deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest): M[DeleteNetworkInterfacePermissionResponse]

    def deletePlacementGroup(deletePlacementGroupRequest: DeletePlacementGroupRequest): M[DeletePlacementGroupResponse]

    def deleteQueuedReservedInstances(deleteQueuedReservedInstancesRequest: DeleteQueuedReservedInstancesRequest): M[DeleteQueuedReservedInstancesResponse]

    def deleteRoute(deleteRouteRequest: DeleteRouteRequest): M[DeleteRouteResponse]

    def deleteRouteTable(deleteRouteTableRequest: DeleteRouteTableRequest): M[DeleteRouteTableResponse]

    def deleteSecurityGroup(deleteSecurityGroupRequest: DeleteSecurityGroupRequest): M[DeleteSecurityGroupResponse]

    def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): M[DeleteSnapshotResponse]

    def deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest): M[DeleteSpotDatafeedSubscriptionResponse]

    def deleteSpotDatafeedSubscription(): M[DeleteSpotDatafeedSubscriptionResponse]

    def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): M[DeleteSubnetResponse]

    def deleteTags(deleteTagsRequest: DeleteTagsRequest): M[DeleteTagsResponse]

    def deleteTrafficMirrorFilter(deleteTrafficMirrorFilterRequest: DeleteTrafficMirrorFilterRequest): M[DeleteTrafficMirrorFilterResponse]

    def deleteTrafficMirrorFilterRule(deleteTrafficMirrorFilterRuleRequest: DeleteTrafficMirrorFilterRuleRequest): M[DeleteTrafficMirrorFilterRuleResponse]

    def deleteTrafficMirrorSession(deleteTrafficMirrorSessionRequest: DeleteTrafficMirrorSessionRequest): M[DeleteTrafficMirrorSessionResponse]

    def deleteTrafficMirrorTarget(deleteTrafficMirrorTargetRequest: DeleteTrafficMirrorTargetRequest): M[DeleteTrafficMirrorTargetResponse]

    def deleteTransitGateway(deleteTransitGatewayRequest: DeleteTransitGatewayRequest): M[DeleteTransitGatewayResponse]

    def deleteTransitGatewayMulticastDomain(deleteTransitGatewayMulticastDomainRequest: DeleteTransitGatewayMulticastDomainRequest): M[DeleteTransitGatewayMulticastDomainResponse]

    def deleteTransitGatewayPeeringAttachment(deleteTransitGatewayPeeringAttachmentRequest: DeleteTransitGatewayPeeringAttachmentRequest): M[DeleteTransitGatewayPeeringAttachmentResponse]

    def deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest): M[DeleteTransitGatewayRouteResponse]

    def deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest): M[DeleteTransitGatewayRouteTableResponse]

    def deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest): M[DeleteTransitGatewayVpcAttachmentResponse]

    def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): M[DeleteVolumeResponse]

    def deleteVpc(deleteVpcRequest: DeleteVpcRequest): M[DeleteVpcResponse]

    def deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest): M[DeleteVpcEndpointConnectionNotificationsResponse]

    def deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest): M[DeleteVpcEndpointServiceConfigurationsResponse]

    def deleteVpcEndpoints(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest): M[DeleteVpcEndpointsResponse]

    def deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest): M[DeleteVpcPeeringConnectionResponse]

    def deleteVpnConnection(deleteVpnConnectionRequest: DeleteVpnConnectionRequest): M[DeleteVpnConnectionResponse]

    def deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest): M[DeleteVpnConnectionRouteResponse]

    def deleteVpnGateway(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): M[DeleteVpnGatewayResponse]

    def deprovisionByoipCidr(deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest): M[DeprovisionByoipCidrResponse]

    def deregisterImage(deregisterImageRequest: DeregisterImageRequest): M[DeregisterImageResponse]

    def deregisterInstanceEventNotificationAttributes(deregisterInstanceEventNotificationAttributesRequest: DeregisterInstanceEventNotificationAttributesRequest): M[DeregisterInstanceEventNotificationAttributesResponse]

    def deregisterTransitGatewayMulticastGroupMembers(deregisterTransitGatewayMulticastGroupMembersRequest: DeregisterTransitGatewayMulticastGroupMembersRequest): M[DeregisterTransitGatewayMulticastGroupMembersResponse]

    def deregisterTransitGatewayMulticastGroupSources(deregisterTransitGatewayMulticastGroupSourcesRequest: DeregisterTransitGatewayMulticastGroupSourcesRequest): M[DeregisterTransitGatewayMulticastGroupSourcesResponse]

    def describeAccountAttributes(describeAccountAttributesRequest: DescribeAccountAttributesRequest): M[DescribeAccountAttributesResponse]

    def describeAccountAttributes(): M[DescribeAccountAttributesResponse]

    def describeAddresses(describeAddressesRequest: DescribeAddressesRequest): M[DescribeAddressesResponse]

    def describeAddresses(): M[DescribeAddressesResponse]

    def describeAggregateIdFormat(describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest): M[DescribeAggregateIdFormatResponse]

    def describeAggregateIdFormat(): M[DescribeAggregateIdFormatResponse]

    def describeAvailabilityZones(describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest): M[DescribeAvailabilityZonesResponse]

    def describeAvailabilityZones(): M[DescribeAvailabilityZonesResponse]

    def describeBundleTasks(describeBundleTasksRequest: DescribeBundleTasksRequest): M[DescribeBundleTasksResponse]

    def describeBundleTasks(): M[DescribeBundleTasksResponse]

    def describeByoipCidrs(describeByoipCidrsRequest: DescribeByoipCidrsRequest): M[DescribeByoipCidrsResponse]

    def describeCapacityReservations(describeCapacityReservationsRequest: DescribeCapacityReservationsRequest): M[DescribeCapacityReservationsResponse]

    def describeCapacityReservations(): M[DescribeCapacityReservationsResponse]

    def describeClassicLinkInstances(describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest): M[DescribeClassicLinkInstancesResponse]

    def describeClassicLinkInstances(): M[DescribeClassicLinkInstancesResponse]

    def describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest): M[DescribeClientVpnAuthorizationRulesResponse]

    def describeClientVpnConnections(describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest): M[DescribeClientVpnConnectionsResponse]

    def describeClientVpnEndpoints(describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest): M[DescribeClientVpnEndpointsResponse]

    def describeClientVpnEndpoints(): M[DescribeClientVpnEndpointsResponse]

    def describeClientVpnRoutes(describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest): M[DescribeClientVpnRoutesResponse]

    def describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest): M[DescribeClientVpnTargetNetworksResponse]

    def describeCoipPools(describeCoipPoolsRequest: DescribeCoipPoolsRequest): M[DescribeCoipPoolsResponse]

    def describeConversionTasks(describeConversionTasksRequest: DescribeConversionTasksRequest): M[DescribeConversionTasksResponse]

    def describeConversionTasks(): M[DescribeConversionTasksResponse]

    def describeCustomerGateways(describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest): M[DescribeCustomerGatewaysResponse]

    def describeCustomerGateways(): M[DescribeCustomerGatewaysResponse]

    def describeDhcpOptions(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest): M[DescribeDhcpOptionsResponse]

    def describeDhcpOptions(): M[DescribeDhcpOptionsResponse]

    def describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest): M[DescribeEgressOnlyInternetGatewaysResponse]

    def describeEgressOnlyInternetGateways(): M[DescribeEgressOnlyInternetGatewaysResponse]

    def describeElasticGpus(describeElasticGpusRequest: DescribeElasticGpusRequest): M[DescribeElasticGpusResponse]

    def describeElasticGpus(): M[DescribeElasticGpusResponse]

    def describeExportImageTasks(describeExportImageTasksRequest: DescribeExportImageTasksRequest): M[DescribeExportImageTasksResponse]

    def describeExportTasks(describeExportTasksRequest: DescribeExportTasksRequest): M[DescribeExportTasksResponse]

    def describeExportTasks(): M[DescribeExportTasksResponse]

    def describeFastSnapshotRestores(describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest): M[DescribeFastSnapshotRestoresResponse]

    def describeFleetHistory(describeFleetHistoryRequest: DescribeFleetHistoryRequest): M[DescribeFleetHistoryResponse]

    def describeFleetInstances(describeFleetInstancesRequest: DescribeFleetInstancesRequest): M[DescribeFleetInstancesResponse]

    def describeFleets(describeFleetsRequest: DescribeFleetsRequest): M[DescribeFleetsResponse]

    def describeFleets(): M[DescribeFleetsResponse]

    def describeFlowLogs(describeFlowLogsRequest: DescribeFlowLogsRequest): M[DescribeFlowLogsResponse]

    def describeFlowLogs(): M[DescribeFlowLogsResponse]

    def describeFpgaImageAttribute(describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest): M[DescribeFpgaImageAttributeResponse]

    def describeFpgaImages(describeFpgaImagesRequest: DescribeFpgaImagesRequest): M[DescribeFpgaImagesResponse]

    def describeFpgaImages(): M[DescribeFpgaImagesResponse]

    def describeHostReservationOfferings(describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest): M[DescribeHostReservationOfferingsResponse]

    def describeHostReservationOfferings(): M[DescribeHostReservationOfferingsResponse]

    def describeHostReservations(describeHostReservationsRequest: DescribeHostReservationsRequest): M[DescribeHostReservationsResponse]

    def describeHostReservations(): M[DescribeHostReservationsResponse]

    def describeHosts(describeHostsRequest: DescribeHostsRequest): M[DescribeHostsResponse]

    def describeHosts(): M[DescribeHostsResponse]

    def describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest): M[DescribeIamInstanceProfileAssociationsResponse]

    def describeIamInstanceProfileAssociations(): M[DescribeIamInstanceProfileAssociationsResponse]

    def describeIdFormat(describeIdFormatRequest: DescribeIdFormatRequest): M[DescribeIdFormatResponse]

    def describeIdFormat(): M[DescribeIdFormatResponse]

    def describeIdentityIdFormat(describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest): M[DescribeIdentityIdFormatResponse]

    def describeImageAttribute(describeImageAttributeRequest: DescribeImageAttributeRequest): M[DescribeImageAttributeResponse]

    def describeImages(describeImagesRequest: DescribeImagesRequest): M[DescribeImagesResponse]

    def describeImages(): M[DescribeImagesResponse]

    def describeImportImageTasks(describeImportImageTasksRequest: DescribeImportImageTasksRequest): M[DescribeImportImageTasksResponse]

    def describeImportImageTasks(): M[DescribeImportImageTasksResponse]

    def describeImportSnapshotTasks(describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest): M[DescribeImportSnapshotTasksResponse]

    def describeImportSnapshotTasks(): M[DescribeImportSnapshotTasksResponse]

    def describeInstanceAttribute(describeInstanceAttributeRequest: DescribeInstanceAttributeRequest): M[DescribeInstanceAttributeResponse]

    def describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest): M[DescribeInstanceCreditSpecificationsResponse]

    def describeInstanceCreditSpecifications(): M[DescribeInstanceCreditSpecificationsResponse]

    def describeInstanceEventNotificationAttributes(describeInstanceEventNotificationAttributesRequest: DescribeInstanceEventNotificationAttributesRequest): M[DescribeInstanceEventNotificationAttributesResponse]

    def describeInstanceStatus(describeInstanceStatusRequest: DescribeInstanceStatusRequest): M[DescribeInstanceStatusResponse]

    def describeInstanceStatus(): M[DescribeInstanceStatusResponse]

    def describeInstanceTypeOfferings(describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest): M[DescribeInstanceTypeOfferingsResponse]

    def describeInstanceTypes(describeInstanceTypesRequest: DescribeInstanceTypesRequest): M[DescribeInstanceTypesResponse]

    def describeInstances(describeInstancesRequest: DescribeInstancesRequest): M[DescribeInstancesResponse]

    def describeInstances(): M[DescribeInstancesResponse]

    def describeInternetGateways(describeInternetGatewaysRequest: DescribeInternetGatewaysRequest): M[DescribeInternetGatewaysResponse]

    def describeInternetGateways(): M[DescribeInternetGatewaysResponse]

    def describeIpv6Pools(describeIpv6PoolsRequest: DescribeIpv6PoolsRequest): M[DescribeIpv6PoolsResponse]

    def describeKeyPairs(describeKeyPairsRequest: DescribeKeyPairsRequest): M[DescribeKeyPairsResponse]

    def describeKeyPairs(): M[DescribeKeyPairsResponse]

    def describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest): M[DescribeLaunchTemplateVersionsResponse]

    def describeLaunchTemplates(describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest): M[DescribeLaunchTemplatesResponse]

    def describeLaunchTemplates(): M[DescribeLaunchTemplatesResponse]

    def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest): M[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse]

    def describeLocalGatewayRouteTableVpcAssociations(describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest): M[DescribeLocalGatewayRouteTableVpcAssociationsResponse]

    def describeLocalGatewayRouteTables(describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest): M[DescribeLocalGatewayRouteTablesResponse]

    def describeLocalGatewayVirtualInterfaceGroups(describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest): M[DescribeLocalGatewayVirtualInterfaceGroupsResponse]

    def describeLocalGatewayVirtualInterfaces(describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest): M[DescribeLocalGatewayVirtualInterfacesResponse]

    def describeLocalGateways(describeLocalGatewaysRequest: DescribeLocalGatewaysRequest): M[DescribeLocalGatewaysResponse]

    def describeMovingAddresses(describeMovingAddressesRequest: DescribeMovingAddressesRequest): M[DescribeMovingAddressesResponse]

    def describeMovingAddresses(): M[DescribeMovingAddressesResponse]

    def describeNatGateways(describeNatGatewaysRequest: DescribeNatGatewaysRequest): M[DescribeNatGatewaysResponse]

    def describeNatGateways(): M[DescribeNatGatewaysResponse]

    def describeNetworkAcls(describeNetworkAclsRequest: DescribeNetworkAclsRequest): M[DescribeNetworkAclsResponse]

    def describeNetworkAcls(): M[DescribeNetworkAclsResponse]

    def describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest): M[DescribeNetworkInterfaceAttributeResponse]

    def describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest): M[DescribeNetworkInterfacePermissionsResponse]

    def describeNetworkInterfacePermissions(): M[DescribeNetworkInterfacePermissionsResponse]

    def describeNetworkInterfaces(describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest): M[DescribeNetworkInterfacesResponse]

    def describeNetworkInterfaces(): M[DescribeNetworkInterfacesResponse]

    def describePlacementGroups(describePlacementGroupsRequest: DescribePlacementGroupsRequest): M[DescribePlacementGroupsResponse]

    def describePlacementGroups(): M[DescribePlacementGroupsResponse]

    def describePrefixLists(describePrefixListsRequest: DescribePrefixListsRequest): M[DescribePrefixListsResponse]

    def describePrefixLists(): M[DescribePrefixListsResponse]

    def describePrincipalIdFormat(describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest): M[DescribePrincipalIdFormatResponse]

    def describePrincipalIdFormat(): M[DescribePrincipalIdFormatResponse]

    def describePublicIpv4Pools(describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest): M[DescribePublicIpv4PoolsResponse]

    def describePublicIpv4Pools(): M[DescribePublicIpv4PoolsResponse]

    def describeRegions(describeRegionsRequest: DescribeRegionsRequest): M[DescribeRegionsResponse]

    def describeRegions(): M[DescribeRegionsResponse]

    def describeReservedInstances(describeReservedInstancesRequest: DescribeReservedInstancesRequest): M[DescribeReservedInstancesResponse]

    def describeReservedInstances(): M[DescribeReservedInstancesResponse]

    def describeReservedInstancesListings(describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest): M[DescribeReservedInstancesListingsResponse]

    def describeReservedInstancesListings(): M[DescribeReservedInstancesListingsResponse]

    def describeReservedInstancesModifications(describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest): M[DescribeReservedInstancesModificationsResponse]

    def describeReservedInstancesModifications(): M[DescribeReservedInstancesModificationsResponse]

    def describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest): M[DescribeReservedInstancesOfferingsResponse]

    def describeReservedInstancesOfferings(): M[DescribeReservedInstancesOfferingsResponse]

    def describeRouteTables(describeRouteTablesRequest: DescribeRouteTablesRequest): M[DescribeRouteTablesResponse]

    def describeRouteTables(): M[DescribeRouteTablesResponse]

    def describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest): M[DescribeScheduledInstanceAvailabilityResponse]

    def describeScheduledInstances(describeScheduledInstancesRequest: DescribeScheduledInstancesRequest): M[DescribeScheduledInstancesResponse]

    def describeScheduledInstances(): M[DescribeScheduledInstancesResponse]

    def describeSecurityGroupReferences(describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest): M[DescribeSecurityGroupReferencesResponse]

    def describeSecurityGroups(describeSecurityGroupsRequest: DescribeSecurityGroupsRequest): M[DescribeSecurityGroupsResponse]

    def describeSecurityGroups(): M[DescribeSecurityGroupsResponse]

    def describeSnapshotAttribute(describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest): M[DescribeSnapshotAttributeResponse]

    def describeSnapshots(describeSnapshotsRequest: DescribeSnapshotsRequest): M[DescribeSnapshotsResponse]

    def describeSnapshots(): M[DescribeSnapshotsResponse]

    def describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest): M[DescribeSpotDatafeedSubscriptionResponse]

    def describeSpotDatafeedSubscription(): M[DescribeSpotDatafeedSubscriptionResponse]

    def describeSpotFleetInstances(describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest): M[DescribeSpotFleetInstancesResponse]

    def describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest): M[DescribeSpotFleetRequestHistoryResponse]

    def describeSpotFleetRequests(describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest): M[DescribeSpotFleetRequestsResponse]

    def describeSpotFleetRequests(): M[DescribeSpotFleetRequestsResponse]

    def describeSpotInstanceRequests(describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest): M[DescribeSpotInstanceRequestsResponse]

    def describeSpotInstanceRequests(): M[DescribeSpotInstanceRequestsResponse]

    def describeSpotPriceHistory(describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest): M[DescribeSpotPriceHistoryResponse]

    def describeSpotPriceHistory(): M[DescribeSpotPriceHistoryResponse]

    def describeStaleSecurityGroups(describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest): M[DescribeStaleSecurityGroupsResponse]

    def describeSubnets(describeSubnetsRequest: DescribeSubnetsRequest): M[DescribeSubnetsResponse]

    def describeSubnets(): M[DescribeSubnetsResponse]

    def describeTags(describeTagsRequest: DescribeTagsRequest): M[DescribeTagsResponse]

    def describeTags(): M[DescribeTagsResponse]

    def describeTrafficMirrorFilters(describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest): M[DescribeTrafficMirrorFiltersResponse]

    def describeTrafficMirrorSessions(describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest): M[DescribeTrafficMirrorSessionsResponse]

    def describeTrafficMirrorTargets(describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest): M[DescribeTrafficMirrorTargetsResponse]

    def describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest): M[DescribeTransitGatewayAttachmentsResponse]

    def describeTransitGatewayAttachments(): M[DescribeTransitGatewayAttachmentsResponse]

    def describeTransitGatewayMulticastDomains(describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest): M[DescribeTransitGatewayMulticastDomainsResponse]

    def describeTransitGatewayPeeringAttachments(describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest): M[DescribeTransitGatewayPeeringAttachmentsResponse]

    def describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest): M[DescribeTransitGatewayRouteTablesResponse]

    def describeTransitGatewayRouteTables(): M[DescribeTransitGatewayRouteTablesResponse]

    def describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest): M[DescribeTransitGatewayVpcAttachmentsResponse]

    def describeTransitGatewayVpcAttachments(): M[DescribeTransitGatewayVpcAttachmentsResponse]

    def describeTransitGateways(describeTransitGatewaysRequest: DescribeTransitGatewaysRequest): M[DescribeTransitGatewaysResponse]

    def describeTransitGateways(): M[DescribeTransitGatewaysResponse]

    def describeVolumeAttribute(describeVolumeAttributeRequest: DescribeVolumeAttributeRequest): M[DescribeVolumeAttributeResponse]

    def describeVolumeStatus(describeVolumeStatusRequest: DescribeVolumeStatusRequest): M[DescribeVolumeStatusResponse]

    def describeVolumeStatus(): M[DescribeVolumeStatusResponse]

    def describeVolumes(describeVolumesRequest: DescribeVolumesRequest): M[DescribeVolumesResponse]

    def describeVolumes(): M[DescribeVolumesResponse]

    def describeVolumesModifications(describeVolumesModificationsRequest: DescribeVolumesModificationsRequest): M[DescribeVolumesModificationsResponse]

    def describeVolumesModifications(): M[DescribeVolumesModificationsResponse]

    def describeVpcAttribute(describeVpcAttributeRequest: DescribeVpcAttributeRequest): M[DescribeVpcAttributeResponse]

    def describeVpcClassicLink(describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest): M[DescribeVpcClassicLinkResponse]

    def describeVpcClassicLink(): M[DescribeVpcClassicLinkResponse]

    def describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest): M[DescribeVpcClassicLinkDnsSupportResponse]

    def describeVpcClassicLinkDnsSupport(): M[DescribeVpcClassicLinkDnsSupportResponse]

    def describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest): M[DescribeVpcEndpointConnectionNotificationsResponse]

    def describeVpcEndpointConnectionNotifications(): M[DescribeVpcEndpointConnectionNotificationsResponse]

    def describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest): M[DescribeVpcEndpointConnectionsResponse]

    def describeVpcEndpointConnections(): M[DescribeVpcEndpointConnectionsResponse]

    def describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest): M[DescribeVpcEndpointServiceConfigurationsResponse]

    def describeVpcEndpointServiceConfigurations(): M[DescribeVpcEndpointServiceConfigurationsResponse]

    def describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest): M[DescribeVpcEndpointServicePermissionsResponse]

    def describeVpcEndpointServices(describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest): M[DescribeVpcEndpointServicesResponse]

    def describeVpcEndpointServices(): M[DescribeVpcEndpointServicesResponse]

    def describeVpcEndpoints(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest): M[DescribeVpcEndpointsResponse]

    def describeVpcEndpoints(): M[DescribeVpcEndpointsResponse]

    def describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest): M[DescribeVpcPeeringConnectionsResponse]

    def describeVpcPeeringConnections(): M[DescribeVpcPeeringConnectionsResponse]

    def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): M[DescribeVpcsResponse]

    def describeVpcs(): M[DescribeVpcsResponse]

    def describeVpnConnections(describeVpnConnectionsRequest: DescribeVpnConnectionsRequest): M[DescribeVpnConnectionsResponse]

    def describeVpnConnections(): M[DescribeVpnConnectionsResponse]

    def describeVpnGateways(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest): M[DescribeVpnGatewaysResponse]

    def describeVpnGateways(): M[DescribeVpnGatewaysResponse]

    def detachClassicLinkVpc(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest): M[DetachClassicLinkVpcResponse]

    def detachInternetGateway(detachInternetGatewayRequest: DetachInternetGatewayRequest): M[DetachInternetGatewayResponse]

    def detachNetworkInterface(detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest): M[DetachNetworkInterfaceResponse]

    def detachVolume(detachVolumeRequest: DetachVolumeRequest): M[DetachVolumeResponse]

    def detachVpnGateway(detachVpnGatewayRequest: DetachVpnGatewayRequest): M[DetachVpnGatewayResponse]

    def disableEbsEncryptionByDefault(disableEbsEncryptionByDefaultRequest: DisableEbsEncryptionByDefaultRequest): M[DisableEbsEncryptionByDefaultResponse]

    def disableFastSnapshotRestores(disableFastSnapshotRestoresRequest: DisableFastSnapshotRestoresRequest): M[DisableFastSnapshotRestoresResponse]

    def disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest): M[DisableTransitGatewayRouteTablePropagationResponse]

    def disableVgwRoutePropagation(disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest): M[DisableVgwRoutePropagationResponse]

    def disableVpcClassicLink(disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest): M[DisableVpcClassicLinkResponse]

    def disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest): M[DisableVpcClassicLinkDnsSupportResponse]

    def disassociateAddress(disassociateAddressRequest: DisassociateAddressRequest): M[DisassociateAddressResponse]

    def disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest): M[DisassociateClientVpnTargetNetworkResponse]

    def disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest): M[DisassociateIamInstanceProfileResponse]

    def disassociateRouteTable(disassociateRouteTableRequest: DisassociateRouteTableRequest): M[DisassociateRouteTableResponse]

    def disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest): M[DisassociateSubnetCidrBlockResponse]

    def disassociateTransitGatewayMulticastDomain(disassociateTransitGatewayMulticastDomainRequest: DisassociateTransitGatewayMulticastDomainRequest): M[DisassociateTransitGatewayMulticastDomainResponse]

    def disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest): M[DisassociateTransitGatewayRouteTableResponse]

    def disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest): M[DisassociateVpcCidrBlockResponse]

    def enableEbsEncryptionByDefault(enableEbsEncryptionByDefaultRequest: EnableEbsEncryptionByDefaultRequest): M[EnableEbsEncryptionByDefaultResponse]

    def enableFastSnapshotRestores(enableFastSnapshotRestoresRequest: EnableFastSnapshotRestoresRequest): M[EnableFastSnapshotRestoresResponse]

    def enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest): M[EnableTransitGatewayRouteTablePropagationResponse]

    def enableVgwRoutePropagation(enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest): M[EnableVgwRoutePropagationResponse]

    def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): M[EnableVolumeIOResponse]

    def enableVpcClassicLink(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest): M[EnableVpcClassicLinkResponse]

    def enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest): M[EnableVpcClassicLinkDnsSupportResponse]

    def exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest): M[ExportClientVpnClientCertificateRevocationListResponse]

    def exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest): M[ExportClientVpnClientConfigurationResponse]

    def exportImage(exportImageRequest: ExportImageRequest): M[ExportImageResponse]

    def exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest): M[ExportTransitGatewayRoutesResponse]

    def getAssociatedIpv6PoolCidrs(getAssociatedIpv6PoolCidrsRequest: GetAssociatedIpv6PoolCidrsRequest): M[GetAssociatedIpv6PoolCidrsResponse]

    def getCapacityReservationUsage(getCapacityReservationUsageRequest: GetCapacityReservationUsageRequest): M[GetCapacityReservationUsageResponse]

    def getCoipPoolUsage(getCoipPoolUsageRequest: GetCoipPoolUsageRequest): M[GetCoipPoolUsageResponse]

    def getConsoleOutput(getConsoleOutputRequest: GetConsoleOutputRequest): M[GetConsoleOutputResponse]

    def getConsoleScreenshot(getConsoleScreenshotRequest: GetConsoleScreenshotRequest): M[GetConsoleScreenshotResponse]

    def getDefaultCreditSpecification(getDefaultCreditSpecificationRequest: GetDefaultCreditSpecificationRequest): M[GetDefaultCreditSpecificationResponse]

    def getEbsDefaultKmsKeyId(getEbsDefaultKmsKeyIdRequest: GetEbsDefaultKmsKeyIdRequest): M[GetEbsDefaultKmsKeyIdResponse]

    def getEbsEncryptionByDefault(getEbsEncryptionByDefaultRequest: GetEbsEncryptionByDefaultRequest): M[GetEbsEncryptionByDefaultResponse]

    def getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest): M[GetHostReservationPurchasePreviewResponse]

    def getLaunchTemplateData(getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest): M[GetLaunchTemplateDataResponse]

    def getPasswordData(getPasswordDataRequest: GetPasswordDataRequest): M[GetPasswordDataResponse]

    def getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest): M[GetReservedInstancesExchangeQuoteResponse]

    def getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest): M[GetTransitGatewayAttachmentPropagationsResponse]

    def getTransitGatewayMulticastDomainAssociations(getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest): M[GetTransitGatewayMulticastDomainAssociationsResponse]

    def getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest): M[GetTransitGatewayRouteTableAssociationsResponse]

    def getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest): M[GetTransitGatewayRouteTablePropagationsResponse]

    def importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest): M[ImportClientVpnClientCertificateRevocationListResponse]

    def importImage(importImageRequest: ImportImageRequest): M[ImportImageResponse]

    def importInstance(importInstanceRequest: ImportInstanceRequest): M[ImportInstanceResponse]

    def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): M[ImportKeyPairResponse]

    def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): M[ImportSnapshotResponse]

    def importVolume(importVolumeRequest: ImportVolumeRequest): M[ImportVolumeResponse]

    def modifyAvailabilityZoneGroup(modifyAvailabilityZoneGroupRequest: ModifyAvailabilityZoneGroupRequest): M[ModifyAvailabilityZoneGroupResponse]

    def modifyCapacityReservation(modifyCapacityReservationRequest: ModifyCapacityReservationRequest): M[ModifyCapacityReservationResponse]

    def modifyClientVpnEndpoint(modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest): M[ModifyClientVpnEndpointResponse]

    def modifyDefaultCreditSpecification(modifyDefaultCreditSpecificationRequest: ModifyDefaultCreditSpecificationRequest): M[ModifyDefaultCreditSpecificationResponse]

    def modifyEbsDefaultKmsKeyId(modifyEbsDefaultKmsKeyIdRequest: ModifyEbsDefaultKmsKeyIdRequest): M[ModifyEbsDefaultKmsKeyIdResponse]

    def modifyFleet(modifyFleetRequest: ModifyFleetRequest): M[ModifyFleetResponse]

    def modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest): M[ModifyFpgaImageAttributeResponse]

    def modifyHosts(modifyHostsRequest: ModifyHostsRequest): M[ModifyHostsResponse]

    def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): M[ModifyIdFormatResponse]

    def modifyIdentityIdFormat(modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest): M[ModifyIdentityIdFormatResponse]

    def modifyImageAttribute(modifyImageAttributeRequest: ModifyImageAttributeRequest): M[ModifyImageAttributeResponse]

    def modifyInstanceAttribute(modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest): M[ModifyInstanceAttributeResponse]

    def modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest): M[ModifyInstanceCapacityReservationAttributesResponse]

    def modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest): M[ModifyInstanceCreditSpecificationResponse]

    def modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest): M[ModifyInstanceEventStartTimeResponse]

    def modifyInstanceMetadataOptions(modifyInstanceMetadataOptionsRequest: ModifyInstanceMetadataOptionsRequest): M[ModifyInstanceMetadataOptionsResponse]

    def modifyInstancePlacement(modifyInstancePlacementRequest: ModifyInstancePlacementRequest): M[ModifyInstancePlacementResponse]

    def modifyLaunchTemplate(modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest): M[ModifyLaunchTemplateResponse]

    def modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest): M[ModifyNetworkInterfaceAttributeResponse]

    def modifyReservedInstances(modifyReservedInstancesRequest: ModifyReservedInstancesRequest): M[ModifyReservedInstancesResponse]

    def modifySnapshotAttribute(modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest): M[ModifySnapshotAttributeResponse]

    def modifySpotFleetRequest(modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest): M[ModifySpotFleetRequestResponse]

    def modifySubnetAttribute(modifySubnetAttributeRequest: ModifySubnetAttributeRequest): M[ModifySubnetAttributeResponse]

    def modifyTrafficMirrorFilterNetworkServices(modifyTrafficMirrorFilterNetworkServicesRequest: ModifyTrafficMirrorFilterNetworkServicesRequest): M[ModifyTrafficMirrorFilterNetworkServicesResponse]

    def modifyTrafficMirrorFilterRule(modifyTrafficMirrorFilterRuleRequest: ModifyTrafficMirrorFilterRuleRequest): M[ModifyTrafficMirrorFilterRuleResponse]

    def modifyTrafficMirrorSession(modifyTrafficMirrorSessionRequest: ModifyTrafficMirrorSessionRequest): M[ModifyTrafficMirrorSessionResponse]

    def modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest): M[ModifyTransitGatewayVpcAttachmentResponse]

    def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): M[ModifyVolumeResponse]

    def modifyVolumeAttribute(modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest): M[ModifyVolumeAttributeResponse]

    def modifyVpcAttribute(modifyVpcAttributeRequest: ModifyVpcAttributeRequest): M[ModifyVpcAttributeResponse]

    def modifyVpcEndpoint(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): M[ModifyVpcEndpointResponse]

    def modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest): M[ModifyVpcEndpointConnectionNotificationResponse]

    def modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest): M[ModifyVpcEndpointServiceConfigurationResponse]

    def modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest): M[ModifyVpcEndpointServicePermissionsResponse]

    def modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest): M[ModifyVpcPeeringConnectionOptionsResponse]

    def modifyVpcTenancy(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): M[ModifyVpcTenancyResponse]

    def modifyVpnConnection(modifyVpnConnectionRequest: ModifyVpnConnectionRequest): M[ModifyVpnConnectionResponse]

    def modifyVpnTunnelCertificate(modifyVpnTunnelCertificateRequest: ModifyVpnTunnelCertificateRequest): M[ModifyVpnTunnelCertificateResponse]

    def modifyVpnTunnelOptions(modifyVpnTunnelOptionsRequest: ModifyVpnTunnelOptionsRequest): M[ModifyVpnTunnelOptionsResponse]

    def monitorInstances(monitorInstancesRequest: MonitorInstancesRequest): M[MonitorInstancesResponse]

    def moveAddressToVpc(moveAddressToVpcRequest: MoveAddressToVpcRequest): M[MoveAddressToVpcResponse]

    def provisionByoipCidr(provisionByoipCidrRequest: ProvisionByoipCidrRequest): M[ProvisionByoipCidrResponse]

    def purchaseHostReservation(purchaseHostReservationRequest: PurchaseHostReservationRequest): M[PurchaseHostReservationResponse]

    def purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest): M[PurchaseReservedInstancesOfferingResponse]

    def purchaseScheduledInstances(purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest): M[PurchaseScheduledInstancesResponse]

    def rebootInstances(rebootInstancesRequest: RebootInstancesRequest): M[RebootInstancesResponse]

    def registerImage(registerImageRequest: RegisterImageRequest): M[RegisterImageResponse]

    def registerInstanceEventNotificationAttributes(registerInstanceEventNotificationAttributesRequest: RegisterInstanceEventNotificationAttributesRequest): M[RegisterInstanceEventNotificationAttributesResponse]

    def registerTransitGatewayMulticastGroupMembers(registerTransitGatewayMulticastGroupMembersRequest: RegisterTransitGatewayMulticastGroupMembersRequest): M[RegisterTransitGatewayMulticastGroupMembersResponse]

    def registerTransitGatewayMulticastGroupSources(registerTransitGatewayMulticastGroupSourcesRequest: RegisterTransitGatewayMulticastGroupSourcesRequest): M[RegisterTransitGatewayMulticastGroupSourcesResponse]

    def rejectTransitGatewayPeeringAttachment(rejectTransitGatewayPeeringAttachmentRequest: RejectTransitGatewayPeeringAttachmentRequest): M[RejectTransitGatewayPeeringAttachmentResponse]

    def rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest): M[RejectTransitGatewayVpcAttachmentResponse]

    def rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest): M[RejectVpcEndpointConnectionsResponse]

    def rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest): M[RejectVpcPeeringConnectionResponse]

    def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): M[ReleaseAddressResponse]

    def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): M[ReleaseHostsResponse]

    def replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest): M[ReplaceIamInstanceProfileAssociationResponse]

    def replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest): M[ReplaceNetworkAclAssociationResponse]

    def replaceNetworkAclEntry(replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest): M[ReplaceNetworkAclEntryResponse]

    def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): M[ReplaceRouteResponse]

    def replaceRouteTableAssociation(replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest): M[ReplaceRouteTableAssociationResponse]

    def replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest): M[ReplaceTransitGatewayRouteResponse]

    def reportInstanceStatus(reportInstanceStatusRequest: ReportInstanceStatusRequest): M[ReportInstanceStatusResponse]

    def requestSpotFleet(requestSpotFleetRequest: RequestSpotFleetRequest): M[RequestSpotFleetResponse]

    def requestSpotInstances(requestSpotInstancesRequest: RequestSpotInstancesRequest): M[RequestSpotInstancesResponse]

    def resetEbsDefaultKmsKeyId(resetEbsDefaultKmsKeyIdRequest: ResetEbsDefaultKmsKeyIdRequest): M[ResetEbsDefaultKmsKeyIdResponse]

    def resetFpgaImageAttribute(resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest): M[ResetFpgaImageAttributeResponse]

    def resetImageAttribute(resetImageAttributeRequest: ResetImageAttributeRequest): M[ResetImageAttributeResponse]

    def resetInstanceAttribute(resetInstanceAttributeRequest: ResetInstanceAttributeRequest): M[ResetInstanceAttributeResponse]

    def resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest): M[ResetNetworkInterfaceAttributeResponse]

    def resetSnapshotAttribute(resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest): M[ResetSnapshotAttributeResponse]

    def restoreAddressToClassic(restoreAddressToClassicRequest: RestoreAddressToClassicRequest): M[RestoreAddressToClassicResponse]

    def revokeClientVpnIngress(revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest): M[RevokeClientVpnIngressResponse]

    def revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest): M[RevokeSecurityGroupEgressResponse]

    def revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest): M[RevokeSecurityGroupIngressResponse]

    def runInstances(runInstancesRequest: RunInstancesRequest): M[RunInstancesResponse]

    def runScheduledInstances(runScheduledInstancesRequest: RunScheduledInstancesRequest): M[RunScheduledInstancesResponse]

    def searchLocalGatewayRoutes(searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest): M[SearchLocalGatewayRoutesResponse]

    def searchTransitGatewayMulticastGroups(searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest): M[SearchTransitGatewayMulticastGroupsResponse]

    def searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest): M[SearchTransitGatewayRoutesResponse]

    def sendDiagnosticInterrupt(sendDiagnosticInterruptRequest: SendDiagnosticInterruptRequest): M[SendDiagnosticInterruptResponse]

    def startInstances(startInstancesRequest: StartInstancesRequest): M[StartInstancesResponse]

    def startVpcEndpointServicePrivateDnsVerification(startVpcEndpointServicePrivateDnsVerificationRequest: StartVpcEndpointServicePrivateDnsVerificationRequest): M[StartVpcEndpointServicePrivateDnsVerificationResponse]

    def stopInstances(stopInstancesRequest: StopInstancesRequest): M[StopInstancesResponse]

    def terminateClientVpnConnections(terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest): M[TerminateClientVpnConnectionsResponse]

    def terminateInstances(terminateInstancesRequest: TerminateInstancesRequest): M[TerminateInstancesResponse]

    def unassignIpv6Addresses(unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest): M[UnassignIpv6AddressesResponse]

    def unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest): M[UnassignPrivateIpAddressesResponse]

    def unmonitorInstances(unmonitorInstancesRequest: UnmonitorInstancesRequest): M[UnmonitorInstancesResponse]

    def updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest): M[UpdateSecurityGroupRuleDescriptionsEgressResponse]

    def updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest): M[UpdateSecurityGroupRuleDescriptionsIngressResponse]

    def withdrawByoipCidr(withdrawByoipCidrRequest: WithdrawByoipCidrRequest): M[WithdrawByoipCidrResponse]

}
