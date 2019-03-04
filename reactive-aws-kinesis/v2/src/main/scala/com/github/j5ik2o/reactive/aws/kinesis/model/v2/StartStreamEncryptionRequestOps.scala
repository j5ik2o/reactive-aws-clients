package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionRequest => ScalaStartStreamEncryptionRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  StartStreamEncryptionRequest => JavaStartStreamEncryptionRequest
}

object StartStreamEncryptionRequestOps {

  implicit class ScalaStartStreamEncryptionRequestOps(val self: ScalaStartStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStartStreamEncryptionRequest = {
      val result = JavaStartStreamEncryptionRequest.builder()
      self.streamName.foreach(result.streamName)
      self.encryptionType.map(_.entryName).foreach(result.encryptionType)
      self.keyId.foreach(result.keyId)
      result.build()
    }

  }

}
