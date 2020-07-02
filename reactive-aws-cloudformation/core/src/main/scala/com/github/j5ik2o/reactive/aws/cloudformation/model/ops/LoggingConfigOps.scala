// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class LoggingConfigBuilderOps(val self: LoggingConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logRoleArnAsScala(value: Option[String]): LoggingConfig.Builder = {
    value.fold(self) { v => self.logRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): LoggingConfig.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

}

final class LoggingConfigOps(val self: LoggingConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logRoleArnAsScala: Option[String] = Option(self.logRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoggingConfigOps {

  implicit def toLoggingConfigBuilderOps(v: LoggingConfig.Builder): LoggingConfigBuilderOps =
    new LoggingConfigBuilderOps(v)

  implicit def toLoggingConfigOps(v: LoggingConfig): LoggingConfigOps = new LoggingConfigOps(v)

}
