// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ConsumerDescription => ScalaConsumerDescription, _ }
import com.amazonaws.services.kinesis.model.{ ConsumerDescription => JavaConsumerDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumerDescriptionOps {

  implicit class ScalaConsumerDescriptionOps(val self: ScalaConsumerDescription) extends AnyVal {

    def toJava: JavaConsumerDescription = {
      val result = new JavaConsumerDescription()
      self.consumerName.filter(_.nonEmpty).foreach(v => result.withConsumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.withConsumerARN(v))   // String
      self.consumerStatus.foreach { v =>
        import ConsumerStatusOps._; result.withConsumerStatus(v.toJava)
      } // String
      self.consumerCreationTimestamp
        .map(java.util.Date.from).foreach(v => result.withConsumerCreationTimestamp(v)) // Instant
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))           // String

      result
    }

  }

  implicit class JavaConsumerDescriptionOps(val self: JavaConsumerDescription) extends AnyVal {

    def toScala: ScalaConsumerDescription = {
      ScalaConsumerDescription()
        .withConsumerName(Option(self.getConsumerName)) // String
        .withConsumerARN(Option(self.getConsumerARN)) // String
        .withConsumerStatus(Option(self.getConsumerStatus).map { v =>
          import ConsumerStatusOps._; v.toScala
        }) // String
        .withConsumerCreationTimestamp(Option(self.getConsumerCreationTimestamp).map(_.toInstant)) // Instant
        .withStreamARN(Option(self.getStreamARN)) // String
    }

  }

}
