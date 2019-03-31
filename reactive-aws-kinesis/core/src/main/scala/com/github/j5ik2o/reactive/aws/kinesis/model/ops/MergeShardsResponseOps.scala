// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsResponse => ScalaMergeShardsResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ MergeShardsResponse => JavaMergeShardsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
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
