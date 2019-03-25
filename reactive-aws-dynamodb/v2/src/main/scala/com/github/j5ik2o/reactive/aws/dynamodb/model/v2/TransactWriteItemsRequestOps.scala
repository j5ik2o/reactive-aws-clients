package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItemsRequest => ScalaTransactWriteItemsRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItemsRequest => JavaTransactWriteItemsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemsRequestOps {

  implicit class ScalaTransactWriteItemsRequestOps(val self: ScalaTransactWriteItemsRequest) extends AnyVal {

    def toJava: JavaTransactWriteItemsRequest = {
      val result = JavaTransactWriteItemsRequest.builder()
      self.transactItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TransactWriteItemOps._; result.transactItems(v.map(_.toJava).asJava)
      } // Seq[TransactWriteItem]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.returnItemCollectionMetrics(v.toJava)
      } // String
      self.clientRequestToken.filter(_.nonEmpty).foreach(v => result.clientRequestToken(v)) // String

      result.build()
    }

  }

}
