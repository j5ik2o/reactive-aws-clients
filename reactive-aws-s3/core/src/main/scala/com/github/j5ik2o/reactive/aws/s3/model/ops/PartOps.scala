// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Part => ScalaPart, _ }
import software.amazon.awssdk.services.s3.model.{ Part => JavaPart }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PartOps {

  implicit class ScalaPartOps(val self: ScalaPart) extends AnyVal {

    def toJava: JavaPart = {
      val result = JavaPart.builder()
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v)) // Int
      self.lastModified.foreach(v => result.lastModified(v))             // Instant
      self.eTag.filter(_.nonEmpty).foreach(v => result.eTag(v))          // String
      self.size.map(_.intValue).foreach(v => result.size(v))             // Int

      result.build()
    }

  }

  implicit class JavaPartOps(val self: JavaPart) extends AnyVal {

    def toScala: ScalaPart = {
      ScalaPart()
        .withPartNumber(Option(self.partNumber).map(_.intValue)) // Int
        .withLastModified(Option(self.lastModified)) // Instant
        .withETag(Option(self.eTag)) // String
        .withSize(Option(self.size).map(_.intValue)) // Int
    }

  }

}
