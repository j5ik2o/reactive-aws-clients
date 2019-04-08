// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyPartResultBuilderOps(val self: CopyPartResult.Builder) extends AnyVal {

  final def eTagAsScala(value: Option[String]): CopyPartResult.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): CopyPartResult.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

}

final class CopyPartResultOps(val self: CopyPartResult) extends AnyVal {

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyPartResultOps {

  implicit def toCopyPartResultBuilderOps(v: CopyPartResult.Builder): CopyPartResultBuilderOps =
    new CopyPartResultBuilderOps(v)

  implicit def toCopyPartResultOps(v: CopyPartResult): CopyPartResultOps = new CopyPartResultOps(v)

}
