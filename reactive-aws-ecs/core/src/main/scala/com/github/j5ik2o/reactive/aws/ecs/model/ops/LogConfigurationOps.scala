// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class LogConfigurationBuilderOps(val self: LogConfiguration.Builder) extends AnyVal {

  final def logDriverAsScala(value: Option[LogDriver]): LogConfiguration.Builder = {
    value.fold(self) { v =>
      self.logDriver(v)
    }
  }

  final def optionsAsScala(value: Option[Map[String, String]]): LogConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.options(v.asJava)
    }
  }

}

final class LogConfigurationOps(val self: LogConfiguration) extends AnyVal {

  final def logDriverAsScala: Option[LogDriver] = Option(self.logDriver)

  final def optionsAsScala: Option[Map[String, String]] = Option(self.options).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogConfigurationOps {

  implicit def toLogConfigurationBuilderOps(v: LogConfiguration.Builder): LogConfigurationBuilderOps =
    new LogConfigurationBuilderOps(v)

  implicit def toLogConfigurationOps(v: LogConfiguration): LogConfigurationOps = new LogConfigurationOps(v)

}
