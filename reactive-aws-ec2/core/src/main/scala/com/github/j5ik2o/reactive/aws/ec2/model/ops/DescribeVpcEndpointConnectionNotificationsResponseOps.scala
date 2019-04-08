// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionNotificationsResponseBuilderOps(
    val self: DescribeVpcEndpointConnectionNotificationsResponse.Builder
) extends AnyVal {

  final def connectionNotificationSetAsScala(
      value: Option[Seq[ConnectionNotification]]
  ): DescribeVpcEndpointConnectionNotificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.connectionNotificationSet(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionNotificationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointConnectionNotificationsResponseOps(
    val self: DescribeVpcEndpointConnectionNotificationsResponse
) extends AnyVal {

  final def connectionNotificationSetAsScala: Option[Seq[ConnectionNotification]] =
    Option(self.connectionNotificationSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointConnectionNotificationsResponseOps {

  implicit def toDescribeVpcEndpointConnectionNotificationsResponseBuilderOps(
      v: DescribeVpcEndpointConnectionNotificationsResponse.Builder
  ): DescribeVpcEndpointConnectionNotificationsResponseBuilderOps =
    new DescribeVpcEndpointConnectionNotificationsResponseBuilderOps(v)

  implicit def toDescribeVpcEndpointConnectionNotificationsResponseOps(
      v: DescribeVpcEndpointConnectionNotificationsResponse
  ): DescribeVpcEndpointConnectionNotificationsResponseOps =
    new DescribeVpcEndpointConnectionNotificationsResponseOps(v)

}
