package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ Replica => JavaReplica }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Replica => ScalaReplica }

object ReplicaOps {

  implicit class ScalaReplicaOps(val self: ScalaReplica) extends AnyVal {

    def toJava: JavaReplica = {
      val result = new JavaReplica()
      self.regionName.foreach(result.setRegionName)
      result
    }
  }

  implicit class JavaReplicaOps(val self: JavaReplica) extends AnyVal {

    def toScala: ScalaReplica = {
      ScalaReplica().withRegionName(Option(self.getRegionName))
    }

  }

}
