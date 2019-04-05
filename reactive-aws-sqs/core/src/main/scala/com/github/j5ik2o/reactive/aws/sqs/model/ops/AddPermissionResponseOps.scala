// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class AddPermissionResponseBuilderOps(val self: AddPermissionResponse.Builder) extends AnyVal {}

final class AddPermissionResponseOps(val self: AddPermissionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionResponseOps {

  implicit def toAddPermissionResponseBuilderOps(v: AddPermissionResponse.Builder): AddPermissionResponseBuilderOps =
    new AddPermissionResponseBuilderOps(v)

  implicit def toAddPermissionResponseOps(v: AddPermissionResponse): AddPermissionResponseOps =
    new AddPermissionResponseOps(v)

}
