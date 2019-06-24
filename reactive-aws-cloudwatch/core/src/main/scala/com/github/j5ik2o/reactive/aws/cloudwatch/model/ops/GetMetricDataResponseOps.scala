// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricDataResponseBuilderOps(val self: GetMetricDataResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricDataResultsAsScala(value: Option[Seq[MetricDataResult]]): GetMetricDataResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricDataResults(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetMetricDataResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetMetricDataResponseOps(val self: GetMetricDataResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricDataResultsAsScala: Option[Seq[MetricDataResult]] = Option(self.metricDataResults).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricDataResponseOps {

  implicit def toGetMetricDataResponseBuilderOps(v: GetMetricDataResponse.Builder): GetMetricDataResponseBuilderOps =
    new GetMetricDataResponseBuilderOps(v)

  implicit def toGetMetricDataResponseOps(v: GetMetricDataResponse): GetMetricDataResponseOps =
    new GetMetricDataResponseOps(v)

}
