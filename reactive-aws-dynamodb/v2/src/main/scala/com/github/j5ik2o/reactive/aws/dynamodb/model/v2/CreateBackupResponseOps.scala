package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupResponse => ScalaCreateBackupResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateBackupResponse => JavaCreateBackupResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBackupResponseOps {

  implicit class JavaCreateBackupResponseOps(val self: JavaCreateBackupResponse) extends AnyVal {

    def toScala: ScalaCreateBackupResponse = {
      ScalaCreateBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupDetails(Option(self.backupDetails).map { v =>
          import BackupDetailsOps._; v.toScala
        }) // BackupDetails
    }

  }

}
