package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ ConsumerDescription => JavaConsumerDescription }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ConsumerStatus, ConsumerDescription => ScalaConsumerDescription }

object ConsumerDescriptionOps {

  implicit class ScalaConsumerDescriptionOps(val self: ScalaConsumerDescription) extends AnyVal {

    def toJava: JavaConsumerDescription = {
      val result = new JavaConsumerDescription
      self.consumerName.foreach(result.setConsumerName)
      self.consumerARN.foreach(result.setConsumerARN)
      self.consumerStatus.map(_.entryName).foreach(result.setConsumerStatus)
      self.consumerCreationTimestamp.map(Date.from).foreach(result.setConsumerCreationTimestamp)
      self.streamARN.foreach(result.setStreamARN)
      result
    }

  }

  implicit class JavaConsumerDescriptionOps(val self: JavaConsumerDescription) extends AnyVal {

    def toScala: ScalaConsumerDescription = {
      ScalaConsumerDescription()
        .withConsumerName(Option(self.getConsumerName))
        .withConsumerARN(Option(self.getConsumerARN))
        .withConsumerStatus(Option(self.getConsumerStatus).map(ConsumerStatus.withName))
    }

  }

}
