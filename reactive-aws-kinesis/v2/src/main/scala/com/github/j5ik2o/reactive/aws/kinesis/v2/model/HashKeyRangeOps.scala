// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ HashKeyRange => ScalaHashKeyRange, _ }
import software.amazon.awssdk.services.kinesis.model.{ HashKeyRange => JavaHashKeyRange }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HashKeyRangeOps {

  implicit class ScalaHashKeyRangeOps(val self: ScalaHashKeyRange) extends AnyVal {

    def toJava: JavaHashKeyRange = {
      val result = JavaHashKeyRange.builder()
      self.startingHashKey.filter(_.nonEmpty).foreach(v => result.startingHashKey(v)) // String
      self.endingHashKey.filter(_.nonEmpty).foreach(v => result.endingHashKey(v))     // String

      result.build()
    }

  }

  implicit class JavaHashKeyRangeOps(val self: JavaHashKeyRange) extends AnyVal {

    def toScala: ScalaHashKeyRange = {
      ScalaHashKeyRange()
        .withStartingHashKey(Option(self.startingHashKey)) // String
        .withEndingHashKey(Option(self.endingHashKey)) // String
    }

  }

}
