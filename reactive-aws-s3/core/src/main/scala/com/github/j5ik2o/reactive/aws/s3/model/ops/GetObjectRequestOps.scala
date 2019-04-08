// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRequestBuilderOps(val self: GetObjectRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def ifMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifMatch(v)
    }
  } // String

  final def ifModifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifModifiedSince(v)
    }
  } // java.time.Instant

  final def ifNoneMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifNoneMatch(v)
    }
  } // String

  final def ifUnmodifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifUnmodifiedSince(v)
    }
  } // java.time.Instant

  final def keyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def rangeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.range(v)
    }
  } // String

  final def responseCacheControlAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseCacheControl(v)
    }
  } // String

  final def responseContentDispositionAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentDisposition(v)
    }
  } // String

  final def responseContentEncodingAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentEncoding(v)
    }
  } // String

  final def responseContentLanguageAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentLanguage(v)
    }
  } // String

  final def responseContentTypeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentType(v)
    }
  } // String

  final def responseExpiresAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseExpires(v)
    }
  } // java.time.Instant

  final def versionIdAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

  final def partNumberAsScala(value: Option[Int]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

}

final class GetObjectRequestOps(val self: GetObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def ifMatchAsScala: Option[String] = Option(self.ifMatch) // String

  final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince) // java.time.Instant

  final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch) // String

  final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince) // java.time.Instant

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def rangeAsScala: Option[String] = Option(self.range) // String

  final def responseCacheControlAsScala: Option[String] = Option(self.responseCacheControl) // String

  final def responseContentDispositionAsScala: Option[String] = Option(self.responseContentDisposition) // String

  final def responseContentEncodingAsScala: Option[String] = Option(self.responseContentEncoding) // String

  final def responseContentLanguageAsScala: Option[String] = Option(self.responseContentLanguage) // String

  final def responseContentTypeAsScala: Option[String] = Option(self.responseContentType) // String

  final def responseExpiresAsScala: Option[java.time.Instant] = Option(self.responseExpires) // java.time.Instant

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRequestOps {

  implicit def toGetObjectRequestBuilderOps(v: GetObjectRequest.Builder): GetObjectRequestBuilderOps =
    new GetObjectRequestBuilderOps(v)

  implicit def toGetObjectRequestOps(v: GetObjectRequest): GetObjectRequestOps = new GetObjectRequestOps(v)

}
