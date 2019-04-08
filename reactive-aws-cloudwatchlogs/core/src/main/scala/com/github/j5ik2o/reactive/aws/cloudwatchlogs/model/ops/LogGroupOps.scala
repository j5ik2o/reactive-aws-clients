// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogGroupBuilderOps(val self: LogGroup.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def creationTimeAsScala(value: Option[Long]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

  final def retentionInDaysAsScala(value: Option[Int]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.retentionInDays(v)
    }
  } // Int

  final def metricFilterCountAsScala(value: Option[Int]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.metricFilterCount(v)
    }
  } // Int

  final def arnAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def storedBytesAsScala(value: Option[Long]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.storedBytes(v)
    }
  } // Long

  final def kmsKeyIdAsScala(value: Option[String]): LogGroup.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  } // String

}

final class LogGroupOps(val self: LogGroup) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

  final def retentionInDaysAsScala: Option[Int] = Option(self.retentionInDays) // Int

  final def metricFilterCountAsScala: Option[Int] = Option(self.metricFilterCount) // Int

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def storedBytesAsScala: Option[Long] = Option(self.storedBytes) // Long

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogGroupOps {

  implicit def toLogGroupBuilderOps(v: LogGroup.Builder): LogGroupBuilderOps = new LogGroupBuilderOps(v)

  implicit def toLogGroupOps(v: LogGroup): LogGroupOps = new LogGroupOps(v)

}
