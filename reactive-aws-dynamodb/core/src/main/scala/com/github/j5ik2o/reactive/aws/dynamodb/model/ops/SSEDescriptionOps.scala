// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SSEDescriptionBuilderOps(val self: SSEDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[SSEStatus]): SSEDescription.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseTypeAsScala(value: Option[SSEType]): SSEDescription.Builder = {
            value.fold(self){ v => self.sseType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsMasterKeyArnAsScala(value: Option[String]): SSEDescription.Builder = {
            value.fold(self){ v => self.kmsMasterKeyArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def inaccessibleEncryptionDateTimeAsScala(value: Option[java.time.Instant]): SSEDescription.Builder = {
            value.fold(self){ v => self.inaccessibleEncryptionDateTime(v) }
            } 


}

final class SSEDescriptionOps(val self: SSEDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[SSEStatus] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseTypeAsScala: Option[SSEType] = Option(self.sseType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsMasterKeyArnAsScala: Option[String] = Option(self.kmsMasterKeyArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def inaccessibleEncryptionDateTimeAsScala: Option[java.time.Instant] = Option(self.inaccessibleEncryptionDateTime) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSEDescriptionOps {

implicit def toSSEDescriptionBuilderOps(v: SSEDescription.Builder): SSEDescriptionBuilderOps = new SSEDescriptionBuilderOps(v)

implicit def toSSEDescriptionOps(v: SSEDescription): SSEDescriptionOps = new SSEDescriptionOps(v)

}

