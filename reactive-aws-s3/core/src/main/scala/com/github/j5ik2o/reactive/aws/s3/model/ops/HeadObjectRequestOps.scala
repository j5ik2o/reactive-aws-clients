// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadObjectRequestBuilderOps(val self: HeadObjectRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def ifMatchAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifMatch(v)
    }
  } // String

  final def ifModifiedSinceAsScala(value: Option[java.time.Instant]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifModifiedSince(v)
    }
  } // Instant

  final def ifNoneMatchAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifNoneMatch(v)
    }
  } // String

  final def ifUnmodifiedSinceAsScala(value: Option[java.time.Instant]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ifUnmodifiedSince(v)
    }
  } // Instant

  final def keyAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def rangeAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.range(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def partNumberAsScala(value: Option[Int]): HeadObjectRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

}

final class HeadObjectRequestOps(val self: HeadObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def ifMatchAsScala: Option[String] = Option(self.ifMatch) // String

  final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince) // Instant

  final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch) // String

  final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince) // Instant

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def rangeAsScala: Option[String] = Option(self.range) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadObjectRequestOps {

  implicit def toHeadObjectRequestBuilderOps(v: HeadObjectRequest.Builder): HeadObjectRequestBuilderOps =
    new HeadObjectRequestBuilderOps(v)

  implicit def toHeadObjectRequestOps(v: HeadObjectRequest): HeadObjectRequestOps = new HeadObjectRequestOps(v)

}
