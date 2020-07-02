// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateImageResponseBuilderOps(val self: CreateImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): CreateImageResponse.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

}

final class CreateImageResponseOps(val self: CreateImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateImageResponseOps {

  implicit def toCreateImageResponseBuilderOps(v: CreateImageResponse.Builder): CreateImageResponseBuilderOps =
    new CreateImageResponseBuilderOps(v)

  implicit def toCreateImageResponseOps(v: CreateImageResponse): CreateImageResponseOps = new CreateImageResponseOps(v)

}
