package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupRequest => ScalaDeleteBackupRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteBackupRequest => JavaDeleteBackupRequest }

object DeleteBackupRequestOps {

  implicit class ScalaDeleteBackupRequestOps(val self: ScalaDeleteBackupRequest) extends AnyVal {

    def toJava: JavaDeleteBackupRequest = {
      val result = JavaDeleteBackupRequest.builder()
      self.backupArn.foreach(result.backupArn)
      result.build()
    }

  }

  implicit class JavaDeleteBackupRequestOps(val self: JavaDeleteBackupRequest) extends AnyVal {

    def toScala: ScalaDeleteBackupRequest = {
      ScalaDeleteBackupRequest().withBackupArn(Option(self.backupArn))
    }

  }

}
