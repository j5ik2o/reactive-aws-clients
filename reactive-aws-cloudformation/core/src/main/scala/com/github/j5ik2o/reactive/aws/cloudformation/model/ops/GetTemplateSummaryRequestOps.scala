// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetTemplateSummaryRequestBuilderOps(val self: GetTemplateSummaryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

}

final class GetTemplateSummaryRequestOps(val self: GetTemplateSummaryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTemplateSummaryRequestOps {

  implicit def toGetTemplateSummaryRequestBuilderOps(
      v: GetTemplateSummaryRequest.Builder
  ): GetTemplateSummaryRequestBuilderOps = new GetTemplateSummaryRequestBuilderOps(v)

  implicit def toGetTemplateSummaryRequestOps(v: GetTemplateSummaryRequest): GetTemplateSummaryRequestOps =
    new GetTemplateSummaryRequestOps(v)

}
