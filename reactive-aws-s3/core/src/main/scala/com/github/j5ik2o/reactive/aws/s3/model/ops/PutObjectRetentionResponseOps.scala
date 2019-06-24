// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRetentionResponseBuilderOps(val self: PutObjectRetentionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectRetentionResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class PutObjectRetentionResponseOps(val self: PutObjectRetentionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRetentionResponseOps {

  implicit def toPutObjectRetentionResponseBuilderOps(
      v: PutObjectRetentionResponse.Builder
  ): PutObjectRetentionResponseBuilderOps = new PutObjectRetentionResponseBuilderOps(v)

  implicit def toPutObjectRetentionResponseOps(v: PutObjectRetentionResponse): PutObjectRetentionResponseOps =
    new PutObjectRetentionResponseOps(v)

}
