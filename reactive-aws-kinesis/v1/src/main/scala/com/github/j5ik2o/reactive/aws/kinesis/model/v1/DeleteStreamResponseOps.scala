package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DeleteStreamResult => JavaDeleteStreamResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ DeleteStreamResponse => ScalaDeleteStreamResponse }

import scala.collection.JavaConverters._

object DeleteStreamResponseOps {

  implicit class JavaDeleteStreamResponseOps(val self: JavaDeleteStreamResponse) extends AnyVal {

    def toScala: ScalaDeleteStreamResponse = {
      ScalaDeleteStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
