// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SubscribeToShardResponse => ScalaSubscribeToShardResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ SubscribeToShardResponse => JavaSubscribeToShardResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SubscribeToShardResponseOps {

  implicit class JavaSubscribeToShardResponseOps(val self: JavaSubscribeToShardResponse) extends AnyVal {

    def toScala: ScalaSubscribeToShardResponse = {
      ScalaSubscribeToShardResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
