// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class EstimateTemplateCostRequestBuilderOps(val self: EstimateTemplateCostRequest.Builder) extends AnyVal {

  final def templateBodyAsScala(value: Option[String]): EstimateTemplateCostRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): EstimateTemplateCostRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): EstimateTemplateCostRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

}

final class EstimateTemplateCostRequestOps(val self: EstimateTemplateCostRequest) extends AnyVal {

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEstimateTemplateCostRequestOps {

  implicit def toEstimateTemplateCostRequestBuilderOps(
      v: EstimateTemplateCostRequest.Builder
  ): EstimateTemplateCostRequestBuilderOps = new EstimateTemplateCostRequestBuilderOps(v)

  implicit def toEstimateTemplateCostRequestOps(v: EstimateTemplateCostRequest): EstimateTemplateCostRequestOps =
    new EstimateTemplateCostRequestOps(v)

}
