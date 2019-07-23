// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricDataResultBuilderOps(val self: MetricDataResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[String]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampsAsScala(value: Option[Seq[java.time.Instant]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.timestamps(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[Seq[Double]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.values(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(value: Option[StatusCode]): MetricDataResult.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala(value: Option[Seq[MessageData]]): MetricDataResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messages(v.asJava)
    }
  }

}

final class MetricDataResultOps(val self: MetricDataResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[String] = Option(self.label)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampsAsScala: Option[Seq[java.time.Instant]] = Option(self.timestamps).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[Seq[Double]] = Option(self.values).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.doubleValue())
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[StatusCode] = Option(self.statusCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala: Option[Seq[MessageData]] = Option(self.messages).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricDataResultOps {

  implicit def toMetricDataResultBuilderOps(v: MetricDataResult.Builder): MetricDataResultBuilderOps =
    new MetricDataResultBuilderOps(v)

  implicit def toMetricDataResultOps(v: MetricDataResult): MetricDataResultOps = new MetricDataResultOps(v)

}
