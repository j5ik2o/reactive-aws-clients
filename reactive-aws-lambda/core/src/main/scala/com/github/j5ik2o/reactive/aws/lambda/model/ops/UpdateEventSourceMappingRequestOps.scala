// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingRequestBuilderOps(val self: UpdateEventSourceMappingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.uuid(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.batchSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.maximumBatchingWindowInSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala(value: Option[DestinationConfig]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.destinationConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRecordAgeInSecondsAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.maximumRecordAgeInSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bisectBatchOnFunctionErrorAsScala(value: Option[Boolean]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.bisectBatchOnFunctionError(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.maximumRetryAttempts(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parallelizationFactorAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v => self.parallelizationFactor(v) }
  }

}

final class UpdateEventSourceMappingRequestOps(val self: UpdateEventSourceMappingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala: Option[String] = Option(self.uuid)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala: Option[Int] = Option(self.maximumBatchingWindowInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala: Option[DestinationConfig] = Option(self.destinationConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRecordAgeInSecondsAsScala: Option[Int] = Option(self.maximumRecordAgeInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bisectBatchOnFunctionErrorAsScala: Option[Boolean] = Option(self.bisectBatchOnFunctionError)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala: Option[Int] = Option(self.maximumRetryAttempts)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parallelizationFactorAsScala: Option[Int] = Option(self.parallelizationFactor)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateEventSourceMappingRequestOps {

  implicit def toUpdateEventSourceMappingRequestBuilderOps(
      v: UpdateEventSourceMappingRequest.Builder
  ): UpdateEventSourceMappingRequestBuilderOps = new UpdateEventSourceMappingRequestBuilderOps(v)

  implicit def toUpdateEventSourceMappingRequestOps(
      v: UpdateEventSourceMappingRequest
  ): UpdateEventSourceMappingRequestOps = new UpdateEventSourceMappingRequestOps(v)

}
