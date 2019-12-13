// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetPublicKeyResponseBuilderOps(val self: GetPublicKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GetPublicKeyResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): GetPublicKeyResponse.Builder = {
    value.fold(self) { v =>
      self.publicKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerMasterKeySpecAsScala(value: Option[CustomerMasterKeySpec]): GetPublicKeyResponse.Builder = {
    value.fold(self) { v =>
      self.customerMasterKeySpec(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala(value: Option[KeyUsageType]): GetPublicKeyResponse.Builder = {
    value.fold(self) { v =>
      self.keyUsage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmsAsScala(value: Option[Seq[EncryptionAlgorithmSpec]]): GetPublicKeyResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmsAsScala(value: Option[Seq[SigningAlgorithmSpec]]): GetPublicKeyResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.signingAlgorithms(v.asJava)
    }
  }

}

final class GetPublicKeyResponseOps(val self: GetPublicKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerMasterKeySpecAsScala: Option[CustomerMasterKeySpec] = Option(self.customerMasterKeySpec)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala: Option[KeyUsageType] = Option(self.keyUsage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmsAsScala: Option[Seq[EncryptionAlgorithmSpec]] = Option(self.encryptionAlgorithms).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmsAsScala: Option[Seq[SigningAlgorithmSpec]] = Option(self.signingAlgorithms).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPublicKeyResponseOps {

  implicit def toGetPublicKeyResponseBuilderOps(v: GetPublicKeyResponse.Builder): GetPublicKeyResponseBuilderOps =
    new GetPublicKeyResponseBuilderOps(v)

  implicit def toGetPublicKeyResponseOps(v: GetPublicKeyResponse): GetPublicKeyResponseOps =
    new GetPublicKeyResponseOps(v)

}
