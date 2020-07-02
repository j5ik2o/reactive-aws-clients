// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Ipv6RangeBuilderOps(val self: Ipv6Range.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrIpv6AsScala(value: Option[String]): Ipv6Range.Builder = {
    value.fold(self) { v => self.cidrIpv6(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Ipv6Range.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class Ipv6RangeOps(val self: Ipv6Range) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrIpv6AsScala: Option[String] = Option(self.cidrIpv6)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpv6RangeOps {

  implicit def toIpv6RangeBuilderOps(v: Ipv6Range.Builder): Ipv6RangeBuilderOps = new Ipv6RangeBuilderOps(v)

  implicit def toIpv6RangeOps(v: Ipv6Range): Ipv6RangeOps = new Ipv6RangeOps(v)

}
