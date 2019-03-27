// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListStreamsResponse => ScalaListStreamsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListStreamsResponse => JavaListStreamsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsResponseOps {

  implicit class JavaListStreamsResponseOps(val self: JavaListStreamsResponse) extends AnyVal {

    def toScala: ScalaListStreamsResponse = {
      ScalaListStreamsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreams(Option(self.streams).map { v =>
          import scala.collection.JavaConverters._, StreamOps._; v.asScala.map(_.toScala)
        }) // Seq[Stream]
        .withLastEvaluatedStreamArn(Option(self.lastEvaluatedStreamArn)) // String
    }

  }

}
