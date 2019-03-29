// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  ListStreamConsumersResponse => ScalaListStreamConsumersResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ ListStreamConsumersResult => JavaListStreamConsumersResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamConsumersResponseOps {

  implicit class JavaListStreamConsumersResponseOps(val self: JavaListStreamConsumersResponse) extends AnyVal {

    def toScala: ScalaListStreamConsumersResponse = {
      ScalaListStreamConsumersResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumers(Option(self.getConsumers).map { v =>
          import scala.collection.JavaConverters._, ConsumerOps._; v.asScala.map(_.toScala)
        }) // Seq[Consumer]
        .withNextToken(Option(self.getNextToken)) // String
    }

  }

}
