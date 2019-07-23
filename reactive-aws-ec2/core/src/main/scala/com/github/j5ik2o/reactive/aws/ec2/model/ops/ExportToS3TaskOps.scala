// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportToS3TaskBuilderOps(val self: ExportToS3Task.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerFormatAsScala(value: Option[ContainerFormat]): ExportToS3Task.Builder = {
    value.fold(self) { v =>
      self.containerFormat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala(value: Option[DiskImageFormat]): ExportToS3Task.Builder = {
    value.fold(self) { v =>
      self.diskImageFormat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): ExportToS3Task.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala(value: Option[String]): ExportToS3Task.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  }

}

final class ExportToS3TaskOps(val self: ExportToS3Task) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerFormatAsScala: Option[ContainerFormat] = Option(self.containerFormat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala: Option[DiskImageFormat] = Option(self.diskImageFormat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportToS3TaskOps {

  implicit def toExportToS3TaskBuilderOps(v: ExportToS3Task.Builder): ExportToS3TaskBuilderOps =
    new ExportToS3TaskBuilderOps(v)

  implicit def toExportToS3TaskOps(v: ExportToS3Task): ExportToS3TaskOps = new ExportToS3TaskOps(v)

}
