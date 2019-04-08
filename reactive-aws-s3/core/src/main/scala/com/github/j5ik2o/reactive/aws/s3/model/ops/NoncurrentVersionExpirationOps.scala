// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NoncurrentVersionExpirationBuilderOps(val self: NoncurrentVersionExpiration.Builder) extends AnyVal {

  final def noncurrentDaysAsScala(value: Option[Int]): NoncurrentVersionExpiration.Builder = {
    value.fold(self) { v =>
      self.noncurrentDays(v)
    }
  } // Int

}

final class NoncurrentVersionExpirationOps(val self: NoncurrentVersionExpiration) extends AnyVal {

  final def noncurrentDaysAsScala: Option[Int] = Option(self.noncurrentDays) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNoncurrentVersionExpirationOps {

  implicit def toNoncurrentVersionExpirationBuilderOps(
      v: NoncurrentVersionExpiration.Builder
  ): NoncurrentVersionExpirationBuilderOps = new NoncurrentVersionExpirationBuilderOps(v)

  implicit def toNoncurrentVersionExpirationOps(v: NoncurrentVersionExpiration): NoncurrentVersionExpirationOps =
    new NoncurrentVersionExpirationOps(v)

}
