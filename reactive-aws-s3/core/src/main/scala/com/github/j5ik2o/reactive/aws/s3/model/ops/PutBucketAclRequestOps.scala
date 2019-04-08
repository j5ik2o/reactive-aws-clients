// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAclRequestBuilderOps(val self: PutBucketAclRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[BucketCannedACL]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.accessControlPolicy(v)
    }
  }

  final def bucketAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def grantFullControlAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  final def grantReadAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  final def grantReadACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  final def grantWriteAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  }

  final def grantWriteACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

}

final class PutBucketAclRequestOps(val self: PutBucketAclRequest) extends AnyVal {

  final def aclAsScala: Option[BucketCannedACL] = Option(self.acl)

  final def accessControlPolicyAsScala: Option[AccessControlPolicy] = Option(self.accessControlPolicy)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite)

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAclRequestOps {

  implicit def toPutBucketAclRequestBuilderOps(v: PutBucketAclRequest.Builder): PutBucketAclRequestBuilderOps =
    new PutBucketAclRequestBuilderOps(v)

  implicit def toPutBucketAclRequestOps(v: PutBucketAclRequest): PutBucketAclRequestOps = new PutBucketAclRequestOps(v)

}
