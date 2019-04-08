// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateTerminationProtectionResponseBuilderOps(val self: UpdateTerminationProtectionResponse.Builder)
    extends AnyVal {

  final def stackIdAsScala(value: Option[String]): UpdateTerminationProtectionResponse.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

}

final class UpdateTerminationProtectionResponseOps(val self: UpdateTerminationProtectionResponse) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTerminationProtectionResponseOps {

  implicit def toUpdateTerminationProtectionResponseBuilderOps(
      v: UpdateTerminationProtectionResponse.Builder
  ): UpdateTerminationProtectionResponseBuilderOps = new UpdateTerminationProtectionResponseBuilderOps(v)

  implicit def toUpdateTerminationProtectionResponseOps(
      v: UpdateTerminationProtectionResponse
  ): UpdateTerminationProtectionResponseOps = new UpdateTerminationProtectionResponseOps(v)

}
