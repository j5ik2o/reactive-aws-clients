// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutMetricFilterRequestBuilderOps(val self: PutMetricFilterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v => self.filterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v => self.filterPattern(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTransformationsAsScala(value: Option[Seq[MetricTransformation]]): PutMetricFilterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricTransformations(v.asJava)
    }
  }

}

final class PutMetricFilterRequestOps(val self: PutMetricFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTransformationsAsScala: Option[Seq[MetricTransformation]] =
    Option(self.metricTransformations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricFilterRequestOps {

  implicit def toPutMetricFilterRequestBuilderOps(v: PutMetricFilterRequest.Builder): PutMetricFilterRequestBuilderOps =
    new PutMetricFilterRequestBuilderOps(v)

  implicit def toPutMetricFilterRequestOps(v: PutMetricFilterRequest): PutMetricFilterRequestOps =
    new PutMetricFilterRequestOps(v)

}
