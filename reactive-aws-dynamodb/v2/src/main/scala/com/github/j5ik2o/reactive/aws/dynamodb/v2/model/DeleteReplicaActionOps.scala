// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteReplicaAction => ScalaDeleteReplicaAction, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteReplicaAction => JavaDeleteReplicaAction }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteReplicaActionOps {

  implicit class ScalaDeleteReplicaActionOps(val self: ScalaDeleteReplicaAction) extends AnyVal {

    def toJava: JavaDeleteReplicaAction = {
      val result = JavaDeleteReplicaAction.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String

      result.build()
    }

  }

  implicit class JavaDeleteReplicaActionOps(val self: JavaDeleteReplicaAction) extends AnyVal {

    def toScala: ScalaDeleteReplicaAction = {
      ScalaDeleteReplicaAction()
        .withRegionName(Option(self.regionName)) // String
    }

  }

}
