package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ SplitShardResponse => ScalaSplitShardResponse }
import software.amazon.awssdk.services.kinesis.model.{ SplitShardResponse => JavaSplitShardResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

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
