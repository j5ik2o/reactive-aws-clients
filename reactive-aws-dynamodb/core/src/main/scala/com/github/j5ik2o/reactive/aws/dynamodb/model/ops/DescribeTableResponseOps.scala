// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableResponse => ScalaDescribeTableResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTableResponse => JavaDescribeTableResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTableResponseOps {

  implicit class JavaDescribeTableResponseOps(val self: JavaDescribeTableResponse) extends AnyVal {

    def toScala: ScalaDescribeTableResponse = {
      ScalaDescribeTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTable(Option(self.table).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
