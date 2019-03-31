// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Consumer => ScalaConsumer, _ }
import software.amazon.awssdk.services.kinesis.model.{ Consumer => JavaConsumer }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumerOps {

  implicit class ScalaConsumerOps(val self: ScalaConsumer) extends AnyVal {

    def toJava: JavaConsumer = {
      val result = JavaConsumer.builder()
      self.consumerName.filter(_.nonEmpty).foreach(v => result.consumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.consumerARN(v))   // String
      self.consumerStatus.foreach { v =>
        import ConsumerStatusOps._; result.consumerStatus(v.toJava)
      } // String
      self.consumerCreationTimestamp.foreach(v => result.consumerCreationTimestamp(v)) // Instant

      result.build()
    }

  }

  implicit class JavaConsumerOps(val self: JavaConsumer) extends AnyVal {

    def toScala: ScalaConsumer = {
      ScalaConsumer()
        .withConsumerName(Option(self.consumerName)) // String
        .withConsumerARN(Option(self.consumerARN)) // String
        .withConsumerStatus(Option(self.consumerStatus).map { v =>
          import ConsumerStatusOps._; v.toScala
        }) // String
        .withConsumerCreationTimestamp(Option(self.consumerCreationTimestamp)) // Instant
    }

  }

}
