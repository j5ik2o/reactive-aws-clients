// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveDescription => ScalaTimeToLiveDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ TimeToLiveDescription => JavaTimeToLiveDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TimeToLiveDescriptionOps {

  implicit class ScalaTimeToLiveDescriptionOps(val self: ScalaTimeToLiveDescription) extends AnyVal {

    def toJava: JavaTimeToLiveDescription = {
      val result = new JavaTimeToLiveDescription()
      self.timeToLiveStatus.foreach { v =>
        import TimeToLiveStatusOps._; result.withTimeToLiveStatus(v.toJava)
      } // String
      self.attributeName.filter(_.nonEmpty).foreach(v => result.withAttributeName(v)) // String

      result
    }

  }

  implicit class JavaTimeToLiveDescriptionOps(val self: JavaTimeToLiveDescription) extends AnyVal {

    def toScala: ScalaTimeToLiveDescription = {
      ScalaTimeToLiveDescription()
        .withTimeToLiveStatus(Option(self.getTimeToLiveStatus).map { v =>
          import TimeToLiveStatusOps._; v.toScala
        }) // String
        .withAttributeName(Option(self.getAttributeName)) // String
    }

  }

}
