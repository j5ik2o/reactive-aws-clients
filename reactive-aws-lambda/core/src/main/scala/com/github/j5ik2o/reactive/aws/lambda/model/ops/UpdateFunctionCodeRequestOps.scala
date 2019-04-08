// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionCodeRequestBuilderOps(val self: UpdateFunctionCodeRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def zipFileAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.zipFile(v)
    }
  } // software.amazon.awssdk.core.SdkBytes

  final def s3BucketAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  } // String

  final def s3KeyAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  } // String

  final def s3ObjectVersionAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3ObjectVersion(v)
    }
  } // String

  final def publishAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.publish(v)
    }
  } // Boolean

  final def dryRunAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.dryRun(v)
    }
  } // Boolean

  final def revisionIdAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class UpdateFunctionCodeRequestOps(val self: UpdateFunctionCodeRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def zipFileAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.zipFile) // software.amazon.awssdk.core.SdkBytes

  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket) // String

  final def s3KeyAsScala: Option[String] = Option(self.s3Key) // String

  final def s3ObjectVersionAsScala: Option[String] = Option(self.s3ObjectVersion) // String

  final def publishAsScala: Option[Boolean] = Option(self.publish) // Boolean

  final def dryRunAsScala: Option[Boolean] = Option(self.dryRun) // Boolean

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionCodeRequestOps {

  implicit def toUpdateFunctionCodeRequestBuilderOps(
      v: UpdateFunctionCodeRequest.Builder
  ): UpdateFunctionCodeRequestBuilderOps = new UpdateFunctionCodeRequestBuilderOps(v)

  implicit def toUpdateFunctionCodeRequestOps(v: UpdateFunctionCodeRequest): UpdateFunctionCodeRequestOps =
    new UpdateFunctionCodeRequestOps(v)

}
