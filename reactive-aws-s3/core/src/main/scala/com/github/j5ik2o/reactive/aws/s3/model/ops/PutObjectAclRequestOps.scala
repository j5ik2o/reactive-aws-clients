// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectAclRequestBuilderOps(val self: PutObjectAclRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[ObjectCannedACL]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.accessControlPolicy(v)
    }
  }

  final def bucketAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def grantFullControlAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  final def grantReadAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  final def grantReadACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  final def grantWriteAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWrite(v)
    }
  }

  final def grantWriteACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

  final def keyAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

}

final class PutObjectAclRequestOps(val self: PutObjectAclRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl)

  final def accessControlPolicyAsScala: Option[AccessControlPolicy] = Option(self.accessControlPolicy)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  final def grantWriteAsScala: Option[String] = Option(self.grantWrite)

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  final def keyAsScala: Option[String] = Option(self.key)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectAclRequestOps {

  implicit def toPutObjectAclRequestBuilderOps(v: PutObjectAclRequest.Builder): PutObjectAclRequestBuilderOps =
    new PutObjectAclRequestBuilderOps(v)

  implicit def toPutObjectAclRequestOps(v: PutObjectAclRequest): PutObjectAclRequestOps = new PutObjectAclRequestOps(v)

}
