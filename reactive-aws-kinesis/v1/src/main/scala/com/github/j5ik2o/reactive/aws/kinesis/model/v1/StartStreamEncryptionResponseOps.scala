package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ StartStreamEncryptionResult => JavaStartStreamEncryptionResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionResponse => ScalaStartStreamEncryptionResponse
}

import scala.collection.JavaConverters._

object StartStreamEncryptionResponseOps {

  implicit class JavaStartStreamEncryptionResponseOps(val self: JavaStartStreamEncryptionResponse) extends AnyVal {

    def toScala: ScalaStartStreamEncryptionResponse = {
      ScalaStartStreamEncryptionResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
