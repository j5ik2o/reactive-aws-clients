// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageResponseBuilderOps(val self: DeleteMessageResponse.Builder) extends AnyVal {}

final class DeleteMessageResponseOps(val self: DeleteMessageResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageResponseOps {

  implicit def toDeleteMessageResponseBuilderOps(v: DeleteMessageResponse.Builder): DeleteMessageResponseBuilderOps =
    new DeleteMessageResponseBuilderOps(v)

  implicit def toDeleteMessageResponseOps(v: DeleteMessageResponse): DeleteMessageResponseOps =
    new DeleteMessageResponseOps(v)

}
