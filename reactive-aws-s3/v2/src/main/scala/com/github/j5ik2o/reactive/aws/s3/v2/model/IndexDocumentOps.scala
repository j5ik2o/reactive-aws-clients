// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ IndexDocument => ScalaIndexDocument, _ }
import software.amazon.awssdk.services.s3.model.{ IndexDocument => JavaIndexDocument }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IndexDocumentOps {

  implicit class ScalaIndexDocumentOps(val self: ScalaIndexDocument) extends AnyVal {

    def toJava: JavaIndexDocument = {
      val result = JavaIndexDocument.builder()
      self.suffix.filter(_.nonEmpty).foreach(v => result.suffix(v)) // String

      result.build()
    }

  }

  implicit class JavaIndexDocumentOps(val self: JavaIndexDocument) extends AnyVal {

    def toScala: ScalaIndexDocument = {
      ScalaIndexDocument()
        .withSuffix(Option(self.suffix)) // String
    }

  }

}
