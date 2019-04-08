// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PartBuilderOps(val self: Part.Builder) extends AnyVal {

  final def partNumberAsScala(value: Option[Int]): Part.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

  final def lastModifiedAsScala(value: Option[java.time.Instant]): Part.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def eTagAsScala(value: Option[String]): Part.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def sizeAsScala(value: Option[Int]): Part.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Int

}

final class PartOps(val self: Part) extends AnyVal {

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def sizeAsScala: Option[Int] = Option(self.size) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPartOps {

  implicit def toPartBuilderOps(v: Part.Builder): PartBuilderOps = new PartBuilderOps(v)

  implicit def toPartOps(v: Part): PartOps = new PartOps(v)

}
