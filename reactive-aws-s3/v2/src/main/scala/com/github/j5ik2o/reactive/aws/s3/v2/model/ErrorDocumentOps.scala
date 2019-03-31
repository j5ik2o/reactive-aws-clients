// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ErrorDocument => ScalaErrorDocument, _ }
import software.amazon.awssdk.services.s3.model.{ ErrorDocument => JavaErrorDocument }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ErrorDocumentOps {

  implicit class ScalaErrorDocumentOps(val self: ScalaErrorDocument) extends AnyVal {

    def toJava: JavaErrorDocument = {
      val result = JavaErrorDocument.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v)) // String

      result.build()
    }

  }

  implicit class JavaErrorDocumentOps(val self: JavaErrorDocument) extends AnyVal {

    def toScala: ScalaErrorDocument = {
      ScalaErrorDocument()
        .withKey(Option(self.key)) // String
    }

  }

}
