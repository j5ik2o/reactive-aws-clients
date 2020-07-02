// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogGroupBuilderOps(val self: LogGroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[Long]): LogGroup.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionInDaysAsScala(value: Option[Int]): LogGroup.Builder = {
    value.fold(self) { v => self.retentionInDays(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricFilterCountAsScala(value: Option[Int]): LogGroup.Builder = {
    value.fold(self) { v => self.metricFilterCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storedBytesAsScala(value: Option[Long]): LogGroup.Builder = {
    value.fold(self) { v => self.storedBytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

}

final class LogGroupOps(val self: LogGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionInDaysAsScala: Option[Int] = Option(self.retentionInDays)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricFilterCountAsScala: Option[Int] = Option(self.metricFilterCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storedBytesAsScala: Option[Long] = Option(self.storedBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogGroupOps {

  implicit def toLogGroupBuilderOps(v: LogGroup.Builder): LogGroupBuilderOps = new LogGroupBuilderOps(v)

  implicit def toLogGroupOps(v: LogGroup): LogGroupOps = new LogGroupOps(v)

}
