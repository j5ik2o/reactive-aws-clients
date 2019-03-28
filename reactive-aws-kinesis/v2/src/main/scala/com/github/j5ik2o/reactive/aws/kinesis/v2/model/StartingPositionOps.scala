// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StartingPosition => ScalaStartingPosition, _ }
import software.amazon.awssdk.services.kinesis.model.{ StartingPosition => JavaStartingPosition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StartingPositionOps {

  implicit class ScalaStartingPositionOps(val self: ScalaStartingPosition) extends AnyVal {

    def toJava: JavaStartingPosition = {
      val result = JavaStartingPosition.builder()
      self.`type`.foreach { v =>
        import ShardIteratorTypeOps._; result.`type`(v.toJava)
      } // String
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v)) // String
      self.timestamp.foreach(v => result.timestamp(v))                              // Instant

      result.build()
    }

  }

  implicit class JavaStartingPositionOps(val self: JavaStartingPosition) extends AnyVal {

    def toScala: ScalaStartingPosition = {
      ScalaStartingPosition()
        .withType(Option(self.`type`).map { v =>
          import ShardIteratorTypeOps._; v.toScala
        }) // String
        .withSequenceNumber(Option(self.sequenceNumber)) // String
        .withTimestamp(Option(self.timestamp)) // Instant
    }

  }

}
