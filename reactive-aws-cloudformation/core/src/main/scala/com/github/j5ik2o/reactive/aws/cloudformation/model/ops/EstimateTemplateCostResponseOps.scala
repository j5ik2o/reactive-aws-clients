// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class EstimateTemplateCostResponseBuilderOps(val self: EstimateTemplateCostResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala(value: Option[String]): EstimateTemplateCostResponse.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

}

final class EstimateTemplateCostResponseOps(val self: EstimateTemplateCostResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala: Option[String] = Option(self.url)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEstimateTemplateCostResponseOps {

  implicit def toEstimateTemplateCostResponseBuilderOps(
      v: EstimateTemplateCostResponse.Builder
  ): EstimateTemplateCostResponseBuilderOps = new EstimateTemplateCostResponseBuilderOps(v)

  implicit def toEstimateTemplateCostResponseOps(v: EstimateTemplateCostResponse): EstimateTemplateCostResponseOps =
    new EstimateTemplateCostResponseOps(v)

}
