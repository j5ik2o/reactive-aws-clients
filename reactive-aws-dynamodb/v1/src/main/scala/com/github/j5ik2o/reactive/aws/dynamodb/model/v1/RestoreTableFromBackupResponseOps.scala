package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ RestoreTableFromBackupResult => JavaRestoreTableFromBackupResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupResponse => ScalaRestoreTableFromBackupResponse
}

import scala.collection.JavaConverters._

object RestoreTableFromBackupResponseOps {

  import TableDescriptionOps._

  implicit class JavaRestoreTableFromBackupResponseOps(val self: JavaRestoreTableFromBackupResponse) extends AnyVal {

    def toScala: ScalaRestoreTableFromBackupResponse = {
      ScalaRestoreTableFromBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map(_.toScala))
    }

  }

}
