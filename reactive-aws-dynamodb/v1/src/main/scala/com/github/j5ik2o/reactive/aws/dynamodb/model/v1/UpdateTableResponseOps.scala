package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateTableResult => JavaUpdateTableResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTableResponse => ScalaUpdateTableResponse }

import scala.collection.JavaConverters._

object UpdateTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaUpdateTableResponseOps(val self: JavaUpdateTableResponse) extends AnyVal {

    def toScala: ScalaUpdateTableResponse = {
      ScalaUpdateTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map(_.toScala))
    }
  }

}
