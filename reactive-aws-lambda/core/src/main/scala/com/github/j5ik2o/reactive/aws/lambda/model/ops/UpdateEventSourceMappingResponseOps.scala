// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingResponseBuilderOps(val self: UpdateEventSourceMappingResponse.Builder)
    extends AnyVal {

  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  }

  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

  final def eventSourceArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  final def functionArnAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  final def lastModifiedAsScala(value: Option[java.time.Instant]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  final def lastProcessingResultAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.lastProcessingResult(v)
    }
  }

  final def stateAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def stateTransitionReasonAsScala(value: Option[String]): UpdateEventSourceMappingResponse.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  }

}

final class UpdateEventSourceMappingResponseOps(val self: UpdateEventSourceMappingResponse) extends AnyVal {

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
trait ToUpdateEventSourceMappingResponseOps {

  implicit def toUpdateEventSourceMappingResponseBuilderOps(
      v: UpdateEventSourceMappingResponse.Builder
  ): UpdateEventSourceMappingResponseBuilderOps = new UpdateEventSourceMappingResponseBuilderOps(v)

  implicit def toUpdateEventSourceMappingResponseOps(
      v: UpdateEventSourceMappingResponse
  ): UpdateEventSourceMappingResponseOps = new UpdateEventSourceMappingResponseOps(v)

}
