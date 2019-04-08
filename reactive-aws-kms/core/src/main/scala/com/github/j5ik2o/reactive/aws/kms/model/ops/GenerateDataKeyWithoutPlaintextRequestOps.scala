// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyWithoutPlaintextRequestBuilderOps(val self: GenerateDataKeyWithoutPlaintextRequest.Builder)
    extends AnyVal {

  final def keyIdAsScala(value: Option[String]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def encryptionContextAsScala(
      value: Option[Map[String, String]]
  ): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContext(v.asJava)
    }
  }

  final def keySpecAsScala(value: Option[DataKeySpec]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v =>
      self.keySpec(v)
    }
  }

  final def numberOfBytesAsScala(value: Option[Int]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v =>
      self.numberOfBytes(v)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class GenerateDataKeyWithoutPlaintextRequestOps(val self: GenerateDataKeyWithoutPlaintextRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def keySpecAsScala: Option[DataKeySpec] = Option(self.keySpec)

  final def numberOfBytesAsScala: Option[Int] = Option(self.numberOfBytes)

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyWithoutPlaintextRequestOps {

  implicit def toGenerateDataKeyWithoutPlaintextRequestBuilderOps(
      v: GenerateDataKeyWithoutPlaintextRequest.Builder
  ): GenerateDataKeyWithoutPlaintextRequestBuilderOps = new GenerateDataKeyWithoutPlaintextRequestBuilderOps(v)

  implicit def toGenerateDataKeyWithoutPlaintextRequestOps(
      v: GenerateDataKeyWithoutPlaintextRequest
  ): GenerateDataKeyWithoutPlaintextRequestOps = new GenerateDataKeyWithoutPlaintextRequestOps(v)

}
