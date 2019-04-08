// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class S3StorageBuilderOps(val self: S3Storage.Builder) extends AnyVal {

  final def awsAccessKeyIdAsScala(value: Option[String]): S3Storage.Builder = {
    value.fold(self) { v =>
      self.awsAccessKeyId(v)
    }
  }

  final def bucketAsScala(value: Option[String]): S3Storage.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def prefixAsScala(value: Option[String]): S3Storage.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def uploadPolicyAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): S3Storage.Builder = {
    value.fold(self) { v =>
      self.uploadPolicy(v)
    }
  }

  final def uploadPolicySignatureAsScala(value: Option[String]): S3Storage.Builder = {
    value.fold(self) { v =>
      self.uploadPolicySignature(v)
    }
  }

}

final class S3StorageOps(val self: S3Storage) extends AnyVal {

  final def awsAccessKeyIdAsScala: Option[String] = Option(self.awsAccessKeyId)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def uploadPolicyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.uploadPolicy)

  final def uploadPolicySignatureAsScala: Option[String] = Option(self.uploadPolicySignature)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3StorageOps {

  implicit def toS3StorageBuilderOps(v: S3Storage.Builder): S3StorageBuilderOps = new S3StorageBuilderOps(v)

  implicit def toS3StorageOps(v: S3Storage): S3StorageOps = new S3StorageOps(v)

}
