// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsRequestBuilderOps(val self: ListPartsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPartsAsScala(value: Option[Int]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberMarkerAsScala(value: Option[Int]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): ListPartsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class ListPartsRequestOps(val self: ListPartsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPartsAsScala: Option[Int] = Option(self.maxParts)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsRequestOps {

  implicit def toListPartsRequestBuilderOps(v: ListPartsRequest.Builder): ListPartsRequestBuilderOps =
    new ListPartsRequestBuilderOps(v)

  implicit def toListPartsRequestOps(v: ListPartsRequest): ListPartsRequestOps = new ListPartsRequestOps(v)

}
