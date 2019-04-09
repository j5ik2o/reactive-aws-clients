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
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/ec2/Ec2Client.html
  */
trait Ec2SyncClient extends Ec2Client[Either[Throwable, ?]] {
  val underlying: JavaEc2SyncClient

  import Ec2SyncClient._

  override def acceptReservedInstancesExchangeQuote(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest
  ): Either[Throwable, AcceptReservedInstancesExchangeQuoteResponse] =
    underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest).toEither

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

  override def createSpotDatafeedSubscription(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest
  ): Either[Throwable, CreateSpotDatafeedSubscriptionResponse] =
    underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest).toEither

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): Either[Throwable, CreateSubnetResponse] =
    underlying.createSubnet(createSubnetRequest).toEither

  override def createTags(createTagsRequest: CreateTagsRequest): Either[Throwable, CreateTagsResponse] =
    underlying.createTags(createTagsRequest).toEither

  override def createTransitGateway(): Either[Throwable, CreateTransitGatewayResponse] =
    underlying.createTransitGateway().toEither

  override def createTransitGateway(
      createTransitGatewayRequest: CreateTransitGatewayRequest
  ): Either[Throwable, CreateTransitGatewayResponse] =
    underlying.createTransitGateway(createTransitGatewayRequest).toEither

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

  override def deleteTransitGateway(
      deleteTransitGatewayRequest: DeleteTransitGatewayRequest
  ): Either[Throwable, DeleteTransitGatewayResponse] =
    underlying.deleteTransitGateway(deleteTransitGatewayRequest).toEither

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

  override def describeCapacityReservations(): Either[Throwable, DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations().toEither

  override def describeCapacityReservations(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): Either[Throwable, DescribeCapacityReservationsResponse] =
    underlying.describeCapacityReservations(describeCapacityReservationsRequest).toEither

  override def describeClassicLinkInstances(): Either[Throwable, DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances().toEither

  override def describeClassicLinkInstances(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): Either[Throwable, DescribeClassicLinkInstancesResponse] =
    underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest).toEither

  override def describeClientVpnAuthorizationRules(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): Either[Throwable, DescribeClientVpnAuthorizationRulesResponse] =
    underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest).toEither

  override def describeClientVpnConnections(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): Either[Throwable, DescribeClientVpnConnectionsResponse] =
    underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest).toEither

  override def describeClientVpnEndpoints(): Either[Throwable, DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints().toEither

  override def describeClientVpnEndpoints(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): Either[Throwable, DescribeClientVpnEndpointsResponse] =
    underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest).toEither

  override def describeClientVpnRoutes(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): Either[Throwable, DescribeClientVpnRoutesResponse] =
    underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest).toEither

  override def describeClientVpnTargetNetworks(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): Either[Throwable, DescribeClientVpnTargetNetworksResponse] =
    underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest).toEither

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

  override def describeEgressOnlyInternetGateways(): Either[Throwable, DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways().toEither

  override def describeEgressOnlyInternetGateways(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): Either[Throwable, DescribeEgressOnlyInternetGatewaysResponse] =
    underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest).toEither

  override def describeElasticGpus(): Either[Throwable, DescribeElasticGpusResponse] =
    underlying.describeElasticGpus().toEither

  override def describeElasticGpus(
      describeElasticGpusRequest: DescribeElasticGpusRequest
  ): Either[Throwable, DescribeElasticGpusResponse] =
    underlying.describeElasticGpus(describeElasticGpusRequest).toEither

  override def describeExportTasks(): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks().toEither

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks(describeExportTasksRequest).toEither

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

  override def describeFlowLogs(): Either[Throwable, DescribeFlowLogsResponse] =
    underlying.describeFlowLogs().toEither

  override def describeFlowLogs(
      describeFlowLogsRequest: DescribeFlowLogsRequest
  ): Either[Throwable, DescribeFlowLogsResponse] =
    underlying.describeFlowLogs(describeFlowLogsRequest).toEither

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

  override def describeHostReservationOfferings(): Either[Throwable, DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings().toEither

  override def describeHostReservationOfferings(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): Either[Throwable, DescribeHostReservationOfferingsResponse] =
    underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest).toEither

  override def describeHostReservations(): Either[Throwable, DescribeHostReservationsResponse] =
    underlying.describeHostReservations().toEither

  override def describeHostReservations(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): Either[Throwable, DescribeHostReservationsResponse] =
    underlying.describeHostReservations(describeHostReservationsRequest).toEither

  override def describeHosts(): Either[Throwable, DescribeHostsResponse] =
    underlying.describeHosts().toEither

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): Either[Throwable, DescribeHostsResponse] =
    underlying.describeHosts(describeHostsRequest).toEither

  override def describeIamInstanceProfileAssociations()
      : Either[Throwable, DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations().toEither

  override def describeIamInstanceProfileAssociations(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): Either[Throwable, DescribeIamInstanceProfileAssociationsResponse] =
    underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest).toEither

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

  override def describeImportSnapshotTasks(): Either[Throwable, DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks().toEither

  override def describeImportSnapshotTasks(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): Either[Throwable, DescribeImportSnapshotTasksResponse] =
    underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest).toEither

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

  override def describeLaunchTemplates(): Either[Throwable, DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates().toEither

  override def describeLaunchTemplates(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): Either[Throwable, DescribeLaunchTemplatesResponse] =
    underlying.describeLaunchTemplates(describeLaunchTemplatesRequest).toEither

  override def describeMovingAddresses(): Either[Throwable, DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses().toEither

  override def describeMovingAddresses(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): Either[Throwable, DescribeMovingAddressesResponse] =
    underlying.describeMovingAddresses(describeMovingAddressesRequest).toEither

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

  override def describePrincipalIdFormat(): Either[Throwable, DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat().toEither

  override def describePrincipalIdFormat(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): Either[Throwable, DescribePrincipalIdFormatResponse] =
    underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest).toEither

  override def describePublicIpv4Pools(): Either[Throwable, DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools().toEither

  override def describePublicIpv4Pools(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): Either[Throwable, DescribePublicIpv4PoolsResponse] =
    underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest).toEither

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

  override def describeScheduledInstances(): Either[Throwable, DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances().toEither

  override def describeScheduledInstances(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): Either[Throwable, DescribeScheduledInstancesResponse] =
    underlying.describeScheduledInstances(describeScheduledInstancesRequest).toEither

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

  override def describeSubnets(): Either[Throwable, DescribeSubnetsResponse] =
    underlying.describeSubnets().toEither

  override def describeSubnets(
      describeSubnetsRequest: DescribeSubnetsRequest
  ): Either[Throwable, DescribeSubnetsResponse] =
    underlying.describeSubnets(describeSubnetsRequest).toEither

  override def describeTags(): Either[Throwable, DescribeTagsResponse] =
    underlying.describeTags().toEither

  override def describeTags(describeTagsRequest: DescribeTagsRequest): Either[Throwable, DescribeTagsResponse] =
    underlying.describeTags(describeTagsRequest).toEither

  def describeTagsPaginator(): DescribeTagsIterable =
    underlying.describeTagsPaginator()

  def describeTagsPaginator(describeTagsRequest: DescribeTagsRequest): DescribeTagsIterable =
    underlying.describeTagsPaginator(describeTagsRequest)

  override def describeTransitGatewayAttachments(): Either[Throwable, DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments().toEither

  override def describeTransitGatewayAttachments(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): Either[Throwable, DescribeTransitGatewayAttachmentsResponse] =
    underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest).toEither

  override def describeTransitGatewayRouteTables(): Either[Throwable, DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables().toEither

  override def describeTransitGatewayRouteTables(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): Either[Throwable, DescribeTransitGatewayRouteTablesResponse] =
    underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest).toEither

  override def describeTransitGatewayVpcAttachments(): Either[Throwable, DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments().toEither

  override def describeTransitGatewayVpcAttachments(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): Either[Throwable, DescribeTransitGatewayVpcAttachmentsResponse] =
    underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest).toEither

  override def describeTransitGateways(): Either[Throwable, DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways().toEither

  override def describeTransitGateways(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): Either[Throwable, DescribeTransitGatewaysResponse] =
    underlying.describeTransitGateways(describeTransitGatewaysRequest).toEither

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

  override def describeVpcEndpointConnectionNotifications()
      : Either[Throwable, DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications().toEither

  override def describeVpcEndpointConnectionNotifications(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): Either[Throwable, DescribeVpcEndpointConnectionNotificationsResponse] =
    underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest).toEither

  override def describeVpcEndpointConnections(): Either[Throwable, DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections().toEither

  override def describeVpcEndpointConnections(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): Either[Throwable, DescribeVpcEndpointConnectionsResponse] =
    underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest).toEither

  override def describeVpcEndpointServiceConfigurations()
      : Either[Throwable, DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations().toEither

  override def describeVpcEndpointServiceConfigurations(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): Either[Throwable, DescribeVpcEndpointServiceConfigurationsResponse] =
    underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest).toEither

  override def describeVpcEndpointServicePermissions(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): Either[Throwable, DescribeVpcEndpointServicePermissionsResponse] =
    underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest).toEither

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

  override def describeVpcPeeringConnections(): Either[Throwable, DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections().toEither

  override def describeVpcPeeringConnections(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): Either[Throwable, DescribeVpcPeeringConnectionsResponse] =
    underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest).toEither

  override def describeVpcs(): Either[Throwable, DescribeVpcsResponse] =
    underlying.describeVpcs().toEither

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): Either[Throwable, DescribeVpcsResponse] =
    underlying.describeVpcs(describeVpcsRequest).toEither

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

  override def disassociateTransitGatewayRouteTable(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest
  ): Either[Throwable, DisassociateTransitGatewayRouteTableResponse] =
    underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest).toEither

  override def disassociateVpcCidrBlock(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest
  ): Either[Throwable, DisassociateVpcCidrBlockResponse] =
    underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest).toEither

  override def enableTransitGatewayRouteTablePropagation(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest
  ): Either[Throwable, EnableTransitGatewayRouteTablePropagationResponse] =
    underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest).toEither

  override def enableVgwRoutePropagation(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest
  ): Either[Throwable, EnableVgwRoutePropagationResponse] =
    underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest).toEither

  override def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): Either[Throwable, EnableVolumeIOResponse] =
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

  override def exportTransitGatewayRoutes(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest
  ): Either[Throwable, ExportTransitGatewayRoutesResponse] =
    underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest).toEither

  override def getConsoleOutput(
      getConsoleOutputRequest: GetConsoleOutputRequest
  ): Either[Throwable, GetConsoleOutputResponse] =
    underlying.getConsoleOutput(getConsoleOutputRequest).toEither

  override def getConsoleScreenshot(
      getConsoleScreenshotRequest: GetConsoleScreenshotRequest
  ): Either[Throwable, GetConsoleScreenshotResponse] =
    underlying.getConsoleScreenshot(getConsoleScreenshotRequest).toEither

  override def getHostReservationPurchasePreview(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest
  ): Either[Throwable, GetHostReservationPurchasePreviewResponse] =
    underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest).toEither

  override def getLaunchTemplateData(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest
  ): Either[Throwable, GetLaunchTemplateDataResponse] =
    underlying.getLaunchTemplateData(getLaunchTemplateDataRequest).toEither

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

  override def getTransitGatewayRouteTableAssociations(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): Either[Throwable, GetTransitGatewayRouteTableAssociationsResponse] =
    underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest).toEither

  override def getTransitGatewayRouteTablePropagations(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): Either[Throwable, GetTransitGatewayRouteTablePropagationsResponse] =
    underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest).toEither

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

  override def modifyCapacityReservation(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest
  ): Either[Throwable, ModifyCapacityReservationResponse] =
    underlying.modifyCapacityReservation(modifyCapacityReservationRequest).toEither

  override def modifyClientVpnEndpoint(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest
  ): Either[Throwable, ModifyClientVpnEndpointResponse] =
    underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest).toEither

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

  override def modifyInstancePlacement(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest
  ): Either[Throwable, ModifyInstancePlacementResponse] =
    underlying.modifyInstancePlacement(modifyInstancePlacementRequest).toEither

  override def modifyLaunchTemplate(
      modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest
  ): Either[Throwable, ModifyLaunchTemplateResponse] =
    underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest).toEither

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

  override def searchTransitGatewayRoutes(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest
  ): Either[Throwable, SearchTransitGatewayRoutesResponse] =
    underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest).toEither

  override def startInstances(startInstancesRequest: StartInstancesRequest): Either[Throwable, StartInstancesResponse] =
    underlying.startInstances(startInstancesRequest).toEither

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
