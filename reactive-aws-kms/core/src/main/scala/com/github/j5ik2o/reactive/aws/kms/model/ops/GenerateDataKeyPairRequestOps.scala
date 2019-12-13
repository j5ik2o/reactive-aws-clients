// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyPairRequestBuilderOps(val self: GenerateDataKeyPairRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala(value: Option[Map[String, String]]): GenerateDataKeyPairRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala(value: Option[DataKeyPairSpec]): GenerateDataKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.keyPairSpec(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): GenerateDataKeyPairRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

}

final class GenerateDataKeyPairRequestOps(val self: GenerateDataKeyPairRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextAsScala: Option[Map[String, String]] = Option(self.encryptionContext).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala: Option[DataKeyPairSpec] = Option(self.keyPairSpec)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyPairRequestOps {

  implicit def toGenerateDataKeyPairRequestBuilderOps(
      v: GenerateDataKeyPairRequest.Builder
  ): GenerateDataKeyPairRequestBuilderOps = new GenerateDataKeyPairRequestBuilderOps(v)

  implicit def toGenerateDataKeyPairRequestOps(v: GenerateDataKeyPairRequest): GenerateDataKeyPairRequestOps =
    new GenerateDataKeyPairRequestOps(v)

}
