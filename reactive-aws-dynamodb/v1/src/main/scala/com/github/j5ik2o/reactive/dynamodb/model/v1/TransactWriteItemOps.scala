package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItem => JavaTransactWriteItem }
import com.github.j5ik2o.reactive.dynamodb.model.{ TransactWriteItem => ScalaTransactWriteItem }

object TransactWriteItemOps {

  import ConditionCheckOps._
  import PutOps._
  import DeleteOps._
  import UpdateOps._

  implicit class ScalaTransactWriteItemOps(val self: ScalaTransactWriteItem) extends AnyVal {

    def toJava: JavaTransactWriteItem = {
      val result = new JavaTransactWriteItem()
      self.conditionCheck.map(_.toJava).foreach(result.setConditionCheck)
      self.put.map(_.toJava).foreach(result.setPut)
      self.delete.map(_.toJava).foreach(result.setDelete)
      self.update.map(_.toJava).foreach(result.setUpdate)
      result
    }

  }

  implicit class JavaTransactWriteItemOps(val self: JavaTransactWriteItem) extends AnyVal {

    def toScala: ScalaTransactWriteItem = {
      ScalaTransactWriteItem()
        .withConditionCheck(Option(self.getConditionCheck).map(_.toScala))
        .withPut(Option(self.getPut).map(_.toScala))
        .withDelete(Option(self.getDelete).map(_.toScala))
        .withUpdate(Option(self.getUpdate).map(_.toScala))
    }

  }

}
