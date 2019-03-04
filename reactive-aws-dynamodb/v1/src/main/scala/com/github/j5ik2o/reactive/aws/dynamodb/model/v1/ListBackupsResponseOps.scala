package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListBackupsResult => JavaListBackupsResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListBackupsResponse => ScalaListBackupsResponse }

import scala.collection.JavaConverters._

object ListBackupsResponseOps {

  import BackupSummaryOps._

  implicit class JavaListBackupsResponseOps(val self: JavaListBackupsResponse) extends AnyVal {

    def toScala: ScalaListBackupsResponse = {
      ScalaListBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupSummaries(Option(self.getBackupSummaries).map(_.asScala.map(_.toScala)))
        .withLastEvaluatedBackupArn(Option(self.getLastEvaluatedBackupArn))
    }

  }

}
