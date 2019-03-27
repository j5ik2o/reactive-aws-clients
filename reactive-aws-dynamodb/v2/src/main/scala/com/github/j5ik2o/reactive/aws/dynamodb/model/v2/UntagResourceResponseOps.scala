// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceResponse => ScalaUntagResourceResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UntagResourceResponse => JavaUntagResourceResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UntagResourceResponseOps {

  implicit class JavaUntagResourceResponseOps(val self: JavaUntagResourceResponse) extends AnyVal {

    def toScala: ScalaUntagResourceResponse = {
      ScalaUntagResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
