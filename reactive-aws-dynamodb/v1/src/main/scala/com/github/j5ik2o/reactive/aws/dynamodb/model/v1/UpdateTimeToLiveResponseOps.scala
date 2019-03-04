package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateTimeToLiveResult => JavaUpdateTimeToLiveResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveResponse => ScalaUpdateTimeToLiveResponse }

import scala.collection.JavaConverters._

object UpdateTimeToLiveResponseOps {

  import TimeToLiveSpecificationOps._

  implicit class JavaUpdateTimeToLiveResponseOps(val self: JavaUpdateTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaUpdateTimeToLiveResponse = {
      ScalaUpdateTimeToLiveResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTimeToLiveSpecification(
          Option(self.getTimeToLiveSpecification).map(_.toScala)
        )
    }

  }

}
