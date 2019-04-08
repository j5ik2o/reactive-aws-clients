// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetAccountSettingsResponseBuilderOps(val self: GetAccountSettingsResponse.Builder) extends AnyVal {

  final def accountLimitAsScala(value: Option[AccountLimit]): GetAccountSettingsResponse.Builder = {
    value.fold(self) { v =>
      self.accountLimit(v)
    }
  }

  final def accountUsageAsScala(value: Option[AccountUsage]): GetAccountSettingsResponse.Builder = {
    value.fold(self) { v =>
      self.accountUsage(v)
    }
  }

}

final class GetAccountSettingsResponseOps(val self: GetAccountSettingsResponse) extends AnyVal {

  final def accountLimitAsScala: Option[AccountLimit] = Option(self.accountLimit)

  final def accountUsageAsScala: Option[AccountUsage] = Option(self.accountUsage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAccountSettingsResponseOps {

  implicit def toGetAccountSettingsResponseBuilderOps(
      v: GetAccountSettingsResponse.Builder
  ): GetAccountSettingsResponseBuilderOps = new GetAccountSettingsResponseBuilderOps(v)

  implicit def toGetAccountSettingsResponseOps(v: GetAccountSettingsResponse): GetAccountSettingsResponseOps =
    new GetAccountSettingsResponseOps(v)

}
