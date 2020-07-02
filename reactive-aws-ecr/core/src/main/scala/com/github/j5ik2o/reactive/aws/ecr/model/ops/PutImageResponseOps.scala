// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageResponseBuilderOps(val self: PutImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): PutImageResponse.Builder = {
    value.fold(self) { v => self.image(v) }
  }

}

final class PutImageResponseOps(val self: PutImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageResponseOps {

  implicit def toPutImageResponseBuilderOps(v: PutImageResponse.Builder): PutImageResponseBuilderOps =
    new PutImageResponseBuilderOps(v)

  implicit def toPutImageResponseOps(v: PutImageResponse): PutImageResponseOps = new PutImageResponseOps(v)

}
