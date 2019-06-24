// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetCelebrityInfoRequestBuilderOps(val self: GetCelebrityInfoRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): GetCelebrityInfoRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

}

final class GetCelebrityInfoRequestOps(val self: GetCelebrityInfoRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCelebrityInfoRequestOps {

  implicit def toGetCelebrityInfoRequestBuilderOps(
      v: GetCelebrityInfoRequest.Builder
  ): GetCelebrityInfoRequestBuilderOps = new GetCelebrityInfoRequestBuilderOps(v)

  implicit def toGetCelebrityInfoRequestOps(v: GetCelebrityInfoRequest): GetCelebrityInfoRequestOps =
    new GetCelebrityInfoRequestOps(v)

}
