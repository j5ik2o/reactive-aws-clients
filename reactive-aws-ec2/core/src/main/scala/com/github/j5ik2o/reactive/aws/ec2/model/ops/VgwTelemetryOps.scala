// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VgwTelemetryBuilderOps(val self: VgwTelemetry.Builder) extends AnyVal {

  final def acceptedRouteCountAsScala(value: Option[Int]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.acceptedRouteCount(v)
    }
  }

  final def lastStatusChangeAsScala(value: Option[java.time.Instant]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.lastStatusChange(v)
    }
  }

  final def outsideIpAddressAsScala(value: Option[String]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.outsideIpAddress(v)
    }
  }

  final def statusAsScala(value: Option[TelemetryStatus]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

}

final class VgwTelemetryOps(val self: VgwTelemetry) extends AnyVal {

  final def acceptedRouteCountAsScala: Option[Int] = Option(self.acceptedRouteCount)

  final def lastStatusChangeAsScala: Option[java.time.Instant] = Option(self.lastStatusChange)

  final def outsideIpAddressAsScala: Option[String] = Option(self.outsideIpAddress)

  final def statusAsScala: Option[TelemetryStatus] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVgwTelemetryOps {

  implicit def toVgwTelemetryBuilderOps(v: VgwTelemetry.Builder): VgwTelemetryBuilderOps = new VgwTelemetryBuilderOps(v)

  implicit def toVgwTelemetryOps(v: VgwTelemetry): VgwTelemetryOps = new VgwTelemetryOps(v)

}
