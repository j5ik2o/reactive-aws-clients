package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ StopStreamEncryptionResult => JavaStopStreamEncryptionResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ StopStreamEncryptionResponse => ScalaStopStreamEncryptionResponse }

import scala.collection.JavaConverters._

object StopStreamEncryptionResponseOps {

  implicit class JavaStopStreamEncryptionResponseOps(val self: JavaStopStreamEncryptionResponse) extends AnyVal {

    def toScala: ScalaStopStreamEncryptionResponse = {
      ScalaStopStreamEncryptionResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }
}
