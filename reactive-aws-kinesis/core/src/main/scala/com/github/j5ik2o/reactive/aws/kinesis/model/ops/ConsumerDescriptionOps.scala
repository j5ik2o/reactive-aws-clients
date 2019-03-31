// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ConsumerDescription => ScalaConsumerDescription, _ }
import software.amazon.awssdk.services.kinesis.model.{ ConsumerDescription => JavaConsumerDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumerDescriptionOps {

  implicit class ScalaConsumerDescriptionOps(val self: ScalaConsumerDescription) extends AnyVal {

    def toJava: JavaConsumerDescription = {
      val result = JavaConsumerDescription.builder()
      self.consumerName.filter(_.nonEmpty).foreach(v => result.consumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.consumerARN(v))   // String
      self.consumerStatus.foreach { v =>
        import ConsumerStatusOps._; result.consumerStatus(v.toJava)
      } // String
      self.consumerCreationTimestamp.foreach(v => result.consumerCreationTimestamp(v)) // Instant
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))              // String

      result.build()
    }

  }

  implicit class JavaConsumerDescriptionOps(val self: JavaConsumerDescription) extends AnyVal {

    def toScala: ScalaConsumerDescription = {
      ScalaConsumerDescription()
        .withConsumerName(Option(self.consumerName)) // String
        .withConsumerARN(Option(self.consumerARN)) // String
        .withConsumerStatus(Option(self.consumerStatus).map { v =>
          import ConsumerStatusOps._; v.toScala
        }) // String
        .withConsumerCreationTimestamp(Option(self.consumerCreationTimestamp)) // Instant
        .withStreamARN(Option(self.streamARN)) // String
    }

  }

}
