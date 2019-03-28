// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaUpdate => ScalaReplicaUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaUpdate => JavaReplicaUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaUpdateOps {

  implicit class ScalaReplicaUpdateOps(val self: ScalaReplicaUpdate) extends AnyVal {

    def toJava: JavaReplicaUpdate = {
      val result = JavaReplicaUpdate.builder()
      self.create.foreach { v =>
        import CreateReplicaActionOps._; result.create(v.toJava)
      } // CreateReplicaAction
      self.delete.foreach { v =>
        import DeleteReplicaActionOps._; result.delete(v.toJava)
      } // DeleteReplicaAction

      result.build()
    }

  }

  implicit class JavaReplicaUpdateOps(val self: JavaReplicaUpdate) extends AnyVal {

    def toScala: ScalaReplicaUpdate = {
      ScalaReplicaUpdate()
        .withCreate(Option(self.create).map { v =>
          import CreateReplicaActionOps._; v.toScala
        }) // CreateReplicaAction
        .withDelete(Option(self.delete).map { v =>
          import DeleteReplicaActionOps._; v.toScala
        }) // DeleteReplicaAction
    }

  }

}
