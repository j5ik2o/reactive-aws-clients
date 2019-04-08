// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ResultFieldBuilderOps(val self: ResultField.Builder) extends AnyVal {

  final def fieldAsScala(value: Option[String]): ResultField.Builder = {
    value.fold(self) { v =>
      self.field(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): ResultField.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class ResultFieldOps(val self: ResultField) extends AnyVal {

  final def fieldAsScala: Option[String] = Option(self.field) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResultFieldOps {

  implicit def toResultFieldBuilderOps(v: ResultField.Builder): ResultFieldBuilderOps = new ResultFieldBuilderOps(v)

  implicit def toResultFieldOps(v: ResultField): ResultFieldOps = new ResultFieldOps(v)

}
