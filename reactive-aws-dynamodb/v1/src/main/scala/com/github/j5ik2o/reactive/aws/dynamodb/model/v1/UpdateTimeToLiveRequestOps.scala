package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ UpdateTimeToLiveRequest => JavaUpdateTimeToLiveRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveRequest => ScalaUpdateTimeToLiveRequest }

object UpdateTimeToLiveRequestOps {

  import TimeToLiveSpecificationOps._

  implicit class ScalaUpdateTimeToLiveRequestOps(val self: ScalaUpdateTimeToLiveRequest) extends AnyVal {

    def toJava: JavaUpdateTimeToLiveRequest = {
      val result = new JavaUpdateTimeToLiveRequest()
      self.tableName.foreach(result.setTableName)
      self.timeToLiveSpecification.map(_.toJava).foreach(result.setTimeToLiveSpecification)
      result
    }

  }

  implicit class JavaUpdateTimeToLiveRequestOps(val self: JavaUpdateTimeToLiveRequest) extends AnyVal {

    def toScala: ScalaUpdateTimeToLiveRequest = {
      ScalaUpdateTimeToLiveRequest()
        .withTableName(Option(self.getTableName))
        .withTimeToLiveSpecification(Option(self.getTimeToLiveSpecification).map(_.toScala))
    }

  }

}
