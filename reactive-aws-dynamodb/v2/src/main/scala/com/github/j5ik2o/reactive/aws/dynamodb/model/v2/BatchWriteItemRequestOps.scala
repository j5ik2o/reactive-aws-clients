package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemRequest => ScalaBatchWriteItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BatchWriteItemRequest => JavaBatchWriteItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchWriteItemRequestOps {

  implicit class ScalaBatchWriteItemRequestOps(val self: ScalaBatchWriteItemRequest) extends AnyVal {

    def toJava: JavaBatchWriteItemRequest = {
      val result = JavaBatchWriteItemRequest.builder()
                                            self.requestItems.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, WriteRequestOps._; result.requestItems(v.mapValues(_.map(_.toJava).asJava).asJava) } // Map[String, Seq[WriteRequest]], case Map[_, Seq[_]], Collection
                    self.returnConsumedCapacity.foreach{ v => import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava) } // String, case Other
                    self.returnItemCollectionMetrics.foreach{ v => import ReturnItemCollectionMetricsOps._; result.returnItemCollectionMetrics(v.toJava) } // String, case Other

      result.build()
    }

  }

}