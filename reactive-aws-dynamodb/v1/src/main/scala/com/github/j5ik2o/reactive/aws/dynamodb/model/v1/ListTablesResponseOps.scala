package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListTablesResult => JavaListTablesResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse }

import scala.collection.JavaConverters._

object ListTablesResponseOps {

  implicit class JavaListTablesResponseOps(val self: JavaListTablesResponse) extends AnyVal {

    def toScala: ScalaListTablesResponse = {
      ScalaListTablesResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableNames(Option(self.getTableNames).map(_.asScala))
        .withLastEvaluatedTableName(Option(self.getLastEvaluatedTableName))
    }

  }

}
