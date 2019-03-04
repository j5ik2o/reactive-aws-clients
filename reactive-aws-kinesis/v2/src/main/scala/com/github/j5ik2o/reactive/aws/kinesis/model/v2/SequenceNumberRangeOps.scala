package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SequenceNumberRange => ScalaSequenceNumberRange }
import software.amazon.awssdk.services.kinesis.model.{ SequenceNumberRange => JavaSequenceNumberRange }

object SequenceNumberRangeOps {

  implicit class ScalaSequenceNumberRangeOps(val self: ScalaSequenceNumberRange) extends AnyVal {

    def toJava: JavaSequenceNumberRange = {
      val result = JavaSequenceNumberRange.builder()
      self.startingSequenceNumber.foreach(result.startingSequenceNumber)
      self.endingSequenceNumber.foreach(result.endingSequenceNumber)
      result.build()
    }

  }

  implicit class JavaSequenceNumberRangeOps(val self: JavaSequenceNumberRange) extends AnyVal {

    def toScala: ScalaSequenceNumberRange = {
      ScalaSequenceNumberRange()
        .withStartingSequenceNumber(Option(self.startingSequenceNumber()))
        .withEndingSequenceNumber(Option(self.endingSequenceNumber()))
    }

  }

}
