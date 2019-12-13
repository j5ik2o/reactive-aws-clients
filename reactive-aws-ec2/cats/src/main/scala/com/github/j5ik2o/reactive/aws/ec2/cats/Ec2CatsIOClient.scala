// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.ec2.{ Ec2AsyncClient, Ec2Client }
import software.amazon.awssdk.services.ec2.model._
import software.amazon.awssdk.services.ec2.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object Ec2CatsIOClient {

  def apply(asyncClient: Ec2AsyncClient)(implicit ec: ExecutionContext): Ec2CatsIOClient = new Ec2CatsIOClient {
    override val executionContext: ExecutionContext = ec
    override val underlying: Ec2AsyncClient         = asyncClient
  }

}

trait Ec2CatsIOClient extends Ec2Client[IO] {

  val underlying: Ec2AsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def acceptReservedInstancesExchangeQuote(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest
  ): IO[AcceptReservedInstancesExchangeQuoteResponse] =
    IO.fromFuture {
      IO(underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest))
    }

  override def acceptTransitGatewayPeeringAttachment(
      acceptTransitGatewayPeeringAttachmentRequest: AcceptTransitGatewayPeeringAttachmentRequest
  ): IO[AcceptTransitGatewayPeeringAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.acceptTransitGatewayPeeringAttachment(acceptTransitGatewayPeeringAttachmentRequest))
    }

  override def acceptTransitGatewayVpcAttachment(
      acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest
  ): IO[AcceptTransitGatewayVpcAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest))
    }

  override def acceptVpcEndpointConnections(
      acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest
  ): IO[AcceptVpcEndpointConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest))
    }

  override def acceptVpcPeeringConnection(
      acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest
  ): IO[AcceptVpcPeeringConnectionResponse] =
    IO.fromFuture {
      IO(underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest))
    }

  override def advertiseByoipCidr(
      advertiseByoipCidrRequest: AdvertiseByoipCidrRequest
  ): IO[AdvertiseByoipCidrResponse] =
    IO.fromFuture {
      IO(underlying.advertiseByoipCidr(advertiseByoipCidrRequest))
    }

  override def allocateAddress(allocateAddressRequest: AllocateAddressRequest): IO[AllocateAddressResponse] =
    IO.fromFuture {
      IO(underlying.allocateAddress(allocateAddressRequest))
    }

  override def allocateAddress(): IO[AllocateAddressResponse] =
    IO.fromFuture {
      IO(underlying.allocateAddress())
    }

  override def allocateHosts(allocateHostsRequest: AllocateHostsRequest): IO[AllocateHostsResponse] =
    IO.fromFuture {
      IO(underlying.allocateHosts(allocateHostsRequest))
    }

  override def applySecurityGroupsToClientVpnTargetNetwork(
      applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest
  ): IO[ApplySecurityGroupsToClientVpnTargetNetworkResponse] =
    IO.fromFuture {
      IO(underlying.applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest))
    }

  override def assignIpv6Addresses(
      assignIpv6AddressesRequest: AssignIpv6AddressesRequest
  ): IO[AssignIpv6AddressesResponse] =
    IO.fromFuture {
      IO(underlying.assignIpv6Addresses(assignIpv6AddressesRequest))
    }

  override def assignPrivateIpAddresses(
      assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest
  ): IO[AssignPrivateIpAddressesResponse] =
    IO.fromFuture {
      IO(underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest))
    }

  override def associateAddress(associateAddressRequest: AssociateAddressRequest): IO[AssociateAddressResponse] =
    IO.fromFuture {
      IO(underlying.associateAddress(associateAddressRequest))
    }

  override def associateAddress(): IO[AssociateAddressResponse] =
    IO.fromFuture {
      IO(underlying.associateAddress())
    }

  override def associateClientVpnTargetNetwork(
      associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest
  ): IO[AssociateClientVpnTargetNetworkResponse] =
    IO.fromFuture {
      IO(underlying.associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest))
    }

  override def associateDhcpOptions(
      associateDhcpOptionsRequest: AssociateDhcpOptionsRequest
  ): IO[AssociateDhcpOptionsResponse] =
    IO.fromFuture {
      IO(underlying.associateDhcpOptions(associateDhcpOptionsRequest))
    }

  override def associateIamInstanceProfile(
      associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest
  ): IO[AssociateIamInstanceProfileResponse] =
    IO.fromFuture {
      IO(underlying.associateIamInstanceProfile(associateIamInstanceProfileRequest))
    }

  override def associateRouteTable(
      associateRouteTableRequest: AssociateRouteTableRequest
  ): IO[AssociateRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.associateRouteTable(associateRouteTableRequest))
    }

  override def associateSubnetCidrBlock(
      associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest
  ): IO[AssociateSubnetCidrBlockResponse] =
    IO.fromFuture {
      IO(underlying.associateSubnetCidrBlock(associateSubnetCidrBlockRequest))
    }

  override def associateTransitGatewayMulticastDomain(
      associateTransitGatewayMulticastDomainRequest: AssociateTransitGatewayMulticastDomainRequest
  ): IO[AssociateTransitGatewayMulticastDomainResponse] =
    IO.fromFuture {
      IO(underlying.associateTransitGatewayMulticastDomain(associateTransitGatewayMulticastDomainRequest))
    }

  override def associateTransitGatewayRouteTable(
      associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest
  ): IO[AssociateTransitGatewayRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest))
    }

  override def associateVpcCidrBlock(
      associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest
  ): IO[AssociateVpcCidrBlockResponse] =
    IO.fromFuture {
      IO(underlying.associateVpcCidrBlock(associateVpcCidrBlockRequest))
    }

  override def attachClassicLinkVpc(
      attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest
  ): IO[AttachClassicLinkVpcResponse] =
    IO.fromFuture {
      IO(underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest))
    }

  override def attachInternetGateway(
      attachInternetGatewayRequest: AttachInternetGatewayRequest
  ): IO[AttachInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.attachInternetGateway(attachInternetGatewayRequest))
    }

  override def attachNetworkInterface(
      attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest
  ): IO[AttachNetworkInterfaceResponse] =
    IO.fromFuture {
      IO(underlying.attachNetworkInterface(attachNetworkInterfaceRequest))
    }

  override def attachVolume(attachVolumeRequest: AttachVolumeRequest): IO[AttachVolumeResponse] =
    IO.fromFuture {
      IO(underlying.attachVolume(attachVolumeRequest))
    }

  override def attachVpnGateway(attachVpnGatewayRequest: AttachVpnGatewayRequest): IO[AttachVpnGatewayResponse] =
    IO.fromFuture {
      IO(underlying.attachVpnGateway(attachVpnGatewayRequest))
    }

  override def authorizeClientVpnIngress(
      authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest
  ): IO[AuthorizeClientVpnIngressResponse] =
    IO.fromFuture {
      IO(underlying.authorizeClientVpnIngress(authorizeClientVpnIngressRequest))
    }

  override def authorizeSecurityGroupEgress(
      authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest
  ): IO[AuthorizeSecurityGroupEgressResponse] =
    IO.fromFuture {
      IO(underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest))
    }

  override def authorizeSecurityGroupIngress(
      authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest
  ): IO[AuthorizeSecurityGroupIngressResponse] =
    IO.fromFuture {
      IO(underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest))
    }

  override def bundleInstance(bundleInstanceRequest: BundleInstanceRequest): IO[BundleInstanceResponse] =
    IO.fromFuture {
      IO(underlying.bundleInstance(bundleInstanceRequest))
    }

  override def cancelBundleTask(cancelBundleTaskRequest: CancelBundleTaskRequest): IO[CancelBundleTaskResponse] =
    IO.fromFuture {
      IO(underlying.cancelBundleTask(cancelBundleTaskRequest))
    }

  override def cancelCapacityReservation(
      cancelCapacityReservationRequest: CancelCapacityReservationRequest
  ): IO[CancelCapacityReservationResponse] =
    IO.fromFuture {
      IO(underlying.cancelCapacityReservation(cancelCapacityReservationRequest))
    }

  override def cancelConversionTask(
      cancelConversionTaskRequest: CancelConversionTaskRequest
  ): IO[CancelConversionTaskResponse] =
    IO.fromFuture {
      IO(underlying.cancelConversionTask(cancelConversionTaskRequest))
    }

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): IO[CancelExportTaskResponse] =
    IO.fromFuture {
      IO(underlying.cancelExportTask(cancelExportTaskRequest))
    }

  override def cancelImportTask(cancelImportTaskRequest: CancelImportTaskRequest): IO[CancelImportTaskResponse] =
    IO.fromFuture {
      IO(underlying.cancelImportTask(cancelImportTaskRequest))
    }

  override def cancelReservedInstancesListing(
      cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest
  ): IO[CancelReservedInstancesListingResponse] =
    IO.fromFuture {
      IO(underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest))
    }

  override def cancelSpotFleetRequests(
      cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest
  ): IO[CancelSpotFleetRequestsResponse] =
    IO.fromFuture {
      IO(underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest))
    }

  override def cancelSpotInstanceRequests(
      cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest
  ): IO[CancelSpotInstanceRequestsResponse] =
    IO.fromFuture {
      IO(underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest))
    }

  override def confirmProductInstance(
      confirmProductInstanceRequest: ConfirmProductInstanceRequest
  ): IO[ConfirmProductInstanceResponse] =
    IO.fromFuture {
      IO(underlying.confirmProductInstance(confirmProductInstanceRequest))
    }

  override def copyFpgaImage(copyFpgaImageRequest: CopyFpgaImageRequest): IO[CopyFpgaImageResponse] =
    IO.fromFuture {
      IO(underlying.copyFpgaImage(copyFpgaImageRequest))
    }

  override def copyImage(copyImageRequest: CopyImageRequest): IO[CopyImageResponse] =
    IO.fromFuture {
      IO(underlying.copyImage(copyImageRequest))
    }

  override def copySnapshot(copySnapshotRequest: CopySnapshotRequest): IO[CopySnapshotResponse] =
    IO.fromFuture {
      IO(underlying.copySnapshot(copySnapshotRequest))
    }

  override def createCapacityReservation(
      createCapacityReservationRequest: CreateCapacityReservationRequest
  ): IO[CreateCapacityReservationResponse] =
    IO.fromFuture {
      IO(underlying.createCapacityReservation(createCapacityReservationRequest))
    }

  override def createClientVpnEndpoint(
      createClientVpnEndpointRequest: CreateClientVpnEndpointRequest
  ): IO[CreateClientVpnEndpointResponse] =
    IO.fromFuture {
      IO(underlying.createClientVpnEndpoint(createClientVpnEndpointRequest))
    }

  override def createClientVpnRoute(
      createClientVpnRouteRequest: CreateClientVpnRouteRequest
  ): IO[CreateClientVpnRouteResponse] =
    IO.fromFuture {
      IO(underlying.createClientVpnRoute(createClientVpnRouteRequest))
    }

  override def createCustomerGateway(
      createCustomerGatewayRequest: CreateCustomerGatewayRequest
  ): IO[CreateCustomerGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createCustomerGateway(createCustomerGatewayRequest))
    }

  override def createDefaultSubnet(
      createDefaultSubnetRequest: CreateDefaultSubnetRequest
  ): IO[CreateDefaultSubnetResponse] =
    IO.fromFuture {
      IO(underlying.createDefaultSubnet(createDefaultSubnetRequest))
    }

  override def createDefaultVpc(createDefaultVpcRequest: CreateDefaultVpcRequest): IO[CreateDefaultVpcResponse] =
    IO.fromFuture {
      IO(underlying.createDefaultVpc(createDefaultVpcRequest))
    }

  override def createDefaultVpc(): IO[CreateDefaultVpcResponse] =
    IO.fromFuture {
      IO(underlying.createDefaultVpc())
    }

  override def createDhcpOptions(createDhcpOptionsRequest: CreateDhcpOptionsRequest): IO[CreateDhcpOptionsResponse] =
    IO.fromFuture {
      IO(underlying.createDhcpOptions(createDhcpOptionsRequest))
    }

  override def createEgressOnlyInternetGateway(
      createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest
  ): IO[CreateEgressOnlyInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest))
    }

  override def createFleet(createFleetRequest: CreateFleetRequest): IO[CreateFleetResponse] =
    IO.fromFuture {
      IO(underlying.createFleet(createFleetRequest))
    }

  override def createFlowLogs(createFlowLogsRequest: CreateFlowLogsRequest): IO[CreateFlowLogsResponse] =
    IO.fromFuture {
      IO(underlying.createFlowLogs(createFlowLogsRequest))
    }

  override def createFpgaImage(createFpgaImageRequest: CreateFpgaImageRequest): IO[CreateFpgaImageResponse] =
    IO.fromFuture {
      IO(underlying.createFpgaImage(createFpgaImageRequest))
    }

  override def createImage(createImageRequest: CreateImageRequest): IO[CreateImageResponse] =
    IO.fromFuture {
      IO(underlying.createImage(createImageRequest))
    }

  override def createInstanceExportTask(
      createInstanceExportTaskRequest: CreateInstanceExportTaskRequest
  ): IO[CreateInstanceExportTaskResponse] =
    IO.fromFuture {
      IO(underlying.createInstanceExportTask(createInstanceExportTaskRequest))
    }

  override def createInternetGateway(
      createInternetGatewayRequest: CreateInternetGatewayRequest
  ): IO[CreateInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createInternetGateway(createInternetGatewayRequest))
    }

  override def createInternetGateway(): IO[CreateInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createInternetGateway())
    }

  override def createKeyPair(createKeyPairRequest: CreateKeyPairRequest): IO[CreateKeyPairResponse] =
    IO.fromFuture {
      IO(underlying.createKeyPair(createKeyPairRequest))
    }

  override def createLaunchTemplate(
      createLaunchTemplateRequest: CreateLaunchTemplateRequest
  ): IO[CreateLaunchTemplateResponse] =
    IO.fromFuture {
      IO(underlying.createLaunchTemplate(createLaunchTemplateRequest))
    }

  override def createLaunchTemplateVersion(
      createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest
  ): IO[CreateLaunchTemplateVersionResponse] =
    IO.fromFuture {
      IO(underlying.createLaunchTemplateVersion(createLaunchTemplateVersionRequest))
    }

  override def createLocalGatewayRoute(
      createLocalGatewayRouteRequest: CreateLocalGatewayRouteRequest
  ): IO[CreateLocalGatewayRouteResponse] =
    IO.fromFuture {
      IO(underlying.createLocalGatewayRoute(createLocalGatewayRouteRequest))
    }

  override def createLocalGatewayRouteTableVpcAssociation(
      createLocalGatewayRouteTableVpcAssociationRequest: CreateLocalGatewayRouteTableVpcAssociationRequest
  ): IO[CreateLocalGatewayRouteTableVpcAssociationResponse] =
    IO.fromFuture {
      IO(underlying.createLocalGatewayRouteTableVpcAssociation(createLocalGatewayRouteTableVpcAssociationRequest))
    }

  override def createNatGateway(createNatGatewayRequest: CreateNatGatewayRequest): IO[CreateNatGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createNatGateway(createNatGatewayRequest))
    }

  override def createNetworkAcl(createNetworkAclRequest: CreateNetworkAclRequest): IO[CreateNetworkAclResponse] =
    IO.fromFuture {
      IO(underlying.createNetworkAcl(createNetworkAclRequest))
    }

  override def createNetworkAclEntry(
      createNetworkAclEntryRequest: CreateNetworkAclEntryRequest
  ): IO[CreateNetworkAclEntryResponse] =
    IO.fromFuture {
      IO(underlying.createNetworkAclEntry(createNetworkAclEntryRequest))
    }

  override def createNetworkInterface(
      createNetworkInterfaceRequest: CreateNetworkInterfaceRequest
  ): IO[CreateNetworkInterfaceResponse] =
    IO.fromFuture {
      IO(underlying.createNetworkInterface(createNetworkInterfaceRequest))
    }

  override def createNetworkInterfacePermission(
      createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest
  ): IO[CreateNetworkInterfacePermissionResponse] =
    IO.fromFuture {
      IO(underlying.createNetworkInterfacePermission(createNetworkInterfacePermissionRequest))
    }

  override def createPlacementGroup(
      createPlacementGroupRequest: CreatePlacementGroupRequest
  ): IO[CreatePlacementGroupResponse] =
    IO.fromFuture {
      IO(underlying.createPlacementGroup(createPlacementGroupRequest))
    }

  override def createReservedInstancesListing(
      createReservedInstancesListingRequest: CreateReservedInstancesListingRequest
  ): IO[CreateReservedInstancesListingResponse] =
    IO.fromFuture {
      IO(underlying.createReservedInstancesListing(createReservedInstancesListingRequest))
    }

  override def createRoute(createRouteRequest: CreateRouteRequest): IO[CreateRouteResponse] =
    IO.fromFuture {
      IO(underlying.createRoute(createRouteRequest))
    }

  override def createRouteTable(createRouteTableRequest: CreateRouteTableRequest): IO[CreateRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.createRouteTable(createRouteTableRequest))
    }

  override def createSecurityGroup(
      createSecurityGroupRequest: CreateSecurityGroupRequest
  ): IO[CreateSecurityGroupResponse] =
    IO.fromFuture {
      IO(underlying.createSecurityGroup(createSecurityGroupRequest))
    }

  override def createSnapshot(createSnapshotRequest: CreateSnapshotRequest): IO[CreateSnapshotResponse] =
    IO.fromFuture {
      IO(underlying.createSnapshot(createSnapshotRequest))
    }

  override def createSnapshots(createSnapshotsRequest: CreateSnapshotsRequest): IO[CreateSnapshotsResponse] =
    IO.fromFuture {
      IO(underlying.createSnapshots(createSnapshotsRequest))
    }

  override def createSpotDatafeedSubscription(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest
  ): IO[CreateSpotDatafeedSubscriptionResponse] =
    IO.fromFuture {
      IO(underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest))
    }

  override def createSubnet(createSubnetRequest: CreateSubnetRequest): IO[CreateSubnetResponse] =
    IO.fromFuture {
      IO(underlying.createSubnet(createSubnetRequest))
    }

  override def createTags(createTagsRequest: CreateTagsRequest): IO[CreateTagsResponse] =
    IO.fromFuture {
      IO(underlying.createTags(createTagsRequest))
    }

  override def createTrafficMirrorFilter(
      createTrafficMirrorFilterRequest: CreateTrafficMirrorFilterRequest
  ): IO[CreateTrafficMirrorFilterResponse] =
    IO.fromFuture {
      IO(underlying.createTrafficMirrorFilter(createTrafficMirrorFilterRequest))
    }

  override def createTrafficMirrorFilterRule(
      createTrafficMirrorFilterRuleRequest: CreateTrafficMirrorFilterRuleRequest
  ): IO[CreateTrafficMirrorFilterRuleResponse] =
    IO.fromFuture {
      IO(underlying.createTrafficMirrorFilterRule(createTrafficMirrorFilterRuleRequest))
    }

  override def createTrafficMirrorSession(
      createTrafficMirrorSessionRequest: CreateTrafficMirrorSessionRequest
  ): IO[CreateTrafficMirrorSessionResponse] =
    IO.fromFuture {
      IO(underlying.createTrafficMirrorSession(createTrafficMirrorSessionRequest))
    }

  override def createTrafficMirrorTarget(
      createTrafficMirrorTargetRequest: CreateTrafficMirrorTargetRequest
  ): IO[CreateTrafficMirrorTargetResponse] =
    IO.fromFuture {
      IO(underlying.createTrafficMirrorTarget(createTrafficMirrorTargetRequest))
    }

  override def createTransitGateway(
      createTransitGatewayRequest: CreateTransitGatewayRequest
  ): IO[CreateTransitGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGateway(createTransitGatewayRequest))
    }

  override def createTransitGateway(): IO[CreateTransitGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGateway())
    }

  override def createTransitGatewayMulticastDomain(
      createTransitGatewayMulticastDomainRequest: CreateTransitGatewayMulticastDomainRequest
  ): IO[CreateTransitGatewayMulticastDomainResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGatewayMulticastDomain(createTransitGatewayMulticastDomainRequest))
    }

  override def createTransitGatewayPeeringAttachment(
      createTransitGatewayPeeringAttachmentRequest: CreateTransitGatewayPeeringAttachmentRequest
  ): IO[CreateTransitGatewayPeeringAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGatewayPeeringAttachment(createTransitGatewayPeeringAttachmentRequest))
    }

  override def createTransitGatewayRoute(
      createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest
  ): IO[CreateTransitGatewayRouteResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGatewayRoute(createTransitGatewayRouteRequest))
    }

  override def createTransitGatewayRouteTable(
      createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest
  ): IO[CreateTransitGatewayRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest))
    }

  override def createTransitGatewayVpcAttachment(
      createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest
  ): IO[CreateTransitGatewayVpcAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest))
    }

  override def createVolume(createVolumeRequest: CreateVolumeRequest): IO[CreateVolumeResponse] =
    IO.fromFuture {
      IO(underlying.createVolume(createVolumeRequest))
    }

  override def createVpc(createVpcRequest: CreateVpcRequest): IO[CreateVpcResponse] =
    IO.fromFuture {
      IO(underlying.createVpc(createVpcRequest))
    }

  override def createVpcEndpoint(createVpcEndpointRequest: CreateVpcEndpointRequest): IO[CreateVpcEndpointResponse] =
    IO.fromFuture {
      IO(underlying.createVpcEndpoint(createVpcEndpointRequest))
    }

  override def createVpcEndpointConnectionNotification(
      createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest
  ): IO[CreateVpcEndpointConnectionNotificationResponse] =
    IO.fromFuture {
      IO(underlying.createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest))
    }

  override def createVpcEndpointServiceConfiguration(
      createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest
  ): IO[CreateVpcEndpointServiceConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest))
    }

  override def createVpcPeeringConnection(
      createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest
  ): IO[CreateVpcPeeringConnectionResponse] =
    IO.fromFuture {
      IO(underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest))
    }

  override def createVpnConnection(
      createVpnConnectionRequest: CreateVpnConnectionRequest
  ): IO[CreateVpnConnectionResponse] =
    IO.fromFuture {
      IO(underlying.createVpnConnection(createVpnConnectionRequest))
    }

  override def createVpnConnectionRoute(
      createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest
  ): IO[CreateVpnConnectionRouteResponse] =
    IO.fromFuture {
      IO(underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest))
    }

  override def createVpnGateway(createVpnGatewayRequest: CreateVpnGatewayRequest): IO[CreateVpnGatewayResponse] =
    IO.fromFuture {
      IO(underlying.createVpnGateway(createVpnGatewayRequest))
    }

  override def deleteClientVpnEndpoint(
      deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest
  ): IO[DeleteClientVpnEndpointResponse] =
    IO.fromFuture {
      IO(underlying.deleteClientVpnEndpoint(deleteClientVpnEndpointRequest))
    }

  override def deleteClientVpnRoute(
      deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest
  ): IO[DeleteClientVpnRouteResponse] =
    IO.fromFuture {
      IO(underlying.deleteClientVpnRoute(deleteClientVpnRouteRequest))
    }

  override def deleteCustomerGateway(
      deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest
  ): IO[DeleteCustomerGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteCustomerGateway(deleteCustomerGatewayRequest))
    }

  override def deleteDhcpOptions(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): IO[DeleteDhcpOptionsResponse] =
    IO.fromFuture {
      IO(underlying.deleteDhcpOptions(deleteDhcpOptionsRequest))
    }

  override def deleteEgressOnlyInternetGateway(
      deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest
  ): IO[DeleteEgressOnlyInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest))
    }

  override def deleteFleets(deleteFleetsRequest: DeleteFleetsRequest): IO[DeleteFleetsResponse] =
    IO.fromFuture {
      IO(underlying.deleteFleets(deleteFleetsRequest))
    }

  override def deleteFlowLogs(deleteFlowLogsRequest: DeleteFlowLogsRequest): IO[DeleteFlowLogsResponse] =
    IO.fromFuture {
      IO(underlying.deleteFlowLogs(deleteFlowLogsRequest))
    }

  override def deleteFpgaImage(deleteFpgaImageRequest: DeleteFpgaImageRequest): IO[DeleteFpgaImageResponse] =
    IO.fromFuture {
      IO(underlying.deleteFpgaImage(deleteFpgaImageRequest))
    }

  override def deleteInternetGateway(
      deleteInternetGatewayRequest: DeleteInternetGatewayRequest
  ): IO[DeleteInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteInternetGateway(deleteInternetGatewayRequest))
    }

  override def deleteKeyPair(deleteKeyPairRequest: DeleteKeyPairRequest): IO[DeleteKeyPairResponse] =
    IO.fromFuture {
      IO(underlying.deleteKeyPair(deleteKeyPairRequest))
    }

  override def deleteLaunchTemplate(
      deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest
  ): IO[DeleteLaunchTemplateResponse] =
    IO.fromFuture {
      IO(underlying.deleteLaunchTemplate(deleteLaunchTemplateRequest))
    }

  override def deleteLaunchTemplateVersions(
      deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest
  ): IO[DeleteLaunchTemplateVersionsResponse] =
    IO.fromFuture {
      IO(underlying.deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest))
    }

  override def deleteLocalGatewayRoute(
      deleteLocalGatewayRouteRequest: DeleteLocalGatewayRouteRequest
  ): IO[DeleteLocalGatewayRouteResponse] =
    IO.fromFuture {
      IO(underlying.deleteLocalGatewayRoute(deleteLocalGatewayRouteRequest))
    }

  override def deleteLocalGatewayRouteTableVpcAssociation(
      deleteLocalGatewayRouteTableVpcAssociationRequest: DeleteLocalGatewayRouteTableVpcAssociationRequest
  ): IO[DeleteLocalGatewayRouteTableVpcAssociationResponse] =
    IO.fromFuture {
      IO(underlying.deleteLocalGatewayRouteTableVpcAssociation(deleteLocalGatewayRouteTableVpcAssociationRequest))
    }

  override def deleteNatGateway(deleteNatGatewayRequest: DeleteNatGatewayRequest): IO[DeleteNatGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteNatGateway(deleteNatGatewayRequest))
    }

  override def deleteNetworkAcl(deleteNetworkAclRequest: DeleteNetworkAclRequest): IO[DeleteNetworkAclResponse] =
    IO.fromFuture {
      IO(underlying.deleteNetworkAcl(deleteNetworkAclRequest))
    }

  override def deleteNetworkAclEntry(
      deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest
  ): IO[DeleteNetworkAclEntryResponse] =
    IO.fromFuture {
      IO(underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest))
    }

  override def deleteNetworkInterface(
      deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest
  ): IO[DeleteNetworkInterfaceResponse] =
    IO.fromFuture {
      IO(underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest))
    }

  override def deleteNetworkInterfacePermission(
      deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest
  ): IO[DeleteNetworkInterfacePermissionResponse] =
    IO.fromFuture {
      IO(underlying.deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest))
    }

  override def deletePlacementGroup(
      deletePlacementGroupRequest: DeletePlacementGroupRequest
  ): IO[DeletePlacementGroupResponse] =
    IO.fromFuture {
      IO(underlying.deletePlacementGroup(deletePlacementGroupRequest))
    }

  override def deleteQueuedReservedInstances(
      deleteQueuedReservedInstancesRequest: DeleteQueuedReservedInstancesRequest
  ): IO[DeleteQueuedReservedInstancesResponse] =
    IO.fromFuture {
      IO(underlying.deleteQueuedReservedInstances(deleteQueuedReservedInstancesRequest))
    }

  override def deleteRoute(deleteRouteRequest: DeleteRouteRequest): IO[DeleteRouteResponse] =
    IO.fromFuture {
      IO(underlying.deleteRoute(deleteRouteRequest))
    }

  override def deleteRouteTable(deleteRouteTableRequest: DeleteRouteTableRequest): IO[DeleteRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.deleteRouteTable(deleteRouteTableRequest))
    }

  override def deleteSecurityGroup(
      deleteSecurityGroupRequest: DeleteSecurityGroupRequest
  ): IO[DeleteSecurityGroupResponse] =
    IO.fromFuture {
      IO(underlying.deleteSecurityGroup(deleteSecurityGroupRequest))
    }

  override def deleteSnapshot(deleteSnapshotRequest: DeleteSnapshotRequest): IO[DeleteSnapshotResponse] =
    IO.fromFuture {
      IO(underlying.deleteSnapshot(deleteSnapshotRequest))
    }

  override def deleteSpotDatafeedSubscription(
      deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest
  ): IO[DeleteSpotDatafeedSubscriptionResponse] =
    IO.fromFuture {
      IO(underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest))
    }

  override def deleteSpotDatafeedSubscription(): IO[DeleteSpotDatafeedSubscriptionResponse] =
    IO.fromFuture {
      IO(underlying.deleteSpotDatafeedSubscription())
    }

  override def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): IO[DeleteSubnetResponse] =
    IO.fromFuture {
      IO(underlying.deleteSubnet(deleteSubnetRequest))
    }

  override def deleteTags(deleteTagsRequest: DeleteTagsRequest): IO[DeleteTagsResponse] =
    IO.fromFuture {
      IO(underlying.deleteTags(deleteTagsRequest))
    }

  override def deleteTrafficMirrorFilter(
      deleteTrafficMirrorFilterRequest: DeleteTrafficMirrorFilterRequest
  ): IO[DeleteTrafficMirrorFilterResponse] =
    IO.fromFuture {
      IO(underlying.deleteTrafficMirrorFilter(deleteTrafficMirrorFilterRequest))
    }

  override def deleteTrafficMirrorFilterRule(
      deleteTrafficMirrorFilterRuleRequest: DeleteTrafficMirrorFilterRuleRequest
  ): IO[DeleteTrafficMirrorFilterRuleResponse] =
    IO.fromFuture {
      IO(underlying.deleteTrafficMirrorFilterRule(deleteTrafficMirrorFilterRuleRequest))
    }

  override def deleteTrafficMirrorSession(
      deleteTrafficMirrorSessionRequest: DeleteTrafficMirrorSessionRequest
  ): IO[DeleteTrafficMirrorSessionResponse] =
    IO.fromFuture {
      IO(underlying.deleteTrafficMirrorSession(deleteTrafficMirrorSessionRequest))
    }

  override def deleteTrafficMirrorTarget(
      deleteTrafficMirrorTargetRequest: DeleteTrafficMirrorTargetRequest
  ): IO[DeleteTrafficMirrorTargetResponse] =
    IO.fromFuture {
      IO(underlying.deleteTrafficMirrorTarget(deleteTrafficMirrorTargetRequest))
    }

  override def deleteTransitGateway(
      deleteTransitGatewayRequest: DeleteTransitGatewayRequest
  ): IO[DeleteTransitGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGateway(deleteTransitGatewayRequest))
    }

  override def deleteTransitGatewayMulticastDomain(
      deleteTransitGatewayMulticastDomainRequest: DeleteTransitGatewayMulticastDomainRequest
  ): IO[DeleteTransitGatewayMulticastDomainResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGatewayMulticastDomain(deleteTransitGatewayMulticastDomainRequest))
    }

  override def deleteTransitGatewayPeeringAttachment(
      deleteTransitGatewayPeeringAttachmentRequest: DeleteTransitGatewayPeeringAttachmentRequest
  ): IO[DeleteTransitGatewayPeeringAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGatewayPeeringAttachment(deleteTransitGatewayPeeringAttachmentRequest))
    }

  override def deleteTransitGatewayRoute(
      deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest
  ): IO[DeleteTransitGatewayRouteResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest))
    }

  override def deleteTransitGatewayRouteTable(
      deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest
  ): IO[DeleteTransitGatewayRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest))
    }

  override def deleteTransitGatewayVpcAttachment(
      deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest
  ): IO[DeleteTransitGatewayVpcAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest))
    }

  override def deleteVolume(deleteVolumeRequest: DeleteVolumeRequest): IO[DeleteVolumeResponse] =
    IO.fromFuture {
      IO(underlying.deleteVolume(deleteVolumeRequest))
    }

  override def deleteVpc(deleteVpcRequest: DeleteVpcRequest): IO[DeleteVpcResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpc(deleteVpcRequest))
    }

  override def deleteVpcEndpointConnectionNotifications(
      deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest
  ): IO[DeleteVpcEndpointConnectionNotificationsResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest))
    }

  override def deleteVpcEndpointServiceConfigurations(
      deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest
  ): IO[DeleteVpcEndpointServiceConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest))
    }

  override def deleteVpcEndpoints(
      deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest
  ): IO[DeleteVpcEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest))
    }

  override def deleteVpcPeeringConnection(
      deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest
  ): IO[DeleteVpcPeeringConnectionResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest))
    }

  override def deleteVpnConnection(
      deleteVpnConnectionRequest: DeleteVpnConnectionRequest
  ): IO[DeleteVpnConnectionResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpnConnection(deleteVpnConnectionRequest))
    }

  override def deleteVpnConnectionRoute(
      deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest
  ): IO[DeleteVpnConnectionRouteResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest))
    }

  override def deleteVpnGateway(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): IO[DeleteVpnGatewayResponse] =
    IO.fromFuture {
      IO(underlying.deleteVpnGateway(deleteVpnGatewayRequest))
    }

  override def deprovisionByoipCidr(
      deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest
  ): IO[DeprovisionByoipCidrResponse] =
    IO.fromFuture {
      IO(underlying.deprovisionByoipCidr(deprovisionByoipCidrRequest))
    }

  override def deregisterImage(deregisterImageRequest: DeregisterImageRequest): IO[DeregisterImageResponse] =
    IO.fromFuture {
      IO(underlying.deregisterImage(deregisterImageRequest))
    }

  override def deregisterTransitGatewayMulticastGroupMembers(
      deregisterTransitGatewayMulticastGroupMembersRequest: DeregisterTransitGatewayMulticastGroupMembersRequest
  ): IO[DeregisterTransitGatewayMulticastGroupMembersResponse] =
    IO.fromFuture {
      IO(underlying.deregisterTransitGatewayMulticastGroupMembers(deregisterTransitGatewayMulticastGroupMembersRequest))
    }

  override def deregisterTransitGatewayMulticastGroupSources(
      deregisterTransitGatewayMulticastGroupSourcesRequest: DeregisterTransitGatewayMulticastGroupSourcesRequest
  ): IO[DeregisterTransitGatewayMulticastGroupSourcesResponse] =
    IO.fromFuture {
      IO(underlying.deregisterTransitGatewayMulticastGroupSources(deregisterTransitGatewayMulticastGroupSourcesRequest))
    }

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): IO[DescribeAccountAttributesResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountAttributes(describeAccountAttributesRequest))
    }

  override def describeAccountAttributes(): IO[DescribeAccountAttributesResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountAttributes())
    }

  override def describeAddresses(describeAddressesRequest: DescribeAddressesRequest): IO[DescribeAddressesResponse] =
    IO.fromFuture {
      IO(underlying.describeAddresses(describeAddressesRequest))
    }

  override def describeAddresses(): IO[DescribeAddressesResponse] =
    IO.fromFuture {
      IO(underlying.describeAddresses())
    }

  override def describeAggregateIdFormat(
      describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest
  ): IO[DescribeAggregateIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describeAggregateIdFormat(describeAggregateIdFormatRequest))
    }

  override def describeAggregateIdFormat(): IO[DescribeAggregateIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describeAggregateIdFormat())
    }

  override def describeAvailabilityZones(
      describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest
  ): IO[DescribeAvailabilityZonesResponse] =
    IO.fromFuture {
      IO(underlying.describeAvailabilityZones(describeAvailabilityZonesRequest))
    }

  override def describeAvailabilityZones(): IO[DescribeAvailabilityZonesResponse] =
    IO.fromFuture {
      IO(underlying.describeAvailabilityZones())
    }

  override def describeBundleTasks(
      describeBundleTasksRequest: DescribeBundleTasksRequest
  ): IO[DescribeBundleTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeBundleTasks(describeBundleTasksRequest))
    }

  override def describeBundleTasks(): IO[DescribeBundleTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeBundleTasks())
    }

  override def describeByoipCidrs(
      describeByoipCidrsRequest: DescribeByoipCidrsRequest
  ): IO[DescribeByoipCidrsResponse] =
    IO.fromFuture {
      IO(underlying.describeByoipCidrs(describeByoipCidrsRequest))
    }

  def describeByoipCidrsPaginator(describeByoipCidrsRequest: DescribeByoipCidrsRequest): DescribeByoipCidrsPublisher =
    underlying.describeByoipCidrsPaginator(describeByoipCidrsRequest)

  override def describeCapacityReservations(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): IO[DescribeCapacityReservationsResponse] =
    IO.fromFuture {
      IO(underlying.describeCapacityReservations(describeCapacityReservationsRequest))
    }

  override def describeCapacityReservations(): IO[DescribeCapacityReservationsResponse] =
    IO.fromFuture {
      IO(underlying.describeCapacityReservations())
    }

  def describeCapacityReservationsPaginator(): DescribeCapacityReservationsPublisher =
    underlying.describeCapacityReservationsPaginator()

  def describeCapacityReservationsPaginator(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest
  ): DescribeCapacityReservationsPublisher =
    underlying.describeCapacityReservationsPaginator(describeCapacityReservationsRequest)

  override def describeClassicLinkInstances(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): IO[DescribeClassicLinkInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest))
    }

  override def describeClassicLinkInstances(): IO[DescribeClassicLinkInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeClassicLinkInstances())
    }

  def describeClassicLinkInstancesPaginator(): DescribeClassicLinkInstancesPublisher =
    underlying.describeClassicLinkInstancesPaginator()

  def describeClassicLinkInstancesPaginator(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest
  ): DescribeClassicLinkInstancesPublisher =
    underlying.describeClassicLinkInstancesPaginator(describeClassicLinkInstancesRequest)

  override def describeClientVpnAuthorizationRules(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): IO[DescribeClientVpnAuthorizationRulesResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest))
    }

  def describeClientVpnAuthorizationRulesPaginator(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest
  ): DescribeClientVpnAuthorizationRulesPublisher =
    underlying.describeClientVpnAuthorizationRulesPaginator(describeClientVpnAuthorizationRulesRequest)

  override def describeClientVpnConnections(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): IO[DescribeClientVpnConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest))
    }

  def describeClientVpnConnectionsPaginator(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest
  ): DescribeClientVpnConnectionsPublisher =
    underlying.describeClientVpnConnectionsPaginator(describeClientVpnConnectionsRequest)

  override def describeClientVpnEndpoints(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): IO[DescribeClientVpnEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest))
    }

  override def describeClientVpnEndpoints(): IO[DescribeClientVpnEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnEndpoints())
    }

  def describeClientVpnEndpointsPaginator(): DescribeClientVpnEndpointsPublisher =
    underlying.describeClientVpnEndpointsPaginator()

  def describeClientVpnEndpointsPaginator(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest
  ): DescribeClientVpnEndpointsPublisher =
    underlying.describeClientVpnEndpointsPaginator(describeClientVpnEndpointsRequest)

  override def describeClientVpnRoutes(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): IO[DescribeClientVpnRoutesResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest))
    }

  def describeClientVpnRoutesPaginator(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest
  ): DescribeClientVpnRoutesPublisher =
    underlying.describeClientVpnRoutesPaginator(describeClientVpnRoutesRequest)

  override def describeClientVpnTargetNetworks(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): IO[DescribeClientVpnTargetNetworksResponse] =
    IO.fromFuture {
      IO(underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest))
    }

  def describeClientVpnTargetNetworksPaginator(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest
  ): DescribeClientVpnTargetNetworksPublisher =
    underlying.describeClientVpnTargetNetworksPaginator(describeClientVpnTargetNetworksRequest)

  override def describeCoipPools(describeCoipPoolsRequest: DescribeCoipPoolsRequest): IO[DescribeCoipPoolsResponse] =
    IO.fromFuture {
      IO(underlying.describeCoipPools(describeCoipPoolsRequest))
    }

  override def describeConversionTasks(
      describeConversionTasksRequest: DescribeConversionTasksRequest
  ): IO[DescribeConversionTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeConversionTasks(describeConversionTasksRequest))
    }

  override def describeConversionTasks(): IO[DescribeConversionTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeConversionTasks())
    }

  override def describeCustomerGateways(
      describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest
  ): IO[DescribeCustomerGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeCustomerGateways(describeCustomerGatewaysRequest))
    }

  override def describeCustomerGateways(): IO[DescribeCustomerGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeCustomerGateways())
    }

  override def describeDhcpOptions(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): IO[DescribeDhcpOptionsResponse] =
    IO.fromFuture {
      IO(underlying.describeDhcpOptions(describeDhcpOptionsRequest))
    }

  override def describeDhcpOptions(): IO[DescribeDhcpOptionsResponse] =
    IO.fromFuture {
      IO(underlying.describeDhcpOptions())
    }

  def describeDhcpOptionsPaginator(): DescribeDhcpOptionsPublisher =
    underlying.describeDhcpOptionsPaginator()

  def describeDhcpOptionsPaginator(
      describeDhcpOptionsRequest: DescribeDhcpOptionsRequest
  ): DescribeDhcpOptionsPublisher =
    underlying.describeDhcpOptionsPaginator(describeDhcpOptionsRequest)

  override def describeEgressOnlyInternetGateways(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): IO[DescribeEgressOnlyInternetGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest))
    }

  override def describeEgressOnlyInternetGateways(): IO[DescribeEgressOnlyInternetGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeEgressOnlyInternetGateways())
    }

  def describeEgressOnlyInternetGatewaysPaginator(): DescribeEgressOnlyInternetGatewaysPublisher =
    underlying.describeEgressOnlyInternetGatewaysPaginator()

  def describeEgressOnlyInternetGatewaysPaginator(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest
  ): DescribeEgressOnlyInternetGatewaysPublisher =
    underlying.describeEgressOnlyInternetGatewaysPaginator(describeEgressOnlyInternetGatewaysRequest)

  override def describeElasticGpus(
      describeElasticGpusRequest: DescribeElasticGpusRequest
  ): IO[DescribeElasticGpusResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticGpus(describeElasticGpusRequest))
    }

  override def describeElasticGpus(): IO[DescribeElasticGpusResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticGpus())
    }

  override def describeExportImageTasks(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): IO[DescribeExportImageTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeExportImageTasks(describeExportImageTasksRequest))
    }

  def describeExportImageTasksPaginator(
      describeExportImageTasksRequest: DescribeExportImageTasksRequest
  ): DescribeExportImageTasksPublisher =
    underlying.describeExportImageTasksPaginator(describeExportImageTasksRequest)

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): IO[DescribeExportTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeExportTasks(describeExportTasksRequest))
    }

  override def describeExportTasks(): IO[DescribeExportTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeExportTasks())
    }

  override def describeFastSnapshotRestores(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): IO[DescribeFastSnapshotRestoresResponse] =
    IO.fromFuture {
      IO(underlying.describeFastSnapshotRestores(describeFastSnapshotRestoresRequest))
    }

  def describeFastSnapshotRestoresPaginator(
      describeFastSnapshotRestoresRequest: DescribeFastSnapshotRestoresRequest
  ): DescribeFastSnapshotRestoresPublisher =
    underlying.describeFastSnapshotRestoresPaginator(describeFastSnapshotRestoresRequest)

  override def describeFleetHistory(
      describeFleetHistoryRequest: DescribeFleetHistoryRequest
  ): IO[DescribeFleetHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeFleetHistory(describeFleetHistoryRequest))
    }

  override def describeFleetInstances(
      describeFleetInstancesRequest: DescribeFleetInstancesRequest
  ): IO[DescribeFleetInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeFleetInstances(describeFleetInstancesRequest))
    }

  override def describeFleets(describeFleetsRequest: DescribeFleetsRequest): IO[DescribeFleetsResponse] =
    IO.fromFuture {
      IO(underlying.describeFleets(describeFleetsRequest))
    }

  override def describeFleets(): IO[DescribeFleetsResponse] =
    IO.fromFuture {
      IO(underlying.describeFleets())
    }

  def describeFleetsPaginator(): DescribeFleetsPublisher =
    underlying.describeFleetsPaginator()

  def describeFleetsPaginator(describeFleetsRequest: DescribeFleetsRequest): DescribeFleetsPublisher =
    underlying.describeFleetsPaginator(describeFleetsRequest)

  override def describeFlowLogs(describeFlowLogsRequest: DescribeFlowLogsRequest): IO[DescribeFlowLogsResponse] =
    IO.fromFuture {
      IO(underlying.describeFlowLogs(describeFlowLogsRequest))
    }

  override def describeFlowLogs(): IO[DescribeFlowLogsResponse] =
    IO.fromFuture {
      IO(underlying.describeFlowLogs())
    }

  def describeFlowLogsPaginator(): DescribeFlowLogsPublisher =
    underlying.describeFlowLogsPaginator()

  def describeFlowLogsPaginator(describeFlowLogsRequest: DescribeFlowLogsRequest): DescribeFlowLogsPublisher =
    underlying.describeFlowLogsPaginator(describeFlowLogsRequest)

  override def describeFpgaImageAttribute(
      describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest
  ): IO[DescribeFpgaImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeFpgaImageAttribute(describeFpgaImageAttributeRequest))
    }

  override def describeFpgaImages(
      describeFpgaImagesRequest: DescribeFpgaImagesRequest
  ): IO[DescribeFpgaImagesResponse] =
    IO.fromFuture {
      IO(underlying.describeFpgaImages(describeFpgaImagesRequest))
    }

  override def describeFpgaImages(): IO[DescribeFpgaImagesResponse] =
    IO.fromFuture {
      IO(underlying.describeFpgaImages())
    }

  def describeFpgaImagesPaginator(): DescribeFpgaImagesPublisher =
    underlying.describeFpgaImagesPaginator()

  def describeFpgaImagesPaginator(describeFpgaImagesRequest: DescribeFpgaImagesRequest): DescribeFpgaImagesPublisher =
    underlying.describeFpgaImagesPaginator(describeFpgaImagesRequest)

  override def describeHostReservationOfferings(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): IO[DescribeHostReservationOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest))
    }

  override def describeHostReservationOfferings(): IO[DescribeHostReservationOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeHostReservationOfferings())
    }

  def describeHostReservationOfferingsPaginator(): DescribeHostReservationOfferingsPublisher =
    underlying.describeHostReservationOfferingsPaginator()

  def describeHostReservationOfferingsPaginator(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest
  ): DescribeHostReservationOfferingsPublisher =
    underlying.describeHostReservationOfferingsPaginator(describeHostReservationOfferingsRequest)

  override def describeHostReservations(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): IO[DescribeHostReservationsResponse] =
    IO.fromFuture {
      IO(underlying.describeHostReservations(describeHostReservationsRequest))
    }

  override def describeHostReservations(): IO[DescribeHostReservationsResponse] =
    IO.fromFuture {
      IO(underlying.describeHostReservations())
    }

  def describeHostReservationsPaginator(): DescribeHostReservationsPublisher =
    underlying.describeHostReservationsPaginator()

  def describeHostReservationsPaginator(
      describeHostReservationsRequest: DescribeHostReservationsRequest
  ): DescribeHostReservationsPublisher =
    underlying.describeHostReservationsPaginator(describeHostReservationsRequest)

  override def describeHosts(describeHostsRequest: DescribeHostsRequest): IO[DescribeHostsResponse] =
    IO.fromFuture {
      IO(underlying.describeHosts(describeHostsRequest))
    }

  override def describeHosts(): IO[DescribeHostsResponse] =
    IO.fromFuture {
      IO(underlying.describeHosts())
    }

  def describeHostsPaginator(): DescribeHostsPublisher =
    underlying.describeHostsPaginator()

  def describeHostsPaginator(describeHostsRequest: DescribeHostsRequest): DescribeHostsPublisher =
    underlying.describeHostsPaginator(describeHostsRequest)

  override def describeIamInstanceProfileAssociations(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): IO[DescribeIamInstanceProfileAssociationsResponse] =
    IO.fromFuture {
      IO(underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest))
    }

  override def describeIamInstanceProfileAssociations(): IO[DescribeIamInstanceProfileAssociationsResponse] =
    IO.fromFuture {
      IO(underlying.describeIamInstanceProfileAssociations())
    }

  def describeIamInstanceProfileAssociationsPaginator(): DescribeIamInstanceProfileAssociationsPublisher =
    underlying.describeIamInstanceProfileAssociationsPaginator()

  def describeIamInstanceProfileAssociationsPaginator(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest
  ): DescribeIamInstanceProfileAssociationsPublisher =
    underlying.describeIamInstanceProfileAssociationsPaginator(describeIamInstanceProfileAssociationsRequest)

  override def describeIdFormat(describeIdFormatRequest: DescribeIdFormatRequest): IO[DescribeIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describeIdFormat(describeIdFormatRequest))
    }

  override def describeIdFormat(): IO[DescribeIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describeIdFormat())
    }

  override def describeIdentityIdFormat(
      describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest
  ): IO[DescribeIdentityIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describeIdentityIdFormat(describeIdentityIdFormatRequest))
    }

  override def describeImageAttribute(
      describeImageAttributeRequest: DescribeImageAttributeRequest
  ): IO[DescribeImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeImageAttribute(describeImageAttributeRequest))
    }

  override def describeImages(describeImagesRequest: DescribeImagesRequest): IO[DescribeImagesResponse] =
    IO.fromFuture {
      IO(underlying.describeImages(describeImagesRequest))
    }

  override def describeImages(): IO[DescribeImagesResponse] =
    IO.fromFuture {
      IO(underlying.describeImages())
    }

  override def describeImportImageTasks(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): IO[DescribeImportImageTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeImportImageTasks(describeImportImageTasksRequest))
    }

  override def describeImportImageTasks(): IO[DescribeImportImageTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeImportImageTasks())
    }

  def describeImportImageTasksPaginator(): DescribeImportImageTasksPublisher =
    underlying.describeImportImageTasksPaginator()

  def describeImportImageTasksPaginator(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest
  ): DescribeImportImageTasksPublisher =
    underlying.describeImportImageTasksPaginator(describeImportImageTasksRequest)

  override def describeImportSnapshotTasks(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): IO[DescribeImportSnapshotTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest))
    }

  override def describeImportSnapshotTasks(): IO[DescribeImportSnapshotTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeImportSnapshotTasks())
    }

  def describeImportSnapshotTasksPaginator(): DescribeImportSnapshotTasksPublisher =
    underlying.describeImportSnapshotTasksPaginator()

  def describeImportSnapshotTasksPaginator(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest
  ): DescribeImportSnapshotTasksPublisher =
    underlying.describeImportSnapshotTasksPaginator(describeImportSnapshotTasksRequest)

  override def describeInstanceAttribute(
      describeInstanceAttributeRequest: DescribeInstanceAttributeRequest
  ): IO[DescribeInstanceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceAttribute(describeInstanceAttributeRequest))
    }

  override def describeInstanceCreditSpecifications(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): IO[DescribeInstanceCreditSpecificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest))
    }

  override def describeInstanceCreditSpecifications(): IO[DescribeInstanceCreditSpecificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceCreditSpecifications())
    }

  def describeInstanceCreditSpecificationsPaginator(): DescribeInstanceCreditSpecificationsPublisher =
    underlying.describeInstanceCreditSpecificationsPaginator()

  def describeInstanceCreditSpecificationsPaginator(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest
  ): DescribeInstanceCreditSpecificationsPublisher =
    underlying.describeInstanceCreditSpecificationsPaginator(describeInstanceCreditSpecificationsRequest)

  override def describeInstanceStatus(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): IO[DescribeInstanceStatusResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceStatus(describeInstanceStatusRequest))
    }

  override def describeInstanceStatus(): IO[DescribeInstanceStatusResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceStatus())
    }

  def describeInstanceStatusPaginator(): DescribeInstanceStatusPublisher =
    underlying.describeInstanceStatusPaginator()

  def describeInstanceStatusPaginator(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest
  ): DescribeInstanceStatusPublisher =
    underlying.describeInstanceStatusPaginator(describeInstanceStatusRequest)

  override def describeInstanceTypeOfferings(
      describeInstanceTypeOfferingsRequest: DescribeInstanceTypeOfferingsRequest
  ): IO[DescribeInstanceTypeOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceTypeOfferings(describeInstanceTypeOfferingsRequest))
    }

  override def describeInstanceTypes(
      describeInstanceTypesRequest: DescribeInstanceTypesRequest
  ): IO[DescribeInstanceTypesResponse] =
    IO.fromFuture {
      IO(underlying.describeInstanceTypes(describeInstanceTypesRequest))
    }

  override def describeInstances(describeInstancesRequest: DescribeInstancesRequest): IO[DescribeInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeInstances(describeInstancesRequest))
    }

  override def describeInstances(): IO[DescribeInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeInstances())
    }

  def describeInstancesPaginator(): DescribeInstancesPublisher =
    underlying.describeInstancesPaginator()

  def describeInstancesPaginator(describeInstancesRequest: DescribeInstancesRequest): DescribeInstancesPublisher =
    underlying.describeInstancesPaginator(describeInstancesRequest)

  override def describeInternetGateways(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): IO[DescribeInternetGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeInternetGateways(describeInternetGatewaysRequest))
    }

  override def describeInternetGateways(): IO[DescribeInternetGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeInternetGateways())
    }

  def describeInternetGatewaysPaginator(): DescribeInternetGatewaysPublisher =
    underlying.describeInternetGatewaysPaginator()

  def describeInternetGatewaysPaginator(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest
  ): DescribeInternetGatewaysPublisher =
    underlying.describeInternetGatewaysPaginator(describeInternetGatewaysRequest)

  override def describeKeyPairs(describeKeyPairsRequest: DescribeKeyPairsRequest): IO[DescribeKeyPairsResponse] =
    IO.fromFuture {
      IO(underlying.describeKeyPairs(describeKeyPairsRequest))
    }

  override def describeKeyPairs(): IO[DescribeKeyPairsResponse] =
    IO.fromFuture {
      IO(underlying.describeKeyPairs())
    }

  override def describeLaunchTemplateVersions(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): IO[DescribeLaunchTemplateVersionsResponse] =
    IO.fromFuture {
      IO(underlying.describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest))
    }

  def describeLaunchTemplateVersionsPaginator(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest
  ): DescribeLaunchTemplateVersionsPublisher =
    underlying.describeLaunchTemplateVersionsPaginator(describeLaunchTemplateVersionsRequest)

  override def describeLaunchTemplates(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): IO[DescribeLaunchTemplatesResponse] =
    IO.fromFuture {
      IO(underlying.describeLaunchTemplates(describeLaunchTemplatesRequest))
    }

  override def describeLaunchTemplates(): IO[DescribeLaunchTemplatesResponse] =
    IO.fromFuture {
      IO(underlying.describeLaunchTemplates())
    }

  def describeLaunchTemplatesPaginator(): DescribeLaunchTemplatesPublisher =
    underlying.describeLaunchTemplatesPaginator()

  def describeLaunchTemplatesPaginator(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest
  ): DescribeLaunchTemplatesPublisher =
    underlying.describeLaunchTemplatesPaginator(describeLaunchTemplatesRequest)

  override def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
      describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): IO[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse] =
    IO.fromFuture {
      IO(
        underlying.describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
          describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
        )
      )
    }

  override def describeLocalGatewayRouteTableVpcAssociations(
      describeLocalGatewayRouteTableVpcAssociationsRequest: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): IO[DescribeLocalGatewayRouteTableVpcAssociationsResponse] =
    IO.fromFuture {
      IO(underlying.describeLocalGatewayRouteTableVpcAssociations(describeLocalGatewayRouteTableVpcAssociationsRequest))
    }

  override def describeLocalGatewayRouteTables(
      describeLocalGatewayRouteTablesRequest: DescribeLocalGatewayRouteTablesRequest
  ): IO[DescribeLocalGatewayRouteTablesResponse] =
    IO.fromFuture {
      IO(underlying.describeLocalGatewayRouteTables(describeLocalGatewayRouteTablesRequest))
    }

  override def describeLocalGatewayVirtualInterfaceGroups(
      describeLocalGatewayVirtualInterfaceGroupsRequest: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): IO[DescribeLocalGatewayVirtualInterfaceGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeLocalGatewayVirtualInterfaceGroups(describeLocalGatewayVirtualInterfaceGroupsRequest))
    }

  override def describeLocalGatewayVirtualInterfaces(
      describeLocalGatewayVirtualInterfacesRequest: DescribeLocalGatewayVirtualInterfacesRequest
  ): IO[DescribeLocalGatewayVirtualInterfacesResponse] =
    IO.fromFuture {
      IO(underlying.describeLocalGatewayVirtualInterfaces(describeLocalGatewayVirtualInterfacesRequest))
    }

  override def describeLocalGateways(
      describeLocalGatewaysRequest: DescribeLocalGatewaysRequest
  ): IO[DescribeLocalGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeLocalGateways(describeLocalGatewaysRequest))
    }

  override def describeMovingAddresses(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): IO[DescribeMovingAddressesResponse] =
    IO.fromFuture {
      IO(underlying.describeMovingAddresses(describeMovingAddressesRequest))
    }

  override def describeMovingAddresses(): IO[DescribeMovingAddressesResponse] =
    IO.fromFuture {
      IO(underlying.describeMovingAddresses())
    }

  def describeMovingAddressesPaginator(): DescribeMovingAddressesPublisher =
    underlying.describeMovingAddressesPaginator()

  def describeMovingAddressesPaginator(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest
  ): DescribeMovingAddressesPublisher =
    underlying.describeMovingAddressesPaginator(describeMovingAddressesRequest)

  override def describeNatGateways(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): IO[DescribeNatGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeNatGateways(describeNatGatewaysRequest))
    }

  override def describeNatGateways(): IO[DescribeNatGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeNatGateways())
    }

  def describeNatGatewaysPaginator(): DescribeNatGatewaysPublisher =
    underlying.describeNatGatewaysPaginator()

  def describeNatGatewaysPaginator(
      describeNatGatewaysRequest: DescribeNatGatewaysRequest
  ): DescribeNatGatewaysPublisher =
    underlying.describeNatGatewaysPaginator(describeNatGatewaysRequest)

  override def describeNetworkAcls(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): IO[DescribeNetworkAclsResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkAcls(describeNetworkAclsRequest))
    }

  override def describeNetworkAcls(): IO[DescribeNetworkAclsResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkAcls())
    }

  def describeNetworkAclsPaginator(): DescribeNetworkAclsPublisher =
    underlying.describeNetworkAclsPaginator()

  def describeNetworkAclsPaginator(
      describeNetworkAclsRequest: DescribeNetworkAclsRequest
  ): DescribeNetworkAclsPublisher =
    underlying.describeNetworkAclsPaginator(describeNetworkAclsRequest)

  override def describeNetworkInterfaceAttribute(
      describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest
  ): IO[DescribeNetworkInterfaceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest))
    }

  override def describeNetworkInterfacePermissions(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): IO[DescribeNetworkInterfacePermissionsResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest))
    }

  override def describeNetworkInterfacePermissions(): IO[DescribeNetworkInterfacePermissionsResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkInterfacePermissions())
    }

  def describeNetworkInterfacePermissionsPaginator(): DescribeNetworkInterfacePermissionsPublisher =
    underlying.describeNetworkInterfacePermissionsPaginator()

  def describeNetworkInterfacePermissionsPaginator(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest
  ): DescribeNetworkInterfacePermissionsPublisher =
    underlying.describeNetworkInterfacePermissionsPaginator(describeNetworkInterfacePermissionsRequest)

  override def describeNetworkInterfaces(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): IO[DescribeNetworkInterfacesResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest))
    }

  override def describeNetworkInterfaces(): IO[DescribeNetworkInterfacesResponse] =
    IO.fromFuture {
      IO(underlying.describeNetworkInterfaces())
    }

  def describeNetworkInterfacesPaginator(): DescribeNetworkInterfacesPublisher =
    underlying.describeNetworkInterfacesPaginator()

  def describeNetworkInterfacesPaginator(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest
  ): DescribeNetworkInterfacesPublisher =
    underlying.describeNetworkInterfacesPaginator(describeNetworkInterfacesRequest)

  override def describePlacementGroups(
      describePlacementGroupsRequest: DescribePlacementGroupsRequest
  ): IO[DescribePlacementGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describePlacementGroups(describePlacementGroupsRequest))
    }

  override def describePlacementGroups(): IO[DescribePlacementGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describePlacementGroups())
    }

  override def describePrefixLists(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): IO[DescribePrefixListsResponse] =
    IO.fromFuture {
      IO(underlying.describePrefixLists(describePrefixListsRequest))
    }

  override def describePrefixLists(): IO[DescribePrefixListsResponse] =
    IO.fromFuture {
      IO(underlying.describePrefixLists())
    }

  def describePrefixListsPaginator(): DescribePrefixListsPublisher =
    underlying.describePrefixListsPaginator()

  def describePrefixListsPaginator(
      describePrefixListsRequest: DescribePrefixListsRequest
  ): DescribePrefixListsPublisher =
    underlying.describePrefixListsPaginator(describePrefixListsRequest)

  override def describePrincipalIdFormat(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): IO[DescribePrincipalIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest))
    }

  override def describePrincipalIdFormat(): IO[DescribePrincipalIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.describePrincipalIdFormat())
    }

  def describePrincipalIdFormatPaginator(): DescribePrincipalIdFormatPublisher =
    underlying.describePrincipalIdFormatPaginator()

  def describePrincipalIdFormatPaginator(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest
  ): DescribePrincipalIdFormatPublisher =
    underlying.describePrincipalIdFormatPaginator(describePrincipalIdFormatRequest)

  override def describePublicIpv4Pools(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): IO[DescribePublicIpv4PoolsResponse] =
    IO.fromFuture {
      IO(underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest))
    }

  override def describePublicIpv4Pools(): IO[DescribePublicIpv4PoolsResponse] =
    IO.fromFuture {
      IO(underlying.describePublicIpv4Pools())
    }

  def describePublicIpv4PoolsPaginator(): DescribePublicIpv4PoolsPublisher =
    underlying.describePublicIpv4PoolsPaginator()

  def describePublicIpv4PoolsPaginator(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest
  ): DescribePublicIpv4PoolsPublisher =
    underlying.describePublicIpv4PoolsPaginator(describePublicIpv4PoolsRequest)

  override def describeRegions(describeRegionsRequest: DescribeRegionsRequest): IO[DescribeRegionsResponse] =
    IO.fromFuture {
      IO(underlying.describeRegions(describeRegionsRequest))
    }

  override def describeRegions(): IO[DescribeRegionsResponse] =
    IO.fromFuture {
      IO(underlying.describeRegions())
    }

  override def describeReservedInstances(
      describeReservedInstancesRequest: DescribeReservedInstancesRequest
  ): IO[DescribeReservedInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstances(describeReservedInstancesRequest))
    }

  override def describeReservedInstances(): IO[DescribeReservedInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstances())
    }

  override def describeReservedInstancesListings(
      describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest
  ): IO[DescribeReservedInstancesListingsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest))
    }

  override def describeReservedInstancesListings(): IO[DescribeReservedInstancesListingsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesListings())
    }

  override def describeReservedInstancesModifications(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): IO[DescribeReservedInstancesModificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest))
    }

  override def describeReservedInstancesModifications(): IO[DescribeReservedInstancesModificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesModifications())
    }

  def describeReservedInstancesModificationsPaginator(): DescribeReservedInstancesModificationsPublisher =
    underlying.describeReservedInstancesModificationsPaginator()

  def describeReservedInstancesModificationsPaginator(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest
  ): DescribeReservedInstancesModificationsPublisher =
    underlying.describeReservedInstancesModificationsPaginator(describeReservedInstancesModificationsRequest)

  override def describeReservedInstancesOfferings(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): IO[DescribeReservedInstancesOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest))
    }

  override def describeReservedInstancesOfferings(): IO[DescribeReservedInstancesOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedInstancesOfferings())
    }

  def describeReservedInstancesOfferingsPaginator(): DescribeReservedInstancesOfferingsPublisher =
    underlying.describeReservedInstancesOfferingsPaginator()

  def describeReservedInstancesOfferingsPaginator(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest
  ): DescribeReservedInstancesOfferingsPublisher =
    underlying.describeReservedInstancesOfferingsPaginator(describeReservedInstancesOfferingsRequest)

  override def describeRouteTables(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): IO[DescribeRouteTablesResponse] =
    IO.fromFuture {
      IO(underlying.describeRouteTables(describeRouteTablesRequest))
    }

  override def describeRouteTables(): IO[DescribeRouteTablesResponse] =
    IO.fromFuture {
      IO(underlying.describeRouteTables())
    }

  def describeRouteTablesPaginator(): DescribeRouteTablesPublisher =
    underlying.describeRouteTablesPaginator()

  def describeRouteTablesPaginator(
      describeRouteTablesRequest: DescribeRouteTablesRequest
  ): DescribeRouteTablesPublisher =
    underlying.describeRouteTablesPaginator(describeRouteTablesRequest)

  override def describeScheduledInstanceAvailability(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): IO[DescribeScheduledInstanceAvailabilityResponse] =
    IO.fromFuture {
      IO(underlying.describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest))
    }

  def describeScheduledInstanceAvailabilityPaginator(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest
  ): DescribeScheduledInstanceAvailabilityPublisher =
    underlying.describeScheduledInstanceAvailabilityPaginator(describeScheduledInstanceAvailabilityRequest)

  override def describeScheduledInstances(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): IO[DescribeScheduledInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeScheduledInstances(describeScheduledInstancesRequest))
    }

  override def describeScheduledInstances(): IO[DescribeScheduledInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeScheduledInstances())
    }

  def describeScheduledInstancesPaginator(): DescribeScheduledInstancesPublisher =
    underlying.describeScheduledInstancesPaginator()

  def describeScheduledInstancesPaginator(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest
  ): DescribeScheduledInstancesPublisher =
    underlying.describeScheduledInstancesPaginator(describeScheduledInstancesRequest)

  override def describeSecurityGroupReferences(
      describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest
  ): IO[DescribeSecurityGroupReferencesResponse] =
    IO.fromFuture {
      IO(underlying.describeSecurityGroupReferences(describeSecurityGroupReferencesRequest))
    }

  override def describeSecurityGroups(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): IO[DescribeSecurityGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeSecurityGroups(describeSecurityGroupsRequest))
    }

  override def describeSecurityGroups(): IO[DescribeSecurityGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeSecurityGroups())
    }

  def describeSecurityGroupsPaginator(): DescribeSecurityGroupsPublisher =
    underlying.describeSecurityGroupsPaginator()

  def describeSecurityGroupsPaginator(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest
  ): DescribeSecurityGroupsPublisher =
    underlying.describeSecurityGroupsPaginator(describeSecurityGroupsRequest)

  override def describeSnapshotAttribute(
      describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest
  ): IO[DescribeSnapshotAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest))
    }

  override def describeSnapshots(describeSnapshotsRequest: DescribeSnapshotsRequest): IO[DescribeSnapshotsResponse] =
    IO.fromFuture {
      IO(underlying.describeSnapshots(describeSnapshotsRequest))
    }

  override def describeSnapshots(): IO[DescribeSnapshotsResponse] =
    IO.fromFuture {
      IO(underlying.describeSnapshots())
    }

  def describeSnapshotsPaginator(): DescribeSnapshotsPublisher =
    underlying.describeSnapshotsPaginator()

  def describeSnapshotsPaginator(describeSnapshotsRequest: DescribeSnapshotsRequest): DescribeSnapshotsPublisher =
    underlying.describeSnapshotsPaginator(describeSnapshotsRequest)

  override def describeSpotDatafeedSubscription(
      describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest
  ): IO[DescribeSpotDatafeedSubscriptionResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest))
    }

  override def describeSpotDatafeedSubscription(): IO[DescribeSpotDatafeedSubscriptionResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotDatafeedSubscription())
    }

  override def describeSpotFleetInstances(
      describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest
  ): IO[DescribeSpotFleetInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest))
    }

  override def describeSpotFleetRequestHistory(
      describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest
  ): IO[DescribeSpotFleetRequestHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest))
    }

  override def describeSpotFleetRequests(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): IO[DescribeSpotFleetRequestsResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest))
    }

  override def describeSpotFleetRequests(): IO[DescribeSpotFleetRequestsResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotFleetRequests())
    }

  def describeSpotFleetRequestsPaginator(): DescribeSpotFleetRequestsPublisher =
    underlying.describeSpotFleetRequestsPaginator()

  def describeSpotFleetRequestsPaginator(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest
  ): DescribeSpotFleetRequestsPublisher =
    underlying.describeSpotFleetRequestsPaginator(describeSpotFleetRequestsRequest)

  override def describeSpotInstanceRequests(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): IO[DescribeSpotInstanceRequestsResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest))
    }

  override def describeSpotInstanceRequests(): IO[DescribeSpotInstanceRequestsResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotInstanceRequests())
    }

  def describeSpotInstanceRequestsPaginator(): DescribeSpotInstanceRequestsPublisher =
    underlying.describeSpotInstanceRequestsPaginator()

  def describeSpotInstanceRequestsPaginator(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest
  ): DescribeSpotInstanceRequestsPublisher =
    underlying.describeSpotInstanceRequestsPaginator(describeSpotInstanceRequestsRequest)

  override def describeSpotPriceHistory(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): IO[DescribeSpotPriceHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest))
    }

  override def describeSpotPriceHistory(): IO[DescribeSpotPriceHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeSpotPriceHistory())
    }

  def describeSpotPriceHistoryPaginator(): DescribeSpotPriceHistoryPublisher =
    underlying.describeSpotPriceHistoryPaginator()

  def describeSpotPriceHistoryPaginator(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest
  ): DescribeSpotPriceHistoryPublisher =
    underlying.describeSpotPriceHistoryPaginator(describeSpotPriceHistoryRequest)

  override def describeStaleSecurityGroups(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): IO[DescribeStaleSecurityGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeStaleSecurityGroups(describeStaleSecurityGroupsRequest))
    }

  def describeStaleSecurityGroupsPaginator(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest
  ): DescribeStaleSecurityGroupsPublisher =
    underlying.describeStaleSecurityGroupsPaginator(describeStaleSecurityGroupsRequest)

  override def describeSubnets(describeSubnetsRequest: DescribeSubnetsRequest): IO[DescribeSubnetsResponse] =
    IO.fromFuture {
      IO(underlying.describeSubnets(describeSubnetsRequest))
    }

  override def describeSubnets(): IO[DescribeSubnetsResponse] =
    IO.fromFuture {
      IO(underlying.describeSubnets())
    }

  def describeSubnetsPaginator(): DescribeSubnetsPublisher =
    underlying.describeSubnetsPaginator()

  def describeSubnetsPaginator(describeSubnetsRequest: DescribeSubnetsRequest): DescribeSubnetsPublisher =
    underlying.describeSubnetsPaginator(describeSubnetsRequest)

  override def describeTags(describeTagsRequest: DescribeTagsRequest): IO[DescribeTagsResponse] =
    IO.fromFuture {
      IO(underlying.describeTags(describeTagsRequest))
    }

  override def describeTags(): IO[DescribeTagsResponse] =
    IO.fromFuture {
      IO(underlying.describeTags())
    }

  def describeTagsPaginator(): DescribeTagsPublisher =
    underlying.describeTagsPaginator()

  def describeTagsPaginator(describeTagsRequest: DescribeTagsRequest): DescribeTagsPublisher =
    underlying.describeTagsPaginator(describeTagsRequest)

  override def describeTrafficMirrorFilters(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): IO[DescribeTrafficMirrorFiltersResponse] =
    IO.fromFuture {
      IO(underlying.describeTrafficMirrorFilters(describeTrafficMirrorFiltersRequest))
    }

  def describeTrafficMirrorFiltersPaginator(
      describeTrafficMirrorFiltersRequest: DescribeTrafficMirrorFiltersRequest
  ): DescribeTrafficMirrorFiltersPublisher =
    underlying.describeTrafficMirrorFiltersPaginator(describeTrafficMirrorFiltersRequest)

  override def describeTrafficMirrorSessions(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): IO[DescribeTrafficMirrorSessionsResponse] =
    IO.fromFuture {
      IO(underlying.describeTrafficMirrorSessions(describeTrafficMirrorSessionsRequest))
    }

  def describeTrafficMirrorSessionsPaginator(
      describeTrafficMirrorSessionsRequest: DescribeTrafficMirrorSessionsRequest
  ): DescribeTrafficMirrorSessionsPublisher =
    underlying.describeTrafficMirrorSessionsPaginator(describeTrafficMirrorSessionsRequest)

  override def describeTrafficMirrorTargets(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): IO[DescribeTrafficMirrorTargetsResponse] =
    IO.fromFuture {
      IO(underlying.describeTrafficMirrorTargets(describeTrafficMirrorTargetsRequest))
    }

  def describeTrafficMirrorTargetsPaginator(
      describeTrafficMirrorTargetsRequest: DescribeTrafficMirrorTargetsRequest
  ): DescribeTrafficMirrorTargetsPublisher =
    underlying.describeTrafficMirrorTargetsPaginator(describeTrafficMirrorTargetsRequest)

  override def describeTransitGatewayAttachments(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): IO[DescribeTransitGatewayAttachmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest))
    }

  override def describeTransitGatewayAttachments(): IO[DescribeTransitGatewayAttachmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayAttachments())
    }

  def describeTransitGatewayAttachmentsPaginator(): DescribeTransitGatewayAttachmentsPublisher =
    underlying.describeTransitGatewayAttachmentsPaginator()

  def describeTransitGatewayAttachmentsPaginator(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest
  ): DescribeTransitGatewayAttachmentsPublisher =
    underlying.describeTransitGatewayAttachmentsPaginator(describeTransitGatewayAttachmentsRequest)

  override def describeTransitGatewayMulticastDomains(
      describeTransitGatewayMulticastDomainsRequest: DescribeTransitGatewayMulticastDomainsRequest
  ): IO[DescribeTransitGatewayMulticastDomainsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayMulticastDomains(describeTransitGatewayMulticastDomainsRequest))
    }

  override def describeTransitGatewayPeeringAttachments(
      describeTransitGatewayPeeringAttachmentsRequest: DescribeTransitGatewayPeeringAttachmentsRequest
  ): IO[DescribeTransitGatewayPeeringAttachmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayPeeringAttachments(describeTransitGatewayPeeringAttachmentsRequest))
    }

  override def describeTransitGatewayRouteTables(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): IO[DescribeTransitGatewayRouteTablesResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest))
    }

  override def describeTransitGatewayRouteTables(): IO[DescribeTransitGatewayRouteTablesResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayRouteTables())
    }

  def describeTransitGatewayRouteTablesPaginator(): DescribeTransitGatewayRouteTablesPublisher =
    underlying.describeTransitGatewayRouteTablesPaginator()

  def describeTransitGatewayRouteTablesPaginator(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest
  ): DescribeTransitGatewayRouteTablesPublisher =
    underlying.describeTransitGatewayRouteTablesPaginator(describeTransitGatewayRouteTablesRequest)

  override def describeTransitGatewayVpcAttachments(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): IO[DescribeTransitGatewayVpcAttachmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest))
    }

  override def describeTransitGatewayVpcAttachments(): IO[DescribeTransitGatewayVpcAttachmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGatewayVpcAttachments())
    }

  def describeTransitGatewayVpcAttachmentsPaginator(): DescribeTransitGatewayVpcAttachmentsPublisher =
    underlying.describeTransitGatewayVpcAttachmentsPaginator()

  def describeTransitGatewayVpcAttachmentsPaginator(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest
  ): DescribeTransitGatewayVpcAttachmentsPublisher =
    underlying.describeTransitGatewayVpcAttachmentsPaginator(describeTransitGatewayVpcAttachmentsRequest)

  override def describeTransitGateways(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): IO[DescribeTransitGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGateways(describeTransitGatewaysRequest))
    }

  override def describeTransitGateways(): IO[DescribeTransitGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeTransitGateways())
    }

  def describeTransitGatewaysPaginator(): DescribeTransitGatewaysPublisher =
    underlying.describeTransitGatewaysPaginator()

  def describeTransitGatewaysPaginator(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest
  ): DescribeTransitGatewaysPublisher =
    underlying.describeTransitGatewaysPaginator(describeTransitGatewaysRequest)

  override def describeVolumeAttribute(
      describeVolumeAttributeRequest: DescribeVolumeAttributeRequest
  ): IO[DescribeVolumeAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumeAttribute(describeVolumeAttributeRequest))
    }

  override def describeVolumeStatus(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): IO[DescribeVolumeStatusResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumeStatus(describeVolumeStatusRequest))
    }

  override def describeVolumeStatus(): IO[DescribeVolumeStatusResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumeStatus())
    }

  def describeVolumeStatusPaginator(): DescribeVolumeStatusPublisher =
    underlying.describeVolumeStatusPaginator()

  def describeVolumeStatusPaginator(
      describeVolumeStatusRequest: DescribeVolumeStatusRequest
  ): DescribeVolumeStatusPublisher =
    underlying.describeVolumeStatusPaginator(describeVolumeStatusRequest)

  override def describeVolumes(describeVolumesRequest: DescribeVolumesRequest): IO[DescribeVolumesResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumes(describeVolumesRequest))
    }

  override def describeVolumes(): IO[DescribeVolumesResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumes())
    }

  override def describeVolumesModifications(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest
  ): IO[DescribeVolumesModificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumesModifications(describeVolumesModificationsRequest))
    }

  override def describeVolumesModifications(): IO[DescribeVolumesModificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVolumesModifications())
    }

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
  ): IO[DescribeVpcAttributeResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcAttribute(describeVpcAttributeRequest))
    }

  override def describeVpcClassicLink(
      describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest
  ): IO[DescribeVpcClassicLinkResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcClassicLink(describeVpcClassicLinkRequest))
    }

  override def describeVpcClassicLink(): IO[DescribeVpcClassicLinkResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcClassicLink())
    }

  override def describeVpcClassicLinkDnsSupport(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): IO[DescribeVpcClassicLinkDnsSupportResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest))
    }

  override def describeVpcClassicLinkDnsSupport(): IO[DescribeVpcClassicLinkDnsSupportResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcClassicLinkDnsSupport())
    }

  def describeVpcClassicLinkDnsSupportPaginator(): DescribeVpcClassicLinkDnsSupportPublisher =
    underlying.describeVpcClassicLinkDnsSupportPaginator()

  def describeVpcClassicLinkDnsSupportPaginator(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest
  ): DescribeVpcClassicLinkDnsSupportPublisher =
    underlying.describeVpcClassicLinkDnsSupportPaginator(describeVpcClassicLinkDnsSupportRequest)

  override def describeVpcEndpointConnectionNotifications(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): IO[DescribeVpcEndpointConnectionNotificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest))
    }

  override def describeVpcEndpointConnectionNotifications(): IO[DescribeVpcEndpointConnectionNotificationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointConnectionNotifications())
    }

  def describeVpcEndpointConnectionNotificationsPaginator(): DescribeVpcEndpointConnectionNotificationsPublisher =
    underlying.describeVpcEndpointConnectionNotificationsPaginator()

  def describeVpcEndpointConnectionNotificationsPaginator(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest
  ): DescribeVpcEndpointConnectionNotificationsPublisher =
    underlying.describeVpcEndpointConnectionNotificationsPaginator(describeVpcEndpointConnectionNotificationsRequest)

  override def describeVpcEndpointConnections(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): IO[DescribeVpcEndpointConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest))
    }

  override def describeVpcEndpointConnections(): IO[DescribeVpcEndpointConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointConnections())
    }

  def describeVpcEndpointConnectionsPaginator(): DescribeVpcEndpointConnectionsPublisher =
    underlying.describeVpcEndpointConnectionsPaginator()

  def describeVpcEndpointConnectionsPaginator(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest
  ): DescribeVpcEndpointConnectionsPublisher =
    underlying.describeVpcEndpointConnectionsPaginator(describeVpcEndpointConnectionsRequest)

  override def describeVpcEndpointServiceConfigurations(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): IO[DescribeVpcEndpointServiceConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest))
    }

  override def describeVpcEndpointServiceConfigurations(): IO[DescribeVpcEndpointServiceConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointServiceConfigurations())
    }

  def describeVpcEndpointServiceConfigurationsPaginator(): DescribeVpcEndpointServiceConfigurationsPublisher =
    underlying.describeVpcEndpointServiceConfigurationsPaginator()

  def describeVpcEndpointServiceConfigurationsPaginator(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest
  ): DescribeVpcEndpointServiceConfigurationsPublisher =
    underlying.describeVpcEndpointServiceConfigurationsPaginator(describeVpcEndpointServiceConfigurationsRequest)

  override def describeVpcEndpointServicePermissions(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): IO[DescribeVpcEndpointServicePermissionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest))
    }

  def describeVpcEndpointServicePermissionsPaginator(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest
  ): DescribeVpcEndpointServicePermissionsPublisher =
    underlying.describeVpcEndpointServicePermissionsPaginator(describeVpcEndpointServicePermissionsRequest)

  override def describeVpcEndpointServices(
      describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest
  ): IO[DescribeVpcEndpointServicesResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest))
    }

  override def describeVpcEndpointServices(): IO[DescribeVpcEndpointServicesResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpointServices())
    }

  override def describeVpcEndpoints(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): IO[DescribeVpcEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpoints(describeVpcEndpointsRequest))
    }

  override def describeVpcEndpoints(): IO[DescribeVpcEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcEndpoints())
    }

  def describeVpcEndpointsPaginator(): DescribeVpcEndpointsPublisher =
    underlying.describeVpcEndpointsPaginator()

  def describeVpcEndpointsPaginator(
      describeVpcEndpointsRequest: DescribeVpcEndpointsRequest
  ): DescribeVpcEndpointsPublisher =
    underlying.describeVpcEndpointsPaginator(describeVpcEndpointsRequest)

  override def describeVpcPeeringConnections(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): IO[DescribeVpcPeeringConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest))
    }

  override def describeVpcPeeringConnections(): IO[DescribeVpcPeeringConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcPeeringConnections())
    }

  def describeVpcPeeringConnectionsPaginator(): DescribeVpcPeeringConnectionsPublisher =
    underlying.describeVpcPeeringConnectionsPaginator()

  def describeVpcPeeringConnectionsPaginator(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest
  ): DescribeVpcPeeringConnectionsPublisher =
    underlying.describeVpcPeeringConnectionsPaginator(describeVpcPeeringConnectionsRequest)

  override def describeVpcs(describeVpcsRequest: DescribeVpcsRequest): IO[DescribeVpcsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcs(describeVpcsRequest))
    }

  override def describeVpcs(): IO[DescribeVpcsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpcs())
    }

  def describeVpcsPaginator(): DescribeVpcsPublisher =
    underlying.describeVpcsPaginator()

  def describeVpcsPaginator(describeVpcsRequest: DescribeVpcsRequest): DescribeVpcsPublisher =
    underlying.describeVpcsPaginator(describeVpcsRequest)

  override def describeVpnConnections(
      describeVpnConnectionsRequest: DescribeVpnConnectionsRequest
  ): IO[DescribeVpnConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpnConnections(describeVpnConnectionsRequest))
    }

  override def describeVpnConnections(): IO[DescribeVpnConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.describeVpnConnections())
    }

  override def describeVpnGateways(
      describeVpnGatewaysRequest: DescribeVpnGatewaysRequest
  ): IO[DescribeVpnGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeVpnGateways(describeVpnGatewaysRequest))
    }

  override def describeVpnGateways(): IO[DescribeVpnGatewaysResponse] =
    IO.fromFuture {
      IO(underlying.describeVpnGateways())
    }

  override def detachClassicLinkVpc(
      detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest
  ): IO[DetachClassicLinkVpcResponse] =
    IO.fromFuture {
      IO(underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest))
    }

  override def detachInternetGateway(
      detachInternetGatewayRequest: DetachInternetGatewayRequest
  ): IO[DetachInternetGatewayResponse] =
    IO.fromFuture {
      IO(underlying.detachInternetGateway(detachInternetGatewayRequest))
    }

  override def detachNetworkInterface(
      detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest
  ): IO[DetachNetworkInterfaceResponse] =
    IO.fromFuture {
      IO(underlying.detachNetworkInterface(detachNetworkInterfaceRequest))
    }

  override def detachVolume(detachVolumeRequest: DetachVolumeRequest): IO[DetachVolumeResponse] =
    IO.fromFuture {
      IO(underlying.detachVolume(detachVolumeRequest))
    }

  override def detachVpnGateway(detachVpnGatewayRequest: DetachVpnGatewayRequest): IO[DetachVpnGatewayResponse] =
    IO.fromFuture {
      IO(underlying.detachVpnGateway(detachVpnGatewayRequest))
    }

  override def disableEbsEncryptionByDefault(
      disableEbsEncryptionByDefaultRequest: DisableEbsEncryptionByDefaultRequest
  ): IO[DisableEbsEncryptionByDefaultResponse] =
    IO.fromFuture {
      IO(underlying.disableEbsEncryptionByDefault(disableEbsEncryptionByDefaultRequest))
    }

  override def disableFastSnapshotRestores(
      disableFastSnapshotRestoresRequest: DisableFastSnapshotRestoresRequest
  ): IO[DisableFastSnapshotRestoresResponse] =
    IO.fromFuture {
      IO(underlying.disableFastSnapshotRestores(disableFastSnapshotRestoresRequest))
    }

  override def disableTransitGatewayRouteTablePropagation(
      disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest
  ): IO[DisableTransitGatewayRouteTablePropagationResponse] =
    IO.fromFuture {
      IO(underlying.disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest))
    }

  override def disableVgwRoutePropagation(
      disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest
  ): IO[DisableVgwRoutePropagationResponse] =
    IO.fromFuture {
      IO(underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest))
    }

  override def disableVpcClassicLink(
      disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest
  ): IO[DisableVpcClassicLinkResponse] =
    IO.fromFuture {
      IO(underlying.disableVpcClassicLink(disableVpcClassicLinkRequest))
    }

  override def disableVpcClassicLinkDnsSupport(
      disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest
  ): IO[DisableVpcClassicLinkDnsSupportResponse] =
    IO.fromFuture {
      IO(underlying.disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest))
    }

  override def disassociateAddress(
      disassociateAddressRequest: DisassociateAddressRequest
  ): IO[DisassociateAddressResponse] =
    IO.fromFuture {
      IO(underlying.disassociateAddress(disassociateAddressRequest))
    }

  override def disassociateClientVpnTargetNetwork(
      disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest
  ): IO[DisassociateClientVpnTargetNetworkResponse] =
    IO.fromFuture {
      IO(underlying.disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest))
    }

  override def disassociateIamInstanceProfile(
      disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest
  ): IO[DisassociateIamInstanceProfileResponse] =
    IO.fromFuture {
      IO(underlying.disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest))
    }

  override def disassociateRouteTable(
      disassociateRouteTableRequest: DisassociateRouteTableRequest
  ): IO[DisassociateRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.disassociateRouteTable(disassociateRouteTableRequest))
    }

  override def disassociateSubnetCidrBlock(
      disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest
  ): IO[DisassociateSubnetCidrBlockResponse] =
    IO.fromFuture {
      IO(underlying.disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest))
    }

  override def disassociateTransitGatewayMulticastDomain(
      disassociateTransitGatewayMulticastDomainRequest: DisassociateTransitGatewayMulticastDomainRequest
  ): IO[DisassociateTransitGatewayMulticastDomainResponse] =
    IO.fromFuture {
      IO(underlying.disassociateTransitGatewayMulticastDomain(disassociateTransitGatewayMulticastDomainRequest))
    }

  override def disassociateTransitGatewayRouteTable(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest
  ): IO[DisassociateTransitGatewayRouteTableResponse] =
    IO.fromFuture {
      IO(underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest))
    }

  override def disassociateVpcCidrBlock(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest
  ): IO[DisassociateVpcCidrBlockResponse] =
    IO.fromFuture {
      IO(underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest))
    }

  override def enableEbsEncryptionByDefault(
      enableEbsEncryptionByDefaultRequest: EnableEbsEncryptionByDefaultRequest
  ): IO[EnableEbsEncryptionByDefaultResponse] =
    IO.fromFuture {
      IO(underlying.enableEbsEncryptionByDefault(enableEbsEncryptionByDefaultRequest))
    }

  override def enableFastSnapshotRestores(
      enableFastSnapshotRestoresRequest: EnableFastSnapshotRestoresRequest
  ): IO[EnableFastSnapshotRestoresResponse] =
    IO.fromFuture {
      IO(underlying.enableFastSnapshotRestores(enableFastSnapshotRestoresRequest))
    }

  override def enableTransitGatewayRouteTablePropagation(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest
  ): IO[EnableTransitGatewayRouteTablePropagationResponse] =
    IO.fromFuture {
      IO(underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest))
    }

  override def enableVgwRoutePropagation(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest
  ): IO[EnableVgwRoutePropagationResponse] =
    IO.fromFuture {
      IO(underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest))
    }

  override def enableVolumeIO(enableVolumeIoRequest: EnableVolumeIoRequest): IO[EnableVolumeIOResponse] =
    IO.fromFuture {
      IO(underlying.enableVolumeIO(enableVolumeIoRequest))
    }

  override def enableVpcClassicLink(
      enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest
  ): IO[EnableVpcClassicLinkResponse] =
    IO.fromFuture {
      IO(underlying.enableVpcClassicLink(enableVpcClassicLinkRequest))
    }

  override def enableVpcClassicLinkDnsSupport(
      enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest
  ): IO[EnableVpcClassicLinkDnsSupportResponse] =
    IO.fromFuture {
      IO(underlying.enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest))
    }

  override def exportClientVpnClientCertificateRevocationList(
      exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest
  ): IO[ExportClientVpnClientCertificateRevocationListResponse] =
    IO.fromFuture {
      IO(
        underlying.exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest)
      )
    }

  override def exportClientVpnClientConfiguration(
      exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest
  ): IO[ExportClientVpnClientConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest))
    }

  override def exportImage(exportImageRequest: ExportImageRequest): IO[ExportImageResponse] =
    IO.fromFuture {
      IO(underlying.exportImage(exportImageRequest))
    }

  override def exportTransitGatewayRoutes(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest
  ): IO[ExportTransitGatewayRoutesResponse] =
    IO.fromFuture {
      IO(underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest))
    }

  override def getCapacityReservationUsage(
      getCapacityReservationUsageRequest: GetCapacityReservationUsageRequest
  ): IO[GetCapacityReservationUsageResponse] =
    IO.fromFuture {
      IO(underlying.getCapacityReservationUsage(getCapacityReservationUsageRequest))
    }

  override def getCoipPoolUsage(getCoipPoolUsageRequest: GetCoipPoolUsageRequest): IO[GetCoipPoolUsageResponse] =
    IO.fromFuture {
      IO(underlying.getCoipPoolUsage(getCoipPoolUsageRequest))
    }

  override def getConsoleOutput(getConsoleOutputRequest: GetConsoleOutputRequest): IO[GetConsoleOutputResponse] =
    IO.fromFuture {
      IO(underlying.getConsoleOutput(getConsoleOutputRequest))
    }

  override def getConsoleScreenshot(
      getConsoleScreenshotRequest: GetConsoleScreenshotRequest
  ): IO[GetConsoleScreenshotResponse] =
    IO.fromFuture {
      IO(underlying.getConsoleScreenshot(getConsoleScreenshotRequest))
    }

  override def getDefaultCreditSpecification(
      getDefaultCreditSpecificationRequest: GetDefaultCreditSpecificationRequest
  ): IO[GetDefaultCreditSpecificationResponse] =
    IO.fromFuture {
      IO(underlying.getDefaultCreditSpecification(getDefaultCreditSpecificationRequest))
    }

  override def getEbsDefaultKmsKeyId(
      getEbsDefaultKmsKeyIdRequest: GetEbsDefaultKmsKeyIdRequest
  ): IO[GetEbsDefaultKmsKeyIdResponse] =
    IO.fromFuture {
      IO(underlying.getEbsDefaultKmsKeyId(getEbsDefaultKmsKeyIdRequest))
    }

  override def getEbsEncryptionByDefault(
      getEbsEncryptionByDefaultRequest: GetEbsEncryptionByDefaultRequest
  ): IO[GetEbsEncryptionByDefaultResponse] =
    IO.fromFuture {
      IO(underlying.getEbsEncryptionByDefault(getEbsEncryptionByDefaultRequest))
    }

  override def getHostReservationPurchasePreview(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest
  ): IO[GetHostReservationPurchasePreviewResponse] =
    IO.fromFuture {
      IO(underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest))
    }

  override def getLaunchTemplateData(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest
  ): IO[GetLaunchTemplateDataResponse] =
    IO.fromFuture {
      IO(underlying.getLaunchTemplateData(getLaunchTemplateDataRequest))
    }

  override def getPasswordData(getPasswordDataRequest: GetPasswordDataRequest): IO[GetPasswordDataResponse] =
    IO.fromFuture {
      IO(underlying.getPasswordData(getPasswordDataRequest))
    }

  override def getReservedInstancesExchangeQuote(
      getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest
  ): IO[GetReservedInstancesExchangeQuoteResponse] =
    IO.fromFuture {
      IO(underlying.getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest))
    }

  override def getTransitGatewayAttachmentPropagations(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): IO[GetTransitGatewayAttachmentPropagationsResponse] =
    IO.fromFuture {
      IO(underlying.getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest))
    }

  def getTransitGatewayAttachmentPropagationsPaginator(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest
  ): GetTransitGatewayAttachmentPropagationsPublisher =
    underlying.getTransitGatewayAttachmentPropagationsPaginator(getTransitGatewayAttachmentPropagationsRequest)

  override def getTransitGatewayMulticastDomainAssociations(
      getTransitGatewayMulticastDomainAssociationsRequest: GetTransitGatewayMulticastDomainAssociationsRequest
  ): IO[GetTransitGatewayMulticastDomainAssociationsResponse] =
    IO.fromFuture {
      IO(underlying.getTransitGatewayMulticastDomainAssociations(getTransitGatewayMulticastDomainAssociationsRequest))
    }

  override def getTransitGatewayRouteTableAssociations(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): IO[GetTransitGatewayRouteTableAssociationsResponse] =
    IO.fromFuture {
      IO(underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest))
    }

  def getTransitGatewayRouteTableAssociationsPaginator(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest
  ): GetTransitGatewayRouteTableAssociationsPublisher =
    underlying.getTransitGatewayRouteTableAssociationsPaginator(getTransitGatewayRouteTableAssociationsRequest)

  override def getTransitGatewayRouteTablePropagations(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): IO[GetTransitGatewayRouteTablePropagationsResponse] =
    IO.fromFuture {
      IO(underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest))
    }

  def getTransitGatewayRouteTablePropagationsPaginator(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest
  ): GetTransitGatewayRouteTablePropagationsPublisher =
    underlying.getTransitGatewayRouteTablePropagationsPaginator(getTransitGatewayRouteTablePropagationsRequest)

  override def importClientVpnClientCertificateRevocationList(
      importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest
  ): IO[ImportClientVpnClientCertificateRevocationListResponse] =
    IO.fromFuture {
      IO(
        underlying.importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest)
      )
    }

  override def importImage(importImageRequest: ImportImageRequest): IO[ImportImageResponse] =
    IO.fromFuture {
      IO(underlying.importImage(importImageRequest))
    }

  override def importInstance(importInstanceRequest: ImportInstanceRequest): IO[ImportInstanceResponse] =
    IO.fromFuture {
      IO(underlying.importInstance(importInstanceRequest))
    }

  override def importKeyPair(importKeyPairRequest: ImportKeyPairRequest): IO[ImportKeyPairResponse] =
    IO.fromFuture {
      IO(underlying.importKeyPair(importKeyPairRequest))
    }

  override def importSnapshot(importSnapshotRequest: ImportSnapshotRequest): IO[ImportSnapshotResponse] =
    IO.fromFuture {
      IO(underlying.importSnapshot(importSnapshotRequest))
    }

  override def importVolume(importVolumeRequest: ImportVolumeRequest): IO[ImportVolumeResponse] =
    IO.fromFuture {
      IO(underlying.importVolume(importVolumeRequest))
    }

  override def modifyCapacityReservation(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest
  ): IO[ModifyCapacityReservationResponse] =
    IO.fromFuture {
      IO(underlying.modifyCapacityReservation(modifyCapacityReservationRequest))
    }

  override def modifyClientVpnEndpoint(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest
  ): IO[ModifyClientVpnEndpointResponse] =
    IO.fromFuture {
      IO(underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest))
    }

  override def modifyDefaultCreditSpecification(
      modifyDefaultCreditSpecificationRequest: ModifyDefaultCreditSpecificationRequest
  ): IO[ModifyDefaultCreditSpecificationResponse] =
    IO.fromFuture {
      IO(underlying.modifyDefaultCreditSpecification(modifyDefaultCreditSpecificationRequest))
    }

  override def modifyEbsDefaultKmsKeyId(
      modifyEbsDefaultKmsKeyIdRequest: ModifyEbsDefaultKmsKeyIdRequest
  ): IO[ModifyEbsDefaultKmsKeyIdResponse] =
    IO.fromFuture {
      IO(underlying.modifyEbsDefaultKmsKeyId(modifyEbsDefaultKmsKeyIdRequest))
    }

  override def modifyFleet(modifyFleetRequest: ModifyFleetRequest): IO[ModifyFleetResponse] =
    IO.fromFuture {
      IO(underlying.modifyFleet(modifyFleetRequest))
    }

  override def modifyFpgaImageAttribute(
      modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest
  ): IO[ModifyFpgaImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest))
    }

  override def modifyHosts(modifyHostsRequest: ModifyHostsRequest): IO[ModifyHostsResponse] =
    IO.fromFuture {
      IO(underlying.modifyHosts(modifyHostsRequest))
    }

  override def modifyIdFormat(modifyIdFormatRequest: ModifyIdFormatRequest): IO[ModifyIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.modifyIdFormat(modifyIdFormatRequest))
    }

  override def modifyIdentityIdFormat(
      modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest
  ): IO[ModifyIdentityIdFormatResponse] =
    IO.fromFuture {
      IO(underlying.modifyIdentityIdFormat(modifyIdentityIdFormatRequest))
    }

  override def modifyImageAttribute(
      modifyImageAttributeRequest: ModifyImageAttributeRequest
  ): IO[ModifyImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyImageAttribute(modifyImageAttributeRequest))
    }

  override def modifyInstanceAttribute(
      modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest
  ): IO[ModifyInstanceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest))
    }

  override def modifyInstanceCapacityReservationAttributes(
      modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest
  ): IO[ModifyInstanceCapacityReservationAttributesResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest))
    }

  override def modifyInstanceCreditSpecification(
      modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest
  ): IO[ModifyInstanceCreditSpecificationResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest))
    }

  override def modifyInstanceEventStartTime(
      modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest
  ): IO[ModifyInstanceEventStartTimeResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest))
    }

  override def modifyInstanceMetadataOptions(
      modifyInstanceMetadataOptionsRequest: ModifyInstanceMetadataOptionsRequest
  ): IO[ModifyInstanceMetadataOptionsResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstanceMetadataOptions(modifyInstanceMetadataOptionsRequest))
    }

  override def modifyInstancePlacement(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest
  ): IO[ModifyInstancePlacementResponse] =
    IO.fromFuture {
      IO(underlying.modifyInstancePlacement(modifyInstancePlacementRequest))
    }

  override def modifyLaunchTemplate(
      modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest
  ): IO[ModifyLaunchTemplateResponse] =
    IO.fromFuture {
      IO(underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest))
    }

  override def modifyNetworkInterfaceAttribute(
      modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest
  ): IO[ModifyNetworkInterfaceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest))
    }

  override def modifyReservedInstances(
      modifyReservedInstancesRequest: ModifyReservedInstancesRequest
  ): IO[ModifyReservedInstancesResponse] =
    IO.fromFuture {
      IO(underlying.modifyReservedInstances(modifyReservedInstancesRequest))
    }

  override def modifySnapshotAttribute(
      modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest
  ): IO[ModifySnapshotAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest))
    }

  override def modifySpotFleetRequest(
      modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest
  ): IO[ModifySpotFleetRequestResponse] =
    IO.fromFuture {
      IO(underlying.modifySpotFleetRequest(modifySpotFleetRequestRequest))
    }

  override def modifySubnetAttribute(
      modifySubnetAttributeRequest: ModifySubnetAttributeRequest
  ): IO[ModifySubnetAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifySubnetAttribute(modifySubnetAttributeRequest))
    }

  override def modifyTrafficMirrorFilterNetworkServices(
      modifyTrafficMirrorFilterNetworkServicesRequest: ModifyTrafficMirrorFilterNetworkServicesRequest
  ): IO[ModifyTrafficMirrorFilterNetworkServicesResponse] =
    IO.fromFuture {
      IO(underlying.modifyTrafficMirrorFilterNetworkServices(modifyTrafficMirrorFilterNetworkServicesRequest))
    }

  override def modifyTrafficMirrorFilterRule(
      modifyTrafficMirrorFilterRuleRequest: ModifyTrafficMirrorFilterRuleRequest
  ): IO[ModifyTrafficMirrorFilterRuleResponse] =
    IO.fromFuture {
      IO(underlying.modifyTrafficMirrorFilterRule(modifyTrafficMirrorFilterRuleRequest))
    }

  override def modifyTrafficMirrorSession(
      modifyTrafficMirrorSessionRequest: ModifyTrafficMirrorSessionRequest
  ): IO[ModifyTrafficMirrorSessionResponse] =
    IO.fromFuture {
      IO(underlying.modifyTrafficMirrorSession(modifyTrafficMirrorSessionRequest))
    }

  override def modifyTransitGatewayVpcAttachment(
      modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest
  ): IO[ModifyTransitGatewayVpcAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest))
    }

  override def modifyVolume(modifyVolumeRequest: ModifyVolumeRequest): IO[ModifyVolumeResponse] =
    IO.fromFuture {
      IO(underlying.modifyVolume(modifyVolumeRequest))
    }

  override def modifyVolumeAttribute(
      modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest
  ): IO[ModifyVolumeAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest))
    }

  override def modifyVpcAttribute(
      modifyVpcAttributeRequest: ModifyVpcAttributeRequest
  ): IO[ModifyVpcAttributeResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcAttribute(modifyVpcAttributeRequest))
    }

  override def modifyVpcEndpoint(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): IO[ModifyVpcEndpointResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcEndpoint(modifyVpcEndpointRequest))
    }

  override def modifyVpcEndpointConnectionNotification(
      modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest
  ): IO[ModifyVpcEndpointConnectionNotificationResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest))
    }

  override def modifyVpcEndpointServiceConfiguration(
      modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest
  ): IO[ModifyVpcEndpointServiceConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest))
    }

  override def modifyVpcEndpointServicePermissions(
      modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest
  ): IO[ModifyVpcEndpointServicePermissionsResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest))
    }

  override def modifyVpcPeeringConnectionOptions(
      modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest
  ): IO[ModifyVpcPeeringConnectionOptionsResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest))
    }

  override def modifyVpcTenancy(modifyVpcTenancyRequest: ModifyVpcTenancyRequest): IO[ModifyVpcTenancyResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpcTenancy(modifyVpcTenancyRequest))
    }

  override def modifyVpnConnection(
      modifyVpnConnectionRequest: ModifyVpnConnectionRequest
  ): IO[ModifyVpnConnectionResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpnConnection(modifyVpnConnectionRequest))
    }

  override def modifyVpnTunnelCertificate(
      modifyVpnTunnelCertificateRequest: ModifyVpnTunnelCertificateRequest
  ): IO[ModifyVpnTunnelCertificateResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpnTunnelCertificate(modifyVpnTunnelCertificateRequest))
    }

  override def modifyVpnTunnelOptions(
      modifyVpnTunnelOptionsRequest: ModifyVpnTunnelOptionsRequest
  ): IO[ModifyVpnTunnelOptionsResponse] =
    IO.fromFuture {
      IO(underlying.modifyVpnTunnelOptions(modifyVpnTunnelOptionsRequest))
    }

  override def monitorInstances(monitorInstancesRequest: MonitorInstancesRequest): IO[MonitorInstancesResponse] =
    IO.fromFuture {
      IO(underlying.monitorInstances(monitorInstancesRequest))
    }

  override def moveAddressToVpc(moveAddressToVpcRequest: MoveAddressToVpcRequest): IO[MoveAddressToVpcResponse] =
    IO.fromFuture {
      IO(underlying.moveAddressToVpc(moveAddressToVpcRequest))
    }

  override def provisionByoipCidr(
      provisionByoipCidrRequest: ProvisionByoipCidrRequest
  ): IO[ProvisionByoipCidrResponse] =
    IO.fromFuture {
      IO(underlying.provisionByoipCidr(provisionByoipCidrRequest))
    }

  override def purchaseHostReservation(
      purchaseHostReservationRequest: PurchaseHostReservationRequest
  ): IO[PurchaseHostReservationResponse] =
    IO.fromFuture {
      IO(underlying.purchaseHostReservation(purchaseHostReservationRequest))
    }

  override def purchaseReservedInstancesOffering(
      purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest
  ): IO[PurchaseReservedInstancesOfferingResponse] =
    IO.fromFuture {
      IO(underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest))
    }

  override def purchaseScheduledInstances(
      purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest
  ): IO[PurchaseScheduledInstancesResponse] =
    IO.fromFuture {
      IO(underlying.purchaseScheduledInstances(purchaseScheduledInstancesRequest))
    }

  override def rebootInstances(rebootInstancesRequest: RebootInstancesRequest): IO[RebootInstancesResponse] =
    IO.fromFuture {
      IO(underlying.rebootInstances(rebootInstancesRequest))
    }

  override def registerImage(registerImageRequest: RegisterImageRequest): IO[RegisterImageResponse] =
    IO.fromFuture {
      IO(underlying.registerImage(registerImageRequest))
    }

  override def registerTransitGatewayMulticastGroupMembers(
      registerTransitGatewayMulticastGroupMembersRequest: RegisterTransitGatewayMulticastGroupMembersRequest
  ): IO[RegisterTransitGatewayMulticastGroupMembersResponse] =
    IO.fromFuture {
      IO(underlying.registerTransitGatewayMulticastGroupMembers(registerTransitGatewayMulticastGroupMembersRequest))
    }

  override def registerTransitGatewayMulticastGroupSources(
      registerTransitGatewayMulticastGroupSourcesRequest: RegisterTransitGatewayMulticastGroupSourcesRequest
  ): IO[RegisterTransitGatewayMulticastGroupSourcesResponse] =
    IO.fromFuture {
      IO(underlying.registerTransitGatewayMulticastGroupSources(registerTransitGatewayMulticastGroupSourcesRequest))
    }

  override def rejectTransitGatewayPeeringAttachment(
      rejectTransitGatewayPeeringAttachmentRequest: RejectTransitGatewayPeeringAttachmentRequest
  ): IO[RejectTransitGatewayPeeringAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.rejectTransitGatewayPeeringAttachment(rejectTransitGatewayPeeringAttachmentRequest))
    }

  override def rejectTransitGatewayVpcAttachment(
      rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest
  ): IO[RejectTransitGatewayVpcAttachmentResponse] =
    IO.fromFuture {
      IO(underlying.rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest))
    }

  override def rejectVpcEndpointConnections(
      rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest
  ): IO[RejectVpcEndpointConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest))
    }

  override def rejectVpcPeeringConnection(
      rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest
  ): IO[RejectVpcPeeringConnectionResponse] =
    IO.fromFuture {
      IO(underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest))
    }

  override def releaseAddress(releaseAddressRequest: ReleaseAddressRequest): IO[ReleaseAddressResponse] =
    IO.fromFuture {
      IO(underlying.releaseAddress(releaseAddressRequest))
    }

  override def releaseHosts(releaseHostsRequest: ReleaseHostsRequest): IO[ReleaseHostsResponse] =
    IO.fromFuture {
      IO(underlying.releaseHosts(releaseHostsRequest))
    }

  override def replaceIamInstanceProfileAssociation(
      replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest
  ): IO[ReplaceIamInstanceProfileAssociationResponse] =
    IO.fromFuture {
      IO(underlying.replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest))
    }

  override def replaceNetworkAclAssociation(
      replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest
  ): IO[ReplaceNetworkAclAssociationResponse] =
    IO.fromFuture {
      IO(underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest))
    }

  override def replaceNetworkAclEntry(
      replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest
  ): IO[ReplaceNetworkAclEntryResponse] =
    IO.fromFuture {
      IO(underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest))
    }

  override def replaceRoute(replaceRouteRequest: ReplaceRouteRequest): IO[ReplaceRouteResponse] =
    IO.fromFuture {
      IO(underlying.replaceRoute(replaceRouteRequest))
    }

  override def replaceRouteTableAssociation(
      replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest
  ): IO[ReplaceRouteTableAssociationResponse] =
    IO.fromFuture {
      IO(underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest))
    }

  override def replaceTransitGatewayRoute(
      replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest
  ): IO[ReplaceTransitGatewayRouteResponse] =
    IO.fromFuture {
      IO(underlying.replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest))
    }

  override def reportInstanceStatus(
      reportInstanceStatusRequest: ReportInstanceStatusRequest
  ): IO[ReportInstanceStatusResponse] =
    IO.fromFuture {
      IO(underlying.reportInstanceStatus(reportInstanceStatusRequest))
    }

  override def requestSpotFleet(requestSpotFleetRequest: RequestSpotFleetRequest): IO[RequestSpotFleetResponse] =
    IO.fromFuture {
      IO(underlying.requestSpotFleet(requestSpotFleetRequest))
    }

  override def requestSpotInstances(
      requestSpotInstancesRequest: RequestSpotInstancesRequest
  ): IO[RequestSpotInstancesResponse] =
    IO.fromFuture {
      IO(underlying.requestSpotInstances(requestSpotInstancesRequest))
    }

  override def resetEbsDefaultKmsKeyId(
      resetEbsDefaultKmsKeyIdRequest: ResetEbsDefaultKmsKeyIdRequest
  ): IO[ResetEbsDefaultKmsKeyIdResponse] =
    IO.fromFuture {
      IO(underlying.resetEbsDefaultKmsKeyId(resetEbsDefaultKmsKeyIdRequest))
    }

  override def resetFpgaImageAttribute(
      resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest
  ): IO[ResetFpgaImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.resetFpgaImageAttribute(resetFpgaImageAttributeRequest))
    }

  override def resetImageAttribute(
      resetImageAttributeRequest: ResetImageAttributeRequest
  ): IO[ResetImageAttributeResponse] =
    IO.fromFuture {
      IO(underlying.resetImageAttribute(resetImageAttributeRequest))
    }

  override def resetInstanceAttribute(
      resetInstanceAttributeRequest: ResetInstanceAttributeRequest
  ): IO[ResetInstanceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.resetInstanceAttribute(resetInstanceAttributeRequest))
    }

  override def resetNetworkInterfaceAttribute(
      resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest
  ): IO[ResetNetworkInterfaceAttributeResponse] =
    IO.fromFuture {
      IO(underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest))
    }

  override def resetSnapshotAttribute(
      resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest
  ): IO[ResetSnapshotAttributeResponse] =
    IO.fromFuture {
      IO(underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest))
    }

  override def restoreAddressToClassic(
      restoreAddressToClassicRequest: RestoreAddressToClassicRequest
  ): IO[RestoreAddressToClassicResponse] =
    IO.fromFuture {
      IO(underlying.restoreAddressToClassic(restoreAddressToClassicRequest))
    }

  override def revokeClientVpnIngress(
      revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest
  ): IO[RevokeClientVpnIngressResponse] =
    IO.fromFuture {
      IO(underlying.revokeClientVpnIngress(revokeClientVpnIngressRequest))
    }

  override def revokeSecurityGroupEgress(
      revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest
  ): IO[RevokeSecurityGroupEgressResponse] =
    IO.fromFuture {
      IO(underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest))
    }

  override def revokeSecurityGroupIngress(
      revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest
  ): IO[RevokeSecurityGroupIngressResponse] =
    IO.fromFuture {
      IO(underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest))
    }

  override def runInstances(runInstancesRequest: RunInstancesRequest): IO[RunInstancesResponse] =
    IO.fromFuture {
      IO(underlying.runInstances(runInstancesRequest))
    }

  override def runScheduledInstances(
      runScheduledInstancesRequest: RunScheduledInstancesRequest
  ): IO[RunScheduledInstancesResponse] =
    IO.fromFuture {
      IO(underlying.runScheduledInstances(runScheduledInstancesRequest))
    }

  override def searchLocalGatewayRoutes(
      searchLocalGatewayRoutesRequest: SearchLocalGatewayRoutesRequest
  ): IO[SearchLocalGatewayRoutesResponse] =
    IO.fromFuture {
      IO(underlying.searchLocalGatewayRoutes(searchLocalGatewayRoutesRequest))
    }

  override def searchTransitGatewayMulticastGroups(
      searchTransitGatewayMulticastGroupsRequest: SearchTransitGatewayMulticastGroupsRequest
  ): IO[SearchTransitGatewayMulticastGroupsResponse] =
    IO.fromFuture {
      IO(underlying.searchTransitGatewayMulticastGroups(searchTransitGatewayMulticastGroupsRequest))
    }

  override def searchTransitGatewayRoutes(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest
  ): IO[SearchTransitGatewayRoutesResponse] =
    IO.fromFuture {
      IO(underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest))
    }

  override def sendDiagnosticInterrupt(
      sendDiagnosticInterruptRequest: SendDiagnosticInterruptRequest
  ): IO[SendDiagnosticInterruptResponse] =
    IO.fromFuture {
      IO(underlying.sendDiagnosticInterrupt(sendDiagnosticInterruptRequest))
    }

  override def startInstances(startInstancesRequest: StartInstancesRequest): IO[StartInstancesResponse] =
    IO.fromFuture {
      IO(underlying.startInstances(startInstancesRequest))
    }

  override def stopInstances(stopInstancesRequest: StopInstancesRequest): IO[StopInstancesResponse] =
    IO.fromFuture {
      IO(underlying.stopInstances(stopInstancesRequest))
    }

  override def terminateClientVpnConnections(
      terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest
  ): IO[TerminateClientVpnConnectionsResponse] =
    IO.fromFuture {
      IO(underlying.terminateClientVpnConnections(terminateClientVpnConnectionsRequest))
    }

  override def terminateInstances(
      terminateInstancesRequest: TerminateInstancesRequest
  ): IO[TerminateInstancesResponse] =
    IO.fromFuture {
      IO(underlying.terminateInstances(terminateInstancesRequest))
    }

  override def unassignIpv6Addresses(
      unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest
  ): IO[UnassignIpv6AddressesResponse] =
    IO.fromFuture {
      IO(underlying.unassignIpv6Addresses(unassignIpv6AddressesRequest))
    }

  override def unassignPrivateIpAddresses(
      unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest
  ): IO[UnassignPrivateIpAddressesResponse] =
    IO.fromFuture {
      IO(underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest))
    }

  override def unmonitorInstances(
      unmonitorInstancesRequest: UnmonitorInstancesRequest
  ): IO[UnmonitorInstancesResponse] =
    IO.fromFuture {
      IO(underlying.unmonitorInstances(unmonitorInstancesRequest))
    }

  override def updateSecurityGroupRuleDescriptionsEgress(
      updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest
  ): IO[UpdateSecurityGroupRuleDescriptionsEgressResponse] =
    IO.fromFuture {
      IO(underlying.updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest))
    }

  override def updateSecurityGroupRuleDescriptionsIngress(
      updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest
  ): IO[UpdateSecurityGroupRuleDescriptionsIngressResponse] =
    IO.fromFuture {
      IO(underlying.updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest))
    }

  override def withdrawByoipCidr(withdrawByoipCidrRequest: WithdrawByoipCidrRequest): IO[WithdrawByoipCidrResponse] =
    IO.fromFuture {
      IO(underlying.withdrawByoipCidr(withdrawByoipCidrRequest))
    }

}
