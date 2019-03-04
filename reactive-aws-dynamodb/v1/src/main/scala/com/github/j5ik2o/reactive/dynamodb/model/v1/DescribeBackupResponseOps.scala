package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeBackupResult => JavaDescribeBackupResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeBackupResponse => ScalaDescribeBackupResponse }

import scala.collection.JavaConverters._

object DescribeBackupResponseOps {

  import BackupDescriptionOps._

  implicit class JavaDescribeBackupResponseOps(val self: JavaDescribeBackupResponse) extends AnyVal {

    def toScala: ScalaDescribeBackupResponse = {
      ScalaDescribeBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDescription(Option(self.getBackupDescription).map(_.toScala))
    }

  }

}
