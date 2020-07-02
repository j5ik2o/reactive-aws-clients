// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentHealthResponseBuilderOps(val self: DescribeEnvironmentHealthResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.healthStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[EnvironmentHealth]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def colorAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.color(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def causesAsScala(value: Option[Seq[String]]): DescribeEnvironmentHealthResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.causes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationMetricsAsScala(value: Option[ApplicationMetrics]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.applicationMetrics(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesHealthAsScala(value: Option[InstanceHealthSummary]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.instancesHealth(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def refreshedAtAsScala(value: Option[java.time.Instant]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v => self.refreshedAt(v) }
  }

}

final class DescribeEnvironmentHealthResponseOps(val self: DescribeEnvironmentHealthResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala: Option[String] = Option(self.healthStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[EnvironmentHealth] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def colorAsScala: Option[String] = Option(self.color)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def causesAsScala: Option[Seq[String]] =
    Option(self.causes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationMetricsAsScala: Option[ApplicationMetrics] = Option(self.applicationMetrics)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesHealthAsScala: Option[InstanceHealthSummary] = Option(self.instancesHealth)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def refreshedAtAsScala: Option[java.time.Instant] = Option(self.refreshedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentHealthResponseOps {

  implicit def toDescribeEnvironmentHealthResponseBuilderOps(
      v: DescribeEnvironmentHealthResponse.Builder
  ): DescribeEnvironmentHealthResponseBuilderOps = new DescribeEnvironmentHealthResponseBuilderOps(v)

  implicit def toDescribeEnvironmentHealthResponseOps(
      v: DescribeEnvironmentHealthResponse
  ): DescribeEnvironmentHealthResponseOps = new DescribeEnvironmentHealthResponseOps(v)

}
