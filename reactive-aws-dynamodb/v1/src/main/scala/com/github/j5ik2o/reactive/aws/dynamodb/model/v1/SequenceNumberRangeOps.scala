// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SequenceNumberRange => ScalaSequenceNumberRange, _ }
import com.amazonaws.services.dynamodbv2.model.{ SequenceNumberRange => JavaSequenceNumberRange }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SequenceNumberRangeOps {

  implicit class ScalaSequenceNumberRangeOps(val self: ScalaSequenceNumberRange) extends AnyVal {

    def toJava: JavaSequenceNumberRange = {
      val result = new JavaSequenceNumberRange()
      self.startingSequenceNumber.filter(_.nonEmpty).foreach(v => result.withStartingSequenceNumber(v)) // String
      self.endingSequenceNumber.filter(_.nonEmpty).foreach(v => result.withEndingSequenceNumber(v))     // String

      result
    }

  }

  implicit class JavaSequenceNumberRangeOps(val self: JavaSequenceNumberRange) extends AnyVal {

    def toScala: ScalaSequenceNumberRange = {
      ScalaSequenceNumberRange()
        .withStartingSequenceNumber(Option(self.getStartingSequenceNumber)) // String
        .withEndingSequenceNumber(Option(self.getEndingSequenceNumber)) // String
    }

  }

}
