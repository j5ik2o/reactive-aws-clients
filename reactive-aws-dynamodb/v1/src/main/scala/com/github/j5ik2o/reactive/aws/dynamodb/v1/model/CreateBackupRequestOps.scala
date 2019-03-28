// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupRequest => ScalaCreateBackupRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateBackupRequest => JavaCreateBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBackupRequestOps {

  implicit class ScalaCreateBackupRequestOps(val self: ScalaCreateBackupRequest) extends AnyVal {

    def toJava: JavaCreateBackupRequest = {
      val result = new JavaCreateBackupRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))   // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.withBackupName(v)) // String

      result
    }

  }

}
