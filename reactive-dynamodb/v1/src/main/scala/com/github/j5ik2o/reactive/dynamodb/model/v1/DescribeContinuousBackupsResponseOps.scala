package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  DescribeContinuousBackupsResult => JavaDescribeContinuousBackupsResponse
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  DescribeContinuousBackupsResponse => ScalaDescribeContinuousBackupsResponse
}

import scala.collection.JavaConverters._

object DescribeContinuousBackupsResponseOps {

  import ContinuousBackupsDescriptionOps._

  implicit class JavaDescribeContinuousBackupsResponseOps(val self: JavaDescribeContinuousBackupsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsResponse = {
      ScalaDescribeContinuousBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withContinuousBackupsDescription(
          Option(self.getContinuousBackupsDescription).map(_.toScala)
        )
    }

  }

}
