// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class EncryptRequestBuilderOps(val self: EncryptRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): EncryptRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def plaintextAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): EncryptRequest.Builder = {
    value.fold(self) { v =>
      self.plaintext(v)
    }
  }

  final def encryptionContextAsScala(value: Option[Map[String, String]]): EncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContext(v.asJava)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): EncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class EncryptRequestOps(val self: EncryptRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def plaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.plaintext)

  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptRequestOps {

  implicit def toEncryptRequestBuilderOps(v: EncryptRequest.Builder): EncryptRequestBuilderOps =
    new EncryptRequestBuilderOps(v)

  implicit def toEncryptRequestOps(v: EncryptRequest): EncryptRequestOps = new EncryptRequestOps(v)

}
