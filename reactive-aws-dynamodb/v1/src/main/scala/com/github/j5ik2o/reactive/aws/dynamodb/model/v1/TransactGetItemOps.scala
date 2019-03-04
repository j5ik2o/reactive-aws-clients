package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactGetItem => JavaTransactGetItem }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItem => ScalaTransactGetItem }

object TransactGetItemOps {

  import GetOps._

  implicit class ScalaTransactGetItemOps(val self: ScalaTransactGetItem) {

    def toJava: JavaTransactGetItem = {
      val result = new JavaTransactGetItem()
      self.get.map(_.toJava).foreach(result.setGet)
      result
    }
  }

  implicit class JavaTransactGetItemOps(val self: JavaTransactGetItem) {

    def toScala: ScalaTransactGetItem = {
      ScalaTransactGetItem()
        .withGet(Option(self.getGet).map(_.toScala))
    }

  }

}
