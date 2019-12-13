// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class EncryptRequestBuilderOps(val self: EncryptRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): EncryptRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): EncryptRequest.Builder = {
    value.fold(self) { v =>
      self.plaintext(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala(value: Option[Map[String, String]]): EncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): EncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala(value: Option[EncryptionAlgorithmSpec]): EncryptRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionAlgorithm(v)
    }
  }

}

final class EncryptRequestOps(val self: EncryptRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.plaintext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala: Option[EncryptionAlgorithmSpec] = Option(self.encryptionAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptRequestOps {

  implicit def toEncryptRequestBuilderOps(v: EncryptRequest.Builder): EncryptRequestBuilderOps =
    new EncryptRequestBuilderOps(v)

  implicit def toEncryptRequestOps(v: EncryptRequest): EncryptRequestOps = new EncryptRequestOps(v)

}
