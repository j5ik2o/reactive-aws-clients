// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsRequestBuilderOps(val self: ListPartsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def maxPartsAsScala(value: Option[Int]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  } // Int

  final def partNumberMarkerAsScala(value: Option[Int]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  } // Int

  final def uploadIdAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class ListPartsRequestOps(val self: ListPartsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def maxPartsAsScala: Option[Int] = Option(self.maxParts) // Int

  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker) // Int

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsRequestOps {

  implicit def toListPartsRequestBuilderOps(v: ListPartsRequest.Builder): ListPartsRequestBuilderOps =
    new ListPartsRequestBuilderOps(v)

  implicit def toListPartsRequestOps(v: ListPartsRequest): ListPartsRequestOps = new ListPartsRequestOps(v)

}
