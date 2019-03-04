package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ CreateReplicaAction => ScalaCreateReplicaAction }
import software.amazon.awssdk.services.dynamodb.model.{ CreateReplicaAction => JavaCreateReplicaAction }

object CreateReplicaActionOps {

  implicit class ScalaCreateReplicaActionOps(val self: ScalaCreateReplicaAction) extends AnyVal {

    def toJava: JavaCreateReplicaAction = {
      val result = JavaCreateReplicaAction.builder()
      self.regionName.foreach(result.regionName)
      result.build()
    }

  }

  implicit class JavaCreateReplicaActionOps(val self: JavaCreateReplicaAction) extends AnyVal {

    def toScala: ScalaCreateReplicaAction = {
      ScalaCreateReplicaAction().withRegionName(Option(self.regionName))
    }

  }

}
