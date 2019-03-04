package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesResponse => JavaListTablesResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListTablesResponseOps {

  implicit class JavaListTablesResponseOps(val self: JavaListTablesResponse) extends AnyVal {

    def toScala: ScalaListTablesResponse = {
      ScalaListTablesResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTableNames(Option(self.tableNames).map(_.asScala))
        .withLastEvaluatedTableName(Option(self.lastEvaluatedTableName))
    }

  }

}
