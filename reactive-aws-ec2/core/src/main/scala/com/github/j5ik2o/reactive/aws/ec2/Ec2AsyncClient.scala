// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2

import software.amazon.awssdk.services.ec2.model._
import software.amazon.awssdk.services.ec2.paginators._
import software.amazon.awssdk.services.ec2.{ Ec2AsyncClient => JavaEc2AsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object Ec2AsyncClient {

  def apply(javaClient: JavaEc2AsyncClient): Ec2AsyncClient =
    new Ec2AsyncClient {
      override val underlying: JavaEc2AsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/ec2/Ec2AsyncClient.html
  */
trait Ec2AsyncClient extends Ec2Client[Future] {
  val underlying: JavaEc2AsyncClient

  override def acceptReservedInstancesExchangeQuote(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest
  ): Future[AcceptReservedInstancesExchangeQuoteResponse] =
    underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest).toScala

  override def acceptTransitGatewayPeeringAttachment(
      acceptTransitGatewayPeeringAttachmentRequest: AcceptTransitGatewayPeeringAttachmentRequest
  ): Future[AcceptTransitGatewayPeeringAttachmentResponse] =
    underlying.acceptTransitGatewayPeeringAttachment(acceptTransitGatewayPeeringAttachmentRequest).toScala

  override def acceptTransitGatewayVpcAttachment(
      acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest
  ): Future[AcceptTransitGatewayVpcAttachmentResponse] =
    underlying.acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest).toScala

  override def acceptVpcEndpointConnections(
      acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest
  ): Future[AcceptVpcEndpointConnectionsResponse] =
    underlying.acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest).toScala

  override def acceptVpcPeeringConnection(
      acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest
  ): Future[AcceptVpcPeeringConnectionResponse] =
    underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest).toScala

  override def advertiseByoipCidr(
      advertiseByoipCidrRequest: AdvertiseByoipCidrRequest
  ): Future[AdvertiseByoipCidrResponse] =
    underlying.advertiseByoipCidr(advertiseByoipCidrRequest).toScala

  override def allocateAddress(allocateAddressRequest: AllocateAddressRequest): Future[AllocateAddressResponse] =
    underlying.allocateAddress(allocateAddressRequest).toScala

  override def allocateAddress(): Future[AllocateAddressResponse] =
    underlying.allocateAddress().toScala

  override def allocateHosts(allocateHostsRequest: AllocateHostsRequest): Future[AllocateHostsResponse] =
    underlying.allocateHosts(allocateHostsRequest).toScala

  override def applySecurityGroupsToClientVpnTargetNetwork(
      applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest
  ): Future[ApplySecurityGroupsToClientVpnTargetNetworkResponse] =
    underlying.applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest).toScala

  override def assignIpv6Addresses(
      assignIpv6AddressesRequest: AssignIpv6AddressesRequest
  ): Future[AssignIpv6AddressesResponse] =
    underlying.assignIpv6Addresses(assignIpv6AddressesRequest).toScala

  override def assignPrivateIpAddresses(
      assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest
  ): Future[AssignPrivateIpAddressesResponse] =
    underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest).toScala

  override def associateAddress(associateAddressRequest: AssociateAddressRequest): Future[AssociateAddressResponse] =
    underlying.associateAddress(associateAddressRequest).toScala

  override def associateAddress(): Future[AssociateAddressResponse] =
    underlying.associateAddress().toScala

  override def associateClientVpnTargetNetwork(
      associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest
  ): Future[AssociateClientVpnTargetNetworkResponse] =
    underlying.associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest).toScala

  override def associateDhcpOptions(
      associateDhcpOptionsRequest: AssociateDhcpOptionsRequest
  ): Future[AssociateDhcpOptionsResponse] =
    underlying.associateDhcpOptions(associateDhcpOptionsRequest).toScala

  override def associateIamInstanceProfile(
      associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest
  ): Future[AssociateIamInstanceProfileResponse] =
    underlying.associateIamInstanceProfile(associateIamInstanceProfileRequest).toScala

  override def associateRouteTable(
      associateRouteTableRequest: AssociateRouteTableRequest
  ): Future[AssociateRouteTableResponse] =
    underlying.associateRouteTable(associateRouteTableRequest).toScala

  override def associateSubnetCidrBlock(
      associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest
  ): Future[AssociateSubnetCidrBlockResponse] =
    underlying.associateSubnetCidrBlock(associateSubnetCidrBlockRequest).toScala

  override def associateTransitGatewayMulticastDomain(
      associateTransitGatewayMulticastDomainRequest: AssociateTransitGatewayMulticastDomainRequest
  ): Future[AssociateTransitGatewayMulticastDomainResponse] =
    underlying.associateTransitGatewayMulticastDomain(associateTransitGatewayMulticastDomainRequest).toScala

  override def associateTransitGatewayRouteTable(
      associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest
  ): Future[AssociateTransitGatewayRouteTableResponse] =
    underlying.associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest).toScala

  override def associateVpcCidrBlock(
      associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest
  ): Future[AssociateVpcCidrBlockResponse] =
    underlying.associateVpcCidrBlock(associateVpcCidrBlockRequest).toScala

  override def attachClassicLinkVpc(
      attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest
  ): Future[AttachClassicLinkVpcResponse] =
    underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest).toScala

  override def attachInternetGateway(
      attachInternetGatewayRequest: AttachInternetGatewayRequest
  ): Future[AttachInternetGatewayResponse] =
    underlying.attachInternetGateway(attachInternetGatewayRequest).toScala

  override def attachNetworkInterface(
      attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest
  ): Future[AttachNetworkInterfaceResponse] =
    underlying.attachNetworkInterface(attachNetworkInterfaceRequest).toScala

  override def attachVolume(attachVolumeRequest: AttachVolumeRequest): Future[AttachVolumeResponse] =
    underlying.attachVolume(attachVolumeRequest).toScala

  override def attachVpnGateway(attachVpnGatewayRequest: AttachVpnGatewayRequest): Future[AttachVpnGatewayResponse] =
    underlying.attachVpnGateway(attachVpnGatewayRequest).toScala

  override def authorizeClientVpnIngress(
      authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest
  ): Future[AuthorizeClientVpnIngressResponse] =
    underlying.authorizeClientVpnIngress(authorizeClientVpnIngressRequest).toScala

  override def authorizeSecurityGroupEgress(
      authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest
  ): Future[AuthorizeSecurityGroupEgressResponse] =
    underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest).toScala

  override def authorizeSecurityGroupIngress(
      authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest
  ): Future[AuthorizeSecurityGroupIngressResponse] =
    underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest).toScala

  override def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): Future[BundleInstanceResponse] =
    underlying.bundleInstance(bundleInstanceRequest).toScala

  override def cancelBundleTask(cancelBundleTaskRequest: CancelBundleTaskRequest): Future[CancelBundleTaskResponse] =
    underlying.cancelBundleTask(cancelBundleTaskRequest).toScala

  override def cancelCapacityReservation(
      cancelCapacityReservationRequest: CancelCapacityReservationRequest
  ): Future[CancelCapacityReservationResponse] =
    underlying.cancelCapacityReservation(cancelCapacityReservationRequest).toScala

  override def cancelConversionTask(
      cancelConversionTaskRequest: CancelConversionTaskRequest
  ): Future[CancelConversionTaskResponse] =
    underlying.cancelConversionTask(cancelConversionTaskRequest).toScala

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): Future[CancelExportTaskResponse] =
    underlying.cancelExportTask(cancelExportTaskRequest).toScala

  override def cancelImportTask(cancelImportTaskRequest: CancelImportTaskRequest): Future[CancelImportTaskResponse] =
    underlying.cancelImportTask(cancelImportTaskRequest).toScala

  override def cancelReservedInstancesListing(
      cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest
  ): Future[CancelReservedInstancesListingResponse] =
    underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest).toScala

  override def cancelSpotFleetRequests(
      cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest
  ): Future[CancelSpotFleetRequestsResponse] =
    underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest).toScala

  override def cancelSpotInstanceRequests(
      cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest
  ): Future[CancelSpotInstanceRequestsResponse] =
    underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest).toScala

  override def confirmProductInstance(
      confirmProductInstanceRequest: ConfirmProductInstanceRequest
  ): Future[ConfirmProductInstanceResponse] =
    underlying.confirmProductInstance(confirmProductInstanceRequest).toScala

  override def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): Future[CopyFpgaImageResponse] =
    underlying.copyFpgaImage(copyFpgaImageRequest).toScala

  override def copyImage(copyImageRequest: CopyImageRequest): Future[CopyImageResponse] =
    underlying.copyImage(copyImageRequest).toScala

  override def copySnapshot(copySnapshotRequest: CopySnapshotRequest): Future[CopySnapshotResponse] =
    underlying.copySnapshot(copySnapshotRequest).toScala

  override def createCapacityReservation(
      createCapacityReservationRequest: CreateCapacityReservationRequest
  ): Future[CreateCapacityReservationResponse] =
    underlying.createCapacityReservation(createCapacityReservationRequest).toScala

  override def createClientVpnEndpoint(
      createClientVpnEndpointRequest: CreateClientVpnEndpointRequest
  ): Future[CreateClientVpnEndpointResponse] =
    underlying.createClientVpnEndpoint(createClientVpnEndpointRequest).toScala

  override def createClientVpnRoute(
      createClientVpnRouteRequest: CreateClientVpnRouteRequest
  ): Future[CreateClientVpnRouteResponse] =
    underlying.createClientVpnRoute(createClientVpnRouteRequest).toScala

  override def createCustomerGateway(
      createCustomerGatewayRequest: CreateCustomerGatewayRequest
  ): Future[CreateCustomerGatewayResponse] =
    underlying.createCustomerGateway(createCustomerGatewayRequest).toScala

  override def createDefaultSubnet(
      createDefaultSubnetRequest: CreateDefaultSubnetRequest
  ): Future[CreateDefaultSubnetResponse] =
    underlying.createDefaultSubnet(createDefaultSubnetRequest).toScala

  override def createDefaultVpc(createDefaultVpcRequest: CreateDefaultVpcRequest): Future[CreateDefaultVpcResponse] =
    underlying.createDefaultVpc(createDefaultVpcRequest).toScala

  override def createDefaultVpc(): Future[CreateDefaultVpcResponse] =
    underlying.createDefaultVpc().toScala

  override def createDhcpOptions(
      createDhcpOptionsRequest: CreateDhcpOptionsRequest
  ): Future[CreateDhcpOptionsResponse] =
    underlying.createDhcpOptions(createDhcpOptionsRequest).toScala

  override def createEgressOnlyInternetGateway(
      createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest
  ): Future[CreateEgressOnlyInternetGatewayResponse] =
    underlying.createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest).toScala

  override def createFleet(createFleetRequest: CreateFleetRequest): Future[CreateFleetResponse] =
    underlying.createFleet(createFleetRequest).toScala

  override def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): Future[CreateFlowLogsResponse] =
    underlying.createFlowLogs(createFlowLogsRequest).toScala

  override def createFpgaImage(createFpgaImageRequest: CreateFpgaImageRequest): Future[CreateFpgaImageResponse] =
    underlying.createFpgaImage(createFpgaImageRequest).toScala

  override def createImage(createImageRequest: CreateImageRequest): Future[CreateImageResponse] =
    underlying.createImage(createImageRequest).toScala

  override def createInstanceExportTask(
      createInstanceExportTaskRequest: CreateInstanceExportTaskRequest
  ): Future[CreateInstanceExportTaskResponse] =
    underlying.createInstanceExportTask(createInstanceExportTaskRequest).toScala

  override def createInternetGateway(
      createInternetGatewayRequest: CreateInternetGatewayRequest
  ): Future[CreateInternetGatewayResponse] =
    underlying.createInternetGateway(createInternetGatewayRequest).toScala

  override def createInternetGateway(): Future[CreateInternetGatewayResponse] =
    underlying.createInternetGateway().toScala

  override def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): Future[CreateKeyPairResponse] =
    underlying.createKeyPair(createKeyPairRequest).toScala

  override def createLaunchTemplate(
      createLaunchTemplateRequest: CreateLaunchTemplateRequest
  ): Future[CreateLaunchTemplateResponse] =
    underlying.createLaunchTemplate(createLaunchTemplateRequest).toScala

  override def createLaunchTemplateVersion(
      createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest
  ): Future[CreateLaunchTemplateVersionResponse] =
    underlying.createLaunchTemplateVersion(createLaunchTemplateVersionRequest).toScala

  override def createLocalGatewayRoute(
      createLocalGatewayRouteRequest: CreateLocalGatewayRouteRequest
  ): Future[CreateLocalGatewayRouteResponse] =
    underlying.createLocalGatewayRoute(createLocalGatewayRouteRequest).toScala

  override def createLocalGatewayRouteTableVpcAssociation(
      createLocalGatewayRouteTableVpcAssociationRequest: CreateLocalGatewayRouteTableVpcAssociationRequest
  ): Future[CreateLocalGatewayRouteTableVpcAssociationResponse] =
    underlying.createLocalGatewayRouteTableVpcAssociation(createLocalGatewayRouteTableVpcAssociationRequest).toScala

  override def createNatGateway(createNatGatewayRequest: CreateNatGatewayRequest): Future[CreateNatGatewayResponse] =
    underlying.createNatGateway(createNatGatewayRequest).toScala

  override def createNetworkAcl(createNetworkAclRequest: CreateNetworkAclRequest): Future[CreateNetworkAclResponse] =
    underlying.createNetworkAcl(createNetworkAclRequest).toScala

  override def createNetworkAclEntry(
      createNetworkAclEntryRequest: CreateNetworkAclEntryRequest
  ): Future[CreateNetworkAclEntryResponse] =
    underlying.createNetworkAclEntry(createNetworkAclEntryRequest).toScala

  override def createNetworkInterface(
      createNetworkInterfaceRequest: CreateNetworkInterfaceRequest
  ): Future[CreateNetworkInterfaceResponse] =
    underlying.createNetworkInterface(createNetworkInterfaceRequest).toScala

  override def createNetworkInterfacePermission(
      createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest
  ): Future[CreateNetworkInterfacePermissionResponse] =
    underlying.createNetworkInterfacePermission(createNetworkInterfacePermissionRequest).toScala

  override def createPlacementGroup(
      createPlacementGroupRequest: CreatePlacementGroupRequest
  ): Future[CreatePlacementGroupResponse] =
    underlying.createPlacementGroup(createPlacementGroupRequest).toScala

  override def createReservedInstancesListing(
      createReservedInstancesListingRequest: CreateReservedInstancesListingRequest
  ): Future[CreateReservedInstancesListingResponse] =
    underlying.createReservedInstancesListing(createReservedInstancesListingRequest).toScala

  override def createRoute(createRouteRequest: CreateRouteRequest): Future[CreateRouteResponse] =
    underlying.createRoute(createRouteRequest).toScala

  override def createRouteTable(createRouteTableRequest: CreateRouteTableRequest): Future[CreateRouteTableResponse] =
    underlying.createRouteTable(createRouteTableRequest).toScala

  override def createSecurityGroup(
      createSecurityGroupRequest: CreateSecurityGroupRequest
  ): Future[CreateSecurityGroupResponse] =
    underlying.createSecurityGroup(createSecurityGroupRequest).toScala

  override def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): Future[CreateSnapshotResponse] =
    underlying.createSnapshot(createSnapshotRequest).toScala

  override def createSnapshots(createSnapshotsRequest: CreateSnapshotsRequest): Future[CreateSnapshotsResponse] =
    underlying.createSnapshots(createSnapshotsRequest).toScala

  override def createSpotDatafeedSubscription(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest
  ): Future[CreateSpotDatafeedSubscriptionResponse] =
    underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest).toScala

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): Future[CreateSubnetResponse] =
    underlying.createSubnet(createSubnetRequest).toScala

  override def createTags(createTagsRequest: CreateTagsRequest): Future[CreateTagsResponse] =
    underlying.createTags(createTagsRequest).toScala

  override def createTrafficMirrorFilter(
      createTrafficMirrorFilterRequest: CreateTrafficMirrorFilterRequest
  ): Future[CreateTrafficMirrorFilterResponse] =
    underlying.createTrafficMirrorFilter(createTrafficMirrorFilterRequest).toScala

  override def createTrafficMirrorFilterRule(
      createTrafficMirrorFilterRuleRequest: CreateTrafficMirrorFilterRuleRequest
  ): Future[CreateTrafficMirrorFilterRuleResponse] =
    underlying.createTrafficMirrorFilterRule(createTrafficMirrorFilterRuleRequest).toScala

  override def createTrafficMirrorSession(
      createTrafficMirrorSessionRequest: CreateTrafficMirrorSessionRequest
  ): Future[CreateTrafficMirrorSessionResponse] =
    underlying.createTrafficMirrorSession(createTrafficMirrorSessionRequest).toScala

  override def createTrafficMirrorTarget(
      createTrafficMirrorTargetRequest: CreateTrafficMirrorTargetRequest
  ): Future[CreateTrafficMirrorTargetResponse] =
    underlying.createTrafficMirrorTarget(createTrafficMirrorTargetRequest).toScala

  override def createTransitGateway(
      createTransitGatewayRequest: CreateTransitGatewayRequest
  ): Future[CreateTransitGatewayResponse] =
    underlying.createTransitGateway(createTransitGatewayRequest).toScala

  override def createTransitGateway(): Future[CreateTransitGatewayResponse] =
    underlying.createTransitGateway().toScala

  override def createTransitGatewayMulticastDomain(
      createTransitGatewayMulticastDomainRequest: CreateTransitGatewayMulticastDomainRequest
  ): Future[CreateTransitGatewayMulticastDomainResponse] =
    underlying.createTransitGatewayMulticastDomain(createTransitGatewayMulticastDomainRequest).toScala

  override def createTransitGatewayPeeringAttachment(
      createTransitGatewayPeeringAttachmentRequest: CreateTransitGatewayPeeringAttachmentRequest
  ): Future[CreateTransitGatewayPeeringAttachmentResponse] =
    underlying.createTransitGatewayPeeringAttachment(createTransitGatewayPeeringAttachmentRequest).toScala

  override def createTransitGatewayRoute(
      createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest
  ): Future[CreateTransitGatewayRouteResponse] =
    underlying.createTransitGatewayRoute(createTransitGatewayRouteRequest).toScala

  override def createTransitGatewayRouteTable(
      createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest
  ): Future[CreateTransitGatewayRouteTableResponse] =
    underlying.createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest).toScala

  override def createTransitGatewayVpcAttachment(
      createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest
  ): Future[CreateTransitGatewayVpcAttachmentResponse] =
    underlying.createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest).toScala

  override def createVolume(createVolumeRequest: CreateVolumeRequest): Future[CreateVolumeResponse] =
    underlying.createVolume(createVolumeRequest).toScala

  override def createVpc(createVpcRequest: CreateVpcRequest): Future[CreateVpcResponse] =
    underlying.createVpc(createVpcRequest).toScala

  override def createVpcEndpoint(
      createVpcEndpointRequest: CreateVpcEndpointRequest
  ): Future[CreateVpcEndpointResponse] =
    underlying.createVpcEndpoint(createVpcEndpointRequest).toScala

  override def createVpcEndpointConnectionNotification(
      createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest
  ): Future[CreateVpcEndpointConnectionNotificationResponse] =
    underlying.createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest).toScala

  override def createVpcEndpointServiceConfiguration(
      createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest
  ): Future[CreateVpcEndpointServiceConfigurationResponse] =
    underlying.createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest).toScala

  override def createVpcPeeringConnection(
      createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest
  ): Future[CreateVpcPeeringConnectionResponse] =
    underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest).toScala

  override def createVpnConnection(
      createVpnConnectionRequest: CreateVpnConnectionRequest
  ): Future[CreateVpnConnectionResponse] =
    underlying.createVpnConnection(createVpnConnectionRequest).toScala

  override def createVpnConnectionRoute(
      createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest
  ): Future[CreateVpnConnectionRouteResponse] =
    underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest).toScala

  override def createVpnGateway(createVpnGatewayRequest: CreateVpnGatewayRequest): Future[CreateVpnGatewayResponse] =
    underlying.createVpnGateway(createVpnGatewayRequest).toScala

  override def deleteClientVpnEndpoint(
      deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest
  ): Future[DeleteClientVpnEndpointResponse] =
    underlying.deleteClientVpnEndpoint(deleteClientVpnEndpointRequest).toScala

  override def deleteClientVpnRoute(
      deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest
  ): Future[DeleteClientVpnRouteResponse] =
    underlying.deleteClientVpnRoute(deleteClientVpnRouteRequest).toScala

  override def deleteCustomerGateway(
      deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest
  ): Future[DeleteCustomerGatewayResponse] =
    underlying.deleteCustomerGateway(deleteCustomerGatewayRequest).toScala

  override def deleteDhcpOptions(
      deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest
  ): Future[DeleteDhcpOptionsResponse] =
    underlying.deleteDhcpOptions(deleteDhcpOptionsRequest).toScala

  override def deleteEgressOnlyInternetGateway(
      deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest
  ): Future[DeleteEgressOnlyInternetGatewayResponse] =
    underlying.deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest).toScala

  override def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): Future[DeleteFleetsResponse] =
    underlying.deleteFleets(deleteFleetsRequest).toScala

  override def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): Future[DeleteFlowLogsResponse] =
    underlying.deleteFlowLogs(deleteFlowLogsRequest).toScala

  override def deleteFpgaImage(deleteFpgaImageRequest: DeleteFpgaImageRequest): Future[DeleteFpgaImageResponse] =
    underlying.deleteFpgaImage(deleteFpgaImageRequest).toScala

  override def deleteInternetGateway(
      deleteInternetGatewayRequest: DeleteInternetGatewayRequest
  ): Future[DeleteInternetGatewayResponse] =
    underlying.deleteInternetGateway(deleteInternetGatewayRequest).toScala

  override def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): Future[DeleteKeyPairResponse] =
    underlying.deleteKeyPair(deleteKeyPairRequest).toScala

  override def deleteLaunchTemplate(
      deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest
  ): Future[DeleteLaunchTemplateResponse] =
    underlying.deleteLaunchTemplate(deleteLaunchTemplateRequest).toScala

  override def deleteLaunchTemplateVersions(
      deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest
  ): Future[DeleteLaunchTemplateVersionsResponse] =
    underlying.deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest).toScala

  override def deleteLocalGatewayRoute(
      deleteLocalGatewayRouteRequest: DeleteLocalGatewayRouteRequest
  ): Future[DeleteLocalGatewayRouteResponse] =
    underlying.deleteLocalGatewayRoute(deleteLocalGatewayRouteRequest).toScala

  override def deleteLocalGatewayRouteTableVpcAssociation(
      deleteLocalGatewayRouteTableVpcAssociationRequest: DeleteLocalGatewayRouteTableVpcAssociationRequest
  ): Future[DeleteLocalGatewayRouteTableVpcAssociationResponse] =
    underlying.deleteLocalGatewayRouteTableVpcAssociation(deleteLocalGatewayRouteTableVpcAssociationRequest).toScala

  override def deleteNatGateway(deleteNatGatewayRequest: DeleteNatGatewayRequest): Future[DeleteNatGatewayResponse] =
    underlying.deleteNatGateway(deleteNatGatewayRequest).toScala

  override def deleteNetworkAcl(deleteNetworkAclRequest: DeleteNetworkAclRequest): Future[DeleteNetworkAclResponse] =
    underlying.deleteNetworkAcl(deleteNetworkAclRequest).toScala

  override def deleteNetworkAclEntry(
      deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest
  ): Future[DeleteNetworkAclEntryResponse] =
    underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest).toScala

  override def deleteNetworkInterface(
      deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest
  ): Future[DeleteNetworkInterfaceResponse] =
    underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest).toScala

  override def deleteNetworkInterfacePermission(
      deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest
  ): Future[DeleteNetworkInterfacePermissionResponse] =
    underlying.deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest).toScala

  override def deletePlacementGroup(
      deletePlacementGroupRequest: DeletePlacementGroupRequest
  ): Future[DeletePlacementGroupResponse] =
    underlying.deletePlacementGroup(deletePlacementGroupRequest).toScala

  override def deleteQueuedReservedInstances(
      deleteQueuedReservedInstancesRequest: DeleteQueuedReservedInstancesRequest
  ): Future[DeleteQueuedReservedInstancesResponse] =
    underlying.deleteQueuedReservedInstances(deleteQueuedReservedInstancesRequest).toScala

  override def deleteRoute(deleteRouteRequest: DeleteRouteRequest): Future[DeleteRouteResponse] =
    underlying.deleteRoute(deleteRouteRequest).toScala

  override def deleteRouteTable(deleteRouteTableRequest: DeleteRouteTableRequest): Future[DeleteRouteTableResponse] =
    underlying.deleteRouteTable(deleteRouteTableRequest).toScala

  override def deleteSecurityGroup(
      deleteSecurityGroupRequest: DeleteSecurityGroupRequest
  ): Future[DeleteSecurityGroupResponse] =
    underlying.deleteSecurityGroup(deleteSecurityGroupRequest).toScala

  override def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): Future[DeleteSnapshotResponse] =
    underlying.deleteSnapshot(deleteSnapshotRequest).toScala

  override def deleteSpotDatafeedSubscription(
      deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest
  ): Future[DeleteSpotDatafeedSubscriptionResponse] =
    underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest).toScala

  override def deleteSpotDatafeedSubscription(): Future[DeleteSpotDatafeedSubscriptionResponse] =
    underlying.deleteSpotDatafeedSubscription().toScala

  override def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): Future[DeleteSubnetResponse] =
    underlying.deleteSubnet(deleteSubnetRequest).toScala

  override def deleteTags(deleteTagsRequest: DeleteTagsRequest): Future[DeleteTagsResponse] =
    underlying.deleteTags(deleteTagsRequest).toScala

  override def deleteTrafficMirrorFilter(
      deleteTrafficMirrorFilterRequest: DeleteTrafficMirrorFilterRequest
  ): Future[DeleteTrafficMirrorFilterResponse] =
    underlying.deleteTrafficMirrorFilter(deleteTrafficMirrorFilterRequest).toScala

  override def deleteTrafficMirrorFilterRule(
      deleteTrafficMirrorFilterRuleRequest: DeleteTrafficMirrorFilterRuleRequest
  ): Future[DeleteTrafficMirrorFilterRuleResponse] =
    underlying.deleteTrafficMirrorFilterRule(deleteTrafficMirrorFilterRuleRequest).toScala

  override def deleteTrafficMirrorSession(
      deleteTrafficMirrorSessionRequest: DeleteTrafficMirrorSessionRequest
  ): Future[DeleteTrafficMirrorSessionResponse] =
    underlying.deleteTrafficMirrorSession(deleteTrafficMirrorSessionRequest).toScala

  override def deleteTrafficMirrorTarget(
      deleteTrafficMirrorTargetRequest: DeleteTrafficMirrorTargetRequest
  ): Future[DeleteTrafficMirrorTargetResponse] =
    underlying.deleteTrafficMirrorTarget(deleteTrafficMirrorTargetRequest).toScala

  override def deleteTransitGateway(
      deleteTransitGatewayRequest: DeleteTransitGatewayRequest
  ): Future[DeleteTransitGatewayResponse] =
    underlying.deleteTransitGateway(deleteTransitGatewayRequest).toScala

  override def deleteTransitGatewayMulticastDomain(
      deleteTransitGatewayMulticastDomainRequest: DeleteTransitGatewayMulticastDomainRequest
  ): Future[DeleteTransitGatewayMulticastDomainResponse] =
    underlying.deleteTransitGatewayMulticastDomain(deleteTransitGatewayMulticastDomainRequest).toScala

  override def deleteTransitGatewayPeeringAttachment(
      deleteTransitGatewayPeeringAttachmentRequest: DeleteTransitGatewayPeeringAttachmentRequest
  ): Future[DeleteTransitGatewayPeeringAttachmentResponse] =
    underlying.deleteTransitGatewayPeeringAttachment(deleteTransitGatewayPeeringAttachmentRequest).toScala

  override def deleteTransitGatewayRoute(
      deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest
  ): Future[DeleteTransitGatewayRouteResponse] =
    underlying.deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest).toScala

  override def deleteTransitGatewayRouteTable(
      deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest
  ): Future[DeleteTransitGatewayRouteTableResponse] =
    underlying.deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest).toScala

  override def deleteTransitGatewayVpcAttachment(
      deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest
  ): Future[DeleteTransitGatewayVpcAttachmentResponse] =
    underlying.deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest).toScala

  override def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): Future[DeleteVolumeResponse] =
    underlying.deleteVolume(deleteVolumeRequest).toScala

  override def deleteVpc(deleteVpcRequest: DeleteVpcRequest): Future[DeleteVpcResponse] =
    underlying.deleteVpc(deleteVpcRequest).toScala

  override def deleteVpcEndpointConnectionNotifications(
      deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest
  ): Future[DeleteVpcEndpointConnectionNotificationsResponse] =
    underlying.deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest).toScala

  override def deleteVpcEndpointServiceConfigurations(
      deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest
  ): Future[DeleteVpcEndpointServiceConfigurationsResponse] =
    underlying.deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest).toScala

  override def deleteVpcEndpoints(
      deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest
  ): Future[DeleteVpcEndpointsResponse] =
    underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest).toScala

  override def deleteVpcPeeringConnection(
      deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest
  ): Future[DeleteVpcPeeringConnectionResponse] =
    underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest).toScala

  override def deleteVpnConnection(
      deleteVpnConnectionRequest: DeleteVpnConnectionRequest
  ): Future[DeleteVpnConnectionResponse] =
    underlying.deleteVpnConnection(deleteVpnConnectionRequest).toScala

  override def deleteVpnConnectionRoute(
      deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest
  ): Future[DeleteVpnConnectionRouteResponse] =
    underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest).toScala

  override def deleteVpnGateway(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): Future[DeleteVpnGatewayResponse] =
    underlying.deleteVpnGateway(deleteVpnGatewayRequest).toScala

  override def deprovisionByoipCidr(
      deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest
  ): Future[DeprovisionByoipCidrResponse] =
    underlying.deprovisionByoipCidr(deprovisionByoipCidrRequest).toScala

  override def deregisterImage(deregisterImageRequest: DeregisterImageRequest): Future[DeregisterImageResponse] =
    underlying.deregisterImage(deregisterImageRequest).toScala

  override def deregisterTransitGatewayMulticastGroupMembers(
      deregisterTransitGatewayMulticastGroupMembersRequest: DeregisterTransitGatewayMulticastGroupMembersRequest
  ): Future[DeregisterTransitGatewayMulticastGroupMembersResponse] =
    underlying
      .deregisterTransitGatewayMulticastGroupMembers(deregisterTransitGatewayMulticastGroupMembersRequest).toScala

  override def deregisterTransitGatewayMulticastGroupSources(
      deregisterTransitGatewayMulticastGroupSourcesRequest: DeregisterTransitGatewayMulticastGroupSourcesRequest
  ): Future[DeregisterTransitGatewayMulticastGroupSourcesResponse] =
    underlying
      .deregisterTransitGatewayMulticastGroupSources(deregisterTransitGatewayMulticastGroupSourcesRequest).toScala

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Future[DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes(describeAccountAttributesRequest).toScala

  override def describeAccountAttributes(): Future[DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes().toScala

  override def describeAddresses(
      describeAddressesRequest: DescribeAddressesRequest
  ): Future[DescribeAddressesResponse] =
    underlying.describeAddresses(describeAddressesRequest).toScala

  override def describeAddresses(): Future[DescribeAddressesResponse] =
    underlying.describeAddresses().toScala

  override def describeAggregateIdFormat(
      describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest
  ): Future[DescribeAggregateIdFormatResponse] =
    underlying.describeAggregateIdFormat(describeAggregateIdFormatRequest).toScala

  override def describeAggregateIdFormat(): Future[DescribeAggregateIdFormatResponse] =
    underlying.describeAggregateIdFormat().toScala

  override def describeAvailabilityZones(
      describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest
  ): Future[DescribeAvailabilityZonesResponse] =
    underlying.describeAvailabilityZones(describeAvailabilityZonesRequest).toScala

  override def describeAvailabilityZones(): Future[DescribeAvailabilityZonesResponse] =
    underlying.describeAvailabilityZones().toScala

  override def describeBundleTasks(
      describeBundleTasksRequest: DescribeBundleTasksRequest
  ): Future[DescribeBundleTasksResponse] =
    underlying.describeBundleTasks(describeBundleTasksRequest).toScala

  override def describeBundleTasks(): Future[DescribeBundleTasksResponse] =
    underlying.describeBundleTasks().toScala

  override def describeByoipCidrs(
      describeByoipCidrsRequest: DescribeByoipCidrsRequest
  ): Future[DescribeByoipCidrsResponse] =
    underlying.describeByoipCidrs(describeByoipCidrsRequest).toScala

  def describeByoipCidrsPaginator(describeByoipCidrsRequest: DescribeByoipCidrsRequest): DescribeByoipCidrsPublisher =
    underlying.describeByoipCidrsPaginator(describeByoipCidrsRequest)

  override def describeCapacityReservations(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): Future[DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations(describeCapacityReservationsRequest).toScala

  override def describeCapacityReservations(): Future[DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations().toScala

  def describeCapacityReservationsPaginator(): DescribeCapacityReservationsPublisher =
    underlying.describeCapacityReservationsPaginator()

  def describeCapacityReservationsPaginator(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): DescribeCapacityReservationsPublisher =
    underlying.describeCapacityReservationsPaginator(describeCapacityReservationsRequest)

  override def describeClassicLinkInstances(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): Future[DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest).toScala

  override def describeClassicLinkInstances(): Future[DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances().toScala

  def describeClassicLinkInstancesPaginator(): DescribeClassicLinkInstancesPublisher =
    underlying.describeClassicLinkInstancesPaginator()

  def describeClassicLinkInstancesPaginator(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): DescribeClassicLinkInstancesPublisher =
    underlying.describeClassicLinkInstancesPaginator(describeClassicLinkInstancesRequest)

  override def describeClientVpnAuthorizationRules(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): Future[DescribeClientVpnAuthorizationRulesResponse] =
    underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest).toScala

  def describeClientVpnAuthorizationRulesPaginator(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): DescribeClientVpnAuthorizationRulesPublisher =
    underlying.describeClientVpnAuthorizationRulesPaginator(describeClientVpnAuthorizationRulesRequest)

  override def describeClientVpnConnections(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): Future[DescribeClientVpnConnectionsResponse] =
    underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest).toScala

  def describeClientVpnConnectionsPaginator(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): DescribeClientVpnConnectionsPublisher =
    underlying.describeClientVpnConnectionsPaginator(describeClientVpnConnectionsRequest)

  override def describeClientVpnEndpoints(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): Future[DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest).toScala

  override def describeClientVpnEndpoints(): Future[DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints().toScala

  def describeClientVpnEndpointsPaginator(): DescribeClientVpnEndpointsPublisher =
    underlying.describeClientVpnEndpointsPaginator()

  def describeClientVpnEndpointsPaginator(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): DescribeClientVpnEndpointsPublisher =
    underlying.describeClientVpnEndpointsPaginator(describeClientVpnEndpointsRequest)

  override def describeClientVpnRoutes(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): Future[DescribeClientVpnRoutesResponse] =
    underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest).toScala

  def describeClientVpnRoutesPaginator(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): DescribeClientVpnRoutesPublisher =
    underlying.describeClientVpnRoutesPaginator(describeClientVpnRoutesRequest)

  override def describeClientVpnTargetNetworks(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): Future[DescribeClientVpnTargetNetworksResponse] =
    underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest).toScala

  def describeClientVpnTargetNetworksPaginator(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): DescribeClientVpnTargetNetworksPublisher =
    underlying.describeClientVpnTargetNetworksPaginator(describeClientVpnTargetNetworksRequest)

  override def describeCoipPools(
      describeCoipPoolsRequest: DescribeCoipPoolsRequest
  ): Future[DescribeCoipPoolsResponse] =
    underlying.describeCoipPools(describeCoipPoolsRequest).toScala

  def describeCoipPoolsPaginator(describeCoipPoolsRequest: DescribeCoipPoolsRequest): DescribeCoipPoolsPublisher =
    underlying.describeCoipPoolsPaginator(describeCoipPoolsRequest)

  override def describeConversionTasks(
      describeConversionTasksRequest: DescribeConversionTasksRequest
  ): Future[DescribeConversionTasksResponse] =
    underlying.describeConversionTasks(describeConversionTasksRequest).toScala

  override def describeConversionTasks(): Future[DescribeConversionTasksResponse] =
    underlying.describeConversionTasks().toScala

  override def describeCustomerGateways(
      describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest
  ): Future[DescribeCustomerGatewaysResponse] =
    underlying.describeCustomerGateways(describeCustomerGatewaysRequest).toScala

  override def describeCustomerGateways(): Future[DescribeCustomerGatewaysResponse] =
    underlying.describeCustomerGateways().toScala

  override def describeDhcpOptions(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): Future[DescribeDhcpOptionsResponse] =
    underlying.describeDhcpOptions(describeDhcpOptionsRequest).toScala

  override def describeDhcpOptions(): Future[DescribeDhcpOptionsResponse] =
    underlying.describeDhcpOptions().toScala

  def describeDhcpOptionsPaginator(): DescribeDhcpOptionsPublisher =
    underlying.describeDhcpOptionsPaginator()

  def describeDhcpOptionsPaginator(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): DescribeDhcpOptionsPublisher =
    underlying.describeDhcpOptionsPaginator(describeDhcpOptionsRequest)

  override def describeEgressOnlyInternetGateways(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): Future[DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest).toScala

  override def describeEgressOnlyInternetGateways(): Future[DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways().toScala

  def describeEgressOnlyInternetGatewaysPaginator(): DescribeEgressOnlyInternetGatewaysPublisher =
    underlying.describeEgressOnlyInternetGatewaysPaginator()

  def describeEgressOnlyInternetGatewaysPaginator(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): DescribeEgressOnlyInternetGatewaysPublisher =
    underlying.describeEgressOnlyInternetGatewaysPaginator(describeEgressOnlyInternetGatewaysRequest)

  override def describeElasticGpus(
      describeElasticGpusRequest: DescribeElasticGpusRequest
  ): Future[DescribeElasticGpusResponse] =
    underlying.describeElasticGpus(describeElasticGpusRequest).toScala

  override def describeElasticGpus(): Future[DescribeElasticGpusResponse] =
    underlying.describeElasticGpus().toScala

  override def describeExportImageTasks(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): Future[DescribeExportImageTasksResponse] =
    underlying.describeExportImageTasks(describeExportImageTasksRequest).toScala

  def describeExportImageTasksPaginator(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): DescribeExportImageTasksPublisher =
    underlying.describeExportImageTasksPaginator(describeExportImageTasksRequest)

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Future[DescribeExportTasksResponse] =
    underlying.describeExportTasks(describeExportTasksRequest).toScala

  override def describeExportTasks(): Future[DescribeExportTasksResponse] =
    underlying.describeExportTasks().toScala

  override def describeFastSnapshotRestores(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): Future[DescribeFastSnapshotRestoresResponse] =
    underlying.describeFastSnapshotRestores(describeFastSnapshotRestoresRequest).toScala

  def describeFastSnapshotRestoresPaginator(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): DescribeFastSnapshotRestoresPublisher =
    underlying.describeFastSnapshotRestoresPaginator(describeFastSnapshotRestoresRequest)

  override def describeFleetHistory(
      describeFleetHistoryRequest: DescribeFleetHistoryRequest
  ): Future[DescribeFleetHistoryResponse] =
    underlying.describeFleetHistory(describeFleetHistoryRequest).toScala

  override def describeFleetInstances(
      describeFleetInstancesRequest: DescribeFleetInstancesRequest
  ): Future[DescribeFleetInstancesResponse] =
    underlying.describeFleetInstances(describeFleetInstancesRequest).toScala

  override def describeFleets(describeFleetsRequest: DescribeFleetsRequest): Future[DescribeFleetsResponse] =
    underlying.describeFleets(describeFleetsRequest).toScala

  override def describeFleets(): Future[DescribeFleetsResponse] =
    underlying.describeFleets().toScala

  def describeFleetsPaginator(): DescribeFleetsPublisher =
    underlying.describeFleetsPaginator()

  def describeFleetsPaginator(describeFleetsRequest: DescribeFleetsRequest): DescribeFleetsPublisher =
    underlying.describeFleetsPaginator(describeFleetsRequest)

  override def describeFlowLogs(describeFlowLogsRequest: DescribeFlowLogsRequest): Future[DescribeFlowLogsResponse] =
    underlying.describeFlowLogs(describeFlowLogsRequest).toScala

  override def describeFlowLogs(): Future[DescribeFlowLogsResponse] =
    underlying.describeFlowLogs().toScala

  def describeFlowLogsPaginator(): DescribeFlowLogsPublisher =
    underlying.describeFlowLogsPaginator()

  def describeFlowLogsPaginator(describeFlowLogsRequest: DescribeFlowLogsRequest): DescribeFlowLogsPublisher =
    underlying.describeFlowLogsPaginator(describeFlowLogsRequest)

  override def describeFpgaImageAttribute(
      describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest
  ): Future[DescribeFpgaImageAttributeResponse] =
    underlying.describeFpgaImageAttribute(describeFpgaImageAttributeRequest).toScala

  override def describeFpgaImages(
      describeFpgaImagesRequest: DescribeFpgaImagesRequest
  ): Future[DescribeFpgaImagesResponse] =
    underlying.describeFpgaImages(describeFpgaImagesRequest).toScala

  override def describeFpgaImages(): Future[DescribeFpgaImagesResponse] =
    underlying.describeFpgaImages().toScala

  def describeFpgaImagesPaginator(): DescribeFpgaImagesPublisher =
    underlying.describeFpgaImagesPaginator()

  def describeFpgaImagesPaginator(describeFpgaImagesRequest: DescribeFpgaImagesRequest): DescribeFpgaImagesPublisher =
    underlying.describeFpgaImagesPaginator(describeFpgaImagesRequest)

  override def describeHostReservationOfferings(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): Future[DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest).toScala

  override def describeHostReservationOfferings(): Future[DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings().toScala

  def describeHostReservationOfferingsPaginator(): DescribeHostReservationOfferingsPublisher =
    underlying.describeHostReservationOfferingsPaginator()

  def describeHostReservationOfferingsPaginator(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): DescribeHostReservationOfferingsPublisher =
    underlying.describeHostReservationOfferingsPaginator(describeHostReservationOfferingsRequest)

  override def describeHostReservations(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): Future[DescribeHostReservationsResponse] =
    underlying.describeHostReservations(describeHostReservationsRequest).toScala

  override def describeHostReservations(): Future[DescribeHostReservationsResponse] =
    underlying.describeHostReservations().toScala

  def describeHostReservationsPaginator(): DescribeHostReservationsPublisher =
    underlying.describeHostReservationsPaginator()

  def describeHostReservationsPaginator(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): DescribeHostReservationsPublisher =
    underlying.describeHostReservationsPaginator(describeHostReservationsRequest)

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): Future[DescribeHostsResponse] =
    underlying.describeHosts(describeHostsRequest).toScala

  override def describeHosts(): Future[DescribeHostsResponse] =
    underlying.describeHosts().toScala

  def describeHostsPaginator(): DescribeHostsPublisher =
    underlying.describeHostsPaginator()

  def describeHostsPaginator(describeHostsRequest: DescribeHostsRequest): DescribeHostsPublisher =
    underlying.describeHostsPaginator(describeHostsRequest)

  override def describeIamInstanceProfileAssociations(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): Future[DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest).toScala

  override def describeIamInstanceProfileAssociations(): Future[DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations().toScala

  def describeIamInstanceProfileAssociationsPaginator(): DescribeIamInstanceProfileAssociationsPublisher =
    underlying.describeIamInstanceProfileAssociationsPaginator()

  def describeIamInstanceProfileAssociationsPaginator(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): DescribeIamInstanceProfileAssociationsPublisher =
    underlying.describeIamInstanceProfileAssociationsPaginator(describeIamInstanceProfileAssociationsRequest)

  override def describeIdFormat(describeIdFormatRequest: DescribeIdFormatRequest): Future[DescribeIdFormatResponse] =
    underlying.describeIdFormat(describeIdFormatRequest).toScala

  override def describeIdFormat(): Future[DescribeIdFormatResponse] =
    underlying.describeIdFormat().toScala

  override def describeIdentityIdFormat(
      describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest
  ): Future[DescribeIdentityIdFormatResponse] =
    underlying.describeIdentityIdFormat(describeIdentityIdFormatRequest).toScala

  override def describeImageAttribute(
      describeImageAttributeRequest: DescribeImageAttributeRequest
  ): Future[DescribeImageAttributeResponse] =
    underlying.describeImageAttribute(describeImageAttributeRequest).toScala

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Future[DescribeImagesResponse] =
    underlying.describeImages(describeImagesRequest).toScala

  override def describeImages(): Future[DescribeImagesResponse] =
    underlying.describeImages().toScala

  override def describeImportImageTasks(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): Future[DescribeImportImageTasksResponse] =
    underlying.describeImportImageTasks(describeImportImageTasksRequest).toScala

  override def describeImportImageTasks(): Future[DescribeImportImageTasksResponse] =
    underlying.describeImportImageTasks().toScala

  def describeImportImageTasksPaginator(): DescribeImportImageTasksPublisher =
    underlying.describeImportImageTasksPaginator()

  def describeImportImageTasksPaginator(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): DescribeImportImageTasksPublisher =
    underlying.describeImportImageTasksPaginator(describeImportImageTasksRequest)

  override def describeImportSnapshotTasks(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): Future[DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest).toScala

  override def describeImportSnapshotTasks(): Future[DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks().toScala

  def describeImportSnapshotTasksPaginator(): DescribeImportSnapshotTasksPublisher =
    underlying.describeImportSnapshotTasksPaginator()

  def describeImportSnapshotTasksPaginator(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): DescribeImportSnapshotTasksPublisher =
    underlying.describeImportSnapshotTasksPaginator(describeImportSnapshotTasksRequest)

  override def describeInstanceAttribute(
      describeInstanceAttributeRequest: DescribeInstanceAttributeRequest
  ): Future[DescribeInstanceAttributeResponse] =
    underlying.describeInstanceAttribute(describeInstanceAttributeRequest).toScala

  override def describeInstanceCreditSpecifications(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): Future[DescribeInstanceCreditSpecificationsResponse] =
    underlying.describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest).toScala

  override def describeInstanceCreditSpecifications(): Future[DescribeInstanceCreditSpecificationsResponse] =
    underlying.describeInstanceCreditSpecifications().toScala

  def describeInstanceCreditSpecificationsPaginator(): DescribeInstanceCreditSpecificationsPublisher =
    underlying.describeInstanceCreditSpecificationsPaginator()

  def describeInstanceCreditSpecificationsPaginator(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): DescribeInstanceCreditSpecificationsPublisher =
    underlying.describeInstanceCreditSpecificationsPaginator(describeInstanceCreditSpecificationsRequest)

  override def describeInstanceStatus(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): Future[DescribeInstanceStatusResponse] =
    underlying.describeInstanceStatus(describeInstanceStatusRequest).toScala

  override def describeInstanceStatus(): Future[DescribeInstanceStatusResponse] =
    underlying.describeInstanceStatus().toScala

  def describeInstanceStatusPaginator(): DescribeInstanceStatusPublisher =
    underlying.describeInstanceStatusPaginator()

  def describeInstanceStatusPaginator(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): DescribeInstanceStatusPublisher =
    underlying.describeInstanceStatusPaginator(describeInstanceStatusRequest)

  override def describeInstanceTypeOfferings(
      describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest
  ): Future[DescribeInstanceTypeOfferingsResponse] =
    underlying.describeInstanceTypeOfferings(describeInstanceTypeOfferingsRequest).toScala

  def describeInstanceTypeOfferingsPaginator(
      describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest
  ): DescribeInstanceTypeOfferingsPublisher =
    underlying.describeInstanceTypeOfferingsPaginator(describeInstanceTypeOfferingsRequest)

  override def describeInstanceTypes(
      describeInstanceTypesRequest: DescribeInstanceTypesRequest
  ): Future[DescribeInstanceTypesResponse] =
    underlying.describeInstanceTypes(describeInstanceTypesRequest).toScala

  def describeInstanceTypesPaginator(
      describeInstanceTypesRequest: DescribeInstanceTypesRequest
  ): DescribeInstanceTypesPublisher =
    underlying.describeInstanceTypesPaginator(describeInstanceTypesRequest)

  override def describeInstances(
      describeInstancesRequest: DescribeInstancesRequest
  ): Future[DescribeInstancesResponse] =
    underlying.describeInstances(describeInstancesRequest).toScala

  override def describeInstances(): Future[DescribeInstancesResponse] =
    underlying.describeInstances().toScala

  def describeInstancesPaginator(): DescribeInstancesPublisher =
    underlying.describeInstancesPaginator()

  def describeInstancesPaginator(describeInstancesRequest: DescribeInstancesRequest): DescribeInstancesPublisher =
    underlying.describeInstancesPaginator(describeInstancesRequest)

  override def describeInternetGateways(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): Future[DescribeInternetGatewaysResponse] =
    underlying.describeInternetGateways(describeInternetGatewaysRequest).toScala

  override def describeInternetGateways(): Future[DescribeInternetGatewaysResponse] =
    underlying.describeInternetGateways().toScala

  def describeInternetGatewaysPaginator(): DescribeInternetGatewaysPublisher =
    underlying.describeInternetGatewaysPaginator()

  def describeInternetGatewaysPaginator(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): DescribeInternetGatewaysPublisher =
    underlying.describeInternetGatewaysPaginator(describeInternetGatewaysRequest)

  override def describeIpv6Pools(
      describeIpv6PoolsRequest: DescribeIpv6PoolsRequest
  ): Future[DescribeIpv6PoolsResponse] =
    underlying.describeIpv6Pools(describeIpv6PoolsRequest).toScala

  def describeIpv6PoolsPaginator(describeIpv6PoolsRequest: DescribeIpv6PoolsRequest): DescribeIpv6PoolsPublisher =
    underlying.describeIpv6PoolsPaginator(describeIpv6PoolsRequest)

  override def describeKeyPairs(describeKeyPairsRequest: DescribeKeyPairsRequest): Future[DescribeKeyPairsResponse] =
    underlying.describeKeyPairs(describeKeyPairsRequest).toScala

  override def describeKeyPairs(): Future[DescribeKeyPairsResponse] =
    underlying.describeKeyPairs().toScala

  override def describeLaunchTemplateVersions(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): Future[DescribeLaunchTemplateVersionsResponse] =
    underlying.describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest).toScala

  def describeLaunchTemplateVersionsPaginator(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): DescribeLaunchTemplateVersionsPublisher =
    underlying.describeLaunchTemplateVersionsPaginator(describeLaunchTemplateVersionsRequest)

  override def describeLaunchTemplates(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): Future[DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates(describeLaunchTemplatesRequest).toScala

  override def describeLaunchTemplates(): Future[DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates().toScala

  def describeLaunchTemplatesPaginator(): DescribeLaunchTemplatesPublisher =
    underlying.describeLaunchTemplatesPaginator()

  def describeLaunchTemplatesPaginator(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): DescribeLaunchTemplatesPublisher =
    underlying.describeLaunchTemplatesPaginator(describeLaunchTemplatesRequest)

  override def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): Future[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse] =
    underlying
      .describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
        describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
      ).toScala

  def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsPaginator(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsPublisher =
    underlying.describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsPaginator(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
    )

  override def describeLocalGatewayRouteTableVpcAssociations(
      describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): Future[DescribeLocalGatewayRouteTableVpcAssociationsResponse] =
    underlying
      .describeLocalGatewayRouteTableVpcAssociations(describeLocalGatewayRouteTableVpcAssociationsRequest).toScala

  def describeLocalGatewayRouteTableVpcAssociationsPaginator(
      describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): DescribeLocalGatewayRouteTableVpcAssociationsPublisher =
    underlying.describeLocalGatewayRouteTableVpcAssociationsPaginator(
      describeLocalGatewayRouteTableVpcAssociationsRequest
    )

  override def describeLocalGatewayRouteTables(
      describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest
  ): Future[DescribeLocalGatewayRouteTablesResponse] =
    underlying.describeLocalGatewayRouteTables(describeLocalGatewayRouteTablesRequest).toScala

  def describeLocalGatewayRouteTablesPaginator(
      describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest
  ): DescribeLocalGatewayRouteTablesPublisher =
    underlying.describeLocalGatewayRouteTablesPaginator(describeLocalGatewayRouteTablesRequest)

  override def describeLocalGatewayVirtualInterfaceGroups(
      describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): Future[DescribeLocalGatewayVirtualInterfaceGroupsResponse] =
    underlying.describeLocalGatewayVirtualInterfaceGroups(describeLocalGatewayVirtualInterfaceGroupsRequest).toScala

  def describeLocalGatewayVirtualInterfaceGroupsPaginator(
      describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): DescribeLocalGatewayVirtualInterfaceGroupsPublisher =
    underlying.describeLocalGatewayVirtualInterfaceGroupsPaginator(describeLocalGatewayVirtualInterfaceGroupsRequest)

  override def describeLocalGatewayVirtualInterfaces(
      describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest
  ): Future[DescribeLocalGatewayVirtualInterfacesResponse] =
    underlying.describeLocalGatewayVirtualInterfaces(describeLocalGatewayVirtualInterfacesRequest).toScala

  def describeLocalGatewayVirtualInterfacesPaginator(
      describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest
  ): DescribeLocalGatewayVirtualInterfacesPublisher =
    underlying.describeLocalGatewayVirtualInterfacesPaginator(describeLocalGatewayVirtualInterfacesRequest)

  override def describeLocalGateways(
      describeLocalGatewaysRequest: DescribeLocalGatewaysRequest
  ): Future[DescribeLocalGatewaysResponse] =
    underlying.describeLocalGateways(describeLocalGatewaysRequest).toScala

  def describeLocalGatewaysPaginator(
      describeLocalGatewaysRequest: DescribeLocalGatewaysRequest
  ): DescribeLocalGatewaysPublisher =
    underlying.describeLocalGatewaysPaginator(describeLocalGatewaysRequest)

  override def describeMovingAddresses(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): Future[DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses(describeMovingAddressesRequest).toScala

  override def describeMovingAddresses(): Future[DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses().toScala

  def describeMovingAddressesPaginator(): DescribeMovingAddressesPublisher =
    underlying.describeMovingAddressesPaginator()

  def describeMovingAddressesPaginator(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): DescribeMovingAddressesPublisher =
    underlying.describeMovingAddressesPaginator(describeMovingAddressesRequest)

  override def describeNatGateways(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): Future[DescribeNatGatewaysResponse] =
    underlying.describeNatGateways(describeNatGatewaysRequest).toScala

  override def describeNatGateways(): Future[DescribeNatGatewaysResponse] =
    underlying.describeNatGateways().toScala

  def describeNatGatewaysPaginator(): DescribeNatGatewaysPublisher =
    underlying.describeNatGatewaysPaginator()

  def describeNatGatewaysPaginator(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): DescribeNatGatewaysPublisher =
    underlying.describeNatGatewaysPaginator(describeNatGatewaysRequest)

  override def describeNetworkAcls(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): Future[DescribeNetworkAclsResponse] =
    underlying.describeNetworkAcls(describeNetworkAclsRequest).toScala

  override def describeNetworkAcls(): Future[DescribeNetworkAclsResponse] =
    underlying.describeNetworkAcls().toScala

  def describeNetworkAclsPaginator(): DescribeNetworkAclsPublisher =
    underlying.describeNetworkAclsPaginator()

  def describeNetworkAclsPaginator(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): DescribeNetworkAclsPublisher =
    underlying.describeNetworkAclsPaginator(describeNetworkAclsRequest)

  override def describeNetworkInterfaceAttribute(
      describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest
  ): Future[DescribeNetworkInterfaceAttributeResponse] =
    underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest).toScala

  override def describeNetworkInterfacePermissions(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): Future[DescribeNetworkInterfacePermissionsResponse] =
    underlying.describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest).toScala

  override def describeNetworkInterfacePermissions(): Future[DescribeNetworkInterfacePermissionsResponse] =
    underlying.describeNetworkInterfacePermissions().toScala

  def describeNetworkInterfacePermissionsPaginator(): DescribeNetworkInterfacePermissionsPublisher =
    underlying.describeNetworkInterfacePermissionsPaginator()

  def describeNetworkInterfacePermissionsPaginator(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): DescribeNetworkInterfacePermissionsPublisher =
    underlying.describeNetworkInterfacePermissionsPaginator(describeNetworkInterfacePermissionsRequest)

  override def describeNetworkInterfaces(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): Future[DescribeNetworkInterfacesResponse] =
    underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest).toScala

  override def describeNetworkInterfaces(): Future[DescribeNetworkInterfacesResponse] =
    underlying.describeNetworkInterfaces().toScala

  def describeNetworkInterfacesPaginator(): DescribeNetworkInterfacesPublisher =
    underlying.describeNetworkInterfacesPaginator()

  def describeNetworkInterfacesPaginator(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): DescribeNetworkInterfacesPublisher =
    underlying.describeNetworkInterfacesPaginator(describeNetworkInterfacesRequest)

  override def describePlacementGroups(
      describePlacementGroupsRequest: DescribePlacementGroupsRequest
  ): Future[DescribePlacementGroupsResponse] =
    underlying.describePlacementGroups(describePlacementGroupsRequest).toScala

  override def describePlacementGroups(): Future[DescribePlacementGroupsResponse] =
    underlying.describePlacementGroups().toScala

  override def describePrefixLists(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): Future[DescribePrefixListsResponse] =
    underlying.describePrefixLists(describePrefixListsRequest).toScala

  override def describePrefixLists(): Future[DescribePrefixListsResponse] =
    underlying.describePrefixLists().toScala

  def describePrefixListsPaginator(): DescribePrefixListsPublisher =
    underlying.describePrefixListsPaginator()

  def describePrefixListsPaginator(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): DescribePrefixListsPublisher =
    underlying.describePrefixListsPaginator(describePrefixListsRequest)

  override def describePrincipalIdFormat(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): Future[DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest).toScala

  override def describePrincipalIdFormat(): Future[DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat().toScala

  def describePrincipalIdFormatPaginator(): DescribePrincipalIdFormatPublisher =
    underlying.describePrincipalIdFormatPaginator()

  def describePrincipalIdFormatPaginator(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): DescribePrincipalIdFormatPublisher =
    underlying.describePrincipalIdFormatPaginator(describePrincipalIdFormatRequest)

  override def describePublicIpv4Pools(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): Future[DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest).toScala

  override def describePublicIpv4Pools(): Future[DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools().toScala

  def describePublicIpv4PoolsPaginator(): DescribePublicIpv4PoolsPublisher =
    underlying.describePublicIpv4PoolsPaginator()

  def describePublicIpv4PoolsPaginator(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): DescribePublicIpv4PoolsPublisher =
    underlying.describePublicIpv4PoolsPaginator(describePublicIpv4PoolsRequest)

  override def describeRegions(describeRegionsRequest: DescribeRegionsRequest): Future[DescribeRegionsResponse] =
    underlying.describeRegions(describeRegionsRequest).toScala

  override def describeRegions(): Future[DescribeRegionsResponse] =
    underlying.describeRegions().toScala

  override def describeReservedInstances(
      describeReservedInstancesRequest: DescribeReservedInstancesRequest
  ): Future[DescribeReservedInstancesResponse] =
    underlying.describeReservedInstances(describeReservedInstancesRequest).toScala

  override def describeReservedInstances(): Future[DescribeReservedInstancesResponse] =
    underlying.describeReservedInstances().toScala

  override def describeReservedInstancesListings(
      describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest
  ): Future[DescribeReservedInstancesListingsResponse] =
    underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest).toScala

  override def describeReservedInstancesListings(): Future[DescribeReservedInstancesListingsResponse] =
    underlying.describeReservedInstancesListings().toScala

  override def describeReservedInstancesModifications(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): Future[DescribeReservedInstancesModificationsResponse] =
    underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest).toScala

  override def describeReservedInstancesModifications(): Future[DescribeReservedInstancesModificationsResponse] =
    underlying.describeReservedInstancesModifications().toScala

  def describeReservedInstancesModificationsPaginator(): DescribeReservedInstancesModificationsPublisher =
    underlying.describeReservedInstancesModificationsPaginator()

  def describeReservedInstancesModificationsPaginator(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): DescribeReservedInstancesModificationsPublisher =
    underlying.describeReservedInstancesModificationsPaginator(describeReservedInstancesModificationsRequest)

  override def describeReservedInstancesOfferings(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): Future[DescribeReservedInstancesOfferingsResponse] =
    underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest).toScala

  override def describeReservedInstancesOfferings(): Future[DescribeReservedInstancesOfferingsResponse] =
    underlying.describeReservedInstancesOfferings().toScala

  def describeReservedInstancesOfferingsPaginator(): DescribeReservedInstancesOfferingsPublisher =
    underlying.describeReservedInstancesOfferingsPaginator()

  def describeReservedInstancesOfferingsPaginator(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): DescribeReservedInstancesOfferingsPublisher =
    underlying.describeReservedInstancesOfferingsPaginator(describeReservedInstancesOfferingsRequest)

  override def describeRouteTables(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): Future[DescribeRouteTablesResponse] =
    underlying.describeRouteTables(describeRouteTablesRequest).toScala

  override def describeRouteTables(): Future[DescribeRouteTablesResponse] =
    underlying.describeRouteTables().toScala

  def describeRouteTablesPaginator(): DescribeRouteTablesPublisher =
    underlying.describeRouteTablesPaginator()

  def describeRouteTablesPaginator(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): DescribeRouteTablesPublisher =
    underlying.describeRouteTablesPaginator(describeRouteTablesRequest)

  override def describeScheduledInstanceAvailability(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): Future[DescribeScheduledInstanceAvailabilityResponse] =
    underlying.describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest).toScala

  def describeScheduledInstanceAvailabilityPaginator(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): DescribeScheduledInstanceAvailabilityPublisher =
    underlying.describeScheduledInstanceAvailabilityPaginator(describeScheduledInstanceAvailabilityRequest)

  override def describeScheduledInstances(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): Future[DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances(describeScheduledInstancesRequest).toScala

  override def describeScheduledInstances(): Future[DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances().toScala

  def describeScheduledInstancesPaginator(): DescribeScheduledInstancesPublisher =
    underlying.describeScheduledInstancesPaginator()

  def describeScheduledInstancesPaginator(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): DescribeScheduledInstancesPublisher =
    underlying.describeScheduledInstancesPaginator(describeScheduledInstancesRequest)

  override def describeSecurityGroupReferences(
      describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest
  ): Future[DescribeSecurityGroupReferencesResponse] =
    underlying.describeSecurityGroupReferences(describeSecurityGroupReferencesRequest).toScala

  override def describeSecurityGroups(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): Future[DescribeSecurityGroupsResponse] =
    underlying.describeSecurityGroups(describeSecurityGroupsRequest).toScala

  override def describeSecurityGroups(): Future[DescribeSecurityGroupsResponse] =
    underlying.describeSecurityGroups().toScala

  def describeSecurityGroupsPaginator(): DescribeSecurityGroupsPublisher =
    underlying.describeSecurityGroupsPaginator()

  def describeSecurityGroupsPaginator(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): DescribeSecurityGroupsPublisher =
    underlying.describeSecurityGroupsPaginator(describeSecurityGroupsRequest)

  override def describeSnapshotAttribute(
      describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest
  ): Future[DescribeSnapshotAttributeResponse] =
    underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest).toScala

  override def describeSnapshots(
      describeSnapshotsRequest: DescribeSnapshotsRequest
  ): Future[DescribeSnapshotsResponse] =
    underlying.describeSnapshots(describeSnapshotsRequest).toScala

  override def describeSnapshots(): Future[DescribeSnapshotsResponse] =
    underlying.describeSnapshots().toScala

  def describeSnapshotsPaginator(): DescribeSnapshotsPublisher =
    underlying.describeSnapshotsPaginator()

  def describeSnapshotsPaginator(describeSnapshotsRequest: DescribeSnapshotsRequest): DescribeSnapshotsPublisher =
    underlying.describeSnapshotsPaginator(describeSnapshotsRequest)

  override def describeSpotDatafeedSubscription(
      describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest
  ): Future[DescribeSpotDatafeedSubscriptionResponse] =
    underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest).toScala

  override def describeSpotDatafeedSubscription(): Future[DescribeSpotDatafeedSubscriptionResponse] =
    underlying.describeSpotDatafeedSubscription().toScala

  override def describeSpotFleetInstances(
      describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest
  ): Future[DescribeSpotFleetInstancesResponse] =
    underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest).toScala

  override def describeSpotFleetRequestHistory(
      describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest
  ): Future[DescribeSpotFleetRequestHistoryResponse] =
    underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest).toScala

  override def describeSpotFleetRequests(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): Future[DescribeSpotFleetRequestsResponse] =
    underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest).toScala

  override def describeSpotFleetRequests(): Future[DescribeSpotFleetRequestsResponse] =
    underlying.describeSpotFleetRequests().toScala

  def describeSpotFleetRequestsPaginator(): DescribeSpotFleetRequestsPublisher =
    underlying.describeSpotFleetRequestsPaginator()

  def describeSpotFleetRequestsPaginator(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): DescribeSpotFleetRequestsPublisher =
    underlying.describeSpotFleetRequestsPaginator(describeSpotFleetRequestsRequest)

  override def describeSpotInstanceRequests(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): Future[DescribeSpotInstanceRequestsResponse] =
    underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest).toScala

  override def describeSpotInstanceRequests(): Future[DescribeSpotInstanceRequestsResponse] =
    underlying.describeSpotInstanceRequests().toScala

  def describeSpotInstanceRequestsPaginator(): DescribeSpotInstanceRequestsPublisher =
    underlying.describeSpotInstanceRequestsPaginator()

  def describeSpotInstanceRequestsPaginator(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): DescribeSpotInstanceRequestsPublisher =
    underlying.describeSpotInstanceRequestsPaginator(describeSpotInstanceRequestsRequest)

  override def describeSpotPriceHistory(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): Future[DescribeSpotPriceHistoryResponse] =
    underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest).toScala

  override def describeSpotPriceHistory(): Future[DescribeSpotPriceHistoryResponse] =
    underlying.describeSpotPriceHistory().toScala

  def describeSpotPriceHistoryPaginator(): DescribeSpotPriceHistoryPublisher =
    underlying.describeSpotPriceHistoryPaginator()

  def describeSpotPriceHistoryPaginator(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): DescribeSpotPriceHistoryPublisher =
    underlying.describeSpotPriceHistoryPaginator(describeSpotPriceHistoryRequest)

  override def describeStaleSecurityGroups(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): Future[DescribeStaleSecurityGroupsResponse] =
    underlying.describeStaleSecurityGroups(describeStaleSecurityGroupsRequest).toScala

  def describeStaleSecurityGroupsPaginator(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): DescribeStaleSecurityGroupsPublisher =
    underlying.describeStaleSecurityGroupsPaginator(describeStaleSecurityGroupsRequest)

  override def describeSubnets(describeSubnetsRequest: DescribeSubnetsRequest): Future[DescribeSubnetsResponse] =
    underlying.describeSubnets(describeSubnetsRequest).toScala

  override def describeSubnets(): Future[DescribeSubnetsResponse] =
    underlying.describeSubnets().toScala

  def describeSubnetsPaginator(): DescribeSubnetsPublisher =
    underlying.describeSubnetsPaginator()

  def describeSubnetsPaginator(describeSubnetsRequest: DescribeSubnetsRequest): DescribeSubnetsPublisher =
    underlying.describeSubnetsPaginator(describeSubnetsRequest)

  override def describeTags(describeTagsRequest: DescribeTagsRequest): Future[DescribeTagsResponse] =
    underlying.describeTags(describeTagsRequest).toScala

  override def describeTags(): Future[DescribeTagsResponse] =
    underlying.describeTags().toScala

  def describeTagsPaginator(): DescribeTagsPublisher =
    underlying.describeTagsPaginator()

  def describeTagsPaginator(describeTagsRequest: DescribeTagsRequest): DescribeTagsPublisher =
    underlying.describeTagsPaginator(describeTagsRequest)

  override def describeTrafficMirrorFilters(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): Future[DescribeTrafficMirrorFiltersResponse] =
    underlying.describeTrafficMirrorFilters(describeTrafficMirrorFiltersRequest).toScala

  def describeTrafficMirrorFiltersPaginator(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): DescribeTrafficMirrorFiltersPublisher =
    underlying.describeTrafficMirrorFiltersPaginator(describeTrafficMirrorFiltersRequest)

  override def describeTrafficMirrorSessions(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): Future[DescribeTrafficMirrorSessionsResponse] =
    underlying.describeTrafficMirrorSessions(describeTrafficMirrorSessionsRequest).toScala

  def describeTrafficMirrorSessionsPaginator(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): DescribeTrafficMirrorSessionsPublisher =
    underlying.describeTrafficMirrorSessionsPaginator(describeTrafficMirrorSessionsRequest)

  override def describeTrafficMirrorTargets(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): Future[DescribeTrafficMirrorTargetsResponse] =
    underlying.describeTrafficMirrorTargets(describeTrafficMirrorTargetsRequest).toScala

  def describeTrafficMirrorTargetsPaginator(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): DescribeTrafficMirrorTargetsPublisher =
    underlying.describeTrafficMirrorTargetsPaginator(describeTrafficMirrorTargetsRequest)

  override def describeTransitGatewayAttachments(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): Future[DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest).toScala

  override def describeTransitGatewayAttachments(): Future[DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments().toScala

  def describeTransitGatewayAttachmentsPaginator(): DescribeTransitGatewayAttachmentsPublisher =
    underlying.describeTransitGatewayAttachmentsPaginator()

  def describeTransitGatewayAttachmentsPaginator(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): DescribeTransitGatewayAttachmentsPublisher =
    underlying.describeTransitGatewayAttachmentsPaginator(describeTransitGatewayAttachmentsRequest)

  override def describeTransitGatewayMulticastDomains(
      describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest
  ): Future[DescribeTransitGatewayMulticastDomainsResponse] =
    underlying.describeTransitGatewayMulticastDomains(describeTransitGatewayMulticastDomainsRequest).toScala

  def describeTransitGatewayMulticastDomainsPaginator(
      describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest
  ): DescribeTransitGatewayMulticastDomainsPublisher =
    underlying.describeTransitGatewayMulticastDomainsPaginator(describeTransitGatewayMulticastDomainsRequest)

  override def describeTransitGatewayPeeringAttachments(
      describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest
  ): Future[DescribeTransitGatewayPeeringAttachmentsResponse] =
    underlying.describeTransitGatewayPeeringAttachments(describeTransitGatewayPeeringAttachmentsRequest).toScala

  def describeTransitGatewayPeeringAttachmentsPaginator(
      describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest
  ): DescribeTransitGatewayPeeringAttachmentsPublisher =
    underlying.describeTransitGatewayPeeringAttachmentsPaginator(describeTransitGatewayPeeringAttachmentsRequest)

  override def describeTransitGatewayRouteTables(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): Future[DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest).toScala

  override def describeTransitGatewayRouteTables(): Future[DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables().toScala

  def describeTransitGatewayRouteTablesPaginator(): DescribeTransitGatewayRouteTablesPublisher =
    underlying.describeTransitGatewayRouteTablesPaginator()

  def describeTransitGatewayRouteTablesPaginator(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): DescribeTransitGatewayRouteTablesPublisher =
    underlying.describeTransitGatewayRouteTablesPaginator(describeTransitGatewayRouteTablesRequest)

  override def describeTransitGatewayVpcAttachments(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): Future[DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest).toScala

  override def describeTransitGatewayVpcAttachments(): Future[DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments().toScala

  def describeTransitGatewayVpcAttachmentsPaginator(): DescribeTransitGatewayVpcAttachmentsPublisher =
    underlying.describeTransitGatewayVpcAttachmentsPaginator()

  def describeTransitGatewayVpcAttachmentsPaginator(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): DescribeTransitGatewayVpcAttachmentsPublisher =
    underlying.describeTransitGatewayVpcAttachmentsPaginator(describeTransitGatewayVpcAttachmentsRequest)

  override def describeTransitGateways(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): Future[DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways(describeTransitGatewaysRequest).toScala

  override def describeTransitGateways(): Future[DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways().toScala

  def describeTransitGatewaysPaginator(): DescribeTransitGatewaysPublisher =
    underlying.describeTransitGatewaysPaginator()

  def describeTransitGatewaysPaginator(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): DescribeTransitGatewaysPublisher =
    underlying.describeTransitGatewaysPaginator(describeTransitGatewaysRequest)

  override def describeVolumeAttribute(
      describeVolumeAttributeRequest: DescribeVolumeAttributeRequest
  ): Future[DescribeVolumeAttributeResponse] =
    underlying.describeVolumeAttribute(describeVolumeAttributeRequest).toScala

  override def describeVolumeStatus(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): Future[DescribeVolumeStatusResponse] =
    underlying.describeVolumeStatus(describeVolumeStatusRequest).toScala

  override def describeVolumeStatus(): Future[DescribeVolumeStatusResponse] =
    underlying.describeVolumeStatus().toScala

  def describeVolumeStatusPaginator(): DescribeVolumeStatusPublisher =
    underlying.describeVolumeStatusPaginator()

  def describeVolumeStatusPaginator(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): DescribeVolumeStatusPublisher =
    underlying.describeVolumeStatusPaginator(describeVolumeStatusRequest)

  override def describeVolumes(describeVolumesRequest: DescribeVolumesRequest): Future[DescribeVolumesResponse] =
    underlying.describeVolumes(describeVolumesRequest).toScala

  override def describeVolumes(): Future[DescribeVolumesResponse] =
    underlying.describeVolumes().toScala

  override def describeVolumesModifications(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): Future[DescribeVolumesModificationsResponse] =
    underlying.describeVolumesModifications(describeVolumesModificationsRequest).toScala

  override def describeVolumesModifications(): Future[DescribeVolumesModificationsResponse] =
    underlying.describeVolumesModifications().toScala

  def describeVolumesModificationsPaginator(): DescribeVolumesModificationsPublisher =
    underlying.describeVolumesModificationsPaginator()

  def describeVolumesModificationsPaginator(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): DescribeVolumesModificationsPublisher =
    underlying.describeVolumesModificationsPaginator(describeVolumesModificationsRequest)

  def describeVolumesPaginator(): DescribeVolumesPublisher =
    underlying.describeVolumesPaginator()

  def describeVolumesPaginator(describeVolumesRequest: DescribeVolumesRequest): DescribeVolumesPublisher =
    underlying.describeVolumesPaginator(describeVolumesRequest)

  override def describeVpcAttribute(
      describeVpcAttributeRequest: DescribeVpcAttributeRequest
  ): Future[DescribeVpcAttributeResponse] =
    underlying.describeVpcAttribute(describeVpcAttributeRequest).toScala

  override def describeVpcClassicLink(
      describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest
  ): Future[DescribeVpcClassicLinkResponse] =
    underlying.describeVpcClassicLink(describeVpcClassicLinkRequest).toScala

  override def describeVpcClassicLink(): Future[DescribeVpcClassicLinkResponse] =
    underlying.describeVpcClassicLink().toScala

  override def describeVpcClassicLinkDnsSupport(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): Future[DescribeVpcClassicLinkDnsSupportResponse] =
    underlying.describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest).toScala

  override def describeVpcClassicLinkDnsSupport(): Future[DescribeVpcClassicLinkDnsSupportResponse] =
    underlying.describeVpcClassicLinkDnsSupport().toScala

  def describeVpcClassicLinkDnsSupportPaginator(): DescribeVpcClassicLinkDnsSupportPublisher =
    underlying.describeVpcClassicLinkDnsSupportPaginator()

  def describeVpcClassicLinkDnsSupportPaginator(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): DescribeVpcClassicLinkDnsSupportPublisher =
    underlying.describeVpcClassicLinkDnsSupportPaginator(describeVpcClassicLinkDnsSupportRequest)

  override def describeVpcEndpointConnectionNotifications(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): Future[DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest).toScala

  override def describeVpcEndpointConnectionNotifications()
      : Future[DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications().toScala

  def describeVpcEndpointConnectionNotificationsPaginator(): DescribeVpcEndpointConnectionNotificationsPublisher =
    underlying.describeVpcEndpointConnectionNotificationsPaginator()

  def describeVpcEndpointConnectionNotificationsPaginator(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): DescribeVpcEndpointConnectionNotificationsPublisher =
    underlying.describeVpcEndpointConnectionNotificationsPaginator(describeVpcEndpointConnectionNotificationsRequest)

  override def describeVpcEndpointConnections(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): Future[DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest).toScala

  override def describeVpcEndpointConnections(): Future[DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections().toScala

  def describeVpcEndpointConnectionsPaginator(): DescribeVpcEndpointConnectionsPublisher =
    underlying.describeVpcEndpointConnectionsPaginator()

  def describeVpcEndpointConnectionsPaginator(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): DescribeVpcEndpointConnectionsPublisher =
    underlying.describeVpcEndpointConnectionsPaginator(describeVpcEndpointConnectionsRequest)

  override def describeVpcEndpointServiceConfigurations(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): Future[DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest).toScala

  override def describeVpcEndpointServiceConfigurations(): Future[DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations().toScala

  def describeVpcEndpointServiceConfigurationsPaginator(): DescribeVpcEndpointServiceConfigurationsPublisher =
    underlying.describeVpcEndpointServiceConfigurationsPaginator()

  def describeVpcEndpointServiceConfigurationsPaginator(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): DescribeVpcEndpointServiceConfigurationsPublisher =
    underlying.describeVpcEndpointServiceConfigurationsPaginator(describeVpcEndpointServiceConfigurationsRequest)

  override def describeVpcEndpointServicePermissions(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): Future[DescribeVpcEndpointServicePermissionsResponse] =
    underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest).toScala

  def describeVpcEndpointServicePermissionsPaginator(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): DescribeVpcEndpointServicePermissionsPublisher =
    underlying.describeVpcEndpointServicePermissionsPaginator(describeVpcEndpointServicePermissionsRequest)

  override def describeVpcEndpointServices(
      describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest
  ): Future[DescribeVpcEndpointServicesResponse] =
    underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest).toScala

  override def describeVpcEndpointServices(): Future[DescribeVpcEndpointServicesResponse] =
    underlying.describeVpcEndpointServices().toScala

  override def describeVpcEndpoints(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): Future[DescribeVpcEndpointsResponse] =
    underlying.describeVpcEndpoints(describeVpcEndpointsRequest).toScala

  override def describeVpcEndpoints(): Future[DescribeVpcEndpointsResponse] =
    underlying.describeVpcEndpoints().toScala

  def describeVpcEndpointsPaginator(): DescribeVpcEndpointsPublisher =
    underlying.describeVpcEndpointsPaginator()

  def describeVpcEndpointsPaginator(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): DescribeVpcEndpointsPublisher =
    underlying.describeVpcEndpointsPaginator(describeVpcEndpointsRequest)

  override def describeVpcPeeringConnections(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): Future[DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest).toScala

  override def describeVpcPeeringConnections(): Future[DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections().toScala

  def describeVpcPeeringConnectionsPaginator(): DescribeVpcPeeringConnectionsPublisher =
    underlying.describeVpcPeeringConnectionsPaginator()

  def describeVpcPeeringConnectionsPaginator(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): DescribeVpcPeeringConnectionsPublisher =
    underlying.describeVpcPeeringConnectionsPaginator(describeVpcPeeringConnectionsRequest)

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): Future[DescribeVpcsResponse] =
    underlying.describeVpcs(describeVpcsRequest).toScala

  override def describeVpcs(): Future[DescribeVpcsResponse] =
    underlying.describeVpcs().toScala

  def describeVpcsPaginator(): DescribeVpcsPublisher =
    underlying.describeVpcsPaginator()

  def describeVpcsPaginator(describeVpcsRequest: DescribeVpcsRequest): DescribeVpcsPublisher =
    underlying.describeVpcsPaginator(describeVpcsRequest)

  override def describeVpnConnections(
      describeVpnConnectionsRequest: DescribeVpnConnectionsRequest
  ): Future[DescribeVpnConnectionsResponse] =
    underlying.describeVpnConnections(describeVpnConnectionsRequest).toScala

  override def describeVpnConnections(): Future[DescribeVpnConnectionsResponse] =
    underlying.describeVpnConnections().toScala

  override def describeVpnGateways(
      describeVpnGatewaysRequest: DescribeVpnGatewaysRequest
  ): Future[DescribeVpnGatewaysResponse] =
    underlying.describeVpnGateways(describeVpnGatewaysRequest).toScala

  override def describeVpnGateways(): Future[DescribeVpnGatewaysResponse] =
    underlying.describeVpnGateways().toScala

  override def detachClassicLinkVpc(
      detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest
  ): Future[DetachClassicLinkVpcResponse] =
    underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest).toScala

  override def detachInternetGateway(
      detachInternetGatewayRequest: DetachInternetGatewayRequest
  ): Future[DetachInternetGatewayResponse] =
    underlying.detachInternetGateway(detachInternetGatewayRequest).toScala

  override def detachNetworkInterface(
      detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest
  ): Future[DetachNetworkInterfaceResponse] =
    underlying.detachNetworkInterface(detachNetworkInterfaceRequest).toScala

  override def detachVolume(detachVolumeRequest: DetachVolumeRequest): Future[DetachVolumeResponse] =
    underlying.detachVolume(detachVolumeRequest).toScala

  override def detachVpnGateway(detachVpnGatewayRequest: DetachVpnGatewayRequest): Future[DetachVpnGatewayResponse] =
    underlying.detachVpnGateway(detachVpnGatewayRequest).toScala

  override def disableEbsEncryptionByDefault(
      disableEbsEncryptionByDefaultRequest: DisableEbsEncryptionByDefaultRequest
  ): Future[DisableEbsEncryptionByDefaultResponse] =
    underlying.disableEbsEncryptionByDefault(disableEbsEncryptionByDefaultRequest).toScala

  override def disableFastSnapshotRestores(
      disableFastSnapshotRestoresRequest: DisableFastSnapshotRestoresRequest
  ): Future[DisableFastSnapshotRestoresResponse] =
    underlying.disableFastSnapshotRestores(disableFastSnapshotRestoresRequest).toScala

  override def disableTransitGatewayRouteTablePropagation(
      disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest
  ): Future[DisableTransitGatewayRouteTablePropagationResponse] =
    underlying.disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest).toScala

  override def disableVgwRoutePropagation(
      disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest
  ): Future[DisableVgwRoutePropagationResponse] =
    underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest).toScala

  override def disableVpcClassicLink(
      disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest
  ): Future[DisableVpcClassicLinkResponse] =
    underlying.disableVpcClassicLink(disableVpcClassicLinkRequest).toScala

  override def disableVpcClassicLinkDnsSupport(
      disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest
  ): Future[DisableVpcClassicLinkDnsSupportResponse] =
    underlying.disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest).toScala

  override def disassociateAddress(
      disassociateAddressRequest: DisassociateAddressRequest
  ): Future[DisassociateAddressResponse] =
    underlying.disassociateAddress(disassociateAddressRequest).toScala

  override def disassociateClientVpnTargetNetwork(
      disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest
  ): Future[DisassociateClientVpnTargetNetworkResponse] =
    underlying.disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest).toScala

  override def disassociateIamInstanceProfile(
      disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest
  ): Future[DisassociateIamInstanceProfileResponse] =
    underlying.disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest).toScala

  override def disassociateRouteTable(
      disassociateRouteTableRequest: DisassociateRouteTableRequest
  ): Future[DisassociateRouteTableResponse] =
    underlying.disassociateRouteTable(disassociateRouteTableRequest).toScala

  override def disassociateSubnetCidrBlock(
      disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest
  ): Future[DisassociateSubnetCidrBlockResponse] =
    underlying.disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest).toScala

  override def disassociateTransitGatewayMulticastDomain(
      disassociateTransitGatewayMulticastDomainRequest: DisassociateTransitGatewayMulticastDomainRequest
  ): Future[DisassociateTransitGatewayMulticastDomainResponse] =
    underlying.disassociateTransitGatewayMulticastDomain(disassociateTransitGatewayMulticastDomainRequest).toScala

  override def disassociateTransitGatewayRouteTable(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest
  ): Future[DisassociateTransitGatewayRouteTableResponse] =
    underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest).toScala

  override def disassociateVpcCidrBlock(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest
  ): Future[DisassociateVpcCidrBlockResponse] =
    underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest).toScala

  override def enableEbsEncryptionByDefault(
      enableEbsEncryptionByDefaultRequest: EnableEbsEncryptionByDefaultRequest
  ): Future[EnableEbsEncryptionByDefaultResponse] =
    underlying.enableEbsEncryptionByDefault(enableEbsEncryptionByDefaultRequest).toScala

  override def enableFastSnapshotRestores(
      enableFastSnapshotRestoresRequest: EnableFastSnapshotRestoresRequest
  ): Future[EnableFastSnapshotRestoresResponse] =
    underlying.enableFastSnapshotRestores(enableFastSnapshotRestoresRequest).toScala

  override def enableTransitGatewayRouteTablePropagation(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest
  ): Future[EnableTransitGatewayRouteTablePropagationResponse] =
    underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest).toScala

  override def enableVgwRoutePropagation(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest
  ): Future[EnableVgwRoutePropagationResponse] =
    underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest).toScala

  override def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): Future[EnableVolumeIOResponse] =
    underlying.enableVolumeIO(enableVolumeIoRequest).toScala

  override def enableVpcClassicLink(
      enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest
  ): Future[EnableVpcClassicLinkResponse] =
    underlying.enableVpcClassicLink(enableVpcClassicLinkRequest).toScala

  override def enableVpcClassicLinkDnsSupport(
      enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest
  ): Future[EnableVpcClassicLinkDnsSupportResponse] =
    underlying.enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest).toScala

  override def exportClientVpnClientCertificateRevocationList(
      exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest
  ): Future[ExportClientVpnClientCertificateRevocationListResponse] =
    underlying
      .exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest).toScala

  override def exportClientVpnClientConfiguration(
      exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest
  ): Future[ExportClientVpnClientConfigurationResponse] =
    underlying.exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest).toScala

  override def exportImage(exportImageRequest: ExportImageRequest): Future[ExportImageResponse] =
    underlying.exportImage(exportImageRequest).toScala

  override def exportTransitGatewayRoutes(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest
  ): Future[ExportTransitGatewayRoutesResponse] =
    underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest).toScala

  override def getAssociatedIpv6PoolCidrs(
      getAssociatedIpv6PoolCidrsRequest: GetAssociatedIpv6PoolCidrsRequest
  ): Future[GetAssociatedIpv6PoolCidrsResponse] =
    underlying.getAssociatedIpv6PoolCidrs(getAssociatedIpv6PoolCidrsRequest).toScala

  def getAssociatedIpv6PoolCidrsPaginator(
      getAssociatedIpv6PoolCidrsRequest: GetAssociatedIpv6PoolCidrsRequest
  ): GetAssociatedIpv6PoolCidrsPublisher =
    underlying.getAssociatedIpv6PoolCidrsPaginator(getAssociatedIpv6PoolCidrsRequest)

  override def getCapacityReservationUsage(
      getCapacityReservationUsageRequest: GetCapacityReservationUsageRequest
  ): Future[GetCapacityReservationUsageResponse] =
    underlying.getCapacityReservationUsage(getCapacityReservationUsageRequest).toScala

  override def getCoipPoolUsage(getCoipPoolUsageRequest: GetCoipPoolUsageRequest): Future[GetCoipPoolUsageResponse] =
    underlying.getCoipPoolUsage(getCoipPoolUsageRequest).toScala

  override def getConsoleOutput(getConsoleOutputRequest: GetConsoleOutputRequest): Future[GetConsoleOutputResponse] =
    underlying.getConsoleOutput(getConsoleOutputRequest).toScala

  override def getConsoleScreenshot(
      getConsoleScreenshotRequest: GetConsoleScreenshotRequest
  ): Future[GetConsoleScreenshotResponse] =
    underlying.getConsoleScreenshot(getConsoleScreenshotRequest).toScala

  override def getDefaultCreditSpecification(
      getDefaultCreditSpecificationRequest: GetDefaultCreditSpecificationRequest
  ): Future[GetDefaultCreditSpecificationResponse] =
    underlying.getDefaultCreditSpecification(getDefaultCreditSpecificationRequest).toScala

  override def getEbsDefaultKmsKeyId(
      getEbsDefaultKmsKeyIdRequest: GetEbsDefaultKmsKeyIdRequest
  ): Future[GetEbsDefaultKmsKeyIdResponse] =
    underlying.getEbsDefaultKmsKeyId(getEbsDefaultKmsKeyIdRequest).toScala

  override def getEbsEncryptionByDefault(
      getEbsEncryptionByDefaultRequest: GetEbsEncryptionByDefaultRequest
  ): Future[GetEbsEncryptionByDefaultResponse] =
    underlying.getEbsEncryptionByDefault(getEbsEncryptionByDefaultRequest).toScala

  override def getHostReservationPurchasePreview(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest
  ): Future[GetHostReservationPurchasePreviewResponse] =
    underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest).toScala

  override def getLaunchTemplateData(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest
  ): Future[GetLaunchTemplateDataResponse] =
    underlying.getLaunchTemplateData(getLaunchTemplateDataRequest).toScala

  override def getPasswordData(getPasswordDataRequest: GetPasswordDataRequest): Future[GetPasswordDataResponse] =
    underlying.getPasswordData(getPasswordDataRequest).toScala

  override def getReservedInstancesExchangeQuote(
      getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest
  ): Future[GetReservedInstancesExchangeQuoteResponse] =
    underlying.getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest).toScala

  override def getTransitGatewayAttachmentPropagations(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): Future[GetTransitGatewayAttachmentPropagationsResponse] =
    underlying.getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest).toScala

  def getTransitGatewayAttachmentPropagationsPaginator(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): GetTransitGatewayAttachmentPropagationsPublisher =
    underlying.getTransitGatewayAttachmentPropagationsPaginator(getTransitGatewayAttachmentPropagationsRequest)

  override def getTransitGatewayMulticastDomainAssociations(
      getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest
  ): Future[GetTransitGatewayMulticastDomainAssociationsResponse] =
    underlying.getTransitGatewayMulticastDomainAssociations(getTransitGatewayMulticastDomainAssociationsRequest).toScala

  def getTransitGatewayMulticastDomainAssociationsPaginator(
      getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest
  ): GetTransitGatewayMulticastDomainAssociationsPublisher =
    underlying.getTransitGatewayMulticastDomainAssociationsPaginator(
      getTransitGatewayMulticastDomainAssociationsRequest
    )

  override def getTransitGatewayRouteTableAssociations(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): Future[GetTransitGatewayRouteTableAssociationsResponse] =
    underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest).toScala

  def getTransitGatewayRouteTableAssociationsPaginator(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): GetTransitGatewayRouteTableAssociationsPublisher =
    underlying.getTransitGatewayRouteTableAssociationsPaginator(getTransitGatewayRouteTableAssociationsRequest)

  override def getTransitGatewayRouteTablePropagations(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): Future[GetTransitGatewayRouteTablePropagationsResponse] =
    underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest).toScala

  def getTransitGatewayRouteTablePropagationsPaginator(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): GetTransitGatewayRouteTablePropagationsPublisher =
    underlying.getTransitGatewayRouteTablePropagationsPaginator(getTransitGatewayRouteTablePropagationsRequest)

  override def importClientVpnClientCertificateRevocationList(
      importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest
  ): Future[ImportClientVpnClientCertificateRevocationListResponse] =
    underlying
      .importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest).toScala

  override def importImage(importImageRequest: ImportImageRequest): Future[ImportImageResponse] =
    underlying.importImage(importImageRequest).toScala

  override def importInstance(importInstanceRequest: ImportInstanceRequest): Future[ImportInstanceResponse] =
    underlying.importInstance(importInstanceRequest).toScala

  override def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): Future[ImportKeyPairResponse] =
    underlying.importKeyPair(importKeyPairRequest).toScala

  override def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): Future[ImportSnapshotResponse] =
    underlying.importSnapshot(importSnapshotRequest).toScala

  override def importVolume(importVolumeRequest: ImportVolumeRequest): Future[ImportVolumeResponse] =
    underlying.importVolume(importVolumeRequest).toScala

  override def modifyAvailabilityZoneGroup(
      modifyAvailabilityZoneGroupRequest: ModifyAvailabilityZoneGroupRequest
  ): Future[ModifyAvailabilityZoneGroupResponse] =
    underlying.modifyAvailabilityZoneGroup(modifyAvailabilityZoneGroupRequest).toScala

  override def modifyCapacityReservation(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest
  ): Future[ModifyCapacityReservationResponse] =
    underlying.modifyCapacityReservation(modifyCapacityReservationRequest).toScala

  override def modifyClientVpnEndpoint(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest
  ): Future[ModifyClientVpnEndpointResponse] =
    underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest).toScala

  override def modifyDefaultCreditSpecification(
      modifyDefaultCreditSpecificationRequest: ModifyDefaultCreditSpecificationRequest
  ): Future[ModifyDefaultCreditSpecificationResponse] =
    underlying.modifyDefaultCreditSpecification(modifyDefaultCreditSpecificationRequest).toScala

  override def modifyEbsDefaultKmsKeyId(
      modifyEbsDefaultKmsKeyIdRequest: ModifyEbsDefaultKmsKeyIdRequest
  ): Future[ModifyEbsDefaultKmsKeyIdResponse] =
    underlying.modifyEbsDefaultKmsKeyId(modifyEbsDefaultKmsKeyIdRequest).toScala

  override def modifyFleet(modifyFleetRequest: ModifyFleetRequest): Future[ModifyFleetResponse] =
    underlying.modifyFleet(modifyFleetRequest).toScala

  override def modifyFpgaImageAttribute(
      modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest
  ): Future[ModifyFpgaImageAttributeResponse] =
    underlying.modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest).toScala

  override def modifyHosts(modifyHostsRequest: ModifyHostsRequest): Future[ModifyHostsResponse] =
    underlying.modifyHosts(modifyHostsRequest).toScala

  override def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): Future[ModifyIdFormatResponse] =
    underlying.modifyIdFormat(modifyIdFormatRequest).toScala

  override def modifyIdentityIdFormat(
      modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest
  ): Future[ModifyIdentityIdFormatResponse] =
    underlying.modifyIdentityIdFormat(modifyIdentityIdFormatRequest).toScala

  override def modifyImageAttribute(
      modifyImageAttributeRequest: ModifyImageAttributeRequest
  ): Future[ModifyImageAttributeResponse] =
    underlying.modifyImageAttribute(modifyImageAttributeRequest).toScala

  override def modifyInstanceAttribute(
      modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest
  ): Future[ModifyInstanceAttributeResponse] =
    underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest).toScala

  override def modifyInstanceCapacityReservationAttributes(
      modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest
  ): Future[ModifyInstanceCapacityReservationAttributesResponse] =
    underlying.modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest).toScala

  override def modifyInstanceCreditSpecification(
      modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest
  ): Future[ModifyInstanceCreditSpecificationResponse] =
    underlying.modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest).toScala

  override def modifyInstanceEventStartTime(
      modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest
  ): Future[ModifyInstanceEventStartTimeResponse] =
    underlying.modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest).toScala

  override def modifyInstanceMetadataOptions(
      modifyInstanceMetadataOptionsRequest: ModifyInstanceMetadataOptionsRequest
  ): Future[ModifyInstanceMetadataOptionsResponse] =
    underlying.modifyInstanceMetadataOptions(modifyInstanceMetadataOptionsRequest).toScala

  override def modifyInstancePlacement(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest
  ): Future[ModifyInstancePlacementResponse] =
    underlying.modifyInstancePlacement(modifyInstancePlacementRequest).toScala

  override def modifyLaunchTemplate(
      modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest
  ): Future[ModifyLaunchTemplateResponse] =
    underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest).toScala

  override def modifyNetworkInterfaceAttribute(
      modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest
  ): Future[ModifyNetworkInterfaceAttributeResponse] =
    underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest).toScala

  override def modifyReservedInstances(
      modifyReservedInstancesRequest: ModifyReservedInstancesRequest
  ): Future[ModifyReservedInstancesResponse] =
    underlying.modifyReservedInstances(modifyReservedInstancesRequest).toScala

  override def modifySnapshotAttribute(
      modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest
  ): Future[ModifySnapshotAttributeResponse] =
    underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest).toScala

  override def modifySpotFleetRequest(
      modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest
  ): Future[ModifySpotFleetRequestResponse] =
    underlying.modifySpotFleetRequest(modifySpotFleetRequestRequest).toScala

  override def modifySubnetAttribute(
      modifySubnetAttributeRequest: ModifySubnetAttributeRequest
  ): Future[ModifySubnetAttributeResponse] =
    underlying.modifySubnetAttribute(modifySubnetAttributeRequest).toScala

  override def modifyTrafficMirrorFilterNetworkServices(
      modifyTrafficMirrorFilterNetworkServicesRequest: ModifyTrafficMirrorFilterNetworkServicesRequest
  ): Future[ModifyTrafficMirrorFilterNetworkServicesResponse] =
    underlying.modifyTrafficMirrorFilterNetworkServices(modifyTrafficMirrorFilterNetworkServicesRequest).toScala

  override def modifyTrafficMirrorFilterRule(
      modifyTrafficMirrorFilterRuleRequest: ModifyTrafficMirrorFilterRuleRequest
  ): Future[ModifyTrafficMirrorFilterRuleResponse] =
    underlying.modifyTrafficMirrorFilterRule(modifyTrafficMirrorFilterRuleRequest).toScala

  override def modifyTrafficMirrorSession(
      modifyTrafficMirrorSessionRequest: ModifyTrafficMirrorSessionRequest
  ): Future[ModifyTrafficMirrorSessionResponse] =
    underlying.modifyTrafficMirrorSession(modifyTrafficMirrorSessionRequest).toScala

  override def modifyTransitGatewayVpcAttachment(
      modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest
  ): Future[ModifyTransitGatewayVpcAttachmentResponse] =
    underlying.modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest).toScala

  override def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): Future[ModifyVolumeResponse] =
    underlying.modifyVolume(modifyVolumeRequest).toScala

  override def modifyVolumeAttribute(
      modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest
  ): Future[ModifyVolumeAttributeResponse] =
    underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest).toScala

  override def modifyVpcAttribute(
      modifyVpcAttributeRequest: ModifyVpcAttributeRequest
  ): Future[ModifyVpcAttributeResponse] =
    underlying.modifyVpcAttribute(modifyVpcAttributeRequest).toScala

  override def modifyVpcEndpoint(
      modifyVpcEndpointRequest: ModifyVpcEndpointRequest
  ): Future[ModifyVpcEndpointResponse] =
    underlying.modifyVpcEndpoint(modifyVpcEndpointRequest).toScala

  override def modifyVpcEndpointConnectionNotification(
      modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest
  ): Future[ModifyVpcEndpointConnectionNotificationResponse] =
    underlying.modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest).toScala

  override def modifyVpcEndpointServiceConfiguration(
      modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest
  ): Future[ModifyVpcEndpointServiceConfigurationResponse] =
    underlying.modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest).toScala

  override def modifyVpcEndpointServicePermissions(
      modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest
  ): Future[ModifyVpcEndpointServicePermissionsResponse] =
    underlying.modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest).toScala

  override def modifyVpcPeeringConnectionOptions(
      modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest
  ): Future[ModifyVpcPeeringConnectionOptionsResponse] =
    underlying.modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest).toScala

  override def modifyVpcTenancy(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): Future[ModifyVpcTenancyResponse] =
    underlying.modifyVpcTenancy(modifyVpcTenancyRequest).toScala

  override def modifyVpnConnection(
      modifyVpnConnectionRequest: ModifyVpnConnectionRequest
  ): Future[ModifyVpnConnectionResponse] =
    underlying.modifyVpnConnection(modifyVpnConnectionRequest).toScala

  override def modifyVpnTunnelCertificate(
      modifyVpnTunnelCertificateRequest: ModifyVpnTunnelCertificateRequest
  ): Future[ModifyVpnTunnelCertificateResponse] =
    underlying.modifyVpnTunnelCertificate(modifyVpnTunnelCertificateRequest).toScala

  override def modifyVpnTunnelOptions(
      modifyVpnTunnelOptionsRequest: ModifyVpnTunnelOptionsRequest
  ): Future[ModifyVpnTunnelOptionsResponse] =
    underlying.modifyVpnTunnelOptions(modifyVpnTunnelOptionsRequest).toScala

  override def monitorInstances(monitorInstancesRequest: MonitorInstancesRequest): Future[MonitorInstancesResponse] =
    underlying.monitorInstances(monitorInstancesRequest).toScala

  override def moveAddressToVpc(moveAddressToVpcRequest: MoveAddressToVpcRequest): Future[MoveAddressToVpcResponse] =
    underlying.moveAddressToVpc(moveAddressToVpcRequest).toScala

  override def provisionByoipCidr(
      provisionByoipCidrRequest: ProvisionByoipCidrRequest
  ): Future[ProvisionByoipCidrResponse] =
    underlying.provisionByoipCidr(provisionByoipCidrRequest).toScala

  override def purchaseHostReservation(
      purchaseHostReservationRequest: PurchaseHostReservationRequest
  ): Future[PurchaseHostReservationResponse] =
    underlying.purchaseHostReservation(purchaseHostReservationRequest).toScala

  override def purchaseReservedInstancesOffering(
      purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest
  ): Future[PurchaseReservedInstancesOfferingResponse] =
    underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest).toScala

  override def purchaseScheduledInstances(
      purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest
  ): Future[PurchaseScheduledInstancesResponse] =
    underlying.purchaseScheduledInstances(purchaseScheduledInstancesRequest).toScala

  override def rebootInstances(rebootInstancesRequest: RebootInstancesRequest): Future[RebootInstancesResponse] =
    underlying.rebootInstances(rebootInstancesRequest).toScala

  override def registerImage(registerImageRequest: RegisterImageRequest): Future[RegisterImageResponse] =
    underlying.registerImage(registerImageRequest).toScala

  override def registerTransitGatewayMulticastGroupMembers(
      registerTransitGatewayMulticastGroupMembersRequest: RegisterTransitGatewayMulticastGroupMembersRequest
  ): Future[RegisterTransitGatewayMulticastGroupMembersResponse] =
    underlying.registerTransitGatewayMulticastGroupMembers(registerTransitGatewayMulticastGroupMembersRequest).toScala

  override def registerTransitGatewayMulticastGroupSources(
      registerTransitGatewayMulticastGroupSourcesRequest: RegisterTransitGatewayMulticastGroupSourcesRequest
  ): Future[RegisterTransitGatewayMulticastGroupSourcesResponse] =
    underlying.registerTransitGatewayMulticastGroupSources(registerTransitGatewayMulticastGroupSourcesRequest).toScala

  override def rejectTransitGatewayPeeringAttachment(
      rejectTransitGatewayPeeringAttachmentRequest: RejectTransitGatewayPeeringAttachmentRequest
  ): Future[RejectTransitGatewayPeeringAttachmentResponse] =
    underlying.rejectTransitGatewayPeeringAttachment(rejectTransitGatewayPeeringAttachmentRequest).toScala

  override def rejectTransitGatewayVpcAttachment(
      rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest
  ): Future[RejectTransitGatewayVpcAttachmentResponse] =
    underlying.rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest).toScala

  override def rejectVpcEndpointConnections(
      rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest
  ): Future[RejectVpcEndpointConnectionsResponse] =
    underlying.rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest).toScala

  override def rejectVpcPeeringConnection(
      rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest
  ): Future[RejectVpcPeeringConnectionResponse] =
    underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest).toScala

  override def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): Future[ReleaseAddressResponse] =
    underlying.releaseAddress(releaseAddressRequest).toScala

  override def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): Future[ReleaseHostsResponse] =
    underlying.releaseHosts(releaseHostsRequest).toScala

  override def replaceIamInstanceProfileAssociation(
      replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest
  ): Future[ReplaceIamInstanceProfileAssociationResponse] =
    underlying.replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest).toScala

  override def replaceNetworkAclAssociation(
      replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest
  ): Future[ReplaceNetworkAclAssociationResponse] =
    underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest).toScala

  override def replaceNetworkAclEntry(
      replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest
  ): Future[ReplaceNetworkAclEntryResponse] =
    underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest).toScala

  override def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): Future[ReplaceRouteResponse] =
    underlying.replaceRoute(replaceRouteRequest).toScala

  override def replaceRouteTableAssociation(
      replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest
  ): Future[ReplaceRouteTableAssociationResponse] =
    underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest).toScala

  override def replaceTransitGatewayRoute(
      replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest
  ): Future[ReplaceTransitGatewayRouteResponse] =
    underlying.replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest).toScala

  override def reportInstanceStatus(
      reportInstanceStatusRequest: ReportInstanceStatusRequest
  ): Future[ReportInstanceStatusResponse] =
    underlying.reportInstanceStatus(reportInstanceStatusRequest).toScala

  override def requestSpotFleet(requestSpotFleetRequest: RequestSpotFleetRequest): Future[RequestSpotFleetResponse] =
    underlying.requestSpotFleet(requestSpotFleetRequest).toScala

  override def requestSpotInstances(
      requestSpotInstancesRequest: RequestSpotInstancesRequest
  ): Future[RequestSpotInstancesResponse] =
    underlying.requestSpotInstances(requestSpotInstancesRequest).toScala

  override def resetEbsDefaultKmsKeyId(
      resetEbsDefaultKmsKeyIdRequest: ResetEbsDefaultKmsKeyIdRequest
  ): Future[ResetEbsDefaultKmsKeyIdResponse] =
    underlying.resetEbsDefaultKmsKeyId(resetEbsDefaultKmsKeyIdRequest).toScala

  override def resetFpgaImageAttribute(
      resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest
  ): Future[ResetFpgaImageAttributeResponse] =
    underlying.resetFpgaImageAttribute(resetFpgaImageAttributeRequest).toScala

  override def resetImageAttribute(
      resetImageAttributeRequest: ResetImageAttributeRequest
  ): Future[ResetImageAttributeResponse] =
    underlying.resetImageAttribute(resetImageAttributeRequest).toScala

  override def resetInstanceAttribute(
      resetInstanceAttributeRequest: ResetInstanceAttributeRequest
  ): Future[ResetInstanceAttributeResponse] =
    underlying.resetInstanceAttribute(resetInstanceAttributeRequest).toScala

  override def resetNetworkInterfaceAttribute(
      resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest
  ): Future[ResetNetworkInterfaceAttributeResponse] =
    underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest).toScala

  override def resetSnapshotAttribute(
      resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest
  ): Future[ResetSnapshotAttributeResponse] =
    underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest).toScala

  override def restoreAddressToClassic(
      restoreAddressToClassicRequest: RestoreAddressToClassicRequest
  ): Future[RestoreAddressToClassicResponse] =
    underlying.restoreAddressToClassic(restoreAddressToClassicRequest).toScala

  override def revokeClientVpnIngress(
      revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest
  ): Future[RevokeClientVpnIngressResponse] =
    underlying.revokeClientVpnIngress(revokeClientVpnIngressRequest).toScala

  override def revokeSecurityGroupEgress(
      revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest
  ): Future[RevokeSecurityGroupEgressResponse] =
    underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest).toScala

  override def revokeSecurityGroupIngress(
      revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest
  ): Future[RevokeSecurityGroupIngressResponse] =
    underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest).toScala

  override def runInstances(runInstancesRequest: RunInstancesRequest): Future[RunInstancesResponse] =
    underlying.runInstances(runInstancesRequest).toScala

  override def runScheduledInstances(
      runScheduledInstancesRequest: RunScheduledInstancesRequest
  ): Future[RunScheduledInstancesResponse] =
    underlying.runScheduledInstances(runScheduledInstancesRequest).toScala

  override def searchLocalGatewayRoutes(
      searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest
  ): Future[SearchLocalGatewayRoutesResponse] =
    underlying.searchLocalGatewayRoutes(searchLocalGatewayRoutesRequest).toScala

  def searchLocalGatewayRoutesPaginator(
      searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest
  ): SearchLocalGatewayRoutesPublisher =
    underlying.searchLocalGatewayRoutesPaginator(searchLocalGatewayRoutesRequest)

  override def searchTransitGatewayMulticastGroups(
      searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest
  ): Future[SearchTransitGatewayMulticastGroupsResponse] =
    underlying.searchTransitGatewayMulticastGroups(searchTransitGatewayMulticastGroupsRequest).toScala

  def searchTransitGatewayMulticastGroupsPaginator(
      searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest
  ): SearchTransitGatewayMulticastGroupsPublisher =
    underlying.searchTransitGatewayMulticastGroupsPaginator(searchTransitGatewayMulticastGroupsRequest)

  override def searchTransitGatewayRoutes(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest
  ): Future[SearchTransitGatewayRoutesResponse] =
    underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest).toScala

  override def sendDiagnosticInterrupt(
      sendDiagnosticInterruptRequest: SendDiagnosticInterruptRequest
  ): Future[SendDiagnosticInterruptResponse] =
    underlying.sendDiagnosticInterrupt(sendDiagnosticInterruptRequest).toScala

  override def startInstances(startInstancesRequest: StartInstancesRequest): Future[StartInstancesResponse] =
    underlying.startInstances(startInstancesRequest).toScala

  override def startVpcEndpointServicePrivateDnsVerification(
      startVpcEndpointServicePrivateDnsVerificationRequest: StartVpcEndpointServicePrivateDnsVerificationRequest
  ): Future[StartVpcEndpointServicePrivateDnsVerificationResponse] =
    underlying
      .startVpcEndpointServicePrivateDnsVerification(startVpcEndpointServicePrivateDnsVerificationRequest).toScala

  override def stopInstances(stopInstancesRequest: StopInstancesRequest): Future[StopInstancesResponse] =
    underlying.stopInstances(stopInstancesRequest).toScala

  override def terminateClientVpnConnections(
      terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest
  ): Future[TerminateClientVpnConnectionsResponse] =
    underlying.terminateClientVpnConnections(terminateClientVpnConnectionsRequest).toScala

  override def terminateInstances(
      terminateInstancesRequest: TerminateInstancesRequest
  ): Future[TerminateInstancesResponse] =
    underlying.terminateInstances(terminateInstancesRequest).toScala

  override def unassignIpv6Addresses(
      unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest
  ): Future[UnassignIpv6AddressesResponse] =
    underlying.unassignIpv6Addresses(unassignIpv6AddressesRequest).toScala

  override def unassignPrivateIpAddresses(
      unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest
  ): Future[UnassignPrivateIpAddressesResponse] =
    underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest).toScala

  override def unmonitorInstances(
      unmonitorInstancesRequest: UnmonitorInstancesRequest
  ): Future[UnmonitorInstancesResponse] =
    underlying.unmonitorInstances(unmonitorInstancesRequest).toScala

  override def updateSecurityGroupRuleDescriptionsEgress(
      updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest
  ): Future[UpdateSecurityGroupRuleDescriptionsEgressResponse] =
    underlying.updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest).toScala

  override def updateSecurityGroupRuleDescriptionsIngress(
      updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest
  ): Future[UpdateSecurityGroupRuleDescriptionsIngressResponse] =
    underlying.updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest).toScala

  override def withdrawByoipCidr(
      withdrawByoipCidrRequest: WithdrawByoipCidrRequest
  ): Future[WithdrawByoipCidrResponse] =
    underlying.withdrawByoipCidr(withdrawByoipCidrRequest).toScala

}
