// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingResponseBuilderOps(val self: UpdateEventSourceMappingResponse.Builder)
    extends AnyVal {

  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  } // String

  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  } // Int

  final def eventSourceArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  } // String

  final def functionArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def lastProcessingResultAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  } // String

  final def stateAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def stateTransitionReasonAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  } // String

}

final class UpdateEventSourceMappingResponseOps(val self: UpdateEventSourceMappingResponse) extends AnyVal {

  final def uuidAsScala: Option[String] = Option(self.uuid) // String

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize) // Int

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn) // String

  final def functionArnAsScala: Option[String] = Option(self.functionArn) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

  final def lastProcessingResultAsScala: Option[String] = Option(self.lastProcessingResult) // String

  final def stateAsScala: Option[String] = Option(self.state) // String

  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason) // String

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
