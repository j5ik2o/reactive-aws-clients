// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListBackupsResponse => ScalaListBackupsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListBackupsResult => JavaListBackupsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBackupsResponseOps {

  implicit class JavaListBackupsResponseOps(val self: JavaListBackupsResponse) extends AnyVal {

    def toScala: ScalaListBackupsResponse = {
      ScalaListBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupSummaries(Option(self.getBackupSummaries).map { v =>
          import scala.collection.JavaConverters._, BackupSummaryOps._; v.asScala.map(_.toScala)
        }) // Seq[BackupSummary]
        .withLastEvaluatedBackupArn(Option(self.getLastEvaluatedBackupArn)) // String
    }

  }

}
