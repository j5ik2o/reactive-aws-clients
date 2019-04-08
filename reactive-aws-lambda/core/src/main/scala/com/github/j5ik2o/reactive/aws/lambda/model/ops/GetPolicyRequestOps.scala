// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetPolicyRequestBuilderOps(val self: GetPolicyRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): GetPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def qualifierAsScala(value: Option[String]): GetPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

}

final class GetPolicyRequestOps(val self: GetPolicyRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPolicyRequestOps {

  implicit def toGetPolicyRequestBuilderOps(v: GetPolicyRequest.Builder): GetPolicyRequestBuilderOps =
    new GetPolicyRequestBuilderOps(v)

  implicit def toGetPolicyRequestOps(v: GetPolicyRequest): GetPolicyRequestOps = new GetPolicyRequestOps(v)

}
