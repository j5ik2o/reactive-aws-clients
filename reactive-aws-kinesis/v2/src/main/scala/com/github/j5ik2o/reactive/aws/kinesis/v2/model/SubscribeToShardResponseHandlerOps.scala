// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  SubscribeToShardResponseHandler => ScalaSubscribeToShardResponseHandler,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  SubscribeToShardResponseHandler => JavaSubscribeToShardResponseHandler
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SubscribeToShardResponseHandlerOps {

  implicit class ScalaSubscribeToShardResponseHandlerOps(val self: ScalaSubscribeToShardResponseHandler)
      extends AnyVal {

    def toJava: JavaSubscribeToShardResponseHandler = {
      val result = JavaSubscribeToShardResponseHandler.builder()

      result.build()
    }

  }

  implicit class JavaSubscribeToShardResponseHandlerOps(val self: JavaSubscribeToShardResponseHandler) extends AnyVal {

    def toScala: ScalaSubscribeToShardResponseHandler = {
      ScalaSubscribeToShardResponseHandler()
    }

  }

}
