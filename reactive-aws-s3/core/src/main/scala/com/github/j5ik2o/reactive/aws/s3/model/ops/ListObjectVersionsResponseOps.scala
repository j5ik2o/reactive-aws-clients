// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectVersionsResponseBuilderOps(val self: ListObjectVersionsResponse.Builder) extends AnyVal {

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withKeyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.keyMarker(v)
    }
  } // String

  final def withVersionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.versionIdMarker(v)
    }
  } // String

  final def withNextKeyMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextKeyMarker(v)
    }
  } // String

  final def withNextVersionIdMarkerAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextVersionIdMarker(v)
    }
  } // String

  final def withVersionsAsScala(value: Option[Seq[ObjectVersion]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versions(v.asJava)
    } // Seq[ObjectVersion]
  }

  final def withDeleteMarkersAsScala(value: Option[Seq[DeleteMarkerEntry]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.deleteMarkers(v.asJava)
    } // Seq[DeleteMarkerEntry]
  }

  final def withNameAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withPrefixAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withDelimiterAsScala(value: Option[String]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def withMaxKeysAsScala(value: Option[Int]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def withCommonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    } // Seq[CommonPrefix]
  }

  final def withEncodingTypeAsScala(value: Option[EncodingType]): ListObjectVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

}

final class ListObjectVersionsResponseOps(val self: ListObjectVersionsResponse) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def keyMarkerAsScala: Option[String] = Option(self.keyMarker) // String

  final def versionIdMarkerAsScala: Option[String] = Option(self.versionIdMarker) // String

  final def nextKeyMarkerAsScala: Option[String] = Option(self.nextKeyMarker) // String

  final def nextVersionIdMarkerAsScala: Option[String] = Option(self.nextVersionIdMarker) // String

  final def versionsAsScala: Option[Seq[ObjectVersion]] = Option(self.versions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ObjectVersion]

  final def deleteMarkersAsScala: Option[Seq[DeleteMarkerEntry]] = Option(self.deleteMarkers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DeleteMarkerEntry]

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys) // Int

  final def commonPrefixesAsScala: Option[Seq[CommonPrefix]] = Option(self.commonPrefixes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[CommonPrefix]

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectVersionsResponseOps {

  implicit def toListObjectVersionsResponseBuilderOps(
      v: ListObjectVersionsResponse.Builder
  ): ListObjectVersionsResponseBuilderOps = new ListObjectVersionsResponseBuilderOps(v)

  implicit def toListObjectVersionsResponseOps(v: ListObjectVersionsResponse): ListObjectVersionsResponseOps =
    new ListObjectVersionsResponseOps(v)

}
