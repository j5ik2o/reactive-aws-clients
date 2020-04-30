// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportTaskS3LocationRequestBuilderOps(val self: ExportTaskS3LocationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala(value: Option[String]): ExportTaskS3LocationRequest.Builder = {
            value.fold(self){ v => self.s3Bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3PrefixAsScala(value: Option[String]): ExportTaskS3LocationRequest.Builder = {
            value.fold(self){ v => self.s3Prefix(v) }
            } 


}

final class ExportTaskS3LocationRequestOps(val self: ExportTaskS3LocationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala: Option[String] = Option(self.s3Bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3PrefixAsScala: Option[String] = Option(self.s3Prefix) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskS3LocationRequestOps {

implicit def toExportTaskS3LocationRequestBuilderOps(v: ExportTaskS3LocationRequest.Builder): ExportTaskS3LocationRequestBuilderOps = new ExportTaskS3LocationRequestBuilderOps(v)

implicit def toExportTaskS3LocationRequestOps(v: ExportTaskS3LocationRequest): ExportTaskS3LocationRequestOps = new ExportTaskS3LocationRequestOps(v)

}

