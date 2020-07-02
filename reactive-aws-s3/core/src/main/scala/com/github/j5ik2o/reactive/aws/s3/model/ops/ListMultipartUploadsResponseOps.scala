// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListMultipartUploadsResponseBuilderOps(val self: ListMultipartUploadsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.keyMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.uploadIdMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextKeyMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.nextKeyMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.delimiter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextUploadIdMarkerAsScala(value: Option[String]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.nextUploadIdMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxUploadsAsScala(value: Option[Int]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.maxUploads(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.isTruncated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadsAsScala(value: Option[Seq[MultipartUpload]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.uploads(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListMultipartUploadsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.commonPrefixes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala(value: Option[EncodingType]): ListMultipartUploadsResponse.Builder = {
    value.fold(self) { v => self.encodingType(v) }
  }

}

final class ListMultipartUploadsResponseOps(val self: ListMultipartUploadsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdMarkerAsScala: Option[String] = Option(self.uploadIdMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextUploadIdMarkerAsScala: Option[String] = Option(self.nextUploadIdMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxUploadsAsScala: Option[Int] = Option(self.maxUploads)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadsAsScala: Option[Seq[MultipartUpload]] =
    Option(self.uploads).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] =
    Option(self.commonPrefixes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
