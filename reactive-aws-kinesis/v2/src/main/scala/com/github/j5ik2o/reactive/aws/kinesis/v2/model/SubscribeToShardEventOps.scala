// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SubscribeToShardEvent => ScalaSubscribeToShardEvent, _ }
import software.amazon.awssdk.services.kinesis.model.{ SubscribeToShardEvent => JavaSubscribeToShardEvent }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SubscribeToShardEventOps {

  implicit class ScalaSubscribeToShardEventOps(val self: ScalaSubscribeToShardEvent) extends AnyVal {

    def toJava: JavaSubscribeToShardEvent = {
      val result = JavaSubscribeToShardEvent.builder()
      self.records.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, RecordOps._; result.records(v.map(_.toJava).asJava)
      } // Seq[Record]
      self.continuationSequenceNumber.filter(_.nonEmpty).foreach(v => result.continuationSequenceNumber(v)) // String
      self.millisBehindLatest.map(_.longValue).foreach(v => result.millisBehindLatest(v))                   // Long

      result.build()
    }

  }

  implicit class JavaSubscribeToShardEventOps(val self: JavaSubscribeToShardEvent) extends AnyVal {

    def toScala: ScalaSubscribeToShardEvent = {
      ScalaSubscribeToShardEvent()
        .withRecords(Option(self.records).map { v =>
          import scala.collection.JavaConverters._, RecordOps._; v.asScala.map(_.toScala)
        }) // Seq[Record]
        .withContinuationSequenceNumber(Option(self.continuationSequenceNumber)) // String
        .withMillisBehindLatest(Option(self.millisBehindLatest).map(_.longValue)) // Long
    }

  }

}
