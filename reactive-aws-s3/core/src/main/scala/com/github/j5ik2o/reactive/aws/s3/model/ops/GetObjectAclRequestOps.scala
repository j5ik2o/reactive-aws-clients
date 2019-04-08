// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectAclRequestBuilderOps(val self: GetObjectAclRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

}

final class GetObjectAclRequestOps(val self: GetObjectAclRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectAclRequestOps {

  implicit def toGetObjectAclRequestBuilderOps(v: GetObjectAclRequest.Builder): GetObjectAclRequestBuilderOps =
    new GetObjectAclRequestBuilderOps(v)

  implicit def toGetObjectAclRequestOps(v: GetObjectAclRequest): GetObjectAclRequestOps = new GetObjectAclRequestOps(v)

}
