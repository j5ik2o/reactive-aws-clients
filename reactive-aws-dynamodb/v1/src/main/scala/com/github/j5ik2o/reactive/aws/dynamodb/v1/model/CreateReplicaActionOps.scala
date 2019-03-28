// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateReplicaAction => ScalaCreateReplicaAction, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateReplicaAction => JavaCreateReplicaAction }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateReplicaActionOps {

  implicit class ScalaCreateReplicaActionOps(val self: ScalaCreateReplicaAction) extends AnyVal {

    def toJava: JavaCreateReplicaAction = {
      val result = new JavaCreateReplicaAction()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String

      result
    }

  }

  implicit class JavaCreateReplicaActionOps(val self: JavaCreateReplicaAction) extends AnyVal {

    def toScala: ScalaCreateReplicaAction = {
      ScalaCreateReplicaAction()
        .withRegionName(Option(self.getRegionName)) // String
    }

  }

}
