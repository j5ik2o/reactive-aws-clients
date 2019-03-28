// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveResponse => ScalaUpdateTimeToLiveResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateTimeToLiveResult => JavaUpdateTimeToLiveResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTimeToLiveResponseOps {

  implicit class JavaUpdateTimeToLiveResponseOps(val self: JavaUpdateTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaUpdateTimeToLiveResponse = {
      ScalaUpdateTimeToLiveResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTimeToLiveSpecification(Option(self.getTimeToLiveSpecification).map { v =>
          import TimeToLiveSpecificationOps._; v.toScala
        }) // TimeToLiveSpecification
    }

  }

}
