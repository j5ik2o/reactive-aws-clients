// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetEventSourceMappingResponseBuilderOps(val self: GetEventSourceMappingResponse.Builder) extends AnyVal {

  final def uuidAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  }

  final def batchSizeAsScala(value: Option[Int]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

  final def eventSourceArnAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  final def functionArnAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  final def lastModifiedAsScala(value: Option[java.time.Instant]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  final def lastProcessingResultAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  }

  final def stateAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def stateTransitionReasonAsScala(value: Option[String]): GetEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  }

}

final class GetEventSourceMappingResponseOps(val self: GetEventSourceMappingResponse) extends AnyVal {

  final def uuidAsScala: Option[String] = Option(self.uuid)

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  final def lastProcessingResultAsScala: Option[String] = Option(self.lastProcessingResult)

  final def stateAsScala: Option[String] = Option(self.state)

  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetEventSourceMappingResponseOps {

  implicit def toGetEventSourceMappingResponseBuilderOps(
      v: GetEventSourceMappingResponse.Builder
  ): GetEventSourceMappingResponseBuilderOps = new GetEventSourceMappingResponseBuilderOps(v)

  implicit def toGetEventSourceMappingResponseOps(v: GetEventSourceMappingResponse): GetEventSourceMappingResponseOps =
    new GetEventSourceMappingResponseOps(v)

}
