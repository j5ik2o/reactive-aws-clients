// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyRequestBuilderOps(val self: GenerateDataKeyRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): GenerateDataKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def encryptionContextAsScala(value: Option[Map[String, String]]): GenerateDataKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContext(v.asJava)
    }
  }

  final def numberOfBytesAsScala(value: Option[Int]): GenerateDataKeyRequest.Builder = {
    value.fold(self) { v =>
      self.numberOfBytes(v)
    }
  }

  final def keySpecAsScala(value: Option[DataKeySpec]): GenerateDataKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keySpec(v)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): GenerateDataKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class GenerateDataKeyRequestOps(val self: GenerateDataKeyRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def numberOfBytesAsScala: Option[Int] = Option(self.numberOfBytes)

  final def keySpecAsScala: Option[DataKeySpec] = Option(self.keySpec)

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyRequestOps {

  implicit def toGenerateDataKeyRequestBuilderOps(v: GenerateDataKeyRequest.Builder): GenerateDataKeyRequestBuilderOps =
    new GenerateDataKeyRequestBuilderOps(v)

  implicit def toGenerateDataKeyRequestOps(v: GenerateDataKeyRequest): GenerateDataKeyRequestOps =
    new GenerateDataKeyRequestOps(v)

}
