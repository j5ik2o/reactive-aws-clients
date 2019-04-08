// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateEventSourceMappingRequestBuilderOps(val self: CreateEventSourceMappingRequest.Builder)
    extends AnyVal {

  final def eventSourceArnAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  final def functionNameAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def enabledAsScala(value: Option[Boolean]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  final def batchSizeAsScala(value: Option[Int]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

  final def startingPositionAsScala(value: Option[EventSourcePosition]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPosition(v)
    }
  }

  final def startingPositionTimestampAsScala(
      value: Option[java.time.Instant]
  ): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPositionTimestamp(v)
    }
  }

}

final class CreateEventSourceMappingRequestOps(val self: CreateEventSourceMappingRequest) extends AnyVal {

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

  final def startingPositionAsScala: Option[EventSourcePosition] = Option(self.startingPosition)

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
