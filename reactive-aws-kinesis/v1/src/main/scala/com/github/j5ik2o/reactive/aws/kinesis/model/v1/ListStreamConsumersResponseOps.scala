package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListStreamConsumersResult => JavaListStreamConsumersResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersResponse => ScalaListStreamConsumersResponse }

import scala.collection.JavaConverters._
object ListStreamConsumersResponseOps {

  import ConsumerOps._

  implicit class JavaListStreamConsumersResponseOps(val self: JavaListStreamConsumersResponse) extends AnyVal {

    def toScala: ScalaListStreamConsumersResponse = {
      ScalaListStreamConsumersResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumers(Option(self.getConsumers).map(_.asScala.map(_.toScala)))
    }

  }

}
