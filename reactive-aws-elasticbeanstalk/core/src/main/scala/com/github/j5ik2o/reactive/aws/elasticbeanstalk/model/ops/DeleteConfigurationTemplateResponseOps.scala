// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteConfigurationTemplateResponseBuilderOps(val self: DeleteConfigurationTemplateResponse.Builder)
    extends AnyVal {}

final class DeleteConfigurationTemplateResponseOps(val self: DeleteConfigurationTemplateResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteConfigurationTemplateResponseOps {

  implicit def toDeleteConfigurationTemplateResponseBuilderOps(
      v: DeleteConfigurationTemplateResponse.Builder
  ): DeleteConfigurationTemplateResponseBuilderOps = new DeleteConfigurationTemplateResponseBuilderOps(v)

  implicit def toDeleteConfigurationTemplateResponseOps(
      v: DeleteConfigurationTemplateResponse
  ): DeleteConfigurationTemplateResponseOps = new DeleteConfigurationTemplateResponseOps(v)

}
