package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsResponse => ScalaMergeShardsResponse }
import software.amazon.awssdk.services.kinesis.model.{ MergeShardsResponse => JavaMergeShardsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object MergeShardsResponseOps {

  implicit class JavaMergeShardsResponseOps(val self: JavaMergeShardsResponse) extends AnyVal {

    def toScala: ScalaMergeShardsResponse = {
      ScalaMergeShardsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
