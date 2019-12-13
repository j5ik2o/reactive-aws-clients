// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class OutputConfigBuilderOps(val self: OutputConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): OutputConfig.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyPrefixAsScala(value: Option[String]): OutputConfig.Builder = {
    value.fold(self) { v =>
      self.s3KeyPrefix(v)
    }
  }

}

final class OutputConfigOps(val self: OutputConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyPrefixAsScala: Option[String] = Option(self.s3KeyPrefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputConfigOps {

  implicit def toOutputConfigBuilderOps(v: OutputConfig.Builder): OutputConfigBuilderOps = new OutputConfigBuilderOps(v)

  implicit def toOutputConfigOps(v: OutputConfig): OutputConfigOps = new OutputConfigOps(v)

}
