package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UntagResourceResponse => ScalaUntagResourceResponse }
import software.amazon.awssdk.services.dynamodb.model.{ UntagResourceResponse => JavaUntagResourceResponse }

import scala.collection.JavaConverters._

object UntagResourceResponseOps {

  implicit class JavaJavaUntagResourceResponseOps(val self: JavaUntagResourceResponse) extends AnyVal {

    def toScala: ScalaUntagResourceResponse = {
      ScalaUntagResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
    }

  }

}
