// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateContinuousBackupsResponse => ScalaUpdateContinuousBackupsResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ UpdateContinuousBackupsResult => JavaUpdateContinuousBackupsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateContinuousBackupsResponseOps {

  implicit class JavaUpdateContinuousBackupsResponseOps(val self: JavaUpdateContinuousBackupsResponse) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsResponse = {
      ScalaUpdateContinuousBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withContinuousBackupsDescription(Option(self.getContinuousBackupsDescription).map { v =>
          import ContinuousBackupsDescriptionOps._; v.toScala
        }) // ContinuousBackupsDescription
    }

  }

}
