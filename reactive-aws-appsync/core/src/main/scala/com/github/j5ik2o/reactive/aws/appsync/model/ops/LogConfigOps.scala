// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class LogConfigBuilderOps(val self: LogConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldLogLevelAsScala(value: Option[FieldLogLevel]): LogConfig.Builder = {
    value.fold(self) { v =>
      self.fieldLogLevel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudWatchLogsRoleArnAsScala(value: Option[String]): LogConfig.Builder = {
    value.fold(self) { v =>
      self.cloudWatchLogsRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludeVerboseContentAsScala(value: Option[Boolean]): LogConfig.Builder = {
    value.fold(self) { v =>
      self.excludeVerboseContent(v)
    }
  }

}

final class LogConfigOps(val self: LogConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldLogLevelAsScala: Option[FieldLogLevel] = Option(self.fieldLogLevel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudWatchLogsRoleArnAsScala: Option[String] = Option(self.cloudWatchLogsRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludeVerboseContentAsScala: Option[Boolean] = Option(self.excludeVerboseContent)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogConfigOps {

  implicit def toLogConfigBuilderOps(v: LogConfig.Builder): LogConfigBuilderOps = new LogConfigBuilderOps(v)

  implicit def toLogConfigOps(v: LogConfig): LogConfigOps = new LogConfigOps(v)

}
