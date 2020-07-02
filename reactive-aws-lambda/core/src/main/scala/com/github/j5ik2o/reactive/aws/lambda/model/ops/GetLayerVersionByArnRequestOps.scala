// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionByArnRequestBuilderOps(val self: GetLayerVersionByArnRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): GetLayerVersionByArnRequest.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

}

final class GetLayerVersionByArnRequestOps(val self: GetLayerVersionByArnRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionByArnRequestOps {

  implicit def toGetLayerVersionByArnRequestBuilderOps(
      v: GetLayerVersionByArnRequest.Builder
  ): GetLayerVersionByArnRequestBuilderOps = new GetLayerVersionByArnRequestBuilderOps(v)

  implicit def toGetLayerVersionByArnRequestOps(v: GetLayerVersionByArnRequest): GetLayerVersionByArnRequestOps =
    new GetLayerVersionByArnRequestOps(v)

}
