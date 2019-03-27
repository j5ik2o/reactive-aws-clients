// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaStatus => ScalaReplicaStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReplicaStatus => JavaReplicaStatus }

object ReplicaStatusOps {

  implicit class ScalaReplicaStatusOps(val self: ScalaReplicaStatus) extends AnyVal {

    def toJava: JavaReplicaStatus = {
      JavaReplicaStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaReplicaStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaReplicaStatus = {
      ScalaReplicaStatus.withName(self)
    }

  }

}
