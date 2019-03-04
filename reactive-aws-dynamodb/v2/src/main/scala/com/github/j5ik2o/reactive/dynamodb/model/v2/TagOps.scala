package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ Tag => ScalaTag }
import software.amazon.awssdk.services.dynamodb.model.{ Tag => JavaTag }

object TagOps {

  implicit class ScalaTagOps(val self: ScalaTag) extends AnyVal {

    def toJava: JavaTag = {
      val result = JavaTag.builder()
      self.key.foreach(result.key)
      self.value.foreach(result.value)
      result.build()
    }

  }

  implicit class JavaTagOps(val self: JavaTag) extends AnyVal {

    def toScala: ScalaTag = {
      ScalaTag().withKey(Option(self.key)).withValue(Option(self.value))
    }

  }

}
