// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItem => ScalaTransactGetItem, _ }
import com.amazonaws.services.dynamodbv2.model.{ TransactGetItem => JavaTransactGetItem }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemOps {

  implicit class ScalaTransactGetItemOps(val self: ScalaTransactGetItem) extends AnyVal {

    def toJava: JavaTransactGetItem = {
      val result = new JavaTransactGetItem()
      self.get.foreach { v =>
        import GetOps._; result.withGet(v.toJava)
      } // Get

      result
    }

  }

  implicit class JavaTransactGetItemOps(val self: JavaTransactGetItem) extends AnyVal {

    def toScala: ScalaTransactGetItem = {
      ScalaTransactGetItem()
        .withGet(Option(self.getGet).map { v =>
          import GetOps._; v.toScala
        }) // Get
    }

  }

}
