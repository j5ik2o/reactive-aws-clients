package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamConsumerResult => JavaDescribeStreamConsumerResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerResponse => ScalaDescribeStreamConsumerResponse
}

import scala.collection.JavaConverters._

object DescribeStreamConsumerResponseOps {

  import ConsumerDescriptionOps._

  implicit class JavaDescribeStreamConsumerResponseOps(val self: JavaDescribeStreamConsumerResponse) extends AnyVal {
    def toScala: ScalaDescribeStreamConsumerResponse = {
      ScalaDescribeStreamConsumerResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumerDescription(Option(self.getConsumerDescription).map(_.toScala))
    }
  }

}
