package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalTableSettingsResponse => ScalaUpdateGlobalTableSettingsResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateGlobalTableSettingsResponse => JavaUpdateGlobalTableSettingsResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateGlobalTableSettingsResponseOps {

  import ReplicaSettingsDescriptionOps._

  implicit class JavaUpdateGlobalTableSettingsResponseOps(val self: JavaUpdateGlobalTableSettingsResponse)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsResponse = {
      ScalaUpdateGlobalTableSettingsResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withGlobalTableName(Option(self.globalTableName))
        .withReplicaSettings(Option(self.replicaSettings).map(_.asScala.map(_.toScala)))
    }
  }

}
