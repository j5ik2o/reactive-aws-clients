// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateEventSourceMappingRequestBuilderOps(val self: UpdateEventSourceMappingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala(value: Option[Int]): UpdateEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.batchSize(v)
    }
  }

}

final class UpdateEventSourceMappingRequestOps(val self: UpdateEventSourceMappingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala: Option[String] = Option(self.uuid)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def batchSizeAsScala: Option[Int] = Option(self.batchSize)

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
