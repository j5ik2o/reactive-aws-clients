// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectAclRequestBuilderOps(val self: GetObjectAclRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): GetObjectAclRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class GetObjectAclRequestOps(val self: GetObjectAclRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectAclRequestOps {

  implicit def toGetObjectAclRequestBuilderOps(v: GetObjectAclRequest.Builder): GetObjectAclRequestBuilderOps =
    new GetObjectAclRequestBuilderOps(v)

  implicit def toGetObjectAclRequestOps(v: GetObjectAclRequest): GetObjectAclRequestOps = new GetObjectAclRequestOps(v)

}
