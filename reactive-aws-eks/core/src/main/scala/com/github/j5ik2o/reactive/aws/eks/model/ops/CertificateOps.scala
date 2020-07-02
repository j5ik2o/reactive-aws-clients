// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class CertificateBuilderOps(val self: Certificate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala(value: Option[String]): Certificate.Builder = {
    value.fold(self) { v => self.data(v) }
  }

}

final class CertificateOps(val self: Certificate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala: Option[String] = Option(self.data)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCertificateOps {

  implicit def toCertificateBuilderOps(v: Certificate.Builder): CertificateBuilderOps = new CertificateBuilderOps(v)

  implicit def toCertificateOps(v: Certificate): CertificateOps = new CertificateOps(v)

}
