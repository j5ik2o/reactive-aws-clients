// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointConnectionNotificationRequestBuilderOps(
    val self: CreateVpcEndpointConnectionNotificationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): CreateVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v => self.serviceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdAsScala(value: Option[String]): CreateVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v => self.vpcEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationArnAsScala(
      value: Option[String]
  ): CreateVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v => self.connectionNotificationArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEventsAsScala(
      value: Option[Seq[String]]
  ): CreateVpcEndpointConnectionNotificationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connectionEvents(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateVpcEndpointConnectionNotificationRequestOps(val self: CreateVpcEndpointConnectionNotificationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationArnAsScala: Option[String] = Option(self.connectionNotificationArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEventsAsScala: Option[Seq[String]] =
    Option(self.connectionEvents).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointConnectionNotificationRequestOps {

  implicit def toCreateVpcEndpointConnectionNotificationRequestBuilderOps(
      v: CreateVpcEndpointConnectionNotificationRequest.Builder
  ): CreateVpcEndpointConnectionNotificationRequestBuilderOps =
    new CreateVpcEndpointConnectionNotificationRequestBuilderOps(v)

  implicit def toCreateVpcEndpointConnectionNotificationRequestOps(
      v: CreateVpcEndpointConnectionNotificationRequest
  ): CreateVpcEndpointConnectionNotificationRequestOps = new CreateVpcEndpointConnectionNotificationRequestOps(v)

}
