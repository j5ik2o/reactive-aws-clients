// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ContinueUpdateRollbackResponseBuilderOps(val self: ContinueUpdateRollbackResponse.Builder) extends AnyVal {}

final class ContinueUpdateRollbackResponseOps(val self: ContinueUpdateRollbackResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContinueUpdateRollbackResponseOps {

  implicit def toContinueUpdateRollbackResponseBuilderOps(
      v: ContinueUpdateRollbackResponse.Builder
  ): ContinueUpdateRollbackResponseBuilderOps = new ContinueUpdateRollbackResponseBuilderOps(v)

  implicit def toContinueUpdateRollbackResponseOps(
      v: ContinueUpdateRollbackResponse
  ): ContinueUpdateRollbackResponseOps = new ContinueUpdateRollbackResponseOps(v)

}
