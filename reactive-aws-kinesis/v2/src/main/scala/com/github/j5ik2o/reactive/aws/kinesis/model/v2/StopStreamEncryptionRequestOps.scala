package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StopStreamEncryptionRequest => ScalaStopStreamEncryptionRequest }
import software.amazon.awssdk.services.kinesis.model.{ StopStreamEncryptionRequest => JavaStopStreamEncryptionRequest }

object StopStreamEncryptionRequestOps {

  implicit class ScalaStopStreamEncryptionRequestOps(val self: ScalaStopStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStopStreamEncryptionRequest = {
      val result = JavaStopStreamEncryptionRequest.builder()
      self.streamName.foreach(result.streamName)
      self.encryptionType.map(_.entryName).foreach(result.encryptionType)
      self.keyId.foreach(result.keyId)
      result.build()
    }

  }

}
