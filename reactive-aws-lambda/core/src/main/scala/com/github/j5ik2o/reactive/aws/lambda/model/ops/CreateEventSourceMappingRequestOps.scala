// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateEventSourceMappingRequestBuilderOps(val self: CreateEventSourceMappingRequest.Builder)
    extends AnyVal {

  final def eventSourceArnAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  } // String

  final def functionNameAsScala(value: Option[String]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def enabledAsScala(value: Option[Boolean]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

  final def batchSizeAsScala(value: Option[Int]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  } // Int

  final def startingPositionAsScala(value: Option[EventSourcePosition]): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPosition(v)
    }
  } // EventSourcePosition

  final def startingPositionTimestampAsScala(
      value: Option[java.time.Instant]
  ): CreateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.startingPositionTimestamp(v)
    }
  } // java.time.Instant

}

final class CreateEventSourceMappingRequestOps(val self: CreateEventSourceMappingRequest) extends AnyVal {

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn) // String

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize) // Int

  final def startingPositionAsScala: Option[EventSourcePosition] = Option(self.startingPosition) // EventSourcePosition

  final def startingPositionTimestampAsScala: Option[java.time.Instant] =
    Option(self.startingPositionTimestamp) // java.time.Instant

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
