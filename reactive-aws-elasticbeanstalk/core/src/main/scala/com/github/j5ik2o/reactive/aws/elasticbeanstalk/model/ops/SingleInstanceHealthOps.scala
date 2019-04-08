// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SingleInstanceHealthBuilderOps(val self: SingleInstanceHealth.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  } // String

  final def healthStatusAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  } // String

  final def colorAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.color(v)
    }
  } // String

  final def causesAsScala(value: Option[Seq[String]]): SingleInstanceHealth.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.causes(v.asJava)
    } // Seq[String]
  }

  final def launchedAtAsScala(value: Option[java.time.Instant]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.launchedAt(v)
    }
  } // Instant

  final def applicationMetricsAsScala(value: Option[ApplicationMetrics]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.applicationMetrics(v)
    }
  } // ApplicationMetrics

  final def systemAsScala(value: Option[SystemStatus]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.system(v)
    }
  } // SystemStatus

  final def deploymentAsScala(value: Option[Deployment]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.deployment(v)
    }
  } // Deployment

  final def availabilityZoneAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  } // String

  final def instanceTypeAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  } // String

}

final class SingleInstanceHealthOps(val self: SingleInstanceHealth) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId) // String

  final def healthStatusAsScala: Option[String] = Option(self.healthStatus) // String

  final def colorAsScala: Option[String] = Option(self.color) // String

  final def causesAsScala: Option[Seq[String]] = Option(self.causes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def launchedAtAsScala: Option[java.time.Instant] = Option(self.launchedAt) // Instant

  final def applicationMetricsAsScala: Option[ApplicationMetrics] =
    Option(self.applicationMetrics) // ApplicationMetrics

  final def systemAsScala: Option[SystemStatus] = Option(self.system) // SystemStatus

  final def deploymentAsScala: Option[Deployment] = Option(self.deployment) // Deployment

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) // String

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSingleInstanceHealthOps {

  implicit def toSingleInstanceHealthBuilderOps(v: SingleInstanceHealth.Builder): SingleInstanceHealthBuilderOps =
    new SingleInstanceHealthBuilderOps(v)

  implicit def toSingleInstanceHealthOps(v: SingleInstanceHealth): SingleInstanceHealthOps =
    new SingleInstanceHealthOps(v)

}
