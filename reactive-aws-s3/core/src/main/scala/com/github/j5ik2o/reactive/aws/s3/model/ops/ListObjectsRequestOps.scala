// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsRequestBuilderOps(val self: ListObjectsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def delimiterAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // EncodingType

  final def markerAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxKeysAsScala(value: Option[Int]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def prefixAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

}

final class ListObjectsRequestOps(val self: ListObjectsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // EncodingType

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys) // Int

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsRequestOps {

  implicit def toListObjectsRequestBuilderOps(v: ListObjectsRequest.Builder): ListObjectsRequestBuilderOps =
    new ListObjectsRequestBuilderOps(v)

  implicit def toListObjectsRequestOps(v: ListObjectsRequest): ListObjectsRequestOps = new ListObjectsRequestOps(v)

}
