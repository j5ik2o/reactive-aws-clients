package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItemsRequest => ScalaTransactGetItemsRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItemsRequest => JavaTransactGetItemsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemsRequestOps {

  implicit class ScalaTransactGetItemsRequestOps(val self: ScalaTransactGetItemsRequest) extends AnyVal {

    def toJava: JavaTransactGetItemsRequest = {
      val result = JavaTransactGetItemsRequest.builder()
      self.transactItems.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TransactGetItemOps._; result.transactItems(v.map(_.toJava).asJava)
      } // Seq[TransactGetItem]
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String

      result.build()
    }

  }

}
