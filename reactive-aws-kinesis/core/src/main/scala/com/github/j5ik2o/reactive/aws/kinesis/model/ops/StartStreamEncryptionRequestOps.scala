// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StartStreamEncryptionRequestBuilderOps(val self: StartStreamEncryptionRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // EncryptionType

  final def keyIdAsScala(value: Option[String]): StartStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  } // String

}

final class StartStreamEncryptionRequestOps(val self: StartStreamEncryptionRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // EncryptionType

  final def keyIdAsScala: Option[String] = Option(self.keyId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartStreamEncryptionRequestOps {

  implicit def toStartStreamEncryptionRequestBuilderOps(
      v: StartStreamEncryptionRequest.Builder
  ): StartStreamEncryptionRequestBuilderOps = new StartStreamEncryptionRequestBuilderOps(v)

  implicit def toStartStreamEncryptionRequestOps(v: StartStreamEncryptionRequest): StartStreamEncryptionRequestOps =
    new StartStreamEncryptionRequestOps(v)

}
