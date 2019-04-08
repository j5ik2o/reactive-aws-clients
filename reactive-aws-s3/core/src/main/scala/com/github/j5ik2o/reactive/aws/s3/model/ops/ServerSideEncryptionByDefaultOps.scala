// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ServerSideEncryptionByDefaultBuilderOps(val self: ServerSideEncryptionByDefault.Builder) extends AnyVal {

  final def sseAlgorithmAsScala(value: Option[ServerSideEncryption]): ServerSideEncryptionByDefault.Builder = {
    value.fold(self) { v =>
      self.sseAlgorithm(v)
    }
  } // String

  final def kmsMasterKeyIDAsScala(value: Option[String]): ServerSideEncryptionByDefault.Builder = {
    value.fold(self) { v =>
      self.kmsMasterKeyID(v)
    }
  } // String

}

final class ServerSideEncryptionByDefaultOps(val self: ServerSideEncryptionByDefault) extends AnyVal {

  final def sseAlgorithmAsScala: Option[ServerSideEncryption] = Option(self.sseAlgorithm) // String

  final def kmsMasterKeyIDAsScala: Option[String] = Option(self.kmsMasterKeyID) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServerSideEncryptionByDefaultOps {

  implicit def toServerSideEncryptionByDefaultBuilderOps(
      v: ServerSideEncryptionByDefault.Builder
  ): ServerSideEncryptionByDefaultBuilderOps = new ServerSideEncryptionByDefaultBuilderOps(v)

  implicit def toServerSideEncryptionByDefaultOps(v: ServerSideEncryptionByDefault): ServerSideEncryptionByDefaultOps =
    new ServerSideEncryptionByDefaultOps(v)

}
