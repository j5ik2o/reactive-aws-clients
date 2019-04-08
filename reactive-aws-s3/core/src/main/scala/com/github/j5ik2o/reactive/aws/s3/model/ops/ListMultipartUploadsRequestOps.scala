// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListMultipartUploadsRequestBuilderOps(val self: ListMultipartUploadsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  final def keyMarkerAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  }

  final def maxUploadsAsScala(value: Option[Int]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.maxUploads(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def uploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.uploadIdMarker(v)
    }
  }

}

final class ListMultipartUploadsRequestOps(val self: ListMultipartUploadsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  final def maxUploadsAsScala: Option[Int] = Option(self.maxUploads)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def uploadIdMarkerAsScala: Option[String] = Option(self.uploadIdMarker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMultipartUploadsRequestOps {

  implicit def toListMultipartUploadsRequestBuilderOps(
      v: ListMultipartUploadsRequest.Builder
  ): ListMultipartUploadsRequestBuilderOps = new ListMultipartUploadsRequestBuilderOps(v)

  implicit def toListMultipartUploadsRequestOps(v: ListMultipartUploadsRequest): ListMultipartUploadsRequestOps =
    new ListMultipartUploadsRequestOps(v)

}
