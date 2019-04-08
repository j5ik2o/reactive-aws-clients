// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2ResponseBuilderOps(val self: ListObjectsV2Response.Builder) extends AnyVal {

  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def contentsAsScala(value: Option[Seq[S3Object]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.contents(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.commonPrefixes(v.asJava)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  final def keyCountAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.keyCount(v)
    }
  }

  final def continuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  }

  final def nextContinuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  }

  final def startAfterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.startAfter(v)
    }
  }

}

final class ListObjectsV2ResponseOps(val self: ListObjectsV2Response) extends AnyVal {

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

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

  final def keyCountAsScala: Option[Int] = Option(self.keyCount)

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken)

  final def startAfterAsScala: Option[String] = Option(self.startAfter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2ResponseOps {

  implicit def toListObjectsV2ResponseBuilderOps(v: ListObjectsV2Response.Builder): ListObjectsV2ResponseBuilderOps =
    new ListObjectsV2ResponseBuilderOps(v)

  implicit def toListObjectsV2ResponseOps(v: ListObjectsV2Response): ListObjectsV2ResponseOps =
    new ListObjectsV2ResponseOps(v)

}
