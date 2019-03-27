// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableResponse => ScalaDescribeGlobalTableResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ DescribeGlobalTableResult => JavaDescribeGlobalTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableResponseOps {

  implicit class JavaDescribeGlobalTableResponseOps(val self: JavaDescribeGlobalTableResponse) extends AnyVal {

    def toScala: ScalaDescribeGlobalTableResponse = {
      ScalaDescribeGlobalTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableDescription(Option(self.getGlobalTableDescription).map { v =>
          import GlobalTableDescriptionOps._; v.toScala
        }) // GlobalTableDescription
    }

  }

}
