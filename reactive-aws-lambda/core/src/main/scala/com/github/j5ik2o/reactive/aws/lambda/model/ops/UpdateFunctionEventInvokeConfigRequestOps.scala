// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionEventInvokeConfigRequestBuilderOps(val self: UpdateFunctionEventInvokeConfigRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): UpdateFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala(value: Option[Int]): UpdateFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v => self.maximumRetryAttempts(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumEventAgeInSecondsAsScala(value: Option[Int]): UpdateFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v => self.maximumEventAgeInSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala(
      value: Option[DestinationConfig]
  ): UpdateFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v => self.destinationConfig(v) }
  }

}

final class UpdateFunctionEventInvokeConfigRequestOps(val self: UpdateFunctionEventInvokeConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala: Option[Int] = Option(self.maximumRetryAttempts)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumEventAgeInSecondsAsScala: Option[Int] = Option(self.maximumEventAgeInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala: Option[DestinationConfig] = Option(self.destinationConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionEventInvokeConfigRequestOps {

  implicit def toUpdateFunctionEventInvokeConfigRequestBuilderOps(
      v: UpdateFunctionEventInvokeConfigRequest.Builder
  ): UpdateFunctionEventInvokeConfigRequestBuilderOps = new UpdateFunctionEventInvokeConfigRequestBuilderOps(v)

  implicit def toUpdateFunctionEventInvokeConfigRequestOps(
      v: UpdateFunctionEventInvokeConfigRequest
  ): UpdateFunctionEventInvokeConfigRequestOps = new UpdateFunctionEventInvokeConfigRequestOps(v)

}
