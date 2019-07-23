// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetMetricStatisticsResponseBuilderOps(val self: GetMetricStatisticsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[String]): GetMetricStatisticsResponse.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsAsScala(value: Option[Seq[Datapoint]]): GetMetricStatisticsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.datapoints(v.asJava)
    }
  }

}

final class GetMetricStatisticsResponseOps(val self: GetMetricStatisticsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[String] = Option(self.label)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsAsScala: Option[Seq[Datapoint]] = Option(self.datapoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetMetricStatisticsResponseOps {

  implicit def toGetMetricStatisticsResponseBuilderOps(
      v: GetMetricStatisticsResponse.Builder
  ): GetMetricStatisticsResponseBuilderOps = new GetMetricStatisticsResponseBuilderOps(v)

  implicit def toGetMetricStatisticsResponseOps(v: GetMetricStatisticsResponse): GetMetricStatisticsResponseOps =
    new GetMetricStatisticsResponseOps(v)

}
