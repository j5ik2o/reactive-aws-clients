// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRequestBuilderOps(val self: GetObjectRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def ifMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifMatch(v)
    }
  }

  final def ifModifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifModifiedSince(v)
    }
  }

  final def ifNoneMatchAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifNoneMatch(v)
    }
  }

  final def ifUnmodifiedSinceAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifUnmodifiedSince(v)
    }
  }

  final def keyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def rangeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.range(v)
    }
  }

  final def responseCacheControlAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseCacheControl(v)
    }
  }

  final def responseContentDispositionAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentDisposition(v)
    }
  }

  final def responseContentEncodingAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentEncoding(v)
    }
  }

  final def responseContentLanguageAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentLanguage(v)
    }
  }

  final def responseContentTypeAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseContentType(v)
    }
  }

  final def responseExpiresAsScala(value: Option[java.time.Instant]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.responseExpires(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyAsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def partNumberAsScala(value: Option[Int]): GetObjectRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  }

}

final class GetObjectRequestOps(val self: GetObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def ifMatchAsScala: Option[String] = Option(self.ifMatch)

  final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince)

  final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch)

  final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince)

  final def keyAsScala: Option[String] = Option(self.key)

  final def rangeAsScala: Option[String] = Option(self.range)

  final def responseCacheControlAsScala: Option[String] = Option(self.responseCacheControl)

  final def responseContentDispositionAsScala: Option[String] = Option(self.responseContentDisposition)

  final def responseContentEncodingAsScala: Option[String] = Option(self.responseContentEncoding)

  final def responseContentLanguageAsScala: Option[String] = Option(self.responseContentLanguage)

  final def responseContentTypeAsScala: Option[String] = Option(self.responseContentType)

  final def responseExpiresAsScala: Option[java.time.Instant] = Option(self.responseExpires)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRequestOps {

  implicit def toGetObjectRequestBuilderOps(v: GetObjectRequest.Builder): GetObjectRequestBuilderOps =
    new GetObjectRequestBuilderOps(v)

  implicit def toGetObjectRequestOps(v: GetObjectRequest): GetObjectRequestOps = new GetObjectRequestOps(v)

}
