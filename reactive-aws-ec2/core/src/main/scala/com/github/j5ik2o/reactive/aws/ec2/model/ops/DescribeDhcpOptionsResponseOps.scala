// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeDhcpOptionsResponseBuilderOps(val self: DescribeDhcpOptionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dhcpOptionsAsScala(value: Option[Seq[DhcpOptions]]): DescribeDhcpOptionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dhcpOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeDhcpOptionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeDhcpOptionsResponseOps(val self: DescribeDhcpOptionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dhcpOptionsAsScala: Option[Seq[DhcpOptions]] =
    Option(self.dhcpOptions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDhcpOptionsResponseOps {

  implicit def toDescribeDhcpOptionsResponseBuilderOps(
      v: DescribeDhcpOptionsResponse.Builder
  ): DescribeDhcpOptionsResponseBuilderOps = new DescribeDhcpOptionsResponseBuilderOps(v)

  implicit def toDescribeDhcpOptionsResponseOps(v: DescribeDhcpOptionsResponse): DescribeDhcpOptionsResponseOps =
    new DescribeDhcpOptionsResponseOps(v)

}
