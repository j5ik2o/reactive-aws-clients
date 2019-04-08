// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateTerminationProtectionRequestBuilderOps(val self: UpdateTerminationProtectionRequest.Builder)
    extends AnyVal {

  final def enableTerminationProtectionAsScala(value: Option[Boolean]): UpdateTerminationProtectionRequest.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  }

  final def stackNameAsScala(value: Option[String]): UpdateTerminationProtectionRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

}

final class UpdateTerminationProtectionRequestOps(val self: UpdateTerminationProtectionRequest) extends AnyVal {

  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection)

  final def stackNameAsScala: Option[String] = Option(self.stackName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTerminationProtectionRequestOps {

  implicit def toUpdateTerminationProtectionRequestBuilderOps(
      v: UpdateTerminationProtectionRequest.Builder
  ): UpdateTerminationProtectionRequestBuilderOps = new UpdateTerminationProtectionRequestBuilderOps(v)

  implicit def toUpdateTerminationProtectionRequestOps(
      v: UpdateTerminationProtectionRequest
  ): UpdateTerminationProtectionRequestOps = new UpdateTerminationProtectionRequestOps(v)

}
