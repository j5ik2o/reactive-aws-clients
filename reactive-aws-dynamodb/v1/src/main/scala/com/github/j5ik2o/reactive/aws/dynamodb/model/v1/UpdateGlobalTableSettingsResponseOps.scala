package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalTableSettingsResult => JavaUpdateGlobalTableSettingsResponse
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalTableSettingsResponse => ScalaUpdateGlobalTableSettingsResponse
}

import scala.collection.JavaConverters._

object UpdateGlobalTableSettingsResponseOps {

  import ReplicaSettingsDescriptionOps._

  implicit class JavaUpdateGlobalTableSettingsResponseOps(val self: JavaUpdateGlobalTableSettingsResponse)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsResponse = {
      ScalaUpdateGlobalTableSettingsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableName(Option(self.getGlobalTableName))
        .withReplicaSettings(Option(self.getReplicaSettings).map(_.asScala.map(_.toScala)))
    }
  }

}
