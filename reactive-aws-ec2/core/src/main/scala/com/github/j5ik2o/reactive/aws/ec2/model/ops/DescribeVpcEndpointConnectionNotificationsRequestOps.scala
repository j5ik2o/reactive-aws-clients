// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionNotificationsRequestBuilderOps(
    val self: DescribeVpcEndpointConnectionNotificationsRequest.Builder
) extends AnyVal {

  final def connectionNotificationIdAsScala(
      value: Option[String]
  ): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointConnectionNotificationsRequestOps(
    val self: DescribeVpcEndpointConnectionNotificationsRequest
) extends AnyVal {

  final def connectionNotificationIdAsScala: Option[String] = Option(self.connectionNotificationId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointConnectionNotificationsRequestOps {

  implicit def toDescribeVpcEndpointConnectionNotificationsRequestBuilderOps(
      v: DescribeVpcEndpointConnectionNotificationsRequest.Builder
  ): DescribeVpcEndpointConnectionNotificationsRequestBuilderOps =
    new DescribeVpcEndpointConnectionNotificationsRequestBuilderOps(v)

  implicit def toDescribeVpcEndpointConnectionNotificationsRequestOps(
      v: DescribeVpcEndpointConnectionNotificationsRequest
  ): DescribeVpcEndpointConnectionNotificationsRequestOps = new DescribeVpcEndpointConnectionNotificationsRequestOps(v)

}
