// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePublicIpv4PoolsResponseBuilderOps(val self: DescribePublicIpv4PoolsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolsAsScala(value: Option[Seq[PublicIpv4Pool]]): DescribePublicIpv4PoolsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.publicIpv4Pools(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribePublicIpv4PoolsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribePublicIpv4PoolsResponseOps(val self: DescribePublicIpv4PoolsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolsAsScala: Option[Seq[PublicIpv4Pool]] =
    Option(self.publicIpv4Pools).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePublicIpv4PoolsResponseOps {

  implicit def toDescribePublicIpv4PoolsResponseBuilderOps(
      v: DescribePublicIpv4PoolsResponse.Builder
  ): DescribePublicIpv4PoolsResponseBuilderOps = new DescribePublicIpv4PoolsResponseBuilderOps(v)

  implicit def toDescribePublicIpv4PoolsResponseOps(
      v: DescribePublicIpv4PoolsResponse
  ): DescribePublicIpv4PoolsResponseOps = new DescribePublicIpv4PoolsResponseOps(v)

}
