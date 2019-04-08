// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeEndpointsResponseBuilderOps(val self: DescribeEndpointsResponse.Builder) extends AnyVal {

  final def endpointsAsScala(value: Option[Seq[Endpoint]]): DescribeEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.endpoints(v.asJava)
    } // Seq[Endpoint]
  }

}

final class DescribeEndpointsResponseOps(val self: DescribeEndpointsResponse) extends AnyVal {

  final def endpointsAsScala: Option[Seq[Endpoint]] = Option(self.endpoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Endpoint]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEndpointsResponseOps {

  implicit def toDescribeEndpointsResponseBuilderOps(
      v: DescribeEndpointsResponse.Builder
  ): DescribeEndpointsResponseBuilderOps = new DescribeEndpointsResponseBuilderOps(v)

  implicit def toDescribeEndpointsResponseOps(v: DescribeEndpointsResponse): DescribeEndpointsResponseOps =
    new DescribeEndpointsResponseOps(v)

}
