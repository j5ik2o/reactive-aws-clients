// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CompletedPart => ScalaCompletedPart, _ }
import software.amazon.awssdk.services.s3.model.{ CompletedPart => JavaCompletedPart }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CompletedPartOps {

  implicit class ScalaCompletedPartOps(val self: ScalaCompletedPart) extends AnyVal {

    def toJava: JavaCompletedPart = {
      val result = JavaCompletedPart.builder()
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v))          // String
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v)) // Int

      result.build()
    }

  }

  implicit class JavaCompletedPartOps(val self: JavaCompletedPart) extends AnyVal {

    def toScala: ScalaCompletedPart = {
      ScalaCompletedPart()
        .withETag(Option(self.eTag)) // String
        .withPartNumber(Option(self.partNumber).map(_.intValue)) // Int
    }

  }

}
