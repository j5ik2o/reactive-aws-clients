// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportToS3TaskSpecificationBuilderOps(val self: ExportToS3TaskSpecification.Builder) extends AnyVal {

  final def containerFormatAsScala(value: Option[ContainerFormat]): ExportToS3TaskSpecification.Builder = {
    value.fold(self) { v =>
      self.containerFormat(v)
    }
  }

  final def diskImageFormatAsScala(value: Option[DiskImageFormat]): ExportToS3TaskSpecification.Builder = {
    value.fold(self) { v =>
      self.diskImageFormat(v)
    }
  }

  final def s3BucketAsScala(value: Option[String]): ExportToS3TaskSpecification.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  final def s3PrefixAsScala(value: Option[String]): ExportToS3TaskSpecification.Builder = {
    value.fold(self) { v =>
      self.s3Prefix(v)
    }
  }

}

final class ExportToS3TaskSpecificationOps(val self: ExportToS3TaskSpecification) extends AnyVal {

  final def containerFormatAsScala: Option[ContainerFormat] = Option(self.containerFormat)

  final def diskImageFormatAsScala: Option[DiskImageFormat] = Option(self.diskImageFormat)

  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  final def s3PrefixAsScala: Option[String] = Option(self.s3Prefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportToS3TaskSpecificationOps {

  implicit def toExportToS3TaskSpecificationBuilderOps(
      v: ExportToS3TaskSpecification.Builder
  ): ExportToS3TaskSpecificationBuilderOps = new ExportToS3TaskSpecificationBuilderOps(v)

  implicit def toExportToS3TaskSpecificationOps(v: ExportToS3TaskSpecification): ExportToS3TaskSpecificationOps =
    new ExportToS3TaskSpecificationOps(v)

}
