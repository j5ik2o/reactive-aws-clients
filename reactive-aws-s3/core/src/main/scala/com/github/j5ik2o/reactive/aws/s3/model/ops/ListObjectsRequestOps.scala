// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsRequestBuilderOps(val self: ListObjectsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class ListObjectsRequestOps(val self: ListObjectsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

  final def markerAsScala: Option[String] = Option(self.marker)

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsRequestOps {

  implicit def toListObjectsRequestBuilderOps(v: ListObjectsRequest.Builder): ListObjectsRequestBuilderOps =
    new ListObjectsRequestBuilderOps(v)

  implicit def toListObjectsRequestOps(v: ListObjectsRequest): ListObjectsRequestOps = new ListObjectsRequestOps(v)

}
