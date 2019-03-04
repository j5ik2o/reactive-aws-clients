package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ HashKeyRange => JavaHashKeyRange }
import com.github.j5ik2o.reactive.kinesis.model.{ HashKeyRange => ScalaHashKeyRange }

object HashKeyRangeOps {

  implicit class ScalaHashKeyRangeOps(val self: ScalaHashKeyRange) extends AnyVal {

    def toJava: JavaHashKeyRange = {
      val result = new JavaHashKeyRange()
      self.startingHashKey.foreach(result.setStartingHashKey)
      self.endingHashKey.foreach(result.setEndingHashKey)
      result
    }

  }

  implicit class JavaHashKeyRangeOps(val self: JavaHashKeyRange) extends AnyVal {

    def toScala: ScalaHashKeyRange = {
      ScalaHashKeyRange()
        .withStartingHashKey(Option(self.getStartingHashKey))
        .withEndingHashKey(Option(self.getEndingHashKey))
    }

  }

}
