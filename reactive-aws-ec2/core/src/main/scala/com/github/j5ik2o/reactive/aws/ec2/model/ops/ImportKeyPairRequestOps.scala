// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportKeyPairRequestBuilderOps(val self: ImportKeyPairRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): ImportKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyMaterialAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): ImportKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.publicKeyMaterial(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): ImportKeyPairRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class ImportKeyPairRequestOps(val self: ImportKeyPairRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyMaterialAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKeyMaterial)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportKeyPairRequestOps {

  implicit def toImportKeyPairRequestBuilderOps(v: ImportKeyPairRequest.Builder): ImportKeyPairRequestBuilderOps =
    new ImportKeyPairRequestBuilderOps(v)

  implicit def toImportKeyPairRequestOps(v: ImportKeyPairRequest): ImportKeyPairRequestOps =
    new ImportKeyPairRequestOps(v)

}
