package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ConsumerStatus, Consumer => ScalaConsumer }
import software.amazon.awssdk.services.kinesis.model.{ Consumer => JavaConsumer }

object ConsumerOps {

  implicit class ScalaConsumerOps(val self: ScalaConsumer) extends AnyVal {

    def toJava: JavaConsumer = {
      val result = JavaConsumer.builder()
      self.consumerName.foreach(result.consumerName)
      self.consumerARN.foreach(result.consumerARN)
      self.consumerStatus.map(_.entryName).foreach(result.consumerStatus)
      self.consumerCreationTimestamp.foreach(result.consumerCreationTimestamp)
      result.build()
    }

  }

  implicit class JavaConsumerOps(val self: JavaConsumer) extends AnyVal {

    def toScala: ScalaConsumer = {
      ScalaConsumer()
        .withConsumerName(Option(self.consumerName()))
        .withConsumerARN(Option(self.consumerARN()))
        .withConsumerStatus(Option(self.consumerStatus()).map(_.toString).map(ConsumerStatus.withName))
        .withConsumerCreationTimestamp(Option(self.consumerCreationTimestamp()))
    }

  }

}
