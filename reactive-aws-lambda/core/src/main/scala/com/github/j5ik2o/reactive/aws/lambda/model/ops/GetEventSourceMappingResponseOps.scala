// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetEventSourceMappingResponseBuilderOps(val self: GetEventSourceMappingResponse.Builder) extends AnyVal {

  final def uuidAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  } // String

  final def batchSizeAsScala(value: Option[Int]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  } // Int

  final def eventSourceArnAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  } // String

  final def functionArnAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def lastProcessingResultAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  } // String

  final def stateAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def stateTransitionReasonAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  } // String

}

final class GetEventSourceMappingResponseOps(val self: GetEventSourceMappingResponse) extends AnyVal {

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
trait ToGetEventSourceMappingResponseOps {

  implicit def toGetEventSourceMappingResponseBuilderOps(
      v: GetEventSourceMappingResponse.Builder
  ): GetEventSourceMappingResponseBuilderOps = new GetEventSourceMappingResponseBuilderOps(v)

  implicit def toGetEventSourceMappingResponseOps(v: GetEventSourceMappingResponse): GetEventSourceMappingResponseOps =
    new GetEventSourceMappingResponseOps(v)

}
