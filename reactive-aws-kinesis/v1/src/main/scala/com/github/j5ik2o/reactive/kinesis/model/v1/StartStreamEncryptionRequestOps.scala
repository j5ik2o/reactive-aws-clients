package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ StartStreamEncryptionRequest => JavaStartStreamEncryptionRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ StartStreamEncryptionRequest => ScalaStartStreamEncryptionRequest }

object StartStreamEncryptionRequestOps {

  implicit class ScalaStartStreamEncryptionRequestOps(val self: ScalaStartStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStartStreamEncryptionRequest = {
      val result = new JavaStartStreamEncryptionRequest()
      self.streamName.foreach(result.setStreamName)
      self.encryptionType.map(_.entryName).foreach(result.setEncryptionType)
      self.keyId.foreach(result.setKeyId)
      result
    }

  }

}
