package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ BatchGetItemRequest => ScalaBatchGetItemRequest }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemRequest => JavaBatchGetItemRequest }

import scala.collection.JavaConverters._

object BatchGetItemRequestOps {
  import com.github.j5ik2o.reactive.dynamodb.model.v2.KeysAndAttributesOps._

  implicit class ScalaBatchGetItemRequestOps(val self: ScalaBatchGetItemRequest) extends AnyVal {

    def toJava: JavaBatchGetItemRequest = {
      val result = JavaBatchGetItemRequest.builder()
      self.requestItems.foreach(v => result.requestItems(v.mapValues(_.toJava).asJava))
      self.returnConsumedCapacity.foreach(result.returnConsumedCapacity)
      result.build()
    }

  }

}
