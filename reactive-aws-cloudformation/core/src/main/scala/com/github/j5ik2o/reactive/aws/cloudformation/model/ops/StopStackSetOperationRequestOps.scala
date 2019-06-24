// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StopStackSetOperationRequestBuilderOps(val self: StopStackSetOperationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): StopStackSetOperationRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): StopStackSetOperationRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

}

final class StopStackSetOperationRequestOps(val self: StopStackSetOperationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStackSetOperationRequestOps {

  implicit def toStopStackSetOperationRequestBuilderOps(
      v: StopStackSetOperationRequest.Builder
  ): StopStackSetOperationRequestBuilderOps = new StopStackSetOperationRequestBuilderOps(v)

  implicit def toStopStackSetOperationRequestOps(v: StopStackSetOperationRequest): StopStackSetOperationRequestOps =
    new StopStackSetOperationRequestOps(v)

}
