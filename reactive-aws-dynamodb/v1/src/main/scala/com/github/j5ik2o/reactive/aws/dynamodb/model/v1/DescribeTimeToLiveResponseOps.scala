package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeTimeToLiveResult => JavaDescribeTimeToLiveResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTimeToLiveResponse => ScalaDescribeTimeToLiveResponse }

import scala.collection.JavaConverters._

object DescribeTimeToLiveResponseOps {

  import TimeToLiveDescriptionOps._

  implicit class JavaDescribeTimeToLiveResponseOps(val self: JavaDescribeTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaDescribeTimeToLiveResponse = {
      ScalaDescribeTimeToLiveResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTimeToLiveDescription(Option(self.getTimeToLiveDescription).map(_.toScala))
    }

  }

}
