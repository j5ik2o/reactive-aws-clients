// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionConcurrencyResponseBuilderOps(val self: DeleteFunctionConcurrencyResponse.Builder)
    extends AnyVal {}

final class DeleteFunctionConcurrencyResponseOps(val self: DeleteFunctionConcurrencyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionConcurrencyResponseOps {

  implicit def toDeleteFunctionConcurrencyResponseBuilderOps(
      v: DeleteFunctionConcurrencyResponse.Builder
  ): DeleteFunctionConcurrencyResponseBuilderOps = new DeleteFunctionConcurrencyResponseBuilderOps(v)

  implicit def toDeleteFunctionConcurrencyResponseOps(
      v: DeleteFunctionConcurrencyResponse
  ): DeleteFunctionConcurrencyResponseOps = new DeleteFunctionConcurrencyResponseOps(v)

}
