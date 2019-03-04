package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TagResourceResult => JavaTagResourceResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceResponse => ScalaTagResourceResponse }

import scala.collection.JavaConverters._

object TagResourceResponseOps {

  implicit class JavaTagResourceResponseOps(val self: JavaTagResourceResponse) extends AnyVal {

    def toScala: ScalaTagResourceResponse = {
      ScalaTagResourceResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
