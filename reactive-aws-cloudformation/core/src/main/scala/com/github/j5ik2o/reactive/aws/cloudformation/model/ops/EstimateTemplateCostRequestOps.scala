// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class EstimateTemplateCostRequestBuilderOps(val self: EstimateTemplateCostRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): EstimateTemplateCostRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala(value: Option[String]): EstimateTemplateCostRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): EstimateTemplateCostRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

}

final class EstimateTemplateCostRequestOps(val self: EstimateTemplateCostRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
