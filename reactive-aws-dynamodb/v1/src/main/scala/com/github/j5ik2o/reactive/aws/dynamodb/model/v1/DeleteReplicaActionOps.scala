// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteReplicaAction => ScalaDeleteReplicaAction, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteReplicaAction => JavaDeleteReplicaAction }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteReplicaActionOps {

  implicit class ScalaDeleteReplicaActionOps(val self: ScalaDeleteReplicaAction) extends AnyVal {

    def toJava: JavaDeleteReplicaAction = {
      val result = new JavaDeleteReplicaAction()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String

      result
    }

  }

  implicit class JavaDeleteReplicaActionOps(val self: JavaDeleteReplicaAction) extends AnyVal {

    def toScala: ScalaDeleteReplicaAction = {
      ScalaDeleteReplicaAction()
        .withRegionName(Option(self.getRegionName)) // String
    }

  }

}
