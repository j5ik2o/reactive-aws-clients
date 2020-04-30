// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StopStreamEncryptionRequestBuilderOps(val self: StopStreamEncryptionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionTypeAsScala(value: Option[EncryptionType]): StopStreamEncryptionRequest.Builder = {
            value.fold(self){ v => self.encryptionType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyIdAsScala(value: Option[String]): StopStreamEncryptionRequest.Builder = {
            value.fold(self){ v => self.keyId(v) }
            } 


}

final class StopStreamEncryptionRequestOps(val self: StopStreamEncryptionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyIdAsScala: Option[String] = Option(self.keyId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStreamEncryptionRequestOps {

implicit def toStopStreamEncryptionRequestBuilderOps(v: StopStreamEncryptionRequest.Builder): StopStreamEncryptionRequestBuilderOps = new StopStreamEncryptionRequestBuilderOps(v)

implicit def toStopStreamEncryptionRequestOps(v: StopStreamEncryptionRequest): StopStreamEncryptionRequestOps = new StopStreamEncryptionRequestOps(v)

}

