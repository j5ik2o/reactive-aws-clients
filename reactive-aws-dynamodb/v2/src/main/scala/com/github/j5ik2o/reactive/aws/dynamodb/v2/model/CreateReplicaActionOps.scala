// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateReplicaAction => ScalaCreateReplicaAction, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateReplicaAction => JavaCreateReplicaAction }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateReplicaActionOps {

  implicit class ScalaCreateReplicaActionOps(val self: ScalaCreateReplicaAction) extends AnyVal {

    def toJava: JavaCreateReplicaAction = {
      val result = JavaCreateReplicaAction.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String

      result.build()
    }

  }

  implicit class JavaCreateReplicaActionOps(val self: JavaCreateReplicaAction) extends AnyVal {

    def toScala: ScalaCreateReplicaAction = {
      ScalaCreateReplicaAction()
        .withRegionName(Option(self.regionName)) // String
    }

  }

}
