// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CopyPartResult => ScalaCopyPartResult, _ }
import software.amazon.awssdk.services.s3.model.{ CopyPartResult => JavaCopyPartResult }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CopyPartResultOps {

  implicit class ScalaCopyPartResultOps(val self: ScalaCopyPartResult) extends AnyVal {

    def toJava: JavaCopyPartResult = {
      val result = JavaCopyPartResult.builder()
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v)) // String
      self.lastModified.foreach(v => result.lastModified(v))    // Instant

      result.build()
    }

  }

  implicit class JavaCopyPartResultOps(val self: JavaCopyPartResult) extends AnyVal {

    def toScala: ScalaCopyPartResult = {
      ScalaCopyPartResult()
        .withETag(Option(self.eTag)) // String
        .withLastModified(Option(self.lastModified)) // Instant
    }

  }

}
