// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectLegalHoldResponseBuilderOps(val self: GetObjectLegalHoldResponse.Builder) extends AnyVal {

  final def withLegalHoldAsScala(value: Option[ObjectLockLegalHold]): GetObjectLegalHoldResponse.Builder = {
    value.fold(self) { v =>
      self.legalHold(v)
    }
  } // ObjectLockLegalHold

}

final class GetObjectLegalHoldResponseOps(val self: GetObjectLegalHoldResponse) extends AnyVal {

  final def legalHoldAsScala: Option[ObjectLockLegalHold] = Option(self.legalHold) // ObjectLockLegalHold

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectLegalHoldResponseOps {

  implicit def toGetObjectLegalHoldResponseBuilderOps(
      v: GetObjectLegalHoldResponse.Builder
  ): GetObjectLegalHoldResponseBuilderOps = new GetObjectLegalHoldResponseBuilderOps(v)

  implicit def toGetObjectLegalHoldResponseOps(v: GetObjectLegalHoldResponse): GetObjectLegalHoldResponseOps =
    new GetObjectLegalHoldResponseOps(v)

}
