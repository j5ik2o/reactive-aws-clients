// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VgwTelemetryBuilderOps(val self: VgwTelemetry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptedRouteCountAsScala(value: Option[Int]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.acceptedRouteCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusChangeAsScala(value: Option[java.time.Instant]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.lastStatusChange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outsideIpAddressAsScala(value: Option[String]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.outsideIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[TelemetryStatus]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateArnAsScala(value: Option[String]): VgwTelemetry.Builder = {
    value.fold(self) { v =>
      self.certificateArn(v)
    }
  }

}

final class VgwTelemetryOps(val self: VgwTelemetry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptedRouteCountAsScala: Option[Int] = Option(self.acceptedRouteCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusChangeAsScala: Option[java.time.Instant] = Option(self.lastStatusChange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outsideIpAddressAsScala: Option[String] = Option(self.outsideIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[TelemetryStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateArnAsScala: Option[String] = Option(self.certificateArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVgwTelemetryOps {

  implicit def toVgwTelemetryBuilderOps(v: VgwTelemetry.Builder): VgwTelemetryBuilderOps = new VgwTelemetryBuilderOps(v)

  implicit def toVgwTelemetryOps(v: VgwTelemetry): VgwTelemetryOps = new VgwTelemetryOps(v)

}
