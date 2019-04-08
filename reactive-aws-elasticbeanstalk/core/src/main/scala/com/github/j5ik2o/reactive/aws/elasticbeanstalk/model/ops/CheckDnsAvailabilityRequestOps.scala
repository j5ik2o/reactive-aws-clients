// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CheckDnsAvailabilityRequestBuilderOps(val self: CheckDnsAvailabilityRequest.Builder) extends AnyVal {

  final def cnamePrefixAsScala(value: Option[String]): CheckDnsAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.cnamePrefix(v)
    }
  } // String

}

final class CheckDnsAvailabilityRequestOps(val self: CheckDnsAvailabilityRequest) extends AnyVal {

  final def cnamePrefixAsScala: Option[String] = Option(self.cnamePrefix) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCheckDnsAvailabilityRequestOps {

  implicit def toCheckDnsAvailabilityRequestBuilderOps(
      v: CheckDnsAvailabilityRequest.Builder
  ): CheckDnsAvailabilityRequestBuilderOps = new CheckDnsAvailabilityRequestBuilderOps(v)

  implicit def toCheckDnsAvailabilityRequestOps(v: CheckDnsAvailabilityRequest): CheckDnsAvailabilityRequestOps =
    new CheckDnsAvailabilityRequestOps(v)

}
