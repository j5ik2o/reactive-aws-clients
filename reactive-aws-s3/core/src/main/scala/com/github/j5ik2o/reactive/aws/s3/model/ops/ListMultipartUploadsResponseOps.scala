// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListMultipartUploadsResponseBuilderOps(val self: ListMultipartUploadsResponse.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  } // String

  final def withUploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadIdMarker(v)
    }
  } // String

  final def withNextKeyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.nextKeyMarker(v)
    }
  } // String

  final def withPrefixAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withDelimiterAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def withNextUploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.nextUploadIdMarker(v)
    }
  } // String

  final def withMaxUploadsAsScala(value: Option[Int]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.maxUploads(v)
    }
  } // Int

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withUploadsAsScala(value: Option[Seq[MultipartUpload]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.uploads(v.asJava)
    } // Seq[MultipartUpload]
  }

  final def withCommonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    } // Seq[CommonPrefix]
  }

  final def withEncodingTypeAsScala(value: Option[EncodingType]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

}

final class ListMultipartUploadsResponseOps(val self: ListMultipartUploadsResponse) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker) // String

  final def uploadIdMarkerAsScala: Option[String] = Option(self.uploadIdMarker) // String

  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker) // String

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def nextUploadIdMarkerAsScala: Option[String] = Option(self.nextUploadIdMarker) // String

  final def maxUploadsAsScala: Option[Int] = Option(self.maxUploads) // Int

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def uploadsAsScala: Option[Seq[MultipartUpload]] = Option(self.uploads).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MultipartUpload]

  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] = Option(self.commonPrefixes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[CommonPrefix]

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListMultipartUploadsResponseOps {

  implicit def toListMultipartUploadsResponseBuilderOps(
      v: ListMultipartUploadsResponse.Builder
  ): ListMultipartUploadsResponseBuilderOps = new ListMultipartUploadsResponseBuilderOps(v)

  implicit def toListMultipartUploadsResponseOps(v: ListMultipartUploadsResponse): ListMultipartUploadsResponseOps =
    new ListMultipartUploadsResponseOps(v)

}
