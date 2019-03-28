// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableResponse => ScalaDescribeTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeTableResult => JavaDescribeTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTableResponseOps {

  implicit class JavaDescribeTableResponseOps(val self: JavaDescribeTableResponse) extends AnyVal {

    def toScala: ScalaDescribeTableResponse = {
      ScalaDescribeTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTable(Option(self.getTable).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
