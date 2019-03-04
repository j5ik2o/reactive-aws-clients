package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupResponse => ScalaRestoreTableFromBackupResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableFromBackupResponse => JavaRestoreTableFromBackupResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object RestoreTableFromBackupResponseOps {

  import TableDescriptionOps._

  implicit class JavaRestoreTableFromBackupResponseOps(val self: JavaRestoreTableFromBackupResponse) extends AnyVal {

    def toScala: ScalaRestoreTableFromBackupResponse = {
      ScalaRestoreTableFromBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTableDescription(Option(self.tableDescription).map(_.toScala))
    }

  }

}
