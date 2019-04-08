// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IpRangeBuilderOps(val self: IpRange.Builder) extends AnyVal {

  final def cidrIpAsScala(value: Option[String]): IpRange.Builder = {
    value.fold(self) { v =>
      self.cidrIp(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): IpRange.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class IpRangeOps(val self: IpRange) extends AnyVal {

  final def cidrIpAsScala: Option[String] = Option(self.cidrIp)

  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpRangeOps {

  implicit def toIpRangeBuilderOps(v: IpRange.Builder): IpRangeBuilderOps = new IpRangeBuilderOps(v)

  implicit def toIpRangeOps(v: IpRange): IpRangeOps = new IpRangeOps(v)

}
