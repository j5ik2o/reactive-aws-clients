// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteMarkerReplicationStatus => ScalaDeleteMarkerReplicationStatus,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeleteMarkerReplicationStatus => JavaDeleteMarkerReplicationStatus }

object DeleteMarkerReplicationStatusOps {

  implicit class ScalaDeleteMarkerReplicationStatusOps(val self: ScalaDeleteMarkerReplicationStatus) extends AnyVal {

    def toJava: JavaDeleteMarkerReplicationStatus = {
      JavaDeleteMarkerReplicationStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaDeleteMarkerReplicationStatusOps(val self: JavaDeleteMarkerReplicationStatus) extends AnyVal {

    def toScala: ScalaDeleteMarkerReplicationStatus = {
      ScalaDeleteMarkerReplicationStatus.withName(self.toString)
    }

  }

}
