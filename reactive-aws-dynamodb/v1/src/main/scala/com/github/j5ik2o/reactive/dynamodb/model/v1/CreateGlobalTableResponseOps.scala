package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateGlobalTableResult => JavaCreateGlobalTableResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ CreateGlobalTableResponse => ScalaCreateGlobalTableResponse }

import scala.collection.JavaConverters._

object CreateGlobalTableResponseOps {
  import GlobalTableDescriptionOps._

  implicit class JavaCreateGlobalTableResponseOps(val self: JavaCreateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaCreateGlobalTableResponse = {
      ScalaCreateGlobalTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableDescription(Option(self.getGlobalTableDescription).map(_.toScala))
    }

  }

}
