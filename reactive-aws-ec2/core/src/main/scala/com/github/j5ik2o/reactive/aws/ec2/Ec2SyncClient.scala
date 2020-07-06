// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.ec2.model._
import software.amazon.awssdk.services.ec2.paginators._
import software.amazon.awssdk.services.ec2.{ Ec2Client => JavaEc2SyncClient }

object Ec2SyncClient extends ToEitherSupport {

  def apply(javaClient: JavaEc2SyncClient): Ec2SyncClient =
    new Ec2SyncClient {
      override val underlying: JavaEc2SyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/ec2/Ec2Client.html */
trait Ec2SyncClient extends Ec2Client[Either[Throwable, ?]] {
  val underlying: JavaEc2SyncClient

  import Ec2SyncClient._

  override def acceptReservedInstancesExchangeQuote(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest
  ): Either[Throwable, AcceptReservedInstancesExchangeQuoteResponse] =
    underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest).toEither

  override def acceptTransitGatewayPeeringAttachment(
      acceptTransitGatewayPeeringAttachmentRequest: AcceptTransitGatewayPeeringAttachmentRequest
  ): Either[Throwable, AcceptTransitGatewayPeeringAttachmentResponse] =
    underlying.acceptTransitGatewayPeeringAttachment(acceptTransitGatewayPeeringAttachmentRequest).toEither

  override def acceptTransitGatewayVpcAttachment(
      acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest
  ): Either[Throwable, AcceptTransitGatewayVpcAttachmentResponse] =
    underlying.acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest).toEither

