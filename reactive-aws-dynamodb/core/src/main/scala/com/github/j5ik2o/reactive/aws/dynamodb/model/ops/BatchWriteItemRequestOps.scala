// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemRequest => ScalaBatchWriteItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BatchWriteItemRequest => JavaBatchWriteItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchWriteItemRequestOps {

  implicit class ScalaBatchWriteItemRequestOps(val self: ScalaBatchWriteItemRequest) extends AnyVal {

    def toJava: JavaBatchWriteItemRequest = {
      val result = JavaBatchWriteItemRequest.builder()
      self.requestItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, WriteRequestOps._;
        result.requestItems(v.mapValues(_.map(_.toJava).asJava).asJava)
      } // Map[String, Seq[WriteRequest]]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.returnItemCollectionMetrics(v.toJava)
      } // String

      result.build()
    }

  }

}
