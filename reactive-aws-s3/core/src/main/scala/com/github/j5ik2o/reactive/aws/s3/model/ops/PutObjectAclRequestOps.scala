// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectAclRequestBuilderOps(val self: PutObjectAclRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aclAsScala(value: Option[ObjectCannedACL]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.acl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessControlPolicyAsScala(value: Option[AccessControlPolicy]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.accessControlPolicy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.contentMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantFullControlAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.grantFullControl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.grantRead(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.grantReadACP(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.grantWrite(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteACPAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.grantWriteACP(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.requestPayer(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): PutObjectAclRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

}

final class PutObjectAclRequestOps(val self: PutObjectAclRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessControlPolicyAsScala: Option[AccessControlPolicy] = Option(self.accessControlPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteAsScala: Option[String] = Option(self.grantWrite)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectAclRequestOps {

  implicit def toPutObjectAclRequestBuilderOps(v: PutObjectAclRequest.Builder): PutObjectAclRequestBuilderOps =
    new PutObjectAclRequestBuilderOps(v)

  implicit def toPutObjectAclRequestOps(v: PutObjectAclRequest): PutObjectAclRequestOps = new PutObjectAclRequestOps(v)

}
