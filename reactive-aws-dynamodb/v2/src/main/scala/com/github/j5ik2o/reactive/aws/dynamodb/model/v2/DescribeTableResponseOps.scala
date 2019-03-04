package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableResponse => ScalaDescribeTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTableResponse => JavaDescribeTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaDescribeTableResponseOps(val self: JavaDescribeTableResponse) extends AnyVal {

    def toScala: ScalaDescribeTableResponse = {
      ScalaDescribeTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTable(Option(self.table).map(_.toScala))
    }

  }

}
