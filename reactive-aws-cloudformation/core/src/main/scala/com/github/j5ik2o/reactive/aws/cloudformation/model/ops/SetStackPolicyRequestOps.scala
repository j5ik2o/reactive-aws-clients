// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SetStackPolicyRequestBuilderOps(val self: SetStackPolicyRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def stackPolicyBodyAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  } // String

  final def stackPolicyURLAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  } // String

}

final class SetStackPolicyRequestOps(val self: SetStackPolicyRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody) // String

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetStackPolicyRequestOps {

  implicit def toSetStackPolicyRequestBuilderOps(v: SetStackPolicyRequest.Builder): SetStackPolicyRequestBuilderOps =
    new SetStackPolicyRequestBuilderOps(v)

  implicit def toSetStackPolicyRequestOps(v: SetStackPolicyRequest): SetStackPolicyRequestOps =
    new SetStackPolicyRequestOps(v)

}
