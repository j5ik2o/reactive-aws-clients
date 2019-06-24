// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StartStreamEncryptionRequestBuilderOps(val self: StartStreamEncryptionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala(value: Option[EncryptionType]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class StartStreamEncryptionRequestOps(val self: StartStreamEncryptionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartStreamEncryptionRequestOps {

  implicit def toStartStreamEncryptionRequestBuilderOps(
      v: StartStreamEncryptionRequest.Builder
  ): StartStreamEncryptionRequestBuilderOps = new StartStreamEncryptionRequestBuilderOps(v)

  implicit def toStartStreamEncryptionRequestOps(v: StartStreamEncryptionRequest): StartStreamEncryptionRequestOps =
    new StartStreamEncryptionRequestOps(v)

}
