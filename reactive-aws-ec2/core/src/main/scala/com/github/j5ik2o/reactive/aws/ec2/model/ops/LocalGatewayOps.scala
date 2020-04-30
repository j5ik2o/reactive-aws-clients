// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayBuilderOps(val self: LocalGateway.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayIdAsScala(value: Option[String]): LocalGateway.Builder = {
            value.fold(self){ v => self.localGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def outpostArnAsScala(value: Option[String]): LocalGateway.Builder = {
            value.fold(self){ v => self.outpostArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala(value: Option[String]): LocalGateway.Builder = {
            value.fold(self){ v => self.ownerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[String]): LocalGateway.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): LocalGateway.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class LocalGatewayOps(val self: LocalGateway) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def outpostArnAsScala: Option[String] = Option(self.outpostArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala: Option[String] = Option(self.ownerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[String] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayOps {

implicit def toLocalGatewayBuilderOps(v: LocalGateway.Builder): LocalGatewayBuilderOps = new LocalGatewayBuilderOps(v)

implicit def toLocalGatewayOps(v: LocalGateway): LocalGatewayOps = new LocalGatewayOps(v)

}

