// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Bucket => ScalaBucket, _ }
import software.amazon.awssdk.services.s3.model.{ Bucket => JavaBucket }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BucketOps {

  implicit class ScalaBucketOps(val self: ScalaBucket) extends AnyVal {

    def toJava: JavaBucket = {
      val result = JavaBucket.builder()
      self.name.filter(_.nonEmpty).foreach(v => result.name(v)) // String
      self.creationDate.foreach(v => result.creationDate(v))    // Instant

      result.build()
    }

  }

  implicit class JavaBucketOps(val self: JavaBucket) extends AnyVal {

    def toScala: ScalaBucket = {
      ScalaBucket()
        .withName(Option(self.name)) // String
        .withCreationDate(Option(self.creationDate)) // Instant
    }

  }

}
