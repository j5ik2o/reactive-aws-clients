// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeContinuousBackupsResponse => ScalaDescribeContinuousBackupsResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  DescribeContinuousBackupsResult => JavaDescribeContinuousBackupsResponse
}

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeContinuousBackupsResponseOps {

  implicit class JavaDescribeContinuousBackupsResponseOps(val self: JavaDescribeContinuousBackupsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsResponse = {
      ScalaDescribeContinuousBackupsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withContinuousBackupsDescription(Option(self.getContinuousBackupsDescription).map { v =>
          import ContinuousBackupsDescriptionOps._; v.toScala
        }) // ContinuousBackupsDescription
    }

  }

}
