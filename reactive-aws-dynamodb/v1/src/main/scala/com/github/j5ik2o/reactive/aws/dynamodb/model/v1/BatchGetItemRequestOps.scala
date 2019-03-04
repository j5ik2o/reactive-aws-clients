package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ BatchGetItemRequest => JavaBatchGetItemRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest => ScalaBatchGetItemRequest }

import scala.collection.JavaConverters._

object BatchGetItemRequestOps {

  import KeysAndAttributesOps._

  implicit class ScalaBatchGetItemRequestOps(val self: ScalaBatchGetItemRequest) extends AnyVal {

    def toJava: JavaBatchGetItemRequest = {
      val result = new JavaBatchGetItemRequest()
      self.requestItems.foreach(v => result.setRequestItems(v.mapValues(_.toJava).asJava))
      self.returnConsumedCapacity.foreach(result.setReturnConsumedCapacity)
      result
    }

  }

  implicit class JavaBatchGetItemRequestOps(val self: JavaBatchGetItemRequest) extends AnyVal {

    def toScala: ScalaBatchGetItemRequest = {
      ScalaBatchGetItemRequest()
        .withRequestItems(
          Option(self.getRequestItems).map(_.asScala.toMap.mapValues(_.toScala))
        ).withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity))
    }

  }

}
