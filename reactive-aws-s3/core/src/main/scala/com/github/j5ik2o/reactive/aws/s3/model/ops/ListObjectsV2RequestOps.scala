// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2RequestBuilderOps(val self: ListObjectsV2Request.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def delimiterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  }

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  }

  final def maxKeysAsScala(value: Option[Int]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def continuationTokenAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  }

  final def fetchOwnerAsScala(value: Option[Boolean]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.fetchOwner(v)
    }
  }

  final def startAfterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.startAfter(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class ListObjectsV2RequestOps(val self: ListObjectsV2Request) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  final def fetchOwnerAsScala: Option[Boolean] = Option(self.fetchOwner)

  final def startAfterAsScala: Option[String] = Option(self.startAfter)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2RequestOps {

  implicit def toListObjectsV2RequestBuilderOps(v: ListObjectsV2Request.Builder): ListObjectsV2RequestBuilderOps =
    new ListObjectsV2RequestBuilderOps(v)

  implicit def toListObjectsV2RequestOps(v: ListObjectsV2Request): ListObjectsV2RequestOps =
    new ListObjectsV2RequestOps(v)

}
