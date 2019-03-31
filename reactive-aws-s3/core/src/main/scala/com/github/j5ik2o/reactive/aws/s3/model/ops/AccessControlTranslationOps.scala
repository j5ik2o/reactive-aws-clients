// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AccessControlTranslation => ScalaAccessControlTranslation, _ }
import software.amazon.awssdk.services.s3.model.{ AccessControlTranslation => JavaAccessControlTranslation }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AccessControlTranslationOps {

  implicit class ScalaAccessControlTranslationOps(val self: ScalaAccessControlTranslation) extends AnyVal {

    def toJava: JavaAccessControlTranslation = {
      val result = JavaAccessControlTranslation.builder()
      self.owner.foreach { v =>
        import OwnerOverrideOps._; result.owner(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaAccessControlTranslationOps(val self: JavaAccessControlTranslation) extends AnyVal {

    def toScala: ScalaAccessControlTranslation = {
      ScalaAccessControlTranslation()
        .withOwner(Option(self.owner).map { v =>
          import OwnerOverrideOps._; v.toScala
        }) // String
    }

  }

}
