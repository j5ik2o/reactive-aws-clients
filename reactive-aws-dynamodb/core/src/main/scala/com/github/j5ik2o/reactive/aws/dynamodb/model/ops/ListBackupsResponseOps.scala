// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListBackupsResponse => ScalaListBackupsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListBackupsResponse => JavaListBackupsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBackupsResponseOps {

  implicit class JavaListBackupsResponseOps(val self: JavaListBackupsResponse) extends AnyVal {

    def toScala: ScalaListBackupsResponse = {
      ScalaListBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupSummaries(Option(self.backupSummaries).map { v =>
          import scala.collection.JavaConverters._, BackupSummaryOps._; v.asScala.map(_.toScala)
        }) // Seq[BackupSummary]
        .withLastEvaluatedBackupArn(Option(self.lastEvaluatedBackupArn)) // String
    }

  }

}
