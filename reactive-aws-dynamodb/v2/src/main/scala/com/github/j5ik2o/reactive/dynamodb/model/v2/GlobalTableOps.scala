package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ GlobalTable => ScalaGlobalTable }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalTable => JavaGlobalTable }

import scala.collection.JavaConverters._

object GlobalTableOps {

  import ReplicaOps._

  implicit class ScalaGlobalTableOps(val self: ScalaGlobalTable) extends AnyVal {

    def toJava: JavaGlobalTable = {
      val result = JavaGlobalTable.builder()
      self.globalTableName.foreach(result.globalTableName)
      self.replicationGroup.map(_.map(_.toJava).asJava).foreach(result.replicationGroup)
      result.build()
    }

  }

  implicit class JavaGlobalTableOps(val self: JavaGlobalTable) extends AnyVal {

    def toScala: ScalaGlobalTable = {
      ScalaGlobalTable()
        .withGlobalTableName(Option(self.globalTableName))
        .withReplicationGroup(Option(self.replicationGroup).map(_.asScala.map(_.toScala)))
    }

  }

}
