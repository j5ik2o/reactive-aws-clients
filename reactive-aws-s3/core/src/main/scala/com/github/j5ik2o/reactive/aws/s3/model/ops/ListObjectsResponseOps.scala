// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsResponseBuilderOps(val self: ListObjectsResponse.Builder) extends AnyVal {

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withMarkerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def withNextMarkerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  } // String

  final def withContentsAsScala(value: Option[Seq[S3Object]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.contents(v.asJava)
    } // Seq[S3Object]
  }

  final def withNameAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withPrefixAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withDelimiterAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def withMaxKeysAsScala(value: Option[Int]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def withCommonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    } // Seq[CommonPrefix]
  }

  final def withEncodingTypeAsScala(value: Option[EncodingType]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

}

final class ListObjectsResponseOps(val self: ListObjectsResponse) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker) // String

  final def contentsAsScala: Option[Seq[S3Object]] = Option(self.contents).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[S3Object]

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
trait ToListObjectsResponseOps {

  implicit def toListObjectsResponseBuilderOps(v: ListObjectsResponse.Builder): ListObjectsResponseBuilderOps =
    new ListObjectsResponseBuilderOps(v)

  implicit def toListObjectsResponseOps(v: ListObjectsResponse): ListObjectsResponseOps = new ListObjectsResponseOps(v)

}
