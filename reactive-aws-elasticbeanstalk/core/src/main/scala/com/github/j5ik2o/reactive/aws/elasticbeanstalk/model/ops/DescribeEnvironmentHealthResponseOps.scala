// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentHealthResponseBuilderOps(val self: DescribeEnvironmentHealthResponse.Builder)
    extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def healthStatusAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  } // String

  final def statusAsScala(value: Option[EnvironmentHealth]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def colorAsScala(value: Option[String]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.color(v)
    }
  } // String

  final def causesAsScala(value: Option[Seq[String]]): DescribeEnvironmentHealthResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.causes(v.asJava)
    } // Seq[String]
  }

  final def applicationMetricsAsScala(value: Option[ApplicationMetrics]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.applicationMetrics(v)
    }
  } // ApplicationMetrics

  final def instancesHealthAsScala(value: Option[InstanceHealthSummary]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.instancesHealth(v)
    }
  } // InstanceHealthSummary

  final def refreshedAtAsScala(value: Option[java.time.Instant]): DescribeEnvironmentHealthResponse.Builder = {
    value.fold(self) { v =>
      self.refreshedAt(v)
    }
  } // Instant

}

final class DescribeEnvironmentHealthResponseOps(val self: DescribeEnvironmentHealthResponse) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def healthStatusAsScala: Option[String] = Option(self.healthStatus) // String

  final def statusAsScala: Option[EnvironmentHealth] = Option(self.status) // String

  final def colorAsScala: Option[String] = Option(self.color) // String

  final def causesAsScala: Option[Seq[String]] = Option(self.causes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def applicationMetricsAsScala: Option[ApplicationMetrics] =
    Option(self.applicationMetrics) // ApplicationMetrics

  final def instancesHealthAsScala: Option[InstanceHealthSummary] =
    Option(self.instancesHealth) // InstanceHealthSummary

  final def refreshedAtAsScala: Option[java.time.Instant] = Option(self.refreshedAt) // Instant

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
