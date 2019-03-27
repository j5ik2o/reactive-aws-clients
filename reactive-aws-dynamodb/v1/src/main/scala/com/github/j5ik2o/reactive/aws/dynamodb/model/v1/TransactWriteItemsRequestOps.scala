// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItemsRequest => ScalaTransactWriteItemsRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItemsRequest => JavaTransactWriteItemsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemsRequestOps {

  implicit class ScalaTransactWriteItemsRequestOps(val self: ScalaTransactWriteItemsRequest) extends AnyVal {

    def toJava: JavaTransactWriteItemsRequest = {
      val result = new JavaTransactWriteItemsRequest()
      self.transactItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TransactWriteItemOps._;
        result.withTransactItems(v.map(_.toJava).asJava)
      } // Seq[TransactWriteItem]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.withReturnItemCollectionMetrics(v.toJava)
      } // String
      self.clientRequestToken.filter(_.nonEmpty).foreach(v => result.withClientRequestToken(v)) // String

      result
    }

  }

}
