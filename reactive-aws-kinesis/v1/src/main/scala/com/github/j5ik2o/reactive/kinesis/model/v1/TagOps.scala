package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ Tag => JavaTag }
import com.github.j5ik2o.reactive.kinesis.model.{ Tag => ScalaTag }

object TagOps {

  implicit class JavaTagOps(val self: JavaTag) extends AnyVal {

    def toScala: ScalaTag = {
      ScalaTag()
        .withKey(Option(self.getKey))
        .withValue(Option(self.getValue))
    }

  }

  implicit class ScalaTagOps(val self: ScalaTag) extends AnyVal {

    def toJava: JavaTag = {
      val result = new JavaTag()
      self.key.foreach(result.setKey)
      self.value.foreach(result.setValue)
      result
    }

  }

}
