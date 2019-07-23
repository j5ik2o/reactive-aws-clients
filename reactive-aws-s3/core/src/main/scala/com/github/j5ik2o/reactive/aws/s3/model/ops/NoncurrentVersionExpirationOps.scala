// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NoncurrentVersionExpirationBuilderOps(val self: NoncurrentVersionExpiration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentDaysAsScala(value: Option[Int]): NoncurrentVersionExpiration.Builder = {
    value.fold(self) { v =>
      self.noncurrentDays(v)
    }
  }

}

final class NoncurrentVersionExpirationOps(val self: NoncurrentVersionExpiration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentDaysAsScala: Option[Int] = Option(self.noncurrentDays)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNoncurrentVersionExpirationOps {

  implicit def toNoncurrentVersionExpirationBuilderOps(
      v: NoncurrentVersionExpiration.Builder
  ): NoncurrentVersionExpirationBuilderOps = new NoncurrentVersionExpirationBuilderOps(v)

  implicit def toNoncurrentVersionExpirationOps(v: NoncurrentVersionExpiration): NoncurrentVersionExpirationOps =
    new NoncurrentVersionExpirationOps(v)

}
