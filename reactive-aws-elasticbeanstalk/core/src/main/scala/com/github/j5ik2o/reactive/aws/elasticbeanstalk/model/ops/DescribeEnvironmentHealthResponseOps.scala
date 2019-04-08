// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentHealthResponseBuilderOps(val self: DescribeEnvironmentHealthResponse.Builder)
    extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def healthStatusAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  final def statusAsScala(value: Option[EnvironmentHealth]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def colorAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.color(v)
    }
  }

  final def causesAsScala(value: Option[Seq[String]]): DescribeEnvironmentHealthResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.causes(v.asJava)
    }
  }

  final def applicationMetricsAsScala(value: Option[ApplicationMetrics]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.applicationMetrics(v)
    }
  }

  final def instancesHealthAsScala(value: Option[InstanceHealthSummary]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.instancesHealth(v)
    }
  }

  final def refreshedAtAsScala(value: Option[java.time.Instant]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.refreshedAt(v)
    }
  }

}

final class DescribeEnvironmentHealthResponseOps(val self: DescribeEnvironmentHealthResponse) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def healthStatusAsScala: Option[String] = Option(self.healthStatus)

  final def statusAsScala: Option[EnvironmentHealth] = Option(self.status)

  final def colorAsScala: Option[String] = Option(self.color)

  final def causesAsScala: Option[Seq[String]] = Option(self.causes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def applicationMetricsAsScala: Option[ApplicationMetrics] = Option(self.applicationMetrics)

  final def instancesHealthAsScala: Option[InstanceHealthSummary] = Option(self.instancesHealth)

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
