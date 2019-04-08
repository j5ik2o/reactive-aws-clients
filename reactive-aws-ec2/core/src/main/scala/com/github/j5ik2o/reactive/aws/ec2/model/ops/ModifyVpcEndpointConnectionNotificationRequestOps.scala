// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointConnectionNotificationRequestBuilderOps(
    val self: ModifyVpcEndpointConnectionNotificationRequest.Builder
) extends AnyVal {

  final def connectionNotificationIdAsScala(
      value: Option[String]
  ): ModifyVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationId(v)
    }
  }

  final def connectionNotificationArnAsScala(
      value: Option[String]
  ): ModifyVpcEndpointConnectionNotificationRequest.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationArn(v)
    }
  }

  final def connectionEventsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointConnectionNotificationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.connectionEvents(v.asJava)
    }
  }

}

final class ModifyVpcEndpointConnectionNotificationRequestOps(val self: ModifyVpcEndpointConnectionNotificationRequest)
    extends AnyVal {

  final def connectionNotificationIdAsScala: Option[String] = Option(self.connectionNotificationId)

  final def connectionNotificationArnAsScala: Option[String] = Option(self.connectionNotificationArn)

  final def connectionEventsAsScala: Option[Seq[String]] = Option(self.connectionEvents).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointConnectionNotificationRequestOps {

  implicit def toModifyVpcEndpointConnectionNotificationRequestBuilderOps(
      v: ModifyVpcEndpointConnectionNotificationRequest.Builder
  ): ModifyVpcEndpointConnectionNotificationRequestBuilderOps =
    new ModifyVpcEndpointConnectionNotificationRequestBuilderOps(v)

  implicit def toModifyVpcEndpointConnectionNotificationRequestOps(
      v: ModifyVpcEndpointConnectionNotificationRequest
  ): ModifyVpcEndpointConnectionNotificationRequestOps = new ModifyVpcEndpointConnectionNotificationRequestOps(v)

}
