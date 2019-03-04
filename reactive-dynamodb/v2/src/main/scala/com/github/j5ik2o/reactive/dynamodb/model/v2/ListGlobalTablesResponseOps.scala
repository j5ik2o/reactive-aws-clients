package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ListGlobalTablesResponse => ScalaListGlobalTablesResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ListGlobalTablesResponse => JavaListGlobalTablesResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListGlobalTablesResponseOps {

  import GlobalTableOps._

  implicit class JavaListGlobalTablesResponseOps(val self: JavaListGlobalTablesResponse) extends AnyVal {

    def toScala: ScalaListGlobalTablesResponse = {
      ScalaListGlobalTablesResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withGlobalTables(Option(self.globalTables).map(_.asScala.map(_.toScala)))
        .withLastEvaluatedGlobalTableName(Option(self.lastEvaluatedGlobalTableName))
    }

  }
}
