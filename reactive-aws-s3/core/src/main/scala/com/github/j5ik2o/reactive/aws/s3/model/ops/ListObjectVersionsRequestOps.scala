// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectVersionsRequestBuilderOps(val self: ListObjectVersionsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  final def keyMarkerAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def versionIdMarkerAsScala(value: Option[String]): ListObjectVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.versionIdMarker(v)
    }
  }

}

final class ListObjectVersionsRequestOps(val self: ListObjectVersionsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def versionIdMarkerAsScala: Option[String] = Option(self.versionIdMarker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectVersionsRequestOps {

  implicit def toListObjectVersionsRequestBuilderOps(
      v: ListObjectVersionsRequest.Builder
  ): ListObjectVersionsRequestBuilderOps = new ListObjectVersionsRequestBuilderOps(v)

  implicit def toListObjectVersionsRequestOps(v: ListObjectVersionsRequest): ListObjectVersionsRequestOps =
    new ListObjectVersionsRequestOps(v)

}
