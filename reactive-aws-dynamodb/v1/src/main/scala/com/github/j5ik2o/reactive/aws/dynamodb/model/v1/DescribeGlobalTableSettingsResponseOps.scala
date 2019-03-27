// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableSettingsResponse => ScalaDescribeGlobalTableSettingsResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  DescribeGlobalTableSettingsResult => JavaDescribeGlobalTableSettingsResponse
}

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableSettingsResponseOps {

  implicit class JavaDescribeGlobalTableSettingsResponseOps(val self: JavaDescribeGlobalTableSettingsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeGlobalTableSettingsResponse = {
      ScalaDescribeGlobalTableSettingsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableName(Option(self.getGlobalTableName)) // String
        .withReplicaSettings(Option(self.getReplicaSettings).map { v =>
          import scala.collection.JavaConverters._, ReplicaSettingsDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaSettingsDescription]
    }

  }

}
