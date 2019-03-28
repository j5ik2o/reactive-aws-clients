// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesResponse => JavaListTablesResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTablesResponseOps {

  implicit class JavaListTablesResponseOps(val self: JavaListTablesResponse) extends AnyVal {

    def toScala: ScalaListTablesResponse = {
      ScalaListTablesResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableNames(Option(self.tableNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withLastEvaluatedTableName(Option(self.lastEvaluatedTableName)) // String
    }

  }

}
