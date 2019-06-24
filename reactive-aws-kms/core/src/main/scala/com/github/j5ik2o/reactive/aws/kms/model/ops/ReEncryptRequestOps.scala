// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ReEncryptRequestBuilderOps(val self: ReEncryptRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): ReEncryptRequest.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEncryptionContextAsScala(value: Option[Map[String, String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.sourceEncryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationKeyIdAsScala(value: Option[String]): ReEncryptRequest.Builder = {
    value.fold(self) { v =>
      self.destinationKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEncryptionContextAsScala(value: Option[Map[String, String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.destinationEncryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

}

final class ReEncryptRequestOps(val self: ReEncryptRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEncryptionContextAsScala: Option[Map[String, String]] = Option(self.sourceEncryptionContext).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationKeyIdAsScala: Option[String] = Option(self.destinationKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEncryptionContextAsScala: Option[Map[String, String]] =
    Option(self.destinationEncryptionContext).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReEncryptRequestOps {

  implicit def toReEncryptRequestBuilderOps(v: ReEncryptRequest.Builder): ReEncryptRequestBuilderOps =
    new ReEncryptRequestBuilderOps(v)

  implicit def toReEncryptRequestOps(v: ReEncryptRequest): ReEncryptRequestOps = new ReEncryptRequestOps(v)

}
