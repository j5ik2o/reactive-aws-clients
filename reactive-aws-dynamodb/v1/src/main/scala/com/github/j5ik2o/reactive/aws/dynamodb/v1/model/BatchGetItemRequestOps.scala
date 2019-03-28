// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest => ScalaBatchGetItemRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ BatchGetItemRequest => JavaBatchGetItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchGetItemRequestOps {

  implicit class ScalaBatchGetItemRequestOps(val self: ScalaBatchGetItemRequest) extends AnyVal {

    def toJava: JavaBatchGetItemRequest = {
      val result = new JavaBatchGetItemRequest()
      self.requestItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeysAndAttributesOps._;
        result.withRequestItems(v.mapValues(_.toJava).asJava)
      } // Map[String, KeysAndAttributes]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String

      result
    }

  }

}
