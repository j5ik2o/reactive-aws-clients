// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateComputeEnvironmentResponseBuilderOps(val self: UpdateComputeEnvironmentResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala(value: Option[String]): UpdateComputeEnvironmentResponse.Builder = {
    value.fold(self) { v => self.computeEnvironmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentArnAsScala(value: Option[String]): UpdateComputeEnvironmentResponse.Builder = {
    value.fold(self) { v => self.computeEnvironmentArn(v) }
  }

}

final class UpdateComputeEnvironmentResponseOps(val self: UpdateComputeEnvironmentResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentNameAsScala: Option[String] = Option(self.computeEnvironmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentArnAsScala: Option[String] = Option(self.computeEnvironmentArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateComputeEnvironmentResponseOps {

  implicit def toUpdateComputeEnvironmentResponseBuilderOps(
      v: UpdateComputeEnvironmentResponse.Builder
  ): UpdateComputeEnvironmentResponseBuilderOps = new UpdateComputeEnvironmentResponseBuilderOps(v)

  implicit def toUpdateComputeEnvironmentResponseOps(
      v: UpdateComputeEnvironmentResponse
  ): UpdateComputeEnvironmentResponseOps = new UpdateComputeEnvironmentResponseOps(v)

}
