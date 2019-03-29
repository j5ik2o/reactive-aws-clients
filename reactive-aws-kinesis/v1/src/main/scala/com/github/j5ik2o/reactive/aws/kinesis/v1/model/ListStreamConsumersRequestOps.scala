// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersRequest => ScalaListStreamConsumersRequest, _ }
import com.amazonaws.services.kinesis.model.{ ListStreamConsumersRequest => JavaListStreamConsumersRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamConsumersRequestOps {

  implicit class ScalaListStreamConsumersRequestOps(val self: ScalaListStreamConsumersRequest) extends AnyVal {

    def toJava: JavaListStreamConsumersRequest = {
      val result = new JavaListStreamConsumersRequest()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v)) // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.withNextToken(v)) // String
      self.maxResults.map(_.intValue).foreach(v => result.withMaxResults(v))  // Int
      self.streamCreationTimestamp
        .map(java.util.Date.from).foreach(v => result.withStreamCreationTimestamp(v)) // Instant

      result
    }

  }

}
