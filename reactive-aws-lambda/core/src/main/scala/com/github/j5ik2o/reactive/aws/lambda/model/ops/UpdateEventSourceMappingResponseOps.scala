// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingResponseBuilderOps(val self: UpdateEventSourceMappingResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.maximumBatchingWindowInSeconds(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parallelizationFactorAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.parallelizationFactor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastProcessingResultAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateTransitionReasonAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala(value: Option[DestinationConfig]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.destinationConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRecordAgeInSecondsAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.maximumRecordAgeInSeconds(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bisectBatchOnFunctionErrorAsScala(value: Option[Boolean]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.bisectBatchOnFunctionError(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.maximumRetryAttempts(v)
    }
  }

}

final class UpdateEventSourceMappingResponseOps(val self: UpdateEventSourceMappingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala: Option[String] = Option(self.uuid)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala: Option[Int] = Option(self.maximumBatchingWindowInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parallelizationFactorAsScala: Option[Int] = Option(self.parallelizationFactor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastProcessingResultAsScala: Option[String] = Option(self.lastProcessingResult)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationConfigAsScala: Option[DestinationConfig] = Option(self.destinationConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRecordAgeInSecondsAsScala: Option[Int] = Option(self.maximumRecordAgeInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bisectBatchOnFunctionErrorAsScala: Option[Boolean] = Option(self.bisectBatchOnFunctionError)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumRetryAttemptsAsScala: Option[Int] = Option(self.maximumRetryAttempts)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateEventSourceMappingResponseOps {

  implicit def toUpdateEventSourceMappingResponseBuilderOps(
      v: UpdateEventSourceMappingResponse.Builder
  ): UpdateEventSourceMappingResponseBuilderOps = new UpdateEventSourceMappingResponseBuilderOps(v)

  implicit def toUpdateEventSourceMappingResponseOps(
      v: UpdateEventSourceMappingResponse
  ): UpdateEventSourceMappingResponseOps = new UpdateEventSourceMappingResponseOps(v)

}
