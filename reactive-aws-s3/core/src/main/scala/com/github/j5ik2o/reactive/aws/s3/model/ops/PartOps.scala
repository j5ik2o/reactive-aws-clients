// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PartBuilderOps(val self: Part.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala(value: Option[Int]): Part.Builder = {
    value.fold(self) { v => self.partNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): Part.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): Part.Builder = {
    value.fold(self) { v => self.eTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Long]): Part.Builder = {
    value.fold(self) { v => self.size(v) }
  }

}

final class PartOps(val self: Part) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Long] = Option(self.size)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPartOps {

  implicit def toPartBuilderOps(v: Part.Builder): PartBuilderOps = new PartBuilderOps(v)

  implicit def toPartOps(v: Part): PartOps = new PartOps(v)

}
