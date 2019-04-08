// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetAccountSettingsRequestBuilderOps(val self: GetAccountSettingsRequest.Builder) extends AnyVal {}

final class GetAccountSettingsRequestOps(val self: GetAccountSettingsRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAccountSettingsRequestOps {

  implicit def toGetAccountSettingsRequestBuilderOps(
      v: GetAccountSettingsRequest.Builder
  ): GetAccountSettingsRequestBuilderOps = new GetAccountSettingsRequestBuilderOps(v)

  implicit def toGetAccountSettingsRequestOps(v: GetAccountSettingsRequest): GetAccountSettingsRequestOps =
    new GetAccountSettingsRequestOps(v)

}
