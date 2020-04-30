// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportTaskS3LocationBuilderOps(val self: ExportTaskS3Location.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala(value: Option[String]): ExportTaskS3Location.Builder = {
            value.fold(self){ v => self.s3Bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3PrefixAsScala(value: Option[String]): ExportTaskS3Location.Builder = {
            value.fold(self){ v => self.s3Prefix(v) }
            } 


}

final class ExportTaskS3LocationOps(val self: ExportTaskS3Location) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala: Option[String] = Option(self.s3Bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3PrefixAsScala: Option[String] = Option(self.s3Prefix) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskS3LocationOps {

implicit def toExportTaskS3LocationBuilderOps(v: ExportTaskS3Location.Builder): ExportTaskS3LocationBuilderOps = new ExportTaskS3LocationBuilderOps(v)

implicit def toExportTaskS3LocationOps(v: ExportTaskS3Location): ExportTaskS3LocationOps = new ExportTaskS3LocationOps(v)

}

