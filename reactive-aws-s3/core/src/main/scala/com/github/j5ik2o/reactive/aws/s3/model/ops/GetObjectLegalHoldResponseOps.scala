// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectLegalHoldResponseBuilderOps(val self: GetObjectLegalHoldResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def legalHoldAsScala(value: Option[ObjectLockLegalHold]): GetObjectLegalHoldResponse.Builder = {
    value.fold(self) { v => self.legalHold(v) }
  }

}

final class GetObjectLegalHoldResponseOps(val self: GetObjectLegalHoldResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def legalHoldAsScala: Option[ObjectLockLegalHold] = Option(self.legalHold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectLegalHoldResponseOps {

  implicit def toGetObjectLegalHoldResponseBuilderOps(
      v: GetObjectLegalHoldResponse.Builder
  ): GetObjectLegalHoldResponseBuilderOps = new GetObjectLegalHoldResponseBuilderOps(v)

  implicit def toGetObjectLegalHoldResponseOps(v: GetObjectLegalHoldResponse): GetObjectLegalHoldResponseOps =
    new GetObjectLegalHoldResponseOps(v)

}
