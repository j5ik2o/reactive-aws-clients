// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsResponseBuilderOps(val self: ListObjectsResponse.Builder) extends AnyVal {

  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def contentsAsScala(value: Option[Seq[S3Object]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.contents(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

}

final class ListObjectsResponseOps(val self: ListObjectsResponse) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  final def markerAsScala: Option[String] = Option(self.marker)

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def contentsAsScala: Option[Seq[S3Object]] = Option(self.contents).map { v =>
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
trait ToListObjectsResponseOps {

  implicit def toListObjectsResponseBuilderOps(v: ListObjectsResponse.Builder): ListObjectsResponseBuilderOps =
    new ListObjectsResponseBuilderOps(v)

  implicit def toListObjectsResponseOps(v: ListObjectsResponse): ListObjectsResponseOps = new ListObjectsResponseOps(v)

}
