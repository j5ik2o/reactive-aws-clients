// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetEventSourceMappingRequestBuilderOps(val self: GetEventSourceMappingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala(value: Option[String]): GetEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  }

}

final class GetEventSourceMappingRequestOps(val self: GetEventSourceMappingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uuidAsScala: Option[String] = Option(self.uuid)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetEventSourceMappingRequestOps {

  implicit def toGetEventSourceMappingRequestBuilderOps(
      v: GetEventSourceMappingRequest.Builder
  ): GetEventSourceMappingRequestBuilderOps = new GetEventSourceMappingRequestBuilderOps(v)

  implicit def toGetEventSourceMappingRequestOps(v: GetEventSourceMappingRequest): GetEventSourceMappingRequestOps =
    new GetEventSourceMappingRequestOps(v)

}
