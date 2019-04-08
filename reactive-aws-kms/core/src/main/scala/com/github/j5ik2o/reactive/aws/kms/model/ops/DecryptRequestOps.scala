// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DecryptRequestBuilderOps(val self: DecryptRequest.Builder) extends AnyVal {

  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): DecryptRequest.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  final def encryptionContextAsScala(value: Option[Map[String, String]]): DecryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContext(v.asJava)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): DecryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class DecryptRequestOps(val self: DecryptRequest) extends AnyVal {

  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecryptRequestOps {

  implicit def toDecryptRequestBuilderOps(v: DecryptRequest.Builder): DecryptRequestBuilderOps =
    new DecryptRequestBuilderOps(v)

  implicit def toDecryptRequestOps(v: DecryptRequest): DecryptRequestOps = new DecryptRequestOps(v)

}
