// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.monix

import software.amazon.awssdk.services.ec2.model._
import com.github.j5ik2o.reactive.aws.ec2.{ Ec2AsyncClient, Ec2Client }
import monix.eval.Task
import monix.reactive.Observable

object Ec2MonixClient {

  def apply(asyncClient: Ec2AsyncClient): Ec2MonixClient = new Ec2MonixClient {
    override val underlying: Ec2AsyncClient = asyncClient
  }

}

trait Ec2MonixClient extends Ec2Client[Task] {

  val underlying: Ec2AsyncClient

  override def acceptReservedInstancesExchangeQuote(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest
  ): Task[AcceptReservedInstancesExchangeQuoteResponse] =
    Task.deferFuture {
      underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest)
    }

  override def acceptTransitGatewayVpcAttachment(
      acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest
  ): Task[AcceptTransitGatewayVpcAttachmentResponse] =
    Task.deferFuture {
      underlying.acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest)
    }

  override def acceptVpcEndpointConnections(
      acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest
  ): Task[AcceptVpcEndpointConnectionsResponse] =
    Task.deferFuture {
      underlying.acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest)
    }

  override def acceptVpcPeeringConnection(
      acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest
  ): Task[AcceptVpcPeeringConnectionResponse] =
    Task.deferFuture {
      underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest)
    }

  override def advertiseByoipCidr(
      advertiseByoipCidrRequest: AdvertiseByoipCidrRequest
  ): Task[AdvertiseByoipCidrResponse] =
    Task.deferFuture {
      underlying.advertiseByoipCidr(advertiseByoipCidrRequest)
    }

  override def allocateAddress(allocateAddressRequest: AllocateAddressRequest): Task[AllocateAddressResponse] =
    Task.deferFuture {
      underlying.allocateAddress(allocateAddressRequest)
    }

  override def allocateAddress(): Task[AllocateAddressResponse] =
    Task.deferFuture {
      underlying.allocateAddress()
    }

  override def allocateHosts(allocateHostsRequest: AllocateHostsRequest): Task[AllocateHostsResponse] =
    Task.deferFuture {
      underlying.allocateHosts(allocateHostsRequest)
    }

  override def applySecurityGroupsToClientVpnTargetNetwork(
      applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest
  ): Task[ApplySecurityGroupsToClientVpnTargetNetworkResponse] =
    Task.deferFuture {
      underlying.applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest)
    }

  override def assignIpv6Addresses(
      assignIpv6AddressesRequest: AssignIpv6AddressesRequest
  ): Task[AssignIpv6AddressesResponse] =
    Task.deferFuture {
      underlying.assignIpv6Addresses(assignIpv6AddressesRequest)
    }

  override def assignPrivateIpAddresses(
      assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest
  ): Task[AssignPrivateIpAddressesResponse] =
    Task.deferFuture {
      underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest)
    }

  override def associateAddress(associateAddressRequest: AssociateAddressRequest): Task[AssociateAddressResponse] =
    Task.deferFuture {
      underlying.associateAddress(associateAddressRequest)
    }

  override def associateAddress(): Task[AssociateAddressResponse] =
    Task.deferFuture {
      underlying.associateAddress()
    }

  override def associateClientVpnTargetNetwork(
      associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest
  ): Task[AssociateClientVpnTargetNetworkResponse] =
    Task.deferFuture {
      underlying.associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest)
    }

  override def associateDhcpOptions(
      associateDhcpOptionsRequest: AssociateDhcpOptionsRequest
  ): Task[AssociateDhcpOptionsResponse] =
    Task.deferFuture {
      underlying.associateDhcpOptions(associateDhcpOptionsRequest)
    }

  override def associateIamInstanceProfile(
      associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest
  ): Task[AssociateIamInstanceProfileResponse] =
    Task.deferFuture {
      underlying.associateIamInstanceProfile(associateIamInstanceProfileRequest)
    }

  override def associateRouteTable(
      associateRouteTableRequest: AssociateRouteTableRequest
  ): Task[AssociateRouteTableResponse] =
    Task.deferFuture {
      underlying.associateRouteTable(associateRouteTableRequest)
    }

  override def associateSubnetCidrBlock(
      associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest
  ): Task[AssociateSubnetCidrBlockResponse] =
    Task.deferFuture {
      underlying.associateSubnetCidrBlock(associateSubnetCidrBlockRequest)
    }

  override def associateTransitGatewayRouteTable(
      associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest
  ): Task[AssociateTransitGatewayRouteTableResponse] =
    Task.deferFuture {
      underlying.associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest)
    }

  override def associateVpcCidrBlock(
      associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest
  ): Task[AssociateVpcCidrBlockResponse] =
    Task.deferFuture {
      underlying.associateVpcCidrBlock(associateVpcCidrBlockRequest)
    }

  override def attachClassicLinkVpc(
      attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest
  ): Task[AttachClassicLinkVpcResponse] =
    Task.deferFuture {
      underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest)
    }

  override def attachInternetGateway(
      attachInternetGatewayRequest: AttachInternetGatewayRequest
  ): Task[AttachInternetGatewayResponse] =
    Task.deferFuture {
      underlying.attachInternetGateway(attachInternetGatewayRequest)
    }

  override def attachNetworkInterface(
      attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest
  ): Task[AttachNetworkInterfaceResponse] =
    Task.deferFuture {
      underlying.attachNetworkInterface(attachNetworkInterfaceRequest)
    }

  override def attachVolume(attachVolumeRequest: AttachVolumeRequest): Task[AttachVolumeResponse] =
    Task.deferFuture {
      underlying.attachVolume(attachVolumeRequest)
    }

  override def attachVpnGateway(attachVpnGatewayRequest: AttachVpnGatewayRequest): Task[AttachVpnGatewayResponse] =
    Task.deferFuture {
      underlying.attachVpnGateway(attachVpnGatewayRequest)
    }

  override def authorizeClientVpnIngress(
      authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest
  ): Task[AuthorizeClientVpnIngressResponse] =
    Task.deferFuture {
      underlying.authorizeClientVpnIngress(authorizeClientVpnIngressRequest)
    }

  override def authorizeSecurityGroupEgress(
      authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest
  ): Task[AuthorizeSecurityGroupEgressResponse] =
    Task.deferFuture {
      underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest)
    }

  override def authorizeSecurityGroupIngress(
      authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest
  ): Task[AuthorizeSecurityGroupIngressResponse] =
    Task.deferFuture {
      underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest)
    }

  override def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): Task[BundleInstanceResponse] =
    Task.deferFuture {
      underlying.bundleInstance(bundleInstanceRequest)
    }

  override def cancelBundleTask(cancelBundleTaskRequest: CancelBundleTaskRequest): Task[CancelBundleTaskResponse] =
    Task.deferFuture {
      underlying.cancelBundleTask(cancelBundleTaskRequest)
    }

  override def cancelCapacityReservation(
      cancelCapacityReservationRequest: CancelCapacityReservationRequest
  ): Task[CancelCapacityReservationResponse] =
    Task.deferFuture {
      underlying.cancelCapacityReservation(cancelCapacityReservationRequest)
    }

  override def cancelConversionTask(
      cancelConversionTaskRequest: CancelConversionTaskRequest
  ): Task[CancelConversionTaskResponse] =
    Task.deferFuture {
      underlying.cancelConversionTask(cancelConversionTaskRequest)
    }

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): Task[CancelExportTaskResponse] =
    Task.deferFuture {
      underlying.cancelExportTask(cancelExportTaskRequest)
    }

  override def cancelImportTask(cancelImportTaskRequest: CancelImportTaskRequest): Task[CancelImportTaskResponse] =
    Task.deferFuture {
      underlying.cancelImportTask(cancelImportTaskRequest)
    }

  override def cancelReservedInstancesListing(
      cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest
  ): Task[CancelReservedInstancesListingResponse] =
    Task.deferFuture {
      underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest)
    }

  override def cancelSpotFleetRequests(
      cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest
  ): Task[CancelSpotFleetRequestsResponse] =
    Task.deferFuture {
      underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest)
    }

  override def cancelSpotInstanceRequests(
      cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest
  ): Task[CancelSpotInstanceRequestsResponse] =
    Task.deferFuture {
      underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest)
    }

  override def confirmProductInstance(
      confirmProductInstanceRequest: ConfirmProductInstanceRequest
  ): Task[ConfirmProductInstanceResponse] =
    Task.deferFuture {
      underlying.confirmProductInstance(confirmProductInstanceRequest)
    }

  override def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): Task[CopyFpgaImageResponse] =
    Task.deferFuture {
      underlying.copyFpgaImage(copyFpgaImageRequest)
    }

  override def copyImage(copyImageRequest: CopyImageRequest): Task[CopyImageResponse] =
    Task.deferFuture {
      underlying.copyImage(copyImageRequest)
    }

  override def copySnapshot(copySnapshotRequest: CopySnapshotRequest): Task[CopySnapshotResponse] =
    Task.deferFuture {
      underlying.copySnapshot(copySnapshotRequest)
    }

  override def createCapacityReservation(
      createCapacityReservationRequest: CreateCapacityReservationRequest
  ): Task[CreateCapacityReservationResponse] =
    Task.deferFuture {
      underlying.createCapacityReservation(createCapacityReservationRequest)
    }

  override def createClientVpnEndpoint(
      createClientVpnEndpointRequest: CreateClientVpnEndpointRequest
  ): Task[CreateClientVpnEndpointResponse] =
    Task.deferFuture {
      underlying.createClientVpnEndpoint(createClientVpnEndpointRequest)
    }

  override def createClientVpnRoute(
      createClientVpnRouteRequest: CreateClientVpnRouteRequest
  ): Task[CreateClientVpnRouteResponse] =
    Task.deferFuture {
      underlying.createClientVpnRoute(createClientVpnRouteRequest)
    }

  override def createCustomerGateway(
      createCustomerGatewayRequest: CreateCustomerGatewayRequest
  ): Task[CreateCustomerGatewayResponse] =
    Task.deferFuture {
      underlying.createCustomerGateway(createCustomerGatewayRequest)
    }

  override def createDefaultSubnet(
      createDefaultSubnetRequest: CreateDefaultSubnetRequest
  ): Task[CreateDefaultSubnetResponse] =
    Task.deferFuture {
      underlying.createDefaultSubnet(createDefaultSubnetRequest)
    }

  override def createDefaultVpc(createDefaultVpcRequest: CreateDefaultVpcRequest): Task[CreateDefaultVpcResponse] =
    Task.deferFuture {
      underlying.createDefaultVpc(createDefaultVpcRequest)
    }

  override def createDefaultVpc(): Task[CreateDefaultVpcResponse] =
    Task.deferFuture {
      underlying.createDefaultVpc()
    }

  override def createDhcpOptions(createDhcpOptionsRequest: CreateDhcpOptionsRequest): Task[CreateDhcpOptionsResponse] =
    Task.deferFuture {
      underlying.createDhcpOptions(createDhcpOptionsRequest)
    }

  override def createEgressOnlyInternetGateway(
      createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest
  ): Task[CreateEgressOnlyInternetGatewayResponse] =
    Task.deferFuture {
      underlying.createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest)
    }

  override def createFleet(createFleetRequest: CreateFleetRequest): Task[CreateFleetResponse] =
    Task.deferFuture {
      underlying.createFleet(createFleetRequest)
    }

  override def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): Task[CreateFlowLogsResponse] =
    Task.deferFuture {
      underlying.createFlowLogs(createFlowLogsRequest)
    }

  override def createFpgaImage(createFpgaImageRequest: CreateFpgaImageRequest): Task[CreateFpgaImageResponse] =
    Task.deferFuture {
      underlying.createFpgaImage(createFpgaImageRequest)
    }

  override def createImage(createImageRequest: CreateImageRequest): Task[CreateImageResponse] =
    Task.deferFuture {
      underlying.createImage(createImageRequest)
    }

  override def createInstanceExportTask(
      createInstanceExportTaskRequest: CreateInstanceExportTaskRequest
  ): Task[CreateInstanceExportTaskResponse] =
    Task.deferFuture {
      underlying.createInstanceExportTask(createInstanceExportTaskRequest)
    }

  override def createInternetGateway(
      createInternetGatewayRequest: CreateInternetGatewayRequest
  ): Task[CreateInternetGatewayResponse] =
    Task.deferFuture {
      underlying.createInternetGateway(createInternetGatewayRequest)
    }

  override def createInternetGateway(): Task[CreateInternetGatewayResponse] =
    Task.deferFuture {
      underlying.createInternetGateway()
    }

  override def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): Task[CreateKeyPairResponse] =
    Task.deferFuture {
      underlying.createKeyPair(createKeyPairRequest)
    }

  override def createLaunchTemplate(
      createLaunchTemplateRequest: CreateLaunchTemplateRequest
  ): Task[CreateLaunchTemplateResponse] =
    Task.deferFuture {
      underlying.createLaunchTemplate(createLaunchTemplateRequest)
    }

  override def createLaunchTemplateVersion(
      createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest
  ): Task[CreateLaunchTemplateVersionResponse] =
    Task.deferFuture {
      underlying.createLaunchTemplateVersion(createLaunchTemplateVersionRequest)
    }

  override def createNatGateway(createNatGatewayRequest: CreateNatGatewayRequest): Task[CreateNatGatewayResponse] =
    Task.deferFuture {
      underlying.createNatGateway(createNatGatewayRequest)
    }

  override def createNetworkAcl(createNetworkAclRequest: CreateNetworkAclRequest): Task[CreateNetworkAclResponse] =
    Task.deferFuture {
      underlying.createNetworkAcl(createNetworkAclRequest)
    }

  override def createNetworkAclEntry(
      createNetworkAclEntryRequest: CreateNetworkAclEntryRequest
  ): Task[CreateNetworkAclEntryResponse] =
    Task.deferFuture {
      underlying.createNetworkAclEntry(createNetworkAclEntryRequest)
    }

  override def createNetworkInterface(
      createNetworkInterfaceRequest: CreateNetworkInterfaceRequest
  ): Task[CreateNetworkInterfaceResponse] =
    Task.deferFuture {
      underlying.createNetworkInterface(createNetworkInterfaceRequest)
    }

  override def createNetworkInterfacePermission(
      createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest
  ): Task[CreateNetworkInterfacePermissionResponse] =
    Task.deferFuture {
      underlying.createNetworkInterfacePermission(createNetworkInterfacePermissionRequest)
    }

  override def createPlacementGroup(
      createPlacementGroupRequest: CreatePlacementGroupRequest
  ): Task[CreatePlacementGroupResponse] =
    Task.deferFuture {
      underlying.createPlacementGroup(createPlacementGroupRequest)
    }

  override def createReservedInstancesListing(
      createReservedInstancesListingRequest: CreateReservedInstancesListingRequest
  ): Task[CreateReservedInstancesListingResponse] =
    Task.deferFuture {
      underlying.createReservedInstancesListing(createReservedInstancesListingRequest)
    }

  override def createRoute(createRouteRequest: CreateRouteRequest): Task[CreateRouteResponse] =
    Task.deferFuture {
      underlying.createRoute(createRouteRequest)
    }

  override def createRouteTable(createRouteTableRequest: CreateRouteTableRequest): Task[CreateRouteTableResponse] =
    Task.deferFuture {
      underlying.createRouteTable(createRouteTableRequest)
    }

  override def createSecurityGroup(
      createSecurityGroupRequest: CreateSecurityGroupRequest
  ): Task[CreateSecurityGroupResponse] =
    Task.deferFuture {
      underlying.createSecurityGroup(createSecurityGroupRequest)
    }

  override def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): Task[CreateSnapshotResponse] =
    Task.deferFuture {
      underlying.createSnapshot(createSnapshotRequest)
    }

  override def createSpotDatafeedSubscription(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest
  ): Task[CreateSpotDatafeedSubscriptionResponse] =
    Task.deferFuture {
      underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest)
    }

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): Task[CreateSubnetResponse] =
    Task.deferFuture {
      underlying.createSubnet(createSubnetRequest)
    }

  override def createTags(createTagsRequest: CreateTagsRequest): Task[CreateTagsResponse] =
    Task.deferFuture {
      underlying.createTags(createTagsRequest)
    }

  override def createTransitGateway(
      createTransitGatewayRequest: CreateTransitGatewayRequest
  ): Task[CreateTransitGatewayResponse] =
    Task.deferFuture {
      underlying.createTransitGateway(createTransitGatewayRequest)
    }

  override def createTransitGateway(): Task[CreateTransitGatewayResponse] =
    Task.deferFuture {
      underlying.createTransitGateway()
    }

  override def createTransitGatewayRoute(
      createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest
  ): Task[CreateTransitGatewayRouteResponse] =
    Task.deferFuture {
      underlying.createTransitGatewayRoute(createTransitGatewayRouteRequest)
    }

  override def createTransitGatewayRouteTable(
      createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest
  ): Task[CreateTransitGatewayRouteTableResponse] =
    Task.deferFuture {
      underlying.createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest)
    }

  override def createTransitGatewayVpcAttachment(
      createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest
  ): Task[CreateTransitGatewayVpcAttachmentResponse] =
    Task.deferFuture {
      underlying.createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest)
    }

  override def createVolume(createVolumeRequest: CreateVolumeRequest): Task[CreateVolumeResponse] =
    Task.deferFuture {
      underlying.createVolume(createVolumeRequest)
    }

  override def createVpc(createVpcRequest: CreateVpcRequest): Task[CreateVpcResponse] =
    Task.deferFuture {
      underlying.createVpc(createVpcRequest)
    }

  override def createVpcEndpoint(createVpcEndpointRequest: CreateVpcEndpointRequest): Task[CreateVpcEndpointResponse] =
    Task.deferFuture {
      underlying.createVpcEndpoint(createVpcEndpointRequest)
    }

  override def createVpcEndpointConnectionNotification(
      createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest
  ): Task[CreateVpcEndpointConnectionNotificationResponse] =
    Task.deferFuture {
      underlying.createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest)
    }

  override def createVpcEndpointServiceConfiguration(
      createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest
  ): Task[CreateVpcEndpointServiceConfigurationResponse] =
    Task.deferFuture {
      underlying.createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest)
    }

  override def createVpcPeeringConnection(
      createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest
  ): Task[CreateVpcPeeringConnectionResponse] =
    Task.deferFuture {
      underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest)
    }

  override def createVpnConnection(
      createVpnConnectionRequest: CreateVpnConnectionRequest
  ): Task[CreateVpnConnectionResponse] =
    Task.deferFuture {
      underlying.createVpnConnection(createVpnConnectionRequest)
    }

  override def createVpnConnectionRoute(
      createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest
  ): Task[CreateVpnConnectionRouteResponse] =
    Task.deferFuture {
      underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest)
    }

  override def createVpnGateway(createVpnGatewayRequest: CreateVpnGatewayRequest): Task[CreateVpnGatewayResponse] =
    Task.deferFuture {
      underlying.createVpnGateway(createVpnGatewayRequest)
    }

  override def deleteClientVpnEndpoint(
      deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest
  ): Task[DeleteClientVpnEndpointResponse] =
    Task.deferFuture {
      underlying.deleteClientVpnEndpoint(deleteClientVpnEndpointRequest)
    }

  override def deleteClientVpnRoute(
      deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest
  ): Task[DeleteClientVpnRouteResponse] =
    Task.deferFuture {
      underlying.deleteClientVpnRoute(deleteClientVpnRouteRequest)
    }

  override def deleteCustomerGateway(
      deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest
  ): Task[DeleteCustomerGatewayResponse] =
    Task.deferFuture {
      underlying.deleteCustomerGateway(deleteCustomerGatewayRequest)
    }

  override def deleteDhcpOptions(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): Task[DeleteDhcpOptionsResponse] =
    Task.deferFuture {
      underlying.deleteDhcpOptions(deleteDhcpOptionsRequest)
    }

  override def deleteEgressOnlyInternetGateway(
      deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest
  ): Task[DeleteEgressOnlyInternetGatewayResponse] =
    Task.deferFuture {
      underlying.deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest)
    }

  override def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): Task[DeleteFleetsResponse] =
    Task.deferFuture {
      underlying.deleteFleets(deleteFleetsRequest)
    }

  override def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): Task[DeleteFlowLogsResponse] =
    Task.deferFuture {
      underlying.deleteFlowLogs(deleteFlowLogsRequest)
    }

  override def deleteFpgaImage(deleteFpgaImageRequest: DeleteFpgaImageRequest): Task[DeleteFpgaImageResponse] =
    Task.deferFuture {
      underlying.deleteFpgaImage(deleteFpgaImageRequest)
    }

  override def deleteInternetGateway(
      deleteInternetGatewayRequest: DeleteInternetGatewayRequest
  ): Task[DeleteInternetGatewayResponse] =
    Task.deferFuture {
      underlying.deleteInternetGateway(deleteInternetGatewayRequest)
    }

  override def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): Task[DeleteKeyPairResponse] =
    Task.deferFuture {
      underlying.deleteKeyPair(deleteKeyPairRequest)
    }

  override def deleteLaunchTemplate(
      deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest
  ): Task[DeleteLaunchTemplateResponse] =
    Task.deferFuture {
      underlying.deleteLaunchTemplate(deleteLaunchTemplateRequest)
    }

  override def deleteLaunchTemplateVersions(
      deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest
  ): Task[DeleteLaunchTemplateVersionsResponse] =
    Task.deferFuture {
      underlying.deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest)
    }

  override def deleteNatGateway(deleteNatGatewayRequest: DeleteNatGatewayRequest): Task[DeleteNatGatewayResponse] =
    Task.deferFuture {
      underlying.deleteNatGateway(deleteNatGatewayRequest)
    }

  override def deleteNetworkAcl(deleteNetworkAclRequest: DeleteNetworkAclRequest): Task[DeleteNetworkAclResponse] =
    Task.deferFuture {
      underlying.deleteNetworkAcl(deleteNetworkAclRequest)
    }

  override def deleteNetworkAclEntry(
      deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest
  ): Task[DeleteNetworkAclEntryResponse] =
    Task.deferFuture {
      underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest)
    }

  override def deleteNetworkInterface(
      deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest
  ): Task[DeleteNetworkInterfaceResponse] =
    Task.deferFuture {
      underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest)
    }

  override def deleteNetworkInterfacePermission(
      deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest
  ): Task[DeleteNetworkInterfacePermissionResponse] =
    Task.deferFuture {
      underlying.deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest)
    }

  override def deletePlacementGroup(
      deletePlacementGroupRequest: DeletePlacementGroupRequest
  ): Task[DeletePlacementGroupResponse] =
    Task.deferFuture {
      underlying.deletePlacementGroup(deletePlacementGroupRequest)
    }

  override def deleteRoute(deleteRouteRequest: DeleteRouteRequest): Task[DeleteRouteResponse] =
    Task.deferFuture {
      underlying.deleteRoute(deleteRouteRequest)
    }

  override def deleteRouteTable(deleteRouteTableRequest: DeleteRouteTableRequest): Task[DeleteRouteTableResponse] =
    Task.deferFuture {
      underlying.deleteRouteTable(deleteRouteTableRequest)
    }

  override def deleteSecurityGroup(
      deleteSecurityGroupRequest: DeleteSecurityGroupRequest
  ): Task[DeleteSecurityGroupResponse] =
    Task.deferFuture {
      underlying.deleteSecurityGroup(deleteSecurityGroupRequest)
    }

  override def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): Task[DeleteSnapshotResponse] =
    Task.deferFuture {
      underlying.deleteSnapshot(deleteSnapshotRequest)
    }

  override def deleteSpotDatafeedSubscription(
      deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest
  ): Task[DeleteSpotDatafeedSubscriptionResponse] =
    Task.deferFuture {
      underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest)
    }

  override def deleteSpotDatafeedSubscription(): Task[DeleteSpotDatafeedSubscriptionResponse] =
    Task.deferFuture {
      underlying.deleteSpotDatafeedSubscription()
    }

  override def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): Task[DeleteSubnetResponse] =
    Task.deferFuture {
      underlying.deleteSubnet(deleteSubnetRequest)
    }

  override def deleteTags(deleteTagsRequest: DeleteTagsRequest): Task[DeleteTagsResponse] =
    Task.deferFuture {
      underlying.deleteTags(deleteTagsRequest)
    }

  override def deleteTransitGateway(
      deleteTransitGatewayRequest: DeleteTransitGatewayRequest
  ): Task[DeleteTransitGatewayResponse] =
    Task.deferFuture {
      underlying.deleteTransitGateway(deleteTransitGatewayRequest)
    }

  override def deleteTransitGatewayRoute(
      deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest
  ): Task[DeleteTransitGatewayRouteResponse] =
    Task.deferFuture {
      underlying.deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest)
    }

  override def deleteTransitGatewayRouteTable(
      deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest
  ): Task[DeleteTransitGatewayRouteTableResponse] =
    Task.deferFuture {
      underlying.deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest)
    }

  override def deleteTransitGatewayVpcAttachment(
      deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest
  ): Task[DeleteTransitGatewayVpcAttachmentResponse] =
    Task.deferFuture {
      underlying.deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest)
    }

  override def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): Task[DeleteVolumeResponse] =
    Task.deferFuture {
      underlying.deleteVolume(deleteVolumeRequest)
    }

  override def deleteVpc(deleteVpcRequest: DeleteVpcRequest): Task[DeleteVpcResponse] =
    Task.deferFuture {
      underlying.deleteVpc(deleteVpcRequest)
    }

  override def deleteVpcEndpointConnectionNotifications(
      deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest
  ): Task[DeleteVpcEndpointConnectionNotificationsResponse] =
    Task.deferFuture {
      underlying.deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest)
    }

  override def deleteVpcEndpointServiceConfigurations(
      deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest
  ): Task[DeleteVpcEndpointServiceConfigurationsResponse] =
    Task.deferFuture {
      underlying.deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest)
    }

  override def deleteVpcEndpoints(
      deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest
  ): Task[DeleteVpcEndpointsResponse] =
    Task.deferFuture {
      underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest)
    }

  override def deleteVpcPeeringConnection(
      deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest
  ): Task[DeleteVpcPeeringConnectionResponse] =
    Task.deferFuture {
      underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest)
    }

  override def deleteVpnConnection(
      deleteVpnConnectionRequest: DeleteVpnConnectionRequest
  ): Task[DeleteVpnConnectionResponse] =
    Task.deferFuture {
      underlying.deleteVpnConnection(deleteVpnConnectionRequest)
    }

  override def deleteVpnConnectionRoute(
      deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest
  ): Task[DeleteVpnConnectionRouteResponse] =
    Task.deferFuture {
      underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest)
    }

  override def deleteVpnGateway(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): Task[DeleteVpnGatewayResponse] =
    Task.deferFuture {
      underlying.deleteVpnGateway(deleteVpnGatewayRequest)
    }

  override def deprovisionByoipCidr(
      deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest
  ): Task[DeprovisionByoipCidrResponse] =
    Task.deferFuture {
      underlying.deprovisionByoipCidr(deprovisionByoipCidrRequest)
    }

  override def deregisterImage(deregisterImageRequest: DeregisterImageRequest): Task[DeregisterImageResponse] =
    Task.deferFuture {
      underlying.deregisterImage(deregisterImageRequest)
    }

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Task[DescribeAccountAttributesResponse] =
    Task.deferFuture {
      underlying.describeAccountAttributes(describeAccountAttributesRequest)
    }

  override def describeAccountAttributes(): Task[DescribeAccountAttributesResponse] =
    Task.deferFuture {
      underlying.describeAccountAttributes()
    }

  override def describeAddresses(describeAddressesRequest: DescribeAddressesRequest): Task[DescribeAddressesResponse] =
    Task.deferFuture {
      underlying.describeAddresses(describeAddressesRequest)
    }

  override def describeAddresses(): Task[DescribeAddressesResponse] =
    Task.deferFuture {
      underlying.describeAddresses()
    }

  override def describeAggregateIdFormat(
      describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest
  ): Task[DescribeAggregateIdFormatResponse] =
    Task.deferFuture {
      underlying.describeAggregateIdFormat(describeAggregateIdFormatRequest)
    }

  override def describeAggregateIdFormat(): Task[DescribeAggregateIdFormatResponse] =
    Task.deferFuture {
      underlying.describeAggregateIdFormat()
    }

  override def describeAvailabilityZones(
      describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest
  ): Task[DescribeAvailabilityZonesResponse] =
    Task.deferFuture {
      underlying.describeAvailabilityZones(describeAvailabilityZonesRequest)
    }

  override def describeAvailabilityZones(): Task[DescribeAvailabilityZonesResponse] =
    Task.deferFuture {
      underlying.describeAvailabilityZones()
    }

  override def describeBundleTasks(
      describeBundleTasksRequest: DescribeBundleTasksRequest
  ): Task[DescribeBundleTasksResponse] =
    Task.deferFuture {
      underlying.describeBundleTasks(describeBundleTasksRequest)
    }

  override def describeBundleTasks(): Task[DescribeBundleTasksResponse] =
    Task.deferFuture {
      underlying.describeBundleTasks()
    }

  override def describeByoipCidrs(
      describeByoipCidrsRequest: DescribeByoipCidrsRequest
  ): Task[DescribeByoipCidrsResponse] =
    Task.deferFuture {
      underlying.describeByoipCidrs(describeByoipCidrsRequest)
    }

  override def describeCapacityReservations(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): Task[DescribeCapacityReservationsResponse] =
    Task.deferFuture {
      underlying.describeCapacityReservations(describeCapacityReservationsRequest)
    }

  override def describeCapacityReservations(): Task[DescribeCapacityReservationsResponse] =
    Task.deferFuture {
      underlying.describeCapacityReservations()
    }

  override def describeClassicLinkInstances(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): Task[DescribeClassicLinkInstancesResponse] =
    Task.deferFuture {
      underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest)
    }

  override def describeClassicLinkInstances(): Task[DescribeClassicLinkInstancesResponse] =
    Task.deferFuture {
      underlying.describeClassicLinkInstances()
    }

  override def describeClientVpnAuthorizationRules(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): Task[DescribeClientVpnAuthorizationRulesResponse] =
    Task.deferFuture {
      underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest)
    }

  override def describeClientVpnConnections(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): Task[DescribeClientVpnConnectionsResponse] =
    Task.deferFuture {
      underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest)
    }

  override def describeClientVpnEndpoints(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): Task[DescribeClientVpnEndpointsResponse] =
    Task.deferFuture {
      underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest)
    }

  override def describeClientVpnEndpoints(): Task[DescribeClientVpnEndpointsResponse] =
    Task.deferFuture {
      underlying.describeClientVpnEndpoints()
    }

  override def describeClientVpnRoutes(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): Task[DescribeClientVpnRoutesResponse] =
    Task.deferFuture {
      underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest)
    }

  override def describeClientVpnTargetNetworks(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): Task[DescribeClientVpnTargetNetworksResponse] =
    Task.deferFuture {
      underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest)
    }

  override def describeConversionTasks(
      describeConversionTasksRequest: DescribeConversionTasksRequest
  ): Task[DescribeConversionTasksResponse] =
    Task.deferFuture {
      underlying.describeConversionTasks(describeConversionTasksRequest)
    }

  override def describeConversionTasks(): Task[DescribeConversionTasksResponse] =
    Task.deferFuture {
      underlying.describeConversionTasks()
    }

  override def describeCustomerGateways(
      describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest
  ): Task[DescribeCustomerGatewaysResponse] =
    Task.deferFuture {
      underlying.describeCustomerGateways(describeCustomerGatewaysRequest)
    }

  override def describeCustomerGateways(): Task[DescribeCustomerGatewaysResponse] =
    Task.deferFuture {
      underlying.describeCustomerGateways()
    }

  override def describeDhcpOptions(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): Task[DescribeDhcpOptionsResponse] =
    Task.deferFuture {
      underlying.describeDhcpOptions(describeDhcpOptionsRequest)
    }

  override def describeDhcpOptions(): Task[DescribeDhcpOptionsResponse] =
    Task.deferFuture {
      underlying.describeDhcpOptions()
    }

  override def describeEgressOnlyInternetGateways(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): Task[DescribeEgressOnlyInternetGatewaysResponse] =
    Task.deferFuture {
      underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest)
    }

  override def describeEgressOnlyInternetGateways(): Task[DescribeEgressOnlyInternetGatewaysResponse] =
    Task.deferFuture {
      underlying.describeEgressOnlyInternetGateways()
    }

  override def describeElasticGpus(
      describeElasticGpusRequest: DescribeElasticGpusRequest
  ): Task[DescribeElasticGpusResponse] =
    Task.deferFuture {
      underlying.describeElasticGpus(describeElasticGpusRequest)
    }

  override def describeElasticGpus(): Task[DescribeElasticGpusResponse] =
    Task.deferFuture {
      underlying.describeElasticGpus()
    }

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Task[DescribeExportTasksResponse] =
    Task.deferFuture {
      underlying.describeExportTasks(describeExportTasksRequest)
    }

  override def describeExportTasks(): Task[DescribeExportTasksResponse] =
    Task.deferFuture {
      underlying.describeExportTasks()
    }

  override def describeFleetHistory(
      describeFleetHistoryRequest: DescribeFleetHistoryRequest
  ): Task[DescribeFleetHistoryResponse] =
    Task.deferFuture {
      underlying.describeFleetHistory(describeFleetHistoryRequest)
    }

  override def describeFleetInstances(
      describeFleetInstancesRequest: DescribeFleetInstancesRequest
  ): Task[DescribeFleetInstancesResponse] =
    Task.deferFuture {
      underlying.describeFleetInstances(describeFleetInstancesRequest)
    }

  override def describeFleets(describeFleetsRequest: DescribeFleetsRequest): Task[DescribeFleetsResponse] =
    Task.deferFuture {
      underlying.describeFleets(describeFleetsRequest)
    }

  override def describeFleets(): Task[DescribeFleetsResponse] =
    Task.deferFuture {
      underlying.describeFleets()
    }

  override def describeFlowLogs(describeFlowLogsRequest: DescribeFlowLogsRequest): Task[DescribeFlowLogsResponse] =
    Task.deferFuture {
      underlying.describeFlowLogs(describeFlowLogsRequest)
    }

  override def describeFlowLogs(): Task[DescribeFlowLogsResponse] =
    Task.deferFuture {
      underlying.describeFlowLogs()
    }

  override def describeFpgaImageAttribute(
      describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest
  ): Task[DescribeFpgaImageAttributeResponse] =
    Task.deferFuture {
      underlying.describeFpgaImageAttribute(describeFpgaImageAttributeRequest)
    }

  override def describeFpgaImages(
      describeFpgaImagesRequest: DescribeFpgaImagesRequest
  ): Task[DescribeFpgaImagesResponse] =
    Task.deferFuture {
      underlying.describeFpgaImages(describeFpgaImagesRequest)
    }

  override def describeFpgaImages(): Task[DescribeFpgaImagesResponse] =
    Task.deferFuture {
      underlying.describeFpgaImages()
    }

  override def describeHostReservationOfferings(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): Task[DescribeHostReservationOfferingsResponse] =
    Task.deferFuture {
      underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest)
    }

  override def describeHostReservationOfferings(): Task[DescribeHostReservationOfferingsResponse] =
    Task.deferFuture {
      underlying.describeHostReservationOfferings()
    }

  override def describeHostReservations(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): Task[DescribeHostReservationsResponse] =
    Task.deferFuture {
      underlying.describeHostReservations(describeHostReservationsRequest)
    }

  override def describeHostReservations(): Task[DescribeHostReservationsResponse] =
    Task.deferFuture {
      underlying.describeHostReservations()
    }

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): Task[DescribeHostsResponse] =
    Task.deferFuture {
      underlying.describeHosts(describeHostsRequest)
    }

  override def describeHosts(): Task[DescribeHostsResponse] =
    Task.deferFuture {
      underlying.describeHosts()
    }

  override def describeIamInstanceProfileAssociations(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): Task[DescribeIamInstanceProfileAssociationsResponse] =
    Task.deferFuture {
      underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest)
    }

  override def describeIamInstanceProfileAssociations(): Task[DescribeIamInstanceProfileAssociationsResponse] =
    Task.deferFuture {
      underlying.describeIamInstanceProfileAssociations()
    }

  override def describeIdFormat(describeIdFormatRequest: DescribeIdFormatRequest): Task[DescribeIdFormatResponse] =
    Task.deferFuture {
      underlying.describeIdFormat(describeIdFormatRequest)
    }

  override def describeIdFormat(): Task[DescribeIdFormatResponse] =
    Task.deferFuture {
      underlying.describeIdFormat()
    }

  override def describeIdentityIdFormat(
      describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest
  ): Task[DescribeIdentityIdFormatResponse] =
    Task.deferFuture {
      underlying.describeIdentityIdFormat(describeIdentityIdFormatRequest)
    }

  override def describeImageAttribute(
      describeImageAttributeRequest: DescribeImageAttributeRequest
  ): Task[DescribeImageAttributeResponse] =
    Task.deferFuture {
      underlying.describeImageAttribute(describeImageAttributeRequest)
    }

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Task[DescribeImagesResponse] =
    Task.deferFuture {
      underlying.describeImages(describeImagesRequest)
    }

  override def describeImages(): Task[DescribeImagesResponse] =
    Task.deferFuture {
      underlying.describeImages()
    }

  override def describeImportImageTasks(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): Task[DescribeImportImageTasksResponse] =
    Task.deferFuture {
      underlying.describeImportImageTasks(describeImportImageTasksRequest)
    }

  override def describeImportImageTasks(): Task[DescribeImportImageTasksResponse] =
    Task.deferFuture {
      underlying.describeImportImageTasks()
    }

  override def describeImportSnapshotTasks(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): Task[DescribeImportSnapshotTasksResponse] =
    Task.deferFuture {
      underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest)
    }

  override def describeImportSnapshotTasks(): Task[DescribeImportSnapshotTasksResponse] =
    Task.deferFuture {
      underlying.describeImportSnapshotTasks()
    }

  override def describeInstanceAttribute(
      describeInstanceAttributeRequest: DescribeInstanceAttributeRequest
  ): Task[DescribeInstanceAttributeResponse] =
    Task.deferFuture {
      underlying.describeInstanceAttribute(describeInstanceAttributeRequest)
    }

  override def describeInstanceCreditSpecifications(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): Task[DescribeInstanceCreditSpecificationsResponse] =
    Task.deferFuture {
      underlying.describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest)
    }

  override def describeInstanceCreditSpecifications(): Task[DescribeInstanceCreditSpecificationsResponse] =
    Task.deferFuture {
      underlying.describeInstanceCreditSpecifications()
    }

  override def describeInstanceStatus(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): Task[DescribeInstanceStatusResponse] =
    Task.deferFuture {
      underlying.describeInstanceStatus(describeInstanceStatusRequest)
    }

  override def describeInstanceStatus(): Task[DescribeInstanceStatusResponse] =
    Task.deferFuture {
      underlying.describeInstanceStatus()
    }

  def describeInstanceStatusPaginator(): Observable[DescribeInstanceStatusResponse] =
    Observable.fromReactivePublisher(underlying.describeInstanceStatusPaginator())

  def describeInstanceStatusPaginator(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): Observable[DescribeInstanceStatusResponse] =
    Observable.fromReactivePublisher(underlying.describeInstanceStatusPaginator(describeInstanceStatusRequest))

  override def describeInstances(describeInstancesRequest: DescribeInstancesRequest): Task[DescribeInstancesResponse] =
    Task.deferFuture {
      underlying.describeInstances(describeInstancesRequest)
    }

  override def describeInstances(): Task[DescribeInstancesResponse] =
    Task.deferFuture {
      underlying.describeInstances()
    }

  def describeInstancesPaginator(): Observable[DescribeInstancesResponse] =
    Observable.fromReactivePublisher(underlying.describeInstancesPaginator())

  def describeInstancesPaginator(
      describeInstancesRequest: DescribeInstancesRequest
  ): Observable[DescribeInstancesResponse] =
    Observable.fromReactivePublisher(underlying.describeInstancesPaginator(describeInstancesRequest))

  override def describeInternetGateways(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): Task[DescribeInternetGatewaysResponse] =
    Task.deferFuture {
      underlying.describeInternetGateways(describeInternetGatewaysRequest)
    }

  override def describeInternetGateways(): Task[DescribeInternetGatewaysResponse] =
    Task.deferFuture {
      underlying.describeInternetGateways()
    }

  override def describeKeyPairs(describeKeyPairsRequest: DescribeKeyPairsRequest): Task[DescribeKeyPairsResponse] =
    Task.deferFuture {
      underlying.describeKeyPairs(describeKeyPairsRequest)
    }

  override def describeKeyPairs(): Task[DescribeKeyPairsResponse] =
    Task.deferFuture {
      underlying.describeKeyPairs()
    }

  override def describeLaunchTemplateVersions(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): Task[DescribeLaunchTemplateVersionsResponse] =
    Task.deferFuture {
      underlying.describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest)
    }

  override def describeLaunchTemplates(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): Task[DescribeLaunchTemplatesResponse] =
    Task.deferFuture {
      underlying.describeLaunchTemplates(describeLaunchTemplatesRequest)
    }

  override def describeLaunchTemplates(): Task[DescribeLaunchTemplatesResponse] =
    Task.deferFuture {
      underlying.describeLaunchTemplates()
    }

  override def describeMovingAddresses(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): Task[DescribeMovingAddressesResponse] =
    Task.deferFuture {
      underlying.describeMovingAddresses(describeMovingAddressesRequest)
    }

  override def describeMovingAddresses(): Task[DescribeMovingAddressesResponse] =
    Task.deferFuture {
      underlying.describeMovingAddresses()
    }

  override def describeNatGateways(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): Task[DescribeNatGatewaysResponse] =
    Task.deferFuture {
      underlying.describeNatGateways(describeNatGatewaysRequest)
    }

  override def describeNatGateways(): Task[DescribeNatGatewaysResponse] =
    Task.deferFuture {
      underlying.describeNatGateways()
    }

  def describeNatGatewaysPaginator(): Observable[DescribeNatGatewaysResponse] =
    Observable.fromReactivePublisher(underlying.describeNatGatewaysPaginator())

  def describeNatGatewaysPaginator(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): Observable[DescribeNatGatewaysResponse] =
    Observable.fromReactivePublisher(underlying.describeNatGatewaysPaginator(describeNatGatewaysRequest))

  override def describeNetworkAcls(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): Task[DescribeNetworkAclsResponse] =
    Task.deferFuture {
      underlying.describeNetworkAcls(describeNetworkAclsRequest)
    }

  override def describeNetworkAcls(): Task[DescribeNetworkAclsResponse] =
    Task.deferFuture {
      underlying.describeNetworkAcls()
    }

  override def describeNetworkInterfaceAttribute(
      describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest
  ): Task[DescribeNetworkInterfaceAttributeResponse] =
    Task.deferFuture {
      underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest)
    }

  override def describeNetworkInterfacePermissions(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): Task[DescribeNetworkInterfacePermissionsResponse] =
    Task.deferFuture {
      underlying.describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest)
    }

  override def describeNetworkInterfacePermissions(): Task[DescribeNetworkInterfacePermissionsResponse] =
    Task.deferFuture {
      underlying.describeNetworkInterfacePermissions()
    }

  override def describeNetworkInterfaces(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): Task[DescribeNetworkInterfacesResponse] =
    Task.deferFuture {
      underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest)
    }

  override def describeNetworkInterfaces(): Task[DescribeNetworkInterfacesResponse] =
    Task.deferFuture {
      underlying.describeNetworkInterfaces()
    }

  def describeNetworkInterfacesPaginator(): Observable[DescribeNetworkInterfacesResponse] =
    Observable.fromReactivePublisher(underlying.describeNetworkInterfacesPaginator())

  def describeNetworkInterfacesPaginator(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): Observable[DescribeNetworkInterfacesResponse] =
    Observable.fromReactivePublisher(underlying.describeNetworkInterfacesPaginator(describeNetworkInterfacesRequest))

  override def describePlacementGroups(
      describePlacementGroupsRequest: DescribePlacementGroupsRequest
  ): Task[DescribePlacementGroupsResponse] =
    Task.deferFuture {
      underlying.describePlacementGroups(describePlacementGroupsRequest)
    }

  override def describePlacementGroups(): Task[DescribePlacementGroupsResponse] =
    Task.deferFuture {
      underlying.describePlacementGroups()
    }

  override def describePrefixLists(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): Task[DescribePrefixListsResponse] =
    Task.deferFuture {
      underlying.describePrefixLists(describePrefixListsRequest)
    }

  override def describePrefixLists(): Task[DescribePrefixListsResponse] =
    Task.deferFuture {
      underlying.describePrefixLists()
    }

  override def describePrincipalIdFormat(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): Task[DescribePrincipalIdFormatResponse] =
    Task.deferFuture {
      underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest)
    }

  override def describePrincipalIdFormat(): Task[DescribePrincipalIdFormatResponse] =
    Task.deferFuture {
      underlying.describePrincipalIdFormat()
    }

  override def describePublicIpv4Pools(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): Task[DescribePublicIpv4PoolsResponse] =
    Task.deferFuture {
      underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest)
    }

  override def describePublicIpv4Pools(): Task[DescribePublicIpv4PoolsResponse] =
    Task.deferFuture {
      underlying.describePublicIpv4Pools()
    }

  override def describeRegions(describeRegionsRequest: DescribeRegionsRequest): Task[DescribeRegionsResponse] =
    Task.deferFuture {
      underlying.describeRegions(describeRegionsRequest)
    }

  override def describeRegions(): Task[DescribeRegionsResponse] =
    Task.deferFuture {
      underlying.describeRegions()
    }

  override def describeReservedInstances(
      describeReservedInstancesRequest: DescribeReservedInstancesRequest
  ): Task[DescribeReservedInstancesResponse] =
    Task.deferFuture {
      underlying.describeReservedInstances(describeReservedInstancesRequest)
    }

  override def describeReservedInstances(): Task[DescribeReservedInstancesResponse] =
    Task.deferFuture {
      underlying.describeReservedInstances()
    }

  override def describeReservedInstancesListings(
      describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest
  ): Task[DescribeReservedInstancesListingsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest)
    }

  override def describeReservedInstancesListings(): Task[DescribeReservedInstancesListingsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesListings()
    }

  override def describeReservedInstancesModifications(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): Task[DescribeReservedInstancesModificationsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest)
    }

  override def describeReservedInstancesModifications(): Task[DescribeReservedInstancesModificationsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesModifications()
    }

  def describeReservedInstancesModificationsPaginator(): Observable[DescribeReservedInstancesModificationsResponse] =
    Observable.fromReactivePublisher(underlying.describeReservedInstancesModificationsPaginator())

  def describeReservedInstancesModificationsPaginator(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): Observable[DescribeReservedInstancesModificationsResponse] =
    Observable.fromReactivePublisher(
      underlying.describeReservedInstancesModificationsPaginator(describeReservedInstancesModificationsRequest)
    )

  override def describeReservedInstancesOfferings(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): Task[DescribeReservedInstancesOfferingsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest)
    }

  override def describeReservedInstancesOfferings(): Task[DescribeReservedInstancesOfferingsResponse] =
    Task.deferFuture {
      underlying.describeReservedInstancesOfferings()
    }

  def describeReservedInstancesOfferingsPaginator(): Observable[DescribeReservedInstancesOfferingsResponse] =
    Observable.fromReactivePublisher(underlying.describeReservedInstancesOfferingsPaginator())

  def describeReservedInstancesOfferingsPaginator(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): Observable[DescribeReservedInstancesOfferingsResponse] =
    Observable.fromReactivePublisher(
      underlying.describeReservedInstancesOfferingsPaginator(describeReservedInstancesOfferingsRequest)
    )

  override def describeRouteTables(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): Task[DescribeRouteTablesResponse] =
    Task.deferFuture {
      underlying.describeRouteTables(describeRouteTablesRequest)
    }

  override def describeRouteTables(): Task[DescribeRouteTablesResponse] =
    Task.deferFuture {
      underlying.describeRouteTables()
    }

  def describeRouteTablesPaginator(): Observable[DescribeRouteTablesResponse] =
    Observable.fromReactivePublisher(underlying.describeRouteTablesPaginator())

  def describeRouteTablesPaginator(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): Observable[DescribeRouteTablesResponse] =
    Observable.fromReactivePublisher(underlying.describeRouteTablesPaginator(describeRouteTablesRequest))

  override def describeScheduledInstanceAvailability(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): Task[DescribeScheduledInstanceAvailabilityResponse] =
    Task.deferFuture {
      underlying.describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest)
    }

  override def describeScheduledInstances(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): Task[DescribeScheduledInstancesResponse] =
    Task.deferFuture {
      underlying.describeScheduledInstances(describeScheduledInstancesRequest)
    }

  override def describeScheduledInstances(): Task[DescribeScheduledInstancesResponse] =
    Task.deferFuture {
      underlying.describeScheduledInstances()
    }

  override def describeSecurityGroupReferences(
      describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest
  ): Task[DescribeSecurityGroupReferencesResponse] =
    Task.deferFuture {
      underlying.describeSecurityGroupReferences(describeSecurityGroupReferencesRequest)
    }

  override def describeSecurityGroups(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): Task[DescribeSecurityGroupsResponse] =
    Task.deferFuture {
      underlying.describeSecurityGroups(describeSecurityGroupsRequest)
    }

  override def describeSecurityGroups(): Task[DescribeSecurityGroupsResponse] =
    Task.deferFuture {
      underlying.describeSecurityGroups()
    }

  def describeSecurityGroupsPaginator(): Observable[DescribeSecurityGroupsResponse] =
    Observable.fromReactivePublisher(underlying.describeSecurityGroupsPaginator())

  def describeSecurityGroupsPaginator(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): Observable[DescribeSecurityGroupsResponse] =
    Observable.fromReactivePublisher(underlying.describeSecurityGroupsPaginator(describeSecurityGroupsRequest))

  override def describeSnapshotAttribute(
      describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest
  ): Task[DescribeSnapshotAttributeResponse] =
    Task.deferFuture {
      underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest)
    }

  override def describeSnapshots(describeSnapshotsRequest: DescribeSnapshotsRequest): Task[DescribeSnapshotsResponse] =
    Task.deferFuture {
      underlying.describeSnapshots(describeSnapshotsRequest)
    }

  override def describeSnapshots(): Task[DescribeSnapshotsResponse] =
    Task.deferFuture {
      underlying.describeSnapshots()
    }

  def describeSnapshotsPaginator(): Observable[DescribeSnapshotsResponse] =
    Observable.fromReactivePublisher(underlying.describeSnapshotsPaginator())

  def describeSnapshotsPaginator(
      describeSnapshotsRequest: DescribeSnapshotsRequest
  ): Observable[DescribeSnapshotsResponse] =
    Observable.fromReactivePublisher(underlying.describeSnapshotsPaginator(describeSnapshotsRequest))

  override def describeSpotDatafeedSubscription(
      describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest
  ): Task[DescribeSpotDatafeedSubscriptionResponse] =
    Task.deferFuture {
      underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest)
    }

  override def describeSpotDatafeedSubscription(): Task[DescribeSpotDatafeedSubscriptionResponse] =
    Task.deferFuture {
      underlying.describeSpotDatafeedSubscription()
    }

  override def describeSpotFleetInstances(
      describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest
  ): Task[DescribeSpotFleetInstancesResponse] =
    Task.deferFuture {
      underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest)
    }

  override def describeSpotFleetRequestHistory(
      describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest
  ): Task[DescribeSpotFleetRequestHistoryResponse] =
    Task.deferFuture {
      underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest)
    }

  override def describeSpotFleetRequests(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): Task[DescribeSpotFleetRequestsResponse] =
    Task.deferFuture {
      underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest)
    }

  override def describeSpotFleetRequests(): Task[DescribeSpotFleetRequestsResponse] =
    Task.deferFuture {
      underlying.describeSpotFleetRequests()
    }

  def describeSpotFleetRequestsPaginator(): Observable[DescribeSpotFleetRequestsResponse] =
    Observable.fromReactivePublisher(underlying.describeSpotFleetRequestsPaginator())

  def describeSpotFleetRequestsPaginator(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): Observable[DescribeSpotFleetRequestsResponse] =
    Observable.fromReactivePublisher(underlying.describeSpotFleetRequestsPaginator(describeSpotFleetRequestsRequest))

  override def describeSpotInstanceRequests(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): Task[DescribeSpotInstanceRequestsResponse] =
    Task.deferFuture {
      underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest)
    }

  override def describeSpotInstanceRequests(): Task[DescribeSpotInstanceRequestsResponse] =
    Task.deferFuture {
      underlying.describeSpotInstanceRequests()
    }

  override def describeSpotPriceHistory(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): Task[DescribeSpotPriceHistoryResponse] =
    Task.deferFuture {
      underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest)
    }

  override def describeSpotPriceHistory(): Task[DescribeSpotPriceHistoryResponse] =
    Task.deferFuture {
      underlying.describeSpotPriceHistory()
    }

  def describeSpotPriceHistoryPaginator(): Observable[DescribeSpotPriceHistoryResponse] =
    Observable.fromReactivePublisher(underlying.describeSpotPriceHistoryPaginator())

  def describeSpotPriceHistoryPaginator(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): Observable[DescribeSpotPriceHistoryResponse] =
    Observable.fromReactivePublisher(underlying.describeSpotPriceHistoryPaginator(describeSpotPriceHistoryRequest))

  override def describeStaleSecurityGroups(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): Task[DescribeStaleSecurityGroupsResponse] =
    Task.deferFuture {
      underlying.describeStaleSecurityGroups(describeStaleSecurityGroupsRequest)
    }

  override def describeSubnets(describeSubnetsRequest: DescribeSubnetsRequest): Task[DescribeSubnetsResponse] =
    Task.deferFuture {
      underlying.describeSubnets(describeSubnetsRequest)
    }

  override def describeSubnets(): Task[DescribeSubnetsResponse] =
    Task.deferFuture {
      underlying.describeSubnets()
    }

  override def describeTags(describeTagsRequest: DescribeTagsRequest): Task[DescribeTagsResponse] =
    Task.deferFuture {
      underlying.describeTags(describeTagsRequest)
    }

  override def describeTags(): Task[DescribeTagsResponse] =
    Task.deferFuture {
      underlying.describeTags()
    }

  def describeTagsPaginator(): Observable[DescribeTagsResponse] =
    Observable.fromReactivePublisher(underlying.describeTagsPaginator())

  def describeTagsPaginator(describeTagsRequest: DescribeTagsRequest): Observable[DescribeTagsResponse] =
    Observable.fromReactivePublisher(underlying.describeTagsPaginator(describeTagsRequest))

  override def describeTransitGatewayAttachments(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): Task[DescribeTransitGatewayAttachmentsResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest)
    }

  override def describeTransitGatewayAttachments(): Task[DescribeTransitGatewayAttachmentsResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayAttachments()
    }

  override def describeTransitGatewayRouteTables(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): Task[DescribeTransitGatewayRouteTablesResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest)
    }

  override def describeTransitGatewayRouteTables(): Task[DescribeTransitGatewayRouteTablesResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayRouteTables()
    }

  override def describeTransitGatewayVpcAttachments(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): Task[DescribeTransitGatewayVpcAttachmentsResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest)
    }

  override def describeTransitGatewayVpcAttachments(): Task[DescribeTransitGatewayVpcAttachmentsResponse] =
    Task.deferFuture {
      underlying.describeTransitGatewayVpcAttachments()
    }

  override def describeTransitGateways(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): Task[DescribeTransitGatewaysResponse] =
    Task.deferFuture {
      underlying.describeTransitGateways(describeTransitGatewaysRequest)
    }

  override def describeTransitGateways(): Task[DescribeTransitGatewaysResponse] =
    Task.deferFuture {
      underlying.describeTransitGateways()
    }

  override def describeVolumeAttribute(
      describeVolumeAttributeRequest: DescribeVolumeAttributeRequest
  ): Task[DescribeVolumeAttributeResponse] =
    Task.deferFuture {
      underlying.describeVolumeAttribute(describeVolumeAttributeRequest)
    }

  override def describeVolumeStatus(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): Task[DescribeVolumeStatusResponse] =
    Task.deferFuture {
      underlying.describeVolumeStatus(describeVolumeStatusRequest)
    }

  override def describeVolumeStatus(): Task[DescribeVolumeStatusResponse] =
    Task.deferFuture {
      underlying.describeVolumeStatus()
    }

  def describeVolumeStatusPaginator(): Observable[DescribeVolumeStatusResponse] =
    Observable.fromReactivePublisher(underlying.describeVolumeStatusPaginator())

  def describeVolumeStatusPaginator(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): Observable[DescribeVolumeStatusResponse] =
    Observable.fromReactivePublisher(underlying.describeVolumeStatusPaginator(describeVolumeStatusRequest))

  override def describeVolumes(describeVolumesRequest: DescribeVolumesRequest): Task[DescribeVolumesResponse] =
    Task.deferFuture {
      underlying.describeVolumes(describeVolumesRequest)
    }

  override def describeVolumes(): Task[DescribeVolumesResponse] =
    Task.deferFuture {
      underlying.describeVolumes()
    }

  override def describeVolumesModifications(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): Task[DescribeVolumesModificationsResponse] =
    Task.deferFuture {
      underlying.describeVolumesModifications(describeVolumesModificationsRequest)
    }

  override def describeVolumesModifications(): Task[DescribeVolumesModificationsResponse] =
    Task.deferFuture {
      underlying.describeVolumesModifications()
    }

  def describeVolumesPaginator(): Observable[DescribeVolumesResponse] =
    Observable.fromReactivePublisher(underlying.describeVolumesPaginator())

  def describeVolumesPaginator(describeVolumesRequest: DescribeVolumesRequest): Observable[DescribeVolumesResponse] =
    Observable.fromReactivePublisher(underlying.describeVolumesPaginator(describeVolumesRequest))

  override def describeVpcAttribute(
      describeVpcAttributeRequest: DescribeVpcAttributeRequest
  ): Task[DescribeVpcAttributeResponse] =
    Task.deferFuture {
      underlying.describeVpcAttribute(describeVpcAttributeRequest)
    }

  override def describeVpcClassicLink(
      describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest
  ): Task[DescribeVpcClassicLinkResponse] =
    Task.deferFuture {
      underlying.describeVpcClassicLink(describeVpcClassicLinkRequest)
    }

  override def describeVpcClassicLink(): Task[DescribeVpcClassicLinkResponse] =
    Task.deferFuture {
      underlying.describeVpcClassicLink()
    }

  override def describeVpcClassicLinkDnsSupport(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): Task[DescribeVpcClassicLinkDnsSupportResponse] =
    Task.deferFuture {
      underlying.describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest)
    }

  override def describeVpcClassicLinkDnsSupport(): Task[DescribeVpcClassicLinkDnsSupportResponse] =
    Task.deferFuture {
      underlying.describeVpcClassicLinkDnsSupport()
    }

  override def describeVpcEndpointConnectionNotifications(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): Task[DescribeVpcEndpointConnectionNotificationsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest)
    }

  override def describeVpcEndpointConnectionNotifications(): Task[DescribeVpcEndpointConnectionNotificationsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointConnectionNotifications()
    }

  override def describeVpcEndpointConnections(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): Task[DescribeVpcEndpointConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest)
    }

  override def describeVpcEndpointConnections(): Task[DescribeVpcEndpointConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointConnections()
    }

  override def describeVpcEndpointServiceConfigurations(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): Task[DescribeVpcEndpointServiceConfigurationsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest)
    }

  override def describeVpcEndpointServiceConfigurations(): Task[DescribeVpcEndpointServiceConfigurationsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointServiceConfigurations()
    }

  override def describeVpcEndpointServicePermissions(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): Task[DescribeVpcEndpointServicePermissionsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest)
    }

  override def describeVpcEndpointServices(
      describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest
  ): Task[DescribeVpcEndpointServicesResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest)
    }

  override def describeVpcEndpointServices(): Task[DescribeVpcEndpointServicesResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpointServices()
    }

  override def describeVpcEndpoints(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): Task[DescribeVpcEndpointsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpoints(describeVpcEndpointsRequest)
    }

  override def describeVpcEndpoints(): Task[DescribeVpcEndpointsResponse] =
    Task.deferFuture {
      underlying.describeVpcEndpoints()
    }

  override def describeVpcPeeringConnections(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): Task[DescribeVpcPeeringConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest)
    }

  override def describeVpcPeeringConnections(): Task[DescribeVpcPeeringConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpcPeeringConnections()
    }

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): Task[DescribeVpcsResponse] =
    Task.deferFuture {
      underlying.describeVpcs(describeVpcsRequest)
    }

  override def describeVpcs(): Task[DescribeVpcsResponse] =
    Task.deferFuture {
      underlying.describeVpcs()
    }

  override def describeVpnConnections(
      describeVpnConnectionsRequest: DescribeVpnConnectionsRequest
  ): Task[DescribeVpnConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpnConnections(describeVpnConnectionsRequest)
    }

  override def describeVpnConnections(): Task[DescribeVpnConnectionsResponse] =
    Task.deferFuture {
      underlying.describeVpnConnections()
    }

  override def describeVpnGateways(
      describeVpnGatewaysRequest: DescribeVpnGatewaysRequest
  ): Task[DescribeVpnGatewaysResponse] =
    Task.deferFuture {
      underlying.describeVpnGateways(describeVpnGatewaysRequest)
    }

  override def describeVpnGateways(): Task[DescribeVpnGatewaysResponse] =
    Task.deferFuture {
      underlying.describeVpnGateways()
    }

  override def detachClassicLinkVpc(
      detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest
  ): Task[DetachClassicLinkVpcResponse] =
    Task.deferFuture {
      underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest)
    }

  override def detachInternetGateway(
      detachInternetGatewayRequest: DetachInternetGatewayRequest
  ): Task[DetachInternetGatewayResponse] =
    Task.deferFuture {
      underlying.detachInternetGateway(detachInternetGatewayRequest)
    }

  override def detachNetworkInterface(
      detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest
  ): Task[DetachNetworkInterfaceResponse] =
    Task.deferFuture {
      underlying.detachNetworkInterface(detachNetworkInterfaceRequest)
    }

  override def detachVolume(detachVolumeRequest: DetachVolumeRequest): Task[DetachVolumeResponse] =
    Task.deferFuture {
      underlying.detachVolume(detachVolumeRequest)
    }

  override def detachVpnGateway(detachVpnGatewayRequest: DetachVpnGatewayRequest): Task[DetachVpnGatewayResponse] =
    Task.deferFuture {
      underlying.detachVpnGateway(detachVpnGatewayRequest)
    }

  override def disableTransitGatewayRouteTablePropagation(
      disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest
  ): Task[DisableTransitGatewayRouteTablePropagationResponse] =
    Task.deferFuture {
      underlying.disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest)
    }

  override def disableVgwRoutePropagation(
      disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest
  ): Task[DisableVgwRoutePropagationResponse] =
    Task.deferFuture {
      underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest)
    }

  override def disableVpcClassicLink(
      disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest
  ): Task[DisableVpcClassicLinkResponse] =
    Task.deferFuture {
      underlying.disableVpcClassicLink(disableVpcClassicLinkRequest)
    }

  override def disableVpcClassicLinkDnsSupport(
      disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest
  ): Task[DisableVpcClassicLinkDnsSupportResponse] =
    Task.deferFuture {
      underlying.disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest)
    }

  override def disassociateAddress(
      disassociateAddressRequest: DisassociateAddressRequest
  ): Task[DisassociateAddressResponse] =
    Task.deferFuture {
      underlying.disassociateAddress(disassociateAddressRequest)
    }

  override def disassociateClientVpnTargetNetwork(
      disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest
  ): Task[DisassociateClientVpnTargetNetworkResponse] =
    Task.deferFuture {
      underlying.disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest)
    }

  override def disassociateIamInstanceProfile(
      disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest
  ): Task[DisassociateIamInstanceProfileResponse] =
    Task.deferFuture {
      underlying.disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest)
    }

  override def disassociateRouteTable(
      disassociateRouteTableRequest: DisassociateRouteTableRequest
  ): Task[DisassociateRouteTableResponse] =
    Task.deferFuture {
      underlying.disassociateRouteTable(disassociateRouteTableRequest)
    }

  override def disassociateSubnetCidrBlock(
      disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest
  ): Task[DisassociateSubnetCidrBlockResponse] =
    Task.deferFuture {
      underlying.disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest)
    }

  override def disassociateTransitGatewayRouteTable(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest
  ): Task[DisassociateTransitGatewayRouteTableResponse] =
    Task.deferFuture {
      underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest)
    }

  override def disassociateVpcCidrBlock(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest
  ): Task[DisassociateVpcCidrBlockResponse] =
    Task.deferFuture {
      underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest)
    }

  override def enableTransitGatewayRouteTablePropagation(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest
  ): Task[EnableTransitGatewayRouteTablePropagationResponse] =
    Task.deferFuture {
      underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest)
    }

  override def enableVgwRoutePropagation(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest
  ): Task[EnableVgwRoutePropagationResponse] =
    Task.deferFuture {
      underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest)
    }

  override def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): Task[EnableVolumeIOResponse] =
    Task.deferFuture {
      underlying.enableVolumeIO(enableVolumeIoRequest)
    }

  override def enableVpcClassicLink(
      enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest
  ): Task[EnableVpcClassicLinkResponse] =
    Task.deferFuture {
      underlying.enableVpcClassicLink(enableVpcClassicLinkRequest)
    }

  override def enableVpcClassicLinkDnsSupport(
      enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest
  ): Task[EnableVpcClassicLinkDnsSupportResponse] =
    Task.deferFuture {
      underlying.enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest)
    }

  override def exportClientVpnClientCertificateRevocationList(
      exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest
  ): Task[ExportClientVpnClientCertificateRevocationListResponse] =
    Task.deferFuture {
      underlying.exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest)
    }

  override def exportClientVpnClientConfiguration(
      exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest
  ): Task[ExportClientVpnClientConfigurationResponse] =
    Task.deferFuture {
      underlying.exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest)
    }

  override def exportTransitGatewayRoutes(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest
  ): Task[ExportTransitGatewayRoutesResponse] =
    Task.deferFuture {
      underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest)
    }

  override def getConsoleOutput(getConsoleOutputRequest: GetConsoleOutputRequest): Task[GetConsoleOutputResponse] =
    Task.deferFuture {
      underlying.getConsoleOutput(getConsoleOutputRequest)
    }

  override def getConsoleScreenshot(
      getConsoleScreenshotRequest: GetConsoleScreenshotRequest
  ): Task[GetConsoleScreenshotResponse] =
    Task.deferFuture {
      underlying.getConsoleScreenshot(getConsoleScreenshotRequest)
    }

  override def getHostReservationPurchasePreview(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest
  ): Task[GetHostReservationPurchasePreviewResponse] =
    Task.deferFuture {
      underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest)
    }

  override def getLaunchTemplateData(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest
  ): Task[GetLaunchTemplateDataResponse] =
    Task.deferFuture {
      underlying.getLaunchTemplateData(getLaunchTemplateDataRequest)
    }

  override def getPasswordData(getPasswordDataRequest: GetPasswordDataRequest): Task[GetPasswordDataResponse] =
    Task.deferFuture {
      underlying.getPasswordData(getPasswordDataRequest)
    }

  override def getReservedInstancesExchangeQuote(
      getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest
  ): Task[GetReservedInstancesExchangeQuoteResponse] =
    Task.deferFuture {
      underlying.getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest)
    }

  override def getTransitGatewayAttachmentPropagations(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): Task[GetTransitGatewayAttachmentPropagationsResponse] =
    Task.deferFuture {
      underlying.getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest)
    }

  override def getTransitGatewayRouteTableAssociations(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): Task[GetTransitGatewayRouteTableAssociationsResponse] =
    Task.deferFuture {
      underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest)
    }

  override def getTransitGatewayRouteTablePropagations(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): Task[GetTransitGatewayRouteTablePropagationsResponse] =
    Task.deferFuture {
      underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest)
    }

  override def importClientVpnClientCertificateRevocationList(
      importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest
  ): Task[ImportClientVpnClientCertificateRevocationListResponse] =
    Task.deferFuture {
      underlying.importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest)
    }

  override def importImage(importImageRequest: ImportImageRequest): Task[ImportImageResponse] =
    Task.deferFuture {
      underlying.importImage(importImageRequest)
    }

  override def importInstance(importInstanceRequest: ImportInstanceRequest): Task[ImportInstanceResponse] =
    Task.deferFuture {
      underlying.importInstance(importInstanceRequest)
    }

  override def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): Task[ImportKeyPairResponse] =
    Task.deferFuture {
      underlying.importKeyPair(importKeyPairRequest)
    }

  override def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): Task[ImportSnapshotResponse] =
    Task.deferFuture {
      underlying.importSnapshot(importSnapshotRequest)
    }

  override def importVolume(importVolumeRequest: ImportVolumeRequest): Task[ImportVolumeResponse] =
    Task.deferFuture {
      underlying.importVolume(importVolumeRequest)
    }

  override def modifyCapacityReservation(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest
  ): Task[ModifyCapacityReservationResponse] =
    Task.deferFuture {
      underlying.modifyCapacityReservation(modifyCapacityReservationRequest)
    }

  override def modifyClientVpnEndpoint(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest
  ): Task[ModifyClientVpnEndpointResponse] =
    Task.deferFuture {
      underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest)
    }

  override def modifyFleet(modifyFleetRequest: ModifyFleetRequest): Task[ModifyFleetResponse] =
    Task.deferFuture {
      underlying.modifyFleet(modifyFleetRequest)
    }

  override def modifyFpgaImageAttribute(
      modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest
  ): Task[ModifyFpgaImageAttributeResponse] =
    Task.deferFuture {
      underlying.modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest)
    }

  override def modifyHosts(modifyHostsRequest: ModifyHostsRequest): Task[ModifyHostsResponse] =
    Task.deferFuture {
      underlying.modifyHosts(modifyHostsRequest)
    }

  override def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): Task[ModifyIdFormatResponse] =
    Task.deferFuture {
      underlying.modifyIdFormat(modifyIdFormatRequest)
    }

  override def modifyIdentityIdFormat(
      modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest
  ): Task[ModifyIdentityIdFormatResponse] =
    Task.deferFuture {
      underlying.modifyIdentityIdFormat(modifyIdentityIdFormatRequest)
    }

  override def modifyImageAttribute(
      modifyImageAttributeRequest: ModifyImageAttributeRequest
  ): Task[ModifyImageAttributeResponse] =
    Task.deferFuture {
      underlying.modifyImageAttribute(modifyImageAttributeRequest)
    }

  override def modifyInstanceAttribute(
      modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest
  ): Task[ModifyInstanceAttributeResponse] =
    Task.deferFuture {
      underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest)
    }

  override def modifyInstanceCapacityReservationAttributes(
      modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest
  ): Task[ModifyInstanceCapacityReservationAttributesResponse] =
    Task.deferFuture {
      underlying.modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest)
    }

  override def modifyInstanceCreditSpecification(
      modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest
  ): Task[ModifyInstanceCreditSpecificationResponse] =
    Task.deferFuture {
      underlying.modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest)
    }

  override def modifyInstanceEventStartTime(
      modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest
  ): Task[ModifyInstanceEventStartTimeResponse] =
    Task.deferFuture {
      underlying.modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest)
    }

  override def modifyInstancePlacement(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest
  ): Task[ModifyInstancePlacementResponse] =
    Task.deferFuture {
      underlying.modifyInstancePlacement(modifyInstancePlacementRequest)
    }

  override def modifyLaunchTemplate(
      modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest
  ): Task[ModifyLaunchTemplateResponse] =
    Task.deferFuture {
      underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest)
    }

  override def modifyNetworkInterfaceAttribute(
      modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest
  ): Task[ModifyNetworkInterfaceAttributeResponse] =
    Task.deferFuture {
      underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest)
    }

  override def modifyReservedInstances(
      modifyReservedInstancesRequest: ModifyReservedInstancesRequest
  ): Task[ModifyReservedInstancesResponse] =
    Task.deferFuture {
      underlying.modifyReservedInstances(modifyReservedInstancesRequest)
    }

  override def modifySnapshotAttribute(
      modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest
  ): Task[ModifySnapshotAttributeResponse] =
    Task.deferFuture {
      underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest)
    }

  override def modifySpotFleetRequest(
      modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest
  ): Task[ModifySpotFleetRequestResponse] =
    Task.deferFuture {
      underlying.modifySpotFleetRequest(modifySpotFleetRequestRequest)
    }

  override def modifySubnetAttribute(
      modifySubnetAttributeRequest: ModifySubnetAttributeRequest
  ): Task[ModifySubnetAttributeResponse] =
    Task.deferFuture {
      underlying.modifySubnetAttribute(modifySubnetAttributeRequest)
    }

  override def modifyTransitGatewayVpcAttachment(
      modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest
  ): Task[ModifyTransitGatewayVpcAttachmentResponse] =
    Task.deferFuture {
      underlying.modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest)
    }

  override def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): Task[ModifyVolumeResponse] =
    Task.deferFuture {
      underlying.modifyVolume(modifyVolumeRequest)
    }

  override def modifyVolumeAttribute(
      modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest
  ): Task[ModifyVolumeAttributeResponse] =
    Task.deferFuture {
      underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest)
    }

  override def modifyVpcAttribute(
      modifyVpcAttributeRequest: ModifyVpcAttributeRequest
  ): Task[ModifyVpcAttributeResponse] =
    Task.deferFuture {
      underlying.modifyVpcAttribute(modifyVpcAttributeRequest)
    }

  override def modifyVpcEndpoint(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): Task[ModifyVpcEndpointResponse] =
    Task.deferFuture {
      underlying.modifyVpcEndpoint(modifyVpcEndpointRequest)
    }

  override def modifyVpcEndpointConnectionNotification(
      modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest
  ): Task[ModifyVpcEndpointConnectionNotificationResponse] =
    Task.deferFuture {
      underlying.modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest)
    }

  override def modifyVpcEndpointServiceConfiguration(
      modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest
  ): Task[ModifyVpcEndpointServiceConfigurationResponse] =
    Task.deferFuture {
      underlying.modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest)
    }

  override def modifyVpcEndpointServicePermissions(
      modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest
  ): Task[ModifyVpcEndpointServicePermissionsResponse] =
    Task.deferFuture {
      underlying.modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest)
    }

  override def modifyVpcPeeringConnectionOptions(
      modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest
  ): Task[ModifyVpcPeeringConnectionOptionsResponse] =
    Task.deferFuture {
      underlying.modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest)
    }

  override def modifyVpcTenancy(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): Task[ModifyVpcTenancyResponse] =
    Task.deferFuture {
      underlying.modifyVpcTenancy(modifyVpcTenancyRequest)
    }

  override def monitorInstances(monitorInstancesRequest: MonitorInstancesRequest): Task[MonitorInstancesResponse] =
    Task.deferFuture {
      underlying.monitorInstances(monitorInstancesRequest)
    }

  override def moveAddressToVpc(moveAddressToVpcRequest: MoveAddressToVpcRequest): Task[MoveAddressToVpcResponse] =
    Task.deferFuture {
      underlying.moveAddressToVpc(moveAddressToVpcRequest)
    }

  override def provisionByoipCidr(
      provisionByoipCidrRequest: ProvisionByoipCidrRequest
  ): Task[ProvisionByoipCidrResponse] =
    Task.deferFuture {
      underlying.provisionByoipCidr(provisionByoipCidrRequest)
    }

  override def purchaseHostReservation(
      purchaseHostReservationRequest: PurchaseHostReservationRequest
  ): Task[PurchaseHostReservationResponse] =
    Task.deferFuture {
      underlying.purchaseHostReservation(purchaseHostReservationRequest)
    }

  override def purchaseReservedInstancesOffering(
      purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest
  ): Task[PurchaseReservedInstancesOfferingResponse] =
    Task.deferFuture {
      underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest)
    }

  override def purchaseScheduledInstances(
      purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest
  ): Task[PurchaseScheduledInstancesResponse] =
    Task.deferFuture {
      underlying.purchaseScheduledInstances(purchaseScheduledInstancesRequest)
    }

  override def rebootInstances(rebootInstancesRequest: RebootInstancesRequest): Task[RebootInstancesResponse] =
    Task.deferFuture {
      underlying.rebootInstances(rebootInstancesRequest)
    }

  override def registerImage(registerImageRequest: RegisterImageRequest): Task[RegisterImageResponse] =
    Task.deferFuture {
      underlying.registerImage(registerImageRequest)
    }

  override def rejectTransitGatewayVpcAttachment(
      rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest
  ): Task[RejectTransitGatewayVpcAttachmentResponse] =
    Task.deferFuture {
      underlying.rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest)
    }

  override def rejectVpcEndpointConnections(
      rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest
  ): Task[RejectVpcEndpointConnectionsResponse] =
    Task.deferFuture {
      underlying.rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest)
    }

  override def rejectVpcPeeringConnection(
      rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest
  ): Task[RejectVpcPeeringConnectionResponse] =
    Task.deferFuture {
      underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest)
    }

  override def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): Task[ReleaseAddressResponse] =
    Task.deferFuture {
      underlying.releaseAddress(releaseAddressRequest)
    }

  override def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): Task[ReleaseHostsResponse] =
    Task.deferFuture {
      underlying.releaseHosts(releaseHostsRequest)
    }

  override def replaceIamInstanceProfileAssociation(
      replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest
  ): Task[ReplaceIamInstanceProfileAssociationResponse] =
    Task.deferFuture {
      underlying.replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest)
    }

  override def replaceNetworkAclAssociation(
      replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest
  ): Task[ReplaceNetworkAclAssociationResponse] =
    Task.deferFuture {
      underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest)
    }

  override def replaceNetworkAclEntry(
      replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest
  ): Task[ReplaceNetworkAclEntryResponse] =
    Task.deferFuture {
      underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest)
    }

  override def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): Task[ReplaceRouteResponse] =
    Task.deferFuture {
      underlying.replaceRoute(replaceRouteRequest)
    }

  override def replaceRouteTableAssociation(
      replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest
  ): Task[ReplaceRouteTableAssociationResponse] =
    Task.deferFuture {
      underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest)
    }

  override def replaceTransitGatewayRoute(
      replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest
  ): Task[ReplaceTransitGatewayRouteResponse] =
    Task.deferFuture {
      underlying.replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest)
    }

  override def reportInstanceStatus(
      reportInstanceStatusRequest: ReportInstanceStatusRequest
  ): Task[ReportInstanceStatusResponse] =
    Task.deferFuture {
      underlying.reportInstanceStatus(reportInstanceStatusRequest)
    }

  override def requestSpotFleet(requestSpotFleetRequest: RequestSpotFleetRequest): Task[RequestSpotFleetResponse] =
    Task.deferFuture {
      underlying.requestSpotFleet(requestSpotFleetRequest)
    }

  override def requestSpotInstances(
      requestSpotInstancesRequest: RequestSpotInstancesRequest
  ): Task[RequestSpotInstancesResponse] =
    Task.deferFuture {
      underlying.requestSpotInstances(requestSpotInstancesRequest)
    }

  override def resetFpgaImageAttribute(
      resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest
  ): Task[ResetFpgaImageAttributeResponse] =
    Task.deferFuture {
      underlying.resetFpgaImageAttribute(resetFpgaImageAttributeRequest)
    }

  override def resetImageAttribute(
      resetImageAttributeRequest: ResetImageAttributeRequest
  ): Task[ResetImageAttributeResponse] =
    Task.deferFuture {
      underlying.resetImageAttribute(resetImageAttributeRequest)
    }

  override def resetInstanceAttribute(
      resetInstanceAttributeRequest: ResetInstanceAttributeRequest
  ): Task[ResetInstanceAttributeResponse] =
    Task.deferFuture {
      underlying.resetInstanceAttribute(resetInstanceAttributeRequest)
    }

  override def resetNetworkInterfaceAttribute(
      resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest
  ): Task[ResetNetworkInterfaceAttributeResponse] =
    Task.deferFuture {
      underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest)
    }

  override def resetSnapshotAttribute(
      resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest
  ): Task[ResetSnapshotAttributeResponse] =
    Task.deferFuture {
      underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest)
    }

  override def restoreAddressToClassic(
      restoreAddressToClassicRequest: RestoreAddressToClassicRequest
  ): Task[RestoreAddressToClassicResponse] =
    Task.deferFuture {
      underlying.restoreAddressToClassic(restoreAddressToClassicRequest)
    }

  override def revokeClientVpnIngress(
      revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest
  ): Task[RevokeClientVpnIngressResponse] =
    Task.deferFuture {
      underlying.revokeClientVpnIngress(revokeClientVpnIngressRequest)
    }

  override def revokeSecurityGroupEgress(
      revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest
  ): Task[RevokeSecurityGroupEgressResponse] =
    Task.deferFuture {
      underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest)
    }

  override def revokeSecurityGroupIngress(
      revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest
  ): Task[RevokeSecurityGroupIngressResponse] =
    Task.deferFuture {
      underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest)
    }

  override def runInstances(runInstancesRequest: RunInstancesRequest): Task[RunInstancesResponse] =
    Task.deferFuture {
      underlying.runInstances(runInstancesRequest)
    }

  override def runScheduledInstances(
      runScheduledInstancesRequest: RunScheduledInstancesRequest
  ): Task[RunScheduledInstancesResponse] =
    Task.deferFuture {
      underlying.runScheduledInstances(runScheduledInstancesRequest)
    }

  override def searchTransitGatewayRoutes(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest
  ): Task[SearchTransitGatewayRoutesResponse] =
    Task.deferFuture {
      underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest)
    }

  override def startInstances(startInstancesRequest: StartInstancesRequest): Task[StartInstancesResponse] =
    Task.deferFuture {
      underlying.startInstances(startInstancesRequest)
    }

  override def stopInstances(stopInstancesRequest: StopInstancesRequest): Task[StopInstancesResponse] =
    Task.deferFuture {
      underlying.stopInstances(stopInstancesRequest)
    }

  override def terminateClientVpnConnections(
      terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest
  ): Task[TerminateClientVpnConnectionsResponse] =
    Task.deferFuture {
      underlying.terminateClientVpnConnections(terminateClientVpnConnectionsRequest)
    }

  override def terminateInstances(
      terminateInstancesRequest: TerminateInstancesRequest
  ): Task[TerminateInstancesResponse] =
    Task.deferFuture {
      underlying.terminateInstances(terminateInstancesRequest)
    }

  override def unassignIpv6Addresses(
      unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest
  ): Task[UnassignIpv6AddressesResponse] =
    Task.deferFuture {
      underlying.unassignIpv6Addresses(unassignIpv6AddressesRequest)
    }

  override def unassignPrivateIpAddresses(
      unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest
  ): Task[UnassignPrivateIpAddressesResponse] =
    Task.deferFuture {
      underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest)
    }

  override def unmonitorInstances(
      unmonitorInstancesRequest: UnmonitorInstancesRequest
  ): Task[UnmonitorInstancesResponse] =
    Task.deferFuture {
      underlying.unmonitorInstances(unmonitorInstancesRequest)
    }

  override def updateSecurityGroupRuleDescriptionsEgress(
      updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest
  ): Task[UpdateSecurityGroupRuleDescriptionsEgressResponse] =
    Task.deferFuture {
      underlying.updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest)
    }

  override def updateSecurityGroupRuleDescriptionsIngress(
      updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest
  ): Task[UpdateSecurityGroupRuleDescriptionsIngressResponse] =
    Task.deferFuture {
      underlying.updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest)
    }

  override def withdrawByoipCidr(withdrawByoipCidrRequest: WithdrawByoipCidrRequest): Task[WithdrawByoipCidrResponse] =
    Task.deferFuture {
      underlying.withdrawByoipCidr(withdrawByoipCidrRequest)
    }

}
