// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListMultipartUploadsRequestBuilderOps(val self: ListMultipartUploadsRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withDelimiterAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def withEncodingTypeAsScala(value: Option[EncodingType]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

  final def withKeyMarkerAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  } // String

  final def withMaxUploadsAsScala(value: Option[Int]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.maxUploads(v)
    }
  } // Int

  final def withPrefixAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withUploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsRequest.Builder = {
    value.fold(self) { v =>
      self.uploadIdMarker(v)
    }
  } // String

}

final class ListMultipartUploadsRequestOps(val self: ListMultipartUploadsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // String

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker) // String

  final def maxUploadsAsScala: Option[Int] = Option(self.maxUploads) // Int

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def uploadIdMarkerAsScala: Option[String] = Option(self.uploadIdMarker) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMultipartUploadsRequestOps {

  implicit def toListMultipartUploadsRequestBuilderOps(
      v: ListMultipartUploadsRequest.Builder
  ): ListMultipartUploadsRequestBuilderOps = new ListMultipartUploadsRequestBuilderOps(v)

  implicit def toListMultipartUploadsRequestOps(v: ListMultipartUploadsRequest): ListMultipartUploadsRequestOps =
    new ListMultipartUploadsRequestOps(v)

}
