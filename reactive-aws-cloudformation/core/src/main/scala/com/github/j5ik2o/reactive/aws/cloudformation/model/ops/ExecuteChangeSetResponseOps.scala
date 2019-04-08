// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ExecuteChangeSetResponseBuilderOps(val self: ExecuteChangeSetResponse.Builder) extends AnyVal {}

final class ExecuteChangeSetResponseOps(val self: ExecuteChangeSetResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExecuteChangeSetResponseOps {

  implicit def toExecuteChangeSetResponseBuilderOps(
      v: ExecuteChangeSetResponse.Builder
  ): ExecuteChangeSetResponseBuilderOps = new ExecuteChangeSetResponseBuilderOps(v)

  implicit def toExecuteChangeSetResponseOps(v: ExecuteChangeSetResponse): ExecuteChangeSetResponseOps =
    new ExecuteChangeSetResponseOps(v)

}
