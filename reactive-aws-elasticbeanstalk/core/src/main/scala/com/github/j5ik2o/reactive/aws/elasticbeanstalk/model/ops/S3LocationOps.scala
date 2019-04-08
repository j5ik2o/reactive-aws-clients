// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class S3LocationBuilderOps(val self: S3Location.Builder) extends AnyVal {

  final def s3BucketAsScala(value: Option[String]): S3Location.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  final def s3KeyAsScala(value: Option[String]): S3Location.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  }

}

final class S3LocationOps(val self: S3Location) extends AnyVal {

  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3LocationOps {

  implicit def toS3LocationBuilderOps(v: S3Location.Builder): S3LocationBuilderOps = new S3LocationBuilderOps(v)

  implicit def toS3LocationOps(v: S3Location): S3LocationOps = new S3LocationOps(v)

}
