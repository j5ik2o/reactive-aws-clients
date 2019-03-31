// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Initiator => ScalaInitiator, _ }
import software.amazon.awssdk.services.s3.model.{ Initiator => JavaInitiator }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InitiatorOps {

  implicit class ScalaInitiatorOps(val self: ScalaInitiator) extends AnyVal {

    def toJava: JavaInitiator = {
      val result = JavaInitiator.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))                   // String
      self.displayName.filter(_.nonEmpty).foreach(v => result.displayName(v)) // String

      result.build()
    }

  }

  implicit class JavaInitiatorOps(val self: JavaInitiator) extends AnyVal {

    def toScala: ScalaInitiator = {
      ScalaInitiator()
        .withId(Option(self.id)) // String
        .withDisplayName(Option(self.displayName)) // String
    }

  }

}
