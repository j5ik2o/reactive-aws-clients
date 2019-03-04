package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupResponse => ScalaCreateBackupResponse }
import software.amazon.awssdk.services.dynamodb.model.{ CreateBackupResponse => JavaCreateBackupResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object CreateBackupResponseOps {

  import BackupDetailsOps._

  implicit class ScalaCreateBackupResponseOps(val self: ScalaCreateBackupResponse) extends AnyVal {

    def toJava: JavaCreateBackupResponse = {
      val result = JavaCreateBackupResponse.builder()
      self.backupDetails.foreach(v => result.backupDetails(v.toJava))
      result.build()
    }

  }

  implicit class JavaCreateBackupResponseOps(val self: JavaCreateBackupResponse) extends AnyVal {

    def toScala: ScalaCreateBackupResponse = {
      ScalaCreateBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupDetails(Option(self.backupDetails).map(_.toScala))
    }

  }

}
