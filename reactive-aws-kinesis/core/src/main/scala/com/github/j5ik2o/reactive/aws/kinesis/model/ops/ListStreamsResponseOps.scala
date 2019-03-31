// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamsResponse => ScalaListStreamsResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamsResponse => JavaListStreamsResponse }

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
        .withStreamNames(Option(self.streamNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withHasMoreStreams(Option(self.hasMoreStreams).map(_.booleanValue)) // Boolean
    }

  }

}
