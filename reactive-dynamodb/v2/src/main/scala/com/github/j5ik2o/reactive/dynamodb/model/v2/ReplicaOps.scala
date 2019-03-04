package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ Replica => ScalaReplica }
import software.amazon.awssdk.services.dynamodb.model.{ Replica => JavaReplica }

object ReplicaOps {

  implicit class ScalaReplicaOps(val self: ScalaReplica) extends AnyVal {

    def toJava: JavaReplica = {
      val result = JavaReplica.builder()
      self.regionName.foreach(result.regionName)
      result.build()
    }
  }

  implicit class JavaReplicaOps(val self: JavaReplica) extends AnyVal {

    def toScala: ScalaReplica = {
      ScalaReplica().withRegionName(Option(self.regionName))
    }

  }
}
