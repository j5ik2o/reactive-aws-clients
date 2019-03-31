// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ S3Object => ScalaS3Object, _ }
import software.amazon.awssdk.services.s3.model.{ S3Object => JavaS3Object }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object S3ObjectOps {

  implicit class ScalaS3ObjectOps(val self: ScalaS3Object) extends AnyVal {

    def toJava: JavaS3Object = {
      val result = JavaS3Object.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))   // String
      self.lastModified.foreach(v => result.lastModified(v))    // Instant
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v)) // String
      self.size.map(_.longValue).foreach(v => result.size(v))   // Long
      self.storageClass.foreach { v =>
        import ObjectStorageClassOps._; result.storageClass(v.toJava)
      } // String
      self.owner.foreach { v =>
        import OwnerOps._; result.owner(v.toJava)
      } // Owner

      result.build()
    }

  }

  implicit class JavaS3ObjectOps(val self: JavaS3Object) extends AnyVal {

    def toScala: ScalaS3Object = {
      ScalaS3Object()
        .withKey(Option(self.key)) // String
        .withLastModified(Option(self.lastModified)) // Instant
        .withETag(Option(self.eTag)) // String
        .withSize(Option(self.size).map(_.longValue)) // Long
        .withStorageClass(Option(self.storageClass).map { v =>
          import ObjectStorageClassOps._; v.toScala
        }) // String
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
    }

  }

}
