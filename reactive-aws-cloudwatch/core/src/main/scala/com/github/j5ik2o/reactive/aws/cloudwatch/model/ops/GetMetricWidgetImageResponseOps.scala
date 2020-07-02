// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricWidgetImageResponseBuilderOps(val self: GetMetricWidgetImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricWidgetImageAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetMetricWidgetImageResponse.Builder = {
    value.fold(self) { v => self.metricWidgetImage(v) }
  }

}

final class GetMetricWidgetImageResponseOps(val self: GetMetricWidgetImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricWidgetImageAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.metricWidgetImage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricWidgetImageResponseOps {

  implicit def toGetMetricWidgetImageResponseBuilderOps(
      v: GetMetricWidgetImageResponse.Builder
  ): GetMetricWidgetImageResponseBuilderOps = new GetMetricWidgetImageResponseBuilderOps(v)

  implicit def toGetMetricWidgetImageResponseOps(v: GetMetricWidgetImageResponse): GetMetricWidgetImageResponseOps =
    new GetMetricWidgetImageResponseOps(v)

}
