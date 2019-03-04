package com.github.j5ik2o.reactive.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ Consumer => JavaConsumer }
import com.github.j5ik2o.reactive.kinesis.model.{ ConsumerStatus, Consumer => ScalaConsumer }

object ConsumerOps {

  implicit class ScalaConsumerOps(val self: ScalaConsumer) extends AnyVal {

    def toJava: JavaConsumer = {
      val result = new JavaConsumer()
      self.consumerName.foreach(result.setConsumerName)
      self.consumerARN.foreach(result.setConsumerARN)
      self.consumerStatus.map(_.entryName).foreach(result.setConsumerStatus)
      self.consumerCreationTimestamp.map(Date.from).foreach(result.setConsumerCreationTimestamp)
      result
    }

  }

  implicit class JavaConsumerOps(val self: JavaConsumer) extends AnyVal {

    def toScala: ScalaConsumer = {
      ScalaConsumer()
        .withConsumerName(Option(self.getConsumerName))
        .withConsumerARN(Option(self.getConsumerARN))
        .withConsumerStatus(Option(self.getConsumerStatus).map(ConsumerStatus.withName))
        .withConsumerCreationTimestamp(Option(self.getConsumerCreationTimestamp).map(_.toInstant))
    }

  }

}
