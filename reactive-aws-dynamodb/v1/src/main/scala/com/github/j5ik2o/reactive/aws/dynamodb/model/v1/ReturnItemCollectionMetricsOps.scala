// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnItemCollectionMetrics => ScalaReturnItemCollectionMetrics,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ ReturnItemCollectionMetrics => JavaReturnItemCollectionMetrics }

object ReturnItemCollectionMetricsOps {

  implicit class ScalaReturnItemCollectionMetricsOps(val self: ScalaReturnItemCollectionMetrics) extends AnyVal {

    def toJava: JavaReturnItemCollectionMetrics = {
      JavaReturnItemCollectionMetrics.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnItemCollectionMetricsOps(val self: String) extends AnyVal {

    def toScala: ScalaReturnItemCollectionMetrics = {
      ScalaReturnItemCollectionMetrics.withName(self)
    }

  }

}
