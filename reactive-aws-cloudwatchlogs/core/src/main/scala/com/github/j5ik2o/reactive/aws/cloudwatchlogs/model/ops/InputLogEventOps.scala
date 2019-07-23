// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class InputLogEventBuilderOps(val self: InputLogEvent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[Long]): InputLogEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): InputLogEvent.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class InputLogEventOps(val self: InputLogEvent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInputLogEventOps {

  implicit def toInputLogEventBuilderOps(v: InputLogEvent.Builder): InputLogEventBuilderOps =
    new InputLogEventBuilderOps(v)

  implicit def toInputLogEventOps(v: InputLogEvent): InputLogEventOps = new InputLogEventOps(v)

}
