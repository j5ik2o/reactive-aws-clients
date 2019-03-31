// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ S3ResponseMetadata => ScalaS3ResponseMetadata, _ }
import software.amazon.awssdk.services.s3.model.{ S3ResponseMetadata => JavaS3ResponseMetadata }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object S3ResponseMetadataOps {

  implicit class ScalaS3ResponseMetadataOps(val self: ScalaS3ResponseMetadata) extends AnyVal {

    def toJava: JavaS3ResponseMetadata = {
      val result = JavaS3ResponseMetadata.builder()

      result.build()
    }

  }

  implicit class JavaS3ResponseMetadataOps(val self: JavaS3ResponseMetadata) extends AnyVal {

    def toScala: ScalaS3ResponseMetadata = {
      ScalaS3ResponseMetadata()
    }

  }

}
