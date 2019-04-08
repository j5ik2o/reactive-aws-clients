// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class OutputLogEventBuilderOps(val self: OutputLogEvent.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): OutputLogEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def messageAsScala(value: Option[String]): OutputLogEvent.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  final def ingestionTimeAsScala(value: Option[Long]): OutputLogEvent.Builder = {
    value.fold(self) { v =>
      self.ingestionTime(v)
    }
  }

}

final class OutputLogEventOps(val self: OutputLogEvent) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def messageAsScala: Option[String] = Option(self.message)

  final def ingestionTimeAsScala: Option[Long] = Option(self.ingestionTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputLogEventOps {

  implicit def toOutputLogEventBuilderOps(v: OutputLogEvent.Builder): OutputLogEventBuilderOps =
    new OutputLogEventBuilderOps(v)

  implicit def toOutputLogEventOps(v: OutputLogEvent): OutputLogEventOps = new OutputLogEventOps(v)

}
