package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListStreamsResult => JavaListStreamsResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ ListStreamsResponse => ScalaListStreamsResponse }

import scala.collection.JavaConverters._
object ListStreamsResponseOps {

  implicit class JavaListStreamsResponseOps(val self: JavaListStreamsResponse) extends AnyVal {

    def toScala: ScalaListStreamsResponse = {
      ScalaListStreamsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamNames(Option(self.getStreamNames).map(_.asScala))
        .withHasMoreStreams(Option(self.getHasMoreStreams))
    }

  }

}
