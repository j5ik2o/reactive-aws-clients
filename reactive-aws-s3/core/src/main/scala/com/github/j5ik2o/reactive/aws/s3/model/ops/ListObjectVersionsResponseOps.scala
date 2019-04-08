// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectVersionsResponseBuilderOps(val self: ListObjectVersionsResponse.Builder) extends AnyVal {

  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def keyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  }

  final def versionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.versionIdMarker(v)
    }
  }

  final def nextKeyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextKeyMarker(v)
    }
  }

  final def nextVersionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextVersionIdMarker(v)
    }
  }

  final def versionsAsScala(value: Option[Seq[ObjectVersion]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versions(v.asJava)
    }
  }

  final def deleteMarkersAsScala(value: Option[Seq[DeleteMarkerEntry]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.deleteMarkers(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

}

final class ListObjectVersionsResponseOps(val self: ListObjectVersionsResponse) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker)

  final def versionIdMarkerAsScala: Option[String] = Option(self.versionIdMarker)

  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker)

  final def nextVersionIdMarkerAsScala: Option[String] = Option(self.nextVersionIdMarker)

  final def versionsAsScala: Option[Seq[ObjectVersion]] = Option(self.versions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def deleteMarkersAsScala: Option[Seq[DeleteMarkerEntry]] = Option(self.deleteMarkers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nameAsScala: Option[String] = Option(self.name)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] = Option(self.commonPrefixes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
