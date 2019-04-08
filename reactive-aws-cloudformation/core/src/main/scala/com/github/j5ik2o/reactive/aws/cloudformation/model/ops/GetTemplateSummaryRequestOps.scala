// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetTemplateSummaryRequestBuilderOps(val self: GetTemplateSummaryRequest.Builder) extends AnyVal {

  final def templateBodyAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def templateURLAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def stackSetNameAsScala(value: Option[String]): GetTemplateSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

}

final class GetTemplateSummaryRequestOps(val self: GetTemplateSummaryRequest) extends AnyVal {

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def templateURLAsScala: Option[String] = Option(self.templateURL) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTemplateSummaryRequestOps {

  implicit def toGetTemplateSummaryRequestBuilderOps(
      v: GetTemplateSummaryRequest.Builder
  ): GetTemplateSummaryRequestBuilderOps = new GetTemplateSummaryRequestBuilderOps(v)

  implicit def toGetTemplateSummaryRequestOps(v: GetTemplateSummaryRequest): GetTemplateSummaryRequestOps =
    new GetTemplateSummaryRequestOps(v)

}
