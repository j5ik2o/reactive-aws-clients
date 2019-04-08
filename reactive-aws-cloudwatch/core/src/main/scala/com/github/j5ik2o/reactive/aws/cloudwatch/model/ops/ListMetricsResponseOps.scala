// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListMetricsResponseBuilderOps(val self: ListMetricsResponse.Builder) extends AnyVal {

  final def metricsAsScala(value: Option[Seq[Metric]]): ListMetricsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metrics(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListMetricsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListMetricsResponseOps(val self: ListMetricsResponse) extends AnyVal {

  final def metricsAsScala: Option[Seq[Metric]] = Option(self.metrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMetricsResponseOps {

  implicit def toListMetricsResponseBuilderOps(v: ListMetricsResponse.Builder): ListMetricsResponseBuilderOps =
    new ListMetricsResponseBuilderOps(v)

  implicit def toListMetricsResponseOps(v: ListMetricsResponse): ListMetricsResponseOps = new ListMetricsResponseOps(v)

}
