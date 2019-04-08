// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLegalHoldResponseBuilderOps(val self: PutObjectLegalHoldResponse.Builder) extends AnyVal {

  final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectLegalHoldResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class PutObjectLegalHoldResponseOps(val self: PutObjectLegalHoldResponse) extends AnyVal {

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectLegalHoldResponseOps {

  implicit def toPutObjectLegalHoldResponseBuilderOps(
      v: PutObjectLegalHoldResponse.Builder
  ): PutObjectLegalHoldResponseBuilderOps = new PutObjectLegalHoldResponseBuilderOps(v)

  implicit def toPutObjectLegalHoldResponseOps(v: PutObjectLegalHoldResponse): PutObjectLegalHoldResponseOps =
    new PutObjectLegalHoldResponseOps(v)

}
