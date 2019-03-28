// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupRequest => ScalaDeleteBackupRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteBackupRequest => JavaDeleteBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBackupRequestOps {

  implicit class ScalaDeleteBackupRequestOps(val self: ScalaDeleteBackupRequest) extends AnyVal {

    def toJava: JavaDeleteBackupRequest = {
      val result = JavaDeleteBackupRequest.builder()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v)) // String

      result.build()
    }

  }

}