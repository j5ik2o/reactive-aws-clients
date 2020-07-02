// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetPublicKeyRequestBuilderOps(val self: GetPublicKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GetPublicKeyRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): GetPublicKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

}

final class GetPublicKeyRequestOps(val self: GetPublicKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] =
    Option(self.grantTokens).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPublicKeyRequestOps {

  implicit def toGetPublicKeyRequestBuilderOps(v: GetPublicKeyRequest.Builder): GetPublicKeyRequestBuilderOps =
    new GetPublicKeyRequestBuilderOps(v)

  implicit def toGetPublicKeyRequestOps(v: GetPublicKeyRequest): GetPublicKeyRequestOps = new GetPublicKeyRequestOps(v)

}
