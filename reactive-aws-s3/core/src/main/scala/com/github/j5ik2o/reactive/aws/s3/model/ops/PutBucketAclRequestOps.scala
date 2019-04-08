// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAclRequestBuilderOps(val self: PutBucketAclRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[BucketCannedACL]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // String

  final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.accessControlPolicy(v)
    }
  } // AccessControlPolicy

  final def bucketAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def contentMD5AsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def grantFullControlAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def grantReadAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def grantReadACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def grantWriteAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  } // String

  final def grantWriteACPAsScala(value: Option[String]): PutBucketAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

}

final class PutBucketAclRequestOps(val self: PutBucketAclRequest) extends AnyVal {

  final def aclAsScala: Option[BucketCannedACL] = Option(self.acl) // String

  final def accessControlPolicyAsScala: Option[AccessControlPolicy] =
    Option(self.accessControlPolicy) // AccessControlPolicy

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAclRequestOps {

  implicit def toPutBucketAclRequestBuilderOps(v: PutBucketAclRequest.Builder): PutBucketAclRequestBuilderOps =
    new PutBucketAclRequestBuilderOps(v)

  implicit def toPutBucketAclRequestOps(v: PutBucketAclRequest): PutBucketAclRequestOps = new PutBucketAclRequestOps(v)

}
