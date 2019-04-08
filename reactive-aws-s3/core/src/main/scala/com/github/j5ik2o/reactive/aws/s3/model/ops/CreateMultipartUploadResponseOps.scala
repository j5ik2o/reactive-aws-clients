// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateMultipartUploadResponseBuilderOps(val self: CreateMultipartUploadResponse.Builder) extends AnyVal {

  final def abortDateAsScala(value: Option[java.time.Instant]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  }

  final def abortRuleIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  }

  final def bucketAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class CreateMultipartUploadResponseOps(val self: CreateMultipartUploadResponse) extends AnyVal {

  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate)

  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateMultipartUploadResponseOps {

  implicit def toCreateMultipartUploadResponseBuilderOps(
      v: CreateMultipartUploadResponse.Builder
  ): CreateMultipartUploadResponseBuilderOps = new CreateMultipartUploadResponseBuilderOps(v)

  implicit def toCreateMultipartUploadResponseOps(v: CreateMultipartUploadResponse): CreateMultipartUploadResponseOps =
    new CreateMultipartUploadResponseOps(v)

}
