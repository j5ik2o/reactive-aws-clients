// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ HashKeyRange => ScalaHashKeyRange, _ }
import com.amazonaws.services.kinesis.model.{ HashKeyRange => JavaHashKeyRange }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HashKeyRangeOps {

  implicit class ScalaHashKeyRangeOps(val self: ScalaHashKeyRange) extends AnyVal {

    def toJava: JavaHashKeyRange = {
      val result = new JavaHashKeyRange()
      self.startingHashKey.filter(_.nonEmpty).foreach(v => result.withStartingHashKey(v)) // String
      self.endingHashKey.filter(_.nonEmpty).foreach(v => result.withEndingHashKey(v))     // String

      result
    }

  }

  implicit class JavaHashKeyRangeOps(val self: JavaHashKeyRange) extends AnyVal {

    def toScala: ScalaHashKeyRange = {
      ScalaHashKeyRange()
        .withStartingHashKey(Option(self.getStartingHashKey)) // String
        .withEndingHashKey(Option(self.getEndingHashKey)) // String
    }

  }

}
