// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.ec2.Ec2AsyncClient
import software.amazon.awssdk.services.ec2.model._

object Ec2AkkaClient {

  def apply(asyncClient: Ec2AsyncClient): Ec2AkkaClient = new Ec2AkkaClient {
    override val underlying: Ec2AsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait Ec2AkkaClient {

  import Ec2AkkaClient._

  val underlying: Ec2AsyncClient

  def acceptReservedInstancesExchangeQuoteSource(
      acceptReservedInstancesExchangeQuoteRequest: AcceptReservedInstancesExchangeQuoteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AcceptReservedInstancesExchangeQuoteResponse, NotUsed] =
    Source
      .single(acceptReservedInstancesExchangeQuoteRequest).via(acceptReservedInstancesExchangeQuoteFlow(parallelism))

  def acceptReservedInstancesExchangeQuoteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AcceptReservedInstancesExchangeQuoteRequest, AcceptReservedInstancesExchangeQuoteResponse, NotUsed] =
    Flow[AcceptReservedInstancesExchangeQuoteRequest].mapAsync(parallelism) {
      acceptReservedInstancesExchangeQuoteRequest =>
        underlying.acceptReservedInstancesExchangeQuote(acceptReservedInstancesExchangeQuoteRequest)
    }

  def acceptTransitGatewayVpcAttachmentSource(
      acceptTransitGatewayVpcAttachmentRequest: AcceptTransitGatewayVpcAttachmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AcceptTransitGatewayVpcAttachmentResponse, NotUsed] =
    Source.single(acceptTransitGatewayVpcAttachmentRequest).via(acceptTransitGatewayVpcAttachmentFlow(parallelism))

  def acceptTransitGatewayVpcAttachmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AcceptTransitGatewayVpcAttachmentRequest, AcceptTransitGatewayVpcAttachmentResponse, NotUsed] =
    Flow[AcceptTransitGatewayVpcAttachmentRequest].mapAsync(parallelism) { acceptTransitGatewayVpcAttachmentRequest =>
      underlying.acceptTransitGatewayVpcAttachment(acceptTransitGatewayVpcAttachmentRequest)
    }

  def acceptVpcEndpointConnectionsSource(
      acceptVpcEndpointConnectionsRequest: AcceptVpcEndpointConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AcceptVpcEndpointConnectionsResponse, NotUsed] =
    Source.single(acceptVpcEndpointConnectionsRequest).via(acceptVpcEndpointConnectionsFlow(parallelism))

