// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastDomainBuilderOps(val self: TransitGatewayMulticastDomain.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(value: Option[String]): TransitGatewayMulticastDomain.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayMulticastDomain.Builder = {
    value.fold(self) { v => self.transitGatewayId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayMulticastDomainState]): TransitGatewayMulticastDomain.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayMulticastDomain.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayMulticastDomain.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayMulticastDomainOps(val self: TransitGatewayMulticastDomain) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayMulticastDomainState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastDomainOps {

  implicit def toTransitGatewayMulticastDomainBuilderOps(
      v: TransitGatewayMulticastDomain.Builder
  ): TransitGatewayMulticastDomainBuilderOps = new TransitGatewayMulticastDomainBuilderOps(v)

  implicit def toTransitGatewayMulticastDomainOps(v: TransitGatewayMulticastDomain): TransitGatewayMulticastDomainOps =
    new TransitGatewayMulticastDomainOps(v)

}
