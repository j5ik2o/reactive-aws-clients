// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2ResponseBuilderOps(val self: ListObjectsV2Response.Builder) extends AnyVal {

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withContentsAsScala(value: Option[Seq[S3Object]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.contents(v.asJava)
    } // Seq[S3Object]
  }

  final def withNameAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withPrefixAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withDelimiterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def withMaxKeysAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def withCommonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    } // Seq[CommonPrefix]
  }

  final def withEncodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

  final def withKeyCountAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.keyCount(v)
    }
  } // Int

  final def withContinuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

  final def withNextContinuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  } // String

  final def withStartAfterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.startAfter(v)
    }
  } // String

}

final class ListObjectsV2ResponseOps(val self: ListObjectsV2Response) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

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

  final def keyCountAsScala: Option[Int] = Option(self.keyCount) // Int

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken) // String

  final def startAfterAsScala: Option[String] = Option(self.startAfter) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2ResponseOps {

  implicit def toListObjectsV2ResponseBuilderOps(v: ListObjectsV2Response.Builder): ListObjectsV2ResponseBuilderOps =
    new ListObjectsV2ResponseBuilderOps(v)

  implicit def toListObjectsV2ResponseOps(v: ListObjectsV2Response): ListObjectsV2ResponseOps =
    new ListObjectsV2ResponseOps(v)

}
