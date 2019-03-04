package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ReturnConsumedCapacity,
  ReturnItemCollectionMetrics,
  TransactWriteItemsRequest => ScalaTransactWriteItemsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItemsRequest => JavaTransactWriteItemsRequest }

import scala.collection.JavaConverters._

object TransactWriteItemsRequestOps {

  import TransactWriteItemOps._

  implicit class ScalaTransactWriteItemsRequestOps(val self: ScalaTransactWriteItemsRequest) extends AnyVal {

    def toJava: JavaTransactWriteItemsRequest = {
      val result = JavaTransactWriteItemsRequest.builder()
      self.transactItems.map(_.map(_.toJava).asJava).foreach(result.transactItems)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      self.returnItemCollectionMetrics.map(_.entryName).foreach(result.returnItemCollectionMetrics)
      self.clientRequestToken.foreach(result.clientRequestToken)
      result.build()
    }

  }

  implicit class JavaTransactWriteItemsRequestOps(val self: JavaTransactWriteItemsRequest) extends AnyVal {

    def toScala: ScalaTransactWriteItemsRequest = {
      ScalaTransactWriteItemsRequest()
        .withTransactItems(Option(self.transactItems).map(_.asScala.map(_.toScala)))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
        .withReturnItemCollectionMetrics(
          Option(self.returnItemCollectionMetrics).map(_.toString).map(ReturnItemCollectionMetrics.withName)
        )
        .withClientRequestToken(Option(self.clientRequestToken))
    }

  }

}
