// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricDataRequestBuilderOps(val self: PutMetricDataRequest.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): PutMetricDataRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  final def metricDataAsScala(value: Option[Seq[MetricDatum]]): PutMetricDataRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricData(v.asJava)
    }
  }

}

final class PutMetricDataRequestOps(val self: PutMetricDataRequest) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace)

  final def metricDataAsScala: Option[Seq[MetricDatum]] = Option(self.metricData).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricDataRequestOps {

  implicit def toPutMetricDataRequestBuilderOps(v: PutMetricDataRequest.Builder): PutMetricDataRequestBuilderOps =
    new PutMetricDataRequestBuilderOps(v)

  implicit def toPutMetricDataRequestOps(v: PutMetricDataRequest): PutMetricDataRequestOps =
    new PutMetricDataRequestOps(v)

}
