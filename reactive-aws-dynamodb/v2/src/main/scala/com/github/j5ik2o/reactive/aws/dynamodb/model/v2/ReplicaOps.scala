package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Replica => ScalaReplica, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Replica => JavaReplica }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaOps {

  implicit class ScalaReplicaOps(val self: ScalaReplica) extends AnyVal {

    def toJava: JavaReplica = {
      val result = JavaReplica.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String

      result.build()
    }

  }

  implicit class JavaReplicaOps(val self: JavaReplica) extends AnyVal {

    def toScala: ScalaReplica = {
      ScalaReplica()
        .withRegionName(Option(self.regionName)) // String
    }

  }

}
