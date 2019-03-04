package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeTableResult => JavaDescribeTableResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableResponse => ScalaDescribeTableResponse }

import scala.collection.JavaConverters._

object DescribeTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaDescribeTableResponseOps(val self: JavaDescribeTableResponse) extends AnyVal {

    def toScala: ScalaDescribeTableResponse = {
      ScalaDescribeTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTable(Option(self.getTable).map(_.toScala))
    }

  }

}
