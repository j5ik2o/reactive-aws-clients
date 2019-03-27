// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalTableSettingsResponse => ScalaUpdateGlobalTableSettingsResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalTableSettingsResult => JavaUpdateGlobalTableSettingsResponse
}

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableSettingsResponseOps {

  implicit class JavaUpdateGlobalTableSettingsResponseOps(val self: JavaUpdateGlobalTableSettingsResponse)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsResponse = {
      ScalaUpdateGlobalTableSettingsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableName(Option(self.getGlobalTableName)) // String
        .withReplicaSettings(Option(self.getReplicaSettings).map { v =>
          import scala.collection.JavaConverters._, ReplicaSettingsDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaSettingsDescription]
    }

  }

}
