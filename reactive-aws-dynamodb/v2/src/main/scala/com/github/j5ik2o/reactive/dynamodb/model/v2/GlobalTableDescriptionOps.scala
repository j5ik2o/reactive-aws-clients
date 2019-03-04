package com.github.j5ik2o.reactive.dynamodb.model.v2

import java.util.Date

import com.github.j5ik2o.reactive.dynamodb.model.{
  GlobalTableStatus,
  GlobalTableDescription => ScalaGlobalTableDescription
}
import software.amazon.awssdk.services.dynamodb.model.{ GlobalTableDescription => JavaGlobalTableDescription }

import scala.collection.JavaConverters._

object GlobalTableDescriptionOps {
  import ReplicaDescriptionOps._

  implicit class ScalaGlobalTableDescriptionOps(val self: ScalaGlobalTableDescription) extends AnyVal {

    def toJava: JavaGlobalTableDescription = {
      val result = JavaGlobalTableDescription.builder()
      self.globalTableName.foreach(result.globalTableName)
      self.globalTableStatus.foreach(v => result.globalTableStatus(v.entryName))
      self.creationDateTime.foreach(v => result.creationDateTime(v.toInstant))
      self.globalTableArn.foreach(result.globalTableArn)
      self.replicationGroup.foreach(v => result.replicationGroup(v.map(_.toJava).asJava))
      result.build()
    }

  }

  implicit class JavaGlobalTableDescriptionOps(val self: JavaGlobalTableDescription) extends AnyVal {

    def toScala: ScalaGlobalTableDescription = {
      ScalaGlobalTableDescription()
        .withGlobalTableName(Option(self.globalTableName))
        .withGlobalTableStatus(Option(self.globalTableStatus.toString).map(GlobalTableStatus.withName))
        .withCreationDateTime(Option(self.creationDateTime).map(Date.from))
        .withGlobalTableArn(Option(self.globalTableArn))
        .withReplicationGroup(Option(self.replicationGroup.asScala.map(_.toScala)))
    }

  }
}
