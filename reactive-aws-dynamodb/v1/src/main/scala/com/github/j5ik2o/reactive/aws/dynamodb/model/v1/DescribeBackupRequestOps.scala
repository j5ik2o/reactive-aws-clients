package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeBackupRequest => JavaDescribeBackupRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupRequest => ScalaDescribeBackupRequest }

object DescribeBackupRequestOps {

  implicit class ScalaDescribeBackupRequestOps(val self: ScalaDescribeBackupRequest) extends AnyVal {

    def toJava: JavaDescribeBackupRequest = {
      val result = new JavaDescribeBackupRequest()
      self.backupArn.foreach(result.setBackupArn)
      result
    }

  }

  implicit class JavaDescribeBackupRequestOps(val self: JavaDescribeBackupRequest) extends AnyVal {

    def toScala: ScalaDescribeBackupRequest = {
      ScalaDescribeBackupRequest().withBackupArn(Option(self.getBackupArn))
    }

  }

}
