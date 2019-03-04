package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteReplicaAction => JavaDeleteReplicaAction }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteReplicaAction => ScalaDeleteReplicaAction }

object DeleteReplicaActionOps {

  implicit class ScalaDeleteReplicaActionOps(val self: ScalaDeleteReplicaAction) extends AnyVal {

    def toJava: JavaDeleteReplicaAction = {
      val result = new JavaDeleteReplicaAction
      self.regionName.foreach(result.setRegionName)
      result
    }

  }

  implicit class JavaDeleteReplicaActionOps(val self: JavaDeleteReplicaAction) extends AnyVal {

    def toScala: ScalaDeleteReplicaAction = {
      ScalaDeleteReplicaAction().withRegionName(Option(self.getRegionName))
    }

  }

}
