package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ CreateGlobalTableRequest => JavaCreateGlobalTableRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ CreateGlobalTableRequest => ScalaCreateGlobalTableRequest }

import scala.collection.JavaConverters._

object CreateGlobalTableRequestOps {

  import ReplicaOps._

  implicit class ScalaCreateGlobalTableRequestOps(val self: ScalaCreateGlobalTableRequest) extends AnyVal {

    def toJava: JavaCreateGlobalTableRequest = {
      val result = new JavaCreateGlobalTableRequest()
      self.globalTableName.foreach(result.setGlobalTableName)
      self.replicationGroup.foreach(v => result.setReplicationGroup(v.map(_.toJava).asJava))
      result
    }

  }

  implicit class JavaCreateGlobalTableRequestOps(val self: JavaCreateGlobalTableRequest) extends AnyVal {

    def toScala: ScalaCreateGlobalTableRequest = {
      ScalaCreateGlobalTableRequest()
        .withGlobalTableName(Option(self.getGlobalTableName)).withReplicationGroup(
          Option(self.getReplicationGroup).map(_.asScala.map(_.toScala))
        )
    }

  }

}
