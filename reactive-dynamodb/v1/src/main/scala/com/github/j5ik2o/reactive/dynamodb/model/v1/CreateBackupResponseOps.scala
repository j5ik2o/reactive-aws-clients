package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateBackupResult => JavaCreateBackupResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ CreateBackupResponse => ScalaCreateBackupResponse }

import scala.collection.JavaConverters._

object CreateBackupResponseOps {
  import BackupDetailsOps._

  implicit class JavaCreateBackupResponseOps(val self: JavaCreateBackupResponse) extends AnyVal {

    def toScala: ScalaCreateBackupResponse = {
      ScalaCreateBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDetails(Option(self.getBackupDetails).map(_.toScala))
    }

  }
}
