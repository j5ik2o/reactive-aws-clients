package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate }
import com.github.j5ik2o.reactive.dynamodb.model.{ GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate }

object GlobalSecondaryIndexUpdateOps {

  import CreateGlobalSecondaryIndexActionOps._
  import DeleteGlobalSecondaryIndexActionOps._
  import UpdateGlobalSecondaryIndexActionOps._

  implicit class ScalaGlobalSecondaryIndexUpdateOps(val self: ScalaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexUpdate = {
      val result = new JavaGlobalSecondaryIndexUpdate()
      self.update.map(_.toJava).foreach(result.setUpdate)
      self.create.map(_.toJava).foreach(result.setCreate)
      self.delete.map(_.toJava).foreach(result.setDelete)
      result
    }

  }

  implicit class JavaGlobalSecondaryIndexUpdateOps(val self: JavaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexUpdate = {
      ScalaGlobalSecondaryIndexUpdate()
        .withUpdate(Option(self.getUpdate).map(_.toScala))
        .withCreate(Option(self.getCreate).map(_.toScala))
        .withDelete(Option(self.getDelete).map(_.toScala))
    }

  }

}
