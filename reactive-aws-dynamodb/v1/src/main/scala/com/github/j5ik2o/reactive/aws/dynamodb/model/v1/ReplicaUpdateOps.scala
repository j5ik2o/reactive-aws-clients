// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaUpdate => ScalaReplicaUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReplicaUpdate => JavaReplicaUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaUpdateOps {

  implicit class ScalaReplicaUpdateOps(val self: ScalaReplicaUpdate) extends AnyVal {

    def toJava: JavaReplicaUpdate = {
      val result = new JavaReplicaUpdate()
      self.create.foreach { v =>
        import CreateReplicaActionOps._; result.withCreate(v.toJava)
      } // CreateReplicaAction
      self.delete.foreach { v =>
        import DeleteReplicaActionOps._; result.withDelete(v.toJava)
      } // DeleteReplicaAction

      result
    }

  }

  implicit class JavaReplicaUpdateOps(val self: JavaReplicaUpdate) extends AnyVal {

    def toScala: ScalaReplicaUpdate = {
      ScalaReplicaUpdate()
        .withCreate(Option(self.getCreate).map { v =>
          import CreateReplicaActionOps._; v.toScala
        }) // CreateReplicaAction
        .withDelete(Option(self.getDelete).map { v =>
          import DeleteReplicaActionOps._; v.toScala
        }) // DeleteReplicaAction
    }

  }

}
