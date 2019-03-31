// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DeleteStreamRequest => ScalaDeleteStreamRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ DeleteStreamRequest => JavaDeleteStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteStreamRequestOps {

  implicit class ScalaDeleteStreamRequestOps(val self: ScalaDeleteStreamRequest) extends AnyVal {

    def toJava: JavaDeleteStreamRequest = {
      val result = JavaDeleteStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                            // String
      self.enforceConsumerDeletion.map(_.booleanValue).foreach(v => result.enforceConsumerDeletion(v)) // Boolean

      result.build()
    }

  }

}
