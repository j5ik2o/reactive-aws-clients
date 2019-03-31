// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardResponse => ScalaSplitShardResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ SplitShardResponse => JavaSplitShardResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SplitShardResponseOps {

  implicit class JavaSplitShardResponseOps(val self: JavaSplitShardResponse) extends AnyVal {

    def toScala: ScalaSplitShardResponse = {
      ScalaSplitShardResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
