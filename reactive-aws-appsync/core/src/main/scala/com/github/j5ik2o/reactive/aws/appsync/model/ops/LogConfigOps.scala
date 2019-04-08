// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class LogConfigBuilderOps(val self: LogConfig.Builder) extends AnyVal {

  final def fieldLogLevelAsScala(value: Option[FieldLogLevel]): LogConfig.Builder = {
    value.fold(self) { v =>
      self.fieldLogLevel(v)
    }
  }

  final def cloudWatchLogsRoleArnAsScala(value: Option[String]): LogConfig.Builder = {
    value.fold(self) { v =>
      self.cloudWatchLogsRoleArn(v)
    }
  }

}

final class LogConfigOps(val self: LogConfig) extends AnyVal {

  final def fieldLogLevelAsScala: Option[FieldLogLevel] = Option(self.fieldLogLevel)

  final def cloudWatchLogsRoleArnAsScala: Option[String] = Option(self.cloudWatchLogsRoleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogConfigOps {

  implicit def toLogConfigBuilderOps(v: LogConfig.Builder): LogConfigBuilderOps = new LogConfigBuilderOps(v)

  implicit def toLogConfigOps(v: LogConfig): LogConfigOps = new LogConfigOps(v)

}
