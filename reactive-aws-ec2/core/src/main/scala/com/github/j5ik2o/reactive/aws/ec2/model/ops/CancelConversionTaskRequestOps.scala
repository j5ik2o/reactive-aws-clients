// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelConversionTaskRequestBuilderOps(val self: CancelConversionTaskRequest.Builder) extends AnyVal {

  final def conversionTaskIdAsScala(value: Option[String]): CancelConversionTaskRequest.Builder = {
    value.fold(self) { v =>
      self.conversionTaskId(v)
    }
  }

  final def reasonMessageAsScala(value: Option[String]): CancelConversionTaskRequest.Builder = {
    value.fold(self) { v =>
      self.reasonMessage(v)
    }
  }

}

final class CancelConversionTaskRequestOps(val self: CancelConversionTaskRequest) extends AnyVal {

  final def conversionTaskIdAsScala: Option[String] = Option(self.conversionTaskId)

  final def reasonMessageAsScala: Option[String] = Option(self.reasonMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelConversionTaskRequestOps {

  implicit def toCancelConversionTaskRequestBuilderOps(
      v: CancelConversionTaskRequest.Builder
  ): CancelConversionTaskRequestBuilderOps = new CancelConversionTaskRequestBuilderOps(v)

  implicit def toCancelConversionTaskRequestOps(v: CancelConversionTaskRequest): CancelConversionTaskRequestOps =
    new CancelConversionTaskRequestOps(v)

}
