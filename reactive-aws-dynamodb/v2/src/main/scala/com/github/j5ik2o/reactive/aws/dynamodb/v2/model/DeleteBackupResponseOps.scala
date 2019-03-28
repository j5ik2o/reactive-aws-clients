// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupResponse => ScalaDeleteBackupResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteBackupResponse => JavaDeleteBackupResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBackupResponseOps {

  implicit class JavaDeleteBackupResponseOps(val self: JavaDeleteBackupResponse) extends AnyVal {

    def toScala: ScalaDeleteBackupResponse = {
      ScalaDeleteBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBackupDescription(Option(self.backupDescription).map { v =>
          import BackupDescriptionOps._; v.toScala
        }) // BackupDescription
    }

  }

}
