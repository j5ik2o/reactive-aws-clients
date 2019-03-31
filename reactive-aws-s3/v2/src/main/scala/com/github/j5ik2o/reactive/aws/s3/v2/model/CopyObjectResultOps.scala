// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CopyObjectResult => ScalaCopyObjectResult, _ }
import software.amazon.awssdk.services.s3.model.{ CopyObjectResult => JavaCopyObjectResult }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CopyObjectResultOps {

  implicit class ScalaCopyObjectResultOps(val self: ScalaCopyObjectResult) extends AnyVal {

    def toJava: JavaCopyObjectResult = {
      val result = JavaCopyObjectResult.builder()
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v)) // String
      self.lastModified.foreach(v => result.lastModified(v))    // Instant

      result.build()
    }

  }

  implicit class JavaCopyObjectResultOps(val self: JavaCopyObjectResult) extends AnyVal {

    def toScala: ScalaCopyObjectResult = {
      ScalaCopyObjectResult()
        .withETag(Option(self.eTag)) // String
        .withLastModified(Option(self.lastModified)) // Instant
    }

  }

}
