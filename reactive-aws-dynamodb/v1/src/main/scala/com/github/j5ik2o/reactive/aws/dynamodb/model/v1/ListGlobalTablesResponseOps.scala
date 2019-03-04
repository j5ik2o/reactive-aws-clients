package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListGlobalTablesResult => JavaListGlobalTablesResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesResponse => ScalaListGlobalTablesResponse }

import scala.collection.JavaConverters._

object ListGlobalTablesResponseOps {

  import GlobalTableOps._

  implicit class JavaListGlobalTablesResponseOps(val self: JavaListGlobalTablesResponse) extends AnyVal {

    def toScala: ScalaListGlobalTablesResponse = {
      ScalaListGlobalTablesResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTables(Option(self.getGlobalTables).map(_.asScala.map(_.toScala)))
        .withLastEvaluatedGlobalTableName(Option(self.getLastEvaluatedGlobalTableName))
    }

  }

}
