package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ CreateGlobalTableRequest => ScalaCreateGlobalTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ CreateGlobalTableRequest => JavaCreateGlobalTableRequest }

import scala.collection.JavaConverters._

object CreateGlobalTableRequestOps {
  import ReplicaOps._

  implicit class ScalaCreateGlobalTableRequestOps(val self: ScalaCreateGlobalTableRequest) extends AnyVal {

    def toJava: JavaCreateGlobalTableRequest = {
      val result = JavaCreateGlobalTableRequest.builder()
      self.globalTableName.foreach(result.globalTableName)
      self.replicationGroup.foreach(v => result.replicationGroup(v.map(_.toJava).asJava))
      result.build()
    }

  }

  implicit class JavaCreateGlobalTableRequestOps(val self: JavaCreateGlobalTableRequest) extends AnyVal {

    def toScala: ScalaCreateGlobalTableRequest = {
      ScalaCreateGlobalTableRequest()
        .withGlobalTableName(Option(self.globalTableName)).withReplicationGroup(
          Option(self.replicationGroup).map(_.asScala.map(_.toScala))
        )
    }

  }
}
