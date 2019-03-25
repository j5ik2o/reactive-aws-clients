package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveDescription => ScalaTimeToLiveDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TimeToLiveDescription => JavaTimeToLiveDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TimeToLiveDescriptionOps {

  implicit class ScalaTimeToLiveDescriptionOps(val self: ScalaTimeToLiveDescription) extends AnyVal {

    def toJava: JavaTimeToLiveDescription = {
      val result = JavaTimeToLiveDescription.builder()
      self.timeToLiveStatus.foreach { v =>
        import TimeToLiveStatusOps._; result.timeToLiveStatus(v.toJava)
      } // String
      self.attributeName.filter(_.nonEmpty).foreach(v => result.attributeName(v)) // String, case String

      result.build()
    }

  }

  implicit class JavaTimeToLiveDescriptionOps(val self: JavaTimeToLiveDescription) extends AnyVal {

    def toScala: ScalaTimeToLiveDescription = {
      ScalaTimeToLiveDescription()
        .withTimeToLiveStatus(Option(self.timeToLiveStatus).map { v =>
          import TimeToLiveStatusOps._; v.toScala
        }) // String
        .withAttributeName(Option(self.attributeName)) // String
    }

  }

}
