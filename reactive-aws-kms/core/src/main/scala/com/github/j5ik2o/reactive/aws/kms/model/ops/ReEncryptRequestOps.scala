// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ReEncryptRequestBuilderOps(val self: ReEncryptRequest.Builder) extends AnyVal {

  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): ReEncryptRequest.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  final def sourceEncryptionContextAsScala(value: Option[Map[String, String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.sourceEncryptionContext(v.asJava)
    }
  }

  final def destinationKeyIdAsScala(value: Option[String]): ReEncryptRequest.Builder = {
    value.fold(self) { v =>
      self.destinationKeyId(v)
    }
  }

  final def destinationEncryptionContextAsScala(value: Option[Map[String, String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.destinationEncryptionContext(v.asJava)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): ReEncryptRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class ReEncryptRequestOps(val self: ReEncryptRequest) extends AnyVal {

  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  final def sourceEncryptionContextAsScala: Option[Map[String, String]] = Option(self.sourceEncryptionContext).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def destinationKeyIdAsScala: Option[String] = Option(self.destinationKeyId)

  final def destinationEncryptionContextAsScala: Option[Map[String, String]] =
    Option(self.destinationEncryptionContext).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReEncryptRequestOps {

  implicit def toReEncryptRequestBuilderOps(v: ReEncryptRequest.Builder): ReEncryptRequestBuilderOps =
    new ReEncryptRequestBuilderOps(v)

  implicit def toReEncryptRequestOps(v: ReEncryptRequest): ReEncryptRequestOps = new ReEncryptRequestOps(v)

}
