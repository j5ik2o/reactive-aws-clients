// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3LocationBuilderOps(val self: S3Location.Builder) extends AnyVal {

  final def bucketNameAsScala(value: Option[String]): S3Location.Builder = {
    value.fold(self) { v =>
      self.bucketName(v)
    }
  } // String

  final def prefixAsScala(value: Option[String]): S3Location.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def encryptionAsScala(value: Option[Encryption]): S3Location.Builder = {
    value.fold(self) { v =>
      self.encryption(v)
    }
  } // Encryption

  final def cannedACLAsScala(value: Option[ObjectCannedACL]): S3Location.Builder = {
    value.fold(self) { v =>
      self.cannedACL(v)
    }
  } // String

  final def accessControlListAsScala(value: Option[Seq[Grant]]): S3Location.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accessControlList(v.asJava)
    } // Seq[Grant]
  }

  final def taggingAsScala(value: Option[Tagging]): S3Location.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // Tagging

  final def userMetadataAsScala(value: Option[Seq[MetadataEntry]]): S3Location.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userMetadata(v.asJava)
    } // Seq[MetadataEntry]
  }

  final def storageClassAsScala(value: Option[StorageClass]): S3Location.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

}

final class S3LocationOps(val self: S3Location) extends AnyVal {

  final def bucketNameAsScala: Option[String] = Option(self.bucketName) // String

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def encryptionAsScala: Option[Encryption] = Option(self.encryption) // Encryption

  final def cannedACLAsScala: Option[ObjectCannedACL] = Option(self.cannedACL) // String

  final def accessControlListAsScala: Option[Seq[Grant]] = Option(self.accessControlList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Grant]

  final def taggingAsScala: Option[Tagging] = Option(self.tagging) // Tagging

  final def userMetadataAsScala: Option[Seq[MetadataEntry]] = Option(self.userMetadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetadataEntry]

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3LocationOps {

  implicit def toS3LocationBuilderOps(v: S3Location.Builder): S3LocationBuilderOps = new S3LocationBuilderOps(v)

  implicit def toS3LocationOps(v: S3Location): S3LocationOps = new S3LocationOps(v)

}
