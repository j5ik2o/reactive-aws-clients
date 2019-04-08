// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2RequestBuilderOps(val self: ListObjectsV2Request.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def delimiterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.delimiter(v)
    }
  } // String

  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.encodingType(v)
    }
  } // String

  final def maxKeysAsScala(value: Option[Int]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.maxKeys(v)
    }
  } // Int

  final def prefixAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def continuationTokenAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  } // String

  final def fetchOwnerAsScala(value: Option[Boolean]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.fetchOwner(v)
    }
  } // Boolean

  final def startAfterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.startAfter(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsV2Request.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class ListObjectsV2RequestOps(val self: ListObjectsV2Request) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def delimiterAsScala: Option[String] = Option(self.delimiter) // String

  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType) // String

  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys) // Int

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken) // String

  final def fetchOwnerAsScala: Option[Boolean] = Option(self.fetchOwner) // Boolean

  final def startAfterAsScala: Option[String] = Option(self.startAfter) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2RequestOps {

  implicit def toListObjectsV2RequestBuilderOps(v: ListObjectsV2Request.Builder): ListObjectsV2RequestBuilderOps =
    new ListObjectsV2RequestBuilderOps(v)

  implicit def toListObjectsV2RequestOps(v: ListObjectsV2Request): ListObjectsV2RequestOps =
    new ListObjectsV2RequestOps(v)

}
