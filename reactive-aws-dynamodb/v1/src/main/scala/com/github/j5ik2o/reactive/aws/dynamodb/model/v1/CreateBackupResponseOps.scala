// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupResponse => ScalaCreateBackupResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateBackupResult => JavaCreateBackupResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBackupResponseOps {

  implicit class JavaCreateBackupResponseOps(val self: JavaCreateBackupResponse) extends AnyVal {

    def toScala: ScalaCreateBackupResponse = {
      ScalaCreateBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDetails(Option(self.getBackupDetails).map { v =>
          import BackupDetailsOps._; v.toScala
        }) // BackupDetails
    }

  }

}
