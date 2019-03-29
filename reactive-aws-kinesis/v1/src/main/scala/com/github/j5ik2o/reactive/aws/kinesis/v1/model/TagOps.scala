// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Tag => ScalaTag, _ }
import com.amazonaws.services.kinesis.model.{ Tag => JavaTag }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TagOps {

  implicit class ScalaTagOps(val self: ScalaTag) extends AnyVal {

    def toJava: JavaTag = {
      val result = new JavaTag()
      self.key.filter(_.nonEmpty).foreach(v => result.withKey(v))     // String
      self.value.filter(_.nonEmpty).foreach(v => result.withValue(v)) // String

      result
    }

  }

  implicit class JavaTagOps(val self: JavaTag) extends AnyVal {

    def toScala: ScalaTag = {
      ScalaTag()
        .withKey(Option(self.getKey)) // String
        .withValue(Option(self.getValue)) // String
    }

  }

}
