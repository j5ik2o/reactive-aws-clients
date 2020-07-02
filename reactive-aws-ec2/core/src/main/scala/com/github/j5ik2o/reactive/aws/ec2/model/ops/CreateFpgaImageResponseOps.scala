// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFpgaImageResponseBuilderOps(val self: CreateFpgaImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala(value: Option[String]): CreateFpgaImageResponse.Builder = {
    value.fold(self) { v => self.fpgaImageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageGlobalIdAsScala(value: Option[String]): CreateFpgaImageResponse.Builder = {
    value.fold(self) { v => self.fpgaImageGlobalId(v) }
  }

}

final class CreateFpgaImageResponseOps(val self: CreateFpgaImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageGlobalIdAsScala: Option[String] = Option(self.fpgaImageGlobalId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFpgaImageResponseOps {

  implicit def toCreateFpgaImageResponseBuilderOps(
      v: CreateFpgaImageResponse.Builder
  ): CreateFpgaImageResponseBuilderOps = new CreateFpgaImageResponseBuilderOps(v)

  implicit def toCreateFpgaImageResponseOps(v: CreateFpgaImageResponse): CreateFpgaImageResponseOps =
    new CreateFpgaImageResponseOps(v)

}
