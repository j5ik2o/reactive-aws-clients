// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ResourceQuotaBuilderOps(val self: ResourceQuota.Builder) extends AnyVal {

  final def maximumAsScala(value: Option[Int]): ResourceQuota.Builder = {
    value.fold(self) { v =>
      self.maximum(v)
    }
  }

}

final class ResourceQuotaOps(val self: ResourceQuota) extends AnyVal {

  final def maximumAsScala: Option[Int] = Option(self.maximum)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceQuotaOps {

  implicit def toResourceQuotaBuilderOps(v: ResourceQuota.Builder): ResourceQuotaBuilderOps =
    new ResourceQuotaBuilderOps(v)

  implicit def toResourceQuotaOps(v: ResourceQuota): ResourceQuotaOps = new ResourceQuotaOps(v)

}
