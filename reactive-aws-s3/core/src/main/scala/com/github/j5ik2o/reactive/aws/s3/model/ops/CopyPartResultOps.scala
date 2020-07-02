// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyPartResultBuilderOps(val self: CopyPartResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): CopyPartResult.Builder = {
    value.fold(self) { v => self.eTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): CopyPartResult.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

}

final class CopyPartResultOps(val self: CopyPartResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyPartResultOps {

  implicit def toCopyPartResultBuilderOps(v: CopyPartResult.Builder): CopyPartResultBuilderOps =
    new CopyPartResultBuilderOps(v)

  implicit def toCopyPartResultOps(v: CopyPartResult): CopyPartResultOps = new CopyPartResultOps(v)

}
