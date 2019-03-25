package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableSettingsResponse => ScalaUpdateGlobalTableSettingsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableSettingsResponse => JavaUpdateGlobalTableSettingsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableSettingsResponseOps {

  implicit class JavaUpdateGlobalTableSettingsResponseOps(val self: JavaUpdateGlobalTableSettingsResponse) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsResponse = {
      ScalaUpdateGlobalTableSettingsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
            .withGlobalTableName(Option(self.globalTableName)) // String
                    .withReplicaSettings(Option(self.replicaSettings).map{ v => import scala.collection.JavaConverters._, ReplicaSettingsDescriptionOps._; v.asScala.map(_.toScala)}) // Seq[ReplicaSettingsDescription], Seq-6
    }

  }

}