// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataResultBuilderOps(val self: MetricDataResult.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def labelAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  final def timestampsAsScala(value: Option[Seq[java.time.Instant]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.timestamps(v.asJava)
    }
  }

  final def valuesAsScala(value: Option[Seq[Double]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    }
  }

  final def statusCodeAsScala(value: Option[StatusCode]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  }

  final def messagesAsScala(value: Option[Seq[MessageData]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messages(v.asJava)
    }
  }

}

final class MetricDataResultOps(val self: MetricDataResult) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def labelAsScala: Option[String] = Option(self.label)

  final def timestampsAsScala: Option[Seq[java.time.Instant]] = Option(self.timestamps).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def valuesAsScala: Option[Seq[Double]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  }

  final def statusCodeAsScala: Option[StatusCode] = Option(self.statusCode)

  final def messagesAsScala: Option[Seq[MessageData]] = Option(self.messages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataResultOps {

  implicit def toMetricDataResultBuilderOps(v: MetricDataResult.Builder): MetricDataResultBuilderOps =
    new MetricDataResultBuilderOps(v)

  implicit def toMetricDataResultOps(v: MetricDataResult): MetricDataResultOps = new MetricDataResultOps(v)

}
