// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SingleInstanceHealthBuilderOps(val self: SingleInstanceHealth.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.healthStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def colorAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.color(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def causesAsScala(value: Option[Seq[String]]): SingleInstanceHealth.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.causes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchedAtAsScala(value: Option[java.time.Instant]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.launchedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationMetricsAsScala(value: Option[ApplicationMetrics]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.applicationMetrics(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemAsScala(value: Option[SystemStatus]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.system(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentAsScala(value: Option[Deployment]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.deployment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): SingleInstanceHealth.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

}

final class SingleInstanceHealthOps(val self: SingleInstanceHealth) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala: Option[String] = Option(self.healthStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def colorAsScala: Option[String] = Option(self.color)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def causesAsScala: Option[Seq[String]] =
    Option(self.causes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchedAtAsScala: Option[java.time.Instant] = Option(self.launchedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationMetricsAsScala: Option[ApplicationMetrics] = Option(self.applicationMetrics)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemAsScala: Option[SystemStatus] = Option(self.system)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentAsScala: Option[Deployment] = Option(self.deployment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSingleInstanceHealthOps {

  implicit def toSingleInstanceHealthBuilderOps(v: SingleInstanceHealth.Builder): SingleInstanceHealthBuilderOps =
    new SingleInstanceHealthBuilderOps(v)

  implicit def toSingleInstanceHealthOps(v: SingleInstanceHealth): SingleInstanceHealthOps =
    new SingleInstanceHealthOps(v)

}
