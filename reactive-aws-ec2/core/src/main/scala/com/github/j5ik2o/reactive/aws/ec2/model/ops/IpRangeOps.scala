// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IpRangeBuilderOps(val self: IpRange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrIpAsScala(value: Option[String]): IpRange.Builder = {
    value.fold(self) { v => self.cidrIp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): IpRange.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class IpRangeOps(val self: IpRange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrIpAsScala: Option[String] = Option(self.cidrIp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpRangeOps {

  implicit def toIpRangeBuilderOps(v: IpRange.Builder): IpRangeBuilderOps = new IpRangeBuilderOps(v)

  implicit def toIpRangeOps(v: IpRange): IpRangeOps = new IpRangeOps(v)

}
