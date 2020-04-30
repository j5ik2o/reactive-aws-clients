// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3LocationBuilderOps(val self: S3Location.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketNameAsScala(value: Option[String]): S3Location.Builder = {
            value.fold(self){ v => self.bucketName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala(value: Option[String]): S3Location.Builder = {
            value.fold(self){ v => self.prefix(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionAsScala(value: Option[Encryption]): S3Location.Builder = {
            value.fold(self){ v => self.encryption(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cannedACLAsScala(value: Option[ObjectCannedACL]): S3Location.Builder = {
            value.fold(self){ v => self.cannedACL(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accessControlListAsScala(value: Option[Seq[Grant]]): S3Location.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accessControlList(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taggingAsScala(value: Option[Tagging]): S3Location.Builder = {
            value.fold(self){ v => self.tagging(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userMetadataAsScala(value: Option[Seq[MetadataEntry]]): S3Location.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userMetadata(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageClassAsScala(value: Option[StorageClass]): S3Location.Builder = {
            value.fold(self){ v => self.storageClass(v) }
            } 


}

final class S3LocationOps(val self: S3Location) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketNameAsScala: Option[String] = Option(self.bucketName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala: Option[String] = Option(self.prefix) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionAsScala: Option[Encryption] = Option(self.encryption) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cannedACLAsScala: Option[ObjectCannedACL] = Option(self.cannedACL) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def accessControlListAsScala: Option[Seq[Grant]] = Option(self.accessControlList).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taggingAsScala: Option[Tagging] = Option(self.tagging) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def userMetadataAsScala: Option[Seq[MetadataEntry]] = Option(self.userMetadata).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3LocationOps {

implicit def toS3LocationBuilderOps(v: S3Location.Builder): S3LocationBuilderOps = new S3LocationBuilderOps(v)

implicit def toS3LocationOps(v: S3Location): S3LocationOps = new S3LocationOps(v)

}

