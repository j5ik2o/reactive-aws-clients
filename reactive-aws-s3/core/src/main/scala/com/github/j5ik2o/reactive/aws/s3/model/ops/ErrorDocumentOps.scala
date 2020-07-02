// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ErrorDocumentBuilderOps(val self: ErrorDocument.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): ErrorDocument.Builder = {
    value.fold(self) { v => self.key(v) }
  }

}

final class ErrorDocumentOps(val self: ErrorDocument) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToErrorDocumentOps {

  implicit def toErrorDocumentBuilderOps(v: ErrorDocument.Builder): ErrorDocumentBuilderOps =
    new ErrorDocumentBuilderOps(v)

  implicit def toErrorDocumentOps(v: ErrorDocument): ErrorDocumentOps = new ErrorDocumentOps(v)

}
