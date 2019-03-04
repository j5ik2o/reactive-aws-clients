package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateGlobalTableRequest => JavaUpdateGlobalTableRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateGlobalTableRequest => ScalaUpdateGlobalTableRequest }

import scala.collection.JavaConverters._

object UpdateGlobalTableRequestOps {

  import ReplicaUpdateOps._

  implicit class ScalaUpdateGlobalTableRequestOps(val self: ScalaUpdateGlobalTableRequest) extends AnyVal {

    def toJava: JavaUpdateGlobalTableRequest = {
      val result = new JavaUpdateGlobalTableRequest()
      self.globalTableName.foreach(result.setGlobalTableName)
      self.replicaUpdates.map(_.map(_.toJava).asJava).foreach(result.setReplicaUpdates)
      result
    }

  }

  implicit class JavaUpdateGlobalTableRequestOps(val self: JavaUpdateGlobalTableRequest) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableRequest = {
      ScalaUpdateGlobalTableRequest()
        .withGlobalTableName(Option(self.getGlobalTableName))
        .withReplicaUpdates(Option(self.getReplicaUpdates).map(_.asScala.map(_.toScala)))
    }
  }

}
