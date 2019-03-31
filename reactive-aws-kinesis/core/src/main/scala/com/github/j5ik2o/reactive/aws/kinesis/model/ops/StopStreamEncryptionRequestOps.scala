// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StopStreamEncryptionRequest => ScalaStopStreamEncryptionRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{ StopStreamEncryptionRequest => JavaStopStreamEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StopStreamEncryptionRequestOps {

  implicit class ScalaStopStreamEncryptionRequestOps(val self: ScalaStopStreamEncryptionRequest) extends AnyVal {

    def toJava: JavaStopStreamEncryptionRequest = {
      val result = JavaStopStreamEncryptionRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.encryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.keyId(v)) // String

      result.build()
    }

  }

}
