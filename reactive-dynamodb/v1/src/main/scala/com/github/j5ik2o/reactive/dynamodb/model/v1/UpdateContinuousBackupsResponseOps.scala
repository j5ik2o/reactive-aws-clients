package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateContinuousBackupsResult => JavaUpdateContinuousBackupsResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{
  UpdateContinuousBackupsResponse => ScalaUpdateContinuousBackupsResponse
}
import scala.collection.JavaConverters._

object UpdateContinuousBackupsResponseOps {

  import ContinuousBackupsDescriptionOps._

  implicit class JavaUpdateContinuousBackupsResponseOps(val self: JavaUpdateContinuousBackupsResponse) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsResponse = {
      ScalaUpdateContinuousBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withContinuousBackupsDescription(Option(self.getContinuousBackupsDescription).map(_.toScala))
    }

  }

}
