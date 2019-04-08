// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectResultBuilderOps(val self: CopyObjectResult.Builder) extends AnyVal {

  final def eTagAsScala(value: Option[String]): CopyObjectResult.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): CopyObjectResult.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // java.time.Instant

}

final class CopyObjectResultOps(val self: CopyObjectResult) extends AnyVal {

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectResultOps {

  implicit def toCopyObjectResultBuilderOps(v: CopyObjectResult.Builder): CopyObjectResultBuilderOps =
    new CopyObjectResultBuilderOps(v)

  implicit def toCopyObjectResultOps(v: CopyObjectResult): CopyObjectResultOps = new CopyObjectResultOps(v)

}
