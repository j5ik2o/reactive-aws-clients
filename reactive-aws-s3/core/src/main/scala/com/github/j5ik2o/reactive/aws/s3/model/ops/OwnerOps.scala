// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Owner => ScalaOwner, _ }
import software.amazon.awssdk.services.s3.model.{ Owner => JavaOwner }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object OwnerOps {

  implicit class ScalaOwnerOps(val self: ScalaOwner) extends AnyVal {

    def toJava: JavaOwner = {
      val result = JavaOwner.builder()
      self.displayName.filter(_.nonEmpty).foreach(v => result.displayName(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))                   // String

      result.build()
    }

  }

  implicit class JavaOwnerOps(val self: JavaOwner) extends AnyVal {

    def toScala: ScalaOwner = {
      ScalaOwner()
        .withDisplayName(Option(self.displayName)) // String
        .withId(Option(self.id)) // String
    }

  }

}
