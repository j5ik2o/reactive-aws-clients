// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectVersionsRequestBuilderOps(val self: ListObjectVersionsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def delimiterAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

  final def keyMarkerAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  } // String

  final def maxKeysAsScala(value: Option[Int]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def prefixAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def versionIdMarkerAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.versionIdMarker(v)
    }
  } // String

}

final class ListObjectVersionsRequestOps(val self: ListObjectVersionsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // String

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker) // String

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys) // Int

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def versionIdMarkerAsScala: Option[String] = Option(self.versionIdMarker) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectVersionsRequestOps {

  implicit def toListObjectVersionsRequestBuilderOps(
      v: ListObjectVersionsRequest.Builder
  ): ListObjectVersionsRequestBuilderOps = new ListObjectVersionsRequestBuilderOps(v)

  implicit def toListObjectVersionsRequestOps(v: ListObjectVersionsRequest): ListObjectVersionsRequestOps =
    new ListObjectVersionsRequestOps(v)

}
