package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupRequest => ScalaDescribeBackupRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeBackupRequest => JavaDescribeBackupRequest }

object DescribeBackupRequestOps {

  implicit class ScalaDescribeBackupRequestOps(val self: ScalaDescribeBackupRequest) extends AnyVal {

    def toJava: JavaDescribeBackupRequest = {
      val result = JavaDescribeBackupRequest.builder()
      self.backupArn.foreach(result.backupArn)
      result.build()
    }

  }

  implicit class JavaDescribeBackupRequestOps(val self: JavaDescribeBackupRequest) extends AnyVal {

    def toScala: ScalaDescribeBackupRequest = {
      ScalaDescribeBackupRequest().withBackupArn(Option(self.backupArn))
    }

  }

}
