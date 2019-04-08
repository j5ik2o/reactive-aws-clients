// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateMultipartUploadResponseBuilderOps(val self: CreateMultipartUploadResponse.Builder) extends AnyVal {

  final def abortDateAsScala(value: Option[java.time.Instant]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  } // Instant

  final def abortRuleIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  } // String

  final def bucketAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def uploadIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def requestChargedAsScala(value: Option[RequestCharged]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class CreateMultipartUploadResponseOps(val self: CreateMultipartUploadResponse) extends AnyVal {

  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate) // Instant

  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateMultipartUploadResponseOps {

  implicit def toCreateMultipartUploadResponseBuilderOps(
      v: CreateMultipartUploadResponse.Builder
  ): CreateMultipartUploadResponseBuilderOps = new CreateMultipartUploadResponseBuilderOps(v)

  implicit def toCreateMultipartUploadResponseOps(v: CreateMultipartUploadResponse): CreateMultipartUploadResponseOps =
    new CreateMultipartUploadResponseOps(v)

}
