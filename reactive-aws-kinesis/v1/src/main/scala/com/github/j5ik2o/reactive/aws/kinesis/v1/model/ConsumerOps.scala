// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Consumer => ScalaConsumer, _ }
import com.amazonaws.services.kinesis.model.{ Consumer => JavaConsumer }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumerOps {

  implicit class ScalaConsumerOps(val self: ScalaConsumer) extends AnyVal {

    def toJava: JavaConsumer = {
      val result = new JavaConsumer()
      self.consumerName.filter(_.nonEmpty).foreach(v => result.withConsumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.withConsumerARN(v))   // String
      self.consumerStatus.foreach { v =>
        import ConsumerStatusOps._; result.withConsumerStatus(v.toJava)
      } // String
      self.consumerCreationTimestamp
        .map(java.util.Date.from).foreach(v => result.withConsumerCreationTimestamp(v)) // Instant

      result
    }

  }

  implicit class JavaConsumerOps(val self: JavaConsumer) extends AnyVal {

    def toScala: ScalaConsumer = {
      ScalaConsumer()
        .withConsumerName(Option(self.getConsumerName)) // String
        .withConsumerARN(Option(self.getConsumerARN)) // String
        .withConsumerStatus(Option(self.getConsumerStatus).map { v =>
          import ConsumerStatusOps._; v.toScala
        }) // String
        .withConsumerCreationTimestamp(Option(self.getConsumerCreationTimestamp).map(_.toInstant)) // Instant
    }

  }

}
