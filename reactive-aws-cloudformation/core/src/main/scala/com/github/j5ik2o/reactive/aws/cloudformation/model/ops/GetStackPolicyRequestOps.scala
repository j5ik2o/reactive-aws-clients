// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetStackPolicyRequestBuilderOps(val self: GetStackPolicyRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): GetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

}

final class GetStackPolicyRequestOps(val self: GetStackPolicyRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetStackPolicyRequestOps {

  implicit def toGetStackPolicyRequestBuilderOps(v: GetStackPolicyRequest.Builder): GetStackPolicyRequestBuilderOps =
    new GetStackPolicyRequestBuilderOps(v)

  implicit def toGetStackPolicyRequestOps(v: GetStackPolicyRequest): GetStackPolicyRequestOps =
    new GetStackPolicyRequestOps(v)

}
