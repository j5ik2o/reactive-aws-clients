package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UntagResourceResult => JavaUntagResourceResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ UntagResourceResponse => ScalaUntagResourceResponse }

import scala.collection.JavaConverters._

object UntagResourceResponseOps {

  implicit class JavaJavaUntagResourceResponseOps(val self: JavaUntagResourceResponse) extends AnyVal {

    def toScala: ScalaUntagResourceResponse = {
      ScalaUntagResourceResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
