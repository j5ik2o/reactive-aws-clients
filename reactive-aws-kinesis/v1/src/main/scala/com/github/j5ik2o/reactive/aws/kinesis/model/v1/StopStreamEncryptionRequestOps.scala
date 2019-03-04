package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ StopStreamEncryptionRequest => JavaStopStreamEncryptionRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ StopStreamEncryptionRequest => ScalaStopStreamEncryptionRequest }

object StopStreamEncryptionRequestOps {

  implicit class ScalaStopStreamEncryptionRequestOps(val self: ScalaStopStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStopStreamEncryptionRequest = {
      val result = new JavaStopStreamEncryptionRequest()
      self.streamName.foreach(result.setStreamName)
      self.encryptionType.map(_.entryName).foreach(result.setEncryptionType)
      self.keyId.foreach(result.setKeyId)
      result
    }

  }

}
