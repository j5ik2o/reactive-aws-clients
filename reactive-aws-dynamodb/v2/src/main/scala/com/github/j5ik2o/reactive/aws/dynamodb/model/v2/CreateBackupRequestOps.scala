// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateBackupRequest => ScalaCreateBackupRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateBackupRequest => JavaCreateBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBackupRequestOps {

  implicit class ScalaCreateBackupRequestOps(val self: ScalaCreateBackupRequest) extends AnyVal {

    def toJava: JavaCreateBackupRequest = {
      val result = JavaCreateBackupRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))   // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.backupName(v)) // String

      result.build()
    }

  }

}
