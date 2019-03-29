// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ CreateStreamResponse => ScalaCreateStreamResponse, _ }
import com.amazonaws.services.kinesis.model.{ CreateStreamResult => JavaCreateStreamResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateStreamResponseOps {

  implicit class JavaCreateStreamResponseOps(val self: JavaCreateStreamResponse) extends AnyVal {

    def toScala: ScalaCreateStreamResponse = {
      ScalaCreateStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
