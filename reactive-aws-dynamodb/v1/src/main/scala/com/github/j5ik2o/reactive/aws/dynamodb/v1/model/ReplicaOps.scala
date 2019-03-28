// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Replica => ScalaReplica, _ }
import com.amazonaws.services.dynamodbv2.model.{ Replica => JavaReplica }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaOps {

  implicit class ScalaReplicaOps(val self: ScalaReplica) extends AnyVal {

    def toJava: JavaReplica = {
      val result = new JavaReplica()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String

      result
    }

  }

  implicit class JavaReplicaOps(val self: JavaReplica) extends AnyVal {

    def toScala: ScalaReplica = {
      ScalaReplica()
        .withRegionName(Option(self.getRegionName)) // String
    }

  }

}
