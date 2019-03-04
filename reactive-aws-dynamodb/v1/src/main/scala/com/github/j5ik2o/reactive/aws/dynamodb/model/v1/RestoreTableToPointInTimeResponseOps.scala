package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  RestoreTableToPointInTimeResult => JavaRestoreTableToPointInTimeResponse
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableToPointInTimeResponse => ScalaRestoreTableToPointInTimeResponse
}

import scala.collection.JavaConverters._

object RestoreTableToPointInTimeResponseOps {

  import TableDescriptionOps._

  implicit class JavaRestoreTableToPointInTimeResponseOps(val self: JavaRestoreTableToPointInTimeResponse)
      extends AnyVal {

    def toScala: ScalaRestoreTableToPointInTimeResponse = {
      ScalaRestoreTableToPointInTimeResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map(_.toScala))
    }

  }

}
