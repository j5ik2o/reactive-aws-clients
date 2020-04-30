// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SseKmsEncryptedObjectsBuilderOps(val self: SseKmsEncryptedObjects.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[SseKmsEncryptedObjectsStatus]): SseKmsEncryptedObjects.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class SseKmsEncryptedObjectsOps(val self: SseKmsEncryptedObjects) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[SseKmsEncryptedObjectsStatus] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSseKmsEncryptedObjectsOps {

implicit def toSseKmsEncryptedObjectsBuilderOps(v: SseKmsEncryptedObjects.Builder): SseKmsEncryptedObjectsBuilderOps = new SseKmsEncryptedObjectsBuilderOps(v)

implicit def toSseKmsEncryptedObjectsOps(v: SseKmsEncryptedObjects): SseKmsEncryptedObjectsOps = new SseKmsEncryptedObjectsOps(v)

}

