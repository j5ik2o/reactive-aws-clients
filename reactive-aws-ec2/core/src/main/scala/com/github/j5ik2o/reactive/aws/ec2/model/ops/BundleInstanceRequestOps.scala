// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BundleInstanceRequestBuilderOps(val self: BundleInstanceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): BundleInstanceRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageAsScala(value: Option[Storage]): BundleInstanceRequest.Builder = {
    value.fold(self) { v => self.storage(v) }
  }

}

final class BundleInstanceRequestOps(val self: BundleInstanceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageAsScala: Option[Storage] = Option(self.storage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBundleInstanceRequestOps {

  implicit def toBundleInstanceRequestBuilderOps(v: BundleInstanceRequest.Builder): BundleInstanceRequestBuilderOps =
    new BundleInstanceRequestBuilderOps(v)

  implicit def toBundleInstanceRequestOps(v: BundleInstanceRequest): BundleInstanceRequestOps =
    new BundleInstanceRequestOps(v)

}
