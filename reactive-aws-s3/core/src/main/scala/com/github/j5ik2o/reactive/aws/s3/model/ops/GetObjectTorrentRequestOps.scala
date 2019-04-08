// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectTorrentRequestBuilderOps(val self: GetObjectTorrentRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectTorrentRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): GetObjectTorrentRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectTorrentRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class GetObjectTorrentRequestOps(val self: GetObjectTorrentRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectTorrentRequestOps {

  implicit def toGetObjectTorrentRequestBuilderOps(
      v: GetObjectTorrentRequest.Builder
  ): GetObjectTorrentRequestBuilderOps = new GetObjectTorrentRequestBuilderOps(v)

  implicit def toGetObjectTorrentRequestOps(v: GetObjectTorrentRequest): GetObjectTorrentRequestOps =
    new GetObjectTorrentRequestOps(v)

}
