// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StopStreamEncryptionRequestBuilderOps(val self: StopStreamEncryptionRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // String

  final def keyIdAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  } // String

}

final class StopStreamEncryptionRequestOps(val self: StopStreamEncryptionRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // String

  final def keyIdAsScala: Option[String] = Option(self.keyId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStreamEncryptionRequestOps {

  implicit def toStopStreamEncryptionRequestBuilderOps(
      v: StopStreamEncryptionRequest.Builder
  ): StopStreamEncryptionRequestBuilderOps = new StopStreamEncryptionRequestBuilderOps(v)

  implicit def toStopStreamEncryptionRequestOps(v: StopStreamEncryptionRequest): StopStreamEncryptionRequestOps =
    new StopStreamEncryptionRequestOps(v)

}
