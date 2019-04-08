// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataQueryBuilderOps(val self: MetricDataQuery.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def metricStatAsScala(value: Option[MetricStat]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.metricStat(v)
    }
  } // MetricStat

  final def expressionAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  } // String

  final def labelAsScala(value: Option[String]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  } // String

  final def returnDataAsScala(value: Option[Boolean]): MetricDataQuery.Builder = {
    value.fold(self) { v =>
      self.returnData(v)
    }
  } // Boolean

}

final class MetricDataQueryOps(val self: MetricDataQuery) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def metricStatAsScala: Option[MetricStat] = Option(self.metricStat) // MetricStat

  final def expressionAsScala: Option[String] = Option(self.expression) // String

  final def labelAsScala: Option[String] = Option(self.label) // String

  final def returnDataAsScala: Option[Boolean] = Option(self.returnData) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataQueryOps {

  implicit def toMetricDataQueryBuilderOps(v: MetricDataQuery.Builder): MetricDataQueryBuilderOps =
    new MetricDataQueryBuilderOps(v)

  implicit def toMetricDataQueryOps(v: MetricDataQuery): MetricDataQueryOps = new MetricDataQueryOps(v)

}
