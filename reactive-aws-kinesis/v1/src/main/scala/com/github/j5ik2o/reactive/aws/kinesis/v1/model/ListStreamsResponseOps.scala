// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamsResponse => ScalaListStreamsResponse, _ }
import com.amazonaws.services.kinesis.model.{ ListStreamsResult => JavaListStreamsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsResponseOps {

  implicit class JavaListStreamsResponseOps(val self: JavaListStreamsResponse) extends AnyVal {

    def toScala: ScalaListStreamsResponse = {
      ScalaListStreamsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamNames(Option(self.getStreamNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withHasMoreStreams(Option(self.getHasMoreStreams).map(_.booleanValue)) // Boolean
    }

  }

}
