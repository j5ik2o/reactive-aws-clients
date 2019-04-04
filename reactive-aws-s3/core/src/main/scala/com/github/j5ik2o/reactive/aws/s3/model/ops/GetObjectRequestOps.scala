// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRequestBuilderOps(val self: GetObjectRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withIfMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifMatch(v)
    }
  } // String

  final def withIfModifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifModifiedSince(v)
    }
  } // Instant

  final def withIfNoneMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifNoneMatch(v)
    }
  } // String

  final def withIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifUnmodifiedSince(v)
    }
  } // Instant

  final def withKeyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withRangeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.range(v)
    }
  } // String

  final def withResponseCacheControlAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseCacheControl(v)
    }
  } // String

  final def withResponseContentDispositionAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentDisposition(v)
    }
  } // String

  final def withResponseContentEncodingAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentEncoding(v)
    }
  } // String

  final def withResponseContentLanguageAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentLanguage(v)
    }
  } // String

  final def withResponseContentTypeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentType(v)
    }
  } // String

  final def withResponseExpiresAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseExpires(v)
    }
  } // Instant

  final def withVersionIdAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withPartNumberAsScala(value: Option[Int]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

}

final class GetObjectRequestOps(val self: GetObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def ifMatchAsScala: Option[String] = Option(self.ifMatch) // String

  final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince) // Instant

  final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch) // String

  final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince) // Instant

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def rangeAsScala: Option[String] = Option(self.range) // String

  final def responseCacheControlAsScala: Option[String] = Option(self.responseCacheControl) // String

  final def responseContentDispositionAsScala: Option[String] = Option(self.responseContentDisposition) // String

  final def responseContentEncodingAsScala: Option[String] = Option(self.responseContentEncoding) // String

  final def responseContentLanguageAsScala: Option[String] = Option(self.responseContentLanguage) // String

  final def responseContentTypeAsScala: Option[String] = Option(self.responseContentType) // String

  final def responseExpiresAsScala: Option[java.time.Instant] = Option(self.responseExpires) // Instant

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRequestOps {

  implicit def toGetObjectRequestBuilderOps(v: GetObjectRequest.Builder): GetObjectRequestBuilderOps =
    new GetObjectRequestBuilderOps(v)

  implicit def toGetObjectRequestOps(v: GetObjectRequest): GetObjectRequestOps = new GetObjectRequestOps(v)

}
