// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeEndpointsResponseBuilderOps(val self: DescribeEndpointsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointsAsScala(value: Option[Seq[Endpoint]]): DescribeEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.endpoints(v.asJava)
    }
  }

}

final class DescribeEndpointsResponseOps(val self: DescribeEndpointsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointsAsScala: Option[Seq[Endpoint]] =
    Option(self.endpoints).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEndpointsResponseOps {

  implicit def toDescribeEndpointsResponseBuilderOps(
      v: DescribeEndpointsResponse.Builder
  ): DescribeEndpointsResponseBuilderOps = new DescribeEndpointsResponseBuilderOps(v)

  implicit def toDescribeEndpointsResponseOps(v: DescribeEndpointsResponse): DescribeEndpointsResponseOps =
    new DescribeEndpointsResponseOps(v)

}
