package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ DeleteBackupResponse => ScalaDeleteBackupResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteBackupResponse => JavaDeleteBackupResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DeleteBackupResponseOps {

  import BackupDescriptionOps._

  implicit class JavaDeleteBackupResponseOps(val self: JavaDeleteBackupResponse) extends AnyVal {

    def toScala: ScalaDeleteBackupResponse = {
      ScalaDeleteBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withBackupDescription(Option(self.backupDescription).map(_.toScala))
    }

  }

}
