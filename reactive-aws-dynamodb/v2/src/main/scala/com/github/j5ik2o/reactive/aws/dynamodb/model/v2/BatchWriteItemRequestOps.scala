package com.github.j5ik2o.reactive.aws.dynamodb.model.v2
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemRequest => ScalaBatchWriteItemRequest }
import software.amazon.awssdk.services.dynamodb.model.{ BatchWriteItemRequest => JavaBatchWriteItemRequest }

import scala.collection.JavaConverters._

object BatchWriteItemRequestOps {
  import WriteRequestOps._
  implicit class ScalaBatchWriteItemRequestOps(val self: ScalaBatchWriteItemRequest) extends AnyVal {

    def toJava: JavaBatchWriteItemRequest = {
      val result = JavaBatchWriteItemRequest.builder()
      self.requestItems.foreach(v => result.requestItems(v.mapValues(_.map(_.toJava).asJava).asJava))
      self.returnConsumedCapacity.foreach(result.returnConsumedCapacity)
      result.build()
    }

  }

}
