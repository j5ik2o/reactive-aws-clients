// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopyFpgaImageResponseBuilderOps(val self: CopyFpgaImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala(value: Option[String]): CopyFpgaImageResponse.Builder = {
    value.fold(self) { v => self.fpgaImageId(v) }
  }

}

final class CopyFpgaImageResponseOps(val self: CopyFpgaImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyFpgaImageResponseOps {

  implicit def toCopyFpgaImageResponseBuilderOps(v: CopyFpgaImageResponse.Builder): CopyFpgaImageResponseBuilderOps =
    new CopyFpgaImageResponseBuilderOps(v)

  implicit def toCopyFpgaImageResponseOps(v: CopyFpgaImageResponse): CopyFpgaImageResponseOps =
    new CopyFpgaImageResponseOps(v)

}
