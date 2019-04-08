// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListMultipartUploadsResponseBuilderOps(val self: ListMultipartUploadsResponse.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  }

  final def uploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadIdMarker(v)
    }
  }

  final def nextKeyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.nextKeyMarker(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def nextUploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.nextUploadIdMarker(v)
    }
  }

  final def maxUploadsAsScala(value: Option[Int]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.maxUploads(v)
    }
  }

  final def isTruncatedAsScala(value: Option[Boolean]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def uploadsAsScala(value: Option[Seq[MultipartUpload]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.uploads(v.asJava)
    }
  }

  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

}

final class ListMultipartUploadsResponseOps(val self: ListMultipartUploadsResponse) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  final def uploadIdMarkerAsScala: Option[String] = Option(self.uploadIdMarker)

  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def nextUploadIdMarkerAsScala: Option[String] = Option(self.nextUploadIdMarker)

  final def maxUploadsAsScala: Option[Int] = Option(self.maxUploads)

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  final def uploadsAsScala: Option[Seq[MultipartUpload]] = Option(self.uploads).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] = Option(self.commonPrefixes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMultipartUploadsResponseOps {

  implicit def toListMultipartUploadsResponseBuilderOps(
      v: ListMultipartUploadsResponse.Builder
  ): ListMultipartUploadsResponseBuilderOps = new ListMultipartUploadsResponseBuilderOps(v)

  implicit def toListMultipartUploadsResponseOps(v: ListMultipartUploadsResponse): ListMultipartUploadsResponseOps =
    new ListMultipartUploadsResponseOps(v)

}
