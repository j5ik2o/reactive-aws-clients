// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateEventSourceMappingRequestBuilderOps(val self: CreateEventSourceMappingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala(value: Option[Int]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala(value: Option[Int]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.maximumBatchingWindowInSeconds(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingPositionAsScala(value: Option[EventSourcePosition]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPosition(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingPositionTimestampAsScala(
      value: Option[java.time.Instant]
  ): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPositionTimestamp(v)
    }
  }

}

final class CreateEventSourceMappingRequestOps(val self: CreateEventSourceMappingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBatchingWindowInSecondsAsScala: Option[Int] = Option(self.maximumBatchingWindowInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingPositionAsScala: Option[EventSourcePosition] = Option(self.startingPosition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingPositionTimestampAsScala: Option[java.time.Instant] = Option(self.startingPositionTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEventSourceMappingRequestOps {

  implicit def toCreateEventSourceMappingRequestBuilderOps(
      v: CreateEventSourceMappingRequest.Builder
  ): CreateEventSourceMappingRequestBuilderOps = new CreateEventSourceMappingRequestBuilderOps(v)

  implicit def toCreateEventSourceMappingRequestOps(
      v: CreateEventSourceMappingRequest
  ): CreateEventSourceMappingRequestOps = new CreateEventSourceMappingRequestOps(v)

}
