// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricWidgetImageRequestBuilderOps(val self: GetMetricWidgetImageRequest.Builder) extends AnyVal {

  final def metricWidgetAsScala(value: Option[String]): GetMetricWidgetImageRequest.Builder = {
    value.fold(self) { v =>
      self.metricWidget(v)
    }
  }

  final def outputFormatAsScala(value: Option[String]): GetMetricWidgetImageRequest.Builder = {
    value.fold(self) { v =>
      self.outputFormat(v)
    }
  }

}

final class GetMetricWidgetImageRequestOps(val self: GetMetricWidgetImageRequest) extends AnyVal {

  final def metricWidgetAsScala: Option[String] = Option(self.metricWidget)

  final def outputFormatAsScala: Option[String] = Option(self.outputFormat)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricWidgetImageRequestOps {

  implicit def toGetMetricWidgetImageRequestBuilderOps(
      v: GetMetricWidgetImageRequest.Builder
  ): GetMetricWidgetImageRequestBuilderOps = new GetMetricWidgetImageRequestBuilderOps(v)

  implicit def toGetMetricWidgetImageRequestOps(v: GetMetricWidgetImageRequest): GetMetricWidgetImageRequestOps =
    new GetMetricWidgetImageRequestOps(v)

}
