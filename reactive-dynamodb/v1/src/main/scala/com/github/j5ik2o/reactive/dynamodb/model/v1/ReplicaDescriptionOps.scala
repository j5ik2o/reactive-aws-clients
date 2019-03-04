package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ReplicaDescription => JavaReplicaDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{ ReplicaDescription => ScalaReplicaDescription }

object ReplicaDescriptionOps {

  implicit class ScalaReplicaDescriptionOps(val self: ScalaReplicaDescription) extends AnyVal {

    def toJava: JavaReplicaDescription = {
      val result = new JavaReplicaDescription()
      self.regionName.foreach(result.setRegionName)
      result
    }

  }

  implicit class JavaReplicaDescriptionOps(val self: JavaReplicaDescription) extends AnyVal {

    def toScala: ScalaReplicaDescription = {
      ScalaReplicaDescription().withRegionName(Option(self.getRegionName))
    }
  }

}
