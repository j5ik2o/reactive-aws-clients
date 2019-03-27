// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeBackupRequest => ScalaDescribeBackupRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeBackupRequest => JavaDescribeBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeBackupRequestOps {

  implicit class ScalaDescribeBackupRequestOps(val self: ScalaDescribeBackupRequest) extends AnyVal {

    def toJava: JavaDescribeBackupRequest = {
      val result = new JavaDescribeBackupRequest()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.withBackupArn(v)) // String

      result
    }

  }

}
