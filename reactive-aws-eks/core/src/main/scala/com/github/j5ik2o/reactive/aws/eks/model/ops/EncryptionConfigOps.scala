// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class EncryptionConfigBuilderOps(val self: EncryptionConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala(value: Option[Seq[String]]): EncryptionConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resources(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def providerAsScala(value: Option[Provider]): EncryptionConfig.Builder = {
    value.fold(self) { v => self.provider(v) }
  }

}

final class EncryptionConfigOps(val self: EncryptionConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala: Option[Seq[String]] =
    Option(self.resources).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def providerAsScala: Option[Provider] = Option(self.provider)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptionConfigOps {

  implicit def toEncryptionConfigBuilderOps(v: EncryptionConfig.Builder): EncryptionConfigBuilderOps =
    new EncryptionConfigBuilderOps(v)

  implicit def toEncryptionConfigOps(v: EncryptionConfig): EncryptionConfigOps = new EncryptionConfigOps(v)

}
