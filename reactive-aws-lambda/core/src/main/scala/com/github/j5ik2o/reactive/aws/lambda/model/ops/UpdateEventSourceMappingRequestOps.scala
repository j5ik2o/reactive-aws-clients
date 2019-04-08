// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingRequestBuilderOps(val self: UpdateEventSourceMappingRequest.Builder)
    extends AnyVal {

  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  } // String

  final def functionNameAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def enabledAsScala(value: Option[Boolean]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  } // Int

}

final class UpdateEventSourceMappingRequestOps(val self: UpdateEventSourceMappingRequest) extends AnyVal {

  final def uuidAsScala: Option[String] = Option(self.uuid) // String

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

  final def batchSizeAsScala: Option[Int] = Option(self.batchSize) // Int

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
