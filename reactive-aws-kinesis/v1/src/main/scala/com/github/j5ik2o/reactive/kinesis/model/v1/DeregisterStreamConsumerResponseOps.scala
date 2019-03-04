package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DeregisterStreamConsumerResult => JavaDeregisterStreamConsumerResponse }
import com.github.j5ik2o.reactive.kinesis.model.{
  DeregisterStreamConsumerResponse => ScalaDeregisterStreamConsumerResponse
}

import scala.collection.JavaConverters._

object DeregisterStreamConsumerResponseOps {

  implicit class JavaDeregisterStreamConsumerResponseOps(val self: JavaDeregisterStreamConsumerResponse)
      extends AnyVal {

    def toScala: ScalaDeregisterStreamConsumerResponse = {
      ScalaDeregisterStreamConsumerResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
