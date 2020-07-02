// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsResponseBuilderOps(val self: ListObjectsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.isTruncated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.marker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.nextMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentsAsScala(value: Option[Seq[S3Object]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contents(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.delimiter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala(value: Option[Int]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.maxKeys(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.commonPrefixes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsResponse.Builder = {
    value.fold(self) { v => self.encodingType(v) }
  }

}

final class ListObjectsResponseOps(val self: ListObjectsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentsAsScala: Option[Seq[S3Object]] =
    Option(self.contents).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] =
    Option(self.commonPrefixes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsResponseOps {

  implicit def toListObjectsResponseBuilderOps(v: ListObjectsResponse.Builder): ListObjectsResponseBuilderOps =
    new ListObjectsResponseBuilderOps(v)

  implicit def toListObjectsResponseOps(v: ListObjectsResponse): ListObjectsResponseOps = new ListObjectsResponseOps(v)

}
