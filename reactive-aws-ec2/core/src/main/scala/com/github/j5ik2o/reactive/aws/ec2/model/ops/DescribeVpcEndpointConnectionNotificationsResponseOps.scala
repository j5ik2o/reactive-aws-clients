// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionNotificationsResponseBuilderOps(
    val self: DescribeVpcEndpointConnectionNotificationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationSetAsScala(
      value: Option[Seq[ConnectionNotification]]
  ): DescribeVpcEndpointConnectionNotificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connectionNotificationSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionNotificationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointConnectionNotificationsResponseOps(
    val self: DescribeVpcEndpointConnectionNotificationsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationSetAsScala: Option[Seq[ConnectionNotification]] =
    Option(self.connectionNotificationSet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
