// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetTemplateRequestBuilderOps(val self: GetTemplateRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): GetTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def changeSetNameAsScala(value: Option[String]): GetTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def templateStageAsScala(value: Option[TemplateStage]): GetTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateStage(v)
    }
  } // String

}

final class GetTemplateRequestOps(val self: GetTemplateRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def templateStageAsScala: Option[TemplateStage] = Option(self.templateStage) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTemplateRequestOps {

  implicit def toGetTemplateRequestBuilderOps(v: GetTemplateRequest.Builder): GetTemplateRequestBuilderOps =
    new GetTemplateRequestBuilderOps(v)

  implicit def toGetTemplateRequestOps(v: GetTemplateRequest): GetTemplateRequestOps = new GetTemplateRequestOps(v)

}
