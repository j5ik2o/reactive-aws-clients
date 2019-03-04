package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateBackupRequest => JavaCreateBackupRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupRequest => ScalaCreateBackupRequest }

object CreateBackupRequestOps {

  implicit class ScalaCreateBackupRequestOps(val self: ScalaCreateBackupRequest) extends AnyVal {

    def toJava: JavaCreateBackupRequest = {
      val result = new JavaCreateBackupRequest()
      self.tableName.foreach(result.setTableName)
      self.backupName.foreach(result.setBackupName)
      result
    }

  }

  implicit class JavaCreateBackupRequestOps(val self: JavaCreateBackupRequest) extends AnyVal {

    def toScala: ScalaCreateBackupRequest = {
      ScalaCreateBackupRequest().withTableName(Option(self.getTableName)).withBackupName(Option(self.getBackupName))
    }

  }

}
