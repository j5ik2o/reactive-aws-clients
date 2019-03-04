package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateGlobalTableRequest => ScalaUpdateGlobalTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableRequest => JavaUpdateGlobalTableRequest }

import scala.collection.JavaConverters._

object UpdateGlobalTableRequestOps {

  import ReplicaUpdateOps._

  implicit class ScalaUpdateGlobalTableRequestOps(val self: ScalaUpdateGlobalTableRequest) extends AnyVal {

    def toJava: JavaUpdateGlobalTableRequest = {
      val result = JavaUpdateGlobalTableRequest.builder()
      self.globalTableName.foreach(result.globalTableName)
      self.replicaUpdates.map(_.map(_.toJava).asJava).foreach(result.replicaUpdates)
      result.build()
    }

  }

  implicit class JavaUpdateGlobalTableRequestOps(val self: JavaUpdateGlobalTableRequest) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableRequest = {
      ScalaUpdateGlobalTableRequest()
        .withGlobalTableName(Option(self.globalTableName))
        .withReplicaUpdates(Option(self.replicaUpdates).map(_.asScala.map(_.toScala)))
    }
  }

}
