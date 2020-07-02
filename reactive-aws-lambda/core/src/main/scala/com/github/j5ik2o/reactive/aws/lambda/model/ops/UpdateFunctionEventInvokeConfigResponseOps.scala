// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionEventInvokeConfigResponseBuilderOps(val self: UpdateFunctionEventInvokeConfigResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): UpdateFunctionEventInvokeConfigResponse.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala(value: Option[String]): UpdateFunctionEventInvokeConfigResponse.Builder = {
    value.fold(self) { v => self.functionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala(value: Option[Int]): UpdateFunctionEventInvokeConfigResponse.Builder = {
    value.fold(self) { v => self.maximumRetryAttempts(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumEventAgeInSecondsAsScala(value: Option[Int]): UpdateFunctionEventInvokeConfigResponse.Builder = {
    value.fold(self) { v => self.maximumEventAgeInSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala(
      value: Option[DestinationConfig]
  ): UpdateFunctionEventInvokeConfigResponse.Builder = {
    value.fold(self) { v => self.destinationConfig(v) }
  }

}

final class UpdateFunctionEventInvokeConfigResponseOps(val self: UpdateFunctionEventInvokeConfigResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala: Option[Int] = Option(self.maximumRetryAttempts)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumEventAgeInSecondsAsScala: Option[Int] = Option(self.maximumEventAgeInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala: Option[DestinationConfig] = Option(self.destinationConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionEventInvokeConfigResponseOps {

  implicit def toUpdateFunctionEventInvokeConfigResponseBuilderOps(
      v: UpdateFunctionEventInvokeConfigResponse.Builder
  ): UpdateFunctionEventInvokeConfigResponseBuilderOps = new UpdateFunctionEventInvokeConfigResponseBuilderOps(v)

  implicit def toUpdateFunctionEventInvokeConfigResponseOps(
      v: UpdateFunctionEventInvokeConfigResponse
  ): UpdateFunctionEventInvokeConfigResponseOps = new UpdateFunctionEventInvokeConfigResponseOps(v)

}
