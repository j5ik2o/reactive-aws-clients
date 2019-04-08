// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProvisionedBandwidthBuilderOps(val self: ProvisionedBandwidth.Builder) extends AnyVal {

  final def provisionTimeAsScala(value: Option[java.time.Instant]): ProvisionedBandwidth.Builder = {
    value.fold(self) { v =>
      self.provisionTime(v)
    }
  }

  final def provisionedAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
    value.fold(self) { v =>
      self.provisioned(v)
    }
  }

  final def requestTimeAsScala(value: Option[java.time.Instant]): ProvisionedBandwidth.Builder = {
    value.fold(self) { v =>
      self.requestTime(v)
    }
  }

  final def requestedAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
    value.fold(self) { v =>
      self.requested(v)
    }
  }

  final def statusAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ProvisionedBandwidthOps(val self: ProvisionedBandwidth) extends AnyVal {

  final def provisionTimeAsScala: Option[java.time.Instant] = Option(self.provisionTime)

  final def provisionedAsScala: Option[String] = Option(self.provisioned)

  final def requestTimeAsScala: Option[java.time.Instant] = Option(self.requestTime)

  final def requestedAsScala: Option[String] = Option(self.requested)

  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedBandwidthOps {

  implicit def toProvisionedBandwidthBuilderOps(v: ProvisionedBandwidth.Builder): ProvisionedBandwidthBuilderOps =
    new ProvisionedBandwidthBuilderOps(v)

  implicit def toProvisionedBandwidthOps(v: ProvisionedBandwidth): ProvisionedBandwidthOps =
    new ProvisionedBandwidthOps(v)

}
