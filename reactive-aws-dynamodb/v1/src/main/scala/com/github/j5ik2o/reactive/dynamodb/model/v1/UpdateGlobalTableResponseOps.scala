package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateGlobalTableResult => JavaUpdateGlobalTableResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateGlobalTableResponse => ScalaUpdateGlobalTableResponse }

import scala.collection.JavaConverters._

object UpdateGlobalTableResponseOps {

  import GlobalTableDescriptionOps._

  implicit class JavaUpdateGlobalTableResponseOps(val self: JavaUpdateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableResponse = {
      ScalaUpdateGlobalTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableDescription(Option(self.getGlobalTableDescription).map(_.toScala))
    }

  }

}
