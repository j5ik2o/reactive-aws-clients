// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeleteComputeEnvironmentRequestBuilderOps(val self: DeleteComputeEnvironmentRequest.Builder)
    extends AnyVal {

  final def computeEnvironmentAsScala(value: Option[String]): DeleteComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironment(v)
    }
  } // String

}

final class DeleteComputeEnvironmentRequestOps(val self: DeleteComputeEnvironmentRequest) extends AnyVal {

  final def computeEnvironmentAsScala: Option[String] = Option(self.computeEnvironment) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteComputeEnvironmentRequestOps {

  implicit def toDeleteComputeEnvironmentRequestBuilderOps(
      v: DeleteComputeEnvironmentRequest.Builder
  ): DeleteComputeEnvironmentRequestBuilderOps = new DeleteComputeEnvironmentRequestBuilderOps(v)

  implicit def toDeleteComputeEnvironmentRequestOps(
      v: DeleteComputeEnvironmentRequest
  ): DeleteComputeEnvironmentRequestOps = new DeleteComputeEnvironmentRequestOps(v)

}
