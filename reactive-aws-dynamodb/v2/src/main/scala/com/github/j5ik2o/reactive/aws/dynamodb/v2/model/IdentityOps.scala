// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Identity => ScalaIdentity, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Identity => JavaIdentity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IdentityOps {

  implicit class ScalaIdentityOps(val self: ScalaIdentity) extends AnyVal {

    def toJava: JavaIdentity = {
      val result = JavaIdentity.builder()
      self.principalId.filter(_.nonEmpty).foreach(v => result.principalId(v)) // String
      self.`type`.filter(_.nonEmpty).foreach(v => result.`type`(v))           // String

      result.build()
    }

  }

  implicit class JavaIdentityOps(val self: JavaIdentity) extends AnyVal {

    def toScala: ScalaIdentity = {
      ScalaIdentity()
        .withPrincipalId(Option(self.principalId)) // String
        .withType(Option(self.`type`)) // String
    }

  }

}
