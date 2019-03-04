package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ DeleteReplicaAction => ScalaDeleteReplicaAction }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteReplicaAction => JavaDeleteReplicaAction }

object DeleteReplicaActionOps {

  implicit class ScalaDeleteReplicaActionOps(val self: ScalaDeleteReplicaAction) extends AnyVal {

    def toJava: JavaDeleteReplicaAction = {
      val result = JavaDeleteReplicaAction.builder()
      self.regionName.foreach(result.regionName)
      result.build()
    }

  }

  implicit class JavaDeleteReplicaActionOps(val self: JavaDeleteReplicaAction) extends AnyVal {

    def toScala: ScalaDeleteReplicaAction = {
      ScalaDeleteReplicaAction().withRegionName(Option(self.regionName))
    }

  }

}
