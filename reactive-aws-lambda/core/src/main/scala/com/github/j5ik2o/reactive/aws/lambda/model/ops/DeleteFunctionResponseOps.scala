// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionResponseBuilderOps(val self: DeleteFunctionResponse.Builder) extends AnyVal {}

final class DeleteFunctionResponseOps(val self: DeleteFunctionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionResponseOps {

  implicit def toDeleteFunctionResponseBuilderOps(v: DeleteFunctionResponse.Builder): DeleteFunctionResponseBuilderOps =
    new DeleteFunctionResponseBuilderOps(v)

  implicit def toDeleteFunctionResponseOps(v: DeleteFunctionResponse): DeleteFunctionResponseOps =
    new DeleteFunctionResponseOps(v)

}
