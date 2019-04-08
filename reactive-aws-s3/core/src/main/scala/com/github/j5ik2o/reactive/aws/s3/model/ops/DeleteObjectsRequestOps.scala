// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectsRequestBuilderOps(val self: DeleteObjectsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def deleteAsScala(value: Option[Delete]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  }

  final def mfaAsScala(value: Option[String]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.mfa(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): DeleteObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  }

}

final class DeleteObjectsRequestOps(val self: DeleteObjectsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def deleteAsScala: Option[Delete] = Option(self.delete)

  final def mfaAsScala: Option[String] = Option(self.mfa)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectsRequestOps {

  implicit def toDeleteObjectsRequestBuilderOps(v: DeleteObjectsRequest.Builder): DeleteObjectsRequestBuilderOps =
    new DeleteObjectsRequestBuilderOps(v)

  implicit def toDeleteObjectsRequestOps(v: DeleteObjectsRequest): DeleteObjectsRequestOps =
    new DeleteObjectsRequestOps(v)

}
