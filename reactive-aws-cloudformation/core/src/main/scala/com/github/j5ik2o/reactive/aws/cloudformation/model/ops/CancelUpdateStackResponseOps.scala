// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CancelUpdateStackResponseBuilderOps(val self: CancelUpdateStackResponse.Builder) extends AnyVal {}

final class CancelUpdateStackResponseOps(val self: CancelUpdateStackResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelUpdateStackResponseOps {

  implicit def toCancelUpdateStackResponseBuilderOps(
      v: CancelUpdateStackResponse.Builder
  ): CancelUpdateStackResponseBuilderOps = new CancelUpdateStackResponseBuilderOps(v)

  implicit def toCancelUpdateStackResponseOps(v: CancelUpdateStackResponse): CancelUpdateStackResponseOps =
    new CancelUpdateStackResponseOps(v)

}
