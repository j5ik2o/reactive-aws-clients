// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectVersionsResponseBuilderOps(val self: ListObjectVersionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.versionIdMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextKeyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextKeyMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextVersionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextVersionIdMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala(value: Option[Seq[ObjectVersion]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkersAsScala(value: Option[Seq[DeleteMarkerEntry]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deleteMarkers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala(value: Option[Int]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.commonPrefixes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

}

final class ListObjectVersionsResponseOps(val self: ListObjectVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdMarkerAsScala: Option[String] = Option(self.versionIdMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextVersionIdMarkerAsScala: Option[String] = Option(self.nextVersionIdMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala: Option[Seq[ObjectVersion]] = Option(self.versions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkersAsScala: Option[Seq[DeleteMarkerEntry]] = Option(self.deleteMarkers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] = Option(self.commonPrefixes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectVersionsResponseOps {

  implicit def toListObjectVersionsResponseBuilderOps(
      v: ListObjectVersionsResponse.Builder
  ): ListObjectVersionsResponseBuilderOps = new ListObjectVersionsResponseBuilderOps(v)

  implicit def toListObjectVersionsResponseOps(v: ListObjectVersionsResponse): ListObjectVersionsResponseOps =
    new ListObjectVersionsResponseOps(v)

}
