// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectLockConfigurationResponseBuilderOps(val self: GetObjectLockConfigurationResponse.Builder)
    extends AnyVal {

  final def objectLockConfigurationAsScala(
      value: Option[ObjectLockConfiguration]
  ): GetObjectLockConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockConfiguration(v)
    }
  }

}

final class GetObjectLockConfigurationResponseOps(val self: GetObjectLockConfigurationResponse) extends AnyVal {

  final def objectLockConfigurationAsScala: Option[ObjectLockConfiguration] = Option(self.objectLockConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectLockConfigurationResponseOps {

  implicit def toGetObjectLockConfigurationResponseBuilderOps(
      v: GetObjectLockConfigurationResponse.Builder
  ): GetObjectLockConfigurationResponseBuilderOps = new GetObjectLockConfigurationResponseBuilderOps(v)

  implicit def toGetObjectLockConfigurationResponseOps(
      v: GetObjectLockConfigurationResponse
  ): GetObjectLockConfigurationResponseOps = new GetObjectLockConfigurationResponseOps(v)

}
