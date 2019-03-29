// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionRequest => ScalaStartStreamEncryptionRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ StartStreamEncryptionRequest => JavaStartStreamEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StartStreamEncryptionRequestOps {

  implicit class ScalaStartStreamEncryptionRequestOps(val self: ScalaStartStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStartStreamEncryptionRequest = {
      val result = new JavaStartStreamEncryptionRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.withEncryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.withKeyId(v)) // String

      result
    }

  }

}
