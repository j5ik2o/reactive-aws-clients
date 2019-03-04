package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ CreateReplicaAction => JavaCreateReplicaAction }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateReplicaAction => ScalaCreateReplicaAction }

object CreateReplicaActionOps {

  implicit class ScalaCreateReplicaActionOps(val self: ScalaCreateReplicaAction) extends AnyVal {

    def toJava: JavaCreateReplicaAction = {
      val result = new JavaCreateReplicaAction()
      self.regionName.foreach(result.setRegionName)
      result
    }

  }

  implicit class JavaCreateReplicaActionOps(val self: JavaCreateReplicaAction) extends AnyVal {

    def toScala: ScalaCreateReplicaAction = {
      ScalaCreateReplicaAction().withRegionName(Option(self.getRegionName))
    }

  }

}
