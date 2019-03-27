// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemRequest => ScalaBatchWriteItemRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ BatchWriteItemRequest => JavaBatchWriteItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchWriteItemRequestOps {

  implicit class ScalaBatchWriteItemRequestOps(val self: ScalaBatchWriteItemRequest) extends AnyVal {

    def toJava: JavaBatchWriteItemRequest = {
      val result = new JavaBatchWriteItemRequest()
      self.requestItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, WriteRequestOps._;
        result.withRequestItems(v.mapValues(_.map(_.toJava).asJava).asJava)
      } // Map[String, Seq[WriteRequest]]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.withReturnItemCollectionMetrics(v.toJava)
      } // String

      result
    }

  }

}
