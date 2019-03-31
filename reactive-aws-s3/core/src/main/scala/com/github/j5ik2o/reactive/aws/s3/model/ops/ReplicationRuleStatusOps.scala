// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationRuleStatus => ScalaReplicationRuleStatus, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationRuleStatus => JavaReplicationRuleStatus }

object ReplicationRuleStatusOps {

  implicit class ScalaReplicationRuleStatusOps(val self: ScalaReplicationRuleStatus) extends AnyVal {

    def toJava: JavaReplicationRuleStatus = {
      JavaReplicationRuleStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaReplicationRuleStatusOps(val self: JavaReplicationRuleStatus) extends AnyVal {

    def toScala: ScalaReplicationRuleStatus = {
      ScalaReplicationRuleStatus.withName(self.toString)
    }

  }

}
