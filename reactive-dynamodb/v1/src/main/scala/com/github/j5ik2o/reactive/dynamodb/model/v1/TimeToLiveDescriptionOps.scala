package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TimeToLiveDescription => JavaTimeToLiveDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{
  TimeToLiveStatus,
  TimeToLiveDescription => ScalaTimeToLiveDescription
}
object TimeToLiveDescriptionOps {

  implicit class ScalaTimeToLiveDescriptionOps(val self: ScalaTimeToLiveDescription) extends AnyVal {

    def toJava: JavaTimeToLiveDescription = {
      val result = new JavaTimeToLiveDescription()
      self.attributeName.foreach(result.setAttributeName)
      self.timeToLiveStatus.map(_.entryName).foreach(result.setTimeToLiveStatus)
      result
    }

  }

  implicit class JavaTimeToLiveDescriptionOps(val self: JavaTimeToLiveDescription) extends AnyVal {

    def toScala: ScalaTimeToLiveDescription = {
      ScalaTimeToLiveDescription()
        .withAttributeName(Option(self.getAttributeName)).withTimeToLiveStatus(
          Option(self.getTimeToLiveStatus).map(TimeToLiveStatus.withName)
        )
    }

  }

}
