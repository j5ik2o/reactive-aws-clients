// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerResponse => ScalaDescribeStreamConsumerResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ DescribeStreamConsumerResult => JavaDescribeStreamConsumerResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamConsumerResponseOps {

  implicit class JavaDescribeStreamConsumerResponseOps(val self: JavaDescribeStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamConsumerResponse = {
      ScalaDescribeStreamConsumerResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumerDescription(Option(self.getConsumerDescription).map { v =>
          import ConsumerDescriptionOps._; v.toScala
        }) // ConsumerDescription
    }

  }

}
