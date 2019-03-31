// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketLogsPermission => ScalaBucketLogsPermission, _ }
import software.amazon.awssdk.services.s3.model.{ BucketLogsPermission => JavaBucketLogsPermission }

object BucketLogsPermissionOps {

  implicit class ScalaBucketLogsPermissionOps(val self: ScalaBucketLogsPermission) extends AnyVal {

    def toJava: JavaBucketLogsPermission = {
      JavaBucketLogsPermission.valueOf(self.entryName)
    }

  }

  implicit class JavaBucketLogsPermissionOps(val self: JavaBucketLogsPermission) extends AnyVal {

    def toScala: ScalaBucketLogsPermission = {
      ScalaBucketLogsPermission.withName(self.toString)
    }

  }

}
