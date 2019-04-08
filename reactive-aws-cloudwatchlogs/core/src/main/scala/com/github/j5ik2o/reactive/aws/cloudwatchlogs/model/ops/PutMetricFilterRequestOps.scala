// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutMetricFilterRequestBuilderOps(val self: PutMetricFilterRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterNameAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  } // String

  final def filterPatternAsScala(value: Option[String]): PutMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  } // String

  final def metricTransformationsAsScala(value: Option[Seq[MetricTransformation]]): PutMetricFilterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricTransformations(v.asJava)
    } // Seq[MetricTransformation]
  }

}

final class PutMetricFilterRequestOps(val self: PutMetricFilterRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterNameAsScala: Option[String] = Option(self.filterName) // String

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern) // String

  final def metricTransformationsAsScala: Option[Seq[MetricTransformation]] = Option(self.metricTransformations).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricTransformation]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricFilterRequestOps {

  implicit def toPutMetricFilterRequestBuilderOps(v: PutMetricFilterRequest.Builder): PutMetricFilterRequestBuilderOps =
    new PutMetricFilterRequestBuilderOps(v)

  implicit def toPutMetricFilterRequestOps(v: PutMetricFilterRequest): PutMetricFilterRequestOps =
    new PutMetricFilterRequestOps(v)

}
