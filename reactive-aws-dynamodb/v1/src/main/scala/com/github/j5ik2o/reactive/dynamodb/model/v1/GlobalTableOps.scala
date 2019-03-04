package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GlobalTable => JavaGlobalTable }
import com.github.j5ik2o.reactive.dynamodb.model.{ GlobalTable => ScalaGlobalTable }

import scala.collection.JavaConverters._

object GlobalTableOps {

  import ReplicaOps._

  implicit class ScalaGlobalTableOps(val self: ScalaGlobalTable) extends AnyVal {

    def toJava: JavaGlobalTable = {
      val result = new JavaGlobalTable()
      self.globalTableName.foreach(result.setGlobalTableName)
      self.replicationGroup.map(_.map(_.toJava).asJava).foreach(result.setReplicationGroup)
      result
    }

  }

  implicit class JavaGlobalTableOps(val self: JavaGlobalTable) extends AnyVal {

    def toScala: ScalaGlobalTable = {
      ScalaGlobalTable()
        .withGlobalTableName(Option(self.getGlobalTableName))
        .withReplicationGroup(Option(self.getReplicationGroup).map(_.asScala.map(_.toScala)))
    }

  }

}
