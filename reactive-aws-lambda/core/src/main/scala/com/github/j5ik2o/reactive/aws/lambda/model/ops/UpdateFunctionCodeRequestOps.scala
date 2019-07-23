// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionCodeRequestBuilderOps(val self: UpdateFunctionCodeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.zipFile(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3ObjectVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publishAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.publish(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dryRunAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.dryRun(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class UpdateFunctionCodeRequestOps(val self: UpdateFunctionCodeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.zipFile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala: Option[String] = Option(self.s3ObjectVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publishAsScala: Option[Boolean] = Option(self.publish)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dryRunAsScala: Option[Boolean] = Option(self.dryRun)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionCodeRequestOps {

  implicit def toUpdateFunctionCodeRequestBuilderOps(
      v: UpdateFunctionCodeRequest.Builder
  ): UpdateFunctionCodeRequestBuilderOps = new UpdateFunctionCodeRequestBuilderOps(v)

  implicit def toUpdateFunctionCodeRequestOps(v: UpdateFunctionCodeRequest): UpdateFunctionCodeRequestOps =
    new UpdateFunctionCodeRequestOps(v)

}
