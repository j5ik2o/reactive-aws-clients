// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListMetricsRequestBuilderOps(val self: ListMetricsRequest.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): ListMetricsRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def metricNameAsScala(value: Option[String]): ListMetricsRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[DimensionFilter]]): ListMetricsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[DimensionFilter]
  }

  final def nextTokenAsScala(value: Option[String]): ListMetricsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListMetricsRequestOps(val self: ListMetricsRequest) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def dimensionsAsScala: Option[Seq[DimensionFilter]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DimensionFilter]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMetricsRequestOps {

  implicit def toListMetricsRequestBuilderOps(v: ListMetricsRequest.Builder): ListMetricsRequestBuilderOps =
    new ListMetricsRequestBuilderOps(v)

  implicit def toListMetricsRequestOps(v: ListMetricsRequest): ListMetricsRequestOps = new ListMetricsRequestOps(v)

}
