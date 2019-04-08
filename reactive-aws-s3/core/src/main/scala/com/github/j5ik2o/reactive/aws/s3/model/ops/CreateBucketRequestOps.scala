// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateBucketRequestBuilderOps(val self: CreateBucketRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[BucketCannedACL]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  final def bucketAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def createBucketConfigurationAsScala(value: Option[CreateBucketConfiguration]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.createBucketConfiguration(v)
    }
  }

  final def grantFullControlAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  final def grantReadAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  final def grantReadACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  final def grantWriteAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  }

  final def grantWriteACPAsScala(value: Option[String]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

  final def objectLockEnabledForBucketAsScala(value: Option[Boolean]): CreateBucketRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockEnabledForBucket(v)
    }
  }

}

final class CreateBucketRequestOps(val self: CreateBucketRequest) extends AnyVal {

  final def aclAsScala: Option[BucketCannedACL] = Option(self.acl)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def createBucketConfigurationAsScala: Option[CreateBucketConfiguration] = Option(self.createBucketConfiguration)

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite)

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  final def objectLockEnabledForBucketAsScala: Option[Boolean] = Option(self.objectLockEnabledForBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBucketRequestOps {

  implicit def toCreateBucketRequestBuilderOps(v: CreateBucketRequest.Builder): CreateBucketRequestBuilderOps =
    new CreateBucketRequestBuilderOps(v)

  implicit def toCreateBucketRequestOps(v: CreateBucketRequest): CreateBucketRequestOps = new CreateBucketRequestOps(v)

}
