// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayAttachmentPropagationsResponseBuilderOps(val self: GetTransitGatewayAttachmentPropagationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentPropagationsAsScala(value: Option[Seq[TransitGatewayAttachmentPropagation]]): GetTransitGatewayAttachmentPropagationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayAttachmentPropagations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetTransitGatewayAttachmentPropagationsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetTransitGatewayAttachmentPropagationsResponseOps(val self: GetTransitGatewayAttachmentPropagationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def transitGatewayAttachmentPropagationsAsScala: Option[Seq[TransitGatewayAttachmentPropagation]] = Option(self.transitGatewayAttachmentPropagations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayAttachmentPropagationsResponseOps {

implicit def toGetTransitGatewayAttachmentPropagationsResponseBuilderOps(v: GetTransitGatewayAttachmentPropagationsResponse.Builder): GetTransitGatewayAttachmentPropagationsResponseBuilderOps = new GetTransitGatewayAttachmentPropagationsResponseBuilderOps(v)

implicit def toGetTransitGatewayAttachmentPropagationsResponseOps(v: GetTransitGatewayAttachmentPropagationsResponse): GetTransitGatewayAttachmentPropagationsResponseOps = new GetTransitGatewayAttachmentPropagationsResponseOps(v)

}

