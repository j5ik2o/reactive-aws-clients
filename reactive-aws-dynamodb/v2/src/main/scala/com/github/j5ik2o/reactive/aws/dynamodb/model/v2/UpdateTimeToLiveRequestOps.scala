package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveRequest => ScalaUpdateTimeToLiveRequest }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTimeToLiveRequest => JavaUpdateTimeToLiveRequest }

object UpdateTimeToLiveRequestOps {

  import TimeToLiveSpecificationOps._

  implicit class ScalaUpdateTimeToLiveRequestOps(val self: ScalaUpdateTimeToLiveRequest) extends AnyVal {

    def toJava: JavaUpdateTimeToLiveRequest = {
      val result = JavaUpdateTimeToLiveRequest.builder()
      self.tableName.foreach(result.tableName)
      self.timeToLiveSpecification.map(_.toJava).foreach(result.timeToLiveSpecification)
      result.build()
    }

  }

  implicit class JavaUpdateTimeToLiveRequestOps(val self: JavaUpdateTimeToLiveRequest) extends AnyVal {

    def toScala: ScalaUpdateTimeToLiveRequest = {
      ScalaUpdateTimeToLiveRequest()
        .withTableName(Option(self.tableName))
        .withTimeToLiveSpecification(Option(self.timeToLiveSpecification).map(_.toScala))
    }

  }

}
