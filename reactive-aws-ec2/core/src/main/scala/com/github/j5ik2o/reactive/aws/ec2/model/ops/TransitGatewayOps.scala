// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayBuilderOps(val self: TransitGateway.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v => self.transitGatewayId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayArnAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v => self.transitGatewayArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayState]): TransitGateway.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGateway.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[TransitGatewayOptions]): TransitGateway.Builder = {
    value.fold(self) { v => self.options(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayOps(val self: TransitGateway) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayArnAsScala: Option[String] = Option(self.transitGatewayArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[TransitGatewayOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayOps {

  implicit def toTransitGatewayBuilderOps(v: TransitGateway.Builder): TransitGatewayBuilderOps =
    new TransitGatewayBuilderOps(v)

  implicit def toTransitGatewayOps(v: TransitGateway): TransitGatewayOps = new TransitGatewayOps(v)

}
