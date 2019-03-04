package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteBackupResult => JavaDeleteBackupResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ DeleteBackupResponse => ScalaDeleteBackupResponse }

import scala.collection.JavaConverters._

object DeleteBackupResponseOps {

  import BackupDescriptionOps._

  implicit class JavaDeleteBackupResponseOps(val self: JavaDeleteBackupResponse) extends AnyVal {

    def toScala: ScalaDeleteBackupResponse = {
      ScalaDeleteBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDescription(Option(self.getBackupDescription).map(_.toScala))
    }

  }

}
