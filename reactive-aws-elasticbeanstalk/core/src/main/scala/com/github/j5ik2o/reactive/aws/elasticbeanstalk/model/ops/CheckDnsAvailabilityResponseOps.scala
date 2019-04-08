// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CheckDnsAvailabilityResponseBuilderOps(val self: CheckDnsAvailabilityResponse.Builder) extends AnyVal {

  final def availableAsScala(value: Option[Boolean]): CheckDnsAvailabilityResponse.Builder = {
    value.fold(self) { v =>
      self.available(v)
    }
  }

  final def fullyQualifiedCNAMEAsScala(value: Option[String]): CheckDnsAvailabilityResponse.Builder = {
    value.fold(self) { v =>
      self.fullyQualifiedCNAME(v)
    }
  }

}

final class CheckDnsAvailabilityResponseOps(val self: CheckDnsAvailabilityResponse) extends AnyVal {

  final def availableAsScala: Option[Boolean] = Option(self.available)

  final def fullyQualifiedCNAMEAsScala: Option[String] = Option(self.fullyQualifiedCNAME)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCheckDnsAvailabilityResponseOps {

  implicit def toCheckDnsAvailabilityResponseBuilderOps(
      v: CheckDnsAvailabilityResponse.Builder
  ): CheckDnsAvailabilityResponseBuilderOps = new CheckDnsAvailabilityResponseBuilderOps(v)

  implicit def toCheckDnsAvailabilityResponseOps(v: CheckDnsAvailabilityResponse): CheckDnsAvailabilityResponseOps =
    new CheckDnsAvailabilityResponseOps(v)

}
