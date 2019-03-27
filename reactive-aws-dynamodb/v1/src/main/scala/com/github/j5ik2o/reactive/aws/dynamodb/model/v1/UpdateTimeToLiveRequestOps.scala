// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTimeToLiveRequest => ScalaUpdateTimeToLiveRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateTimeToLiveRequest => JavaUpdateTimeToLiveRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTimeToLiveRequestOps {

  implicit class ScalaUpdateTimeToLiveRequestOps(val self: ScalaUpdateTimeToLiveRequest) extends AnyVal {

    def toJava: JavaUpdateTimeToLiveRequest = {
      val result = new JavaUpdateTimeToLiveRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.timeToLiveSpecification.foreach { v =>
        import TimeToLiveSpecificationOps._; result.withTimeToLiveSpecification(v.toJava)
      } // TimeToLiveSpecification

      result
    }

  }

}
