// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteEnvironmentConfigurationResponseBuilderOps(val self: DeleteEnvironmentConfigurationResponse.Builder)
    extends AnyVal {}

final class DeleteEnvironmentConfigurationResponseOps(val self: DeleteEnvironmentConfigurationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteEnvironmentConfigurationResponseOps {

  implicit def toDeleteEnvironmentConfigurationResponseBuilderOps(
      v: DeleteEnvironmentConfigurationResponse.Builder
  ): DeleteEnvironmentConfigurationResponseBuilderOps = new DeleteEnvironmentConfigurationResponseBuilderOps(v)

  implicit def toDeleteEnvironmentConfigurationResponseOps(
      v: DeleteEnvironmentConfigurationResponse
  ): DeleteEnvironmentConfigurationResponseOps = new DeleteEnvironmentConfigurationResponseOps(v)

}
