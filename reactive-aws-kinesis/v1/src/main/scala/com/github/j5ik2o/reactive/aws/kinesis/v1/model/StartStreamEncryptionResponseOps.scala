// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionResponse => ScalaStartStreamEncryptionResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ StartStreamEncryptionResult => JavaStartStreamEncryptionResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StartStreamEncryptionResponseOps {

  implicit class JavaStartStreamEncryptionResponseOps(val self: JavaStartStreamEncryptionResponse) extends AnyVal {

    def toScala: ScalaStartStreamEncryptionResponse = {
      ScalaStartStreamEncryptionResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
