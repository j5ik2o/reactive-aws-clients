// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribeInboundCrossClusterSearchConnectionsResponseBuilderOps(
    val self: DescribeInboundCrossClusterSearchConnectionsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionsAsScala(
      value: Option[Seq[InboundCrossClusterSearchConnection]]
  ): DescribeInboundCrossClusterSearchConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.crossClusterSearchConnections(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInboundCrossClusterSearchConnectionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeInboundCrossClusterSearchConnectionsResponseOps(
    val self: DescribeInboundCrossClusterSearchConnectionsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionsAsScala: Option[Seq[InboundCrossClusterSearchConnection]] =
    Option(self.crossClusterSearchConnections).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInboundCrossClusterSearchConnectionsResponseOps {

  implicit def toDescribeInboundCrossClusterSearchConnectionsResponseBuilderOps(
      v: DescribeInboundCrossClusterSearchConnectionsResponse.Builder
  ): DescribeInboundCrossClusterSearchConnectionsResponseBuilderOps =
    new DescribeInboundCrossClusterSearchConnectionsResponseBuilderOps(v)

  implicit def toDescribeInboundCrossClusterSearchConnectionsResponseOps(
      v: DescribeInboundCrossClusterSearchConnectionsResponse
  ): DescribeInboundCrossClusterSearchConnectionsResponseOps =
    new DescribeInboundCrossClusterSearchConnectionsResponseOps(v)

}
