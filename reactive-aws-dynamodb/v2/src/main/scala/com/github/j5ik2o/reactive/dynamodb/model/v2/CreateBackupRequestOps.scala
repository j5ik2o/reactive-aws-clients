package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ CreateBackupRequest => ScalaCreateBackupRequest }
import software.amazon.awssdk.services.dynamodb.model.{ CreateBackupRequest => JavaCreateBackupRequest }

object CreateBackupRequestOps {

  implicit class ScalaCreateBackupRequestOps(val self: ScalaCreateBackupRequest) extends AnyVal {

    def toJava: JavaCreateBackupRequest = {
      val result = JavaCreateBackupRequest.builder()
      self.tableName.foreach(result.tableName)
      self.backupName.foreach(result.backupName)
      result.build()
    }

  }

  implicit class JavaCreateBackupRequestOps(val self: JavaCreateBackupRequest) extends AnyVal {

    def toScala: ScalaCreateBackupRequest = {
      ScalaCreateBackupRequest().withTableName(Option(self.tableName)).withBackupName(Option(self.backupName))
    }

  }
}
