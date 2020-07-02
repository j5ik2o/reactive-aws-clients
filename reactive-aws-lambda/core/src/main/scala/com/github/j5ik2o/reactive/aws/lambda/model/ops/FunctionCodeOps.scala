// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class FunctionCodeBuilderOps(val self: FunctionCode.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): FunctionCode.Builder = {
    value.fold(self) { v => self.zipFile(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): FunctionCode.Builder = {
    value.fold(self) { v => self.s3Bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala(value: Option[String]): FunctionCode.Builder = {
    value.fold(self) { v => self.s3Key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala(value: Option[String]): FunctionCode.Builder = {
    value.fold(self) { v => self.s3ObjectVersion(v) }
  }

}

final class FunctionCodeOps(val self: FunctionCode) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.zipFile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala: Option[String] = Option(self.s3ObjectVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFunctionCodeOps {

  implicit def toFunctionCodeBuilderOps(v: FunctionCode.Builder): FunctionCodeBuilderOps = new FunctionCodeBuilderOps(v)

  implicit def toFunctionCodeOps(v: FunctionCode): FunctionCodeOps = new FunctionCodeOps(v)

}
