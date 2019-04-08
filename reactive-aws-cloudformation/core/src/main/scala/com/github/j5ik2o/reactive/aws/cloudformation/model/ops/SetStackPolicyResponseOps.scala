// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SetStackPolicyResponseBuilderOps(val self: SetStackPolicyResponse.Builder) extends AnyVal {}

final class SetStackPolicyResponseOps(val self: SetStackPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetStackPolicyResponseOps {

  implicit def toSetStackPolicyResponseBuilderOps(v: SetStackPolicyResponse.Builder): SetStackPolicyResponseBuilderOps =
    new SetStackPolicyResponseBuilderOps(v)

  implicit def toSetStackPolicyResponseOps(v: SetStackPolicyResponse): SetStackPolicyResponseOps =
    new SetStackPolicyResponseOps(v)

}
