// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SetStackPolicyRequestBuilderOps(val self: SetStackPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v => self.stackPolicyBody(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala(value: Option[String]): SetStackPolicyRequest.Builder = {
    value.fold(self) { v => self.stackPolicyURL(v) }
  }

}

final class SetStackPolicyRequestOps(val self: SetStackPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetStackPolicyRequestOps {

  implicit def toSetStackPolicyRequestBuilderOps(v: SetStackPolicyRequest.Builder): SetStackPolicyRequestBuilderOps =
    new SetStackPolicyRequestBuilderOps(v)

  implicit def toSetStackPolicyRequestOps(v: SetStackPolicyRequest): SetStackPolicyRequestOps =
    new SetStackPolicyRequestOps(v)

}
