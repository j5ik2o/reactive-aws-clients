// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteMarkerEntryBuilderOps(val self: DeleteMarkerEntry.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerAsScala(value: Option[Owner]): DeleteMarkerEntry.Builder = {
            value.fold(self){ v => self.owner(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): DeleteMarkerEntry.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala(value: Option[String]): DeleteMarkerEntry.Builder = {
            value.fold(self){ v => self.versionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isLatestAsScala(value: Option[Boolean]): DeleteMarkerEntry.Builder = {
            value.fold(self){ v => self.isLatest(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastModifiedAsScala(value: Option[java.time.Instant]): DeleteMarkerEntry.Builder = {
            value.fold(self){ v => self.lastModified(v) }
            } 


}

final class DeleteMarkerEntryOps(val self: DeleteMarkerEntry) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerAsScala: Option[Owner] = Option(self.owner) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionIdAsScala: Option[String] = Option(self.versionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def isLatestAsScala: Option[Boolean] = Option(self.isLatest) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMarkerEntryOps {

implicit def toDeleteMarkerEntryBuilderOps(v: DeleteMarkerEntry.Builder): DeleteMarkerEntryBuilderOps = new DeleteMarkerEntryBuilderOps(v)

implicit def toDeleteMarkerEntryOps(v: DeleteMarkerEntry): DeleteMarkerEntryOps = new DeleteMarkerEntryOps(v)

}

