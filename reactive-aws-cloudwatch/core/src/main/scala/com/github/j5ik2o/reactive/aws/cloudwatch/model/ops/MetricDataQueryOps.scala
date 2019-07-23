// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataQueryBuilderOps(val self: MetricDataQuery.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricStatAsScala(value: Option[MetricStat]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.metricStat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnDataAsScala(value: Option[Boolean]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.returnData(v)
    }
  }

}

final class MetricDataQueryOps(val self: MetricDataQuery) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricStatAsScala: Option[MetricStat] = Option(self.metricStat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAsScala: Option[String] = Option(self.expression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[String] = Option(self.label)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnDataAsScala: Option[Boolean] = Option(self.returnData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataQueryOps {

  implicit def toMetricDataQueryBuilderOps(v: MetricDataQuery.Builder): MetricDataQueryBuilderOps =
    new MetricDataQueryBuilderOps(v)

  implicit def toMetricDataQueryOps(v: MetricDataQuery): MetricDataQueryOps = new MetricDataQueryOps(v)

}
