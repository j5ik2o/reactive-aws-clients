// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotTaskDetailBuilderOps(val self: SnapshotTaskDetail.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def diskImageSizeAsScala(value: Option[Double]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.diskImageSize(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptedAsScala(value: Option[Boolean]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.encrypted(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def formatAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.format(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.kmsKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def progressAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.progress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.snapshotId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.statusMessage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def urlAsScala(value: Option[String]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.url(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userBucketAsScala(value: Option[UserBucketDetails]): SnapshotTaskDetail.Builder = {
            value.fold(self){ v => self.userBucket(v) }
            } 


}

final class SnapshotTaskDetailOps(val self: SnapshotTaskDetail) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def diskImageSizeAsScala: Option[Double] = Option(self.diskImageSize) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptedAsScala: Option[Boolean] = Option(self.encrypted) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def formatAsScala: Option[String] = Option(self.format) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def progressAsScala: Option[String] = Option(self.progress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala: Option[String] = Option(self.snapshotId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[String] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala: Option[String] = Option(self.statusMessage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def urlAsScala: Option[String] = Option(self.url) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userBucketAsScala: Option[UserBucketDetails] = Option(self.userBucket) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotTaskDetailOps {

implicit def toSnapshotTaskDetailBuilderOps(v: SnapshotTaskDetail.Builder): SnapshotTaskDetailBuilderOps = new SnapshotTaskDetailBuilderOps(v)

implicit def toSnapshotTaskDetailOps(v: SnapshotTaskDetail): SnapshotTaskDetailOps = new SnapshotTaskDetailOps(v)

}

