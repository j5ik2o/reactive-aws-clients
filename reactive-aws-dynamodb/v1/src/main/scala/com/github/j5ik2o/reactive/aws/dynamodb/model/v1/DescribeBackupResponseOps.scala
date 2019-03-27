// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupResponse => ScalaDescribeBackupResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeBackupResult => JavaDescribeBackupResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeBackupResponseOps {

  implicit class JavaDescribeBackupResponseOps(val self: JavaDescribeBackupResponse) extends AnyVal {

    def toScala: ScalaDescribeBackupResponse = {
      ScalaDescribeBackupResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withBackupDescription(Option(self.getBackupDescription).map { v =>
          import BackupDescriptionOps._; v.toScala
        }) // BackupDescription
    }

  }

}
