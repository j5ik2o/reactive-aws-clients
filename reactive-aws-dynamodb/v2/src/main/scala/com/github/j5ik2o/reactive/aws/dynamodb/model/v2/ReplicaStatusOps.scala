package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaStatus => ScalaReplicaStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaStatus => JavaReplicaStatus }

object ReplicaStatusOps {

  implicit class ScalaReplicaStatusOps(val self: ScalaReplicaStatus) extends AnyVal {

    def toJava: JavaReplicaStatus = {
        JavaReplicaStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaReplicaStatusOps(val self: JavaReplicaStatus) extends AnyVal {

     def toScala: ScalaReplicaStatus = {
        ScalaReplicaStatus.withName(self.toString)
     }

   }

}