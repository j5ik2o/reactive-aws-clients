package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ ReplicaUpdate => JavaReplicaUpdate }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaUpdate => ScalaReplicaUpdate }

object ReplicaUpdateOps {

  import CreateReplicaActionOps._
  import DeleteReplicaActionOps._

  implicit class ScalaReplicaUpdateOps(val self: ScalaReplicaUpdate) extends AnyVal {

    def toJava: JavaReplicaUpdate = {
      val result = new JavaReplicaUpdate()
      self.create.map(_.toJava).foreach(result.setCreate)
      self.delete.map(_.toJava).foreach(result.setDelete)
      result
    }

  }

  implicit class JavaReplicaUpdateOps(val self: JavaReplicaUpdate) extends AnyVal {

    def toScala: ScalaReplicaUpdate = {
      ScalaReplicaUpdate()
        .withCreate(Option(self.getCreate).map(_.toScala))
        .withDelete(Option(self.getDelete).map(_.toScala))
    }

  }

}
