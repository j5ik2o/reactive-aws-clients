// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupResponse => ScalaDescribeBackupResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeBackupResponse => JavaDescribeBackupResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeBackupResponseOps {

  implicit class JavaDescribeBackupResponseOps(val self: JavaDescribeBackupResponse) extends AnyVal {

    def toScala: ScalaDescribeBackupResponse = {
      ScalaDescribeBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupDescription(Option(self.backupDescription).map { v =>
          import BackupDescriptionOps._; v.toScala
        }) // BackupDescription
    }

  }

}
