// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteConfigurationTemplateRequestBuilderOps(val self: DeleteConfigurationTemplateRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DeleteConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): DeleteConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

}

final class DeleteConfigurationTemplateRequestOps(val self: DeleteConfigurationTemplateRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteConfigurationTemplateRequestOps {

  implicit def toDeleteConfigurationTemplateRequestBuilderOps(
      v: DeleteConfigurationTemplateRequest.Builder
  ): DeleteConfigurationTemplateRequestBuilderOps = new DeleteConfigurationTemplateRequestBuilderOps(v)

  implicit def toDeleteConfigurationTemplateRequestOps(
      v: DeleteConfigurationTemplateRequest
  ): DeleteConfigurationTemplateRequestOps = new DeleteConfigurationTemplateRequestOps(v)

}
