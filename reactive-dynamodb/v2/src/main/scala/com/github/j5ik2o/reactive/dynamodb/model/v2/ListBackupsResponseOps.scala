package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ListBackupsResponse => ScalaListBackupsResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ListBackupsResponse => JavaListBackupsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListBackupsResponseOps {

  import BackupSummaryOps._

  implicit class JavaListBackupsResponseOps(val self: JavaListBackupsResponse) extends AnyVal {

    def toScala: ScalaListBackupsResponse = {
      ScalaListBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupSummaries(Option(self.backupSummaries).map(_.asScala.map(_.toScala)))
        .withLastEvaluatedBackupArn(Option(self.lastEvaluatedBackupArn))
    }

  }

}
