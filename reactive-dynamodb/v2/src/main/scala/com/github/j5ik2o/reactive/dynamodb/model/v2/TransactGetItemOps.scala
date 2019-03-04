package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ TransactGetItem => ScalaTransactGetItem }
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItem => JavaTransactGetItem }

object TransactGetItemOps {

  import GetOps._

  implicit class ScalaTransactGetItemOps(val self: ScalaTransactGetItem) {

    def toJava: JavaTransactGetItem = {
      val result = JavaTransactGetItem.builder()
      self.get.map(_.toJava).foreach(result.get)
      result.build()
    }
  }

  implicit class JavaTransactGetItemOps(val self: JavaTransactGetItem) {

    def toScala: ScalaTransactGetItem = {
      ScalaTransactGetItem()
        .withGet(Option(self.get).map(_.toScala))
    }

  }

}
