package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupRequest => ScalaDescribeBackupRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeBackupRequest => JavaDescribeBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeBackupRequestOps {

  implicit class ScalaDescribeBackupRequestOps(val self: ScalaDescribeBackupRequest) extends AnyVal {

    def toJava: JavaDescribeBackupRequest = {
      val result = JavaDescribeBackupRequest.builder()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v)) // String, case String

      result.build()
    }

  }

}
