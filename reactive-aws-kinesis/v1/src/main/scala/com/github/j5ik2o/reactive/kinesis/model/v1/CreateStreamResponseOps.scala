package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ CreateStreamResult => JavaCreateStreamResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ CreateStreamResponse => ScalaCreateStreamResponse }

import scala.collection.JavaConverters._

object CreateStreamResponseOps {

  implicit class JavaCreateStreamResponseOps(val self: JavaCreateStreamResponse) extends AnyVal {

    def toScala: ScalaCreateStreamResponse = {
      ScalaCreateStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
