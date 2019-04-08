// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class LogGroupFieldBuilderOps(val self: LogGroupField.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): LogGroupField.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def percentAsScala(value: Option[Int]): LogGroupField.Builder = {
    value.fold(self) { v =>
      self.percent(v)
    }
  }

}

final class LogGroupFieldOps(val self: LogGroupField) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def percentAsScala: Option[Int] = Option(self.percent)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogGroupFieldOps {

  implicit def toLogGroupFieldBuilderOps(v: LogGroupField.Builder): LogGroupFieldBuilderOps =
    new LogGroupFieldBuilderOps(v)

  implicit def toLogGroupFieldOps(v: LogGroupField): LogGroupFieldOps = new LogGroupFieldOps(v)

}
