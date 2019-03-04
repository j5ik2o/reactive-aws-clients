package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactGetItemsRequest => JavaTransactGetItemsRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ReturnConsumedCapacity,
  TransactGetItemsRequest => ScalaTransactGetItemsRequest
}

import scala.collection.JavaConverters._

object TransactGetItemsRequestOps {

  import TransactGetItemOps._

  implicit class ScalaTransactGetItemsRequestOps(val self: ScalaTransactGetItemsRequest) extends AnyVal {

    def toJava: JavaTransactGetItemsRequest = {
      val result = new JavaTransactGetItemsRequest()
      self.transactItems.map(_.map(_.toJava).asJava).foreach(result.setTransactItems)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.setReturnConsumedCapacity)
      result
    }

  }

  implicit class JavaTransactGetItemsRequestOps(val self: JavaTransactGetItemsRequest) extends AnyVal {

    def toScala: ScalaTransactGetItemsRequest = {
      ScalaTransactGetItemsRequest()
        .withTransactItems(Option(self.getTransactItems).map(_.asScala.map(_.toScala)))
        .withReturnConsumedCapacity(
          Option(self.getReturnConsumedCapacity).map(ReturnConsumedCapacity.withName)
        )
    }

  }

}
