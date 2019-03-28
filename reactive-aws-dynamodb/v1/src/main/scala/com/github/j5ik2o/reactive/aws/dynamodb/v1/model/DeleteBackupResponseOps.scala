// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupResponse => ScalaDeleteBackupResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteBackupResult => JavaDeleteBackupResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBackupResponseOps {

  implicit class JavaDeleteBackupResponseOps(val self: JavaDeleteBackupResponse) extends AnyVal {

    def toScala: ScalaDeleteBackupResponse = {
      ScalaDeleteBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDescription(Option(self.getBackupDescription).map { v =>
          import BackupDescriptionOps._; v.toScala
        }) // BackupDescription
    }

  }

}
