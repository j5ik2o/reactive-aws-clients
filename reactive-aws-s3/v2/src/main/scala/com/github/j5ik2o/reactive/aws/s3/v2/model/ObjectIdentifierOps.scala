// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectIdentifier => ScalaObjectIdentifier, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectIdentifier => JavaObjectIdentifier }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectIdentifierOps {

  implicit class ScalaObjectIdentifierOps(val self: ScalaObjectIdentifier) extends AnyVal {

    def toJava: JavaObjectIdentifier = {
      val result = JavaObjectIdentifier.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String

      result.build()
    }

  }

  implicit class JavaObjectIdentifierOps(val self: JavaObjectIdentifier) extends AnyVal {

    def toScala: ScalaObjectIdentifier = {
      ScalaObjectIdentifier()
        .withKey(Option(self.key)) // String
        .withVersionId(Option(self.versionId)) // String
    }

  }

}
