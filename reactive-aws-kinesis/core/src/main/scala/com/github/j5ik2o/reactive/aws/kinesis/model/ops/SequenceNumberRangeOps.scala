// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SequenceNumberRange => ScalaSequenceNumberRange, _ }
import software.amazon.awssdk.services.kinesis.model.{ SequenceNumberRange => JavaSequenceNumberRange }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SequenceNumberRangeOps {

  implicit class ScalaSequenceNumberRangeOps(val self: ScalaSequenceNumberRange) extends AnyVal {

    def toJava: JavaSequenceNumberRange = {
      val result = JavaSequenceNumberRange.builder()
      self.startingSequenceNumber.filter(_.nonEmpty).foreach(v => result.startingSequenceNumber(v)) // String
      self.endingSequenceNumber.filter(_.nonEmpty).foreach(v => result.endingSequenceNumber(v))     // String

      result.build()
    }

  }

  implicit class JavaSequenceNumberRangeOps(val self: JavaSequenceNumberRange) extends AnyVal {

    def toScala: ScalaSequenceNumberRange = {
      ScalaSequenceNumberRange()
        .withStartingSequenceNumber(Option(self.startingSequenceNumber)) // String
        .withEndingSequenceNumber(Option(self.endingSequenceNumber)) // String
    }

  }

}
