// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataResultBuilderOps(val self: MetricDataResult.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def labelAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  } // String

  final def timestampsAsScala(value: Option[Seq[java.time.Instant]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.timestamps(v.asJava)
    } // Seq[Instant]
  }

  final def valuesAsScala(value: Option[Seq[Double]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    } // Seq[Double]
  }

  final def statusCodeAsScala(value: Option[StatusCode]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  } // String

  final def messagesAsScala(value: Option[Seq[MessageData]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messages(v.asJava)
    } // Seq[MessageData]
  }

}

final class MetricDataResultOps(val self: MetricDataResult) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def labelAsScala: Option[String] = Option(self.label) // String

  final def timestampsAsScala: Option[Seq[java.time.Instant]] = Option(self.timestamps).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Instant]

  final def valuesAsScala: Option[Seq[Double]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  } // Seq[Double]

  final def statusCodeAsScala: Option[StatusCode] = Option(self.statusCode) // String

  final def messagesAsScala: Option[Seq[MessageData]] = Option(self.messages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MessageData]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataResultOps {

  implicit def toMetricDataResultBuilderOps(v: MetricDataResult.Builder): MetricDataResultBuilderOps =
    new MetricDataResultBuilderOps(v)

  implicit def toMetricDataResultOps(v: MetricDataResult): MetricDataResultOps = new MetricDataResultOps(v)

}
