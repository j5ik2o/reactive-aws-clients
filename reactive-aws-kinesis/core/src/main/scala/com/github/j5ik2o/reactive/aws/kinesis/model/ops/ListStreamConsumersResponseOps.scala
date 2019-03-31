// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  ListStreamConsumersResponse => ScalaListStreamConsumersResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersResponse => JavaListStreamConsumersResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamConsumersResponseOps {

  implicit class JavaListStreamConsumersResponseOps(val self: JavaListStreamConsumersResponse) extends AnyVal {

    def toScala: ScalaListStreamConsumersResponse = {
      ScalaListStreamConsumersResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumers(Option(self.consumers).map { v =>
          import scala.collection.JavaConverters._, ConsumerOps._; v.asScala.map(_.toScala)
        }) // Seq[Consumer]
        .withNextToken(Option(self.nextToken)) // String
    }

  }

}
