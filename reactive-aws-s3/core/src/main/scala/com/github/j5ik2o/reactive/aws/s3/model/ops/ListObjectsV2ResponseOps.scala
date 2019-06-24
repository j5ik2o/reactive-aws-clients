// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2ResponseBuilderOps(val self: ListObjectsV2Response.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentsAsScala(value: Option[Seq[S3Object]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contents(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonPrefixesAsScala(value: Option[Seq[CommonPrefix]]): ListObjectsV2Response.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.commonPrefixes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyCountAsScala(value: Option[Int]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.keyCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextContinuationTokenAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAfterAsScala(value: Option[String]): ListObjectsV2Response.Builder = {
    value.fold(self) { v =>
      self.startAfter(v)
    }
  }

}

final class ListObjectsV2ResponseOps(val self: ListObjectsV2Response) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentsAsScala: Option[Seq[S3Object]] = Option(self.contents).map { v =>
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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyCountAsScala: Option[Int] = Option(self.keyCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAfterAsScala: Option[String] = Option(self.startAfter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2ResponseOps {

  implicit def toListObjectsV2ResponseBuilderOps(v: ListObjectsV2Response.Builder): ListObjectsV2ResponseBuilderOps =
    new ListObjectsV2ResponseBuilderOps(v)

  implicit def toListObjectsV2ResponseOps(v: ListObjectsV2Response): ListObjectsV2ResponseOps =
    new ListObjectsV2ResponseOps(v)

}
