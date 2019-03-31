// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnItemCollectionMetrics => ScalaReturnItemCollectionMetrics,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ ReturnItemCollectionMetrics => JavaReturnItemCollectionMetrics }

object ReturnItemCollectionMetricsOps {

  implicit class ScalaReturnItemCollectionMetricsOps(val self: ScalaReturnItemCollectionMetrics) extends AnyVal {

    def toJava: JavaReturnItemCollectionMetrics = {
      JavaReturnItemCollectionMetrics.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnItemCollectionMetricsOps(val self: JavaReturnItemCollectionMetrics) extends AnyVal {

    def toScala: ScalaReturnItemCollectionMetrics = {
      ScalaReturnItemCollectionMetrics.withName(self.toString)
    }

  }

}
