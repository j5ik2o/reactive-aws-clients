// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StopStackSetOperationRequestBuilderOps(val self: StopStackSetOperationRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): StopStackSetOperationRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def operationIdAsScala(value: Option[String]): StopStackSetOperationRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

}

final class StopStackSetOperationRequestOps(val self: StopStackSetOperationRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStackSetOperationRequestOps {

  implicit def toStopStackSetOperationRequestBuilderOps(
      v: StopStackSetOperationRequest.Builder
  ): StopStackSetOperationRequestBuilderOps = new StopStackSetOperationRequestBuilderOps(v)

  implicit def toStopStackSetOperationRequestOps(v: StopStackSetOperationRequest): StopStackSetOperationRequestOps =
    new StopStackSetOperationRequestOps(v)

}
