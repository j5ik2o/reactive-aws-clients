// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectsRequestBuilderOps(val self: DeleteObjectsRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withDeleteAsScala(value: Option[Delete]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  } // Delete

  final def withMfaAsScala(value: Option[String]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.mfa(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withBypassGovernanceRetentionAsScala(value: Option[Boolean]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  } // Boolean

}

final class DeleteObjectsRequestOps(val self: DeleteObjectsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def deleteAsScala: Option[Delete] = Option(self.delete) // Delete

  final def mfaAsScala: Option[String] = Option(self.mfa) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectsRequestOps {

  implicit def toDeleteObjectsRequestBuilderOps(v: DeleteObjectsRequest.Builder): DeleteObjectsRequestBuilderOps =
    new DeleteObjectsRequestBuilderOps(v)

  implicit def toDeleteObjectsRequestOps(v: DeleteObjectsRequest): DeleteObjectsRequestOps =
    new DeleteObjectsRequestOps(v)

}
