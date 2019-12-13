// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class SignRequestBuilderOps(val self: SignRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): SignRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): SignRequest.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageTypeAsScala(value: Option[MessageType]): SignRequest.Builder = {
    value.fold(self) { v =>
      self.messageType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): SignRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala(value: Option[SigningAlgorithmSpec]): SignRequest.Builder = {
    value.fold(self) { v =>
      self.signingAlgorithm(v)
    }
  }

}

final class SignRequestOps(val self: SignRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageTypeAsScala: Option[MessageType] = Option(self.messageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala: Option[SigningAlgorithmSpec] = Option(self.signingAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSignRequestOps {

  implicit def toSignRequestBuilderOps(v: SignRequest.Builder): SignRequestBuilderOps = new SignRequestBuilderOps(v)

  implicit def toSignRequestOps(v: SignRequest): SignRequestOps = new SignRequestOps(v)

}
