package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ GlobalTableDescription => JavaGlobalTableDescription }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalTableStatus,
  GlobalTableDescription => ScalaGlobalTableDescription
}

import scala.collection.JavaConverters._

object GlobalTableDescriptionOps {

  import ReplicaDescriptionOps._

  implicit class ScalaGlobalTableDescriptionOps(val self: ScalaGlobalTableDescription) extends AnyVal {

    def toJava: JavaGlobalTableDescription = {
      val result = new JavaGlobalTableDescription()
      self.globalTableName.foreach(result.setGlobalTableName)
      self.globalTableStatus.map(_.entryName).foreach(result.setGlobalTableStatus)
      self.creationDateTime.foreach(result.setCreationDateTime)
      self.globalTableArn.foreach(result.setGlobalTableArn)
      self.replicationGroup.foreach(v => result.setReplicationGroup(v.map(_.toJava).asJava))
      result
    }

  }

  implicit class JavaGlobalTableDescriptionOps(val self: JavaGlobalTableDescription) extends AnyVal {

    def toScala: ScalaGlobalTableDescription = {
      ScalaGlobalTableDescription()
        .withGlobalTableName(Option(self.getGlobalTableName))
        .withGlobalTableStatus(Option(self.getGlobalTableStatus).map(GlobalTableStatus.withName))
        .withCreationDateTime(Option(self.getCreationDateTime))
        .withGlobalTableArn(Option(self.getGlobalTableArn))
        .withReplicationGroup(Option(self.getReplicationGroup.asScala.map(_.toScala)))
    }

  }

}
