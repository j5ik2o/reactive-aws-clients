package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnConsumedCapacity,
  TransactGetItemsRequest => ScalaTransactGetItemsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItemsRequest => JavaTransactGetItemsRequest }

import scala.collection.JavaConverters._

object TransactGetItemsRequestOps {

  import TransactGetItemOps._

  implicit class ScalaTransactGetItemsRequestOps(val self: ScalaTransactGetItemsRequest) extends AnyVal {

    def toJava: JavaTransactGetItemsRequest = {
      val result = JavaTransactGetItemsRequest.builder()
      self.transactItems.map(_.map(_.toJava).asJava).foreach(result.transactItems)
      self.returnConsumedCapacity.map(_.entryName).foreach(result.returnConsumedCapacity)
      result.build()
    }

  }

  implicit class JavaTransactGetItemsRequestOps(val self: JavaTransactGetItemsRequest) extends AnyVal {

    def toScala: ScalaTransactGetItemsRequest = {
      ScalaTransactGetItemsRequest()
        .withTransactItems(Option(self.transactItems).map(_.asScala.map(_.toScala)))
        .withReturnConsumedCapacity(
          Option(self.returnConsumedCapacity).map(_.toString).map(ReturnConsumedCapacity.withName)
        )
    }

  }

}
