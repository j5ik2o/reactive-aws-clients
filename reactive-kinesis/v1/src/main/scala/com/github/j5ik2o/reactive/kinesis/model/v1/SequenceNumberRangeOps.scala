package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ SequenceNumberRange => JavaSequenceNumberRange }
import com.github.j5ik2o.reactive.kinesis.model.{ SequenceNumberRange => ScalaSequenceNumberRange }

object SequenceNumberRangeOps {

  implicit class ScalaSequenceNumberRangeOps(val self: ScalaSequenceNumberRange) extends AnyVal {

    def toJava: JavaSequenceNumberRange = {
      val result = new JavaSequenceNumberRange()
      self.startingSequenceNumber.foreach(result.setStartingSequenceNumber)
      self.endingSequenceNumber.foreach(result.setEndingSequenceNumber)
      result
    }

  }

  implicit class JavaSequenceNumberRangeOps(val self: JavaSequenceNumberRange) extends AnyVal {

    def toScala: ScalaSequenceNumberRange = {
      ScalaSequenceNumberRange()
        .withStartingSequenceNumber(Option(self.getStartingSequenceNumber))
        .withEndingSequenceNumber(Option(self.getEndingSequenceNumber))
    }

  }

}
