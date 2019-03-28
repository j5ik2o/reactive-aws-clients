// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaDescription => ScalaReplicaDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReplicaDescription => JavaReplicaDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaDescriptionOps {

  implicit class ScalaReplicaDescriptionOps(val self: ScalaReplicaDescription) extends AnyVal {

    def toJava: JavaReplicaDescription = {
      val result = new JavaReplicaDescription()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String

      result
    }

  }

  implicit class JavaReplicaDescriptionOps(val self: JavaReplicaDescription) extends AnyVal {

    def toScala: ScalaReplicaDescription = {
      ScalaReplicaDescription()
        .withRegionName(Option(self.getRegionName)) // String
    }

  }

}
