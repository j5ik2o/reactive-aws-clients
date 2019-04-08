// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetStackPolicyResponseBuilderOps(val self: GetStackPolicyResponse.Builder) extends AnyVal {

  final def stackPolicyBodyAsScala(value: Option[String]): GetStackPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  } // String

}

final class GetStackPolicyResponseOps(val self: GetStackPolicyResponse) extends AnyVal {

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetStackPolicyResponseOps {

  implicit def toGetStackPolicyResponseBuilderOps(v: GetStackPolicyResponse.Builder): GetStackPolicyResponseBuilderOps =
    new GetStackPolicyResponseBuilderOps(v)

  implicit def toGetStackPolicyResponseOps(v: GetStackPolicyResponse): GetStackPolicyResponseOps =
    new GetStackPolicyResponseOps(v)

}
