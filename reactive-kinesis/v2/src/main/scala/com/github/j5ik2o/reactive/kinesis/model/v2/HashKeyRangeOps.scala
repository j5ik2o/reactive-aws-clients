package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ HashKeyRange => ScalaHashKeyRange }
import software.amazon.awssdk.services.kinesis.model.{ HashKeyRange => JavaHashKeyRange }

object HashKeyRangeOps {

  implicit class ScalaHashKeyRangeOps(val self: ScalaHashKeyRange) extends AnyVal {

    def toJava: JavaHashKeyRange = {
      val result = JavaHashKeyRange.builder()
      self.startingHashKey.foreach(result.startingHashKey)
      self.endingHashKey.foreach(result.endingHashKey)
      result.build()
    }

  }

  implicit class JavaHashKeyRangeOps(val self: JavaHashKeyRange) extends AnyVal {

    def toScala: ScalaHashKeyRange = {
      ScalaHashKeyRange()
        .withStartingHashKey(Option(self.startingHashKey()))
        .withEndingHashKey(Option(self.endingHashKey()))
    }

  }

}
