package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteBackupRequest => JavaDeleteBackupRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteBackupRequest => ScalaDeleteBackupRequest }

object DeleteBackupRequestOps {

  implicit class ScalaDeleteBackupRequestOps(val self: ScalaDeleteBackupRequest) extends AnyVal {

    def toJava: JavaDeleteBackupRequest = {
      val result = new JavaDeleteBackupRequest()
      self.backupArn.foreach(result.setBackupArn)
      result
    }

  }

  implicit class JavaDeleteBackupRequestOps(val self: JavaDeleteBackupRequest) extends AnyVal {

    def toScala: ScalaDeleteBackupRequest = {
      ScalaDeleteBackupRequest().withBackupArn(Option(self.getBackupArn))
    }

  }

}
