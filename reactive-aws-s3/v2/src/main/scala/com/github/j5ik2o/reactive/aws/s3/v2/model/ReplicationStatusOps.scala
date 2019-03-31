// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationStatus => ScalaReplicationStatus, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationStatus => JavaReplicationStatus }

object ReplicationStatusOps {

  implicit class ScalaReplicationStatusOps(val self: ScalaReplicationStatus) extends AnyVal {

    def toJava: JavaReplicationStatus = {
      JavaReplicationStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaReplicationStatusOps(val self: JavaReplicationStatus) extends AnyVal {

    def toScala: ScalaReplicationStatus = {
      ScalaReplicationStatus.withName(self.toString)
    }

  }

}
