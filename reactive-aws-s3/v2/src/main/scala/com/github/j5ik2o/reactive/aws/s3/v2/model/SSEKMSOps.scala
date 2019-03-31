// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ SSEKMS => ScalaSSEKMS, _ }
import software.amazon.awssdk.services.s3.model.{ SSEKMS => JavaSSEKMS }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSEKMSOps {

  implicit class ScalaSSEKMSOps(val self: ScalaSSEKMS) extends AnyVal {

    def toJava: JavaSSEKMS = {
      val result = JavaSSEKMS.builder()
      self.keyId.filter(_.nonEmpty).foreach(v => result.keyId(v)) // String

      result.build()
    }

  }

  implicit class JavaSSEKMSOps(val self: JavaSSEKMS) extends AnyVal {

    def toScala: ScalaSSEKMS = {
      ScalaSSEKMS()
        .withKeyId(Option(self.keyId)) // String
    }

  }

}
