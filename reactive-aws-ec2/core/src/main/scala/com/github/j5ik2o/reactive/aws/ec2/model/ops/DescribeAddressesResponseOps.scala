// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAddressesResponseBuilderOps(val self: DescribeAddressesResponse.Builder) extends AnyVal {

  final def addressesAsScala(value: Option[Seq[Address]]): DescribeAddressesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addresses(v.asJava)
    }
  }

}

final class DescribeAddressesResponseOps(val self: DescribeAddressesResponse) extends AnyVal {

  final def addressesAsScala: Option[Seq[Address]] = Option(self.addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAddressesResponseOps {

  implicit def toDescribeAddressesResponseBuilderOps(
      v: DescribeAddressesResponse.Builder
  ): DescribeAddressesResponseBuilderOps = new DescribeAddressesResponseBuilderOps(v)

  implicit def toDescribeAddressesResponseOps(v: DescribeAddressesResponse): DescribeAddressesResponseOps =
    new DescribeAddressesResponseOps(v)

}
