// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StopStreamEncryptionRequest => ScalaStopStreamEncryptionRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ StopStreamEncryptionRequest => JavaStopStreamEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StopStreamEncryptionRequestOps {

  implicit class ScalaStopStreamEncryptionRequestOps(val self: ScalaStopStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStopStreamEncryptionRequest = {
      val result = new JavaStopStreamEncryptionRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.withEncryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.withKeyId(v)) // String

      result
    }

  }

}
