// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ S3Location => ScalaS3Location, _ }
import software.amazon.awssdk.services.s3.model.{ S3Location => JavaS3Location }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object S3LocationOps {

  implicit class ScalaS3LocationOps(val self: ScalaS3Location) extends AnyVal {

    def toJava: JavaS3Location = {
      val result = JavaS3Location.builder()
      self.bucketName.filter(_.nonEmpty).foreach(v => result.bucketName(v)) // String
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))         // String
      self.encryption.foreach { v =>
        import EncryptionOps._; result.encryption(v.toJava)
      } // Encryption
      self.cannedACL.foreach { v =>
        import ObjectCannedACLOps._; result.cannedACL(v.toJava)
      } // String
      self.accessControlList.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GrantOps._; result.accessControlList(v.map(_.toJava).asJava)
      } // Seq[Grant]
      self.tagging.foreach { v =>
        import TaggingOps._; result.tagging(v.toJava)
      } // Tagging
      self.userMetadata.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, MetadataEntryOps._; result.userMetadata(v.map(_.toJava).asJava)
      } // Seq[MetadataEntry]
      self.storageClass.foreach { v =>
        import StorageClassOps._; result.storageClass(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaS3LocationOps(val self: JavaS3Location) extends AnyVal {

    def toScala: ScalaS3Location = {
      ScalaS3Location()
        .withBucketName(Option(self.bucketName)) // String
        .withPrefix(Option(self.prefix)) // String
        .withEncryption(Option(self.encryption).map { v =>
          import EncryptionOps._; v.toScala
        }) // Encryption
        .withCannedACL(Option(self.cannedACL).map { v =>
          import ObjectCannedACLOps._; v.toScala
        }) // String
        .withAccessControlList(Option(self.accessControlList).map { v =>
          import scala.collection.JavaConverters._, GrantOps._; v.asScala.map(_.toScala)
        }) // Seq[Grant]
        .withTagging(Option(self.tagging).map { v =>
          import TaggingOps._; v.toScala
        }) // Tagging
        .withUserMetadata(Option(self.userMetadata).map { v =>
          import scala.collection.JavaConverters._, MetadataEntryOps._; v.asScala.map(_.toScala)
        }) // Seq[MetadataEntry]
        .withStorageClass(Option(self.storageClass).map { v =>
          import StorageClassOps._; v.toScala
        }) // String
    }

  }

}
