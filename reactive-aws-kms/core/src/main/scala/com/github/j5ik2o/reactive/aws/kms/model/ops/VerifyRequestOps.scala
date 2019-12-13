// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class VerifyRequestBuilderOps(val self: VerifyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): VerifyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): VerifyRequest.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageTypeAsScala(value: Option[MessageType]): VerifyRequest.Builder = {
    value.fold(self) { v =>
      self.messageType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): VerifyRequest.Builder = {
    value.fold(self) { v =>
      self.signature(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala(value: Option[SigningAlgorithmSpec]): VerifyRequest.Builder = {
    value.fold(self) { v =>
      self.signingAlgorithm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): VerifyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

}

final class VerifyRequestOps(val self: VerifyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageTypeAsScala: Option[MessageType] = Option(self.messageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.signature)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala: Option[SigningAlgorithmSpec] = Option(self.signingAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVerifyRequestOps {

  implicit def toVerifyRequestBuilderOps(v: VerifyRequest.Builder): VerifyRequestBuilderOps =
    new VerifyRequestBuilderOps(v)

  implicit def toVerifyRequestOps(v: VerifyRequest): VerifyRequestOps = new VerifyRequestOps(v)

}
