// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RestoreObjectRequestBuilderOps(val self: RestoreObjectRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): RestoreObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withRestoreRequestAsScala(value: Option[RestoreRequest]): RestoreObjectRequest.Builder = {
    value.fold(self) { v =>
      self.restoreRequest(v)
    }
  } // RestoreRequest

  final def withRequestPayerAsScala(value: Option[RequestPayer]): RestoreObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class RestoreObjectRequestOps(val self: RestoreObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def restoreRequestAsScala: Option[RestoreRequest] = Option(self.restoreRequest) // RestoreRequest

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreObjectRequestOps {

  implicit def toRestoreObjectRequestBuilderOps(v: RestoreObjectRequest.Builder): RestoreObjectRequestBuilderOps =
    new RestoreObjectRequestBuilderOps(v)

  implicit def toRestoreObjectRequestOps(v: RestoreObjectRequest): RestoreObjectRequestOps =
    new RestoreObjectRequestOps(v)

}
