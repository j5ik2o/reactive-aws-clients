// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ResultFieldBuilderOps(val self: ResultField.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldAsScala(value: Option[String]): ResultField.Builder = {
    value.fold(self) { v => self.field(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): ResultField.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class ResultFieldOps(val self: ResultField) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldAsScala: Option[String] = Option(self.field)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResultFieldOps {

  implicit def toResultFieldBuilderOps(v: ResultField.Builder): ResultFieldBuilderOps = new ResultFieldBuilderOps(v)

  implicit def toResultFieldOps(v: ResultField): ResultFieldOps = new ResultFieldOps(v)

}
