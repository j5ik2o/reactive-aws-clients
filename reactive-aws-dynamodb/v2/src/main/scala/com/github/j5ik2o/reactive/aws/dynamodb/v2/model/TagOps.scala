// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Tag => ScalaTag, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Tag => JavaTag }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TagOps {

  implicit class ScalaTagOps(val self: ScalaTag) extends AnyVal {

    def toJava: JavaTag = {
      val result = JavaTag.builder()
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))     // String
      self.value.filter(_.nonEmpty).foreach(v => result.value(v)) // String

      result.build()
    }

  }

  implicit class JavaTagOps(val self: JavaTag) extends AnyVal {

    def toScala: ScalaTag = {
      ScalaTag()
        .withKey(Option(self.key)) // String
        .withValue(Option(self.value)) // String
    }

  }

}
