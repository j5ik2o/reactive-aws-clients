// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveRequest => ScalaUpdateTimeToLiveRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTimeToLiveRequest => JavaUpdateTimeToLiveRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTimeToLiveRequestOps {

  implicit class ScalaUpdateTimeToLiveRequestOps(val self: ScalaUpdateTimeToLiveRequest) extends AnyVal {

    def toJava: JavaUpdateTimeToLiveRequest = {
      val result = JavaUpdateTimeToLiveRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String
      self.timeToLiveSpecification.foreach { v =>
        import TimeToLiveSpecificationOps._; result.timeToLiveSpecification(v.toJava)
      } // TimeToLiveSpecification

      result.build()
    }

  }

}
