// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StopStreamEncryptionRequestBuilderOps(val self: StopStreamEncryptionRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

  final def keyIdAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class StopStreamEncryptionRequestOps(val self: StopStreamEncryptionRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStreamEncryptionRequestOps {

  implicit def toStopStreamEncryptionRequestBuilderOps(
      v: StopStreamEncryptionRequest.Builder
  ): StopStreamEncryptionRequestBuilderOps = new StopStreamEncryptionRequestBuilderOps(v)

  implicit def toStopStreamEncryptionRequestOps(v: StopStreamEncryptionRequest): StopStreamEncryptionRequestOps =
    new StopStreamEncryptionRequestOps(v)

}
