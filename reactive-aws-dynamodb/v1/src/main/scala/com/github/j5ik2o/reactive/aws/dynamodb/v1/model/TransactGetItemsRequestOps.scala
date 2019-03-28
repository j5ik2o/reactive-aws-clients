// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItemsRequest => ScalaTransactGetItemsRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ TransactGetItemsRequest => JavaTransactGetItemsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemsRequestOps {

  implicit class ScalaTransactGetItemsRequestOps(val self: ScalaTransactGetItemsRequest) extends AnyVal {

    def toJava: JavaTransactGetItemsRequest = {
      val result = new JavaTransactGetItemsRequest()
      self.transactItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TransactGetItemOps._; result.withTransactItems(v.map(_.toJava).asJava)
      } // Seq[TransactGetItem]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String

      result
    }

  }

}
