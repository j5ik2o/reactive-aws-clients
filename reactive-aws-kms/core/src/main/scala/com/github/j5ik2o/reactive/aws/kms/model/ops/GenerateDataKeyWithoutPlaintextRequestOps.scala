// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyWithoutPlaintextRequestBuilderOps(val self: GenerateDataKeyWithoutPlaintextRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala(
      value: Option[Map[String, String]]
  ): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySpecAsScala(value: Option[DataKeySpec]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v => self.keySpec(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfBytesAsScala(value: Option[Int]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.fold(self) { v => self.numberOfBytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): GenerateDataKeyWithoutPlaintextRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

}

final class GenerateDataKeyWithoutPlaintextRequestOps(val self: GenerateDataKeyWithoutPlaintextRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala: Option[Map[String, String]] =
    Option(self.encryptionContext).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySpecAsScala: Option[DataKeySpec] = Option(self.keySpec)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfBytesAsScala: Option[Int] = Option(self.numberOfBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] =
    Option(self.grantTokens).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

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