  override def acceptVpcEndpointConnections(
      acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest
  ): Either[Throwable, AcceptVpcEndpointConnectionsResponse] =
    underlying.acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest).toEither

  override def acceptVpcPeeringConnection(
      acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest
  ): Either[Throwable, AcceptVpcPeeringConnectionResponse] =
    underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest).toEither

  override def advertiseByoipCidr(
      advertiseByoipCidrRequest: AdvertiseByoipCidrRequest
  ): Either[Throwable, AdvertiseByoipCidrResponse] =
    underlying.advertiseByoipCidr(advertiseByoipCidrRequest).toEither

  override def allocateAddress(): Either[Throwable, AllocateAddressResponse] =
    underlying.allocateAddress().toEither

  override def allocateAddress(
      allocateAddressRequest: AllocateAddressRequest
  ): Either[Throwable, AllocateAddressResponse] =
    underlying.allocateAddress(allocateAddressRequest).toEither

  override def allocateHosts(allocateHostsRequest: AllocateHostsRequest): Either[Throwable, AllocateHostsResponse] =
    underlying.allocateHosts(allocateHostsRequest).toEither

  override def applySecurityGroupsToClientVpnTargetNetwork(
      applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest
  ): Either[Throwable, ApplySecurityGroupsToClientVpnTargetNetworkResponse] =
    underlying.applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest).toEither

  override def assignIpv6Addresses(
      assignIpv6AddressesRequest: AssignIpv6AddressesRequest
  ): Either[Throwable, AssignIpv6AddressesResponse] =
    underlying.assignIpv6Addresses(assignIpv6AddressesRequest).toEither

  override def assignPrivateIpAddresses(
      assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest
  ): Either[Throwable, AssignPrivateIpAddressesResponse] =
    underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest).toEither

  override def associateAddress(): Either[Throwable, AssociateAddressResponse] =
    underlying.associateAddress().toEither

  override def associateAddress(
      associateAddressRequest: AssociateAddressRequest
  ): Either[Throwable, AssociateAddressResponse] =
    underlying.associateAddress(associateAddressRequest).toEither

  override def associateClientVpnTargetNetwork(
      associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest
  ): Either[Throwable, AssociateClientVpnTargetNetworkResponse] =
    underlying.associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest).toEither

  override def associateDhcpOptions(
      associateDhcpOptionsRequest: AssociateDhcpOptionsRequest
  ): Either[Throwable, AssociateDhcpOptionsResponse] =
    underlying.associateDhcpOptions(associateDhcpOptionsRequest).toEither

  override def associateIamInstanceProfile(
      associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest
  ): Either[Throwable, AssociateIamInstanceProfileResponse] =
    underlying.associateIamInstanceProfile(associateIamInstanceProfileRequest).toEither

  override def associateRouteTable(
      associateRouteTableRequest: AssociateRouteTableRequest
  ): Either[Throwable, AssociateRouteTableResponse] =
    underlying.associateRouteTable(associateRouteTableRequest).toEither

  override def associateSubnetCidrBlock(
      associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest
  ): Either[Throwable, AssociateSubnetCidrBlockResponse] =
    underlying.associateSubnetCidrBlock(associateSubnetCidrBlockRequest).toEither

  override def associateTransitGatewayMulticastDomain(
      associateTransitGatewayMulticastDomainRequest: AssociateTransitGatewayMulticastDomainRequest
  ): Either[Throwable, AssociateTransitGatewayMulticastDomainResponse] =
    underlying.associateTransitGatewayMulticastDomain(associateTransitGatewayMulticastDomainRequest).toEither

  override def associateTransitGatewayRouteTable(
      associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest
  ): Either[Throwable, AssociateTransitGatewayRouteTableResponse] =
    underlying.associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest).toEither

  override def associateVpcCidrBlock(
      associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest
  ): Either[Throwable, AssociateVpcCidrBlockResponse] =
    underlying.associateVpcCidrBlock(associateVpcCidrBlockRequest).toEither

  override def attachClassicLinkVpc(
      attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest
  ): Either[Throwable, AttachClassicLinkVpcResponse] =
    underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest).toEither

  override def attachInternetGateway(
      attachInternetGatewayRequest: AttachInternetGatewayRequest
  ): Either[Throwable, AttachInternetGatewayResponse] =
    underlying.attachInternetGateway(attachInternetGatewayRequest).toEither

  override def attachNetworkInterface(
      attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest
  ): Either[Throwable, AttachNetworkInterfaceResponse] =
    underlying.attachNetworkInterface(attachNetworkInterfaceRequest).toEither

  override def attachVolume(attachVolumeRequest: AttachVolumeRequest): Either[Throwable, AttachVolumeResponse] =
    underlying.attachVolume(attachVolumeRequest).toEither

  override def attachVpnGateway(
      attachVpnGatewayRequest: AttachVpnGatewayRequest
  ): Either[Throwable, AttachVpnGatewayResponse] =
    underlying.attachVpnGateway(attachVpnGatewayRequest).toEither

  override def authorizeClientVpnIngress(
      authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest
  ): Either[Throwable, AuthorizeClientVpnIngressResponse] =
    underlying.authorizeClientVpnIngress(authorizeClientVpnIngressRequest).toEither

  override def authorizeSecurityGroupEgress(
      authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest
  ): Either[Throwable, AuthorizeSecurityGroupEgressResponse] =
    underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest).toEither

  override def authorizeSecurityGroupIngress(
      authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest
  ): Either[Throwable, AuthorizeSecurityGroupIngressResponse] =
    underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest).toEither

  override def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): Either[Throwable, BundleInstanceResponse] =
    underlying.bundleInstance(bundleInstanceRequest).toEither

  override def cancelBundleTask(
      cancelBundleTaskRequest: CancelBundleTaskRequest
  ): Either[Throwable, CancelBundleTaskResponse] =
    underlying.cancelBundleTask(cancelBundleTaskRequest).toEither

  override def cancelCapacityReservation(
      cancelCapacityReservationRequest: CancelCapacityReservationRequest
  ): Either[Throwable, CancelCapacityReservationResponse] =
    underlying.cancelCapacityReservation(cancelCapacityReservationRequest).toEither

  override def cancelConversionTask(
      cancelConversionTaskRequest: CancelConversionTaskRequest
  ): Either[Throwable, CancelConversionTaskResponse] =
    underlying.cancelConversionTask(cancelConversionTaskRequest).toEither

  override def cancelExportTask(
      cancelExportTaskRequest: CancelExportTaskRequest
  ): Either[Throwable, CancelExportTaskResponse] =
    underlying.cancelExportTask(cancelExportTaskRequest).toEither

  override def cancelImportTask(
      cancelImportTaskRequest: CancelImportTaskRequest
  ): Either[Throwable, CancelImportTaskResponse] =
    underlying.cancelImportTask(cancelImportTaskRequest).toEither

  override def cancelReservedInstancesListing(
      cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest
  ): Either[Throwable, CancelReservedInstancesListingResponse] =
    underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest).toEither

  override def cancelSpotFleetRequests(
      cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest
  ): Either[Throwable, CancelSpotFleetRequestsResponse] =
    underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest).toEither

  override def cancelSpotInstanceRequests(
      cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest
  ): Either[Throwable, CancelSpotInstanceRequestsResponse] =
    underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest).toEither

  override def confirmProductInstance(
      confirmProductInstanceRequest: ConfirmProductInstanceRequest
  ): Either[Throwable, ConfirmProductInstanceResponse] =
    underlying.confirmProductInstance(confirmProductInstanceRequest).toEither

  override def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): Either[Throwable, CopyFpgaImageResponse] =
    underlying.copyFpgaImage(copyFpgaImageRequest).toEither

  override def copyImage(copyImageRequest: CopyImageRequest): Either[Throwable, CopyImageResponse] =
    underlying.copyImage(copyImageRequest).toEither

  override def copySnapshot(copySnapshotRequest: CopySnapshotRequest): Either[Throwable, CopySnapshotResponse] =
    underlying.copySnapshot(copySnapshotRequest).toEither

  override def createCapacityReservation(
      createCapacityReservationRequest: CreateCapacityReservationRequest
  ): Either[Throwable, CreateCapacityReservationResponse] =
    underlying.createCapacityReservation(createCapacityReservationRequest).toEither

  override def createClientVpnEndpoint(
      createClientVpnEndpointRequest: CreateClientVpnEndpointRequest
  ): Either[Throwable, CreateClientVpnEndpointResponse] =
    underlying.createClientVpnEndpoint(createClientVpnEndpointRequest).toEither

  override def createClientVpnRoute(
      createClientVpnRouteRequest: CreateClientVpnRouteRequest
  ): Either[Throwable, CreateClientVpnRouteResponse] =
    underlying.createClientVpnRoute(createClientVpnRouteRequest).toEither

  override def createCustomerGateway(
      createCustomerGatewayRequest: CreateCustomerGatewayRequest
  ): Either[Throwable, CreateCustomerGatewayResponse] =
    underlying.createCustomerGateway(createCustomerGatewayRequest).toEither

  override def createDefaultSubnet(
      createDefaultSubnetRequest: CreateDefaultSubnetRequest
  ): Either[Throwable, CreateDefaultSubnetResponse] =
    underlying.createDefaultSubnet(createDefaultSubnetRequest).toEither

  override def createDefaultVpc(): Either[Throwable, CreateDefaultVpcResponse] =
    underlying.createDefaultVpc().toEither

  override def createDefaultVpc(
      createDefaultVpcRequest: CreateDefaultVpcRequest
  ): Either[Throwable, CreateDefaultVpcResponse] =
    underlying.createDefaultVpc(createDefaultVpcRequest).toEither

  override def createDhcpOptions(
      createDhcpOptionsRequest: CreateDhcpOptionsRequest
  ): Either[Throwable, CreateDhcpOptionsResponse] =
    underlying.createDhcpOptions(createDhcpOptionsRequest).toEither

  override def createEgressOnlyInternetGateway(
      createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest
  ): Either[Throwable, CreateEgressOnlyInternetGatewayResponse] =
    underlying.createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest).toEither

  override def createFleet(createFleetRequest: CreateFleetRequest): Either[Throwable, CreateFleetResponse] =
    underlying.createFleet(createFleetRequest).toEither

  override def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): Either[Throwable, CreateFlowLogsResponse] =
    underlying.createFlowLogs(createFlowLogsRequest).toEither

  override def createFpgaImage(
      createFpgaImageRequest: CreateFpgaImageRequest
  ): Either[Throwable, CreateFpgaImageResponse] =
    underlying.createFpgaImage(createFpgaImageRequest).toEither

  override def createImage(createImageRequest: CreateImageRequest): Either[Throwable, CreateImageResponse] =
    underlying.createImage(createImageRequest).toEither

  override def createInstanceExportTask(
      createInstanceExportTaskRequest: CreateInstanceExportTaskRequest
  ): Either[Throwable, CreateInstanceExportTaskResponse] =
    underlying.createInstanceExportTask(createInstanceExportTaskRequest).toEither

  override def createInternetGateway(): Either[Throwable, CreateInternetGatewayResponse] =
    underlying.createInternetGateway().toEither

  override def createInternetGateway(
      createInternetGatewayRequest: CreateInternetGatewayRequest
  ): Either[Throwable, CreateInternetGatewayResponse] =
    underlying.createInternetGateway(createInternetGatewayRequest).toEither

  override def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): Either[Throwable, CreateKeyPairResponse] =
    underlying.createKeyPair(createKeyPairRequest).toEither

  override def createLaunchTemplate(
      createLaunchTemplateRequest: CreateLaunchTemplateRequest
  ): Either[Throwable, CreateLaunchTemplateResponse] =
    underlying.createLaunchTemplate(createLaunchTemplateRequest).toEither

  override def createLaunchTemplateVersion(
      createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest
  ): Either[Throwable, CreateLaunchTemplateVersionResponse] =
    underlying.createLaunchTemplateVersion(createLaunchTemplateVersionRequest).toEither

  override def createLocalGatewayRoute(
      createLocalGatewayRouteRequest: CreateLocalGatewayRouteRequest
  ): Either[Throwable, CreateLocalGatewayRouteResponse] =
    underlying.createLocalGatewayRoute(createLocalGatewayRouteRequest).toEither

  override def createLocalGatewayRouteTableVpcAssociation(
      createLocalGatewayRouteTableVpcAssociationRequest: CreateLocalGatewayRouteTableVpcAssociationRequest
  ): Either[Throwable, CreateLocalGatewayRouteTableVpcAssociationResponse] =
    underlying.createLocalGatewayRouteTableVpcAssociation(createLocalGatewayRouteTableVpcAssociationRequest).toEither

  override def createManagedPrefixList(
      createManagedPrefixListRequest: CreateManagedPrefixListRequest
  ): Either[Throwable, CreateManagedPrefixListResponse] =
    underlying.createManagedPrefixList(createManagedPrefixListRequest).toEither

  override def createNatGateway(
      createNatGatewayRequest: CreateNatGatewayRequest
  ): Either[Throwable, CreateNatGatewayResponse] =
    underlying.createNatGateway(createNatGatewayRequest).toEither

  override def createNetworkAcl(
      createNetworkAclRequest: CreateNetworkAclRequest
  ): Either[Throwable, CreateNetworkAclResponse] =
    underlying.createNetworkAcl(createNetworkAclRequest).toEither

  override def createNetworkAclEntry(
      createNetworkAclEntryRequest: CreateNetworkAclEntryRequest
  ): Either[Throwable, CreateNetworkAclEntryResponse] =
    underlying.createNetworkAclEntry(createNetworkAclEntryRequest).toEither

  override def createNetworkInterface(
      createNetworkInterfaceRequest: CreateNetworkInterfaceRequest
  ): Either[Throwable, CreateNetworkInterfaceResponse] =
    underlying.createNetworkInterface(createNetworkInterfaceRequest).toEither

  override def createNetworkInterfacePermission(
      createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest
  ): Either[Throwable, CreateNetworkInterfacePermissionResponse] =
    underlying.createNetworkInterfacePermission(createNetworkInterfacePermissionRequest).toEither

  override def createPlacementGroup(
      createPlacementGroupRequest: CreatePlacementGroupRequest
  ): Either[Throwable, CreatePlacementGroupResponse] =
    underlying.createPlacementGroup(createPlacementGroupRequest).toEither

  override def createReservedInstancesListing(
      createReservedInstancesListingRequest: CreateReservedInstancesListingRequest
  ): Either[Throwable, CreateReservedInstancesListingResponse] =
    underlying.createReservedInstancesListing(createReservedInstancesListingRequest).toEither

  override def createRoute(createRouteRequest: CreateRouteRequest): Either[Throwable, CreateRouteResponse] =
    underlying.createRoute(createRouteRequest).toEither

  override def createRouteTable(
      createRouteTableRequest: CreateRouteTableRequest
  ): Either[Throwable, CreateRouteTableResponse] =
    underlying.createRouteTable(createRouteTableRequest).toEither

  override def createSecurityGroup(
      createSecurityGroupRequest: CreateSecurityGroupRequest
  ): Either[Throwable, CreateSecurityGroupResponse] =
    underlying.createSecurityGroup(createSecurityGroupRequest).toEither

  override def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): Either[Throwable, CreateSnapshotResponse] =
    underlying.createSnapshot(createSnapshotRequest).toEither

  override def createSnapshots(
      createSnapshotsRequest: CreateSnapshotsRequest
  ): Either[Throwable, CreateSnapshotsResponse] =
    underlying.createSnapshots(createSnapshotsRequest).toEither

  override def createSpotDatafeedSubscription(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest
  ): Either[Throwable, CreateSpotDatafeedSubscriptionResponse] =
    underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest).toEither

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): Either[Throwable, CreateSubnetResponse] =
    underlying.createSubnet(createSubnetRequest).toEither

  override def createTags(createTagsRequest: CreateTagsRequest): Either[Throwable, CreateTagsResponse] =
    underlying.createTags(createTagsRequest).toEither

  override def createTrafficMirrorFilter(
      createTrafficMirrorFilterRequest: CreateTrafficMirrorFilterRequest
  ): Either[Throwable, CreateTrafficMirrorFilterResponse] =
    underlying.createTrafficMirrorFilter(createTrafficMirrorFilterRequest).toEither

  override def createTrafficMirrorFilterRule(
      createTrafficMirrorFilterRuleRequest: CreateTrafficMirrorFilterRuleRequest
  ): Either[Throwable, CreateTrafficMirrorFilterRuleResponse] =
    underlying.createTrafficMirrorFilterRule(createTrafficMirrorFilterRuleRequest).toEither

  override def createTrafficMirrorSession(
      createTrafficMirrorSessionRequest: CreateTrafficMirrorSessionRequest
  ): Either[Throwable, CreateTrafficMirrorSessionResponse] =
    underlying.createTrafficMirrorSession(createTrafficMirrorSessionRequest).toEither

  override def createTrafficMirrorTarget(
      createTrafficMirrorTargetRequest: CreateTrafficMirrorTargetRequest
  ): Either[Throwable, CreateTrafficMirrorTargetResponse] =
    underlying.createTrafficMirrorTarget(createTrafficMirrorTargetRequest).toEither

  override def createTransitGateway(): Either[Throwable, CreateTransitGatewayResponse] =
    underlying.createTransitGateway().toEither

  override def createTransitGateway(
      createTransitGatewayRequest: CreateTransitGatewayRequest
  ): Either[Throwable, CreateTransitGatewayResponse] =
    underlying.createTransitGateway(createTransitGatewayRequest).toEither

  override def createTransitGatewayMulticastDomain(
      createTransitGatewayMulticastDomainRequest: CreateTransitGatewayMulticastDomainRequest
  ): Either[Throwable, CreateTransitGatewayMulticastDomainResponse] =
    underlying.createTransitGatewayMulticastDomain(createTransitGatewayMulticastDomainRequest).toEither

  override def createTransitGatewayPeeringAttachment(
      createTransitGatewayPeeringAttachmentRequest: CreateTransitGatewayPeeringAttachmentRequest
  ): Either[Throwable, CreateTransitGatewayPeeringAttachmentResponse] =
    underlying.createTransitGatewayPeeringAttachment(createTransitGatewayPeeringAttachmentRequest).toEither

  override def createTransitGatewayRoute(
      createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest
  ): Either[Throwable, CreateTransitGatewayRouteResponse] =
    underlying.createTransitGatewayRoute(createTransitGatewayRouteRequest).toEither

  override def createTransitGatewayRouteTable(
      createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest
  ): Either[Throwable, CreateTransitGatewayRouteTableResponse] =
    underlying.createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest).toEither

  override def createTransitGatewayVpcAttachment(
      createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest
  ): Either[Throwable, CreateTransitGatewayVpcAttachmentResponse] =
    underlying.createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest).toEither

  override def createVolume(createVolumeRequest: CreateVolumeRequest): Either[Throwable, CreateVolumeResponse] =
    underlying.createVolume(createVolumeRequest).toEither

  override def createVpc(createVpcRequest: CreateVpcRequest): Either[Throwable, CreateVpcResponse] =
    underlying.createVpc(createVpcRequest).toEither

  override def createVpcEndpoint(
      createVpcEndpointRequest: CreateVpcEndpointRequest
  ): Either[Throwable, CreateVpcEndpointResponse] =
    underlying.createVpcEndpoint(createVpcEndpointRequest).toEither

  override def createVpcEndpointConnectionNotification(
      createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest
  ): Either[Throwable, CreateVpcEndpointConnectionNotificationResponse] =
    underlying.createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest).toEither

  override def createVpcEndpointServiceConfiguration(
      createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest
  ): Either[Throwable, CreateVpcEndpointServiceConfigurationResponse] =
    underlying.createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest).toEither

  override def createVpcPeeringConnection(
      createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest
  ): Either[Throwable, CreateVpcPeeringConnectionResponse] =
    underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest).toEither

  override def createVpnConnection(
      createVpnConnectionRequest: CreateVpnConnectionRequest
  ): Either[Throwable, CreateVpnConnectionResponse] =
    underlying.createVpnConnection(createVpnConnectionRequest).toEither

  override def createVpnConnectionRoute(
      createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest
  ): Either[Throwable, CreateVpnConnectionRouteResponse] =
    underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest).toEither

  override def createVpnGateway(
      createVpnGatewayRequest: CreateVpnGatewayRequest
  ): Either[Throwable, CreateVpnGatewayResponse] =
    underlying.createVpnGateway(createVpnGatewayRequest).toEither

  override def deleteClientVpnEndpoint(
      deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest
  ): Either[Throwable, DeleteClientVpnEndpointResponse] =
    underlying.deleteClientVpnEndpoint(deleteClientVpnEndpointRequest).toEither

  override def deleteClientVpnRoute(
      deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest
  ): Either[Throwable, DeleteClientVpnRouteResponse] =
    underlying.deleteClientVpnRoute(deleteClientVpnRouteRequest).toEither

  override def deleteCustomerGateway(
      deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest
  ): Either[Throwable, DeleteCustomerGatewayResponse] =
    underlying.deleteCustomerGateway(deleteCustomerGatewayRequest).toEither

  override def deleteDhcpOptions(
      deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest
  ): Either[Throwable, DeleteDhcpOptionsResponse] =
    underlying.deleteDhcpOptions(deleteDhcpOptionsRequest).toEither

  override def deleteEgressOnlyInternetGateway(
      deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest
  ): Either[Throwable, DeleteEgressOnlyInternetGatewayResponse] =
    underlying.deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest).toEither

  override def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): Either[Throwable, DeleteFleetsResponse] =
    underlying.deleteFleets(deleteFleetsRequest).toEither

  override def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): Either[Throwable, DeleteFlowLogsResponse] =
    underlying.deleteFlowLogs(deleteFlowLogsRequest).toEither

  override def deleteFpgaImage(
      deleteFpgaImageRequest: DeleteFpgaImageRequest
  ): Either[Throwable, DeleteFpgaImageResponse] =
    underlying.deleteFpgaImage(deleteFpgaImageRequest).toEither

  override def deleteInternetGateway(
      deleteInternetGatewayRequest: DeleteInternetGatewayRequest
  ): Either[Throwable, DeleteInternetGatewayResponse] =
    underlying.deleteInternetGateway(deleteInternetGatewayRequest).toEither

  override def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): Either[Throwable, DeleteKeyPairResponse] =
    underlying.deleteKeyPair(deleteKeyPairRequest).toEither

  override def deleteLaunchTemplate(
      deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest
  ): Either[Throwable, DeleteLaunchTemplateResponse] =
    underlying.deleteLaunchTemplate(deleteLaunchTemplateRequest).toEither

  override def deleteLaunchTemplateVersions(
      deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest
  ): Either[Throwable, DeleteLaunchTemplateVersionsResponse] =
    underlying.deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest).toEither

  override def deleteLocalGatewayRoute(
      deleteLocalGatewayRouteRequest: DeleteLocalGatewayRouteRequest
  ): Either[Throwable, DeleteLocalGatewayRouteResponse] =
    underlying.deleteLocalGatewayRoute(deleteLocalGatewayRouteRequest).toEither

  override def deleteLocalGatewayRouteTableVpcAssociation(
      deleteLocalGatewayRouteTableVpcAssociationRequest: DeleteLocalGatewayRouteTableVpcAssociationRequest
  ): Either[Throwable, DeleteLocalGatewayRouteTableVpcAssociationResponse] =
    underlying.deleteLocalGatewayRouteTableVpcAssociation(deleteLocalGatewayRouteTableVpcAssociationRequest).toEither

  override def deleteManagedPrefixList(
      deleteManagedPrefixListRequest: DeleteManagedPrefixListRequest
  ): Either[Throwable, DeleteManagedPrefixListResponse] =
    underlying.deleteManagedPrefixList(deleteManagedPrefixListRequest).toEither

  override def deleteNatGateway(
      deleteNatGatewayRequest: DeleteNatGatewayRequest
  ): Either[Throwable, DeleteNatGatewayResponse] =
    underlying.deleteNatGateway(deleteNatGatewayRequest).toEither

  override def deleteNetworkAcl(
      deleteNetworkAclRequest: DeleteNetworkAclRequest
  ): Either[Throwable, DeleteNetworkAclResponse] =
    underlying.deleteNetworkAcl(deleteNetworkAclRequest).toEither

  override def deleteNetworkAclEntry(
      deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest
  ): Either[Throwable, DeleteNetworkAclEntryResponse] =
    underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest).toEither

  override def deleteNetworkInterface(
      deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest
  ): Either[Throwable, DeleteNetworkInterfaceResponse] =
    underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest).toEither

  override def deleteNetworkInterfacePermission(
      deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest
  ): Either[Throwable, DeleteNetworkInterfacePermissionResponse] =
    underlying.deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest).toEither

  override def deletePlacementGroup(
      deletePlacementGroupRequest: DeletePlacementGroupRequest
  ): Either[Throwable, DeletePlacementGroupResponse] =
    underlying.deletePlacementGroup(deletePlacementGroupRequest).toEither

  override def deleteQueuedReservedInstances(
      deleteQueuedReservedInstancesRequest: DeleteQueuedReservedInstancesRequest
  ): Either[Throwable, DeleteQueuedReservedInstancesResponse] =
    underlying.deleteQueuedReservedInstances(deleteQueuedReservedInstancesRequest).toEither

  override def deleteRoute(deleteRouteRequest: DeleteRouteRequest): Either[Throwable, DeleteRouteResponse] =
    underlying.deleteRoute(deleteRouteRequest).toEither

  override def deleteRouteTable(
      deleteRouteTableRequest: DeleteRouteTableRequest
  ): Either[Throwable, DeleteRouteTableResponse] =
    underlying.deleteRouteTable(deleteRouteTableRequest).toEither

  override def deleteSecurityGroup(
      deleteSecurityGroupRequest: DeleteSecurityGroupRequest
  ): Either[Throwable, DeleteSecurityGroupResponse] =
    underlying.deleteSecurityGroup(deleteSecurityGroupRequest).toEither

  override def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): Either[Throwable, DeleteSnapshotResponse] =
    underlying.deleteSnapshot(deleteSnapshotRequest).toEither

  override def deleteSpotDatafeedSubscription(): Either[Throwable, DeleteSpotDatafeedSubscriptionResponse] =
    underlying.deleteSpotDatafeedSubscription().toEither

  override def deleteSpotDatafeedSubscription(
      deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest
  ): Either[Throwable, DeleteSpotDatafeedSubscriptionResponse] =
    underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest).toEither

  override def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): Either[Throwable, DeleteSubnetResponse] =
    underlying.deleteSubnet(deleteSubnetRequest).toEither

  override def deleteTags(deleteTagsRequest: DeleteTagsRequest): Either[Throwable, DeleteTagsResponse] =
    underlying.deleteTags(deleteTagsRequest).toEither

  override def deleteTrafficMirrorFilter(
      deleteTrafficMirrorFilterRequest: DeleteTrafficMirrorFilterRequest
  ): Either[Throwable, DeleteTrafficMirrorFilterResponse] =
    underlying.deleteTrafficMirrorFilter(deleteTrafficMirrorFilterRequest).toEither

  override def deleteTrafficMirrorFilterRule(
      deleteTrafficMirrorFilterRuleRequest: DeleteTrafficMirrorFilterRuleRequest
  ): Either[Throwable, DeleteTrafficMirrorFilterRuleResponse] =
    underlying.deleteTrafficMirrorFilterRule(deleteTrafficMirrorFilterRuleRequest).toEither

  override def deleteTrafficMirrorSession(
      deleteTrafficMirrorSessionRequest: DeleteTrafficMirrorSessionRequest
  ): Either[Throwable, DeleteTrafficMirrorSessionResponse] =
    underlying.deleteTrafficMirrorSession(deleteTrafficMirrorSessionRequest).toEither

  override def deleteTrafficMirrorTarget(
      deleteTrafficMirrorTargetRequest: DeleteTrafficMirrorTargetRequest
  ): Either[Throwable, DeleteTrafficMirrorTargetResponse] =
    underlying.deleteTrafficMirrorTarget(deleteTrafficMirrorTargetRequest).toEither

  override def deleteTransitGateway(
      deleteTransitGatewayRequest: DeleteTransitGatewayRequest
  ): Either[Throwable, DeleteTransitGatewayResponse] =
    underlying.deleteTransitGateway(deleteTransitGatewayRequest).toEither

  override def deleteTransitGatewayMulticastDomain(
      deleteTransitGatewayMulticastDomainRequest: DeleteTransitGatewayMulticastDomainRequest
  ): Either[Throwable, DeleteTransitGatewayMulticastDomainResponse] =
    underlying.deleteTransitGatewayMulticastDomain(deleteTransitGatewayMulticastDomainRequest).toEither

  override def deleteTransitGatewayPeeringAttachment(
      deleteTransitGatewayPeeringAttachmentRequest: DeleteTransitGatewayPeeringAttachmentRequest
  ): Either[Throwable, DeleteTransitGatewayPeeringAttachmentResponse] =
    underlying.deleteTransitGatewayPeeringAttachment(deleteTransitGatewayPeeringAttachmentRequest).toEither

  override def deleteTransitGatewayRoute(
      deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest
  ): Either[Throwable, DeleteTransitGatewayRouteResponse] =
    underlying.deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest).toEither

  override def deleteTransitGatewayRouteTable(
      deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest
  ): Either[Throwable, DeleteTransitGatewayRouteTableResponse] =
    underlying.deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest).toEither

  override def deleteTransitGatewayVpcAttachment(
      deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest
  ): Either[Throwable, DeleteTransitGatewayVpcAttachmentResponse] =
    underlying.deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest).toEither

  override def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): Either[Throwable, DeleteVolumeResponse] =
    underlying.deleteVolume(deleteVolumeRequest).toEither

  override def deleteVpc(deleteVpcRequest: DeleteVpcRequest): Either[Throwable, DeleteVpcResponse] =
    underlying.deleteVpc(deleteVpcRequest).toEither

  override def deleteVpcEndpointConnectionNotifications(
      deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest
  ): Either[Throwable, DeleteVpcEndpointConnectionNotificationsResponse] =
    underlying.deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest).toEither

  override def deleteVpcEndpointServiceConfigurations(
      deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest
  ): Either[Throwable, DeleteVpcEndpointServiceConfigurationsResponse] =
    underlying.deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest).toEither

  override def deleteVpcEndpoints(
      deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest
  ): Either[Throwable, DeleteVpcEndpointsResponse] =
    underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest).toEither

  override def deleteVpcPeeringConnection(
      deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest
  ): Either[Throwable, DeleteVpcPeeringConnectionResponse] =
    underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest).toEither

  override def deleteVpnConnection(
      deleteVpnConnectionRequest: DeleteVpnConnectionRequest
  ): Either[Throwable, DeleteVpnConnectionResponse] =
    underlying.deleteVpnConnection(deleteVpnConnectionRequest).toEither

  override def deleteVpnConnectionRoute(
      deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest
  ): Either[Throwable, DeleteVpnConnectionRouteResponse] =
    underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest).toEither

  override def deleteVpnGateway(
      deleteVpnGatewayRequest: DeleteVpnGatewayRequest
  ): Either[Throwable, DeleteVpnGatewayResponse] =
    underlying.deleteVpnGateway(deleteVpnGatewayRequest).toEither

  override def deprovisionByoipCidr(
      deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest
  ): Either[Throwable, DeprovisionByoipCidrResponse] =
    underlying.deprovisionByoipCidr(deprovisionByoipCidrRequest).toEither

  override def deregisterImage(
      deregisterImageRequest: DeregisterImageRequest
  ): Either[Throwable, DeregisterImageResponse] =
    underlying.deregisterImage(deregisterImageRequest).toEither

  override def deregisterInstanceEventNotificationAttributes(
      deregisterInstanceEventNotificationAttributesRequest: DeregisterInstanceEventNotificationAttributesRequest
  ): Either[Throwable, DeregisterInstanceEventNotificationAttributesResponse] =
    underlying
      .deregisterInstanceEventNotificationAttributes(deregisterInstanceEventNotificationAttributesRequest).toEither

  override def deregisterTransitGatewayMulticastGroupMembers(
      deregisterTransitGatewayMulticastGroupMembersRequest: DeregisterTransitGatewayMulticastGroupMembersRequest
  ): Either[Throwable, DeregisterTransitGatewayMulticastGroupMembersResponse] =
    underlying
      .deregisterTransitGatewayMulticastGroupMembers(deregisterTransitGatewayMulticastGroupMembersRequest).toEither

  override def deregisterTransitGatewayMulticastGroupSources(
      deregisterTransitGatewayMulticastGroupSourcesRequest: DeregisterTransitGatewayMulticastGroupSourcesRequest
  ): Either[Throwable, DeregisterTransitGatewayMulticastGroupSourcesResponse] =
    underlying
      .deregisterTransitGatewayMulticastGroupSources(deregisterTransitGatewayMulticastGroupSourcesRequest).toEither

  override def describeAccountAttributes(): Either[Throwable, DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes().toEither

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Either[Throwable, DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes(describeAccountAttributesRequest).toEither

  override def describeAddresses(): Either[Throwable, DescribeAddressesResponse] =
    underlying.describeAddresses().toEither

  override def describeAddresses(
      describeAddressesRequest: DescribeAddressesRequest
  ): Either[Throwable, DescribeAddressesResponse] =
    underlying.describeAddresses(describeAddressesRequest).toEither

  override def describeAggregateIdFormat(): Either[Throwable, DescribeAggregateIdFormatResponse] =
    underlying.describeAggregateIdFormat().toEither

  override def describeAggregateIdFormat(
      describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest
  ): Either[Throwable, DescribeAggregateIdFormatResponse] =
    underlying.describeAggregateIdFormat(describeAggregateIdFormatRequest).toEither

  override def describeAvailabilityZones(): Either[Throwable, DescribeAvailabilityZonesResponse] =
    underlying.describeAvailabilityZones().toEither

  override def describeAvailabilityZones(
      describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest
  ): Either[Throwable, DescribeAvailabilityZonesResponse] =
    underlying.describeAvailabilityZones(describeAvailabilityZonesRequest).toEither

  override def describeBundleTasks(): Either[Throwable, DescribeBundleTasksResponse] =
    underlying.describeBundleTasks().toEither

  override def describeBundleTasks(
      describeBundleTasksRequest: DescribeBundleTasksRequest
  ): Either[Throwable, DescribeBundleTasksResponse] =
    underlying.describeBundleTasks(describeBundleTasksRequest).toEither

  override def describeByoipCidrs(
      describeByoipCidrsRequest: DescribeByoipCidrsRequest
  ): Either[Throwable, DescribeByoipCidrsResponse] =
    underlying.describeByoipCidrs(describeByoipCidrsRequest).toEither

  def describeByoipCidrsPaginator(describeByoipCidrsRequest: DescribeByoipCidrsRequest): DescribeByoipCidrsIterable =
    underlying.describeByoipCidrsPaginator(describeByoipCidrsRequest)

  override def describeCapacityReservations(): Either[Throwable, DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations().toEither

  override def describeCapacityReservations(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): Either[Throwable, DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations(describeCapacityReservationsRequest).toEither

  def describeCapacityReservationsPaginator(): DescribeCapacityReservationsIterable =
    underlying.describeCapacityReservationsPaginator()

  def describeCapacityReservationsPaginator(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): DescribeCapacityReservationsIterable =
    underlying.describeCapacityReservationsPaginator(describeCapacityReservationsRequest)

  override def describeClassicLinkInstances(): Either[Throwable, DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances().toEither

  override def describeClassicLinkInstances(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): Either[Throwable, DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest).toEither

  def describeClassicLinkInstancesPaginator(): DescribeClassicLinkInstancesIterable =
    underlying.describeClassicLinkInstancesPaginator()

  def describeClassicLinkInstancesPaginator(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): DescribeClassicLinkInstancesIterable =
    underlying.describeClassicLinkInstancesPaginator(describeClassicLinkInstancesRequest)

  override def describeClientVpnAuthorizationRules(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): Either[Throwable, DescribeClientVpnAuthorizationRulesResponse] =
    underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest).toEither

  def describeClientVpnAuthorizationRulesPaginator(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): DescribeClientVpnAuthorizationRulesIterable =
    underlying.describeClientVpnAuthorizationRulesPaginator(describeClientVpnAuthorizationRulesRequest)

  override def describeClientVpnConnections(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): Either[Throwable, DescribeClientVpnConnectionsResponse] =
    underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest).toEither

  def describeClientVpnConnectionsPaginator(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): DescribeClientVpnConnectionsIterable =
    underlying.describeClientVpnConnectionsPaginator(describeClientVpnConnectionsRequest)

  override def describeClientVpnEndpoints(): Either[Throwable, DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints().toEither

  override def describeClientVpnEndpoints(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): Either[Throwable, DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest).toEither

  def describeClientVpnEndpointsPaginator(): DescribeClientVpnEndpointsIterable =
    underlying.describeClientVpnEndpointsPaginator()

  def describeClientVpnEndpointsPaginator(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): DescribeClientVpnEndpointsIterable =
    underlying.describeClientVpnEndpointsPaginator(describeClientVpnEndpointsRequest)

  override def describeClientVpnRoutes(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): Either[Throwable, DescribeClientVpnRoutesResponse] =
    underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest).toEither

  def describeClientVpnRoutesPaginator(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): DescribeClientVpnRoutesIterable =
    underlying.describeClientVpnRoutesPaginator(describeClientVpnRoutesRequest)

  override def describeClientVpnTargetNetworks(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): Either[Throwable, DescribeClientVpnTargetNetworksResponse] =
    underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest).toEither

  def describeClientVpnTargetNetworksPaginator(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): DescribeClientVpnTargetNetworksIterable =
    underlying.describeClientVpnTargetNetworksPaginator(describeClientVpnTargetNetworksRequest)

  override def describeCoipPools(
      describeCoipPoolsRequest: DescribeCoipPoolsRequest
  ): Either[Throwable, DescribeCoipPoolsResponse] =
    underlying.describeCoipPools(describeCoipPoolsRequest).toEither

  def describeCoipPoolsPaginator(describeCoipPoolsRequest: DescribeCoipPoolsRequest): DescribeCoipPoolsIterable =
    underlying.describeCoipPoolsPaginator(describeCoipPoolsRequest)

  override def describeConversionTasks(): Either[Throwable, DescribeConversionTasksResponse] =
    underlying.describeConversionTasks().toEither

  override def describeConversionTasks(
      describeConversionTasksRequest: DescribeConversionTasksRequest
  ): Either[Throwable, DescribeConversionTasksResponse] =
    underlying.describeConversionTasks(describeConversionTasksRequest).toEither

  override def describeCustomerGateways(): Either[Throwable, DescribeCustomerGatewaysResponse] =
    underlying.describeCustomerGateways().toEither

  override def describeCustomerGateways(
      describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest
  ): Either[Throwable, DescribeCustomerGatewaysResponse] =
    underlying.describeCustomerGateways(describeCustomerGatewaysRequest).toEither

  override def describeDhcpOptions(): Either[Throwable, DescribeDhcpOptionsResponse] =
    underlying.describeDhcpOptions().toEither

  override def describeDhcpOptions(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): Either[Throwable, DescribeDhcpOptionsResponse] =
    underlying.describeDhcpOptions(describeDhcpOptionsRequest).toEither

  def describeDhcpOptionsPaginator(): DescribeDhcpOptionsIterable =
    underlying.describeDhcpOptionsPaginator()

  def describeDhcpOptionsPaginator(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): DescribeDhcpOptionsIterable =
    underlying.describeDhcpOptionsPaginator(describeDhcpOptionsRequest)

  override def describeEgressOnlyInternetGateways(): Either[Throwable, DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways().toEither

  override def describeEgressOnlyInternetGateways(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): Either[Throwable, DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest).toEither

  def describeEgressOnlyInternetGatewaysPaginator(): DescribeEgressOnlyInternetGatewaysIterable =
    underlying.describeEgressOnlyInternetGatewaysPaginator()

  def describeEgressOnlyInternetGatewaysPaginator(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): DescribeEgressOnlyInternetGatewaysIterable =
    underlying.describeEgressOnlyInternetGatewaysPaginator(describeEgressOnlyInternetGatewaysRequest)

  override def describeElasticGpus(): Either[Throwable, DescribeElasticGpusResponse] =
    underlying.describeElasticGpus().toEither

  override def describeElasticGpus(
      describeElasticGpusRequest: DescribeElasticGpusRequest
  ): Either[Throwable, DescribeElasticGpusResponse] =
    underlying.describeElasticGpus(describeElasticGpusRequest).toEither

  override def describeExportImageTasks(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): Either[Throwable, DescribeExportImageTasksResponse] =
    underlying.describeExportImageTasks(describeExportImageTasksRequest).toEither

  def describeExportImageTasksPaginator(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): DescribeExportImageTasksIterable =
    underlying.describeExportImageTasksPaginator(describeExportImageTasksRequest)

  override def describeExportTasks(): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks().toEither

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks(describeExportTasksRequest).toEither

  override def describeFastSnapshotRestores(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): Either[Throwable, DescribeFastSnapshotRestoresResponse] =
    underlying.describeFastSnapshotRestores(describeFastSnapshotRestoresRequest).toEither

  def describeFastSnapshotRestoresPaginator(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): DescribeFastSnapshotRestoresIterable =
    underlying.describeFastSnapshotRestoresPaginator(describeFastSnapshotRestoresRequest)

  override def describeFleetHistory(
      describeFleetHistoryRequest: DescribeFleetHistoryRequest
  ): Either[Throwable, DescribeFleetHistoryResponse] =
    underlying.describeFleetHistory(describeFleetHistoryRequest).toEither

  override def describeFleetInstances(
      describeFleetInstancesRequest: DescribeFleetInstancesRequest
  ): Either[Throwable, DescribeFleetInstancesResponse] =
    underlying.describeFleetInstances(describeFleetInstancesRequest).toEither

  override def describeFleets(): Either[Throwable, DescribeFleetsResponse] =
    underlying.describeFleets().toEither

  override def describeFleets(describeFleetsRequest: DescribeFleetsRequest): Either[Throwable, DescribeFleetsResponse] =
    underlying.describeFleets(describeFleetsRequest).toEither

  def describeFleetsPaginator(): DescribeFleetsIterable =
    underlying.describeFleetsPaginator()

  def describeFleetsPaginator(describeFleetsRequest: DescribeFleetsRequest): DescribeFleetsIterable =
    underlying.describeFleetsPaginator(describeFleetsRequest)

  override def describeFlowLogs(): Either[Throwable, DescribeFlowLogsResponse] =
    underlying.describeFlowLogs().toEither

  override def describeFlowLogs(
      describeFlowLogsRequest: DescribeFlowLogsRequest
  ): Either[Throwable, DescribeFlowLogsResponse] =
    underlying.describeFlowLogs(describeFlowLogsRequest).toEither

  def describeFlowLogsPaginator(): DescribeFlowLogsIterable =
    underlying.describeFlowLogsPaginator()

  def describeFlowLogsPaginator(describeFlowLogsRequest: DescribeFlowLogsRequest): DescribeFlowLogsIterable =
    underlying.describeFlowLogsPaginator(describeFlowLogsRequest)

  override def describeFpgaImageAttribute(
      describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest
  ): Either[Throwable, DescribeFpgaImageAttributeResponse] =
    underlying.describeFpgaImageAttribute(describeFpgaImageAttributeRequest).toEither

  override def describeFpgaImages(): Either[Throwable, DescribeFpgaImagesResponse] =
    underlying.describeFpgaImages().toEither

  override def describeFpgaImages(
      describeFpgaImagesRequest: DescribeFpgaImagesRequest
  ): Either[Throwable, DescribeFpgaImagesResponse] =
    underlying.describeFpgaImages(describeFpgaImagesRequest).toEither

  def describeFpgaImagesPaginator(): DescribeFpgaImagesIterable =
    underlying.describeFpgaImagesPaginator()

  def describeFpgaImagesPaginator(describeFpgaImagesRequest: DescribeFpgaImagesRequest): DescribeFpgaImagesIterable =
    underlying.describeFpgaImagesPaginator(describeFpgaImagesRequest)

  override def describeHostReservationOfferings(): Either[Throwable, DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings().toEither

  override def describeHostReservationOfferings(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): Either[Throwable, DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest).toEither

  def describeHostReservationOfferingsPaginator(): DescribeHostReservationOfferingsIterable =
    underlying.describeHostReservationOfferingsPaginator()

  def describeHostReservationOfferingsPaginator(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): DescribeHostReservationOfferingsIterable =
    underlying.describeHostReservationOfferingsPaginator(describeHostReservationOfferingsRequest)

  override def describeHostReservations(): Either[Throwable, DescribeHostReservationsResponse] =
    underlying.describeHostReservations().toEither

  override def describeHostReservations(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): Either[Throwable, DescribeHostReservationsResponse] =
    underlying.describeHostReservations(describeHostReservationsRequest).toEither

  def describeHostReservationsPaginator(): DescribeHostReservationsIterable =
    underlying.describeHostReservationsPaginator()

  def describeHostReservationsPaginator(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): DescribeHostReservationsIterable =
    underlying.describeHostReservationsPaginator(describeHostReservationsRequest)

  override def describeHosts(): Either[Throwable, DescribeHostsResponse] =
    underlying.describeHosts().toEither

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): Either[Throwable, DescribeHostsResponse] =
    underlying.describeHosts(describeHostsRequest).toEither

  def describeHostsPaginator(): DescribeHostsIterable =
    underlying.describeHostsPaginator()

  def describeHostsPaginator(describeHostsRequest: DescribeHostsRequest): DescribeHostsIterable =
    underlying.describeHostsPaginator(describeHostsRequest)

  override def describeIamInstanceProfileAssociations()
      : Either[Throwable, DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations().toEither

  override def describeIamInstanceProfileAssociations(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): Either[Throwable, DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest).toEither

  def describeIamInstanceProfileAssociationsPaginator(): DescribeIamInstanceProfileAssociationsIterable =
    underlying.describeIamInstanceProfileAssociationsPaginator()

  def describeIamInstanceProfileAssociationsPaginator(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): DescribeIamInstanceProfileAssociationsIterable =
    underlying.describeIamInstanceProfileAssociationsPaginator(describeIamInstanceProfileAssociationsRequest)

  override def describeIdFormat(): Either[Throwable, DescribeIdFormatResponse] =
    underlying.describeIdFormat().toEither

  override def describeIdFormat(
      describeIdFormatRequest: DescribeIdFormatRequest
  ): Either[Throwable, DescribeIdFormatResponse] =
    underlying.describeIdFormat(describeIdFormatRequest).toEither

  override def describeIdentityIdFormat(
      describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest
  ): Either[Throwable, DescribeIdentityIdFormatResponse] =
    underlying.describeIdentityIdFormat(describeIdentityIdFormatRequest).toEither

  override def describeImageAttribute(
      describeImageAttributeRequest: DescribeImageAttributeRequest
  ): Either[Throwable, DescribeImageAttributeResponse] =
    underlying.describeImageAttribute(describeImageAttributeRequest).toEither

  override def describeImages(): Either[Throwable, DescribeImagesResponse] =
    underlying.describeImages().toEither

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Either[Throwable, DescribeImagesResponse] =
    underlying.describeImages(describeImagesRequest).toEither

  override def describeImportImageTasks(): Either[Throwable, DescribeImportImageTasksResponse] =
    underlying.describeImportImageTasks().toEither

  override def describeImportImageTasks(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): Either[Throwable, DescribeImportImageTasksResponse] =
    underlying.describeImportImageTasks(describeImportImageTasksRequest).toEither

  def describeImportImageTasksPaginator(): DescribeImportImageTasksIterable =
    underlying.describeImportImageTasksPaginator()

  def describeImportImageTasksPaginator(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): DescribeImportImageTasksIterable =
    underlying.describeImportImageTasksPaginator(describeImportImageTasksRequest)

  override def describeImportSnapshotTasks(): Either[Throwable, DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks().toEither

  override def describeImportSnapshotTasks(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): Either[Throwable, DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest).toEither

  def describeImportSnapshotTasksPaginator(): DescribeImportSnapshotTasksIterable =
    underlying.describeImportSnapshotTasksPaginator()

  def describeImportSnapshotTasksPaginator(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): DescribeImportSnapshotTasksIterable =
    underlying.describeImportSnapshotTasksPaginator(describeImportSnapshotTasksRequest)

  override def describeInstanceAttribute(
      describeInstanceAttributeRequest: DescribeInstanceAttributeRequest
  ): Either[Throwable, DescribeInstanceAttributeResponse] =
    underlying.describeInstanceAttribute(describeInstanceAttributeRequest).toEither

  override def describeInstanceCreditSpecifications(): Either[Throwable, DescribeInstanceCreditSpecificationsResponse] =
    underlying.describeInstanceCreditSpecifications().toEither

  override def describeInstanceCreditSpecifications(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): Either[Throwable, DescribeInstanceCreditSpecificationsResponse] =
    underlying.describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest).toEither

  def describeInstanceCreditSpecificationsPaginator(): DescribeInstanceCreditSpecificationsIterable =
    underlying.describeInstanceCreditSpecificationsPaginator()

  def describeInstanceCreditSpecificationsPaginator(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): DescribeInstanceCreditSpecificationsIterable =
    underlying.describeInstanceCreditSpecificationsPaginator(describeInstanceCreditSpecificationsRequest)

  override def describeInstanceEventNotificationAttributes(
      describeInstanceEventNotificationAttributesRequest: DescribeInstanceEventNotificationAttributesRequest
  ): Either[Throwable, DescribeInstanceEventNotificationAttributesResponse] =
    underlying.describeInstanceEventNotificationAttributes(describeInstanceEventNotificationAttributesRequest).toEither

  override def describeInstanceStatus(): Either[Throwable, DescribeInstanceStatusResponse] =
    underlying.describeInstanceStatus().toEither

  override def describeInstanceStatus(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): Either[Throwable, DescribeInstanceStatusResponse] =
    underlying.describeInstanceStatus(describeInstanceStatusRequest).toEither

  def describeInstanceStatusPaginator(): DescribeInstanceStatusIterable =
    underlying.describeInstanceStatusPaginator()

  def describeInstanceStatusPaginator(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): DescribeInstanceStatusIterable =
    underlying.describeInstanceStatusPaginator(describeInstanceStatusRequest)

  override def describeInstanceTypeOfferings(
      describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest
  ): Either[Throwable, DescribeInstanceTypeOfferingsResponse] =
    underlying.describeInstanceTypeOfferings(describeInstanceTypeOfferingsRequest).toEither

  def describeInstanceTypeOfferingsPaginator(
      describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest
  ): DescribeInstanceTypeOfferingsIterable =
    underlying.describeInstanceTypeOfferingsPaginator(describeInstanceTypeOfferingsRequest)

  override def describeInstanceTypes(
      describeInstanceTypesRequest: DescribeInstanceTypesRequest
  ): Either[Throwable, DescribeInstanceTypesResponse] =
    underlying.describeInstanceTypes(describeInstanceTypesRequest).toEither

  def describeInstanceTypesPaginator(
      describeInstanceTypesRequest: DescribeInstanceTypesRequest
  ): DescribeInstanceTypesIterable =
    underlying.describeInstanceTypesPaginator(describeInstanceTypesRequest)

  override def describeInstances(): Either[Throwable, DescribeInstancesResponse] =
    underlying.describeInstances().toEither

  override def describeInstances(
      describeInstancesRequest: DescribeInstancesRequest
  ): Either[Throwable, DescribeInstancesResponse] =
    underlying.describeInstances(describeInstancesRequest).toEither

  def describeInstancesPaginator(): DescribeInstancesIterable =
    underlying.describeInstancesPaginator()

  def describeInstancesPaginator(describeInstancesRequest: DescribeInstancesRequest): DescribeInstancesIterable =
    underlying.describeInstancesPaginator(describeInstancesRequest)

  override def describeInternetGateways(): Either[Throwable, DescribeInternetGatewaysResponse] =
    underlying.describeInternetGateways().toEither

  override def describeInternetGateways(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): Either[Throwable, DescribeInternetGatewaysResponse] =
    underlying.describeInternetGateways(describeInternetGatewaysRequest).toEither

  def describeInternetGatewaysPaginator(): DescribeInternetGatewaysIterable =
    underlying.describeInternetGatewaysPaginator()

  def describeInternetGatewaysPaginator(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): DescribeInternetGatewaysIterable =
    underlying.describeInternetGatewaysPaginator(describeInternetGatewaysRequest)

  override def describeIpv6Pools(
      describeIpv6PoolsRequest: DescribeIpv6PoolsRequest
  ): Either[Throwable, DescribeIpv6PoolsResponse] =
    underlying.describeIpv6Pools(describeIpv6PoolsRequest).toEither

  def describeIpv6PoolsPaginator(describeIpv6PoolsRequest: DescribeIpv6PoolsRequest): DescribeIpv6PoolsIterable =
    underlying.describeIpv6PoolsPaginator(describeIpv6PoolsRequest)

  override def describeKeyPairs(): Either[Throwable, DescribeKeyPairsResponse] =
    underlying.describeKeyPairs().toEither

  override def describeKeyPairs(
      describeKeyPairsRequest: DescribeKeyPairsRequest
  ): Either[Throwable, DescribeKeyPairsResponse] =
    underlying.describeKeyPairs(describeKeyPairsRequest).toEither

  override def describeLaunchTemplateVersions(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): Either[Throwable, DescribeLaunchTemplateVersionsResponse] =
    underlying.describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest).toEither

  def describeLaunchTemplateVersionsPaginator(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): DescribeLaunchTemplateVersionsIterable =
    underlying.describeLaunchTemplateVersionsPaginator(describeLaunchTemplateVersionsRequest)

  override def describeLaunchTemplates(): Either[Throwable, DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates().toEither

  override def describeLaunchTemplates(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): Either[Throwable, DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates(describeLaunchTemplatesRequest).toEither

  def describeLaunchTemplatesPaginator(): DescribeLaunchTemplatesIterable =
    underlying.describeLaunchTemplatesPaginator()

  def describeLaunchTemplatesPaginator(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): DescribeLaunchTemplatesIterable =
    underlying.describeLaunchTemplatesPaginator(describeLaunchTemplatesRequest)

  override def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): Either[Throwable, DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse] =
    underlying
      .describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
        describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
      ).toEither

  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsPaginator(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsIterable =
    underlying.describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsPaginator(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
    )

  override def describeLocalGatewayRouteTableVpcAssociations(
      describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): Either[Throwable, DescribeLocalGatewayRouteTableVpcAssociationsResponse] =
    underlying
      .describeLocalGatewayRouteTableVpcAssociations(describeLocalGatewayRouteTableVpcAssociationsRequest).toEither

  def describeLocalGatewayRouteTableVpcAssociationsPaginator(
      describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): DescribeLocalGatewayRouteTableVpcAssociationsIterable =
    underlying.describeLocalGatewayRouteTableVpcAssociationsPaginator(
      describeLocalGatewayRouteTableVpcAssociationsRequest
    )

  override def describeLocalGatewayRouteTables(
      describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest
  ): Either[Throwable, DescribeLocalGatewayRouteTablesResponse] =
    underlying.describeLocalGatewayRouteTables(describeLocalGatewayRouteTablesRequest).toEither

  def describeLocalGatewayRouteTablesPaginator(
      describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest
  ): DescribeLocalGatewayRouteTablesIterable =
    underlying.describeLocalGatewayRouteTablesPaginator(describeLocalGatewayRouteTablesRequest)

  override def describeLocalGatewayVirtualInterfaceGroups(
      describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): Either[Throwable, DescribeLocalGatewayVirtualInterfaceGroupsResponse] =
    underlying.describeLocalGatewayVirtualInterfaceGroups(describeLocalGatewayVirtualInterfaceGroupsRequest).toEither

  def describeLocalGatewayVirtualInterfaceGroupsPaginator(
      describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): DescribeLocalGatewayVirtualInterfaceGroupsIterable =
    underlying.describeLocalGatewayVirtualInterfaceGroupsPaginator(describeLocalGatewayVirtualInterfaceGroupsRequest)

  override def describeLocalGatewayVirtualInterfaces(
      describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest
  ): Either[Throwable, DescribeLocalGatewayVirtualInterfacesResponse] =
    underlying.describeLocalGatewayVirtualInterfaces(describeLocalGatewayVirtualInterfacesRequest).toEither

  def describeLocalGatewayVirtualInterfacesPaginator(
      describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest
  ): DescribeLocalGatewayVirtualInterfacesIterable =
    underlying.describeLocalGatewayVirtualInterfacesPaginator(describeLocalGatewayVirtualInterfacesRequest)

  override def describeLocalGateways(
      describeLocalGatewaysRequest: DescribeLocalGatewaysRequest
  ): Either[Throwable, DescribeLocalGatewaysResponse] =
    underlying.describeLocalGateways(describeLocalGatewaysRequest).toEither

  def describeLocalGatewaysPaginator(
      describeLocalGatewaysRequest: DescribeLocalGatewaysRequest
  ): DescribeLocalGatewaysIterable =
    underlying.describeLocalGatewaysPaginator(describeLocalGatewaysRequest)

  override def describeManagedPrefixLists(
      describeManagedPrefixListsRequest: DescribeManagedPrefixListsRequest
  ): Either[Throwable, DescribeManagedPrefixListsResponse] =
    underlying.describeManagedPrefixLists(describeManagedPrefixListsRequest).toEither

  def describeManagedPrefixListsPaginator(
      describeManagedPrefixListsRequest: DescribeManagedPrefixListsRequest
  ): DescribeManagedPrefixListsIterable =
    underlying.describeManagedPrefixListsPaginator(describeManagedPrefixListsRequest)

  override def describeMovingAddresses(): Either[Throwable, DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses().toEither

  override def describeMovingAddresses(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): Either[Throwable, DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses(describeMovingAddressesRequest).toEither

  def describeMovingAddressesPaginator(): DescribeMovingAddressesIterable =
    underlying.describeMovingAddressesPaginator()

  def describeMovingAddressesPaginator(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): DescribeMovingAddressesIterable =
    underlying.describeMovingAddressesPaginator(describeMovingAddressesRequest)

  override def describeNatGateways(): Either[Throwable, DescribeNatGatewaysResponse] =
    underlying.describeNatGateways().toEither

  override def describeNatGateways(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): Either[Throwable, DescribeNatGatewaysResponse] =
    underlying.describeNatGateways(describeNatGatewaysRequest).toEither

  def describeNatGatewaysPaginator(): DescribeNatGatewaysIterable =
    underlying.describeNatGatewaysPaginator()

  def describeNatGatewaysPaginator(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): DescribeNatGatewaysIterable =
    underlying.describeNatGatewaysPaginator(describeNatGatewaysRequest)

  override def describeNetworkAcls(): Either[Throwable, DescribeNetworkAclsResponse] =
    underlying.describeNetworkAcls().toEither

  override def describeNetworkAcls(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): Either[Throwable, DescribeNetworkAclsResponse] =
    underlying.describeNetworkAcls(describeNetworkAclsRequest).toEither

  def describeNetworkAclsPaginator(): DescribeNetworkAclsIterable =
    underlying.describeNetworkAclsPaginator()

  def describeNetworkAclsPaginator(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): DescribeNetworkAclsIterable =
    underlying.describeNetworkAclsPaginator(describeNetworkAclsRequest)

  override def describeNetworkInterfaceAttribute(
      describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest
  ): Either[Throwable, DescribeNetworkInterfaceAttributeResponse] =
    underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest).toEither

  override def describeNetworkInterfacePermissions(): Either[Throwable, DescribeNetworkInterfacePermissionsResponse] =
    underlying.describeNetworkInterfacePermissions().toEither

  override def describeNetworkInterfacePermissions(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): Either[Throwable, DescribeNetworkInterfacePermissionsResponse] =
    underlying.describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest).toEither

  def describeNetworkInterfacePermissionsPaginator(): DescribeNetworkInterfacePermissionsIterable =
    underlying.describeNetworkInterfacePermissionsPaginator()

  def describeNetworkInterfacePermissionsPaginator(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): DescribeNetworkInterfacePermissionsIterable =
    underlying.describeNetworkInterfacePermissionsPaginator(describeNetworkInterfacePermissionsRequest)

  override def describeNetworkInterfaces(): Either[Throwable, DescribeNetworkInterfacesResponse] =
    underlying.describeNetworkInterfaces().toEither

  override def describeNetworkInterfaces(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): Either[Throwable, DescribeNetworkInterfacesResponse] =
    underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest).toEither

  def describeNetworkInterfacesPaginator(): DescribeNetworkInterfacesIterable =
    underlying.describeNetworkInterfacesPaginator()

  def describeNetworkInterfacesPaginator(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): DescribeNetworkInterfacesIterable =
    underlying.describeNetworkInterfacesPaginator(describeNetworkInterfacesRequest)

  override def describePlacementGroups(): Either[Throwable, DescribePlacementGroupsResponse] =
    underlying.describePlacementGroups().toEither

  override def describePlacementGroups(
      describePlacementGroupsRequest: DescribePlacementGroupsRequest
  ): Either[Throwable, DescribePlacementGroupsResponse] =
    underlying.describePlacementGroups(describePlacementGroupsRequest).toEither

  override def describePrefixLists(): Either[Throwable, DescribePrefixListsResponse] =
    underlying.describePrefixLists().toEither

  override def describePrefixLists(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): Either[Throwable, DescribePrefixListsResponse] =
    underlying.describePrefixLists(describePrefixListsRequest).toEither

  def describePrefixListsPaginator(): DescribePrefixListsIterable =
    underlying.describePrefixListsPaginator()

  def describePrefixListsPaginator(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): DescribePrefixListsIterable =
    underlying.describePrefixListsPaginator(describePrefixListsRequest)

  override def describePrincipalIdFormat(): Either[Throwable, DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat().toEither

  override def describePrincipalIdFormat(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): Either[Throwable, DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest).toEither

  def describePrincipalIdFormatPaginator(): DescribePrincipalIdFormatIterable =
    underlying.describePrincipalIdFormatPaginator()

  def describePrincipalIdFormatPaginator(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): DescribePrincipalIdFormatIterable =
    underlying.describePrincipalIdFormatPaginator(describePrincipalIdFormatRequest)

  override def describePublicIpv4Pools(): Either[Throwable, DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools().toEither

  override def describePublicIpv4Pools(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): Either[Throwable, DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest).toEither

  def describePublicIpv4PoolsPaginator(): DescribePublicIpv4PoolsIterable =
    underlying.describePublicIpv4PoolsPaginator()

  def describePublicIpv4PoolsPaginator(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): DescribePublicIpv4PoolsIterable =
    underlying.describePublicIpv4PoolsPaginator(describePublicIpv4PoolsRequest)

  override def describeRegions(): Either[Throwable, DescribeRegionsResponse] =
    underlying.describeRegions().toEither

  override def describeRegions(
      describeRegionsRequest: DescribeRegionsRequest
  ): Either[Throwable, DescribeRegionsResponse] =
    underlying.describeRegions(describeRegionsRequest).toEither

  override def describeReservedInstances(): Either[Throwable, DescribeReservedInstancesResponse] =
    underlying.describeReservedInstances().toEither

  override def describeReservedInstances(
      describeReservedInstancesRequest: DescribeReservedInstancesRequest
  ): Either[Throwable, DescribeReservedInstancesResponse] =
    underlying.describeReservedInstances(describeReservedInstancesRequest).toEither

  override def describeReservedInstancesListings(): Either[Throwable, DescribeReservedInstancesListingsResponse] =
    underlying.describeReservedInstancesListings().toEither

  override def describeReservedInstancesListings(
      describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest
  ): Either[Throwable, DescribeReservedInstancesListingsResponse] =
    underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest).toEither

  override def describeReservedInstancesModifications()
      : Either[Throwable, DescribeReservedInstancesModificationsResponse] =
    underlying.describeReservedInstancesModifications().toEither

  override def describeReservedInstancesModifications(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): Either[Throwable, DescribeReservedInstancesModificationsResponse] =
    underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest).toEither

  def describeReservedInstancesModificationsPaginator(): DescribeReservedInstancesModificationsIterable =
    underlying.describeReservedInstancesModificationsPaginator()

  def describeReservedInstancesModificationsPaginator(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): DescribeReservedInstancesModificationsIterable =
    underlying.describeReservedInstancesModificationsPaginator(describeReservedInstancesModificationsRequest)

  override def describeReservedInstancesOfferings(): Either[Throwable, DescribeReservedInstancesOfferingsResponse] =
    underlying.describeReservedInstancesOfferings().toEither

  override def describeReservedInstancesOfferings(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): Either[Throwable, DescribeReservedInstancesOfferingsResponse] =
    underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest).toEither

  def describeReservedInstancesOfferingsPaginator(): DescribeReservedInstancesOfferingsIterable =
    underlying.describeReservedInstancesOfferingsPaginator()

  def describeReservedInstancesOfferingsPaginator(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): DescribeReservedInstancesOfferingsIterable =
    underlying.describeReservedInstancesOfferingsPaginator(describeReservedInstancesOfferingsRequest)

  override def describeRouteTables(): Either[Throwable, DescribeRouteTablesResponse] =
    underlying.describeRouteTables().toEither

  override def describeRouteTables(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): Either[Throwable, DescribeRouteTablesResponse] =
    underlying.describeRouteTables(describeRouteTablesRequest).toEither

  def describeRouteTablesPaginator(): DescribeRouteTablesIterable =
    underlying.describeRouteTablesPaginator()

  def describeRouteTablesPaginator(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): DescribeRouteTablesIterable =
    underlying.describeRouteTablesPaginator(describeRouteTablesRequest)

  override def describeScheduledInstanceAvailability(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): Either[Throwable, DescribeScheduledInstanceAvailabilityResponse] =
    underlying.describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest).toEither

  def describeScheduledInstanceAvailabilityPaginator(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): DescribeScheduledInstanceAvailabilityIterable =
    underlying.describeScheduledInstanceAvailabilityPaginator(describeScheduledInstanceAvailabilityRequest)

  override def describeScheduledInstances(): Either[Throwable, DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances().toEither

  override def describeScheduledInstances(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): Either[Throwable, DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances(describeScheduledInstancesRequest).toEither

  def describeScheduledInstancesPaginator(): DescribeScheduledInstancesIterable =
    underlying.describeScheduledInstancesPaginator()

  def describeScheduledInstancesPaginator(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): DescribeScheduledInstancesIterable =
    underlying.describeScheduledInstancesPaginator(describeScheduledInstancesRequest)

  override def describeSecurityGroupReferences(
      describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest
  ): Either[Throwable, DescribeSecurityGroupReferencesResponse] =
    underlying.describeSecurityGroupReferences(describeSecurityGroupReferencesRequest).toEither

  override def describeSecurityGroups(): Either[Throwable, DescribeSecurityGroupsResponse] =
    underlying.describeSecurityGroups().toEither

  override def describeSecurityGroups(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): Either[Throwable, DescribeSecurityGroupsResponse] =
    underlying.describeSecurityGroups(describeSecurityGroupsRequest).toEither

  def describeSecurityGroupsPaginator(): DescribeSecurityGroupsIterable =
    underlying.describeSecurityGroupsPaginator()

  def describeSecurityGroupsPaginator(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): DescribeSecurityGroupsIterable =
    underlying.describeSecurityGroupsPaginator(describeSecurityGroupsRequest)

  override def describeSnapshotAttribute(
      describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest
  ): Either[Throwable, DescribeSnapshotAttributeResponse] =
    underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest).toEither

  override def describeSnapshots(): Either[Throwable, DescribeSnapshotsResponse] =
    underlying.describeSnapshots().toEither

  override def describeSnapshots(
      describeSnapshotsRequest: DescribeSnapshotsRequest
  ): Either[Throwable, DescribeSnapshotsResponse] =
    underlying.describeSnapshots(describeSnapshotsRequest).toEither

  def describeSnapshotsPaginator(): DescribeSnapshotsIterable =
    underlying.describeSnapshotsPaginator()

  def describeSnapshotsPaginator(describeSnapshotsRequest: DescribeSnapshotsRequest): DescribeSnapshotsIterable =
    underlying.describeSnapshotsPaginator(describeSnapshotsRequest)

  override def describeSpotDatafeedSubscription(): Either[Throwable, DescribeSpotDatafeedSubscriptionResponse] =
    underlying.describeSpotDatafeedSubscription().toEither

  override def describeSpotDatafeedSubscription(
      describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest
  ): Either[Throwable, DescribeSpotDatafeedSubscriptionResponse] =
    underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest).toEither

  override def describeSpotFleetInstances(
      describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest
  ): Either[Throwable, DescribeSpotFleetInstancesResponse] =
    underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest).toEither

  override def describeSpotFleetRequestHistory(
      describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest
  ): Either[Throwable, DescribeSpotFleetRequestHistoryResponse] =
    underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest).toEither

  override def describeSpotFleetRequests(): Either[Throwable, DescribeSpotFleetRequestsResponse] =
    underlying.describeSpotFleetRequests().toEither

  override def describeSpotFleetRequests(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): Either[Throwable, DescribeSpotFleetRequestsResponse] =
    underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest).toEither

  def describeSpotFleetRequestsPaginator(): DescribeSpotFleetRequestsIterable =
    underlying.describeSpotFleetRequestsPaginator()

  def describeSpotFleetRequestsPaginator(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): DescribeSpotFleetRequestsIterable =
    underlying.describeSpotFleetRequestsPaginator(describeSpotFleetRequestsRequest)

  override def describeSpotInstanceRequests(): Either[Throwable, DescribeSpotInstanceRequestsResponse] =
    underlying.describeSpotInstanceRequests().toEither

  override def describeSpotInstanceRequests(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): Either[Throwable, DescribeSpotInstanceRequestsResponse] =
    underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest).toEither

  def describeSpotInstanceRequestsPaginator(): DescribeSpotInstanceRequestsIterable =
    underlying.describeSpotInstanceRequestsPaginator()

  def describeSpotInstanceRequestsPaginator(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): DescribeSpotInstanceRequestsIterable =
    underlying.describeSpotInstanceRequestsPaginator(describeSpotInstanceRequestsRequest)

  override def describeSpotPriceHistory(): Either[Throwable, DescribeSpotPriceHistoryResponse] =
    underlying.describeSpotPriceHistory().toEither

  override def describeSpotPriceHistory(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): Either[Throwable, DescribeSpotPriceHistoryResponse] =
    underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest).toEither

  def describeSpotPriceHistoryPaginator(): DescribeSpotPriceHistoryIterable =
    underlying.describeSpotPriceHistoryPaginator()

  def describeSpotPriceHistoryPaginator(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): DescribeSpotPriceHistoryIterable =
    underlying.describeSpotPriceHistoryPaginator(describeSpotPriceHistoryRequest)

  override def describeStaleSecurityGroups(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): Either[Throwable, DescribeStaleSecurityGroupsResponse] =
    underlying.describeStaleSecurityGroups(describeStaleSecurityGroupsRequest).toEither

  def describeStaleSecurityGroupsPaginator(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): DescribeStaleSecurityGroupsIterable =
    underlying.describeStaleSecurityGroupsPaginator(describeStaleSecurityGroupsRequest)

  override def describeSubnets(): Either[Throwable, DescribeSubnetsResponse] =
    underlying.describeSubnets().toEither

  override def describeSubnets(
      describeSubnetsRequest: DescribeSubnetsRequest
  ): Either[Throwable, DescribeSubnetsResponse] =
    underlying.describeSubnets(describeSubnetsRequest).toEither

  def describeSubnetsPaginator(): DescribeSubnetsIterable =
    underlying.describeSubnetsPaginator()

  def describeSubnetsPaginator(describeSubnetsRequest: DescribeSubnetsRequest): DescribeSubnetsIterable =
    underlying.describeSubnetsPaginator(describeSubnetsRequest)

  override def describeTags(): Either[Throwable, DescribeTagsResponse] =
    underlying.describeTags().toEither

  override def describeTags(describeTagsRequest: DescribeTagsRequest): Either[Throwable, DescribeTagsResponse] =
    underlying.describeTags(describeTagsRequest).toEither

  def describeTagsPaginator(): DescribeTagsIterable =
    underlying.describeTagsPaginator()

  def describeTagsPaginator(describeTagsRequest: DescribeTagsRequest): DescribeTagsIterable =
    underlying.describeTagsPaginator(describeTagsRequest)

  override def describeTrafficMirrorFilters(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): Either[Throwable, DescribeTrafficMirrorFiltersResponse] =
    underlying.describeTrafficMirrorFilters(describeTrafficMirrorFiltersRequest).toEither

  def describeTrafficMirrorFiltersPaginator(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): DescribeTrafficMirrorFiltersIterable =
    underlying.describeTrafficMirrorFiltersPaginator(describeTrafficMirrorFiltersRequest)

  override def describeTrafficMirrorSessions(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): Either[Throwable, DescribeTrafficMirrorSessionsResponse] =
    underlying.describeTrafficMirrorSessions(describeTrafficMirrorSessionsRequest).toEither

  def describeTrafficMirrorSessionsPaginator(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): DescribeTrafficMirrorSessionsIterable =
    underlying.describeTrafficMirrorSessionsPaginator(describeTrafficMirrorSessionsRequest)

  override def describeTrafficMirrorTargets(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): Either[Throwable, DescribeTrafficMirrorTargetsResponse] =
    underlying.describeTrafficMirrorTargets(describeTrafficMirrorTargetsRequest).toEither

  def describeTrafficMirrorTargetsPaginator(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): DescribeTrafficMirrorTargetsIterable =
    underlying.describeTrafficMirrorTargetsPaginator(describeTrafficMirrorTargetsRequest)

  override def describeTransitGatewayAttachments(): Either[Throwable, DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments().toEither

  override def describeTransitGatewayAttachments(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): Either[Throwable, DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest).toEither

  def describeTransitGatewayAttachmentsPaginator(): DescribeTransitGatewayAttachmentsIterable =
    underlying.describeTransitGatewayAttachmentsPaginator()

  def describeTransitGatewayAttachmentsPaginator(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): DescribeTransitGatewayAttachmentsIterable =
    underlying.describeTransitGatewayAttachmentsPaginator(describeTransitGatewayAttachmentsRequest)

  override def describeTransitGatewayMulticastDomains(
      describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest
  ): Either[Throwable, DescribeTransitGatewayMulticastDomainsResponse] =
    underlying.describeTransitGatewayMulticastDomains(describeTransitGatewayMulticastDomainsRequest).toEither

  def describeTransitGatewayMulticastDomainsPaginator(
      describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest
  ): DescribeTransitGatewayMulticastDomainsIterable =
    underlying.describeTransitGatewayMulticastDomainsPaginator(describeTransitGatewayMulticastDomainsRequest)

  override def describeTransitGatewayPeeringAttachments(
      describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest
  ): Either[Throwable, DescribeTransitGatewayPeeringAttachmentsResponse] =
    underlying.describeTransitGatewayPeeringAttachments(describeTransitGatewayPeeringAttachmentsRequest).toEither

  def describeTransitGatewayPeeringAttachmentsPaginator(
      describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest
  ): DescribeTransitGatewayPeeringAttachmentsIterable =
    underlying.describeTransitGatewayPeeringAttachmentsPaginator(describeTransitGatewayPeeringAttachmentsRequest)

  override def describeTransitGatewayRouteTables(): Either[Throwable, DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables().toEither

  override def describeTransitGatewayRouteTables(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): Either[Throwable, DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest).toEither

  def describeTransitGatewayRouteTablesPaginator(): DescribeTransitGatewayRouteTablesIterable =
    underlying.describeTransitGatewayRouteTablesPaginator()

  def describeTransitGatewayRouteTablesPaginator(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): DescribeTransitGatewayRouteTablesIterable =
    underlying.describeTransitGatewayRouteTablesPaginator(describeTransitGatewayRouteTablesRequest)

  override def describeTransitGatewayVpcAttachments(): Either[Throwable, DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments().toEither

  override def describeTransitGatewayVpcAttachments(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): Either[Throwable, DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest).toEither

  def describeTransitGatewayVpcAttachmentsPaginator(): DescribeTransitGatewayVpcAttachmentsIterable =
    underlying.describeTransitGatewayVpcAttachmentsPaginator()

  def describeTransitGatewayVpcAttachmentsPaginator(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): DescribeTransitGatewayVpcAttachmentsIterable =
    underlying.describeTransitGatewayVpcAttachmentsPaginator(describeTransitGatewayVpcAttachmentsRequest)

  override def describeTransitGateways(): Either[Throwable, DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways().toEither

  override def describeTransitGateways(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): Either[Throwable, DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways(describeTransitGatewaysRequest).toEither

  def describeTransitGatewaysPaginator(): DescribeTransitGatewaysIterable =
    underlying.describeTransitGatewaysPaginator()

  def describeTransitGatewaysPaginator(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): DescribeTransitGatewaysIterable =
    underlying.describeTransitGatewaysPaginator(describeTransitGatewaysRequest)

  override def describeVolumeAttribute(
      describeVolumeAttributeRequest: DescribeVolumeAttributeRequest
  ): Either[Throwable, DescribeVolumeAttributeResponse] =
    underlying.describeVolumeAttribute(describeVolumeAttributeRequest).toEither

  override def describeVolumeStatus(): Either[Throwable, DescribeVolumeStatusResponse] =
    underlying.describeVolumeStatus().toEither

  override def describeVolumeStatus(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): Either[Throwable, DescribeVolumeStatusResponse] =
    underlying.describeVolumeStatus(describeVolumeStatusRequest).toEither

  def describeVolumeStatusPaginator(): DescribeVolumeStatusIterable =
    underlying.describeVolumeStatusPaginator()

  def describeVolumeStatusPaginator(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): DescribeVolumeStatusIterable =
    underlying.describeVolumeStatusPaginator(describeVolumeStatusRequest)

  override def describeVolumes(): Either[Throwable, DescribeVolumesResponse] =
    underlying.describeVolumes().toEither

  override def describeVolumes(
      describeVolumesRequest: DescribeVolumesRequest
  ): Either[Throwable, DescribeVolumesResponse] =
    underlying.describeVolumes(describeVolumesRequest).toEither

  def describeVolumesPaginator(): DescribeVolumesIterable =
    underlying.describeVolumesPaginator()

  def describeVolumesPaginator(describeVolumesRequest: DescribeVolumesRequest): DescribeVolumesIterable =
    underlying.describeVolumesPaginator(describeVolumesRequest)

  override def describeVolumesModifications(): Either[Throwable, DescribeVolumesModificationsResponse] =
    underlying.describeVolumesModifications().toEither

  override def describeVolumesModifications(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): Either[Throwable, DescribeVolumesModificationsResponse] =
    underlying.describeVolumesModifications(describeVolumesModificationsRequest).toEither

  def describeVolumesModificationsPaginator(): DescribeVolumesModificationsIterable =
    underlying.describeVolumesModificationsPaginator()

  def describeVolumesModificationsPaginator(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): DescribeVolumesModificationsIterable =
    underlying.describeVolumesModificationsPaginator(describeVolumesModificationsRequest)

  override def describeVpcAttribute(
      describeVpcAttributeRequest: DescribeVpcAttributeRequest
  ): Either[Throwable, DescribeVpcAttributeResponse] =
    underlying.describeVpcAttribute(describeVpcAttributeRequest).toEither

  override def describeVpcClassicLink(): Either[Throwable, DescribeVpcClassicLinkResponse] =
    underlying.describeVpcClassicLink().toEither

  override def describeVpcClassicLink(
      describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest
  ): Either[Throwable, DescribeVpcClassicLinkResponse] =
    underlying.describeVpcClassicLink(describeVpcClassicLinkRequest).toEither

  override def describeVpcClassicLinkDnsSupport(): Either[Throwable, DescribeVpcClassicLinkDnsSupportResponse] =
    underlying.describeVpcClassicLinkDnsSupport().toEither

  override def describeVpcClassicLinkDnsSupport(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): Either[Throwable, DescribeVpcClassicLinkDnsSupportResponse] =
    underlying.describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest).toEither

  def describeVpcClassicLinkDnsSupportPaginator(): DescribeVpcClassicLinkDnsSupportIterable =
    underlying.describeVpcClassicLinkDnsSupportPaginator()

  def describeVpcClassicLinkDnsSupportPaginator(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): DescribeVpcClassicLinkDnsSupportIterable =
    underlying.describeVpcClassicLinkDnsSupportPaginator(describeVpcClassicLinkDnsSupportRequest)

  override def describeVpcEndpointConnectionNotifications()
      : Either[Throwable, DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications().toEither

  override def describeVpcEndpointConnectionNotifications(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): Either[Throwable, DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest).toEither

  def describeVpcEndpointConnectionNotificationsPaginator(): DescribeVpcEndpointConnectionNotificationsIterable =
    underlying.describeVpcEndpointConnectionNotificationsPaginator()

  def describeVpcEndpointConnectionNotificationsPaginator(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): DescribeVpcEndpointConnectionNotificationsIterable =
    underlying.describeVpcEndpointConnectionNotificationsPaginator(describeVpcEndpointConnectionNotificationsRequest)

  override def describeVpcEndpointConnections(): Either[Throwable, DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections().toEither

  override def describeVpcEndpointConnections(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): Either[Throwable, DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest).toEither

  def describeVpcEndpointConnectionsPaginator(): DescribeVpcEndpointConnectionsIterable =
    underlying.describeVpcEndpointConnectionsPaginator()

  def describeVpcEndpointConnectionsPaginator(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): DescribeVpcEndpointConnectionsIterable =
    underlying.describeVpcEndpointConnectionsPaginator(describeVpcEndpointConnectionsRequest)

  override def describeVpcEndpointServiceConfigurations()
      : Either[Throwable, DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations().toEither

  override def describeVpcEndpointServiceConfigurations(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): Either[Throwable, DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest).toEither

  def describeVpcEndpointServiceConfigurationsPaginator(): DescribeVpcEndpointServiceConfigurationsIterable =
    underlying.describeVpcEndpointServiceConfigurationsPaginator()

  def describeVpcEndpointServiceConfigurationsPaginator(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): DescribeVpcEndpointServiceConfigurationsIterable =
    underlying.describeVpcEndpointServiceConfigurationsPaginator(describeVpcEndpointServiceConfigurationsRequest)

  override def describeVpcEndpointServicePermissions(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): Either[Throwable, DescribeVpcEndpointServicePermissionsResponse] =
    underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest).toEither

  def describeVpcEndpointServicePermissionsPaginator(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): DescribeVpcEndpointServicePermissionsIterable =
    underlying.describeVpcEndpointServicePermissionsPaginator(describeVpcEndpointServicePermissionsRequest)

  override def describeVpcEndpointServices(): Either[Throwable, DescribeVpcEndpointServicesResponse] =
    underlying.describeVpcEndpointServices().toEither

  override def describeVpcEndpointServices(
      describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest
  ): Either[Throwable, DescribeVpcEndpointServicesResponse] =
    underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest).toEither

  override def describeVpcEndpoints(): Either[Throwable, DescribeVpcEndpointsResponse] =
    underlying.describeVpcEndpoints().toEither

  override def describeVpcEndpoints(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): Either[Throwable, DescribeVpcEndpointsResponse] =
    underlying.describeVpcEndpoints(describeVpcEndpointsRequest).toEither

  def describeVpcEndpointsPaginator(): DescribeVpcEndpointsIterable =
    underlying.describeVpcEndpointsPaginator()

  def describeVpcEndpointsPaginator(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): DescribeVpcEndpointsIterable =
    underlying.describeVpcEndpointsPaginator(describeVpcEndpointsRequest)

  override def describeVpcPeeringConnections(): Either[Throwable, DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections().toEither

  override def describeVpcPeeringConnections(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): Either[Throwable, DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest).toEither

  def describeVpcPeeringConnectionsPaginator(): DescribeVpcPeeringConnectionsIterable =
    underlying.describeVpcPeeringConnectionsPaginator()

  def describeVpcPeeringConnectionsPaginator(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): DescribeVpcPeeringConnectionsIterable =
    underlying.describeVpcPeeringConnectionsPaginator(describeVpcPeeringConnectionsRequest)

  override def describeVpcs(): Either[Throwable, DescribeVpcsResponse] =
    underlying.describeVpcs().toEither

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): Either[Throwable, DescribeVpcsResponse] =
    underlying.describeVpcs(describeVpcsRequest).toEither

  def describeVpcsPaginator(): DescribeVpcsIterable =
    underlying.describeVpcsPaginator()

  def describeVpcsPaginator(describeVpcsRequest: DescribeVpcsRequest): DescribeVpcsIterable =
    underlying.describeVpcsPaginator(describeVpcsRequest)

  override def describeVpnConnections(): Either[Throwable, DescribeVpnConnectionsResponse] =
    underlying.describeVpnConnections().toEither

  override def describeVpnConnections(
      describeVpnConnectionsRequest: DescribeVpnConnectionsRequest
  ): Either[Throwable, DescribeVpnConnectionsResponse] =
    underlying.describeVpnConnections(describeVpnConnectionsRequest).toEither

  override def describeVpnGateways(): Either[Throwable, DescribeVpnGatewaysResponse] =
    underlying.describeVpnGateways().toEither

  override def describeVpnGateways(
      describeVpnGatewaysRequest: DescribeVpnGatewaysRequest
  ): Either[Throwable, DescribeVpnGatewaysResponse] =
    underlying.describeVpnGateways(describeVpnGatewaysRequest).toEither

  override def detachClassicLinkVpc(
      detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest
  ): Either[Throwable, DetachClassicLinkVpcResponse] =
    underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest).toEither

  override def detachInternetGateway(
      detachInternetGatewayRequest: DetachInternetGatewayRequest
  ): Either[Throwable, DetachInternetGatewayResponse] =
    underlying.detachInternetGateway(detachInternetGatewayRequest).toEither

  override def detachNetworkInterface(
      detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest
  ): Either[Throwable, DetachNetworkInterfaceResponse] =
    underlying.detachNetworkInterface(detachNetworkInterfaceRequest).toEither

  override def detachVolume(detachVolumeRequest: DetachVolumeRequest): Either[Throwable, DetachVolumeResponse] =
    underlying.detachVolume(detachVolumeRequest).toEither

  override def detachVpnGateway(
      detachVpnGatewayRequest: DetachVpnGatewayRequest
  ): Either[Throwable, DetachVpnGatewayResponse] =
    underlying.detachVpnGateway(detachVpnGatewayRequest).toEither

  override def disableEbsEncryptionByDefault(
      disableEbsEncryptionByDefaultRequest: DisableEbsEncryptionByDefaultRequest
  ): Either[Throwable, DisableEbsEncryptionByDefaultResponse] =
    underlying.disableEbsEncryptionByDefault(disableEbsEncryptionByDefaultRequest).toEither

  override def disableFastSnapshotRestores(
      disableFastSnapshotRestoresRequest: DisableFastSnapshotRestoresRequest
  ): Either[Throwable, DisableFastSnapshotRestoresResponse] =
    underlying.disableFastSnapshotRestores(disableFastSnapshotRestoresRequest).toEither

  override def disableTransitGatewayRouteTablePropagation(
      disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest
  ): Either[Throwable, DisableTransitGatewayRouteTablePropagationResponse] =
    underlying.disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest).toEither

  override def disableVgwRoutePropagation(
      disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest
  ): Either[Throwable, DisableVgwRoutePropagationResponse] =
    underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest).toEither

  override def disableVpcClassicLink(
      disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest
  ): Either[Throwable, DisableVpcClassicLinkResponse] =
    underlying.disableVpcClassicLink(disableVpcClassicLinkRequest).toEither

  override def disableVpcClassicLinkDnsSupport(
      disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest
  ): Either[Throwable, DisableVpcClassicLinkDnsSupportResponse] =
    underlying.disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest).toEither

  override def disassociateAddress(
      disassociateAddressRequest: DisassociateAddressRequest
  ): Either[Throwable, DisassociateAddressResponse] =
    underlying.disassociateAddress(disassociateAddressRequest).toEither

  override def disassociateClientVpnTargetNetwork(
      disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest
  ): Either[Throwable, DisassociateClientVpnTargetNetworkResponse] =
    underlying.disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest).toEither

  override def disassociateIamInstanceProfile(
      disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest
  ): Either[Throwable, DisassociateIamInstanceProfileResponse] =
    underlying.disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest).toEither

  override def disassociateRouteTable(
      disassociateRouteTableRequest: DisassociateRouteTableRequest
  ): Either[Throwable, DisassociateRouteTableResponse] =
    underlying.disassociateRouteTable(disassociateRouteTableRequest).toEither

  override def disassociateSubnetCidrBlock(
      disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest
  ): Either[Throwable, DisassociateSubnetCidrBlockResponse] =
    underlying.disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest).toEither

  override def disassociateTransitGatewayMulticastDomain(
      disassociateTransitGatewayMulticastDomainRequest: DisassociateTransitGatewayMulticastDomainRequest
  ): Either[Throwable, DisassociateTransitGatewayMulticastDomainResponse] =
    underlying.disassociateTransitGatewayMulticastDomain(disassociateTransitGatewayMulticastDomainRequest).toEither

  override def disassociateTransitGatewayRouteTable(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest
  ): Either[Throwable, DisassociateTransitGatewayRouteTableResponse] =
    underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest).toEither

  override def disassociateVpcCidrBlock(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest
  ): Either[Throwable, DisassociateVpcCidrBlockResponse] =
    underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest).toEither

  override def enableEbsEncryptionByDefault(
      enableEbsEncryptionByDefaultRequest: EnableEbsEncryptionByDefaultRequest
  ): Either[Throwable, EnableEbsEncryptionByDefaultResponse] =
    underlying.enableEbsEncryptionByDefault(enableEbsEncryptionByDefaultRequest).toEither

  override def enableFastSnapshotRestores(
      enableFastSnapshotRestoresRequest: EnableFastSnapshotRestoresRequest
  ): Either[Throwable, EnableFastSnapshotRestoresResponse] =
    underlying.enableFastSnapshotRestores(enableFastSnapshotRestoresRequest).toEither

  override def enableTransitGatewayRouteTablePropagation(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest
  ): Either[Throwable, EnableTransitGatewayRouteTablePropagationResponse] =
    underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest).toEither

  override def enableVgwRoutePropagation(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest
  ): Either[Throwable, EnableVgwRoutePropagationResponse] =
    underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest).toEither

  override def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): Either[Throwable, EnableVolumeIoResponse] =
    underlying.enableVolumeIO(enableVolumeIoRequest).toEither

  override def enableVpcClassicLink(
      enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest
  ): Either[Throwable, EnableVpcClassicLinkResponse] =
    underlying.enableVpcClassicLink(enableVpcClassicLinkRequest).toEither

  override def enableVpcClassicLinkDnsSupport(
      enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest
  ): Either[Throwable, EnableVpcClassicLinkDnsSupportResponse] =
    underlying.enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest).toEither

  override def exportClientVpnClientCertificateRevocationList(
      exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest
  ): Either[Throwable, ExportClientVpnClientCertificateRevocationListResponse] =
    underlying
      .exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest).toEither

  override def exportClientVpnClientConfiguration(
      exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest
  ): Either[Throwable, ExportClientVpnClientConfigurationResponse] =
    underlying.exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest).toEither

  override def exportImage(exportImageRequest: ExportImageRequest): Either[Throwable, ExportImageResponse] =
    underlying.exportImage(exportImageRequest).toEither

  override def exportTransitGatewayRoutes(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest
  ): Either[Throwable, ExportTransitGatewayRoutesResponse] =
    underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest).toEither

  override def getAssociatedIpv6PoolCidrs(
      getAssociatedIpv6PoolCidrsRequest: GetAssociatedIpv6PoolCidrsRequest
  ): Either[Throwable, GetAssociatedIpv6PoolCidrsResponse] =
    underlying.getAssociatedIpv6PoolCidrs(getAssociatedIpv6PoolCidrsRequest).toEither

  def getAssociatedIpv6PoolCidrsPaginator(
      getAssociatedIpv6PoolCidrsRequest: GetAssociatedIpv6PoolCidrsRequest
  ): GetAssociatedIpv6PoolCidrsIterable =
    underlying.getAssociatedIpv6PoolCidrsPaginator(getAssociatedIpv6PoolCidrsRequest)

  override def getCapacityReservationUsage(
      getCapacityReservationUsageRequest: GetCapacityReservationUsageRequest
  ): Either[Throwable, GetCapacityReservationUsageResponse] =
    underlying.getCapacityReservationUsage(getCapacityReservationUsageRequest).toEither

  override def getCoipPoolUsage(
      getCoipPoolUsageRequest: GetCoipPoolUsageRequest
  ): Either[Throwable, GetCoipPoolUsageResponse] =
    underlying.getCoipPoolUsage(getCoipPoolUsageRequest).toEither

  override def getConsoleOutput(
      getConsoleOutputRequest: GetConsoleOutputRequest
  ): Either[Throwable, GetConsoleOutputResponse] =
    underlying.getConsoleOutput(getConsoleOutputRequest).toEither

  override def getConsoleScreenshot(
      getConsoleScreenshotRequest: GetConsoleScreenshotRequest
  ): Either[Throwable, GetConsoleScreenshotResponse] =
    underlying.getConsoleScreenshot(getConsoleScreenshotRequest).toEither

  override def getDefaultCreditSpecification(
      getDefaultCreditSpecificationRequest: GetDefaultCreditSpecificationRequest
  ): Either[Throwable, GetDefaultCreditSpecificationResponse] =
    underlying.getDefaultCreditSpecification(getDefaultCreditSpecificationRequest).toEither

  override def getEbsDefaultKmsKeyId(
      getEbsDefaultKmsKeyIdRequest: GetEbsDefaultKmsKeyIdRequest
  ): Either[Throwable, GetEbsDefaultKmsKeyIdResponse] =
    underlying.getEbsDefaultKmsKeyId(getEbsDefaultKmsKeyIdRequest).toEither

  override def getEbsEncryptionByDefault(
      getEbsEncryptionByDefaultRequest: GetEbsEncryptionByDefaultRequest
  ): Either[Throwable, GetEbsEncryptionByDefaultResponse] =
    underlying.getEbsEncryptionByDefault(getEbsEncryptionByDefaultRequest).toEither

  override def getHostReservationPurchasePreview(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest
  ): Either[Throwable, GetHostReservationPurchasePreviewResponse] =
    underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest).toEither

  override def getLaunchTemplateData(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest
  ): Either[Throwable, GetLaunchTemplateDataResponse] =
    underlying.getLaunchTemplateData(getLaunchTemplateDataRequest).toEither

  override def getManagedPrefixListAssociations(
      getManagedPrefixListAssociationsRequest: GetManagedPrefixListAssociationsRequest
  ): Either[Throwable, GetManagedPrefixListAssociationsResponse] =
    underlying.getManagedPrefixListAssociations(getManagedPrefixListAssociationsRequest).toEither

  def getManagedPrefixListAssociationsPaginator(
      getManagedPrefixListAssociationsRequest: GetManagedPrefixListAssociationsRequest
  ): GetManagedPrefixListAssociationsIterable =
    underlying.getManagedPrefixListAssociationsPaginator(getManagedPrefixListAssociationsRequest)

  override def getManagedPrefixListEntries(
      getManagedPrefixListEntriesRequest: GetManagedPrefixListEntriesRequest
  ): Either[Throwable, GetManagedPrefixListEntriesResponse] =
    underlying.getManagedPrefixListEntries(getManagedPrefixListEntriesRequest).toEither

  def getManagedPrefixListEntriesPaginator(
      getManagedPrefixListEntriesRequest: GetManagedPrefixListEntriesRequest
  ): GetManagedPrefixListEntriesIterable =
    underlying.getManagedPrefixListEntriesPaginator(getManagedPrefixListEntriesRequest)

  override def getPasswordData(
      getPasswordDataRequest: GetPasswordDataRequest
  ): Either[Throwable, GetPasswordDataResponse] =
    underlying.getPasswordData(getPasswordDataRequest).toEither

  override def getReservedInstancesExchangeQuote(
      getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest
  ): Either[Throwable, GetReservedInstancesExchangeQuoteResponse] =
    underlying.getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest).toEither

  override def getTransitGatewayAttachmentPropagations(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): Either[Throwable, GetTransitGatewayAttachmentPropagationsResponse] =
    underlying.getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest).toEither

  def getTransitGatewayAttachmentPropagationsPaginator(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): GetTransitGatewayAttachmentPropagationsIterable =
    underlying.getTransitGatewayAttachmentPropagationsPaginator(getTransitGatewayAttachmentPropagationsRequest)

  override def getTransitGatewayMulticastDomainAssociations(
      getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest
  ): Either[Throwable, GetTransitGatewayMulticastDomainAssociationsResponse] =
    underlying
      .getTransitGatewayMulticastDomainAssociations(getTransitGatewayMulticastDomainAssociationsRequest).toEither

  def getTransitGatewayMulticastDomainAssociationsPaginator(
      getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest
  ): GetTransitGatewayMulticastDomainAssociationsIterable =
    underlying.getTransitGatewayMulticastDomainAssociationsPaginator(
      getTransitGatewayMulticastDomainAssociationsRequest
    )

  override def getTransitGatewayRouteTableAssociations(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): Either[Throwable, GetTransitGatewayRouteTableAssociationsResponse] =
    underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest).toEither

  def getTransitGatewayRouteTableAssociationsPaginator(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): GetTransitGatewayRouteTableAssociationsIterable =
    underlying.getTransitGatewayRouteTableAssociationsPaginator(getTransitGatewayRouteTableAssociationsRequest)

  override def getTransitGatewayRouteTablePropagations(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): Either[Throwable, GetTransitGatewayRouteTablePropagationsResponse] =
    underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest).toEither

  def getTransitGatewayRouteTablePropagationsPaginator(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): GetTransitGatewayRouteTablePropagationsIterable =
    underlying.getTransitGatewayRouteTablePropagationsPaginator(getTransitGatewayRouteTablePropagationsRequest)

  override def importClientVpnClientCertificateRevocationList(
      importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest
  ): Either[Throwable, ImportClientVpnClientCertificateRevocationListResponse] =
    underlying
      .importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest).toEither

  override def importImage(importImageRequest: ImportImageRequest): Either[Throwable, ImportImageResponse] =
    underlying.importImage(importImageRequest).toEither

  override def importInstance(importInstanceRequest: ImportInstanceRequest): Either[Throwable, ImportInstanceResponse] =
    underlying.importInstance(importInstanceRequest).toEither

  override def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): Either[Throwable, ImportKeyPairResponse] =
    underlying.importKeyPair(importKeyPairRequest).toEither

  override def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): Either[Throwable, ImportSnapshotResponse] =
    underlying.importSnapshot(importSnapshotRequest).toEither

  override def importVolume(importVolumeRequest: ImportVolumeRequest): Either[Throwable, ImportVolumeResponse] =
    underlying.importVolume(importVolumeRequest).toEither

  override def modifyAvailabilityZoneGroup(
      modifyAvailabilityZoneGroupRequest: ModifyAvailabilityZoneGroupRequest
  ): Either[Throwable, ModifyAvailabilityZoneGroupResponse] =
    underlying.modifyAvailabilityZoneGroup(modifyAvailabilityZoneGroupRequest).toEither

  override def modifyCapacityReservation(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest
  ): Either[Throwable, ModifyCapacityReservationResponse] =
    underlying.modifyCapacityReservation(modifyCapacityReservationRequest).toEither

  override def modifyClientVpnEndpoint(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest
  ): Either[Throwable, ModifyClientVpnEndpointResponse] =
    underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest).toEither

  override def modifyDefaultCreditSpecification(
      modifyDefaultCreditSpecificationRequest: ModifyDefaultCreditSpecificationRequest
  ): Either[Throwable, ModifyDefaultCreditSpecificationResponse] =
    underlying.modifyDefaultCreditSpecification(modifyDefaultCreditSpecificationRequest).toEither

  override def modifyEbsDefaultKmsKeyId(
      modifyEbsDefaultKmsKeyIdRequest: ModifyEbsDefaultKmsKeyIdRequest
  ): Either[Throwable, ModifyEbsDefaultKmsKeyIdResponse] =
    underlying.modifyEbsDefaultKmsKeyId(modifyEbsDefaultKmsKeyIdRequest).toEither

  override def modifyFleet(modifyFleetRequest: ModifyFleetRequest): Either[Throwable, ModifyFleetResponse] =
    underlying.modifyFleet(modifyFleetRequest).toEither

  override def modifyFpgaImageAttribute(
      modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest
  ): Either[Throwable, ModifyFpgaImageAttributeResponse] =
    underlying.modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest).toEither

  override def modifyHosts(modifyHostsRequest: ModifyHostsRequest): Either[Throwable, ModifyHostsResponse] =
    underlying.modifyHosts(modifyHostsRequest).toEither

  override def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): Either[Throwable, ModifyIdFormatResponse] =
    underlying.modifyIdFormat(modifyIdFormatRequest).toEither

  override def modifyIdentityIdFormat(
      modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest
  ): Either[Throwable, ModifyIdentityIdFormatResponse] =
    underlying.modifyIdentityIdFormat(modifyIdentityIdFormatRequest).toEither

  override def modifyImageAttribute(
      modifyImageAttributeRequest: ModifyImageAttributeRequest
  ): Either[Throwable, ModifyImageAttributeResponse] =
    underlying.modifyImageAttribute(modifyImageAttributeRequest).toEither

  override def modifyInstanceAttribute(
      modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest
  ): Either[Throwable, ModifyInstanceAttributeResponse] =
    underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest).toEither

  override def modifyInstanceCapacityReservationAttributes(
      modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest
  ): Either[Throwable, ModifyInstanceCapacityReservationAttributesResponse] =
    underlying.modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest).toEither

  override def modifyInstanceCreditSpecification(
      modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest
  ): Either[Throwable, ModifyInstanceCreditSpecificationResponse] =
    underlying.modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest).toEither

  override def modifyInstanceEventStartTime(
      modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest
  ): Either[Throwable, ModifyInstanceEventStartTimeResponse] =
    underlying.modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest).toEither

  override def modifyInstanceMetadataOptions(
      modifyInstanceMetadataOptionsRequest: ModifyInstanceMetadataOptionsRequest
  ): Either[Throwable, ModifyInstanceMetadataOptionsResponse] =
    underlying.modifyInstanceMetadataOptions(modifyInstanceMetadataOptionsRequest).toEither

  override def modifyInstancePlacement(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest
  ): Either[Throwable, ModifyInstancePlacementResponse] =
    underlying.modifyInstancePlacement(modifyInstancePlacementRequest).toEither

  override def modifyLaunchTemplate(
      modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest
  ): Either[Throwable, ModifyLaunchTemplateResponse] =
    underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest).toEither

  override def modifyManagedPrefixList(
      modifyManagedPrefixListRequest: ModifyManagedPrefixListRequest
  ): Either[Throwable, ModifyManagedPrefixListResponse] =
    underlying.modifyManagedPrefixList(modifyManagedPrefixListRequest).toEither

  override def modifyNetworkInterfaceAttribute(
      modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest
  ): Either[Throwable, ModifyNetworkInterfaceAttributeResponse] =
    underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest).toEither

  override def modifyReservedInstances(
      modifyReservedInstancesRequest: ModifyReservedInstancesRequest
  ): Either[Throwable, ModifyReservedInstancesResponse] =
    underlying.modifyReservedInstances(modifyReservedInstancesRequest).toEither

  override def modifySnapshotAttribute(
      modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest
  ): Either[Throwable, ModifySnapshotAttributeResponse] =
    underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest).toEither

  override def modifySpotFleetRequest(
      modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest
  ): Either[Throwable, ModifySpotFleetRequestResponse] =
    underlying.modifySpotFleetRequest(modifySpotFleetRequestRequest).toEither

  override def modifySubnetAttribute(
      modifySubnetAttributeRequest: ModifySubnetAttributeRequest
  ): Either[Throwable, ModifySubnetAttributeResponse] =
    underlying.modifySubnetAttribute(modifySubnetAttributeRequest).toEither

  override def modifyTrafficMirrorFilterNetworkServices(
      modifyTrafficMirrorFilterNetworkServicesRequest: ModifyTrafficMirrorFilterNetworkServicesRequest
  ): Either[Throwable, ModifyTrafficMirrorFilterNetworkServicesResponse] =
    underlying.modifyTrafficMirrorFilterNetworkServices(modifyTrafficMirrorFilterNetworkServicesRequest).toEither

  override def modifyTrafficMirrorFilterRule(
      modifyTrafficMirrorFilterRuleRequest: ModifyTrafficMirrorFilterRuleRequest
  ): Either[Throwable, ModifyTrafficMirrorFilterRuleResponse] =
    underlying.modifyTrafficMirrorFilterRule(modifyTrafficMirrorFilterRuleRequest).toEither

  override def modifyTrafficMirrorSession(
      modifyTrafficMirrorSessionRequest: ModifyTrafficMirrorSessionRequest
  ): Either[Throwable, ModifyTrafficMirrorSessionResponse] =
    underlying.modifyTrafficMirrorSession(modifyTrafficMirrorSessionRequest).toEither

  override def modifyTransitGatewayVpcAttachment(
      modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest
  ): Either[Throwable, ModifyTransitGatewayVpcAttachmentResponse] =
    underlying.modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest).toEither

  override def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): Either[Throwable, ModifyVolumeResponse] =
    underlying.modifyVolume(modifyVolumeRequest).toEither

  override def modifyVolumeAttribute(
      modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest
  ): Either[Throwable, ModifyVolumeAttributeResponse] =
    underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest).toEither

  override def modifyVpcAttribute(
      modifyVpcAttributeRequest: ModifyVpcAttributeRequest
  ): Either[Throwable, ModifyVpcAttributeResponse] =
    underlying.modifyVpcAttribute(modifyVpcAttributeRequest).toEither

  override def modifyVpcEndpoint(
      modifyVpcEndpointRequest: ModifyVpcEndpointRequest
  ): Either[Throwable, ModifyVpcEndpointResponse] =
    underlying.modifyVpcEndpoint(modifyVpcEndpointRequest).toEither

  override def modifyVpcEndpointConnectionNotification(
      modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest
  ): Either[Throwable, ModifyVpcEndpointConnectionNotificationResponse] =
    underlying.modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest).toEither

  override def modifyVpcEndpointServiceConfiguration(
      modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest
  ): Either[Throwable, ModifyVpcEndpointServiceConfigurationResponse] =
    underlying.modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest).toEither

  override def modifyVpcEndpointServicePermissions(
      modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest
  ): Either[Throwable, ModifyVpcEndpointServicePermissionsResponse] =
    underlying.modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest).toEither

  override def modifyVpcPeeringConnectionOptions(
      modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest
  ): Either[Throwable, ModifyVpcPeeringConnectionOptionsResponse] =
    underlying.modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest).toEither

  override def modifyVpcTenancy(
      modifyVpcTenancyRequest: ModifyVpcTenancyRequest
  ): Either[Throwable, ModifyVpcTenancyResponse] =
    underlying.modifyVpcTenancy(modifyVpcTenancyRequest).toEither

  override def modifyVpnConnection(
      modifyVpnConnectionRequest: ModifyVpnConnectionRequest
  ): Either[Throwable, ModifyVpnConnectionResponse] =
    underlying.modifyVpnConnection(modifyVpnConnectionRequest).toEither

  override def modifyVpnTunnelCertificate(
      modifyVpnTunnelCertificateRequest: ModifyVpnTunnelCertificateRequest
  ): Either[Throwable, ModifyVpnTunnelCertificateResponse] =
    underlying.modifyVpnTunnelCertificate(modifyVpnTunnelCertificateRequest).toEither

  override def modifyVpnTunnelOptions(
      modifyVpnTunnelOptionsRequest: ModifyVpnTunnelOptionsRequest
  ): Either[Throwable, ModifyVpnTunnelOptionsResponse] =
    underlying.modifyVpnTunnelOptions(modifyVpnTunnelOptionsRequest).toEither

  override def monitorInstances(
      monitorInstancesRequest: MonitorInstancesRequest
  ): Either[Throwable, MonitorInstancesResponse] =
    underlying.monitorInstances(monitorInstancesRequest).toEither

  override def moveAddressToVpc(
      moveAddressToVpcRequest: MoveAddressToVpcRequest
  ): Either[Throwable, MoveAddressToVpcResponse] =
    underlying.moveAddressToVpc(moveAddressToVpcRequest).toEither

  override def provisionByoipCidr(
      provisionByoipCidrRequest: ProvisionByoipCidrRequest
  ): Either[Throwable, ProvisionByoipCidrResponse] =
    underlying.provisionByoipCidr(provisionByoipCidrRequest).toEither

  override def purchaseHostReservation(
      purchaseHostReservationRequest: PurchaseHostReservationRequest
  ): Either[Throwable, PurchaseHostReservationResponse] =
    underlying.purchaseHostReservation(purchaseHostReservationRequest).toEither

  override def purchaseReservedInstancesOffering(
      purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest
  ): Either[Throwable, PurchaseReservedInstancesOfferingResponse] =
    underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest).toEither

  override def purchaseScheduledInstances(
      purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest
  ): Either[Throwable, PurchaseScheduledInstancesResponse] =
    underlying.purchaseScheduledInstances(purchaseScheduledInstancesRequest).toEither

  override def rebootInstances(
      rebootInstancesRequest: RebootInstancesRequest
  ): Either[Throwable, RebootInstancesResponse] =
    underlying.rebootInstances(rebootInstancesRequest).toEither

  override def registerImage(registerImageRequest: RegisterImageRequest): Either[Throwable, RegisterImageResponse] =
    underlying.registerImage(registerImageRequest).toEither

  override def registerInstanceEventNotificationAttributes(
      registerInstanceEventNotificationAttributesRequest: RegisterInstanceEventNotificationAttributesRequest
  ): Either[Throwable, RegisterInstanceEventNotificationAttributesResponse] =
    underlying.registerInstanceEventNotificationAttributes(registerInstanceEventNotificationAttributesRequest).toEither

  override def registerTransitGatewayMulticastGroupMembers(
      registerTransitGatewayMulticastGroupMembersRequest: RegisterTransitGatewayMulticastGroupMembersRequest
  ): Either[Throwable, RegisterTransitGatewayMulticastGroupMembersResponse] =
    underlying.registerTransitGatewayMulticastGroupMembers(registerTransitGatewayMulticastGroupMembersRequest).toEither

  override def registerTransitGatewayMulticastGroupSources(
      registerTransitGatewayMulticastGroupSourcesRequest: RegisterTransitGatewayMulticastGroupSourcesRequest
  ): Either[Throwable, RegisterTransitGatewayMulticastGroupSourcesResponse] =
    underlying.registerTransitGatewayMulticastGroupSources(registerTransitGatewayMulticastGroupSourcesRequest).toEither

  override def rejectTransitGatewayPeeringAttachment(
      rejectTransitGatewayPeeringAttachmentRequest: RejectTransitGatewayPeeringAttachmentRequest
  ): Either[Throwable, RejectTransitGatewayPeeringAttachmentResponse] =
    underlying.rejectTransitGatewayPeeringAttachment(rejectTransitGatewayPeeringAttachmentRequest).toEither

  override def rejectTransitGatewayVpcAttachment(
      rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest
  ): Either[Throwable, RejectTransitGatewayVpcAttachmentResponse] =
    underlying.rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest).toEither

  override def rejectVpcEndpointConnections(
      rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest
  ): Either[Throwable, RejectVpcEndpointConnectionsResponse] =
    underlying.rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest).toEither

  override def rejectVpcPeeringConnection(
      rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest
  ): Either[Throwable, RejectVpcPeeringConnectionResponse] =
    underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest).toEither

  override def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): Either[Throwable, ReleaseAddressResponse] =
    underlying.releaseAddress(releaseAddressRequest).toEither

  override def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): Either[Throwable, ReleaseHostsResponse] =
    underlying.releaseHosts(releaseHostsRequest).toEither

  override def replaceIamInstanceProfileAssociation(
      replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest
  ): Either[Throwable, ReplaceIamInstanceProfileAssociationResponse] =
    underlying.replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest).toEither

  override def replaceNetworkAclAssociation(
      replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest
  ): Either[Throwable, ReplaceNetworkAclAssociationResponse] =
    underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest).toEither

  override def replaceNetworkAclEntry(
      replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest
  ): Either[Throwable, ReplaceNetworkAclEntryResponse] =
    underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest).toEither

  override def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): Either[Throwable, ReplaceRouteResponse] =
    underlying.replaceRoute(replaceRouteRequest).toEither

  override def replaceRouteTableAssociation(
      replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest
  ): Either[Throwable, ReplaceRouteTableAssociationResponse] =
    underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest).toEither

  override def replaceTransitGatewayRoute(
      replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest
  ): Either[Throwable, ReplaceTransitGatewayRouteResponse] =
    underlying.replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest).toEither

  override def reportInstanceStatus(
      reportInstanceStatusRequest: ReportInstanceStatusRequest
  ): Either[Throwable, ReportInstanceStatusResponse] =
    underlying.reportInstanceStatus(reportInstanceStatusRequest).toEither

  override def requestSpotFleet(
      requestSpotFleetRequest: RequestSpotFleetRequest
  ): Either[Throwable, RequestSpotFleetResponse] =
    underlying.requestSpotFleet(requestSpotFleetRequest).toEither

  override def requestSpotInstances(
      requestSpotInstancesRequest: RequestSpotInstancesRequest
  ): Either[Throwable, RequestSpotInstancesResponse] =
    underlying.requestSpotInstances(requestSpotInstancesRequest).toEither

  override def resetEbsDefaultKmsKeyId(
      resetEbsDefaultKmsKeyIdRequest: ResetEbsDefaultKmsKeyIdRequest
  ): Either[Throwable, ResetEbsDefaultKmsKeyIdResponse] =
    underlying.resetEbsDefaultKmsKeyId(resetEbsDefaultKmsKeyIdRequest).toEither

  override def resetFpgaImageAttribute(
      resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest
  ): Either[Throwable, ResetFpgaImageAttributeResponse] =
    underlying.resetFpgaImageAttribute(resetFpgaImageAttributeRequest).toEither

  override def resetImageAttribute(
      resetImageAttributeRequest: ResetImageAttributeRequest
  ): Either[Throwable, ResetImageAttributeResponse] =
    underlying.resetImageAttribute(resetImageAttributeRequest).toEither

  override def resetInstanceAttribute(
      resetInstanceAttributeRequest: ResetInstanceAttributeRequest
  ): Either[Throwable, ResetInstanceAttributeResponse] =
    underlying.resetInstanceAttribute(resetInstanceAttributeRequest).toEither

  override def resetNetworkInterfaceAttribute(
      resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest
  ): Either[Throwable, ResetNetworkInterfaceAttributeResponse] =
    underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest).toEither

  override def resetSnapshotAttribute(
      resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest
  ): Either[Throwable, ResetSnapshotAttributeResponse] =
    underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest).toEither

  override def restoreAddressToClassic(
      restoreAddressToClassicRequest: RestoreAddressToClassicRequest
  ): Either[Throwable, RestoreAddressToClassicResponse] =
    underlying.restoreAddressToClassic(restoreAddressToClassicRequest).toEither

  override def restoreManagedPrefixListVersion(
      restoreManagedPrefixListVersionRequest: RestoreManagedPrefixListVersionRequest
  ): Either[Throwable, RestoreManagedPrefixListVersionResponse] =
    underlying.restoreManagedPrefixListVersion(restoreManagedPrefixListVersionRequest).toEither

  override def revokeClientVpnIngress(
      revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest
  ): Either[Throwable, RevokeClientVpnIngressResponse] =
    underlying.revokeClientVpnIngress(revokeClientVpnIngressRequest).toEither

  override def revokeSecurityGroupEgress(
      revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest
  ): Either[Throwable, RevokeSecurityGroupEgressResponse] =
    underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest).toEither

  override def revokeSecurityGroupIngress(
      revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest
  ): Either[Throwable, RevokeSecurityGroupIngressResponse] =
    underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest).toEither

  override def runInstances(runInstancesRequest: RunInstancesRequest): Either[Throwable, RunInstancesResponse] =
    underlying.runInstances(runInstancesRequest).toEither

  override def runScheduledInstances(
      runScheduledInstancesRequest: RunScheduledInstancesRequest
  ): Either[Throwable, RunScheduledInstancesResponse] =
    underlying.runScheduledInstances(runScheduledInstancesRequest).toEither

  override def searchLocalGatewayRoutes(
      searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest
  ): Either[Throwable, SearchLocalGatewayRoutesResponse] =
    underlying.searchLocalGatewayRoutes(searchLocalGatewayRoutesRequest).toEither

  def searchLocalGatewayRoutesPaginator(
      searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest
  ): SearchLocalGatewayRoutesIterable =
    underlying.searchLocalGatewayRoutesPaginator(searchLocalGatewayRoutesRequest)

  override def searchTransitGatewayMulticastGroups(
      searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest
  ): Either[Throwable, SearchTransitGatewayMulticastGroupsResponse] =
    underlying.searchTransitGatewayMulticastGroups(searchTransitGatewayMulticastGroupsRequest).toEither

  def searchTransitGatewayMulticastGroupsPaginator(
      searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest
  ): SearchTransitGatewayMulticastGroupsIterable =
    underlying.searchTransitGatewayMulticastGroupsPaginator(searchTransitGatewayMulticastGroupsRequest)

  override def searchTransitGatewayRoutes(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest
  ): Either[Throwable, SearchTransitGatewayRoutesResponse] =
    underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest).toEither

  override def sendDiagnosticInterrupt(
      sendDiagnosticInterruptRequest: SendDiagnosticInterruptRequest
  ): Either[Throwable, SendDiagnosticInterruptResponse] =
    underlying.sendDiagnosticInterrupt(sendDiagnosticInterruptRequest).toEither

  override def startInstances(startInstancesRequest: StartInstancesRequest): Either[Throwable, StartInstancesResponse] =
    underlying.startInstances(startInstancesRequest).toEither

  override def startVpcEndpointServicePrivateDnsVerification(
      startVpcEndpointServicePrivateDnsVerificationRequest: StartVpcEndpointServicePrivateDnsVerificationRequest
  ): Either[Throwable, StartVpcEndpointServicePrivateDnsVerificationResponse] =
    underlying
      .startVpcEndpointServicePrivateDnsVerification(startVpcEndpointServicePrivateDnsVerificationRequest).toEither

  override def stopInstances(stopInstancesRequest: StopInstancesRequest): Either[Throwable, StopInstancesResponse] =
    underlying.stopInstances(stopInstancesRequest).toEither

  override def terminateClientVpnConnections(
      terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest
  ): Either[Throwable, TerminateClientVpnConnectionsResponse] =
    underlying.terminateClientVpnConnections(terminateClientVpnConnectionsRequest).toEither

  override def terminateInstances(
      terminateInstancesRequest: TerminateInstancesRequest
  ): Either[Throwable, TerminateInstancesResponse] =
    underlying.terminateInstances(terminateInstancesRequest).toEither

  override def unassignIpv6Addresses(
      unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest
  ): Either[Throwable, UnassignIpv6AddressesResponse] =
    underlying.unassignIpv6Addresses(unassignIpv6AddressesRequest).toEither

  override def unassignPrivateIpAddresses(
      unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest
  ): Either[Throwable, UnassignPrivateIpAddressesResponse] =
    underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest).toEither

  override def unmonitorInstances(
      unmonitorInstancesRequest: UnmonitorInstancesRequest
  ): Either[Throwable, UnmonitorInstancesResponse] =
    underlying.unmonitorInstances(unmonitorInstancesRequest).toEither

  override def updateSecurityGroupRuleDescriptionsEgress(
      updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest
  ): Either[Throwable, UpdateSecurityGroupRuleDescriptionsEgressResponse] =
    underlying.updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest).toEither

  override def updateSecurityGroupRuleDescriptionsIngress(
      updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest
  ): Either[Throwable, UpdateSecurityGroupRuleDescriptionsIngressResponse] =
    underlying.updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest).toEither

  override def withdrawByoipCidr(
      withdrawByoipCidrRequest: WithdrawByoipCidrRequest
  ): Either[Throwable, WithdrawByoipCidrResponse] =
    underlying.withdrawByoipCidr(withdrawByoipCidrRequest).toEither

}
