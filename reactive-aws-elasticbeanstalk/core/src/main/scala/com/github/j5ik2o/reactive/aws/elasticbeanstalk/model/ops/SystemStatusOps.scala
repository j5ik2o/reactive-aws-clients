// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SystemStatusBuilderOps(val self: SystemStatus.Builder) extends AnyVal {

  final def cpuUtilizationAsScala(value: Option[CPUUtilization]): SystemStatus.Builder = {
    value.fold(self) { v =>
      self.cpuUtilization(v)
    }
  }

  final def loadAverageAsScala(value: Option[Seq[Double]]): SystemStatus.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.loadAverage(v.asJava)
    }
  }

}

final class SystemStatusOps(val self: SystemStatus) extends AnyVal {

  final def cpuUtilizationAsScala: Option[CPUUtilization] = Option(self.cpuUtilization)

  final def loadAverageAsScala: Option[Seq[Double]] = Option(self.loadAverage).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSystemStatusOps {

  implicit def toSystemStatusBuilderOps(v: SystemStatus.Builder): SystemStatusBuilderOps = new SystemStatusBuilderOps(v)

  implicit def toSystemStatusOps(v: SystemStatus): SystemStatusOps = new SystemStatusOps(v)

}
