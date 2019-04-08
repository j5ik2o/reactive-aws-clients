// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeDhcpOptionsResponseBuilderOps(val self: DescribeDhcpOptionsResponse.Builder) extends AnyVal {

  final def dhcpOptionsAsScala(value: Option[Seq[DhcpOptions]]): DescribeDhcpOptionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dhcpOptions(v.asJava)
    }
  }

}

final class DescribeDhcpOptionsResponseOps(val self: DescribeDhcpOptionsResponse) extends AnyVal {

  final def dhcpOptionsAsScala: Option[Seq[DhcpOptions]] = Option(self.dhcpOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDhcpOptionsResponseOps {

  implicit def toDescribeDhcpOptionsResponseBuilderOps(
      v: DescribeDhcpOptionsResponse.Builder
  ): DescribeDhcpOptionsResponseBuilderOps = new DescribeDhcpOptionsResponseBuilderOps(v)

  implicit def toDescribeDhcpOptionsResponseOps(v: DescribeDhcpOptionsResponse): DescribeDhcpOptionsResponseOps =
    new DescribeDhcpOptionsResponseOps(v)

}
