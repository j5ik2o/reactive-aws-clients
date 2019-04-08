// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SetStackPolicyRequestBuilderOps(val self: SetStackPolicyRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def stackPolicyBodyAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  }

  final def stackPolicyURLAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  }

}

final class SetStackPolicyRequestOps(val self: SetStackPolicyRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetStackPolicyRequestOps {

  implicit def toSetStackPolicyRequestBuilderOps(v: SetStackPolicyRequest.Builder): SetStackPolicyRequestBuilderOps =
    new SetStackPolicyRequestBuilderOps(v)

  implicit def toSetStackPolicyRequestOps(v: SetStackPolicyRequest): SetStackPolicyRequestOps =
    new SetStackPolicyRequestOps(v)

}
