// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionRequest => ScalaStartStreamEncryptionRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  StartStreamEncryptionRequest => JavaStartStreamEncryptionRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StartStreamEncryptionRequestOps {

  implicit class ScalaStartStreamEncryptionRequestOps(val self: ScalaStartStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStartStreamEncryptionRequest = {
      val result = JavaStartStreamEncryptionRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.encryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.keyId(v)) // String

      result.build()
    }

  }

}
