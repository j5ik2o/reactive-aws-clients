// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Grantee => ScalaGrantee, _ }
import software.amazon.awssdk.services.s3.model.{ Grantee => JavaGrantee }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GranteeOps {

  implicit class ScalaGranteeOps(val self: ScalaGrantee) extends AnyVal {

    def toJava: JavaGrantee = {
      val result = JavaGrantee.builder()
      self.displayName.filter(_.nonEmpty).foreach(v => result.displayName(v))   // String
      self.emailAddress.filter(_.nonEmpty).foreach(v => result.emailAddress(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))                     // String
      self.`type`.foreach { v =>
        import TypeOps._; result.`type`(v.toJava)
      } // String
      self.uri.filter(_.nonEmpty).foreach(v => result.uri(v)) // String

      result.build()
    }

  }

  implicit class JavaGranteeOps(val self: JavaGrantee) extends AnyVal {

    def toScala: ScalaGrantee = {
      ScalaGrantee()
        .withDisplayName(Option(self.displayName)) // String
        .withEmailAddress(Option(self.emailAddress)) // String
        .withId(Option(self.id)) // String
        .withType(Option(self.`type`).map { v =>
          import TypeOps._; v.toScala
        }) // String
        .withUri(Option(self.uri)) // String
    }

  }

}
