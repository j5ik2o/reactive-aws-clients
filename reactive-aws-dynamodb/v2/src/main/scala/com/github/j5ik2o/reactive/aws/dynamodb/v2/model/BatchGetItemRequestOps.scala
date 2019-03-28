// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest => ScalaBatchGetItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemRequest => JavaBatchGetItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchGetItemRequestOps {

  implicit class ScalaBatchGetItemRequestOps(val self: ScalaBatchGetItemRequest) extends AnyVal {

    def toJava: JavaBatchGetItemRequest = {
      val result = JavaBatchGetItemRequest.builder()
      self.requestItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeysAndAttributesOps._;
        result.requestItems(v.mapValues(_.toJava).asJava)
      } // Map[String, KeysAndAttributes]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String

      result.build()
    }

  }

}