  def acceptVpcEndpointConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AcceptVpcEndpointConnectionsRequest, AcceptVpcEndpointConnectionsResponse, NotUsed] =
    Flow[AcceptVpcEndpointConnectionsRequest].mapAsync(parallelism) { acceptVpcEndpointConnectionsRequest =>
      underlying.acceptVpcEndpointConnections(acceptVpcEndpointConnectionsRequest)
    }

  def acceptVpcPeeringConnectionSource(
      acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AcceptVpcPeeringConnectionResponse, NotUsed] =
    Source.single(acceptVpcPeeringConnectionRequest).via(acceptVpcPeeringConnectionFlow(parallelism))

  def acceptVpcPeeringConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResponse, NotUsed] =
    Flow[AcceptVpcPeeringConnectionRequest].mapAsync(parallelism) { acceptVpcPeeringConnectionRequest =>
      underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest)
    }

  def advertiseByoipCidrSource(advertiseByoipCidrRequest: AdvertiseByoipCidrRequest,
                               parallelism: Int = DefaultParallelism): Source[AdvertiseByoipCidrResponse, NotUsed] =
    Source.single(advertiseByoipCidrRequest).via(advertiseByoipCidrFlow(parallelism))

  def advertiseByoipCidrFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AdvertiseByoipCidrRequest, AdvertiseByoipCidrResponse, NotUsed] =
    Flow[AdvertiseByoipCidrRequest].mapAsync(parallelism) { advertiseByoipCidrRequest =>
      underlying.advertiseByoipCidr(advertiseByoipCidrRequest)
    }

  def allocateAddressSource(allocateAddressRequest: AllocateAddressRequest,
                            parallelism: Int = DefaultParallelism): Source[AllocateAddressResponse, NotUsed] =
    Source.single(allocateAddressRequest).via(allocateAddressFlow(parallelism))

  def allocateAddressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AllocateAddressRequest, AllocateAddressResponse, NotUsed] =
    Flow[AllocateAddressRequest].mapAsync(parallelism) { allocateAddressRequest =>
      underlying.allocateAddress(allocateAddressRequest)
    }

  def allocateAddressSource(): Source[AllocateAddressResponse, NotUsed] =
    Source.fromFuture(underlying.allocateAddress())

  def allocateHostsSource(allocateHostsRequest: AllocateHostsRequest,
                          parallelism: Int = DefaultParallelism): Source[AllocateHostsResponse, NotUsed] =
    Source.single(allocateHostsRequest).via(allocateHostsFlow(parallelism))

  def allocateHostsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AllocateHostsRequest, AllocateHostsResponse, NotUsed] =
    Flow[AllocateHostsRequest].mapAsync(parallelism) { allocateHostsRequest =>
      underlying.allocateHosts(allocateHostsRequest)
    }

  def applySecurityGroupsToClientVpnTargetNetworkSource(
      applySecurityGroupsToClientVpnTargetNetworkRequest: ApplySecurityGroupsToClientVpnTargetNetworkRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ApplySecurityGroupsToClientVpnTargetNetworkResponse, NotUsed] =
    Source
      .single(applySecurityGroupsToClientVpnTargetNetworkRequest).via(
        applySecurityGroupsToClientVpnTargetNetworkFlow(parallelism)
      )

  def applySecurityGroupsToClientVpnTargetNetworkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ApplySecurityGroupsToClientVpnTargetNetworkRequest,
          ApplySecurityGroupsToClientVpnTargetNetworkResponse,
          NotUsed] =
    Flow[ApplySecurityGroupsToClientVpnTargetNetworkRequest].mapAsync(parallelism) {
      applySecurityGroupsToClientVpnTargetNetworkRequest =>
        underlying.applySecurityGroupsToClientVpnTargetNetwork(applySecurityGroupsToClientVpnTargetNetworkRequest)
    }

  def assignIpv6AddressesSource(assignIpv6AddressesRequest: AssignIpv6AddressesRequest,
                                parallelism: Int = DefaultParallelism): Source[AssignIpv6AddressesResponse, NotUsed] =
    Source.single(assignIpv6AddressesRequest).via(assignIpv6AddressesFlow(parallelism))

  def assignIpv6AddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssignIpv6AddressesRequest, AssignIpv6AddressesResponse, NotUsed] =
    Flow[AssignIpv6AddressesRequest].mapAsync(parallelism) { assignIpv6AddressesRequest =>
      underlying.assignIpv6Addresses(assignIpv6AddressesRequest)
    }

  def assignPrivateIpAddressesSource(
      assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssignPrivateIpAddressesResponse, NotUsed] =
    Source.single(assignPrivateIpAddressesRequest).via(assignPrivateIpAddressesFlow(parallelism))

  def assignPrivateIpAddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResponse, NotUsed] =
    Flow[AssignPrivateIpAddressesRequest].mapAsync(parallelism) { assignPrivateIpAddressesRequest =>
      underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest)
    }

  def associateAddressSource(associateAddressRequest: AssociateAddressRequest,
                             parallelism: Int = DefaultParallelism): Source[AssociateAddressResponse, NotUsed] =
    Source.single(associateAddressRequest).via(associateAddressFlow(parallelism))

  def associateAddressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateAddressRequest, AssociateAddressResponse, NotUsed] =
    Flow[AssociateAddressRequest].mapAsync(parallelism) { associateAddressRequest =>
      underlying.associateAddress(associateAddressRequest)
    }

  def associateAddressSource(): Source[AssociateAddressResponse, NotUsed] =
    Source.fromFuture(underlying.associateAddress())

  def associateClientVpnTargetNetworkSource(
      associateClientVpnTargetNetworkRequest: AssociateClientVpnTargetNetworkRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociateClientVpnTargetNetworkResponse, NotUsed] =
    Source.single(associateClientVpnTargetNetworkRequest).via(associateClientVpnTargetNetworkFlow(parallelism))

  def associateClientVpnTargetNetworkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateClientVpnTargetNetworkRequest, AssociateClientVpnTargetNetworkResponse, NotUsed] =
    Flow[AssociateClientVpnTargetNetworkRequest].mapAsync(parallelism) { associateClientVpnTargetNetworkRequest =>
      underlying.associateClientVpnTargetNetwork(associateClientVpnTargetNetworkRequest)
    }

  def associateDhcpOptionsSource(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest,
                                 parallelism: Int = DefaultParallelism): Source[AssociateDhcpOptionsResponse, NotUsed] =
    Source.single(associateDhcpOptionsRequest).via(associateDhcpOptionsFlow(parallelism))

  def associateDhcpOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateDhcpOptionsRequest, AssociateDhcpOptionsResponse, NotUsed] =
    Flow[AssociateDhcpOptionsRequest].mapAsync(parallelism) { associateDhcpOptionsRequest =>
      underlying.associateDhcpOptions(associateDhcpOptionsRequest)
    }

  def associateIamInstanceProfileSource(
      associateIamInstanceProfileRequest: AssociateIamInstanceProfileRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociateIamInstanceProfileResponse, NotUsed] =
    Source.single(associateIamInstanceProfileRequest).via(associateIamInstanceProfileFlow(parallelism))

  def associateIamInstanceProfileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateIamInstanceProfileRequest, AssociateIamInstanceProfileResponse, NotUsed] =
    Flow[AssociateIamInstanceProfileRequest].mapAsync(parallelism) { associateIamInstanceProfileRequest =>
      underlying.associateIamInstanceProfile(associateIamInstanceProfileRequest)
    }

  def associateRouteTableSource(associateRouteTableRequest: AssociateRouteTableRequest,
                                parallelism: Int = DefaultParallelism): Source[AssociateRouteTableResponse, NotUsed] =
    Source.single(associateRouteTableRequest).via(associateRouteTableFlow(parallelism))

  def associateRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateRouteTableRequest, AssociateRouteTableResponse, NotUsed] =
    Flow[AssociateRouteTableRequest].mapAsync(parallelism) { associateRouteTableRequest =>
      underlying.associateRouteTable(associateRouteTableRequest)
    }

  def associateSubnetCidrBlockSource(
      associateSubnetCidrBlockRequest: AssociateSubnetCidrBlockRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociateSubnetCidrBlockResponse, NotUsed] =
    Source.single(associateSubnetCidrBlockRequest).via(associateSubnetCidrBlockFlow(parallelism))

  def associateSubnetCidrBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateSubnetCidrBlockRequest, AssociateSubnetCidrBlockResponse, NotUsed] =
    Flow[AssociateSubnetCidrBlockRequest].mapAsync(parallelism) { associateSubnetCidrBlockRequest =>
      underlying.associateSubnetCidrBlock(associateSubnetCidrBlockRequest)
    }

  def associateTransitGatewayRouteTableSource(
      associateTransitGatewayRouteTableRequest: AssociateTransitGatewayRouteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociateTransitGatewayRouteTableResponse, NotUsed] =
    Source.single(associateTransitGatewayRouteTableRequest).via(associateTransitGatewayRouteTableFlow(parallelism))

  def associateTransitGatewayRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateTransitGatewayRouteTableRequest, AssociateTransitGatewayRouteTableResponse, NotUsed] =
    Flow[AssociateTransitGatewayRouteTableRequest].mapAsync(parallelism) { associateTransitGatewayRouteTableRequest =>
      underlying.associateTransitGatewayRouteTable(associateTransitGatewayRouteTableRequest)
    }

  def associateVpcCidrBlockSource(
      associateVpcCidrBlockRequest: AssociateVpcCidrBlockRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociateVpcCidrBlockResponse, NotUsed] =
    Source.single(associateVpcCidrBlockRequest).via(associateVpcCidrBlockFlow(parallelism))

  def associateVpcCidrBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateVpcCidrBlockRequest, AssociateVpcCidrBlockResponse, NotUsed] =
    Flow[AssociateVpcCidrBlockRequest].mapAsync(parallelism) { associateVpcCidrBlockRequest =>
      underlying.associateVpcCidrBlock(associateVpcCidrBlockRequest)
    }

  def attachClassicLinkVpcSource(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest,
                                 parallelism: Int = DefaultParallelism): Source[AttachClassicLinkVpcResponse, NotUsed] =
    Source.single(attachClassicLinkVpcRequest).via(attachClassicLinkVpcFlow(parallelism))

  def attachClassicLinkVpcFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AttachClassicLinkVpcRequest, AttachClassicLinkVpcResponse, NotUsed] =
    Flow[AttachClassicLinkVpcRequest].mapAsync(parallelism) { attachClassicLinkVpcRequest =>
      underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest)
    }

  def attachInternetGatewaySource(
      attachInternetGatewayRequest: AttachInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AttachInternetGatewayResponse, NotUsed] =
    Source.single(attachInternetGatewayRequest).via(attachInternetGatewayFlow(parallelism))

  def attachInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AttachInternetGatewayRequest, AttachInternetGatewayResponse, NotUsed] =
    Flow[AttachInternetGatewayRequest].mapAsync(parallelism) { attachInternetGatewayRequest =>
      underlying.attachInternetGateway(attachInternetGatewayRequest)
    }

  def attachNetworkInterfaceSource(
      attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AttachNetworkInterfaceResponse, NotUsed] =
    Source.single(attachNetworkInterfaceRequest).via(attachNetworkInterfaceFlow(parallelism))

  def attachNetworkInterfaceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AttachNetworkInterfaceRequest, AttachNetworkInterfaceResponse, NotUsed] =
    Flow[AttachNetworkInterfaceRequest].mapAsync(parallelism) { attachNetworkInterfaceRequest =>
      underlying.attachNetworkInterface(attachNetworkInterfaceRequest)
    }

  def attachVolumeSource(attachVolumeRequest: AttachVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[AttachVolumeResponse, NotUsed] =
    Source.single(attachVolumeRequest).via(attachVolumeFlow(parallelism))

  def attachVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AttachVolumeRequest, AttachVolumeResponse, NotUsed] =
    Flow[AttachVolumeRequest].mapAsync(parallelism) { attachVolumeRequest =>
      underlying.attachVolume(attachVolumeRequest)
    }

  def attachVpnGatewaySource(attachVpnGatewayRequest: AttachVpnGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[AttachVpnGatewayResponse, NotUsed] =
    Source.single(attachVpnGatewayRequest).via(attachVpnGatewayFlow(parallelism))

  def attachVpnGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AttachVpnGatewayRequest, AttachVpnGatewayResponse, NotUsed] =
    Flow[AttachVpnGatewayRequest].mapAsync(parallelism) { attachVpnGatewayRequest =>
      underlying.attachVpnGateway(attachVpnGatewayRequest)
    }

  def authorizeClientVpnIngressSource(
      authorizeClientVpnIngressRequest: AuthorizeClientVpnIngressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AuthorizeClientVpnIngressResponse, NotUsed] =
    Source.single(authorizeClientVpnIngressRequest).via(authorizeClientVpnIngressFlow(parallelism))

  def authorizeClientVpnIngressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AuthorizeClientVpnIngressRequest, AuthorizeClientVpnIngressResponse, NotUsed] =
    Flow[AuthorizeClientVpnIngressRequest].mapAsync(parallelism) { authorizeClientVpnIngressRequest =>
      underlying.authorizeClientVpnIngress(authorizeClientVpnIngressRequest)
    }

  def authorizeSecurityGroupEgressSource(
      authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AuthorizeSecurityGroupEgressResponse, NotUsed] =
    Source.single(authorizeSecurityGroupEgressRequest).via(authorizeSecurityGroupEgressFlow(parallelism))

  def authorizeSecurityGroupEgressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResponse, NotUsed] =
    Flow[AuthorizeSecurityGroupEgressRequest].mapAsync(parallelism) { authorizeSecurityGroupEgressRequest =>
      underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest)
    }

  def authorizeSecurityGroupIngressSource(
      authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AuthorizeSecurityGroupIngressResponse, NotUsed] =
    Source.single(authorizeSecurityGroupIngressRequest).via(authorizeSecurityGroupIngressFlow(parallelism))

  def authorizeSecurityGroupIngressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResponse, NotUsed] =
    Flow[AuthorizeSecurityGroupIngressRequest].mapAsync(parallelism) { authorizeSecurityGroupIngressRequest =>
      underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest)
    }

  def bundleInstanceSource(bundleInstanceRequest: BundleInstanceRequest,
                           parallelism: Int = DefaultParallelism): Source[BundleInstanceResponse, NotUsed] =
    Source.single(bundleInstanceRequest).via(bundleInstanceFlow(parallelism))

  def bundleInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BundleInstanceRequest, BundleInstanceResponse, NotUsed] =
    Flow[BundleInstanceRequest].mapAsync(parallelism) { bundleInstanceRequest =>
      underlying.bundleInstance(bundleInstanceRequest)
    }

  def cancelBundleTaskSource(cancelBundleTaskRequest: CancelBundleTaskRequest,
                             parallelism: Int = DefaultParallelism): Source[CancelBundleTaskResponse, NotUsed] =
    Source.single(cancelBundleTaskRequest).via(cancelBundleTaskFlow(parallelism))

  def cancelBundleTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelBundleTaskRequest, CancelBundleTaskResponse, NotUsed] =
    Flow[CancelBundleTaskRequest].mapAsync(parallelism) { cancelBundleTaskRequest =>
      underlying.cancelBundleTask(cancelBundleTaskRequest)
    }

  def cancelCapacityReservationSource(
      cancelCapacityReservationRequest: CancelCapacityReservationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelCapacityReservationResponse, NotUsed] =
    Source.single(cancelCapacityReservationRequest).via(cancelCapacityReservationFlow(parallelism))

  def cancelCapacityReservationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelCapacityReservationRequest, CancelCapacityReservationResponse, NotUsed] =
    Flow[CancelCapacityReservationRequest].mapAsync(parallelism) { cancelCapacityReservationRequest =>
      underlying.cancelCapacityReservation(cancelCapacityReservationRequest)
    }

  def cancelConversionTaskSource(cancelConversionTaskRequest: CancelConversionTaskRequest,
                                 parallelism: Int = DefaultParallelism): Source[CancelConversionTaskResponse, NotUsed] =
    Source.single(cancelConversionTaskRequest).via(cancelConversionTaskFlow(parallelism))

  def cancelConversionTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelConversionTaskRequest, CancelConversionTaskResponse, NotUsed] =
    Flow[CancelConversionTaskRequest].mapAsync(parallelism) { cancelConversionTaskRequest =>
      underlying.cancelConversionTask(cancelConversionTaskRequest)
    }

  def cancelExportTaskSource(cancelExportTaskRequest: CancelExportTaskRequest,
                             parallelism: Int = DefaultParallelism): Source[CancelExportTaskResponse, NotUsed] =
    Source.single(cancelExportTaskRequest).via(cancelExportTaskFlow(parallelism))

  def cancelExportTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelExportTaskRequest, CancelExportTaskResponse, NotUsed] =
    Flow[CancelExportTaskRequest].mapAsync(parallelism) { cancelExportTaskRequest =>
      underlying.cancelExportTask(cancelExportTaskRequest)
    }

  def cancelImportTaskSource(cancelImportTaskRequest: CancelImportTaskRequest,
                             parallelism: Int = DefaultParallelism): Source[CancelImportTaskResponse, NotUsed] =
    Source.single(cancelImportTaskRequest).via(cancelImportTaskFlow(parallelism))

  def cancelImportTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelImportTaskRequest, CancelImportTaskResponse, NotUsed] =
    Flow[CancelImportTaskRequest].mapAsync(parallelism) { cancelImportTaskRequest =>
      underlying.cancelImportTask(cancelImportTaskRequest)
    }

  def cancelReservedInstancesListingSource(
      cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelReservedInstancesListingResponse, NotUsed] =
    Source.single(cancelReservedInstancesListingRequest).via(cancelReservedInstancesListingFlow(parallelism))

  def cancelReservedInstancesListingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelReservedInstancesListingRequest, CancelReservedInstancesListingResponse, NotUsed] =
    Flow[CancelReservedInstancesListingRequest].mapAsync(parallelism) { cancelReservedInstancesListingRequest =>
      underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest)
    }

  def cancelSpotFleetRequestsSource(
      cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelSpotFleetRequestsResponse, NotUsed] =
    Source.single(cancelSpotFleetRequestsRequest).via(cancelSpotFleetRequestsFlow(parallelism))

  def cancelSpotFleetRequestsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResponse, NotUsed] =
    Flow[CancelSpotFleetRequestsRequest].mapAsync(parallelism) { cancelSpotFleetRequestsRequest =>
      underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest)
    }

  def cancelSpotInstanceRequestsSource(
      cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelSpotInstanceRequestsResponse, NotUsed] =
    Source.single(cancelSpotInstanceRequestsRequest).via(cancelSpotInstanceRequestsFlow(parallelism))

  def cancelSpotInstanceRequestsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResponse, NotUsed] =
    Flow[CancelSpotInstanceRequestsRequest].mapAsync(parallelism) { cancelSpotInstanceRequestsRequest =>
      underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest)
    }

  def confirmProductInstanceSource(
      confirmProductInstanceRequest: ConfirmProductInstanceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ConfirmProductInstanceResponse, NotUsed] =
    Source.single(confirmProductInstanceRequest).via(confirmProductInstanceFlow(parallelism))

  def confirmProductInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ConfirmProductInstanceRequest, ConfirmProductInstanceResponse, NotUsed] =
    Flow[ConfirmProductInstanceRequest].mapAsync(parallelism) { confirmProductInstanceRequest =>
      underlying.confirmProductInstance(confirmProductInstanceRequest)
    }

  def copyFpgaImageSource(copyFpgaImageRequest: CopyFpgaImageRequest,
                          parallelism: Int = DefaultParallelism): Source[CopyFpgaImageResponse, NotUsed] =
    Source.single(copyFpgaImageRequest).via(copyFpgaImageFlow(parallelism))

  def copyFpgaImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CopyFpgaImageRequest, CopyFpgaImageResponse, NotUsed] =
    Flow[CopyFpgaImageRequest].mapAsync(parallelism) { copyFpgaImageRequest =>
      underlying.copyFpgaImage(copyFpgaImageRequest)
    }

  def copyImageSource(copyImageRequest: CopyImageRequest,
                      parallelism: Int = DefaultParallelism): Source[CopyImageResponse, NotUsed] =
    Source.single(copyImageRequest).via(copyImageFlow(parallelism))

  def copyImageFlow(parallelism: Int = DefaultParallelism): Flow[CopyImageRequest, CopyImageResponse, NotUsed] =
    Flow[CopyImageRequest].mapAsync(parallelism) { copyImageRequest =>
      underlying.copyImage(copyImageRequest)
    }

  def copySnapshotSource(copySnapshotRequest: CopySnapshotRequest,
                         parallelism: Int = DefaultParallelism): Source[CopySnapshotResponse, NotUsed] =
    Source.single(copySnapshotRequest).via(copySnapshotFlow(parallelism))

  def copySnapshotFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CopySnapshotRequest, CopySnapshotResponse, NotUsed] =
    Flow[CopySnapshotRequest].mapAsync(parallelism) { copySnapshotRequest =>
      underlying.copySnapshot(copySnapshotRequest)
    }

  def createCapacityReservationSource(
      createCapacityReservationRequest: CreateCapacityReservationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateCapacityReservationResponse, NotUsed] =
    Source.single(createCapacityReservationRequest).via(createCapacityReservationFlow(parallelism))

  def createCapacityReservationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateCapacityReservationRequest, CreateCapacityReservationResponse, NotUsed] =
    Flow[CreateCapacityReservationRequest].mapAsync(parallelism) { createCapacityReservationRequest =>
      underlying.createCapacityReservation(createCapacityReservationRequest)
    }

  def createClientVpnEndpointSource(
      createClientVpnEndpointRequest: CreateClientVpnEndpointRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateClientVpnEndpointResponse, NotUsed] =
    Source.single(createClientVpnEndpointRequest).via(createClientVpnEndpointFlow(parallelism))

  def createClientVpnEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateClientVpnEndpointRequest, CreateClientVpnEndpointResponse, NotUsed] =
    Flow[CreateClientVpnEndpointRequest].mapAsync(parallelism) { createClientVpnEndpointRequest =>
      underlying.createClientVpnEndpoint(createClientVpnEndpointRequest)
    }

  def createClientVpnRouteSource(createClientVpnRouteRequest: CreateClientVpnRouteRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreateClientVpnRouteResponse, NotUsed] =
    Source.single(createClientVpnRouteRequest).via(createClientVpnRouteFlow(parallelism))

  def createClientVpnRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateClientVpnRouteRequest, CreateClientVpnRouteResponse, NotUsed] =
    Flow[CreateClientVpnRouteRequest].mapAsync(parallelism) { createClientVpnRouteRequest =>
      underlying.createClientVpnRoute(createClientVpnRouteRequest)
    }

  def createCustomerGatewaySource(
      createCustomerGatewayRequest: CreateCustomerGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateCustomerGatewayResponse, NotUsed] =
    Source.single(createCustomerGatewayRequest).via(createCustomerGatewayFlow(parallelism))

  def createCustomerGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateCustomerGatewayRequest, CreateCustomerGatewayResponse, NotUsed] =
    Flow[CreateCustomerGatewayRequest].mapAsync(parallelism) { createCustomerGatewayRequest =>
      underlying.createCustomerGateway(createCustomerGatewayRequest)
    }

  def createDefaultSubnetSource(createDefaultSubnetRequest: CreateDefaultSubnetRequest,
                                parallelism: Int = DefaultParallelism): Source[CreateDefaultSubnetResponse, NotUsed] =
    Source.single(createDefaultSubnetRequest).via(createDefaultSubnetFlow(parallelism))

  def createDefaultSubnetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateDefaultSubnetRequest, CreateDefaultSubnetResponse, NotUsed] =
    Flow[CreateDefaultSubnetRequest].mapAsync(parallelism) { createDefaultSubnetRequest =>
      underlying.createDefaultSubnet(createDefaultSubnetRequest)
    }

  def createDefaultVpcSource(createDefaultVpcRequest: CreateDefaultVpcRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateDefaultVpcResponse, NotUsed] =
    Source.single(createDefaultVpcRequest).via(createDefaultVpcFlow(parallelism))

  def createDefaultVpcFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateDefaultVpcRequest, CreateDefaultVpcResponse, NotUsed] =
    Flow[CreateDefaultVpcRequest].mapAsync(parallelism) { createDefaultVpcRequest =>
      underlying.createDefaultVpc(createDefaultVpcRequest)
    }

  def createDefaultVpcSource(): Source[CreateDefaultVpcResponse, NotUsed] =
    Source.fromFuture(underlying.createDefaultVpc())

  def createDhcpOptionsSource(createDhcpOptionsRequest: CreateDhcpOptionsRequest,
                              parallelism: Int = DefaultParallelism): Source[CreateDhcpOptionsResponse, NotUsed] =
    Source.single(createDhcpOptionsRequest).via(createDhcpOptionsFlow(parallelism))

  def createDhcpOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateDhcpOptionsRequest, CreateDhcpOptionsResponse, NotUsed] =
    Flow[CreateDhcpOptionsRequest].mapAsync(parallelism) { createDhcpOptionsRequest =>
      underlying.createDhcpOptions(createDhcpOptionsRequest)
    }

  def createEgressOnlyInternetGatewaySource(
      createEgressOnlyInternetGatewayRequest: CreateEgressOnlyInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateEgressOnlyInternetGatewayResponse, NotUsed] =
    Source.single(createEgressOnlyInternetGatewayRequest).via(createEgressOnlyInternetGatewayFlow(parallelism))

  def createEgressOnlyInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateEgressOnlyInternetGatewayRequest, CreateEgressOnlyInternetGatewayResponse, NotUsed] =
    Flow[CreateEgressOnlyInternetGatewayRequest].mapAsync(parallelism) { createEgressOnlyInternetGatewayRequest =>
      underlying.createEgressOnlyInternetGateway(createEgressOnlyInternetGatewayRequest)
    }

  def createFleetSource(createFleetRequest: CreateFleetRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateFleetResponse, NotUsed] =
    Source.single(createFleetRequest).via(createFleetFlow(parallelism))

  def createFleetFlow(parallelism: Int = DefaultParallelism): Flow[CreateFleetRequest, CreateFleetResponse, NotUsed] =
    Flow[CreateFleetRequest].mapAsync(parallelism) { createFleetRequest =>
      underlying.createFleet(createFleetRequest)
    }

  def createFlowLogsSource(createFlowLogsRequest: CreateFlowLogsRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateFlowLogsResponse, NotUsed] =
    Source.single(createFlowLogsRequest).via(createFlowLogsFlow(parallelism))

  def createFlowLogsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateFlowLogsRequest, CreateFlowLogsResponse, NotUsed] =
    Flow[CreateFlowLogsRequest].mapAsync(parallelism) { createFlowLogsRequest =>
      underlying.createFlowLogs(createFlowLogsRequest)
    }

  def createFpgaImageSource(createFpgaImageRequest: CreateFpgaImageRequest,
                            parallelism: Int = DefaultParallelism): Source[CreateFpgaImageResponse, NotUsed] =
    Source.single(createFpgaImageRequest).via(createFpgaImageFlow(parallelism))

  def createFpgaImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateFpgaImageRequest, CreateFpgaImageResponse, NotUsed] =
    Flow[CreateFpgaImageRequest].mapAsync(parallelism) { createFpgaImageRequest =>
      underlying.createFpgaImage(createFpgaImageRequest)
    }

  def createImageSource(createImageRequest: CreateImageRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateImageResponse, NotUsed] =
    Source.single(createImageRequest).via(createImageFlow(parallelism))

  def createImageFlow(parallelism: Int = DefaultParallelism): Flow[CreateImageRequest, CreateImageResponse, NotUsed] =
    Flow[CreateImageRequest].mapAsync(parallelism) { createImageRequest =>
      underlying.createImage(createImageRequest)
    }

  def createInstanceExportTaskSource(
      createInstanceExportTaskRequest: CreateInstanceExportTaskRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateInstanceExportTaskResponse, NotUsed] =
    Source.single(createInstanceExportTaskRequest).via(createInstanceExportTaskFlow(parallelism))

  def createInstanceExportTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateInstanceExportTaskRequest, CreateInstanceExportTaskResponse, NotUsed] =
    Flow[CreateInstanceExportTaskRequest].mapAsync(parallelism) { createInstanceExportTaskRequest =>
      underlying.createInstanceExportTask(createInstanceExportTaskRequest)
    }

  def createInternetGatewaySource(
      createInternetGatewayRequest: CreateInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateInternetGatewayResponse, NotUsed] =
    Source.single(createInternetGatewayRequest).via(createInternetGatewayFlow(parallelism))

  def createInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateInternetGatewayRequest, CreateInternetGatewayResponse, NotUsed] =
    Flow[CreateInternetGatewayRequest].mapAsync(parallelism) { createInternetGatewayRequest =>
      underlying.createInternetGateway(createInternetGatewayRequest)
    }

  def createInternetGatewaySource(): Source[CreateInternetGatewayResponse, NotUsed] =
    Source.fromFuture(underlying.createInternetGateway())

  def createKeyPairSource(createKeyPairRequest: CreateKeyPairRequest,
                          parallelism: Int = DefaultParallelism): Source[CreateKeyPairResponse, NotUsed] =
    Source.single(createKeyPairRequest).via(createKeyPairFlow(parallelism))

  def createKeyPairFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateKeyPairRequest, CreateKeyPairResponse, NotUsed] =
    Flow[CreateKeyPairRequest].mapAsync(parallelism) { createKeyPairRequest =>
      underlying.createKeyPair(createKeyPairRequest)
    }

  def createLaunchTemplateSource(createLaunchTemplateRequest: CreateLaunchTemplateRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreateLaunchTemplateResponse, NotUsed] =
    Source.single(createLaunchTemplateRequest).via(createLaunchTemplateFlow(parallelism))

  def createLaunchTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateLaunchTemplateRequest, CreateLaunchTemplateResponse, NotUsed] =
    Flow[CreateLaunchTemplateRequest].mapAsync(parallelism) { createLaunchTemplateRequest =>
      underlying.createLaunchTemplate(createLaunchTemplateRequest)
    }

  def createLaunchTemplateVersionSource(
      createLaunchTemplateVersionRequest: CreateLaunchTemplateVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateLaunchTemplateVersionResponse, NotUsed] =
    Source.single(createLaunchTemplateVersionRequest).via(createLaunchTemplateVersionFlow(parallelism))

  def createLaunchTemplateVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateLaunchTemplateVersionRequest, CreateLaunchTemplateVersionResponse, NotUsed] =
    Flow[CreateLaunchTemplateVersionRequest].mapAsync(parallelism) { createLaunchTemplateVersionRequest =>
      underlying.createLaunchTemplateVersion(createLaunchTemplateVersionRequest)
    }

  def createNatGatewaySource(createNatGatewayRequest: CreateNatGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateNatGatewayResponse, NotUsed] =
    Source.single(createNatGatewayRequest).via(createNatGatewayFlow(parallelism))

  def createNatGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNatGatewayRequest, CreateNatGatewayResponse, NotUsed] =
    Flow[CreateNatGatewayRequest].mapAsync(parallelism) { createNatGatewayRequest =>
      underlying.createNatGateway(createNatGatewayRequest)
    }

  def createNetworkAclSource(createNetworkAclRequest: CreateNetworkAclRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateNetworkAclResponse, NotUsed] =
    Source.single(createNetworkAclRequest).via(createNetworkAclFlow(parallelism))

  def createNetworkAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNetworkAclRequest, CreateNetworkAclResponse, NotUsed] =
    Flow[CreateNetworkAclRequest].mapAsync(parallelism) { createNetworkAclRequest =>
      underlying.createNetworkAcl(createNetworkAclRequest)
    }

  def createNetworkAclEntrySource(
      createNetworkAclEntryRequest: CreateNetworkAclEntryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateNetworkAclEntryResponse, NotUsed] =
    Source.single(createNetworkAclEntryRequest).via(createNetworkAclEntryFlow(parallelism))

  def createNetworkAclEntryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNetworkAclEntryRequest, CreateNetworkAclEntryResponse, NotUsed] =
    Flow[CreateNetworkAclEntryRequest].mapAsync(parallelism) { createNetworkAclEntryRequest =>
      underlying.createNetworkAclEntry(createNetworkAclEntryRequest)
    }

  def createNetworkInterfaceSource(
      createNetworkInterfaceRequest: CreateNetworkInterfaceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateNetworkInterfaceResponse, NotUsed] =
    Source.single(createNetworkInterfaceRequest).via(createNetworkInterfaceFlow(parallelism))

  def createNetworkInterfaceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNetworkInterfaceRequest, CreateNetworkInterfaceResponse, NotUsed] =
    Flow[CreateNetworkInterfaceRequest].mapAsync(parallelism) { createNetworkInterfaceRequest =>
      underlying.createNetworkInterface(createNetworkInterfaceRequest)
    }

  def createNetworkInterfacePermissionSource(
      createNetworkInterfacePermissionRequest: CreateNetworkInterfacePermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateNetworkInterfacePermissionResponse, NotUsed] =
    Source.single(createNetworkInterfacePermissionRequest).via(createNetworkInterfacePermissionFlow(parallelism))

  def createNetworkInterfacePermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNetworkInterfacePermissionRequest, CreateNetworkInterfacePermissionResponse, NotUsed] =
    Flow[CreateNetworkInterfacePermissionRequest].mapAsync(parallelism) { createNetworkInterfacePermissionRequest =>
      underlying.createNetworkInterfacePermission(createNetworkInterfacePermissionRequest)
    }

  def createPlacementGroupSource(createPlacementGroupRequest: CreatePlacementGroupRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreatePlacementGroupResponse, NotUsed] =
    Source.single(createPlacementGroupRequest).via(createPlacementGroupFlow(parallelism))

  def createPlacementGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreatePlacementGroupRequest, CreatePlacementGroupResponse, NotUsed] =
    Flow[CreatePlacementGroupRequest].mapAsync(parallelism) { createPlacementGroupRequest =>
      underlying.createPlacementGroup(createPlacementGroupRequest)
    }

  def createReservedInstancesListingSource(
      createReservedInstancesListingRequest: CreateReservedInstancesListingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateReservedInstancesListingResponse, NotUsed] =
    Source.single(createReservedInstancesListingRequest).via(createReservedInstancesListingFlow(parallelism))

  def createReservedInstancesListingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateReservedInstancesListingRequest, CreateReservedInstancesListingResponse, NotUsed] =
    Flow[CreateReservedInstancesListingRequest].mapAsync(parallelism) { createReservedInstancesListingRequest =>
      underlying.createReservedInstancesListing(createReservedInstancesListingRequest)
    }

  def createRouteSource(createRouteRequest: CreateRouteRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateRouteResponse, NotUsed] =
    Source.single(createRouteRequest).via(createRouteFlow(parallelism))

  def createRouteFlow(parallelism: Int = DefaultParallelism): Flow[CreateRouteRequest, CreateRouteResponse, NotUsed] =
    Flow[CreateRouteRequest].mapAsync(parallelism) { createRouteRequest =>
      underlying.createRoute(createRouteRequest)
    }

  def createRouteTableSource(createRouteTableRequest: CreateRouteTableRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateRouteTableResponse, NotUsed] =
    Source.single(createRouteTableRequest).via(createRouteTableFlow(parallelism))

  def createRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateRouteTableRequest, CreateRouteTableResponse, NotUsed] =
    Flow[CreateRouteTableRequest].mapAsync(parallelism) { createRouteTableRequest =>
      underlying.createRouteTable(createRouteTableRequest)
    }

  def createSecurityGroupSource(createSecurityGroupRequest: CreateSecurityGroupRequest,
                                parallelism: Int = DefaultParallelism): Source[CreateSecurityGroupResponse, NotUsed] =
    Source.single(createSecurityGroupRequest).via(createSecurityGroupFlow(parallelism))

  def createSecurityGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateSecurityGroupRequest, CreateSecurityGroupResponse, NotUsed] =
    Flow[CreateSecurityGroupRequest].mapAsync(parallelism) { createSecurityGroupRequest =>
      underlying.createSecurityGroup(createSecurityGroupRequest)
    }

  def createSnapshotSource(createSnapshotRequest: CreateSnapshotRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateSnapshotResponse, NotUsed] =
    Source.single(createSnapshotRequest).via(createSnapshotFlow(parallelism))

  def createSnapshotFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateSnapshotRequest, CreateSnapshotResponse, NotUsed] =
    Flow[CreateSnapshotRequest].mapAsync(parallelism) { createSnapshotRequest =>
      underlying.createSnapshot(createSnapshotRequest)
    }

  def createSpotDatafeedSubscriptionSource(
      createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateSpotDatafeedSubscriptionResponse, NotUsed] =
    Source.single(createSpotDatafeedSubscriptionRequest).via(createSpotDatafeedSubscriptionFlow(parallelism))

  def createSpotDatafeedSubscriptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResponse, NotUsed] =
    Flow[CreateSpotDatafeedSubscriptionRequest].mapAsync(parallelism) { createSpotDatafeedSubscriptionRequest =>
      underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest)
    }

  def createSubnetSource(createSubnetRequest: CreateSubnetRequest,
                         parallelism: Int = DefaultParallelism): Source[CreateSubnetResponse, NotUsed] =
    Source.single(createSubnetRequest).via(createSubnetFlow(parallelism))

  def createSubnetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateSubnetRequest, CreateSubnetResponse, NotUsed] =
    Flow[CreateSubnetRequest].mapAsync(parallelism) { createSubnetRequest =>
      underlying.createSubnet(createSubnetRequest)
    }

  def createTagsSource(createTagsRequest: CreateTagsRequest,
                       parallelism: Int = DefaultParallelism): Source[CreateTagsResponse, NotUsed] =
    Source.single(createTagsRequest).via(createTagsFlow(parallelism))

  def createTagsFlow(parallelism: Int = DefaultParallelism): Flow[CreateTagsRequest, CreateTagsResponse, NotUsed] =
    Flow[CreateTagsRequest].mapAsync(parallelism) { createTagsRequest =>
      underlying.createTags(createTagsRequest)
    }

  def createTransitGatewaySource(createTransitGatewayRequest: CreateTransitGatewayRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreateTransitGatewayResponse, NotUsed] =
    Source.single(createTransitGatewayRequest).via(createTransitGatewayFlow(parallelism))

  def createTransitGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateTransitGatewayRequest, CreateTransitGatewayResponse, NotUsed] =
    Flow[CreateTransitGatewayRequest].mapAsync(parallelism) { createTransitGatewayRequest =>
      underlying.createTransitGateway(createTransitGatewayRequest)
    }

  def createTransitGatewaySource(): Source[CreateTransitGatewayResponse, NotUsed] =
    Source.fromFuture(underlying.createTransitGateway())

  def createTransitGatewayRouteSource(
      createTransitGatewayRouteRequest: CreateTransitGatewayRouteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateTransitGatewayRouteResponse, NotUsed] =
    Source.single(createTransitGatewayRouteRequest).via(createTransitGatewayRouteFlow(parallelism))

  def createTransitGatewayRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateTransitGatewayRouteRequest, CreateTransitGatewayRouteResponse, NotUsed] =
    Flow[CreateTransitGatewayRouteRequest].mapAsync(parallelism) { createTransitGatewayRouteRequest =>
      underlying.createTransitGatewayRoute(createTransitGatewayRouteRequest)
    }

  def createTransitGatewayRouteTableSource(
      createTransitGatewayRouteTableRequest: CreateTransitGatewayRouteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateTransitGatewayRouteTableResponse, NotUsed] =
    Source.single(createTransitGatewayRouteTableRequest).via(createTransitGatewayRouteTableFlow(parallelism))

  def createTransitGatewayRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateTransitGatewayRouteTableRequest, CreateTransitGatewayRouteTableResponse, NotUsed] =
    Flow[CreateTransitGatewayRouteTableRequest].mapAsync(parallelism) { createTransitGatewayRouteTableRequest =>
      underlying.createTransitGatewayRouteTable(createTransitGatewayRouteTableRequest)
    }

  def createTransitGatewayVpcAttachmentSource(
      createTransitGatewayVpcAttachmentRequest: CreateTransitGatewayVpcAttachmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateTransitGatewayVpcAttachmentResponse, NotUsed] =
    Source.single(createTransitGatewayVpcAttachmentRequest).via(createTransitGatewayVpcAttachmentFlow(parallelism))

  def createTransitGatewayVpcAttachmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateTransitGatewayVpcAttachmentRequest, CreateTransitGatewayVpcAttachmentResponse, NotUsed] =
    Flow[CreateTransitGatewayVpcAttachmentRequest].mapAsync(parallelism) { createTransitGatewayVpcAttachmentRequest =>
      underlying.createTransitGatewayVpcAttachment(createTransitGatewayVpcAttachmentRequest)
    }

  def createVolumeSource(createVolumeRequest: CreateVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[CreateVolumeResponse, NotUsed] =
    Source.single(createVolumeRequest).via(createVolumeFlow(parallelism))

  def createVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVolumeRequest, CreateVolumeResponse, NotUsed] =
    Flow[CreateVolumeRequest].mapAsync(parallelism) { createVolumeRequest =>
      underlying.createVolume(createVolumeRequest)
    }

  def createVpcSource(createVpcRequest: CreateVpcRequest,
                      parallelism: Int = DefaultParallelism): Source[CreateVpcResponse, NotUsed] =
    Source.single(createVpcRequest).via(createVpcFlow(parallelism))

  def createVpcFlow(parallelism: Int = DefaultParallelism): Flow[CreateVpcRequest, CreateVpcResponse, NotUsed] =
    Flow[CreateVpcRequest].mapAsync(parallelism) { createVpcRequest =>
      underlying.createVpc(createVpcRequest)
    }

  def createVpcEndpointSource(createVpcEndpointRequest: CreateVpcEndpointRequest,
                              parallelism: Int = DefaultParallelism): Source[CreateVpcEndpointResponse, NotUsed] =
    Source.single(createVpcEndpointRequest).via(createVpcEndpointFlow(parallelism))

  def createVpcEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpcEndpointRequest, CreateVpcEndpointResponse, NotUsed] =
    Flow[CreateVpcEndpointRequest].mapAsync(parallelism) { createVpcEndpointRequest =>
      underlying.createVpcEndpoint(createVpcEndpointRequest)
    }

  def createVpcEndpointConnectionNotificationSource(
      createVpcEndpointConnectionNotificationRequest: CreateVpcEndpointConnectionNotificationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateVpcEndpointConnectionNotificationResponse, NotUsed] =
    Source
      .single(createVpcEndpointConnectionNotificationRequest).via(
        createVpcEndpointConnectionNotificationFlow(parallelism)
      )

  def createVpcEndpointConnectionNotificationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpcEndpointConnectionNotificationRequest, CreateVpcEndpointConnectionNotificationResponse, NotUsed] =
    Flow[CreateVpcEndpointConnectionNotificationRequest].mapAsync(parallelism) {
      createVpcEndpointConnectionNotificationRequest =>
        underlying.createVpcEndpointConnectionNotification(createVpcEndpointConnectionNotificationRequest)
    }

  def createVpcEndpointServiceConfigurationSource(
      createVpcEndpointServiceConfigurationRequest: CreateVpcEndpointServiceConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateVpcEndpointServiceConfigurationResponse, NotUsed] =
    Source
      .single(createVpcEndpointServiceConfigurationRequest).via(createVpcEndpointServiceConfigurationFlow(parallelism))

  def createVpcEndpointServiceConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpcEndpointServiceConfigurationRequest, CreateVpcEndpointServiceConfigurationResponse, NotUsed] =
    Flow[CreateVpcEndpointServiceConfigurationRequest].mapAsync(parallelism) {
      createVpcEndpointServiceConfigurationRequest =>
        underlying.createVpcEndpointServiceConfiguration(createVpcEndpointServiceConfigurationRequest)
    }

  def createVpcPeeringConnectionSource(
      createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateVpcPeeringConnectionResponse, NotUsed] =
    Source.single(createVpcPeeringConnectionRequest).via(createVpcPeeringConnectionFlow(parallelism))

  def createVpcPeeringConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResponse, NotUsed] =
    Flow[CreateVpcPeeringConnectionRequest].mapAsync(parallelism) { createVpcPeeringConnectionRequest =>
      underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest)
    }

  def createVpnConnectionSource(createVpnConnectionRequest: CreateVpnConnectionRequest,
                                parallelism: Int = DefaultParallelism): Source[CreateVpnConnectionResponse, NotUsed] =
    Source.single(createVpnConnectionRequest).via(createVpnConnectionFlow(parallelism))

  def createVpnConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpnConnectionRequest, CreateVpnConnectionResponse, NotUsed] =
    Flow[CreateVpnConnectionRequest].mapAsync(parallelism) { createVpnConnectionRequest =>
      underlying.createVpnConnection(createVpnConnectionRequest)
    }

  def createVpnConnectionRouteSource(
      createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateVpnConnectionRouteResponse, NotUsed] =
    Source.single(createVpnConnectionRouteRequest).via(createVpnConnectionRouteFlow(parallelism))

  def createVpnConnectionRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResponse, NotUsed] =
    Flow[CreateVpnConnectionRouteRequest].mapAsync(parallelism) { createVpnConnectionRouteRequest =>
      underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest)
    }

  def createVpnGatewaySource(createVpnGatewayRequest: CreateVpnGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateVpnGatewayResponse, NotUsed] =
    Source.single(createVpnGatewayRequest).via(createVpnGatewayFlow(parallelism))

  def createVpnGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateVpnGatewayRequest, CreateVpnGatewayResponse, NotUsed] =
    Flow[CreateVpnGatewayRequest].mapAsync(parallelism) { createVpnGatewayRequest =>
      underlying.createVpnGateway(createVpnGatewayRequest)
    }

  def deleteClientVpnEndpointSource(
      deleteClientVpnEndpointRequest: DeleteClientVpnEndpointRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteClientVpnEndpointResponse, NotUsed] =
    Source.single(deleteClientVpnEndpointRequest).via(deleteClientVpnEndpointFlow(parallelism))

  def deleteClientVpnEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteClientVpnEndpointRequest, DeleteClientVpnEndpointResponse, NotUsed] =
    Flow[DeleteClientVpnEndpointRequest].mapAsync(parallelism) { deleteClientVpnEndpointRequest =>
      underlying.deleteClientVpnEndpoint(deleteClientVpnEndpointRequest)
    }

  def deleteClientVpnRouteSource(deleteClientVpnRouteRequest: DeleteClientVpnRouteRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteClientVpnRouteResponse, NotUsed] =
    Source.single(deleteClientVpnRouteRequest).via(deleteClientVpnRouteFlow(parallelism))

  def deleteClientVpnRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteClientVpnRouteRequest, DeleteClientVpnRouteResponse, NotUsed] =
    Flow[DeleteClientVpnRouteRequest].mapAsync(parallelism) { deleteClientVpnRouteRequest =>
      underlying.deleteClientVpnRoute(deleteClientVpnRouteRequest)
    }

  def deleteCustomerGatewaySource(
      deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteCustomerGatewayResponse, NotUsed] =
    Source.single(deleteCustomerGatewayRequest).via(deleteCustomerGatewayFlow(parallelism))

  def deleteCustomerGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteCustomerGatewayRequest, DeleteCustomerGatewayResponse, NotUsed] =
    Flow[DeleteCustomerGatewayRequest].mapAsync(parallelism) { deleteCustomerGatewayRequest =>
      underlying.deleteCustomerGateway(deleteCustomerGatewayRequest)
    }

  def deleteDhcpOptionsSource(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest,
                              parallelism: Int = DefaultParallelism): Source[DeleteDhcpOptionsResponse, NotUsed] =
    Source.single(deleteDhcpOptionsRequest).via(deleteDhcpOptionsFlow(parallelism))

  def deleteDhcpOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse, NotUsed] =
    Flow[DeleteDhcpOptionsRequest].mapAsync(parallelism) { deleteDhcpOptionsRequest =>
      underlying.deleteDhcpOptions(deleteDhcpOptionsRequest)
    }

  def deleteEgressOnlyInternetGatewaySource(
      deleteEgressOnlyInternetGatewayRequest: DeleteEgressOnlyInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteEgressOnlyInternetGatewayResponse, NotUsed] =
    Source.single(deleteEgressOnlyInternetGatewayRequest).via(deleteEgressOnlyInternetGatewayFlow(parallelism))

  def deleteEgressOnlyInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteEgressOnlyInternetGatewayRequest, DeleteEgressOnlyInternetGatewayResponse, NotUsed] =
    Flow[DeleteEgressOnlyInternetGatewayRequest].mapAsync(parallelism) { deleteEgressOnlyInternetGatewayRequest =>
      underlying.deleteEgressOnlyInternetGateway(deleteEgressOnlyInternetGatewayRequest)
    }

  def deleteFleetsSource(deleteFleetsRequest: DeleteFleetsRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteFleetsResponse, NotUsed] =
    Source.single(deleteFleetsRequest).via(deleteFleetsFlow(parallelism))

  def deleteFleetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFleetsRequest, DeleteFleetsResponse, NotUsed] =
    Flow[DeleteFleetsRequest].mapAsync(parallelism) { deleteFleetsRequest =>
      underlying.deleteFleets(deleteFleetsRequest)
    }

  def deleteFlowLogsSource(deleteFlowLogsRequest: DeleteFlowLogsRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteFlowLogsResponse, NotUsed] =
    Source.single(deleteFlowLogsRequest).via(deleteFlowLogsFlow(parallelism))

  def deleteFlowLogsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFlowLogsRequest, DeleteFlowLogsResponse, NotUsed] =
    Flow[DeleteFlowLogsRequest].mapAsync(parallelism) { deleteFlowLogsRequest =>
      underlying.deleteFlowLogs(deleteFlowLogsRequest)
    }

  def deleteFpgaImageSource(deleteFpgaImageRequest: DeleteFpgaImageRequest,
                            parallelism: Int = DefaultParallelism): Source[DeleteFpgaImageResponse, NotUsed] =
    Source.single(deleteFpgaImageRequest).via(deleteFpgaImageFlow(parallelism))

  def deleteFpgaImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFpgaImageRequest, DeleteFpgaImageResponse, NotUsed] =
    Flow[DeleteFpgaImageRequest].mapAsync(parallelism) { deleteFpgaImageRequest =>
      underlying.deleteFpgaImage(deleteFpgaImageRequest)
    }

  def deleteInternetGatewaySource(
      deleteInternetGatewayRequest: DeleteInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteInternetGatewayResponse, NotUsed] =
    Source.single(deleteInternetGatewayRequest).via(deleteInternetGatewayFlow(parallelism))

  def deleteInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteInternetGatewayRequest, DeleteInternetGatewayResponse, NotUsed] =
    Flow[DeleteInternetGatewayRequest].mapAsync(parallelism) { deleteInternetGatewayRequest =>
      underlying.deleteInternetGateway(deleteInternetGatewayRequest)
    }

  def deleteKeyPairSource(deleteKeyPairRequest: DeleteKeyPairRequest,
                          parallelism: Int = DefaultParallelism): Source[DeleteKeyPairResponse, NotUsed] =
    Source.single(deleteKeyPairRequest).via(deleteKeyPairFlow(parallelism))

  def deleteKeyPairFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteKeyPairRequest, DeleteKeyPairResponse, NotUsed] =
    Flow[DeleteKeyPairRequest].mapAsync(parallelism) { deleteKeyPairRequest =>
      underlying.deleteKeyPair(deleteKeyPairRequest)
    }

  def deleteLaunchTemplateSource(deleteLaunchTemplateRequest: DeleteLaunchTemplateRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteLaunchTemplateResponse, NotUsed] =
    Source.single(deleteLaunchTemplateRequest).via(deleteLaunchTemplateFlow(parallelism))

  def deleteLaunchTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLaunchTemplateRequest, DeleteLaunchTemplateResponse, NotUsed] =
    Flow[DeleteLaunchTemplateRequest].mapAsync(parallelism) { deleteLaunchTemplateRequest =>
      underlying.deleteLaunchTemplate(deleteLaunchTemplateRequest)
    }

  def deleteLaunchTemplateVersionsSource(
      deleteLaunchTemplateVersionsRequest: DeleteLaunchTemplateVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteLaunchTemplateVersionsResponse, NotUsed] =
    Source.single(deleteLaunchTemplateVersionsRequest).via(deleteLaunchTemplateVersionsFlow(parallelism))

  def deleteLaunchTemplateVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLaunchTemplateVersionsRequest, DeleteLaunchTemplateVersionsResponse, NotUsed] =
    Flow[DeleteLaunchTemplateVersionsRequest].mapAsync(parallelism) { deleteLaunchTemplateVersionsRequest =>
      underlying.deleteLaunchTemplateVersions(deleteLaunchTemplateVersionsRequest)
    }

  def deleteNatGatewaySource(deleteNatGatewayRequest: DeleteNatGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteNatGatewayResponse, NotUsed] =
    Source.single(deleteNatGatewayRequest).via(deleteNatGatewayFlow(parallelism))

  def deleteNatGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNatGatewayRequest, DeleteNatGatewayResponse, NotUsed] =
    Flow[DeleteNatGatewayRequest].mapAsync(parallelism) { deleteNatGatewayRequest =>
      underlying.deleteNatGateway(deleteNatGatewayRequest)
    }

  def deleteNetworkAclSource(deleteNetworkAclRequest: DeleteNetworkAclRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteNetworkAclResponse, NotUsed] =
    Source.single(deleteNetworkAclRequest).via(deleteNetworkAclFlow(parallelism))

  def deleteNetworkAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNetworkAclRequest, DeleteNetworkAclResponse, NotUsed] =
    Flow[DeleteNetworkAclRequest].mapAsync(parallelism) { deleteNetworkAclRequest =>
      underlying.deleteNetworkAcl(deleteNetworkAclRequest)
    }

  def deleteNetworkAclEntrySource(
      deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteNetworkAclEntryResponse, NotUsed] =
    Source.single(deleteNetworkAclEntryRequest).via(deleteNetworkAclEntryFlow(parallelism))

  def deleteNetworkAclEntryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResponse, NotUsed] =
    Flow[DeleteNetworkAclEntryRequest].mapAsync(parallelism) { deleteNetworkAclEntryRequest =>
      underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest)
    }

  def deleteNetworkInterfaceSource(
      deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteNetworkInterfaceResponse, NotUsed] =
    Source.single(deleteNetworkInterfaceRequest).via(deleteNetworkInterfaceFlow(parallelism))

  def deleteNetworkInterfaceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResponse, NotUsed] =
    Flow[DeleteNetworkInterfaceRequest].mapAsync(parallelism) { deleteNetworkInterfaceRequest =>
      underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest)
    }

  def deleteNetworkInterfacePermissionSource(
      deleteNetworkInterfacePermissionRequest: DeleteNetworkInterfacePermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteNetworkInterfacePermissionResponse, NotUsed] =
    Source.single(deleteNetworkInterfacePermissionRequest).via(deleteNetworkInterfacePermissionFlow(parallelism))

  def deleteNetworkInterfacePermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNetworkInterfacePermissionRequest, DeleteNetworkInterfacePermissionResponse, NotUsed] =
    Flow[DeleteNetworkInterfacePermissionRequest].mapAsync(parallelism) { deleteNetworkInterfacePermissionRequest =>
      underlying.deleteNetworkInterfacePermission(deleteNetworkInterfacePermissionRequest)
    }

  def deletePlacementGroupSource(deletePlacementGroupRequest: DeletePlacementGroupRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeletePlacementGroupResponse, NotUsed] =
    Source.single(deletePlacementGroupRequest).via(deletePlacementGroupFlow(parallelism))

  def deletePlacementGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeletePlacementGroupRequest, DeletePlacementGroupResponse, NotUsed] =
    Flow[DeletePlacementGroupRequest].mapAsync(parallelism) { deletePlacementGroupRequest =>
      underlying.deletePlacementGroup(deletePlacementGroupRequest)
    }

  def deleteRouteSource(deleteRouteRequest: DeleteRouteRequest,
                        parallelism: Int = DefaultParallelism): Source[DeleteRouteResponse, NotUsed] =
    Source.single(deleteRouteRequest).via(deleteRouteFlow(parallelism))

  def deleteRouteFlow(parallelism: Int = DefaultParallelism): Flow[DeleteRouteRequest, DeleteRouteResponse, NotUsed] =
    Flow[DeleteRouteRequest].mapAsync(parallelism) { deleteRouteRequest =>
      underlying.deleteRoute(deleteRouteRequest)
    }

  def deleteRouteTableSource(deleteRouteTableRequest: DeleteRouteTableRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteRouteTableResponse, NotUsed] =
    Source.single(deleteRouteTableRequest).via(deleteRouteTableFlow(parallelism))

  def deleteRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteRouteTableRequest, DeleteRouteTableResponse, NotUsed] =
    Flow[DeleteRouteTableRequest].mapAsync(parallelism) { deleteRouteTableRequest =>
      underlying.deleteRouteTable(deleteRouteTableRequest)
    }

  def deleteSecurityGroupSource(deleteSecurityGroupRequest: DeleteSecurityGroupRequest,
                                parallelism: Int = DefaultParallelism): Source[DeleteSecurityGroupResponse, NotUsed] =
    Source.single(deleteSecurityGroupRequest).via(deleteSecurityGroupFlow(parallelism))

  def deleteSecurityGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSecurityGroupRequest, DeleteSecurityGroupResponse, NotUsed] =
    Flow[DeleteSecurityGroupRequest].mapAsync(parallelism) { deleteSecurityGroupRequest =>
      underlying.deleteSecurityGroup(deleteSecurityGroupRequest)
    }

  def deleteSnapshotSource(deleteSnapshotRequest: DeleteSnapshotRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteSnapshotResponse, NotUsed] =
    Source.single(deleteSnapshotRequest).via(deleteSnapshotFlow(parallelism))

  def deleteSnapshotFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSnapshotRequest, DeleteSnapshotResponse, NotUsed] =
    Flow[DeleteSnapshotRequest].mapAsync(parallelism) { deleteSnapshotRequest =>
      underlying.deleteSnapshot(deleteSnapshotRequest)
    }

  def deleteSpotDatafeedSubscriptionSource(
      deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteSpotDatafeedSubscriptionResponse, NotUsed] =
    Source.single(deleteSpotDatafeedSubscriptionRequest).via(deleteSpotDatafeedSubscriptionFlow(parallelism))

  def deleteSpotDatafeedSubscriptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResponse, NotUsed] =
    Flow[DeleteSpotDatafeedSubscriptionRequest].mapAsync(parallelism) { deleteSpotDatafeedSubscriptionRequest =>
      underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest)
    }

  def deleteSpotDatafeedSubscriptionSource(): Source[DeleteSpotDatafeedSubscriptionResponse, NotUsed] =
    Source.fromFuture(underlying.deleteSpotDatafeedSubscription())

  def deleteSubnetSource(deleteSubnetRequest: DeleteSubnetRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteSubnetResponse, NotUsed] =
    Source.single(deleteSubnetRequest).via(deleteSubnetFlow(parallelism))

  def deleteSubnetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSubnetRequest, DeleteSubnetResponse, NotUsed] =
    Flow[DeleteSubnetRequest].mapAsync(parallelism) { deleteSubnetRequest =>
      underlying.deleteSubnet(deleteSubnetRequest)
    }

  def deleteTagsSource(deleteTagsRequest: DeleteTagsRequest,
                       parallelism: Int = DefaultParallelism): Source[DeleteTagsResponse, NotUsed] =
    Source.single(deleteTagsRequest).via(deleteTagsFlow(parallelism))

  def deleteTagsFlow(parallelism: Int = DefaultParallelism): Flow[DeleteTagsRequest, DeleteTagsResponse, NotUsed] =
    Flow[DeleteTagsRequest].mapAsync(parallelism) { deleteTagsRequest =>
      underlying.deleteTags(deleteTagsRequest)
    }

  def deleteTransitGatewaySource(deleteTransitGatewayRequest: DeleteTransitGatewayRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteTransitGatewayResponse, NotUsed] =
    Source.single(deleteTransitGatewayRequest).via(deleteTransitGatewayFlow(parallelism))

  def deleteTransitGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteTransitGatewayRequest, DeleteTransitGatewayResponse, NotUsed] =
    Flow[DeleteTransitGatewayRequest].mapAsync(parallelism) { deleteTransitGatewayRequest =>
      underlying.deleteTransitGateway(deleteTransitGatewayRequest)
    }

  def deleteTransitGatewayRouteSource(
      deleteTransitGatewayRouteRequest: DeleteTransitGatewayRouteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteTransitGatewayRouteResponse, NotUsed] =
    Source.single(deleteTransitGatewayRouteRequest).via(deleteTransitGatewayRouteFlow(parallelism))

  def deleteTransitGatewayRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteTransitGatewayRouteRequest, DeleteTransitGatewayRouteResponse, NotUsed] =
    Flow[DeleteTransitGatewayRouteRequest].mapAsync(parallelism) { deleteTransitGatewayRouteRequest =>
      underlying.deleteTransitGatewayRoute(deleteTransitGatewayRouteRequest)
    }

  def deleteTransitGatewayRouteTableSource(
      deleteTransitGatewayRouteTableRequest: DeleteTransitGatewayRouteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteTransitGatewayRouteTableResponse, NotUsed] =
    Source.single(deleteTransitGatewayRouteTableRequest).via(deleteTransitGatewayRouteTableFlow(parallelism))

  def deleteTransitGatewayRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteTransitGatewayRouteTableRequest, DeleteTransitGatewayRouteTableResponse, NotUsed] =
    Flow[DeleteTransitGatewayRouteTableRequest].mapAsync(parallelism) { deleteTransitGatewayRouteTableRequest =>
      underlying.deleteTransitGatewayRouteTable(deleteTransitGatewayRouteTableRequest)
    }

  def deleteTransitGatewayVpcAttachmentSource(
      deleteTransitGatewayVpcAttachmentRequest: DeleteTransitGatewayVpcAttachmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteTransitGatewayVpcAttachmentResponse, NotUsed] =
    Source.single(deleteTransitGatewayVpcAttachmentRequest).via(deleteTransitGatewayVpcAttachmentFlow(parallelism))

  def deleteTransitGatewayVpcAttachmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteTransitGatewayVpcAttachmentRequest, DeleteTransitGatewayVpcAttachmentResponse, NotUsed] =
    Flow[DeleteTransitGatewayVpcAttachmentRequest].mapAsync(parallelism) { deleteTransitGatewayVpcAttachmentRequest =>
      underlying.deleteTransitGatewayVpcAttachment(deleteTransitGatewayVpcAttachmentRequest)
    }

  def deleteVolumeSource(deleteVolumeRequest: DeleteVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteVolumeResponse, NotUsed] =
    Source.single(deleteVolumeRequest).via(deleteVolumeFlow(parallelism))

  def deleteVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVolumeRequest, DeleteVolumeResponse, NotUsed] =
    Flow[DeleteVolumeRequest].mapAsync(parallelism) { deleteVolumeRequest =>
      underlying.deleteVolume(deleteVolumeRequest)
    }

  def deleteVpcSource(deleteVpcRequest: DeleteVpcRequest,
                      parallelism: Int = DefaultParallelism): Source[DeleteVpcResponse, NotUsed] =
    Source.single(deleteVpcRequest).via(deleteVpcFlow(parallelism))

  def deleteVpcFlow(parallelism: Int = DefaultParallelism): Flow[DeleteVpcRequest, DeleteVpcResponse, NotUsed] =
    Flow[DeleteVpcRequest].mapAsync(parallelism) { deleteVpcRequest =>
      underlying.deleteVpc(deleteVpcRequest)
    }

  def deleteVpcEndpointConnectionNotificationsSource(
      deleteVpcEndpointConnectionNotificationsRequest: DeleteVpcEndpointConnectionNotificationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteVpcEndpointConnectionNotificationsResponse, NotUsed] =
    Source
      .single(deleteVpcEndpointConnectionNotificationsRequest).via(
        deleteVpcEndpointConnectionNotificationsFlow(parallelism)
      )

  def deleteVpcEndpointConnectionNotificationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpcEndpointConnectionNotificationsRequest, DeleteVpcEndpointConnectionNotificationsResponse, NotUsed] =
    Flow[DeleteVpcEndpointConnectionNotificationsRequest].mapAsync(parallelism) {
      deleteVpcEndpointConnectionNotificationsRequest =>
        underlying.deleteVpcEndpointConnectionNotifications(deleteVpcEndpointConnectionNotificationsRequest)
    }

  def deleteVpcEndpointServiceConfigurationsSource(
      deleteVpcEndpointServiceConfigurationsRequest: DeleteVpcEndpointServiceConfigurationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteVpcEndpointServiceConfigurationsResponse, NotUsed] =
    Source
      .single(deleteVpcEndpointServiceConfigurationsRequest).via(
        deleteVpcEndpointServiceConfigurationsFlow(parallelism)
      )

  def deleteVpcEndpointServiceConfigurationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpcEndpointServiceConfigurationsRequest, DeleteVpcEndpointServiceConfigurationsResponse, NotUsed] =
    Flow[DeleteVpcEndpointServiceConfigurationsRequest].mapAsync(parallelism) {
      deleteVpcEndpointServiceConfigurationsRequest =>
        underlying.deleteVpcEndpointServiceConfigurations(deleteVpcEndpointServiceConfigurationsRequest)
    }

  def deleteVpcEndpointsSource(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest,
                               parallelism: Int = DefaultParallelism): Source[DeleteVpcEndpointsResponse, NotUsed] =
    Source.single(deleteVpcEndpointsRequest).via(deleteVpcEndpointsFlow(parallelism))

  def deleteVpcEndpointsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpcEndpointsRequest, DeleteVpcEndpointsResponse, NotUsed] =
    Flow[DeleteVpcEndpointsRequest].mapAsync(parallelism) { deleteVpcEndpointsRequest =>
      underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest)
    }

  def deleteVpcPeeringConnectionSource(
      deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteVpcPeeringConnectionResponse, NotUsed] =
    Source.single(deleteVpcPeeringConnectionRequest).via(deleteVpcPeeringConnectionFlow(parallelism))

  def deleteVpcPeeringConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResponse, NotUsed] =
    Flow[DeleteVpcPeeringConnectionRequest].mapAsync(parallelism) { deleteVpcPeeringConnectionRequest =>
      underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest)
    }

  def deleteVpnConnectionSource(deleteVpnConnectionRequest: DeleteVpnConnectionRequest,
                                parallelism: Int = DefaultParallelism): Source[DeleteVpnConnectionResponse, NotUsed] =
    Source.single(deleteVpnConnectionRequest).via(deleteVpnConnectionFlow(parallelism))

  def deleteVpnConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpnConnectionRequest, DeleteVpnConnectionResponse, NotUsed] =
    Flow[DeleteVpnConnectionRequest].mapAsync(parallelism) { deleteVpnConnectionRequest =>
      underlying.deleteVpnConnection(deleteVpnConnectionRequest)
    }

  def deleteVpnConnectionRouteSource(
      deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteVpnConnectionRouteResponse, NotUsed] =
    Source.single(deleteVpnConnectionRouteRequest).via(deleteVpnConnectionRouteFlow(parallelism))

  def deleteVpnConnectionRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResponse, NotUsed] =
    Flow[DeleteVpnConnectionRouteRequest].mapAsync(parallelism) { deleteVpnConnectionRouteRequest =>
      underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest)
    }

  def deleteVpnGatewaySource(deleteVpnGatewayRequest: DeleteVpnGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteVpnGatewayResponse, NotUsed] =
    Source.single(deleteVpnGatewayRequest).via(deleteVpnGatewayFlow(parallelism))

  def deleteVpnGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteVpnGatewayRequest, DeleteVpnGatewayResponse, NotUsed] =
    Flow[DeleteVpnGatewayRequest].mapAsync(parallelism) { deleteVpnGatewayRequest =>
      underlying.deleteVpnGateway(deleteVpnGatewayRequest)
    }

  def deprovisionByoipCidrSource(deprovisionByoipCidrRequest: DeprovisionByoipCidrRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeprovisionByoipCidrResponse, NotUsed] =
    Source.single(deprovisionByoipCidrRequest).via(deprovisionByoipCidrFlow(parallelism))

  def deprovisionByoipCidrFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeprovisionByoipCidrRequest, DeprovisionByoipCidrResponse, NotUsed] =
    Flow[DeprovisionByoipCidrRequest].mapAsync(parallelism) { deprovisionByoipCidrRequest =>
      underlying.deprovisionByoipCidr(deprovisionByoipCidrRequest)
    }

  def deregisterImageSource(deregisterImageRequest: DeregisterImageRequest,
                            parallelism: Int = DefaultParallelism): Source[DeregisterImageResponse, NotUsed] =
    Source.single(deregisterImageRequest).via(deregisterImageFlow(parallelism))

  def deregisterImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeregisterImageRequest, DeregisterImageResponse, NotUsed] =
    Flow[DeregisterImageRequest].mapAsync(parallelism) { deregisterImageRequest =>
      underlying.deregisterImage(deregisterImageRequest)
    }

  def describeAccountAttributesSource(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAccountAttributesResponse, NotUsed] =
    Source.single(describeAccountAttributesRequest).via(describeAccountAttributesFlow(parallelism))

  def describeAccountAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAccountAttributesRequest, DescribeAccountAttributesResponse, NotUsed] =
    Flow[DescribeAccountAttributesRequest].mapAsync(parallelism) { describeAccountAttributesRequest =>
      underlying.describeAccountAttributes(describeAccountAttributesRequest)
    }

  def describeAccountAttributesSource(): Source[DescribeAccountAttributesResponse, NotUsed] =
    Source.fromFuture(underlying.describeAccountAttributes())

  def describeAddressesSource(describeAddressesRequest: DescribeAddressesRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeAddressesResponse, NotUsed] =
    Source.single(describeAddressesRequest).via(describeAddressesFlow(parallelism))

  def describeAddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAddressesRequest, DescribeAddressesResponse, NotUsed] =
    Flow[DescribeAddressesRequest].mapAsync(parallelism) { describeAddressesRequest =>
      underlying.describeAddresses(describeAddressesRequest)
    }

  def describeAddressesSource(): Source[DescribeAddressesResponse, NotUsed] =
    Source.fromFuture(underlying.describeAddresses())

  def describeAggregateIdFormatSource(
      describeAggregateIdFormatRequest: DescribeAggregateIdFormatRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAggregateIdFormatResponse, NotUsed] =
    Source.single(describeAggregateIdFormatRequest).via(describeAggregateIdFormatFlow(parallelism))

  def describeAggregateIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAggregateIdFormatRequest, DescribeAggregateIdFormatResponse, NotUsed] =
    Flow[DescribeAggregateIdFormatRequest].mapAsync(parallelism) { describeAggregateIdFormatRequest =>
      underlying.describeAggregateIdFormat(describeAggregateIdFormatRequest)
    }

  def describeAggregateIdFormatSource(): Source[DescribeAggregateIdFormatResponse, NotUsed] =
    Source.fromFuture(underlying.describeAggregateIdFormat())

  def describeAvailabilityZonesSource(
      describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAvailabilityZonesResponse, NotUsed] =
    Source.single(describeAvailabilityZonesRequest).via(describeAvailabilityZonesFlow(parallelism))

  def describeAvailabilityZonesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResponse, NotUsed] =
    Flow[DescribeAvailabilityZonesRequest].mapAsync(parallelism) { describeAvailabilityZonesRequest =>
      underlying.describeAvailabilityZones(describeAvailabilityZonesRequest)
    }

  def describeAvailabilityZonesSource(): Source[DescribeAvailabilityZonesResponse, NotUsed] =
    Source.fromFuture(underlying.describeAvailabilityZones())

  def describeBundleTasksSource(describeBundleTasksRequest: DescribeBundleTasksRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeBundleTasksResponse, NotUsed] =
    Source.single(describeBundleTasksRequest).via(describeBundleTasksFlow(parallelism))

  def describeBundleTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeBundleTasksRequest, DescribeBundleTasksResponse, NotUsed] =
    Flow[DescribeBundleTasksRequest].mapAsync(parallelism) { describeBundleTasksRequest =>
      underlying.describeBundleTasks(describeBundleTasksRequest)
    }

  def describeBundleTasksSource(): Source[DescribeBundleTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeBundleTasks())

  def describeByoipCidrsSource(describeByoipCidrsRequest: DescribeByoipCidrsRequest,
                               parallelism: Int = DefaultParallelism): Source[DescribeByoipCidrsResponse, NotUsed] =
    Source.single(describeByoipCidrsRequest).via(describeByoipCidrsFlow(parallelism))

  def describeByoipCidrsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeByoipCidrsRequest, DescribeByoipCidrsResponse, NotUsed] =
    Flow[DescribeByoipCidrsRequest].mapAsync(parallelism) { describeByoipCidrsRequest =>
      underlying.describeByoipCidrs(describeByoipCidrsRequest)
    }

  def describeCapacityReservationsSource(
      describeCapacityReservationsRequest: DescribeCapacityReservationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeCapacityReservationsResponse, NotUsed] =
    Source.single(describeCapacityReservationsRequest).via(describeCapacityReservationsFlow(parallelism))

  def describeCapacityReservationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeCapacityReservationsRequest, DescribeCapacityReservationsResponse, NotUsed] =
    Flow[DescribeCapacityReservationsRequest].mapAsync(parallelism) { describeCapacityReservationsRequest =>
      underlying.describeCapacityReservations(describeCapacityReservationsRequest)
    }

  def describeCapacityReservationsSource(): Source[DescribeCapacityReservationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeCapacityReservations())

  def describeClassicLinkInstancesSource(
      describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClassicLinkInstancesResponse, NotUsed] =
    Source.single(describeClassicLinkInstancesRequest).via(describeClassicLinkInstancesFlow(parallelism))

  def describeClassicLinkInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResponse, NotUsed] =
    Flow[DescribeClassicLinkInstancesRequest].mapAsync(parallelism) { describeClassicLinkInstancesRequest =>
      underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest)
    }

  def describeClassicLinkInstancesSource(): Source[DescribeClassicLinkInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.describeClassicLinkInstances())

  def describeClientVpnAuthorizationRulesSource(
      describeClientVpnAuthorizationRulesRequest: DescribeClientVpnAuthorizationRulesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClientVpnAuthorizationRulesResponse, NotUsed] =
    Source.single(describeClientVpnAuthorizationRulesRequest).via(describeClientVpnAuthorizationRulesFlow(parallelism))

  def describeClientVpnAuthorizationRulesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClientVpnAuthorizationRulesRequest, DescribeClientVpnAuthorizationRulesResponse, NotUsed] =
    Flow[DescribeClientVpnAuthorizationRulesRequest].mapAsync(parallelism) {
      describeClientVpnAuthorizationRulesRequest =>
        underlying.describeClientVpnAuthorizationRules(describeClientVpnAuthorizationRulesRequest)
    }

  def describeClientVpnConnectionsSource(
      describeClientVpnConnectionsRequest: DescribeClientVpnConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClientVpnConnectionsResponse, NotUsed] =
    Source.single(describeClientVpnConnectionsRequest).via(describeClientVpnConnectionsFlow(parallelism))

  def describeClientVpnConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClientVpnConnectionsRequest, DescribeClientVpnConnectionsResponse, NotUsed] =
    Flow[DescribeClientVpnConnectionsRequest].mapAsync(parallelism) { describeClientVpnConnectionsRequest =>
      underlying.describeClientVpnConnections(describeClientVpnConnectionsRequest)
    }

  def describeClientVpnEndpointsSource(
      describeClientVpnEndpointsRequest: DescribeClientVpnEndpointsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClientVpnEndpointsResponse, NotUsed] =
    Source.single(describeClientVpnEndpointsRequest).via(describeClientVpnEndpointsFlow(parallelism))

  def describeClientVpnEndpointsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClientVpnEndpointsRequest, DescribeClientVpnEndpointsResponse, NotUsed] =
    Flow[DescribeClientVpnEndpointsRequest].mapAsync(parallelism) { describeClientVpnEndpointsRequest =>
      underlying.describeClientVpnEndpoints(describeClientVpnEndpointsRequest)
    }

  def describeClientVpnEndpointsSource(): Source[DescribeClientVpnEndpointsResponse, NotUsed] =
    Source.fromFuture(underlying.describeClientVpnEndpoints())

  def describeClientVpnRoutesSource(
      describeClientVpnRoutesRequest: DescribeClientVpnRoutesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClientVpnRoutesResponse, NotUsed] =
    Source.single(describeClientVpnRoutesRequest).via(describeClientVpnRoutesFlow(parallelism))

  def describeClientVpnRoutesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClientVpnRoutesRequest, DescribeClientVpnRoutesResponse, NotUsed] =
    Flow[DescribeClientVpnRoutesRequest].mapAsync(parallelism) { describeClientVpnRoutesRequest =>
      underlying.describeClientVpnRoutes(describeClientVpnRoutesRequest)
    }

  def describeClientVpnTargetNetworksSource(
      describeClientVpnTargetNetworksRequest: DescribeClientVpnTargetNetworksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClientVpnTargetNetworksResponse, NotUsed] =
    Source.single(describeClientVpnTargetNetworksRequest).via(describeClientVpnTargetNetworksFlow(parallelism))

  def describeClientVpnTargetNetworksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClientVpnTargetNetworksRequest, DescribeClientVpnTargetNetworksResponse, NotUsed] =
    Flow[DescribeClientVpnTargetNetworksRequest].mapAsync(parallelism) { describeClientVpnTargetNetworksRequest =>
      underlying.describeClientVpnTargetNetworks(describeClientVpnTargetNetworksRequest)
    }

  def describeConversionTasksSource(
      describeConversionTasksRequest: DescribeConversionTasksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeConversionTasksResponse, NotUsed] =
    Source.single(describeConversionTasksRequest).via(describeConversionTasksFlow(parallelism))

  def describeConversionTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeConversionTasksRequest, DescribeConversionTasksResponse, NotUsed] =
    Flow[DescribeConversionTasksRequest].mapAsync(parallelism) { describeConversionTasksRequest =>
      underlying.describeConversionTasks(describeConversionTasksRequest)
    }

  def describeConversionTasksSource(): Source[DescribeConversionTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeConversionTasks())

  def describeCustomerGatewaysSource(
      describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeCustomerGatewaysResponse, NotUsed] =
    Source.single(describeCustomerGatewaysRequest).via(describeCustomerGatewaysFlow(parallelism))

  def describeCustomerGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResponse, NotUsed] =
    Flow[DescribeCustomerGatewaysRequest].mapAsync(parallelism) { describeCustomerGatewaysRequest =>
      underlying.describeCustomerGateways(describeCustomerGatewaysRequest)
    }

  def describeCustomerGatewaysSource(): Source[DescribeCustomerGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeCustomerGateways())

  def describeDhcpOptionsSource(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeDhcpOptionsResponse, NotUsed] =
    Source.single(describeDhcpOptionsRequest).via(describeDhcpOptionsFlow(parallelism))

  def describeDhcpOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeDhcpOptionsRequest, DescribeDhcpOptionsResponse, NotUsed] =
    Flow[DescribeDhcpOptionsRequest].mapAsync(parallelism) { describeDhcpOptionsRequest =>
      underlying.describeDhcpOptions(describeDhcpOptionsRequest)
    }

  def describeDhcpOptionsSource(): Source[DescribeDhcpOptionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeDhcpOptions())

  def describeEgressOnlyInternetGatewaysSource(
      describeEgressOnlyInternetGatewaysRequest: DescribeEgressOnlyInternetGatewaysRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEgressOnlyInternetGatewaysResponse, NotUsed] =
    Source.single(describeEgressOnlyInternetGatewaysRequest).via(describeEgressOnlyInternetGatewaysFlow(parallelism))

  def describeEgressOnlyInternetGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEgressOnlyInternetGatewaysRequest, DescribeEgressOnlyInternetGatewaysResponse, NotUsed] =
    Flow[DescribeEgressOnlyInternetGatewaysRequest].mapAsync(parallelism) { describeEgressOnlyInternetGatewaysRequest =>
      underlying.describeEgressOnlyInternetGateways(describeEgressOnlyInternetGatewaysRequest)
    }

  def describeEgressOnlyInternetGatewaysSource(): Source[DescribeEgressOnlyInternetGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeEgressOnlyInternetGateways())

  def describeElasticGpusSource(describeElasticGpusRequest: DescribeElasticGpusRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeElasticGpusResponse, NotUsed] =
    Source.single(describeElasticGpusRequest).via(describeElasticGpusFlow(parallelism))

  def describeElasticGpusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeElasticGpusRequest, DescribeElasticGpusResponse, NotUsed] =
    Flow[DescribeElasticGpusRequest].mapAsync(parallelism) { describeElasticGpusRequest =>
      underlying.describeElasticGpus(describeElasticGpusRequest)
    }

  def describeElasticGpusSource(): Source[DescribeElasticGpusResponse, NotUsed] =
    Source.fromFuture(underlying.describeElasticGpus())

  def describeExportTasksSource(describeExportTasksRequest: DescribeExportTasksRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeExportTasksResponse, NotUsed] =
    Source.single(describeExportTasksRequest).via(describeExportTasksFlow(parallelism))

  def describeExportTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeExportTasksRequest, DescribeExportTasksResponse, NotUsed] =
    Flow[DescribeExportTasksRequest].mapAsync(parallelism) { describeExportTasksRequest =>
      underlying.describeExportTasks(describeExportTasksRequest)
    }

  def describeExportTasksSource(): Source[DescribeExportTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeExportTasks())

  def describeFleetHistorySource(describeFleetHistoryRequest: DescribeFleetHistoryRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeFleetHistoryResponse, NotUsed] =
    Source.single(describeFleetHistoryRequest).via(describeFleetHistoryFlow(parallelism))

  def describeFleetHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFleetHistoryRequest, DescribeFleetHistoryResponse, NotUsed] =
    Flow[DescribeFleetHistoryRequest].mapAsync(parallelism) { describeFleetHistoryRequest =>
      underlying.describeFleetHistory(describeFleetHistoryRequest)
    }

  def describeFleetInstancesSource(
      describeFleetInstancesRequest: DescribeFleetInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeFleetInstancesResponse, NotUsed] =
    Source.single(describeFleetInstancesRequest).via(describeFleetInstancesFlow(parallelism))

  def describeFleetInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFleetInstancesRequest, DescribeFleetInstancesResponse, NotUsed] =
    Flow[DescribeFleetInstancesRequest].mapAsync(parallelism) { describeFleetInstancesRequest =>
      underlying.describeFleetInstances(describeFleetInstancesRequest)
    }

  def describeFleetsSource(describeFleetsRequest: DescribeFleetsRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeFleetsResponse, NotUsed] =
    Source.single(describeFleetsRequest).via(describeFleetsFlow(parallelism))

  def describeFleetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFleetsRequest, DescribeFleetsResponse, NotUsed] =
    Flow[DescribeFleetsRequest].mapAsync(parallelism) { describeFleetsRequest =>
      underlying.describeFleets(describeFleetsRequest)
    }

  def describeFleetsSource(): Source[DescribeFleetsResponse, NotUsed] =
    Source.fromFuture(underlying.describeFleets())

  def describeFlowLogsSource(describeFlowLogsRequest: DescribeFlowLogsRequest,
                             parallelism: Int = DefaultParallelism): Source[DescribeFlowLogsResponse, NotUsed] =
    Source.single(describeFlowLogsRequest).via(describeFlowLogsFlow(parallelism))

  def describeFlowLogsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFlowLogsRequest, DescribeFlowLogsResponse, NotUsed] =
    Flow[DescribeFlowLogsRequest].mapAsync(parallelism) { describeFlowLogsRequest =>
      underlying.describeFlowLogs(describeFlowLogsRequest)
    }

  def describeFlowLogsSource(): Source[DescribeFlowLogsResponse, NotUsed] =
    Source.fromFuture(underlying.describeFlowLogs())

  def describeFpgaImageAttributeSource(
      describeFpgaImageAttributeRequest: DescribeFpgaImageAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeFpgaImageAttributeResponse, NotUsed] =
    Source.single(describeFpgaImageAttributeRequest).via(describeFpgaImageAttributeFlow(parallelism))

  def describeFpgaImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFpgaImageAttributeRequest, DescribeFpgaImageAttributeResponse, NotUsed] =
    Flow[DescribeFpgaImageAttributeRequest].mapAsync(parallelism) { describeFpgaImageAttributeRequest =>
      underlying.describeFpgaImageAttribute(describeFpgaImageAttributeRequest)
    }

  def describeFpgaImagesSource(describeFpgaImagesRequest: DescribeFpgaImagesRequest,
                               parallelism: Int = DefaultParallelism): Source[DescribeFpgaImagesResponse, NotUsed] =
    Source.single(describeFpgaImagesRequest).via(describeFpgaImagesFlow(parallelism))

  def describeFpgaImagesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFpgaImagesRequest, DescribeFpgaImagesResponse, NotUsed] =
    Flow[DescribeFpgaImagesRequest].mapAsync(parallelism) { describeFpgaImagesRequest =>
      underlying.describeFpgaImages(describeFpgaImagesRequest)
    }

  def describeFpgaImagesSource(): Source[DescribeFpgaImagesResponse, NotUsed] =
    Source.fromFuture(underlying.describeFpgaImages())

  def describeHostReservationOfferingsSource(
      describeHostReservationOfferingsRequest: DescribeHostReservationOfferingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeHostReservationOfferingsResponse, NotUsed] =
    Source.single(describeHostReservationOfferingsRequest).via(describeHostReservationOfferingsFlow(parallelism))

  def describeHostReservationOfferingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResponse, NotUsed] =
    Flow[DescribeHostReservationOfferingsRequest].mapAsync(parallelism) { describeHostReservationOfferingsRequest =>
      underlying.describeHostReservationOfferings(describeHostReservationOfferingsRequest)
    }

  def describeHostReservationOfferingsSource(): Source[DescribeHostReservationOfferingsResponse, NotUsed] =
    Source.fromFuture(underlying.describeHostReservationOfferings())

  def describeHostReservationsSource(
      describeHostReservationsRequest: DescribeHostReservationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeHostReservationsResponse, NotUsed] =
    Source.single(describeHostReservationsRequest).via(describeHostReservationsFlow(parallelism))

  def describeHostReservationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeHostReservationsRequest, DescribeHostReservationsResponse, NotUsed] =
    Flow[DescribeHostReservationsRequest].mapAsync(parallelism) { describeHostReservationsRequest =>
      underlying.describeHostReservations(describeHostReservationsRequest)
    }

  def describeHostReservationsSource(): Source[DescribeHostReservationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeHostReservations())

  def describeHostsSource(describeHostsRequest: DescribeHostsRequest,
                          parallelism: Int = DefaultParallelism): Source[DescribeHostsResponse, NotUsed] =
    Source.single(describeHostsRequest).via(describeHostsFlow(parallelism))

  def describeHostsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeHostsRequest, DescribeHostsResponse, NotUsed] =
    Flow[DescribeHostsRequest].mapAsync(parallelism) { describeHostsRequest =>
      underlying.describeHosts(describeHostsRequest)
    }

  def describeHostsSource(): Source[DescribeHostsResponse, NotUsed] =
    Source.fromFuture(underlying.describeHosts())

  def describeIamInstanceProfileAssociationsSource(
      describeIamInstanceProfileAssociationsRequest: DescribeIamInstanceProfileAssociationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeIamInstanceProfileAssociationsResponse, NotUsed] =
    Source
      .single(describeIamInstanceProfileAssociationsRequest).via(
        describeIamInstanceProfileAssociationsFlow(parallelism)
      )

  def describeIamInstanceProfileAssociationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeIamInstanceProfileAssociationsRequest, DescribeIamInstanceProfileAssociationsResponse, NotUsed] =
    Flow[DescribeIamInstanceProfileAssociationsRequest].mapAsync(parallelism) {
      describeIamInstanceProfileAssociationsRequest =>
        underlying.describeIamInstanceProfileAssociations(describeIamInstanceProfileAssociationsRequest)
    }

  def describeIamInstanceProfileAssociationsSource(): Source[DescribeIamInstanceProfileAssociationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeIamInstanceProfileAssociations())

  def describeIdFormatSource(describeIdFormatRequest: DescribeIdFormatRequest,
                             parallelism: Int = DefaultParallelism): Source[DescribeIdFormatResponse, NotUsed] =
    Source.single(describeIdFormatRequest).via(describeIdFormatFlow(parallelism))

  def describeIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeIdFormatRequest, DescribeIdFormatResponse, NotUsed] =
    Flow[DescribeIdFormatRequest].mapAsync(parallelism) { describeIdFormatRequest =>
      underlying.describeIdFormat(describeIdFormatRequest)
    }

  def describeIdFormatSource(): Source[DescribeIdFormatResponse, NotUsed] =
    Source.fromFuture(underlying.describeIdFormat())

  def describeIdentityIdFormatSource(
      describeIdentityIdFormatRequest: DescribeIdentityIdFormatRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeIdentityIdFormatResponse, NotUsed] =
    Source.single(describeIdentityIdFormatRequest).via(describeIdentityIdFormatFlow(parallelism))

  def describeIdentityIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeIdentityIdFormatRequest, DescribeIdentityIdFormatResponse, NotUsed] =
    Flow[DescribeIdentityIdFormatRequest].mapAsync(parallelism) { describeIdentityIdFormatRequest =>
      underlying.describeIdentityIdFormat(describeIdentityIdFormatRequest)
    }

  def describeImageAttributeSource(
      describeImageAttributeRequest: DescribeImageAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeImageAttributeResponse, NotUsed] =
    Source.single(describeImageAttributeRequest).via(describeImageAttributeFlow(parallelism))

  def describeImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeImageAttributeRequest, DescribeImageAttributeResponse, NotUsed] =
    Flow[DescribeImageAttributeRequest].mapAsync(parallelism) { describeImageAttributeRequest =>
      underlying.describeImageAttribute(describeImageAttributeRequest)
    }

  def describeImagesSource(describeImagesRequest: DescribeImagesRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeImagesResponse, NotUsed] =
    Source.single(describeImagesRequest).via(describeImagesFlow(parallelism))

  def describeImagesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeImagesRequest, DescribeImagesResponse, NotUsed] =
    Flow[DescribeImagesRequest].mapAsync(parallelism) { describeImagesRequest =>
      underlying.describeImages(describeImagesRequest)
    }

  def describeImagesSource(): Source[DescribeImagesResponse, NotUsed] =
    Source.fromFuture(underlying.describeImages())

  def describeImportImageTasksSource(
      describeImportImageTasksRequest: DescribeImportImageTasksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeImportImageTasksResponse, NotUsed] =
    Source.single(describeImportImageTasksRequest).via(describeImportImageTasksFlow(parallelism))

  def describeImportImageTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeImportImageTasksRequest, DescribeImportImageTasksResponse, NotUsed] =
    Flow[DescribeImportImageTasksRequest].mapAsync(parallelism) { describeImportImageTasksRequest =>
      underlying.describeImportImageTasks(describeImportImageTasksRequest)
    }

  def describeImportImageTasksSource(): Source[DescribeImportImageTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeImportImageTasks())

  def describeImportSnapshotTasksSource(
      describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeImportSnapshotTasksResponse, NotUsed] =
    Source.single(describeImportSnapshotTasksRequest).via(describeImportSnapshotTasksFlow(parallelism))

  def describeImportSnapshotTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResponse, NotUsed] =
    Flow[DescribeImportSnapshotTasksRequest].mapAsync(parallelism) { describeImportSnapshotTasksRequest =>
      underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest)
    }

  def describeImportSnapshotTasksSource(): Source[DescribeImportSnapshotTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeImportSnapshotTasks())

  def describeInstanceAttributeSource(
      describeInstanceAttributeRequest: DescribeInstanceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeInstanceAttributeResponse, NotUsed] =
    Source.single(describeInstanceAttributeRequest).via(describeInstanceAttributeFlow(parallelism))

  def describeInstanceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInstanceAttributeRequest, DescribeInstanceAttributeResponse, NotUsed] =
    Flow[DescribeInstanceAttributeRequest].mapAsync(parallelism) { describeInstanceAttributeRequest =>
      underlying.describeInstanceAttribute(describeInstanceAttributeRequest)
    }

  def describeInstanceCreditSpecificationsSource(
      describeInstanceCreditSpecificationsRequest: DescribeInstanceCreditSpecificationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeInstanceCreditSpecificationsResponse, NotUsed] =
    Source
      .single(describeInstanceCreditSpecificationsRequest).via(describeInstanceCreditSpecificationsFlow(parallelism))

  def describeInstanceCreditSpecificationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInstanceCreditSpecificationsRequest, DescribeInstanceCreditSpecificationsResponse, NotUsed] =
    Flow[DescribeInstanceCreditSpecificationsRequest].mapAsync(parallelism) {
      describeInstanceCreditSpecificationsRequest =>
        underlying.describeInstanceCreditSpecifications(describeInstanceCreditSpecificationsRequest)
    }

  def describeInstanceCreditSpecificationsSource(): Source[DescribeInstanceCreditSpecificationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeInstanceCreditSpecifications())

  def describeInstanceStatusSource(
      describeInstanceStatusRequest: DescribeInstanceStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeInstanceStatusResponse, NotUsed] =
    Source.single(describeInstanceStatusRequest).via(describeInstanceStatusFlow(parallelism))

  def describeInstanceStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInstanceStatusRequest, DescribeInstanceStatusResponse, NotUsed] =
    Flow[DescribeInstanceStatusRequest].mapAsync(parallelism) { describeInstanceStatusRequest =>
      underlying.describeInstanceStatus(describeInstanceStatusRequest)
    }

  def describeInstanceStatusSource(): Source[DescribeInstanceStatusResponse, NotUsed] =
    Source.fromFuture(underlying.describeInstanceStatus())

  def describeInstanceStatusPaginatorSource: Source[DescribeInstanceStatusResponse, NotUsed] =
    Source.fromPublisher(underlying.describeInstanceStatusPaginator())

  def describeInstanceStatusPaginatorFlow
    : Flow[DescribeInstanceStatusRequest, DescribeInstanceStatusResponse, NotUsed] =
    Flow[DescribeInstanceStatusRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeInstanceStatusPaginator(request))
    }

  def describeInstancesSource(describeInstancesRequest: DescribeInstancesRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeInstancesResponse, NotUsed] =
    Source.single(describeInstancesRequest).via(describeInstancesFlow(parallelism))

  def describeInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInstancesRequest, DescribeInstancesResponse, NotUsed] =
    Flow[DescribeInstancesRequest].mapAsync(parallelism) { describeInstancesRequest =>
      underlying.describeInstances(describeInstancesRequest)
    }

  def describeInstancesSource(): Source[DescribeInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.describeInstances())

  def describeInstancesPaginatorSource: Source[DescribeInstancesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeInstancesPaginator())

  def describeInstancesPaginatorFlow: Flow[DescribeInstancesRequest, DescribeInstancesResponse, NotUsed] =
    Flow[DescribeInstancesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeInstancesPaginator(request))
    }

  def describeInternetGatewaysSource(
      describeInternetGatewaysRequest: DescribeInternetGatewaysRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeInternetGatewaysResponse, NotUsed] =
    Source.single(describeInternetGatewaysRequest).via(describeInternetGatewaysFlow(parallelism))

  def describeInternetGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInternetGatewaysRequest, DescribeInternetGatewaysResponse, NotUsed] =
    Flow[DescribeInternetGatewaysRequest].mapAsync(parallelism) { describeInternetGatewaysRequest =>
      underlying.describeInternetGateways(describeInternetGatewaysRequest)
    }

  def describeInternetGatewaysSource(): Source[DescribeInternetGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeInternetGateways())

  def describeKeyPairsSource(describeKeyPairsRequest: DescribeKeyPairsRequest,
                             parallelism: Int = DefaultParallelism): Source[DescribeKeyPairsResponse, NotUsed] =
    Source.single(describeKeyPairsRequest).via(describeKeyPairsFlow(parallelism))

  def describeKeyPairsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeKeyPairsRequest, DescribeKeyPairsResponse, NotUsed] =
    Flow[DescribeKeyPairsRequest].mapAsync(parallelism) { describeKeyPairsRequest =>
      underlying.describeKeyPairs(describeKeyPairsRequest)
    }

  def describeKeyPairsSource(): Source[DescribeKeyPairsResponse, NotUsed] =
    Source.fromFuture(underlying.describeKeyPairs())

  def describeLaunchTemplateVersionsSource(
      describeLaunchTemplateVersionsRequest: DescribeLaunchTemplateVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeLaunchTemplateVersionsResponse, NotUsed] =
    Source.single(describeLaunchTemplateVersionsRequest).via(describeLaunchTemplateVersionsFlow(parallelism))

  def describeLaunchTemplateVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLaunchTemplateVersionsRequest, DescribeLaunchTemplateVersionsResponse, NotUsed] =
    Flow[DescribeLaunchTemplateVersionsRequest].mapAsync(parallelism) { describeLaunchTemplateVersionsRequest =>
      underlying.describeLaunchTemplateVersions(describeLaunchTemplateVersionsRequest)
    }

  def describeLaunchTemplatesSource(
      describeLaunchTemplatesRequest: DescribeLaunchTemplatesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeLaunchTemplatesResponse, NotUsed] =
    Source.single(describeLaunchTemplatesRequest).via(describeLaunchTemplatesFlow(parallelism))

  def describeLaunchTemplatesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLaunchTemplatesRequest, DescribeLaunchTemplatesResponse, NotUsed] =
    Flow[DescribeLaunchTemplatesRequest].mapAsync(parallelism) { describeLaunchTemplatesRequest =>
      underlying.describeLaunchTemplates(describeLaunchTemplatesRequest)
    }

  def describeLaunchTemplatesSource(): Source[DescribeLaunchTemplatesResponse, NotUsed] =
    Source.fromFuture(underlying.describeLaunchTemplates())

  def describeMovingAddressesSource(
      describeMovingAddressesRequest: DescribeMovingAddressesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeMovingAddressesResponse, NotUsed] =
    Source.single(describeMovingAddressesRequest).via(describeMovingAddressesFlow(parallelism))

  def describeMovingAddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeMovingAddressesRequest, DescribeMovingAddressesResponse, NotUsed] =
    Flow[DescribeMovingAddressesRequest].mapAsync(parallelism) { describeMovingAddressesRequest =>
      underlying.describeMovingAddresses(describeMovingAddressesRequest)
    }

  def describeMovingAddressesSource(): Source[DescribeMovingAddressesResponse, NotUsed] =
    Source.fromFuture(underlying.describeMovingAddresses())

  def describeNatGatewaysSource(describeNatGatewaysRequest: DescribeNatGatewaysRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeNatGatewaysResponse, NotUsed] =
    Source.single(describeNatGatewaysRequest).via(describeNatGatewaysFlow(parallelism))

  def describeNatGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNatGatewaysRequest, DescribeNatGatewaysResponse, NotUsed] =
    Flow[DescribeNatGatewaysRequest].mapAsync(parallelism) { describeNatGatewaysRequest =>
      underlying.describeNatGateways(describeNatGatewaysRequest)
    }

  def describeNatGatewaysSource(): Source[DescribeNatGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeNatGateways())

  def describeNatGatewaysPaginatorSource: Source[DescribeNatGatewaysResponse, NotUsed] =
    Source.fromPublisher(underlying.describeNatGatewaysPaginator())

  def describeNatGatewaysPaginatorFlow: Flow[DescribeNatGatewaysRequest, DescribeNatGatewaysResponse, NotUsed] =
    Flow[DescribeNatGatewaysRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeNatGatewaysPaginator(request))
    }

  def describeNetworkAclsSource(describeNetworkAclsRequest: DescribeNetworkAclsRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeNetworkAclsResponse, NotUsed] =
    Source.single(describeNetworkAclsRequest).via(describeNetworkAclsFlow(parallelism))

  def describeNetworkAclsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNetworkAclsRequest, DescribeNetworkAclsResponse, NotUsed] =
    Flow[DescribeNetworkAclsRequest].mapAsync(parallelism) { describeNetworkAclsRequest =>
      underlying.describeNetworkAcls(describeNetworkAclsRequest)
    }

  def describeNetworkAclsSource(): Source[DescribeNetworkAclsResponse, NotUsed] =
    Source.fromFuture(underlying.describeNetworkAcls())

  def describeNetworkInterfaceAttributeSource(
      describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeNetworkInterfaceAttributeResponse, NotUsed] =
    Source.single(describeNetworkInterfaceAttributeRequest).via(describeNetworkInterfaceAttributeFlow(parallelism))

  def describeNetworkInterfaceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResponse, NotUsed] =
    Flow[DescribeNetworkInterfaceAttributeRequest].mapAsync(parallelism) { describeNetworkInterfaceAttributeRequest =>
      underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest)
    }

  def describeNetworkInterfacePermissionsSource(
      describeNetworkInterfacePermissionsRequest: DescribeNetworkInterfacePermissionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeNetworkInterfacePermissionsResponse, NotUsed] =
    Source.single(describeNetworkInterfacePermissionsRequest).via(describeNetworkInterfacePermissionsFlow(parallelism))

  def describeNetworkInterfacePermissionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNetworkInterfacePermissionsRequest, DescribeNetworkInterfacePermissionsResponse, NotUsed] =
    Flow[DescribeNetworkInterfacePermissionsRequest].mapAsync(parallelism) {
      describeNetworkInterfacePermissionsRequest =>
        underlying.describeNetworkInterfacePermissions(describeNetworkInterfacePermissionsRequest)
    }

  def describeNetworkInterfacePermissionsSource(): Source[DescribeNetworkInterfacePermissionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeNetworkInterfacePermissions())

  def describeNetworkInterfacesSource(
      describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeNetworkInterfacesResponse, NotUsed] =
    Source.single(describeNetworkInterfacesRequest).via(describeNetworkInterfacesFlow(parallelism))

  def describeNetworkInterfacesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResponse, NotUsed] =
    Flow[DescribeNetworkInterfacesRequest].mapAsync(parallelism) { describeNetworkInterfacesRequest =>
      underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest)
    }

  def describeNetworkInterfacesSource(): Source[DescribeNetworkInterfacesResponse, NotUsed] =
    Source.fromFuture(underlying.describeNetworkInterfaces())

  def describeNetworkInterfacesPaginatorSource: Source[DescribeNetworkInterfacesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeNetworkInterfacesPaginator())

  def describeNetworkInterfacesPaginatorFlow
    : Flow[DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResponse, NotUsed] =
    Flow[DescribeNetworkInterfacesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeNetworkInterfacesPaginator(request))
    }

  def describePlacementGroupsSource(
      describePlacementGroupsRequest: DescribePlacementGroupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribePlacementGroupsResponse, NotUsed] =
    Source.single(describePlacementGroupsRequest).via(describePlacementGroupsFlow(parallelism))

  def describePlacementGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePlacementGroupsRequest, DescribePlacementGroupsResponse, NotUsed] =
    Flow[DescribePlacementGroupsRequest].mapAsync(parallelism) { describePlacementGroupsRequest =>
      underlying.describePlacementGroups(describePlacementGroupsRequest)
    }

  def describePlacementGroupsSource(): Source[DescribePlacementGroupsResponse, NotUsed] =
    Source.fromFuture(underlying.describePlacementGroups())

  def describePrefixListsSource(describePrefixListsRequest: DescribePrefixListsRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribePrefixListsResponse, NotUsed] =
    Source.single(describePrefixListsRequest).via(describePrefixListsFlow(parallelism))

  def describePrefixListsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePrefixListsRequest, DescribePrefixListsResponse, NotUsed] =
    Flow[DescribePrefixListsRequest].mapAsync(parallelism) { describePrefixListsRequest =>
      underlying.describePrefixLists(describePrefixListsRequest)
    }

  def describePrefixListsSource(): Source[DescribePrefixListsResponse, NotUsed] =
    Source.fromFuture(underlying.describePrefixLists())

  def describePrincipalIdFormatSource(
      describePrincipalIdFormatRequest: DescribePrincipalIdFormatRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribePrincipalIdFormatResponse, NotUsed] =
    Source.single(describePrincipalIdFormatRequest).via(describePrincipalIdFormatFlow(parallelism))

  def describePrincipalIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePrincipalIdFormatRequest, DescribePrincipalIdFormatResponse, NotUsed] =
    Flow[DescribePrincipalIdFormatRequest].mapAsync(parallelism) { describePrincipalIdFormatRequest =>
      underlying.describePrincipalIdFormat(describePrincipalIdFormatRequest)
    }

  def describePrincipalIdFormatSource(): Source[DescribePrincipalIdFormatResponse, NotUsed] =
    Source.fromFuture(underlying.describePrincipalIdFormat())

  def describePublicIpv4PoolsSource(
      describePublicIpv4PoolsRequest: DescribePublicIpv4PoolsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribePublicIpv4PoolsResponse, NotUsed] =
    Source.single(describePublicIpv4PoolsRequest).via(describePublicIpv4PoolsFlow(parallelism))

  def describePublicIpv4PoolsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePublicIpv4PoolsRequest, DescribePublicIpv4PoolsResponse, NotUsed] =
    Flow[DescribePublicIpv4PoolsRequest].mapAsync(parallelism) { describePublicIpv4PoolsRequest =>
      underlying.describePublicIpv4Pools(describePublicIpv4PoolsRequest)
    }

  def describePublicIpv4PoolsSource(): Source[DescribePublicIpv4PoolsResponse, NotUsed] =
    Source.fromFuture(underlying.describePublicIpv4Pools())

  def describeRegionsSource(describeRegionsRequest: DescribeRegionsRequest,
                            parallelism: Int = DefaultParallelism): Source[DescribeRegionsResponse, NotUsed] =
    Source.single(describeRegionsRequest).via(describeRegionsFlow(parallelism))

  def describeRegionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeRegionsRequest, DescribeRegionsResponse, NotUsed] =
    Flow[DescribeRegionsRequest].mapAsync(parallelism) { describeRegionsRequest =>
      underlying.describeRegions(describeRegionsRequest)
    }

  def describeRegionsSource(): Source[DescribeRegionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeRegions())

  def describeReservedInstancesSource(
      describeReservedInstancesRequest: DescribeReservedInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedInstancesResponse, NotUsed] =
    Source.single(describeReservedInstancesRequest).via(describeReservedInstancesFlow(parallelism))

  def describeReservedInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeReservedInstancesRequest, DescribeReservedInstancesResponse, NotUsed] =
    Flow[DescribeReservedInstancesRequest].mapAsync(parallelism) { describeReservedInstancesRequest =>
      underlying.describeReservedInstances(describeReservedInstancesRequest)
    }

  def describeReservedInstancesSource(): Source[DescribeReservedInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedInstances())

  def describeReservedInstancesListingsSource(
      describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedInstancesListingsResponse, NotUsed] =
    Source.single(describeReservedInstancesListingsRequest).via(describeReservedInstancesListingsFlow(parallelism))

  def describeReservedInstancesListingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResponse, NotUsed] =
    Flow[DescribeReservedInstancesListingsRequest].mapAsync(parallelism) { describeReservedInstancesListingsRequest =>
      underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest)
    }

  def describeReservedInstancesListingsSource(): Source[DescribeReservedInstancesListingsResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedInstancesListings())

  def describeReservedInstancesModificationsSource(
      describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedInstancesModificationsResponse, NotUsed] =
    Source
      .single(describeReservedInstancesModificationsRequest).via(
        describeReservedInstancesModificationsFlow(parallelism)
      )

  def describeReservedInstancesModificationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResponse, NotUsed] =
    Flow[DescribeReservedInstancesModificationsRequest].mapAsync(parallelism) {
      describeReservedInstancesModificationsRequest =>
        underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest)
    }

  def describeReservedInstancesModificationsSource(): Source[DescribeReservedInstancesModificationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedInstancesModifications())

  def describeReservedInstancesModificationsPaginatorSource
    : Source[DescribeReservedInstancesModificationsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeReservedInstancesModificationsPaginator())

  def describeReservedInstancesModificationsPaginatorFlow
    : Flow[DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResponse, NotUsed] =
    Flow[DescribeReservedInstancesModificationsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeReservedInstancesModificationsPaginator(request))
    }

  def describeReservedInstancesOfferingsSource(
      describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedInstancesOfferingsResponse, NotUsed] =
    Source.single(describeReservedInstancesOfferingsRequest).via(describeReservedInstancesOfferingsFlow(parallelism))

  def describeReservedInstancesOfferingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResponse, NotUsed] =
    Flow[DescribeReservedInstancesOfferingsRequest].mapAsync(parallelism) { describeReservedInstancesOfferingsRequest =>
      underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest)
    }

  def describeReservedInstancesOfferingsSource(): Source[DescribeReservedInstancesOfferingsResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedInstancesOfferings())

  def describeReservedInstancesOfferingsPaginatorSource: Source[DescribeReservedInstancesOfferingsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeReservedInstancesOfferingsPaginator())

  def describeReservedInstancesOfferingsPaginatorFlow
    : Flow[DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResponse, NotUsed] =
    Flow[DescribeReservedInstancesOfferingsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeReservedInstancesOfferingsPaginator(request))
    }

  def describeRouteTablesSource(describeRouteTablesRequest: DescribeRouteTablesRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeRouteTablesResponse, NotUsed] =
    Source.single(describeRouteTablesRequest).via(describeRouteTablesFlow(parallelism))

  def describeRouteTablesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeRouteTablesRequest, DescribeRouteTablesResponse, NotUsed] =
    Flow[DescribeRouteTablesRequest].mapAsync(parallelism) { describeRouteTablesRequest =>
      underlying.describeRouteTables(describeRouteTablesRequest)
    }

  def describeRouteTablesSource(): Source[DescribeRouteTablesResponse, NotUsed] =
    Source.fromFuture(underlying.describeRouteTables())

  def describeRouteTablesPaginatorSource: Source[DescribeRouteTablesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeRouteTablesPaginator())

  def describeRouteTablesPaginatorFlow: Flow[DescribeRouteTablesRequest, DescribeRouteTablesResponse, NotUsed] =
    Flow[DescribeRouteTablesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeRouteTablesPaginator(request))
    }

  def describeScheduledInstanceAvailabilitySource(
      describeScheduledInstanceAvailabilityRequest: DescribeScheduledInstanceAvailabilityRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeScheduledInstanceAvailabilityResponse, NotUsed] =
    Source
      .single(describeScheduledInstanceAvailabilityRequest).via(describeScheduledInstanceAvailabilityFlow(parallelism))

  def describeScheduledInstanceAvailabilityFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeScheduledInstanceAvailabilityRequest, DescribeScheduledInstanceAvailabilityResponse, NotUsed] =
    Flow[DescribeScheduledInstanceAvailabilityRequest].mapAsync(parallelism) {
      describeScheduledInstanceAvailabilityRequest =>
        underlying.describeScheduledInstanceAvailability(describeScheduledInstanceAvailabilityRequest)
    }

  def describeScheduledInstancesSource(
      describeScheduledInstancesRequest: DescribeScheduledInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeScheduledInstancesResponse, NotUsed] =
    Source.single(describeScheduledInstancesRequest).via(describeScheduledInstancesFlow(parallelism))

  def describeScheduledInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeScheduledInstancesRequest, DescribeScheduledInstancesResponse, NotUsed] =
    Flow[DescribeScheduledInstancesRequest].mapAsync(parallelism) { describeScheduledInstancesRequest =>
      underlying.describeScheduledInstances(describeScheduledInstancesRequest)
    }

  def describeScheduledInstancesSource(): Source[DescribeScheduledInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.describeScheduledInstances())

  def describeSecurityGroupReferencesSource(
      describeSecurityGroupReferencesRequest: DescribeSecurityGroupReferencesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSecurityGroupReferencesResponse, NotUsed] =
    Source.single(describeSecurityGroupReferencesRequest).via(describeSecurityGroupReferencesFlow(parallelism))

  def describeSecurityGroupReferencesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResponse, NotUsed] =
    Flow[DescribeSecurityGroupReferencesRequest].mapAsync(parallelism) { describeSecurityGroupReferencesRequest =>
      underlying.describeSecurityGroupReferences(describeSecurityGroupReferencesRequest)
    }

  def describeSecurityGroupsSource(
      describeSecurityGroupsRequest: DescribeSecurityGroupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSecurityGroupsResponse, NotUsed] =
    Source.single(describeSecurityGroupsRequest).via(describeSecurityGroupsFlow(parallelism))

  def describeSecurityGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSecurityGroupsRequest, DescribeSecurityGroupsResponse, NotUsed] =
    Flow[DescribeSecurityGroupsRequest].mapAsync(parallelism) { describeSecurityGroupsRequest =>
      underlying.describeSecurityGroups(describeSecurityGroupsRequest)
    }

  def describeSecurityGroupsSource(): Source[DescribeSecurityGroupsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSecurityGroups())

  def describeSecurityGroupsPaginatorSource: Source[DescribeSecurityGroupsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeSecurityGroupsPaginator())

  def describeSecurityGroupsPaginatorFlow
    : Flow[DescribeSecurityGroupsRequest, DescribeSecurityGroupsResponse, NotUsed] =
    Flow[DescribeSecurityGroupsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeSecurityGroupsPaginator(request))
    }

  def describeSnapshotAttributeSource(
      describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSnapshotAttributeResponse, NotUsed] =
    Source.single(describeSnapshotAttributeRequest).via(describeSnapshotAttributeFlow(parallelism))

  def describeSnapshotAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResponse, NotUsed] =
    Flow[DescribeSnapshotAttributeRequest].mapAsync(parallelism) { describeSnapshotAttributeRequest =>
      underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest)
    }

  def describeSnapshotsSource(describeSnapshotsRequest: DescribeSnapshotsRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeSnapshotsResponse, NotUsed] =
    Source.single(describeSnapshotsRequest).via(describeSnapshotsFlow(parallelism))

  def describeSnapshotsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSnapshotsRequest, DescribeSnapshotsResponse, NotUsed] =
    Flow[DescribeSnapshotsRequest].mapAsync(parallelism) { describeSnapshotsRequest =>
      underlying.describeSnapshots(describeSnapshotsRequest)
    }

  def describeSnapshotsSource(): Source[DescribeSnapshotsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSnapshots())

  def describeSnapshotsPaginatorSource: Source[DescribeSnapshotsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeSnapshotsPaginator())

  def describeSnapshotsPaginatorFlow: Flow[DescribeSnapshotsRequest, DescribeSnapshotsResponse, NotUsed] =
    Flow[DescribeSnapshotsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeSnapshotsPaginator(request))
    }

  def describeSpotDatafeedSubscriptionSource(
      describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotDatafeedSubscriptionResponse, NotUsed] =
    Source.single(describeSpotDatafeedSubscriptionRequest).via(describeSpotDatafeedSubscriptionFlow(parallelism))

  def describeSpotDatafeedSubscriptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResponse, NotUsed] =
    Flow[DescribeSpotDatafeedSubscriptionRequest].mapAsync(parallelism) { describeSpotDatafeedSubscriptionRequest =>
      underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest)
    }

  def describeSpotDatafeedSubscriptionSource(): Source[DescribeSpotDatafeedSubscriptionResponse, NotUsed] =
    Source.fromFuture(underlying.describeSpotDatafeedSubscription())

  def describeSpotFleetInstancesSource(
      describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotFleetInstancesResponse, NotUsed] =
    Source.single(describeSpotFleetInstancesRequest).via(describeSpotFleetInstancesFlow(parallelism))

  def describeSpotFleetInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotFleetInstancesRequest, DescribeSpotFleetInstancesResponse, NotUsed] =
    Flow[DescribeSpotFleetInstancesRequest].mapAsync(parallelism) { describeSpotFleetInstancesRequest =>
      underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest)
    }

  def describeSpotFleetRequestHistorySource(
      describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotFleetRequestHistoryResponse, NotUsed] =
    Source.single(describeSpotFleetRequestHistoryRequest).via(describeSpotFleetRequestHistoryFlow(parallelism))

  def describeSpotFleetRequestHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResponse, NotUsed] =
    Flow[DescribeSpotFleetRequestHistoryRequest].mapAsync(parallelism) { describeSpotFleetRequestHistoryRequest =>
      underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest)
    }

  def describeSpotFleetRequestsSource(
      describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotFleetRequestsResponse, NotUsed] =
    Source.single(describeSpotFleetRequestsRequest).via(describeSpotFleetRequestsFlow(parallelism))

  def describeSpotFleetRequestsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResponse, NotUsed] =
    Flow[DescribeSpotFleetRequestsRequest].mapAsync(parallelism) { describeSpotFleetRequestsRequest =>
      underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest)
    }

  def describeSpotFleetRequestsSource(): Source[DescribeSpotFleetRequestsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSpotFleetRequests())

  def describeSpotFleetRequestsPaginatorSource: Source[DescribeSpotFleetRequestsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeSpotFleetRequestsPaginator())

  def describeSpotFleetRequestsPaginatorFlow
    : Flow[DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResponse, NotUsed] =
    Flow[DescribeSpotFleetRequestsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeSpotFleetRequestsPaginator(request))
    }

  def describeSpotInstanceRequestsSource(
      describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotInstanceRequestsResponse, NotUsed] =
    Source.single(describeSpotInstanceRequestsRequest).via(describeSpotInstanceRequestsFlow(parallelism))

  def describeSpotInstanceRequestsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResponse, NotUsed] =
    Flow[DescribeSpotInstanceRequestsRequest].mapAsync(parallelism) { describeSpotInstanceRequestsRequest =>
      underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest)
    }

  def describeSpotInstanceRequestsSource(): Source[DescribeSpotInstanceRequestsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSpotInstanceRequests())

  def describeSpotPriceHistorySource(
      describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSpotPriceHistoryResponse, NotUsed] =
    Source.single(describeSpotPriceHistoryRequest).via(describeSpotPriceHistoryFlow(parallelism))

  def describeSpotPriceHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResponse, NotUsed] =
    Flow[DescribeSpotPriceHistoryRequest].mapAsync(parallelism) { describeSpotPriceHistoryRequest =>
      underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest)
    }

  def describeSpotPriceHistorySource(): Source[DescribeSpotPriceHistoryResponse, NotUsed] =
    Source.fromFuture(underlying.describeSpotPriceHistory())

  def describeSpotPriceHistoryPaginatorSource: Source[DescribeSpotPriceHistoryResponse, NotUsed] =
    Source.fromPublisher(underlying.describeSpotPriceHistoryPaginator())

  def describeSpotPriceHistoryPaginatorFlow
    : Flow[DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResponse, NotUsed] =
    Flow[DescribeSpotPriceHistoryRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeSpotPriceHistoryPaginator(request))
    }

  def describeStaleSecurityGroupsSource(
      describeStaleSecurityGroupsRequest: DescribeStaleSecurityGroupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStaleSecurityGroupsResponse, NotUsed] =
    Source.single(describeStaleSecurityGroupsRequest).via(describeStaleSecurityGroupsFlow(parallelism))

  def describeStaleSecurityGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStaleSecurityGroupsRequest, DescribeStaleSecurityGroupsResponse, NotUsed] =
    Flow[DescribeStaleSecurityGroupsRequest].mapAsync(parallelism) { describeStaleSecurityGroupsRequest =>
      underlying.describeStaleSecurityGroups(describeStaleSecurityGroupsRequest)
    }

  def describeSubnetsSource(describeSubnetsRequest: DescribeSubnetsRequest,
                            parallelism: Int = DefaultParallelism): Source[DescribeSubnetsResponse, NotUsed] =
    Source.single(describeSubnetsRequest).via(describeSubnetsFlow(parallelism))

  def describeSubnetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSubnetsRequest, DescribeSubnetsResponse, NotUsed] =
    Flow[DescribeSubnetsRequest].mapAsync(parallelism) { describeSubnetsRequest =>
      underlying.describeSubnets(describeSubnetsRequest)
    }

  def describeSubnetsSource(): Source[DescribeSubnetsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSubnets())

  def describeTagsSource(describeTagsRequest: DescribeTagsRequest,
                         parallelism: Int = DefaultParallelism): Source[DescribeTagsResponse, NotUsed] =
    Source.single(describeTagsRequest).via(describeTagsFlow(parallelism))

  def describeTagsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTagsRequest, DescribeTagsResponse, NotUsed] =
    Flow[DescribeTagsRequest].mapAsync(parallelism) { describeTagsRequest =>
      underlying.describeTags(describeTagsRequest)
    }

  def describeTagsSource(): Source[DescribeTagsResponse, NotUsed] =
    Source.fromFuture(underlying.describeTags())

  def describeTagsPaginatorSource: Source[DescribeTagsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeTagsPaginator())

  def describeTagsPaginatorFlow: Flow[DescribeTagsRequest, DescribeTagsResponse, NotUsed] =
    Flow[DescribeTagsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeTagsPaginator(request))
    }

  def describeTransitGatewayAttachmentsSource(
      describeTransitGatewayAttachmentsRequest: DescribeTransitGatewayAttachmentsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTransitGatewayAttachmentsResponse, NotUsed] =
    Source.single(describeTransitGatewayAttachmentsRequest).via(describeTransitGatewayAttachmentsFlow(parallelism))

  def describeTransitGatewayAttachmentsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTransitGatewayAttachmentsRequest, DescribeTransitGatewayAttachmentsResponse, NotUsed] =
    Flow[DescribeTransitGatewayAttachmentsRequest].mapAsync(parallelism) { describeTransitGatewayAttachmentsRequest =>
      underlying.describeTransitGatewayAttachments(describeTransitGatewayAttachmentsRequest)
    }

  def describeTransitGatewayAttachmentsSource(): Source[DescribeTransitGatewayAttachmentsResponse, NotUsed] =
    Source.fromFuture(underlying.describeTransitGatewayAttachments())

  def describeTransitGatewayRouteTablesSource(
      describeTransitGatewayRouteTablesRequest: DescribeTransitGatewayRouteTablesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTransitGatewayRouteTablesResponse, NotUsed] =
    Source.single(describeTransitGatewayRouteTablesRequest).via(describeTransitGatewayRouteTablesFlow(parallelism))

  def describeTransitGatewayRouteTablesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTransitGatewayRouteTablesRequest, DescribeTransitGatewayRouteTablesResponse, NotUsed] =
    Flow[DescribeTransitGatewayRouteTablesRequest].mapAsync(parallelism) { describeTransitGatewayRouteTablesRequest =>
      underlying.describeTransitGatewayRouteTables(describeTransitGatewayRouteTablesRequest)
    }

  def describeTransitGatewayRouteTablesSource(): Source[DescribeTransitGatewayRouteTablesResponse, NotUsed] =
    Source.fromFuture(underlying.describeTransitGatewayRouteTables())

  def describeTransitGatewayVpcAttachmentsSource(
      describeTransitGatewayVpcAttachmentsRequest: DescribeTransitGatewayVpcAttachmentsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTransitGatewayVpcAttachmentsResponse, NotUsed] =
    Source
      .single(describeTransitGatewayVpcAttachmentsRequest).via(describeTransitGatewayVpcAttachmentsFlow(parallelism))

  def describeTransitGatewayVpcAttachmentsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTransitGatewayVpcAttachmentsRequest, DescribeTransitGatewayVpcAttachmentsResponse, NotUsed] =
    Flow[DescribeTransitGatewayVpcAttachmentsRequest].mapAsync(parallelism) {
      describeTransitGatewayVpcAttachmentsRequest =>
        underlying.describeTransitGatewayVpcAttachments(describeTransitGatewayVpcAttachmentsRequest)
    }

  def describeTransitGatewayVpcAttachmentsSource(): Source[DescribeTransitGatewayVpcAttachmentsResponse, NotUsed] =
    Source.fromFuture(underlying.describeTransitGatewayVpcAttachments())

  def describeTransitGatewaysSource(
      describeTransitGatewaysRequest: DescribeTransitGatewaysRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTransitGatewaysResponse, NotUsed] =
    Source.single(describeTransitGatewaysRequest).via(describeTransitGatewaysFlow(parallelism))

  def describeTransitGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTransitGatewaysRequest, DescribeTransitGatewaysResponse, NotUsed] =
    Flow[DescribeTransitGatewaysRequest].mapAsync(parallelism) { describeTransitGatewaysRequest =>
      underlying.describeTransitGateways(describeTransitGatewaysRequest)
    }

  def describeTransitGatewaysSource(): Source[DescribeTransitGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeTransitGateways())

  def describeVolumeAttributeSource(
      describeVolumeAttributeRequest: DescribeVolumeAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVolumeAttributeResponse, NotUsed] =
    Source.single(describeVolumeAttributeRequest).via(describeVolumeAttributeFlow(parallelism))

  def describeVolumeAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVolumeAttributeRequest, DescribeVolumeAttributeResponse, NotUsed] =
    Flow[DescribeVolumeAttributeRequest].mapAsync(parallelism) { describeVolumeAttributeRequest =>
      underlying.describeVolumeAttribute(describeVolumeAttributeRequest)
    }

  def describeVolumeStatusSource(describeVolumeStatusRequest: DescribeVolumeStatusRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeVolumeStatusResponse, NotUsed] =
    Source.single(describeVolumeStatusRequest).via(describeVolumeStatusFlow(parallelism))

  def describeVolumeStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVolumeStatusRequest, DescribeVolumeStatusResponse, NotUsed] =
    Flow[DescribeVolumeStatusRequest].mapAsync(parallelism) { describeVolumeStatusRequest =>
      underlying.describeVolumeStatus(describeVolumeStatusRequest)
    }

  def describeVolumeStatusSource(): Source[DescribeVolumeStatusResponse, NotUsed] =
    Source.fromFuture(underlying.describeVolumeStatus())

  def describeVolumeStatusPaginatorSource: Source[DescribeVolumeStatusResponse, NotUsed] =
    Source.fromPublisher(underlying.describeVolumeStatusPaginator())

  def describeVolumeStatusPaginatorFlow: Flow[DescribeVolumeStatusRequest, DescribeVolumeStatusResponse, NotUsed] =
    Flow[DescribeVolumeStatusRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeVolumeStatusPaginator(request))
    }

  def describeVolumesSource(describeVolumesRequest: DescribeVolumesRequest,
                            parallelism: Int = DefaultParallelism): Source[DescribeVolumesResponse, NotUsed] =
    Source.single(describeVolumesRequest).via(describeVolumesFlow(parallelism))

  def describeVolumesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVolumesRequest, DescribeVolumesResponse, NotUsed] =
    Flow[DescribeVolumesRequest].mapAsync(parallelism) { describeVolumesRequest =>
      underlying.describeVolumes(describeVolumesRequest)
    }

  def describeVolumesSource(): Source[DescribeVolumesResponse, NotUsed] =
    Source.fromFuture(underlying.describeVolumes())

  def describeVolumesModificationsSource(
      describeVolumesModificationsRequest: DescribeVolumesModificationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVolumesModificationsResponse, NotUsed] =
    Source.single(describeVolumesModificationsRequest).via(describeVolumesModificationsFlow(parallelism))

  def describeVolumesModificationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVolumesModificationsRequest, DescribeVolumesModificationsResponse, NotUsed] =
    Flow[DescribeVolumesModificationsRequest].mapAsync(parallelism) { describeVolumesModificationsRequest =>
      underlying.describeVolumesModifications(describeVolumesModificationsRequest)
    }

  def describeVolumesModificationsSource(): Source[DescribeVolumesModificationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVolumesModifications())

  def describeVolumesPaginatorSource: Source[DescribeVolumesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeVolumesPaginator())

  def describeVolumesPaginatorFlow: Flow[DescribeVolumesRequest, DescribeVolumesResponse, NotUsed] =
    Flow[DescribeVolumesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeVolumesPaginator(request))
    }

  def describeVpcAttributeSource(describeVpcAttributeRequest: DescribeVpcAttributeRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeVpcAttributeResponse, NotUsed] =
    Source.single(describeVpcAttributeRequest).via(describeVpcAttributeFlow(parallelism))

  def describeVpcAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcAttributeRequest, DescribeVpcAttributeResponse, NotUsed] =
    Flow[DescribeVpcAttributeRequest].mapAsync(parallelism) { describeVpcAttributeRequest =>
      underlying.describeVpcAttribute(describeVpcAttributeRequest)
    }

  def describeVpcClassicLinkSource(
      describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcClassicLinkResponse, NotUsed] =
    Source.single(describeVpcClassicLinkRequest).via(describeVpcClassicLinkFlow(parallelism))

  def describeVpcClassicLinkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResponse, NotUsed] =
    Flow[DescribeVpcClassicLinkRequest].mapAsync(parallelism) { describeVpcClassicLinkRequest =>
      underlying.describeVpcClassicLink(describeVpcClassicLinkRequest)
    }

  def describeVpcClassicLinkSource(): Source[DescribeVpcClassicLinkResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcClassicLink())

  def describeVpcClassicLinkDnsSupportSource(
      describeVpcClassicLinkDnsSupportRequest: DescribeVpcClassicLinkDnsSupportRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcClassicLinkDnsSupportResponse, NotUsed] =
    Source.single(describeVpcClassicLinkDnsSupportRequest).via(describeVpcClassicLinkDnsSupportFlow(parallelism))

  def describeVpcClassicLinkDnsSupportFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcClassicLinkDnsSupportRequest, DescribeVpcClassicLinkDnsSupportResponse, NotUsed] =
    Flow[DescribeVpcClassicLinkDnsSupportRequest].mapAsync(parallelism) { describeVpcClassicLinkDnsSupportRequest =>
      underlying.describeVpcClassicLinkDnsSupport(describeVpcClassicLinkDnsSupportRequest)
    }

  def describeVpcClassicLinkDnsSupportSource(): Source[DescribeVpcClassicLinkDnsSupportResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcClassicLinkDnsSupport())

  def describeVpcEndpointConnectionNotificationsSource(
      describeVpcEndpointConnectionNotificationsRequest: DescribeVpcEndpointConnectionNotificationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcEndpointConnectionNotificationsResponse, NotUsed] =
    Source
      .single(describeVpcEndpointConnectionNotificationsRequest).via(
        describeVpcEndpointConnectionNotificationsFlow(parallelism)
      )

  def describeVpcEndpointConnectionNotificationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointConnectionNotificationsRequest,
          DescribeVpcEndpointConnectionNotificationsResponse,
          NotUsed] =
    Flow[DescribeVpcEndpointConnectionNotificationsRequest].mapAsync(parallelism) {
      describeVpcEndpointConnectionNotificationsRequest =>
        underlying.describeVpcEndpointConnectionNotifications(describeVpcEndpointConnectionNotificationsRequest)
    }

  def describeVpcEndpointConnectionNotificationsSource()
    : Source[DescribeVpcEndpointConnectionNotificationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcEndpointConnectionNotifications())

  def describeVpcEndpointConnectionsSource(
      describeVpcEndpointConnectionsRequest: DescribeVpcEndpointConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcEndpointConnectionsResponse, NotUsed] =
    Source.single(describeVpcEndpointConnectionsRequest).via(describeVpcEndpointConnectionsFlow(parallelism))

  def describeVpcEndpointConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointConnectionsRequest, DescribeVpcEndpointConnectionsResponse, NotUsed] =
    Flow[DescribeVpcEndpointConnectionsRequest].mapAsync(parallelism) { describeVpcEndpointConnectionsRequest =>
      underlying.describeVpcEndpointConnections(describeVpcEndpointConnectionsRequest)
    }

  def describeVpcEndpointConnectionsSource(): Source[DescribeVpcEndpointConnectionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcEndpointConnections())

  def describeVpcEndpointServiceConfigurationsSource(
      describeVpcEndpointServiceConfigurationsRequest: DescribeVpcEndpointServiceConfigurationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcEndpointServiceConfigurationsResponse, NotUsed] =
    Source
      .single(describeVpcEndpointServiceConfigurationsRequest).via(
        describeVpcEndpointServiceConfigurationsFlow(parallelism)
      )

  def describeVpcEndpointServiceConfigurationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointServiceConfigurationsRequest, DescribeVpcEndpointServiceConfigurationsResponse, NotUsed] =
    Flow[DescribeVpcEndpointServiceConfigurationsRequest].mapAsync(parallelism) {
      describeVpcEndpointServiceConfigurationsRequest =>
        underlying.describeVpcEndpointServiceConfigurations(describeVpcEndpointServiceConfigurationsRequest)
    }

  def describeVpcEndpointServiceConfigurationsSource()
    : Source[DescribeVpcEndpointServiceConfigurationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcEndpointServiceConfigurations())

  def describeVpcEndpointServicePermissionsSource(
      describeVpcEndpointServicePermissionsRequest: DescribeVpcEndpointServicePermissionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcEndpointServicePermissionsResponse, NotUsed] =
    Source
      .single(describeVpcEndpointServicePermissionsRequest).via(describeVpcEndpointServicePermissionsFlow(parallelism))

  def describeVpcEndpointServicePermissionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointServicePermissionsRequest, DescribeVpcEndpointServicePermissionsResponse, NotUsed] =
    Flow[DescribeVpcEndpointServicePermissionsRequest].mapAsync(parallelism) {
      describeVpcEndpointServicePermissionsRequest =>
        underlying.describeVpcEndpointServicePermissions(describeVpcEndpointServicePermissionsRequest)
    }

  def describeVpcEndpointServicesSource(
      describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcEndpointServicesResponse, NotUsed] =
    Source.single(describeVpcEndpointServicesRequest).via(describeVpcEndpointServicesFlow(parallelism))

  def describeVpcEndpointServicesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResponse, NotUsed] =
    Flow[DescribeVpcEndpointServicesRequest].mapAsync(parallelism) { describeVpcEndpointServicesRequest =>
      underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest)
    }

  def describeVpcEndpointServicesSource(): Source[DescribeVpcEndpointServicesResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcEndpointServices())

  def describeVpcEndpointsSource(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeVpcEndpointsResponse, NotUsed] =
    Source.single(describeVpcEndpointsRequest).via(describeVpcEndpointsFlow(parallelism))

  def describeVpcEndpointsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcEndpointsRequest, DescribeVpcEndpointsResponse, NotUsed] =
    Flow[DescribeVpcEndpointsRequest].mapAsync(parallelism) { describeVpcEndpointsRequest =>
      underlying.describeVpcEndpoints(describeVpcEndpointsRequest)
    }

  def describeVpcEndpointsSource(): Source[DescribeVpcEndpointsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcEndpoints())

  def describeVpcPeeringConnectionsSource(
      describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpcPeeringConnectionsResponse, NotUsed] =
    Source.single(describeVpcPeeringConnectionsRequest).via(describeVpcPeeringConnectionsFlow(parallelism))

  def describeVpcPeeringConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResponse, NotUsed] =
    Flow[DescribeVpcPeeringConnectionsRequest].mapAsync(parallelism) { describeVpcPeeringConnectionsRequest =>
      underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest)
    }

  def describeVpcPeeringConnectionsSource(): Source[DescribeVpcPeeringConnectionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcPeeringConnections())

  def describeVpcsSource(describeVpcsRequest: DescribeVpcsRequest,
                         parallelism: Int = DefaultParallelism): Source[DescribeVpcsResponse, NotUsed] =
    Source.single(describeVpcsRequest).via(describeVpcsFlow(parallelism))

  def describeVpcsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpcsRequest, DescribeVpcsResponse, NotUsed] =
    Flow[DescribeVpcsRequest].mapAsync(parallelism) { describeVpcsRequest =>
      underlying.describeVpcs(describeVpcsRequest)
    }

  def describeVpcsSource(): Source[DescribeVpcsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpcs())

  def describeVpnConnectionsSource(
      describeVpnConnectionsRequest: DescribeVpnConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeVpnConnectionsResponse, NotUsed] =
    Source.single(describeVpnConnectionsRequest).via(describeVpnConnectionsFlow(parallelism))

  def describeVpnConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpnConnectionsRequest, DescribeVpnConnectionsResponse, NotUsed] =
    Flow[DescribeVpnConnectionsRequest].mapAsync(parallelism) { describeVpnConnectionsRequest =>
      underlying.describeVpnConnections(describeVpnConnectionsRequest)
    }

  def describeVpnConnectionsSource(): Source[DescribeVpnConnectionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpnConnections())

  def describeVpnGatewaysSource(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeVpnGatewaysResponse, NotUsed] =
    Source.single(describeVpnGatewaysRequest).via(describeVpnGatewaysFlow(parallelism))

  def describeVpnGatewaysFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeVpnGatewaysRequest, DescribeVpnGatewaysResponse, NotUsed] =
    Flow[DescribeVpnGatewaysRequest].mapAsync(parallelism) { describeVpnGatewaysRequest =>
      underlying.describeVpnGateways(describeVpnGatewaysRequest)
    }

  def describeVpnGatewaysSource(): Source[DescribeVpnGatewaysResponse, NotUsed] =
    Source.fromFuture(underlying.describeVpnGateways())

  def detachClassicLinkVpcSource(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest,
                                 parallelism: Int = DefaultParallelism): Source[DetachClassicLinkVpcResponse, NotUsed] =
    Source.single(detachClassicLinkVpcRequest).via(detachClassicLinkVpcFlow(parallelism))

  def detachClassicLinkVpcFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetachClassicLinkVpcRequest, DetachClassicLinkVpcResponse, NotUsed] =
    Flow[DetachClassicLinkVpcRequest].mapAsync(parallelism) { detachClassicLinkVpcRequest =>
      underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest)
    }

  def detachInternetGatewaySource(
      detachInternetGatewayRequest: DetachInternetGatewayRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetachInternetGatewayResponse, NotUsed] =
    Source.single(detachInternetGatewayRequest).via(detachInternetGatewayFlow(parallelism))

  def detachInternetGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetachInternetGatewayRequest, DetachInternetGatewayResponse, NotUsed] =
    Flow[DetachInternetGatewayRequest].mapAsync(parallelism) { detachInternetGatewayRequest =>
      underlying.detachInternetGateway(detachInternetGatewayRequest)
    }

  def detachNetworkInterfaceSource(
      detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetachNetworkInterfaceResponse, NotUsed] =
    Source.single(detachNetworkInterfaceRequest).via(detachNetworkInterfaceFlow(parallelism))

  def detachNetworkInterfaceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetachNetworkInterfaceRequest, DetachNetworkInterfaceResponse, NotUsed] =
    Flow[DetachNetworkInterfaceRequest].mapAsync(parallelism) { detachNetworkInterfaceRequest =>
      underlying.detachNetworkInterface(detachNetworkInterfaceRequest)
    }

  def detachVolumeSource(detachVolumeRequest: DetachVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[DetachVolumeResponse, NotUsed] =
    Source.single(detachVolumeRequest).via(detachVolumeFlow(parallelism))

  def detachVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetachVolumeRequest, DetachVolumeResponse, NotUsed] =
    Flow[DetachVolumeRequest].mapAsync(parallelism) { detachVolumeRequest =>
      underlying.detachVolume(detachVolumeRequest)
    }

  def detachVpnGatewaySource(detachVpnGatewayRequest: DetachVpnGatewayRequest,
                             parallelism: Int = DefaultParallelism): Source[DetachVpnGatewayResponse, NotUsed] =
    Source.single(detachVpnGatewayRequest).via(detachVpnGatewayFlow(parallelism))

  def detachVpnGatewayFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetachVpnGatewayRequest, DetachVpnGatewayResponse, NotUsed] =
    Flow[DetachVpnGatewayRequest].mapAsync(parallelism) { detachVpnGatewayRequest =>
      underlying.detachVpnGateway(detachVpnGatewayRequest)
    }

  def disableTransitGatewayRouteTablePropagationSource(
      disableTransitGatewayRouteTablePropagationRequest: DisableTransitGatewayRouteTablePropagationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableTransitGatewayRouteTablePropagationResponse, NotUsed] =
    Source
      .single(disableTransitGatewayRouteTablePropagationRequest).via(
        disableTransitGatewayRouteTablePropagationFlow(parallelism)
      )

  def disableTransitGatewayRouteTablePropagationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableTransitGatewayRouteTablePropagationRequest,
          DisableTransitGatewayRouteTablePropagationResponse,
          NotUsed] =
    Flow[DisableTransitGatewayRouteTablePropagationRequest].mapAsync(parallelism) {
      disableTransitGatewayRouteTablePropagationRequest =>
        underlying.disableTransitGatewayRouteTablePropagation(disableTransitGatewayRouteTablePropagationRequest)
    }

  def disableVgwRoutePropagationSource(
      disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableVgwRoutePropagationResponse, NotUsed] =
    Source.single(disableVgwRoutePropagationRequest).via(disableVgwRoutePropagationFlow(parallelism))

  def disableVgwRoutePropagationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResponse, NotUsed] =
    Flow[DisableVgwRoutePropagationRequest].mapAsync(parallelism) { disableVgwRoutePropagationRequest =>
      underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest)
    }

  def disableVpcClassicLinkSource(
      disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableVpcClassicLinkResponse, NotUsed] =
    Source.single(disableVpcClassicLinkRequest).via(disableVpcClassicLinkFlow(parallelism))

  def disableVpcClassicLinkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableVpcClassicLinkRequest, DisableVpcClassicLinkResponse, NotUsed] =
    Flow[DisableVpcClassicLinkRequest].mapAsync(parallelism) { disableVpcClassicLinkRequest =>
      underlying.disableVpcClassicLink(disableVpcClassicLinkRequest)
    }

  def disableVpcClassicLinkDnsSupportSource(
      disableVpcClassicLinkDnsSupportRequest: DisableVpcClassicLinkDnsSupportRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableVpcClassicLinkDnsSupportResponse, NotUsed] =
    Source.single(disableVpcClassicLinkDnsSupportRequest).via(disableVpcClassicLinkDnsSupportFlow(parallelism))

  def disableVpcClassicLinkDnsSupportFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResponse, NotUsed] =
    Flow[DisableVpcClassicLinkDnsSupportRequest].mapAsync(parallelism) { disableVpcClassicLinkDnsSupportRequest =>
      underlying.disableVpcClassicLinkDnsSupport(disableVpcClassicLinkDnsSupportRequest)
    }

  def disassociateAddressSource(disassociateAddressRequest: DisassociateAddressRequest,
                                parallelism: Int = DefaultParallelism): Source[DisassociateAddressResponse, NotUsed] =
    Source.single(disassociateAddressRequest).via(disassociateAddressFlow(parallelism))

  def disassociateAddressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateAddressRequest, DisassociateAddressResponse, NotUsed] =
    Flow[DisassociateAddressRequest].mapAsync(parallelism) { disassociateAddressRequest =>
      underlying.disassociateAddress(disassociateAddressRequest)
    }

  def disassociateClientVpnTargetNetworkSource(
      disassociateClientVpnTargetNetworkRequest: DisassociateClientVpnTargetNetworkRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateClientVpnTargetNetworkResponse, NotUsed] =
    Source.single(disassociateClientVpnTargetNetworkRequest).via(disassociateClientVpnTargetNetworkFlow(parallelism))

  def disassociateClientVpnTargetNetworkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateClientVpnTargetNetworkRequest, DisassociateClientVpnTargetNetworkResponse, NotUsed] =
    Flow[DisassociateClientVpnTargetNetworkRequest].mapAsync(parallelism) { disassociateClientVpnTargetNetworkRequest =>
      underlying.disassociateClientVpnTargetNetwork(disassociateClientVpnTargetNetworkRequest)
    }

  def disassociateIamInstanceProfileSource(
      disassociateIamInstanceProfileRequest: DisassociateIamInstanceProfileRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateIamInstanceProfileResponse, NotUsed] =
    Source.single(disassociateIamInstanceProfileRequest).via(disassociateIamInstanceProfileFlow(parallelism))

  def disassociateIamInstanceProfileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateIamInstanceProfileRequest, DisassociateIamInstanceProfileResponse, NotUsed] =
    Flow[DisassociateIamInstanceProfileRequest].mapAsync(parallelism) { disassociateIamInstanceProfileRequest =>
      underlying.disassociateIamInstanceProfile(disassociateIamInstanceProfileRequest)
    }

  def disassociateRouteTableSource(
      disassociateRouteTableRequest: DisassociateRouteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateRouteTableResponse, NotUsed] =
    Source.single(disassociateRouteTableRequest).via(disassociateRouteTableFlow(parallelism))

  def disassociateRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateRouteTableRequest, DisassociateRouteTableResponse, NotUsed] =
    Flow[DisassociateRouteTableRequest].mapAsync(parallelism) { disassociateRouteTableRequest =>
      underlying.disassociateRouteTable(disassociateRouteTableRequest)
    }

  def disassociateSubnetCidrBlockSource(
      disassociateSubnetCidrBlockRequest: DisassociateSubnetCidrBlockRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateSubnetCidrBlockResponse, NotUsed] =
    Source.single(disassociateSubnetCidrBlockRequest).via(disassociateSubnetCidrBlockFlow(parallelism))

  def disassociateSubnetCidrBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateSubnetCidrBlockRequest, DisassociateSubnetCidrBlockResponse, NotUsed] =
    Flow[DisassociateSubnetCidrBlockRequest].mapAsync(parallelism) { disassociateSubnetCidrBlockRequest =>
      underlying.disassociateSubnetCidrBlock(disassociateSubnetCidrBlockRequest)
    }

  def disassociateTransitGatewayRouteTableSource(
      disassociateTransitGatewayRouteTableRequest: DisassociateTransitGatewayRouteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateTransitGatewayRouteTableResponse, NotUsed] =
    Source
      .single(disassociateTransitGatewayRouteTableRequest).via(disassociateTransitGatewayRouteTableFlow(parallelism))

  def disassociateTransitGatewayRouteTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateTransitGatewayRouteTableRequest, DisassociateTransitGatewayRouteTableResponse, NotUsed] =
    Flow[DisassociateTransitGatewayRouteTableRequest].mapAsync(parallelism) {
      disassociateTransitGatewayRouteTableRequest =>
        underlying.disassociateTransitGatewayRouteTable(disassociateTransitGatewayRouteTableRequest)
    }

  def disassociateVpcCidrBlockSource(
      disassociateVpcCidrBlockRequest: DisassociateVpcCidrBlockRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisassociateVpcCidrBlockResponse, NotUsed] =
    Source.single(disassociateVpcCidrBlockRequest).via(disassociateVpcCidrBlockFlow(parallelism))

  def disassociateVpcCidrBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateVpcCidrBlockRequest, DisassociateVpcCidrBlockResponse, NotUsed] =
    Flow[DisassociateVpcCidrBlockRequest].mapAsync(parallelism) { disassociateVpcCidrBlockRequest =>
      underlying.disassociateVpcCidrBlock(disassociateVpcCidrBlockRequest)
    }

  def enableTransitGatewayRouteTablePropagationSource(
      enableTransitGatewayRouteTablePropagationRequest: EnableTransitGatewayRouteTablePropagationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableTransitGatewayRouteTablePropagationResponse, NotUsed] =
    Source
      .single(enableTransitGatewayRouteTablePropagationRequest).via(
        enableTransitGatewayRouteTablePropagationFlow(parallelism)
      )

  def enableTransitGatewayRouteTablePropagationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableTransitGatewayRouteTablePropagationRequest,
          EnableTransitGatewayRouteTablePropagationResponse,
          NotUsed] =
    Flow[EnableTransitGatewayRouteTablePropagationRequest].mapAsync(parallelism) {
      enableTransitGatewayRouteTablePropagationRequest =>
        underlying.enableTransitGatewayRouteTablePropagation(enableTransitGatewayRouteTablePropagationRequest)
    }

  def enableVgwRoutePropagationSource(
      enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableVgwRoutePropagationResponse, NotUsed] =
    Source.single(enableVgwRoutePropagationRequest).via(enableVgwRoutePropagationFlow(parallelism))

  def enableVgwRoutePropagationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResponse, NotUsed] =
    Flow[EnableVgwRoutePropagationRequest].mapAsync(parallelism) { enableVgwRoutePropagationRequest =>
      underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest)
    }

  def enableVolumeIOSource(enableVolumeIoRequest: EnableVolumeIoRequest,
                           parallelism: Int = DefaultParallelism): Source[EnableVolumeIOResponse, NotUsed] =
    Source.single(enableVolumeIoRequest).via(enableVolumeIOFlow(parallelism))

  def enableVolumeIOFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableVolumeIoRequest, EnableVolumeIOResponse, NotUsed] =
    Flow[EnableVolumeIoRequest].mapAsync(parallelism) { enableVolumeIoRequest =>
      underlying.enableVolumeIO(enableVolumeIoRequest)
    }

  def enableVpcClassicLinkSource(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest,
                                 parallelism: Int = DefaultParallelism): Source[EnableVpcClassicLinkResponse, NotUsed] =
    Source.single(enableVpcClassicLinkRequest).via(enableVpcClassicLinkFlow(parallelism))

  def enableVpcClassicLinkFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableVpcClassicLinkRequest, EnableVpcClassicLinkResponse, NotUsed] =
    Flow[EnableVpcClassicLinkRequest].mapAsync(parallelism) { enableVpcClassicLinkRequest =>
      underlying.enableVpcClassicLink(enableVpcClassicLinkRequest)
    }

  def enableVpcClassicLinkDnsSupportSource(
      enableVpcClassicLinkDnsSupportRequest: EnableVpcClassicLinkDnsSupportRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableVpcClassicLinkDnsSupportResponse, NotUsed] =
    Source.single(enableVpcClassicLinkDnsSupportRequest).via(enableVpcClassicLinkDnsSupportFlow(parallelism))

  def enableVpcClassicLinkDnsSupportFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResponse, NotUsed] =
    Flow[EnableVpcClassicLinkDnsSupportRequest].mapAsync(parallelism) { enableVpcClassicLinkDnsSupportRequest =>
      underlying.enableVpcClassicLinkDnsSupport(enableVpcClassicLinkDnsSupportRequest)
    }

  def exportClientVpnClientCertificateRevocationListSource(
      exportClientVpnClientCertificateRevocationListRequest: ExportClientVpnClientCertificateRevocationListRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ExportClientVpnClientCertificateRevocationListResponse, NotUsed] =
    Source
      .single(exportClientVpnClientCertificateRevocationListRequest).via(
        exportClientVpnClientCertificateRevocationListFlow(parallelism)
      )

  def exportClientVpnClientCertificateRevocationListFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ExportClientVpnClientCertificateRevocationListRequest,
          ExportClientVpnClientCertificateRevocationListResponse,
          NotUsed] =
    Flow[ExportClientVpnClientCertificateRevocationListRequest].mapAsync(parallelism) {
      exportClientVpnClientCertificateRevocationListRequest =>
        underlying.exportClientVpnClientCertificateRevocationList(exportClientVpnClientCertificateRevocationListRequest)
    }

  def exportClientVpnClientConfigurationSource(
      exportClientVpnClientConfigurationRequest: ExportClientVpnClientConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ExportClientVpnClientConfigurationResponse, NotUsed] =
    Source.single(exportClientVpnClientConfigurationRequest).via(exportClientVpnClientConfigurationFlow(parallelism))

  def exportClientVpnClientConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ExportClientVpnClientConfigurationRequest, ExportClientVpnClientConfigurationResponse, NotUsed] =
    Flow[ExportClientVpnClientConfigurationRequest].mapAsync(parallelism) { exportClientVpnClientConfigurationRequest =>
      underlying.exportClientVpnClientConfiguration(exportClientVpnClientConfigurationRequest)
    }

  def exportTransitGatewayRoutesSource(
      exportTransitGatewayRoutesRequest: ExportTransitGatewayRoutesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ExportTransitGatewayRoutesResponse, NotUsed] =
    Source.single(exportTransitGatewayRoutesRequest).via(exportTransitGatewayRoutesFlow(parallelism))

  def exportTransitGatewayRoutesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ExportTransitGatewayRoutesRequest, ExportTransitGatewayRoutesResponse, NotUsed] =
    Flow[ExportTransitGatewayRoutesRequest].mapAsync(parallelism) { exportTransitGatewayRoutesRequest =>
      underlying.exportTransitGatewayRoutes(exportTransitGatewayRoutesRequest)
    }

  def getConsoleOutputSource(getConsoleOutputRequest: GetConsoleOutputRequest,
                             parallelism: Int = DefaultParallelism): Source[GetConsoleOutputResponse, NotUsed] =
    Source.single(getConsoleOutputRequest).via(getConsoleOutputFlow(parallelism))

  def getConsoleOutputFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetConsoleOutputRequest, GetConsoleOutputResponse, NotUsed] =
    Flow[GetConsoleOutputRequest].mapAsync(parallelism) { getConsoleOutputRequest =>
      underlying.getConsoleOutput(getConsoleOutputRequest)
    }

  def getConsoleScreenshotSource(getConsoleScreenshotRequest: GetConsoleScreenshotRequest,
                                 parallelism: Int = DefaultParallelism): Source[GetConsoleScreenshotResponse, NotUsed] =
    Source.single(getConsoleScreenshotRequest).via(getConsoleScreenshotFlow(parallelism))

  def getConsoleScreenshotFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetConsoleScreenshotRequest, GetConsoleScreenshotResponse, NotUsed] =
    Flow[GetConsoleScreenshotRequest].mapAsync(parallelism) { getConsoleScreenshotRequest =>
      underlying.getConsoleScreenshot(getConsoleScreenshotRequest)
    }

  def getHostReservationPurchasePreviewSource(
      getHostReservationPurchasePreviewRequest: GetHostReservationPurchasePreviewRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetHostReservationPurchasePreviewResponse, NotUsed] =
    Source.single(getHostReservationPurchasePreviewRequest).via(getHostReservationPurchasePreviewFlow(parallelism))

  def getHostReservationPurchasePreviewFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResponse, NotUsed] =
    Flow[GetHostReservationPurchasePreviewRequest].mapAsync(parallelism) { getHostReservationPurchasePreviewRequest =>
      underlying.getHostReservationPurchasePreview(getHostReservationPurchasePreviewRequest)
    }

  def getLaunchTemplateDataSource(
      getLaunchTemplateDataRequest: GetLaunchTemplateDataRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLaunchTemplateDataResponse, NotUsed] =
    Source.single(getLaunchTemplateDataRequest).via(getLaunchTemplateDataFlow(parallelism))

  def getLaunchTemplateDataFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLaunchTemplateDataRequest, GetLaunchTemplateDataResponse, NotUsed] =
    Flow[GetLaunchTemplateDataRequest].mapAsync(parallelism) { getLaunchTemplateDataRequest =>
      underlying.getLaunchTemplateData(getLaunchTemplateDataRequest)
    }

  def getPasswordDataSource(getPasswordDataRequest: GetPasswordDataRequest,
                            parallelism: Int = DefaultParallelism): Source[GetPasswordDataResponse, NotUsed] =
    Source.single(getPasswordDataRequest).via(getPasswordDataFlow(parallelism))

  def getPasswordDataFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetPasswordDataRequest, GetPasswordDataResponse, NotUsed] =
    Flow[GetPasswordDataRequest].mapAsync(parallelism) { getPasswordDataRequest =>
      underlying.getPasswordData(getPasswordDataRequest)
    }

  def getReservedInstancesExchangeQuoteSource(
      getReservedInstancesExchangeQuoteRequest: GetReservedInstancesExchangeQuoteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetReservedInstancesExchangeQuoteResponse, NotUsed] =
    Source.single(getReservedInstancesExchangeQuoteRequest).via(getReservedInstancesExchangeQuoteFlow(parallelism))

  def getReservedInstancesExchangeQuoteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResponse, NotUsed] =
    Flow[GetReservedInstancesExchangeQuoteRequest].mapAsync(parallelism) { getReservedInstancesExchangeQuoteRequest =>
      underlying.getReservedInstancesExchangeQuote(getReservedInstancesExchangeQuoteRequest)
    }

  def getTransitGatewayAttachmentPropagationsSource(
      getTransitGatewayAttachmentPropagationsRequest: GetTransitGatewayAttachmentPropagationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetTransitGatewayAttachmentPropagationsResponse, NotUsed] =
    Source
      .single(getTransitGatewayAttachmentPropagationsRequest).via(
        getTransitGatewayAttachmentPropagationsFlow(parallelism)
      )

  def getTransitGatewayAttachmentPropagationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetTransitGatewayAttachmentPropagationsRequest, GetTransitGatewayAttachmentPropagationsResponse, NotUsed] =
    Flow[GetTransitGatewayAttachmentPropagationsRequest].mapAsync(parallelism) {
      getTransitGatewayAttachmentPropagationsRequest =>
        underlying.getTransitGatewayAttachmentPropagations(getTransitGatewayAttachmentPropagationsRequest)
    }

  def getTransitGatewayRouteTableAssociationsSource(
      getTransitGatewayRouteTableAssociationsRequest: GetTransitGatewayRouteTableAssociationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetTransitGatewayRouteTableAssociationsResponse, NotUsed] =
    Source
      .single(getTransitGatewayRouteTableAssociationsRequest).via(
        getTransitGatewayRouteTableAssociationsFlow(parallelism)
      )

  def getTransitGatewayRouteTableAssociationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetTransitGatewayRouteTableAssociationsRequest, GetTransitGatewayRouteTableAssociationsResponse, NotUsed] =
    Flow[GetTransitGatewayRouteTableAssociationsRequest].mapAsync(parallelism) {
      getTransitGatewayRouteTableAssociationsRequest =>
        underlying.getTransitGatewayRouteTableAssociations(getTransitGatewayRouteTableAssociationsRequest)
    }

  def getTransitGatewayRouteTablePropagationsSource(
      getTransitGatewayRouteTablePropagationsRequest: GetTransitGatewayRouteTablePropagationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetTransitGatewayRouteTablePropagationsResponse, NotUsed] =
    Source
      .single(getTransitGatewayRouteTablePropagationsRequest).via(
        getTransitGatewayRouteTablePropagationsFlow(parallelism)
      )

  def getTransitGatewayRouteTablePropagationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetTransitGatewayRouteTablePropagationsRequest, GetTransitGatewayRouteTablePropagationsResponse, NotUsed] =
    Flow[GetTransitGatewayRouteTablePropagationsRequest].mapAsync(parallelism) {
      getTransitGatewayRouteTablePropagationsRequest =>
        underlying.getTransitGatewayRouteTablePropagations(getTransitGatewayRouteTablePropagationsRequest)
    }

  def importClientVpnClientCertificateRevocationListSource(
      importClientVpnClientCertificateRevocationListRequest: ImportClientVpnClientCertificateRevocationListRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ImportClientVpnClientCertificateRevocationListResponse, NotUsed] =
    Source
      .single(importClientVpnClientCertificateRevocationListRequest).via(
        importClientVpnClientCertificateRevocationListFlow(parallelism)
      )

  def importClientVpnClientCertificateRevocationListFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportClientVpnClientCertificateRevocationListRequest,
          ImportClientVpnClientCertificateRevocationListResponse,
          NotUsed] =
    Flow[ImportClientVpnClientCertificateRevocationListRequest].mapAsync(parallelism) {
      importClientVpnClientCertificateRevocationListRequest =>
        underlying.importClientVpnClientCertificateRevocationList(importClientVpnClientCertificateRevocationListRequest)
    }

  def importImageSource(importImageRequest: ImportImageRequest,
                        parallelism: Int = DefaultParallelism): Source[ImportImageResponse, NotUsed] =
    Source.single(importImageRequest).via(importImageFlow(parallelism))

  def importImageFlow(parallelism: Int = DefaultParallelism): Flow[ImportImageRequest, ImportImageResponse, NotUsed] =
    Flow[ImportImageRequest].mapAsync(parallelism) { importImageRequest =>
      underlying.importImage(importImageRequest)
    }

  def importInstanceSource(importInstanceRequest: ImportInstanceRequest,
                           parallelism: Int = DefaultParallelism): Source[ImportInstanceResponse, NotUsed] =
    Source.single(importInstanceRequest).via(importInstanceFlow(parallelism))

  def importInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportInstanceRequest, ImportInstanceResponse, NotUsed] =
    Flow[ImportInstanceRequest].mapAsync(parallelism) { importInstanceRequest =>
      underlying.importInstance(importInstanceRequest)
    }

  def importKeyPairSource(importKeyPairRequest: ImportKeyPairRequest,
                          parallelism: Int = DefaultParallelism): Source[ImportKeyPairResponse, NotUsed] =
    Source.single(importKeyPairRequest).via(importKeyPairFlow(parallelism))

  def importKeyPairFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportKeyPairRequest, ImportKeyPairResponse, NotUsed] =
    Flow[ImportKeyPairRequest].mapAsync(parallelism) { importKeyPairRequest =>
      underlying.importKeyPair(importKeyPairRequest)
    }

  def importSnapshotSource(importSnapshotRequest: ImportSnapshotRequest,
                           parallelism: Int = DefaultParallelism): Source[ImportSnapshotResponse, NotUsed] =
    Source.single(importSnapshotRequest).via(importSnapshotFlow(parallelism))

  def importSnapshotFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportSnapshotRequest, ImportSnapshotResponse, NotUsed] =
    Flow[ImportSnapshotRequest].mapAsync(parallelism) { importSnapshotRequest =>
      underlying.importSnapshot(importSnapshotRequest)
    }

  def importVolumeSource(importVolumeRequest: ImportVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[ImportVolumeResponse, NotUsed] =
    Source.single(importVolumeRequest).via(importVolumeFlow(parallelism))

  def importVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportVolumeRequest, ImportVolumeResponse, NotUsed] =
    Flow[ImportVolumeRequest].mapAsync(parallelism) { importVolumeRequest =>
      underlying.importVolume(importVolumeRequest)
    }

  def modifyCapacityReservationSource(
      modifyCapacityReservationRequest: ModifyCapacityReservationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyCapacityReservationResponse, NotUsed] =
    Source.single(modifyCapacityReservationRequest).via(modifyCapacityReservationFlow(parallelism))

  def modifyCapacityReservationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyCapacityReservationRequest, ModifyCapacityReservationResponse, NotUsed] =
    Flow[ModifyCapacityReservationRequest].mapAsync(parallelism) { modifyCapacityReservationRequest =>
      underlying.modifyCapacityReservation(modifyCapacityReservationRequest)
    }

  def modifyClientVpnEndpointSource(
      modifyClientVpnEndpointRequest: ModifyClientVpnEndpointRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyClientVpnEndpointResponse, NotUsed] =
    Source.single(modifyClientVpnEndpointRequest).via(modifyClientVpnEndpointFlow(parallelism))

  def modifyClientVpnEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyClientVpnEndpointRequest, ModifyClientVpnEndpointResponse, NotUsed] =
    Flow[ModifyClientVpnEndpointRequest].mapAsync(parallelism) { modifyClientVpnEndpointRequest =>
      underlying.modifyClientVpnEndpoint(modifyClientVpnEndpointRequest)
    }

  def modifyFleetSource(modifyFleetRequest: ModifyFleetRequest,
                        parallelism: Int = DefaultParallelism): Source[ModifyFleetResponse, NotUsed] =
    Source.single(modifyFleetRequest).via(modifyFleetFlow(parallelism))

  def modifyFleetFlow(parallelism: Int = DefaultParallelism): Flow[ModifyFleetRequest, ModifyFleetResponse, NotUsed] =
    Flow[ModifyFleetRequest].mapAsync(parallelism) { modifyFleetRequest =>
      underlying.modifyFleet(modifyFleetRequest)
    }

  def modifyFpgaImageAttributeSource(
      modifyFpgaImageAttributeRequest: ModifyFpgaImageAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyFpgaImageAttributeResponse, NotUsed] =
    Source.single(modifyFpgaImageAttributeRequest).via(modifyFpgaImageAttributeFlow(parallelism))

  def modifyFpgaImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyFpgaImageAttributeRequest, ModifyFpgaImageAttributeResponse, NotUsed] =
    Flow[ModifyFpgaImageAttributeRequest].mapAsync(parallelism) { modifyFpgaImageAttributeRequest =>
      underlying.modifyFpgaImageAttribute(modifyFpgaImageAttributeRequest)
    }

  def modifyHostsSource(modifyHostsRequest: ModifyHostsRequest,
                        parallelism: Int = DefaultParallelism): Source[ModifyHostsResponse, NotUsed] =
    Source.single(modifyHostsRequest).via(modifyHostsFlow(parallelism))

  def modifyHostsFlow(parallelism: Int = DefaultParallelism): Flow[ModifyHostsRequest, ModifyHostsResponse, NotUsed] =
    Flow[ModifyHostsRequest].mapAsync(parallelism) { modifyHostsRequest =>
      underlying.modifyHosts(modifyHostsRequest)
    }

  def modifyIdFormatSource(modifyIdFormatRequest: ModifyIdFormatRequest,
                           parallelism: Int = DefaultParallelism): Source[ModifyIdFormatResponse, NotUsed] =
    Source.single(modifyIdFormatRequest).via(modifyIdFormatFlow(parallelism))

  def modifyIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyIdFormatRequest, ModifyIdFormatResponse, NotUsed] =
    Flow[ModifyIdFormatRequest].mapAsync(parallelism) { modifyIdFormatRequest =>
      underlying.modifyIdFormat(modifyIdFormatRequest)
    }

  def modifyIdentityIdFormatSource(
      modifyIdentityIdFormatRequest: ModifyIdentityIdFormatRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyIdentityIdFormatResponse, NotUsed] =
    Source.single(modifyIdentityIdFormatRequest).via(modifyIdentityIdFormatFlow(parallelism))

  def modifyIdentityIdFormatFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResponse, NotUsed] =
    Flow[ModifyIdentityIdFormatRequest].mapAsync(parallelism) { modifyIdentityIdFormatRequest =>
      underlying.modifyIdentityIdFormat(modifyIdentityIdFormatRequest)
    }

  def modifyImageAttributeSource(modifyImageAttributeRequest: ModifyImageAttributeRequest,
                                 parallelism: Int = DefaultParallelism): Source[ModifyImageAttributeResponse, NotUsed] =
    Source.single(modifyImageAttributeRequest).via(modifyImageAttributeFlow(parallelism))

  def modifyImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyImageAttributeRequest, ModifyImageAttributeResponse, NotUsed] =
    Flow[ModifyImageAttributeRequest].mapAsync(parallelism) { modifyImageAttributeRequest =>
      underlying.modifyImageAttribute(modifyImageAttributeRequest)
    }

  def modifyInstanceAttributeSource(
      modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyInstanceAttributeResponse, NotUsed] =
    Source.single(modifyInstanceAttributeRequest).via(modifyInstanceAttributeFlow(parallelism))

  def modifyInstanceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyInstanceAttributeRequest, ModifyInstanceAttributeResponse, NotUsed] =
    Flow[ModifyInstanceAttributeRequest].mapAsync(parallelism) { modifyInstanceAttributeRequest =>
      underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest)
    }

  def modifyInstanceCapacityReservationAttributesSource(
      modifyInstanceCapacityReservationAttributesRequest: ModifyInstanceCapacityReservationAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyInstanceCapacityReservationAttributesResponse, NotUsed] =
    Source
      .single(modifyInstanceCapacityReservationAttributesRequest).via(
        modifyInstanceCapacityReservationAttributesFlow(parallelism)
      )

  def modifyInstanceCapacityReservationAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyInstanceCapacityReservationAttributesRequest,
          ModifyInstanceCapacityReservationAttributesResponse,
          NotUsed] =
    Flow[ModifyInstanceCapacityReservationAttributesRequest].mapAsync(parallelism) {
      modifyInstanceCapacityReservationAttributesRequest =>
        underlying.modifyInstanceCapacityReservationAttributes(modifyInstanceCapacityReservationAttributesRequest)
    }

  def modifyInstanceCreditSpecificationSource(
      modifyInstanceCreditSpecificationRequest: ModifyInstanceCreditSpecificationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyInstanceCreditSpecificationResponse, NotUsed] =
    Source.single(modifyInstanceCreditSpecificationRequest).via(modifyInstanceCreditSpecificationFlow(parallelism))

  def modifyInstanceCreditSpecificationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyInstanceCreditSpecificationRequest, ModifyInstanceCreditSpecificationResponse, NotUsed] =
    Flow[ModifyInstanceCreditSpecificationRequest].mapAsync(parallelism) { modifyInstanceCreditSpecificationRequest =>
      underlying.modifyInstanceCreditSpecification(modifyInstanceCreditSpecificationRequest)
    }

  def modifyInstanceEventStartTimeSource(
      modifyInstanceEventStartTimeRequest: ModifyInstanceEventStartTimeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyInstanceEventStartTimeResponse, NotUsed] =
    Source.single(modifyInstanceEventStartTimeRequest).via(modifyInstanceEventStartTimeFlow(parallelism))

  def modifyInstanceEventStartTimeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyInstanceEventStartTimeRequest, ModifyInstanceEventStartTimeResponse, NotUsed] =
    Flow[ModifyInstanceEventStartTimeRequest].mapAsync(parallelism) { modifyInstanceEventStartTimeRequest =>
      underlying.modifyInstanceEventStartTime(modifyInstanceEventStartTimeRequest)
    }

  def modifyInstancePlacementSource(
      modifyInstancePlacementRequest: ModifyInstancePlacementRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyInstancePlacementResponse, NotUsed] =
    Source.single(modifyInstancePlacementRequest).via(modifyInstancePlacementFlow(parallelism))

  def modifyInstancePlacementFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyInstancePlacementRequest, ModifyInstancePlacementResponse, NotUsed] =
    Flow[ModifyInstancePlacementRequest].mapAsync(parallelism) { modifyInstancePlacementRequest =>
      underlying.modifyInstancePlacement(modifyInstancePlacementRequest)
    }

  def modifyLaunchTemplateSource(modifyLaunchTemplateRequest: ModifyLaunchTemplateRequest,
                                 parallelism: Int = DefaultParallelism): Source[ModifyLaunchTemplateResponse, NotUsed] =
    Source.single(modifyLaunchTemplateRequest).via(modifyLaunchTemplateFlow(parallelism))

  def modifyLaunchTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyLaunchTemplateRequest, ModifyLaunchTemplateResponse, NotUsed] =
    Flow[ModifyLaunchTemplateRequest].mapAsync(parallelism) { modifyLaunchTemplateRequest =>
      underlying.modifyLaunchTemplate(modifyLaunchTemplateRequest)
    }

  def modifyNetworkInterfaceAttributeSource(
      modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyNetworkInterfaceAttributeResponse, NotUsed] =
    Source.single(modifyNetworkInterfaceAttributeRequest).via(modifyNetworkInterfaceAttributeFlow(parallelism))

  def modifyNetworkInterfaceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResponse, NotUsed] =
    Flow[ModifyNetworkInterfaceAttributeRequest].mapAsync(parallelism) { modifyNetworkInterfaceAttributeRequest =>
      underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest)
    }

  def modifyReservedInstancesSource(
      modifyReservedInstancesRequest: ModifyReservedInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyReservedInstancesResponse, NotUsed] =
    Source.single(modifyReservedInstancesRequest).via(modifyReservedInstancesFlow(parallelism))

  def modifyReservedInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyReservedInstancesRequest, ModifyReservedInstancesResponse, NotUsed] =
    Flow[ModifyReservedInstancesRequest].mapAsync(parallelism) { modifyReservedInstancesRequest =>
      underlying.modifyReservedInstances(modifyReservedInstancesRequest)
    }

  def modifySnapshotAttributeSource(
      modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifySnapshotAttributeResponse, NotUsed] =
    Source.single(modifySnapshotAttributeRequest).via(modifySnapshotAttributeFlow(parallelism))

  def modifySnapshotAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifySnapshotAttributeRequest, ModifySnapshotAttributeResponse, NotUsed] =
    Flow[ModifySnapshotAttributeRequest].mapAsync(parallelism) { modifySnapshotAttributeRequest =>
      underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest)
    }

  def modifySpotFleetRequestSource(
      modifySpotFleetRequestRequest: ModifySpotFleetRequestRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifySpotFleetRequestResponse, NotUsed] =
    Source.single(modifySpotFleetRequestRequest).via(modifySpotFleetRequestFlow(parallelism))

  def modifySpotFleetRequestFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifySpotFleetRequestRequest, ModifySpotFleetRequestResponse, NotUsed] =
    Flow[ModifySpotFleetRequestRequest].mapAsync(parallelism) { modifySpotFleetRequestRequest =>
      underlying.modifySpotFleetRequest(modifySpotFleetRequestRequest)
    }

  def modifySubnetAttributeSource(
      modifySubnetAttributeRequest: ModifySubnetAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifySubnetAttributeResponse, NotUsed] =
    Source.single(modifySubnetAttributeRequest).via(modifySubnetAttributeFlow(parallelism))

  def modifySubnetAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifySubnetAttributeRequest, ModifySubnetAttributeResponse, NotUsed] =
    Flow[ModifySubnetAttributeRequest].mapAsync(parallelism) { modifySubnetAttributeRequest =>
      underlying.modifySubnetAttribute(modifySubnetAttributeRequest)
    }

  def modifyTransitGatewayVpcAttachmentSource(
      modifyTransitGatewayVpcAttachmentRequest: ModifyTransitGatewayVpcAttachmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyTransitGatewayVpcAttachmentResponse, NotUsed] =
    Source.single(modifyTransitGatewayVpcAttachmentRequest).via(modifyTransitGatewayVpcAttachmentFlow(parallelism))

  def modifyTransitGatewayVpcAttachmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyTransitGatewayVpcAttachmentRequest, ModifyTransitGatewayVpcAttachmentResponse, NotUsed] =
    Flow[ModifyTransitGatewayVpcAttachmentRequest].mapAsync(parallelism) { modifyTransitGatewayVpcAttachmentRequest =>
      underlying.modifyTransitGatewayVpcAttachment(modifyTransitGatewayVpcAttachmentRequest)
    }

  def modifyVolumeSource(modifyVolumeRequest: ModifyVolumeRequest,
                         parallelism: Int = DefaultParallelism): Source[ModifyVolumeResponse, NotUsed] =
    Source.single(modifyVolumeRequest).via(modifyVolumeFlow(parallelism))

  def modifyVolumeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVolumeRequest, ModifyVolumeResponse, NotUsed] =
    Flow[ModifyVolumeRequest].mapAsync(parallelism) { modifyVolumeRequest =>
      underlying.modifyVolume(modifyVolumeRequest)
    }

  def modifyVolumeAttributeSource(
      modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyVolumeAttributeResponse, NotUsed] =
    Source.single(modifyVolumeAttributeRequest).via(modifyVolumeAttributeFlow(parallelism))

  def modifyVolumeAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVolumeAttributeRequest, ModifyVolumeAttributeResponse, NotUsed] =
    Flow[ModifyVolumeAttributeRequest].mapAsync(parallelism) { modifyVolumeAttributeRequest =>
      underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest)
    }

  def modifyVpcAttributeSource(modifyVpcAttributeRequest: ModifyVpcAttributeRequest,
                               parallelism: Int = DefaultParallelism): Source[ModifyVpcAttributeResponse, NotUsed] =
    Source.single(modifyVpcAttributeRequest).via(modifyVpcAttributeFlow(parallelism))

  def modifyVpcAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcAttributeRequest, ModifyVpcAttributeResponse, NotUsed] =
    Flow[ModifyVpcAttributeRequest].mapAsync(parallelism) { modifyVpcAttributeRequest =>
      underlying.modifyVpcAttribute(modifyVpcAttributeRequest)
    }

  def modifyVpcEndpointSource(modifyVpcEndpointRequest: ModifyVpcEndpointRequest,
                              parallelism: Int = DefaultParallelism): Source[ModifyVpcEndpointResponse, NotUsed] =
    Source.single(modifyVpcEndpointRequest).via(modifyVpcEndpointFlow(parallelism))

  def modifyVpcEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcEndpointRequest, ModifyVpcEndpointResponse, NotUsed] =
    Flow[ModifyVpcEndpointRequest].mapAsync(parallelism) { modifyVpcEndpointRequest =>
      underlying.modifyVpcEndpoint(modifyVpcEndpointRequest)
    }

  def modifyVpcEndpointConnectionNotificationSource(
      modifyVpcEndpointConnectionNotificationRequest: ModifyVpcEndpointConnectionNotificationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyVpcEndpointConnectionNotificationResponse, NotUsed] =
    Source
      .single(modifyVpcEndpointConnectionNotificationRequest).via(
        modifyVpcEndpointConnectionNotificationFlow(parallelism)
      )

  def modifyVpcEndpointConnectionNotificationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcEndpointConnectionNotificationRequest, ModifyVpcEndpointConnectionNotificationResponse, NotUsed] =
    Flow[ModifyVpcEndpointConnectionNotificationRequest].mapAsync(parallelism) {
      modifyVpcEndpointConnectionNotificationRequest =>
        underlying.modifyVpcEndpointConnectionNotification(modifyVpcEndpointConnectionNotificationRequest)
    }

  def modifyVpcEndpointServiceConfigurationSource(
      modifyVpcEndpointServiceConfigurationRequest: ModifyVpcEndpointServiceConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyVpcEndpointServiceConfigurationResponse, NotUsed] =
    Source
      .single(modifyVpcEndpointServiceConfigurationRequest).via(modifyVpcEndpointServiceConfigurationFlow(parallelism))

  def modifyVpcEndpointServiceConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcEndpointServiceConfigurationRequest, ModifyVpcEndpointServiceConfigurationResponse, NotUsed] =
    Flow[ModifyVpcEndpointServiceConfigurationRequest].mapAsync(parallelism) {
      modifyVpcEndpointServiceConfigurationRequest =>
        underlying.modifyVpcEndpointServiceConfiguration(modifyVpcEndpointServiceConfigurationRequest)
    }

  def modifyVpcEndpointServicePermissionsSource(
      modifyVpcEndpointServicePermissionsRequest: ModifyVpcEndpointServicePermissionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyVpcEndpointServicePermissionsResponse, NotUsed] =
    Source.single(modifyVpcEndpointServicePermissionsRequest).via(modifyVpcEndpointServicePermissionsFlow(parallelism))

  def modifyVpcEndpointServicePermissionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcEndpointServicePermissionsRequest, ModifyVpcEndpointServicePermissionsResponse, NotUsed] =
    Flow[ModifyVpcEndpointServicePermissionsRequest].mapAsync(parallelism) {
      modifyVpcEndpointServicePermissionsRequest =>
        underlying.modifyVpcEndpointServicePermissions(modifyVpcEndpointServicePermissionsRequest)
    }

  def modifyVpcPeeringConnectionOptionsSource(
      modifyVpcPeeringConnectionOptionsRequest: ModifyVpcPeeringConnectionOptionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ModifyVpcPeeringConnectionOptionsResponse, NotUsed] =
    Source.single(modifyVpcPeeringConnectionOptionsRequest).via(modifyVpcPeeringConnectionOptionsFlow(parallelism))

  def modifyVpcPeeringConnectionOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResponse, NotUsed] =
    Flow[ModifyVpcPeeringConnectionOptionsRequest].mapAsync(parallelism) { modifyVpcPeeringConnectionOptionsRequest =>
      underlying.modifyVpcPeeringConnectionOptions(modifyVpcPeeringConnectionOptionsRequest)
    }

  def modifyVpcTenancySource(modifyVpcTenancyRequest: ModifyVpcTenancyRequest,
                             parallelism: Int = DefaultParallelism): Source[ModifyVpcTenancyResponse, NotUsed] =
    Source.single(modifyVpcTenancyRequest).via(modifyVpcTenancyFlow(parallelism))

  def modifyVpcTenancyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ModifyVpcTenancyRequest, ModifyVpcTenancyResponse, NotUsed] =
    Flow[ModifyVpcTenancyRequest].mapAsync(parallelism) { modifyVpcTenancyRequest =>
      underlying.modifyVpcTenancy(modifyVpcTenancyRequest)
    }

  def monitorInstancesSource(monitorInstancesRequest: MonitorInstancesRequest,
                             parallelism: Int = DefaultParallelism): Source[MonitorInstancesResponse, NotUsed] =
    Source.single(monitorInstancesRequest).via(monitorInstancesFlow(parallelism))

  def monitorInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[MonitorInstancesRequest, MonitorInstancesResponse, NotUsed] =
    Flow[MonitorInstancesRequest].mapAsync(parallelism) { monitorInstancesRequest =>
      underlying.monitorInstances(monitorInstancesRequest)
    }

  def moveAddressToVpcSource(moveAddressToVpcRequest: MoveAddressToVpcRequest,
                             parallelism: Int = DefaultParallelism): Source[MoveAddressToVpcResponse, NotUsed] =
    Source.single(moveAddressToVpcRequest).via(moveAddressToVpcFlow(parallelism))

  def moveAddressToVpcFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[MoveAddressToVpcRequest, MoveAddressToVpcResponse, NotUsed] =
    Flow[MoveAddressToVpcRequest].mapAsync(parallelism) { moveAddressToVpcRequest =>
      underlying.moveAddressToVpc(moveAddressToVpcRequest)
    }

  def provisionByoipCidrSource(provisionByoipCidrRequest: ProvisionByoipCidrRequest,
                               parallelism: Int = DefaultParallelism): Source[ProvisionByoipCidrResponse, NotUsed] =
    Source.single(provisionByoipCidrRequest).via(provisionByoipCidrFlow(parallelism))

  def provisionByoipCidrFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ProvisionByoipCidrRequest, ProvisionByoipCidrResponse, NotUsed] =
    Flow[ProvisionByoipCidrRequest].mapAsync(parallelism) { provisionByoipCidrRequest =>
      underlying.provisionByoipCidr(provisionByoipCidrRequest)
    }

  def purchaseHostReservationSource(
      purchaseHostReservationRequest: PurchaseHostReservationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PurchaseHostReservationResponse, NotUsed] =
    Source.single(purchaseHostReservationRequest).via(purchaseHostReservationFlow(parallelism))

  def purchaseHostReservationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PurchaseHostReservationRequest, PurchaseHostReservationResponse, NotUsed] =
    Flow[PurchaseHostReservationRequest].mapAsync(parallelism) { purchaseHostReservationRequest =>
      underlying.purchaseHostReservation(purchaseHostReservationRequest)
    }

  def purchaseReservedInstancesOfferingSource(
      purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PurchaseReservedInstancesOfferingResponse, NotUsed] =
    Source.single(purchaseReservedInstancesOfferingRequest).via(purchaseReservedInstancesOfferingFlow(parallelism))

  def purchaseReservedInstancesOfferingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResponse, NotUsed] =
    Flow[PurchaseReservedInstancesOfferingRequest].mapAsync(parallelism) { purchaseReservedInstancesOfferingRequest =>
      underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest)
    }

  def purchaseScheduledInstancesSource(
      purchaseScheduledInstancesRequest: PurchaseScheduledInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PurchaseScheduledInstancesResponse, NotUsed] =
    Source.single(purchaseScheduledInstancesRequest).via(purchaseScheduledInstancesFlow(parallelism))

  def purchaseScheduledInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResponse, NotUsed] =
    Flow[PurchaseScheduledInstancesRequest].mapAsync(parallelism) { purchaseScheduledInstancesRequest =>
      underlying.purchaseScheduledInstances(purchaseScheduledInstancesRequest)
    }

  def rebootInstancesSource(rebootInstancesRequest: RebootInstancesRequest,
                            parallelism: Int = DefaultParallelism): Source[RebootInstancesResponse, NotUsed] =
    Source.single(rebootInstancesRequest).via(rebootInstancesFlow(parallelism))

  def rebootInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RebootInstancesRequest, RebootInstancesResponse, NotUsed] =
    Flow[RebootInstancesRequest].mapAsync(parallelism) { rebootInstancesRequest =>
      underlying.rebootInstances(rebootInstancesRequest)
    }

  def registerImageSource(registerImageRequest: RegisterImageRequest,
                          parallelism: Int = DefaultParallelism): Source[RegisterImageResponse, NotUsed] =
    Source.single(registerImageRequest).via(registerImageFlow(parallelism))

  def registerImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RegisterImageRequest, RegisterImageResponse, NotUsed] =
    Flow[RegisterImageRequest].mapAsync(parallelism) { registerImageRequest =>
      underlying.registerImage(registerImageRequest)
    }

  def rejectTransitGatewayVpcAttachmentSource(
      rejectTransitGatewayVpcAttachmentRequest: RejectTransitGatewayVpcAttachmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RejectTransitGatewayVpcAttachmentResponse, NotUsed] =
    Source.single(rejectTransitGatewayVpcAttachmentRequest).via(rejectTransitGatewayVpcAttachmentFlow(parallelism))

  def rejectTransitGatewayVpcAttachmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RejectTransitGatewayVpcAttachmentRequest, RejectTransitGatewayVpcAttachmentResponse, NotUsed] =
    Flow[RejectTransitGatewayVpcAttachmentRequest].mapAsync(parallelism) { rejectTransitGatewayVpcAttachmentRequest =>
      underlying.rejectTransitGatewayVpcAttachment(rejectTransitGatewayVpcAttachmentRequest)
    }

  def rejectVpcEndpointConnectionsSource(
      rejectVpcEndpointConnectionsRequest: RejectVpcEndpointConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RejectVpcEndpointConnectionsResponse, NotUsed] =
    Source.single(rejectVpcEndpointConnectionsRequest).via(rejectVpcEndpointConnectionsFlow(parallelism))

  def rejectVpcEndpointConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RejectVpcEndpointConnectionsRequest, RejectVpcEndpointConnectionsResponse, NotUsed] =
    Flow[RejectVpcEndpointConnectionsRequest].mapAsync(parallelism) { rejectVpcEndpointConnectionsRequest =>
      underlying.rejectVpcEndpointConnections(rejectVpcEndpointConnectionsRequest)
    }

  def rejectVpcPeeringConnectionSource(
      rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RejectVpcPeeringConnectionResponse, NotUsed] =
    Source.single(rejectVpcPeeringConnectionRequest).via(rejectVpcPeeringConnectionFlow(parallelism))

  def rejectVpcPeeringConnectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResponse, NotUsed] =
    Flow[RejectVpcPeeringConnectionRequest].mapAsync(parallelism) { rejectVpcPeeringConnectionRequest =>
      underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest)
    }

  def releaseAddressSource(releaseAddressRequest: ReleaseAddressRequest,
                           parallelism: Int = DefaultParallelism): Source[ReleaseAddressResponse, NotUsed] =
    Source.single(releaseAddressRequest).via(releaseAddressFlow(parallelism))

  def releaseAddressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReleaseAddressRequest, ReleaseAddressResponse, NotUsed] =
    Flow[ReleaseAddressRequest].mapAsync(parallelism) { releaseAddressRequest =>
      underlying.releaseAddress(releaseAddressRequest)
    }

  def releaseHostsSource(releaseHostsRequest: ReleaseHostsRequest,
                         parallelism: Int = DefaultParallelism): Source[ReleaseHostsResponse, NotUsed] =
    Source.single(releaseHostsRequest).via(releaseHostsFlow(parallelism))

  def releaseHostsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReleaseHostsRequest, ReleaseHostsResponse, NotUsed] =
    Flow[ReleaseHostsRequest].mapAsync(parallelism) { releaseHostsRequest =>
      underlying.releaseHosts(releaseHostsRequest)
    }

  def replaceIamInstanceProfileAssociationSource(
      replaceIamInstanceProfileAssociationRequest: ReplaceIamInstanceProfileAssociationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReplaceIamInstanceProfileAssociationResponse, NotUsed] =
    Source
      .single(replaceIamInstanceProfileAssociationRequest).via(replaceIamInstanceProfileAssociationFlow(parallelism))

  def replaceIamInstanceProfileAssociationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceIamInstanceProfileAssociationRequest, ReplaceIamInstanceProfileAssociationResponse, NotUsed] =
    Flow[ReplaceIamInstanceProfileAssociationRequest].mapAsync(parallelism) {
      replaceIamInstanceProfileAssociationRequest =>
        underlying.replaceIamInstanceProfileAssociation(replaceIamInstanceProfileAssociationRequest)
    }

  def replaceNetworkAclAssociationSource(
      replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReplaceNetworkAclAssociationResponse, NotUsed] =
    Source.single(replaceNetworkAclAssociationRequest).via(replaceNetworkAclAssociationFlow(parallelism))

  def replaceNetworkAclAssociationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResponse, NotUsed] =
    Flow[ReplaceNetworkAclAssociationRequest].mapAsync(parallelism) { replaceNetworkAclAssociationRequest =>
      underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest)
    }

  def replaceNetworkAclEntrySource(
      replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReplaceNetworkAclEntryResponse, NotUsed] =
    Source.single(replaceNetworkAclEntryRequest).via(replaceNetworkAclEntryFlow(parallelism))

  def replaceNetworkAclEntryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResponse, NotUsed] =
    Flow[ReplaceNetworkAclEntryRequest].mapAsync(parallelism) { replaceNetworkAclEntryRequest =>
      underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest)
    }

  def replaceRouteSource(replaceRouteRequest: ReplaceRouteRequest,
                         parallelism: Int = DefaultParallelism): Source[ReplaceRouteResponse, NotUsed] =
    Source.single(replaceRouteRequest).via(replaceRouteFlow(parallelism))

  def replaceRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceRouteRequest, ReplaceRouteResponse, NotUsed] =
    Flow[ReplaceRouteRequest].mapAsync(parallelism) { replaceRouteRequest =>
      underlying.replaceRoute(replaceRouteRequest)
    }

  def replaceRouteTableAssociationSource(
      replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReplaceRouteTableAssociationResponse, NotUsed] =
    Source.single(replaceRouteTableAssociationRequest).via(replaceRouteTableAssociationFlow(parallelism))

  def replaceRouteTableAssociationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResponse, NotUsed] =
    Flow[ReplaceRouteTableAssociationRequest].mapAsync(parallelism) { replaceRouteTableAssociationRequest =>
      underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest)
    }

  def replaceTransitGatewayRouteSource(
      replaceTransitGatewayRouteRequest: ReplaceTransitGatewayRouteRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReplaceTransitGatewayRouteResponse, NotUsed] =
    Source.single(replaceTransitGatewayRouteRequest).via(replaceTransitGatewayRouteFlow(parallelism))

  def replaceTransitGatewayRouteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReplaceTransitGatewayRouteRequest, ReplaceTransitGatewayRouteResponse, NotUsed] =
    Flow[ReplaceTransitGatewayRouteRequest].mapAsync(parallelism) { replaceTransitGatewayRouteRequest =>
      underlying.replaceTransitGatewayRoute(replaceTransitGatewayRouteRequest)
    }

  def reportInstanceStatusSource(reportInstanceStatusRequest: ReportInstanceStatusRequest,
                                 parallelism: Int = DefaultParallelism): Source[ReportInstanceStatusResponse, NotUsed] =
    Source.single(reportInstanceStatusRequest).via(reportInstanceStatusFlow(parallelism))

  def reportInstanceStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReportInstanceStatusRequest, ReportInstanceStatusResponse, NotUsed] =
    Flow[ReportInstanceStatusRequest].mapAsync(parallelism) { reportInstanceStatusRequest =>
      underlying.reportInstanceStatus(reportInstanceStatusRequest)
    }

  def requestSpotFleetSource(requestSpotFleetRequest: RequestSpotFleetRequest,
                             parallelism: Int = DefaultParallelism): Source[RequestSpotFleetResponse, NotUsed] =
    Source.single(requestSpotFleetRequest).via(requestSpotFleetFlow(parallelism))

  def requestSpotFleetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RequestSpotFleetRequest, RequestSpotFleetResponse, NotUsed] =
    Flow[RequestSpotFleetRequest].mapAsync(parallelism) { requestSpotFleetRequest =>
      underlying.requestSpotFleet(requestSpotFleetRequest)
    }

  def requestSpotInstancesSource(requestSpotInstancesRequest: RequestSpotInstancesRequest,
                                 parallelism: Int = DefaultParallelism): Source[RequestSpotInstancesResponse, NotUsed] =
    Source.single(requestSpotInstancesRequest).via(requestSpotInstancesFlow(parallelism))

  def requestSpotInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RequestSpotInstancesRequest, RequestSpotInstancesResponse, NotUsed] =
    Flow[RequestSpotInstancesRequest].mapAsync(parallelism) { requestSpotInstancesRequest =>
      underlying.requestSpotInstances(requestSpotInstancesRequest)
    }

  def resetFpgaImageAttributeSource(
      resetFpgaImageAttributeRequest: ResetFpgaImageAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResetFpgaImageAttributeResponse, NotUsed] =
    Source.single(resetFpgaImageAttributeRequest).via(resetFpgaImageAttributeFlow(parallelism))

  def resetFpgaImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ResetFpgaImageAttributeRequest, ResetFpgaImageAttributeResponse, NotUsed] =
    Flow[ResetFpgaImageAttributeRequest].mapAsync(parallelism) { resetFpgaImageAttributeRequest =>
      underlying.resetFpgaImageAttribute(resetFpgaImageAttributeRequest)
    }

  def resetImageAttributeSource(resetImageAttributeRequest: ResetImageAttributeRequest,
                                parallelism: Int = DefaultParallelism): Source[ResetImageAttributeResponse, NotUsed] =
    Source.single(resetImageAttributeRequest).via(resetImageAttributeFlow(parallelism))

  def resetImageAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ResetImageAttributeRequest, ResetImageAttributeResponse, NotUsed] =
    Flow[ResetImageAttributeRequest].mapAsync(parallelism) { resetImageAttributeRequest =>
      underlying.resetImageAttribute(resetImageAttributeRequest)
    }

  def resetInstanceAttributeSource(
      resetInstanceAttributeRequest: ResetInstanceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResetInstanceAttributeResponse, NotUsed] =
    Source.single(resetInstanceAttributeRequest).via(resetInstanceAttributeFlow(parallelism))

  def resetInstanceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ResetInstanceAttributeRequest, ResetInstanceAttributeResponse, NotUsed] =
    Flow[ResetInstanceAttributeRequest].mapAsync(parallelism) { resetInstanceAttributeRequest =>
      underlying.resetInstanceAttribute(resetInstanceAttributeRequest)
    }

  def resetNetworkInterfaceAttributeSource(
      resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResetNetworkInterfaceAttributeResponse, NotUsed] =
    Source.single(resetNetworkInterfaceAttributeRequest).via(resetNetworkInterfaceAttributeFlow(parallelism))

  def resetNetworkInterfaceAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResponse, NotUsed] =
    Flow[ResetNetworkInterfaceAttributeRequest].mapAsync(parallelism) { resetNetworkInterfaceAttributeRequest =>
      underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest)
    }

  def resetSnapshotAttributeSource(
      resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResetSnapshotAttributeResponse, NotUsed] =
    Source.single(resetSnapshotAttributeRequest).via(resetSnapshotAttributeFlow(parallelism))

  def resetSnapshotAttributeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ResetSnapshotAttributeRequest, ResetSnapshotAttributeResponse, NotUsed] =
    Flow[ResetSnapshotAttributeRequest].mapAsync(parallelism) { resetSnapshotAttributeRequest =>
      underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest)
    }

  def restoreAddressToClassicSource(
      restoreAddressToClassicRequest: RestoreAddressToClassicRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestoreAddressToClassicResponse, NotUsed] =
    Source.single(restoreAddressToClassicRequest).via(restoreAddressToClassicFlow(parallelism))

  def restoreAddressToClassicFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreAddressToClassicRequest, RestoreAddressToClassicResponse, NotUsed] =
    Flow[RestoreAddressToClassicRequest].mapAsync(parallelism) { restoreAddressToClassicRequest =>
      underlying.restoreAddressToClassic(restoreAddressToClassicRequest)
    }

  def revokeClientVpnIngressSource(
      revokeClientVpnIngressRequest: RevokeClientVpnIngressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RevokeClientVpnIngressResponse, NotUsed] =
    Source.single(revokeClientVpnIngressRequest).via(revokeClientVpnIngressFlow(parallelism))

  def revokeClientVpnIngressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RevokeClientVpnIngressRequest, RevokeClientVpnIngressResponse, NotUsed] =
    Flow[RevokeClientVpnIngressRequest].mapAsync(parallelism) { revokeClientVpnIngressRequest =>
      underlying.revokeClientVpnIngress(revokeClientVpnIngressRequest)
    }

  def revokeSecurityGroupEgressSource(
      revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RevokeSecurityGroupEgressResponse, NotUsed] =
    Source.single(revokeSecurityGroupEgressRequest).via(revokeSecurityGroupEgressFlow(parallelism))

  def revokeSecurityGroupEgressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResponse, NotUsed] =
    Flow[RevokeSecurityGroupEgressRequest].mapAsync(parallelism) { revokeSecurityGroupEgressRequest =>
      underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest)
    }

  def revokeSecurityGroupIngressSource(
      revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RevokeSecurityGroupIngressResponse, NotUsed] =
    Source.single(revokeSecurityGroupIngressRequest).via(revokeSecurityGroupIngressFlow(parallelism))

  def revokeSecurityGroupIngressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResponse, NotUsed] =
    Flow[RevokeSecurityGroupIngressRequest].mapAsync(parallelism) { revokeSecurityGroupIngressRequest =>
      underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest)
    }

  def runInstancesSource(runInstancesRequest: RunInstancesRequest,
                         parallelism: Int = DefaultParallelism): Source[RunInstancesResponse, NotUsed] =
    Source.single(runInstancesRequest).via(runInstancesFlow(parallelism))

  def runInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RunInstancesRequest, RunInstancesResponse, NotUsed] =
    Flow[RunInstancesRequest].mapAsync(parallelism) { runInstancesRequest =>
      underlying.runInstances(runInstancesRequest)
    }

  def runScheduledInstancesSource(
      runScheduledInstancesRequest: RunScheduledInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RunScheduledInstancesResponse, NotUsed] =
    Source.single(runScheduledInstancesRequest).via(runScheduledInstancesFlow(parallelism))

  def runScheduledInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RunScheduledInstancesRequest, RunScheduledInstancesResponse, NotUsed] =
    Flow[RunScheduledInstancesRequest].mapAsync(parallelism) { runScheduledInstancesRequest =>
      underlying.runScheduledInstances(runScheduledInstancesRequest)
    }

  def searchTransitGatewayRoutesSource(
      searchTransitGatewayRoutesRequest: SearchTransitGatewayRoutesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SearchTransitGatewayRoutesResponse, NotUsed] =
    Source.single(searchTransitGatewayRoutesRequest).via(searchTransitGatewayRoutesFlow(parallelism))

  def searchTransitGatewayRoutesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SearchTransitGatewayRoutesRequest, SearchTransitGatewayRoutesResponse, NotUsed] =
    Flow[SearchTransitGatewayRoutesRequest].mapAsync(parallelism) { searchTransitGatewayRoutesRequest =>
      underlying.searchTransitGatewayRoutes(searchTransitGatewayRoutesRequest)
    }

  def startInstancesSource(startInstancesRequest: StartInstancesRequest,
                           parallelism: Int = DefaultParallelism): Source[StartInstancesResponse, NotUsed] =
    Source.single(startInstancesRequest).via(startInstancesFlow(parallelism))

  def startInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartInstancesRequest, StartInstancesResponse, NotUsed] =
    Flow[StartInstancesRequest].mapAsync(parallelism) { startInstancesRequest =>
      underlying.startInstances(startInstancesRequest)
    }

  def stopInstancesSource(stopInstancesRequest: StopInstancesRequest,
                          parallelism: Int = DefaultParallelism): Source[StopInstancesResponse, NotUsed] =
    Source.single(stopInstancesRequest).via(stopInstancesFlow(parallelism))

  def stopInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StopInstancesRequest, StopInstancesResponse, NotUsed] =
    Flow[StopInstancesRequest].mapAsync(parallelism) { stopInstancesRequest =>
      underlying.stopInstances(stopInstancesRequest)
    }

  def terminateClientVpnConnectionsSource(
      terminateClientVpnConnectionsRequest: TerminateClientVpnConnectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TerminateClientVpnConnectionsResponse, NotUsed] =
    Source.single(terminateClientVpnConnectionsRequest).via(terminateClientVpnConnectionsFlow(parallelism))

  def terminateClientVpnConnectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TerminateClientVpnConnectionsRequest, TerminateClientVpnConnectionsResponse, NotUsed] =
    Flow[TerminateClientVpnConnectionsRequest].mapAsync(parallelism) { terminateClientVpnConnectionsRequest =>
      underlying.terminateClientVpnConnections(terminateClientVpnConnectionsRequest)
    }

  def terminateInstancesSource(terminateInstancesRequest: TerminateInstancesRequest,
                               parallelism: Int = DefaultParallelism): Source[TerminateInstancesResponse, NotUsed] =
    Source.single(terminateInstancesRequest).via(terminateInstancesFlow(parallelism))

  def terminateInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TerminateInstancesRequest, TerminateInstancesResponse, NotUsed] =
    Flow[TerminateInstancesRequest].mapAsync(parallelism) { terminateInstancesRequest =>
      underlying.terminateInstances(terminateInstancesRequest)
    }

  def unassignIpv6AddressesSource(
      unassignIpv6AddressesRequest: UnassignIpv6AddressesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UnassignIpv6AddressesResponse, NotUsed] =
    Source.single(unassignIpv6AddressesRequest).via(unassignIpv6AddressesFlow(parallelism))

  def unassignIpv6AddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UnassignIpv6AddressesRequest, UnassignIpv6AddressesResponse, NotUsed] =
    Flow[UnassignIpv6AddressesRequest].mapAsync(parallelism) { unassignIpv6AddressesRequest =>
      underlying.unassignIpv6Addresses(unassignIpv6AddressesRequest)
    }

  def unassignPrivateIpAddressesSource(
      unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UnassignPrivateIpAddressesResponse, NotUsed] =
    Source.single(unassignPrivateIpAddressesRequest).via(unassignPrivateIpAddressesFlow(parallelism))

  def unassignPrivateIpAddressesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResponse, NotUsed] =
    Flow[UnassignPrivateIpAddressesRequest].mapAsync(parallelism) { unassignPrivateIpAddressesRequest =>
      underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest)
    }

  def unmonitorInstancesSource(unmonitorInstancesRequest: UnmonitorInstancesRequest,
                               parallelism: Int = DefaultParallelism): Source[UnmonitorInstancesResponse, NotUsed] =
    Source.single(unmonitorInstancesRequest).via(unmonitorInstancesFlow(parallelism))

  def unmonitorInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UnmonitorInstancesRequest, UnmonitorInstancesResponse, NotUsed] =
    Flow[UnmonitorInstancesRequest].mapAsync(parallelism) { unmonitorInstancesRequest =>
      underlying.unmonitorInstances(unmonitorInstancesRequest)
    }

  def updateSecurityGroupRuleDescriptionsEgressSource(
      updateSecurityGroupRuleDescriptionsEgressRequest: UpdateSecurityGroupRuleDescriptionsEgressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateSecurityGroupRuleDescriptionsEgressResponse, NotUsed] =
    Source
      .single(updateSecurityGroupRuleDescriptionsEgressRequest).via(
        updateSecurityGroupRuleDescriptionsEgressFlow(parallelism)
      )

  def updateSecurityGroupRuleDescriptionsEgressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateSecurityGroupRuleDescriptionsEgressRequest,
          UpdateSecurityGroupRuleDescriptionsEgressResponse,
          NotUsed] =
    Flow[UpdateSecurityGroupRuleDescriptionsEgressRequest].mapAsync(parallelism) {
      updateSecurityGroupRuleDescriptionsEgressRequest =>
        underlying.updateSecurityGroupRuleDescriptionsEgress(updateSecurityGroupRuleDescriptionsEgressRequest)
    }

  def updateSecurityGroupRuleDescriptionsIngressSource(
      updateSecurityGroupRuleDescriptionsIngressRequest: UpdateSecurityGroupRuleDescriptionsIngressRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateSecurityGroupRuleDescriptionsIngressResponse, NotUsed] =
    Source
      .single(updateSecurityGroupRuleDescriptionsIngressRequest).via(
        updateSecurityGroupRuleDescriptionsIngressFlow(parallelism)
      )

  def updateSecurityGroupRuleDescriptionsIngressFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateSecurityGroupRuleDescriptionsIngressRequest,
          UpdateSecurityGroupRuleDescriptionsIngressResponse,
          NotUsed] =
    Flow[UpdateSecurityGroupRuleDescriptionsIngressRequest].mapAsync(parallelism) {
      updateSecurityGroupRuleDescriptionsIngressRequest =>
        underlying.updateSecurityGroupRuleDescriptionsIngress(updateSecurityGroupRuleDescriptionsIngressRequest)
    }

  def withdrawByoipCidrSource(withdrawByoipCidrRequest: WithdrawByoipCidrRequest,
                              parallelism: Int = DefaultParallelism): Source[WithdrawByoipCidrResponse, NotUsed] =
    Source.single(withdrawByoipCidrRequest).via(withdrawByoipCidrFlow(parallelism))

  def withdrawByoipCidrFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[WithdrawByoipCidrRequest, WithdrawByoipCidrResponse, NotUsed] =
    Flow[WithdrawByoipCidrRequest].mapAsync(parallelism) { withdrawByoipCidrRequest =>
      underlying.withdrawByoipCidr(withdrawByoipCidrRequest)
    }

}
