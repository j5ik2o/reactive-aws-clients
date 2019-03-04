package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateTableResult => JavaCreateTableResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateTableResponse => ScalaCreateTableResponse }

import scala.collection.JavaConverters._

object CreateTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaCreateTableResponseOps(val self: JavaCreateTableResponse) extends AnyVal {

    def toScala: ScalaCreateTableResponse = {
      ScalaCreateTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata.getHttpHeaders.asScala.mapValues(Seq(_)).toMap))
        .withTableDescription(Option(self.getTableDescription).map(_.toScala))
    }

  }

}
