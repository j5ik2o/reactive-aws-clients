// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ValidateTemplateRequestBuilderOps(val self: ValidateTemplateRequest.Builder) extends AnyVal {

  final def templateBodyAsScala(value: Option[String]): ValidateTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): ValidateTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

}

final class ValidateTemplateRequestOps(val self: ValidateTemplateRequest) extends AnyVal {

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidateTemplateRequestOps {

  implicit def toValidateTemplateRequestBuilderOps(
      v: ValidateTemplateRequest.Builder
  ): ValidateTemplateRequestBuilderOps = new ValidateTemplateRequestBuilderOps(v)

  implicit def toValidateTemplateRequestOps(v: ValidateTemplateRequest): ValidateTemplateRequestOps =
    new ValidateTemplateRequestOps(v)

}
