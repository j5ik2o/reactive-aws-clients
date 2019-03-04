package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ConsumerStatus, ConsumerDescription => ScalaConsumerDescription }
import software.amazon.awssdk.services.kinesis.model.{ ConsumerDescription => JavaConsumerDescription }

object ConsumerDescriptionOps {

  implicit class ScalaConsumerDescriptionOps(val self: ScalaConsumerDescription) extends AnyVal {

    def toJava: JavaConsumerDescription = {
      val result = JavaConsumerDescription.builder()
      self.consumerName.foreach(result.consumerName)
      self.consumerARN.foreach(result.consumerARN)
      self.consumerStatus.map(_.entryName).foreach(result.consumerStatus)
      self.consumerCreationTimestamp.foreach(result.consumerCreationTimestamp)
      self.streamARN.foreach(result.streamARN)
      result.build()
    }

  }

  implicit class JavaConsumerDescriptionOps(val self: JavaConsumerDescription) extends AnyVal {

    def toScala: ScalaConsumerDescription = {
      ScalaConsumerDescription()
        .withConsumerName(Option(self.consumerName()))
        .withConsumerARN(Option(self.consumerARN()))
        .withConsumerStatus(Option(self.consumerStatus()).map(_.toString).map(ConsumerStatus.withName))
    }

  }

}
