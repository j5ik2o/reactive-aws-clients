// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItemsResponse => ScalaTransactGetItemsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItemsResponse => JavaTransactGetItemsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemsResponseOps {

  implicit class JavaTransactGetItemsResponseOps(val self: JavaTransactGetItemsResponse) extends AnyVal {

    def toScala: ScalaTransactGetItemsResponse = {
      ScalaTransactGetItemsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
        .withResponses(Option(self.responses).map { v =>
          import scala.collection.JavaConverters._, ItemResponseOps._; v.asScala.map(_.toScala)
        }) // Seq[ItemResponse]
    }

  }

}
