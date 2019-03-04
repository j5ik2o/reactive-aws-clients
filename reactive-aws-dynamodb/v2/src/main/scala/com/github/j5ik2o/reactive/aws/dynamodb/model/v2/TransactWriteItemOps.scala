package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItem => ScalaTransactWriteItem }
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItem => JavaTransactWriteItem }

object TransactWriteItemOps {

  import ConditionCheckOps._
  import DeleteOps._
  import PutOps._
  import UpdateOps._

  implicit class ScalaTransactWriteItemOps(val self: ScalaTransactWriteItem) extends AnyVal {

    def toJava: JavaTransactWriteItem = {
      val result = JavaTransactWriteItem.builder()
      self.conditionCheck.map(_.toJava).foreach(result.conditionCheck)
      self.put.map(_.toJava).foreach(result.put)
      self.delete.map(_.toJava).foreach(result.delete)
      self.update.map(_.toJava).foreach(result.update)
      result.build()
    }

  }

  implicit class JavaTransactWriteItemOps(val self: JavaTransactWriteItem) extends AnyVal {

    def toScala: ScalaTransactWriteItem = {
      ScalaTransactWriteItem()
        .withConditionCheck(Option(self.conditionCheck).map(_.toScala))
        .withPut(Option(self.put).map(_.toScala))
        .withDelete(Option(self.delete).map(_.toScala))
        .withUpdate(Option(self.update).map(_.toScala))
    }

  }

}
