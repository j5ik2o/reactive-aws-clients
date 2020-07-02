// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DecryptRequestBuilderOps(val self: DecryptRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): DecryptRequest.Builder = {
    value.fold(self) { v => self.ciphertextBlob(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala(value: Option[Map[String, String]]): DecryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): DecryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): DecryptRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala(value: Option[EncryptionAlgorithmSpec]): DecryptRequest.Builder = {
    value.fold(self) { v => self.encryptionAlgorithm(v) }
  }

}

final class DecryptRequestOps(val self: DecryptRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala: Option[Map[String, String]] =
    Option(self.encryptionContext).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] =
    Option(self.grantTokens).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala: Option[EncryptionAlgorithmSpec] = Option(self.encryptionAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecryptRequestOps {

  implicit def toDecryptRequestBuilderOps(v: DecryptRequest.Builder): DecryptRequestBuilderOps =
    new DecryptRequestBuilderOps(v)

  implicit def toDecryptRequestOps(v: DecryptRequest): DecryptRequestOps = new DecryptRequestOps(v)

}
