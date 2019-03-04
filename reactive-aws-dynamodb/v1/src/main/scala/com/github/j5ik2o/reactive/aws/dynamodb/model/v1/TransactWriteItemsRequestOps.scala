package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItemsRequest => JavaTransactWriteItemsRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnConsumedCapacity,
  ReturnItemCollectionMetrics,
  TransactWriteItemsRequest => ScalaTransactWriteItemsRequest
}

import scala.collection.JavaConverters._

object TransactWriteItemsRequestOps {

  import TransactWriteItemOps._

  implicit class ScalaTransactWriteItemsRequestOps(val self: ScalaTransactWriteItemsRequest) extends AnyVal {

    def toJava: JavaTransactWriteItemsRequest = {
      val result = new JavaTransactWriteItemsRequest()
      self.transactItems.map(_.map(_.toJava).asJava).foreach(result.setTransactItems)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      self.returnItemCollectionMetrics.map(_.entryName).foreach(result.setReturnItemCollectionMetrics)
      self.clientRequestToken.foreach(result.setClientRequestToken)
      result
    }

  }

  implicit class JavaTransactWriteItemsRequestOps(val self: JavaTransactWriteItemsRequest) extends AnyVal {

    def toScala: ScalaTransactWriteItemsRequest = {
      ScalaTransactWriteItemsRequest()
        .withTransactItems(Option(self.getTransactItems).map(_.asScala.map(_.toScala)))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName))
        .withReturnItemCollectionMetrics(
          Option(self.getReturnItemCollectionMetrics).map(ReturnItemCollectionMetrics.withName)
        )
        .withClientRequestToken(Option(self.getClientRequestToken))
    }

  }

}
