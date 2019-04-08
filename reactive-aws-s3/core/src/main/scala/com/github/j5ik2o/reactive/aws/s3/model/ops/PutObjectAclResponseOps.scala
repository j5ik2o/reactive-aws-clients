// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectAclResponseBuilderOps(val self: PutObjectAclResponse.Builder) extends AnyVal {

  final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectAclResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class PutObjectAclResponseOps(val self: PutObjectAclResponse) extends AnyVal {

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectAclResponseOps {

  implicit def toPutObjectAclResponseBuilderOps(v: PutObjectAclResponse.Builder): PutObjectAclResponseBuilderOps =
    new PutObjectAclResponseBuilderOps(v)

  implicit def toPutObjectAclResponseOps(v: PutObjectAclResponse): PutObjectAclResponseOps =
    new PutObjectAclResponseOps(v)

}
