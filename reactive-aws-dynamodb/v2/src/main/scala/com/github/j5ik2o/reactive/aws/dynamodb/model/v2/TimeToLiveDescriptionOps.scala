package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  TimeToLiveStatus,
  TimeToLiveDescription => ScalaTimeToLiveDescription
}
import software.amazon.awssdk.services.dynamodb.model.{ TimeToLiveDescription => JavaTimeToLiveDescription }

object TimeToLiveDescriptionOps {

  implicit class ScalaTimeToLiveDescriptionOps(val self: ScalaTimeToLiveDescription) extends AnyVal {

    def toJava: JavaTimeToLiveDescription = {
      val result = JavaTimeToLiveDescription.builder()
      self.attributeName.foreach(result.attributeName)
      self.timeToLiveStatus.map(_.entryName).foreach(result.timeToLiveStatus)
      result.build()
    }

  }

  implicit class JavaTimeToLiveDescriptionOps(val self: JavaTimeToLiveDescription) extends AnyVal {

    def toScala: ScalaTimeToLiveDescription = {
      ScalaTimeToLiveDescription()
        .withAttributeName(Option(self.attributeName)).withTimeToLiveStatus(
          Option(self.timeToLiveStatus).map(_.toString).map(TimeToLiveStatus.withName)
        )
    }

  }

}
