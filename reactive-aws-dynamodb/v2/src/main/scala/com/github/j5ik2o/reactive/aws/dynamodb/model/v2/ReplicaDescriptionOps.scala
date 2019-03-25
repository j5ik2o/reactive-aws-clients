package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaDescription => ScalaReplicaDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaDescription => JavaReplicaDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaDescriptionOps {

  implicit class ScalaReplicaDescriptionOps(val self: ScalaReplicaDescription) extends AnyVal {

    def toJava: JavaReplicaDescription = {
      val result = JavaReplicaDescription.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String, case String

      result.build()
    }

  }

  implicit class JavaReplicaDescriptionOps(val self: JavaReplicaDescription) extends AnyVal {

    def toScala: ScalaReplicaDescription = {
      ScalaReplicaDescription()
        .withRegionName(Option(self.regionName)) // String
    }

  }

}
