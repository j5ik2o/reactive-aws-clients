// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ S3Error => ScalaS3Error, _ }
import software.amazon.awssdk.services.s3.model.{ S3Error => JavaS3Error }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object S3ErrorOps {

  implicit class ScalaS3ErrorOps(val self: ScalaS3Error) extends AnyVal {

    def toJava: JavaS3Error = {
      val result = JavaS3Error.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.code.filter(_.nonEmpty).foreach(v => result.code(v))           // String
      self.message.filter(_.nonEmpty).foreach(v => result.message(v))     // String

      result.build()
    }

  }

  implicit class JavaS3ErrorOps(val self: JavaS3Error) extends AnyVal {

    def toScala: ScalaS3Error = {
      ScalaS3Error()
        .withKey(Option(self.key)) // String
        .withVersionId(Option(self.versionId)) // String
        .withCode(Option(self.code)) // String
        .withMessage(Option(self.message)) // String
    }

  }

}
