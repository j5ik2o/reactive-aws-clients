package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupResponse => ScalaDescribeBackupResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeBackupResponse => JavaDescribeBackupResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeBackupResponseOps {

  import BackupDescriptionOps._

  implicit class JavaDescribeBackupResponseOps(val self: JavaDescribeBackupResponse) extends AnyVal {

    def toScala: ScalaDescribeBackupResponse = {
      ScalaDescribeBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withBackupDescription(Option(self.backupDescription).map(_.toScala))
    }

  }

}
