// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesResponse => ScalaListGlobalTablesResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListGlobalTablesResponse => JavaListGlobalTablesResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListGlobalTablesResponseOps {

  implicit class JavaListGlobalTablesResponseOps(val self: JavaListGlobalTablesResponse) extends AnyVal {

    def toScala: ScalaListGlobalTablesResponse = {
      ScalaListGlobalTablesResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withGlobalTables(Option(self.globalTables).map { v =>
          import scala.collection.JavaConverters._, GlobalTableOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalTable]
        .withLastEvaluatedGlobalTableName(Option(self.lastEvaluatedGlobalTableName)) // String
    }

  }

}
