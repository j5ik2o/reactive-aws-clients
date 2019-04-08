// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PciIdBuilderOps(val self: PciId.Builder) extends AnyVal {

  final def deviceIdAsScala(value: Option[String]): PciId.Builder = {
    value.fold(self) { v =>
      self.deviceId(v)
    }
  }

  final def vendorIdAsScala(value: Option[String]): PciId.Builder = {
    value.fold(self) { v =>
      self.vendorId(v)
    }
  }

  final def subsystemIdAsScala(value: Option[String]): PciId.Builder = {
    value.fold(self) { v =>
      self.subsystemId(v)
    }
  }

  final def subsystemVendorIdAsScala(value: Option[String]): PciId.Builder = {
    value.fold(self) { v =>
      self.subsystemVendorId(v)
    }
  }

}

final class PciIdOps(val self: PciId) extends AnyVal {

  final def deviceIdAsScala: Option[String] = Option(self.deviceId)

  final def vendorIdAsScala: Option[String] = Option(self.vendorId)

  final def subsystemIdAsScala: Option[String] = Option(self.subsystemId)

  final def subsystemVendorIdAsScala: Option[String] = Option(self.subsystemVendorId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPciIdOps {

  implicit def toPciIdBuilderOps(v: PciId.Builder): PciIdBuilderOps = new PciIdBuilderOps(v)

  implicit def toPciIdOps(v: PciId): PciIdOps = new PciIdOps(v)

}
