// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateEventSourceMappingResponseBuilderOps(val self: CreateEventSourceMappingResponse.Builder)
    extends AnyVal {

  final def uuidAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  } // String

  final def batchSizeAsScala(value: Option[Int]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  } // Int

  final def eventSourceArnAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  } // String

  final def functionArnAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // java.time.Instant

  final def lastProcessingResultAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  } // String

  final def stateAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def stateTransitionReasonAsScala(value: Option[String]): CreateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  } // String

}

final class CreateEventSourceMappingResponseOps(val self: CreateEventSourceMappingResponse) extends AnyVal {

  final def uuidAsScala: Option[String] = Option(self.uuid) // String

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize) // Int

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn) // String

  final def functionArnAsScala: Option[String] = Option(self.functionArn) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // java.time.Instant

  final def lastProcessingResultAsScala: Option[String] = Option(self.lastProcessingResult) // String

  final def stateAsScala: Option[String] = Option(self.state) // String

  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEventSourceMappingResponseOps {

  implicit def toCreateEventSourceMappingResponseBuilderOps(
      v: CreateEventSourceMappingResponse.Builder
  ): CreateEventSourceMappingResponseBuilderOps = new CreateEventSourceMappingResponseBuilderOps(v)

  implicit def toCreateEventSourceMappingResponseOps(
      v: CreateEventSourceMappingResponse
  ): CreateEventSourceMappingResponseOps = new CreateEventSourceMappingResponseOps(v)

}
