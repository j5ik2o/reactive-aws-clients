// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Identity => ScalaIdentity, _ }
import com.amazonaws.services.dynamodbv2.model.{ Identity => JavaIdentity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IdentityOps {

  implicit class ScalaIdentityOps(val self: ScalaIdentity) extends AnyVal {

    def toJava: JavaIdentity = {
      val result = new JavaIdentity()
      self.principalId.filter(_.nonEmpty).foreach(v => result.withPrincipalId(v)) // String
      self.`type`.filter(_.nonEmpty).foreach(v => result.withType(v))             // String

      result
    }

  }

  implicit class JavaIdentityOps(val self: JavaIdentity) extends AnyVal {

    def toScala: ScalaIdentity = {
      ScalaIdentity()
        .withPrincipalId(Option(self.getPrincipalId)) // String
        .withType(Option(self.getType)) // String
    }

  }

}
