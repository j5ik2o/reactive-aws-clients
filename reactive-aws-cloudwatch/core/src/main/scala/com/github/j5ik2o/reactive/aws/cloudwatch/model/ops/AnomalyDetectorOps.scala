// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class AnomalyDetectorBuilderOps(val self: AnomalyDetector.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): AnomalyDetector.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): AnomalyDetector.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): AnomalyDetector.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala(value: Option[String]): AnomalyDetector.Builder = {
    value.fold(self) { v =>
      self.stat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationAsScala(value: Option[AnomalyDetectorConfiguration]): AnomalyDetector.Builder = {
    value.fold(self) { v =>
      self.configuration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala(value: Option[AnomalyDetectorStateValue]): AnomalyDetector.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  }

}

final class AnomalyDetectorOps(val self: AnomalyDetector) extends AnyVal {

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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala: Option[AnomalyDetectorStateValue] = Option(self.stateValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnomalyDetectorOps {

  implicit def toAnomalyDetectorBuilderOps(v: AnomalyDetector.Builder): AnomalyDetectorBuilderOps =
    new AnomalyDetectorBuilderOps(v)

  implicit def toAnomalyDetectorOps(v: AnomalyDetector): AnomalyDetectorOps = new AnomalyDetectorOps(v)

}
