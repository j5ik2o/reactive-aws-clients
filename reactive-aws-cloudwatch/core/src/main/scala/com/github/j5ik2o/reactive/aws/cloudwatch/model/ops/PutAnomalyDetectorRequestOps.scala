// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutAnomalyDetectorRequestBuilderOps(val self: PutAnomalyDetectorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): PutAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): PutAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): PutAnomalyDetectorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala(value: Option[String]): PutAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.stat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationAsScala(value: Option[AnomalyDetectorConfiguration]): PutAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.configuration(v)
    }
  }

}

final class PutAnomalyDetectorRequestOps(val self: PutAnomalyDetectorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala: Option[String] = Option(self.stat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationAsScala: Option[AnomalyDetectorConfiguration] = Option(self.configuration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAnomalyDetectorRequestOps {

  implicit def toPutAnomalyDetectorRequestBuilderOps(
      v: PutAnomalyDetectorRequest.Builder
  ): PutAnomalyDetectorRequestBuilderOps = new PutAnomalyDetectorRequestBuilderOps(v)

  implicit def toPutAnomalyDetectorRequestOps(v: PutAnomalyDetectorRequest): PutAnomalyDetectorRequestOps =
    new PutAnomalyDetectorRequestOps(v)

}
