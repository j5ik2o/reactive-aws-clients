// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataQueryBuilderOps(val self: MetricDataQuery.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def metricStatAsScala(value: Option[MetricStat]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.metricStat(v)
    }
  }

  final def expressionAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  }

  final def labelAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  final def returnDataAsScala(value: Option[Boolean]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.returnData(v)
    }
  }

}

final class MetricDataQueryOps(val self: MetricDataQuery) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def metricStatAsScala: Option[MetricStat] = Option(self.metricStat)

  final def expressionAsScala: Option[String] = Option(self.expression)

  final def labelAsScala: Option[String] = Option(self.label)

  final def returnDataAsScala: Option[Boolean] = Option(self.returnData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataQueryOps {

  implicit def toMetricDataQueryBuilderOps(v: MetricDataQuery.Builder): MetricDataQueryBuilderOps =
    new MetricDataQueryBuilderOps(v)

  implicit def toMetricDataQueryOps(v: MetricDataQuery): MetricDataQueryOps = new MetricDataQueryOps(v)

}
