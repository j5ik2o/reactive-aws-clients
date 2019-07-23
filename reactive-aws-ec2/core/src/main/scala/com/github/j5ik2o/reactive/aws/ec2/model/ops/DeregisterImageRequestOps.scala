// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterImageRequestBuilderOps(val self: DeregisterImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): DeregisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

}

final class DeregisterImageRequestOps(val self: DeregisterImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterImageRequestOps {

  implicit def toDeregisterImageRequestBuilderOps(v: DeregisterImageRequest.Builder): DeregisterImageRequestBuilderOps =
    new DeregisterImageRequestBuilderOps(v)

  implicit def toDeregisterImageRequestOps(v: DeregisterImageRequest): DeregisterImageRequestOps =
    new DeregisterImageRequestOps(v)

}
