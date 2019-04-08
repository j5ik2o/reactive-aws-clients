// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectAclRequestBuilderOps(val self: PutObjectAclRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[ObjectCannedACL]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // String

  final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.accessControlPolicy(v)
    }
  } // AccessControlPolicy

  final def bucketAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def contentMD5AsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def grantFullControlAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def grantReadAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def grantReadACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def grantWriteAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  } // String

  final def grantWriteACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

}

final class PutObjectAclRequestOps(val self: PutObjectAclRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl) // String

  final def accessControlPolicyAsScala: Option[AccessControlPolicy] =
    Option(self.accessControlPolicy) // AccessControlPolicy

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectAclRequestOps {

  implicit def toPutObjectAclRequestBuilderOps(v: PutObjectAclRequest.Builder): PutObjectAclRequestBuilderOps =
    new PutObjectAclRequestBuilderOps(v)

  implicit def toPutObjectAclRequestOps(v: PutObjectAclRequest): PutObjectAclRequestOps = new PutObjectAclRequestOps(v)

}
