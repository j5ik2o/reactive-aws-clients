// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesResponse => ScalaListGlobalTablesResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListGlobalTablesResult => JavaListGlobalTablesResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListGlobalTablesResponseOps {

  implicit class JavaListGlobalTablesResponseOps(val self: JavaListGlobalTablesResponse) extends AnyVal {

    def toScala: ScalaListGlobalTablesResponse = {
      ScalaListGlobalTablesResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTables(Option(self.getGlobalTables).map { v =>
          import scala.collection.JavaConverters._, GlobalTableOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalTable]
        .withLastEvaluatedGlobalTableName(Option(self.getLastEvaluatedGlobalTableName)) // String
    }

  }

}
