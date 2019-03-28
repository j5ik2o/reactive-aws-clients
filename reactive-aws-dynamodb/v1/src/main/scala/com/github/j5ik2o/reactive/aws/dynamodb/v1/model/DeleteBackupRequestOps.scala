// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupRequest => ScalaDeleteBackupRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteBackupRequest => JavaDeleteBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBackupRequestOps {

  implicit class ScalaDeleteBackupRequestOps(val self: ScalaDeleteBackupRequest) extends AnyVal {

    def toJava: JavaDeleteBackupRequest = {
      val result = new JavaDeleteBackupRequest()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.withBackupArn(v)) // String

      result
    }

  }

}
