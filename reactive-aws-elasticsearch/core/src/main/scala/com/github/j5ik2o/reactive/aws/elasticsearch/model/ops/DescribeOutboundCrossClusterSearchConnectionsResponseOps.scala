// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeOutboundCrossClusterSearchConnectionsResponseBuilderOps(
    val self: DescribeOutboundCrossClusterSearchConnectionsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionsAsScala(
      value: Option[Seq[OutboundCrossClusterSearchConnection]]
  ): DescribeOutboundCrossClusterSearchConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.crossClusterSearchConnections(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeOutboundCrossClusterSearchConnectionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeOutboundCrossClusterSearchConnectionsResponseOps(
    val self: DescribeOutboundCrossClusterSearchConnectionsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionsAsScala: Option[Seq[OutboundCrossClusterSearchConnection]] =
    Option(self.crossClusterSearchConnections).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeOutboundCrossClusterSearchConnectionsResponseOps {

  implicit def toDescribeOutboundCrossClusterSearchConnectionsResponseBuilderOps(
      v: DescribeOutboundCrossClusterSearchConnectionsResponse.Builder
  ): DescribeOutboundCrossClusterSearchConnectionsResponseBuilderOps =
    new DescribeOutboundCrossClusterSearchConnectionsResponseBuilderOps(v)

  implicit def toDescribeOutboundCrossClusterSearchConnectionsResponseOps(
      v: DescribeOutboundCrossClusterSearchConnectionsResponse
  ): DescribeOutboundCrossClusterSearchConnectionsResponseOps =
    new DescribeOutboundCrossClusterSearchConnectionsResponseOps(v)

}
