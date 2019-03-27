// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItem => ScalaTransactGetItem, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItem => JavaTransactGetItem }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemOps {

  implicit class ScalaTransactGetItemOps(val self: ScalaTransactGetItem) extends AnyVal {

    def toJava: JavaTransactGetItem = {
      val result = JavaTransactGetItem.builder()
      self.get.foreach { v =>
        import GetOps._; result.get(v.toJava)
      } // Get

      result.build()
    }

  }

  implicit class JavaTransactGetItemOps(val self: JavaTransactGetItem) extends AnyVal {

    def toScala: ScalaTransactGetItem = {
      ScalaTransactGetItem()
        .withGet(Option(self.get).map { v =>
          import GetOps._; v.toScala
        }) // Get
    }

  }

}
