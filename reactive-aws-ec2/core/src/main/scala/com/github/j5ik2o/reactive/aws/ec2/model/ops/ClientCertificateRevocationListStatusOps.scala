// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientCertificateRevocationListStatusBuilderOps(val self: ClientCertificateRevocationListStatus.Builder)
    extends AnyVal {

  final def codeAsScala(
      value: Option[ClientCertificateRevocationListStatusCode]
  ): ClientCertificateRevocationListStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): ClientCertificateRevocationListStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class ClientCertificateRevocationListStatusOps(val self: ClientCertificateRevocationListStatus) extends AnyVal {

  final def codeAsScala: Option[ClientCertificateRevocationListStatusCode] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientCertificateRevocationListStatusOps {

  implicit def toClientCertificateRevocationListStatusBuilderOps(
      v: ClientCertificateRevocationListStatus.Builder
  ): ClientCertificateRevocationListStatusBuilderOps = new ClientCertificateRevocationListStatusBuilderOps(v)

  implicit def toClientCertificateRevocationListStatusOps(
      v: ClientCertificateRevocationListStatus
  ): ClientCertificateRevocationListStatusOps = new ClientCertificateRevocationListStatusOps(v)

}
