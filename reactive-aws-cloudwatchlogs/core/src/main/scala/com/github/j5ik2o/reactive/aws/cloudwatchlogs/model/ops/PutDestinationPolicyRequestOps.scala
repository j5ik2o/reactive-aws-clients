// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutDestinationPolicyRequestBuilderOps(val self: PutDestinationPolicyRequest.Builder) extends AnyVal {

  final def destinationNameAsScala(value: Option[String]): PutDestinationPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  }

  final def accessPolicyAsScala(value: Option[String]): PutDestinationPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicy(v)
    }
  }

}

final class PutDestinationPolicyRequestOps(val self: PutDestinationPolicyRequest) extends AnyVal {

  final def destinationNameAsScala: Option[String] = Option(self.destinationName)

  final def accessPolicyAsScala: Option[String] = Option(self.accessPolicy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDestinationPolicyRequestOps {

  implicit def toPutDestinationPolicyRequestBuilderOps(
      v: PutDestinationPolicyRequest.Builder
  ): PutDestinationPolicyRequestBuilderOps = new PutDestinationPolicyRequestBuilderOps(v)

  implicit def toPutDestinationPolicyRequestOps(v: PutDestinationPolicyRequest): PutDestinationPolicyRequestOps =
    new PutDestinationPolicyRequestOps(v)

}
