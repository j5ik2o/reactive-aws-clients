package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaUpdate => ScalaReplicaUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaUpdate => JavaReplicaUpdate }

object ReplicaUpdateOps {

  import CreateReplicaActionOps._
  import DeleteReplicaActionOps._

  implicit class ScalaReplicaUpdateOps(val self: ScalaReplicaUpdate) extends AnyVal {

    def toJava: JavaReplicaUpdate = {
      val result = JavaReplicaUpdate.builder()
      self.create.map(_.toJava).foreach(result.create)
      self.delete.map(_.toJava).foreach(result.delete)
      result.build()
    }

  }

  implicit class JavaReplicaUpdateOps(val self: JavaReplicaUpdate) extends AnyVal {

    def toScala: ScalaReplicaUpdate = {
      ScalaReplicaUpdate()
        .withCreate(Option(self.create).map(_.toScala))
        .withDelete(Option(self.delete).map(_.toScala))
    }

  }

}
