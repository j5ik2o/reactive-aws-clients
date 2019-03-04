package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate }

object GlobalSecondaryIndexUpdateOps {

  import CreateGlobalSecondaryIndexActionOps._
  import DeleteGlobalSecondaryIndexActionOps._
  import UpdateGlobalSecondaryIndexActionOps._

  implicit class ScalaGlobalSecondaryIndexUpdateOps(val self: ScalaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexUpdate = {
      val result = JavaGlobalSecondaryIndexUpdate.builder()
      self.update.map(_.toJava).foreach(result.update)
      self.create.map(_.toJava).foreach(result.create)
      self.delete.map(_.toJava).foreach(result.delete)
      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexUpdateOps(val self: JavaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexUpdate = {
      ScalaGlobalSecondaryIndexUpdate()
        .withUpdate(Option(self.update).map(_.toScala))
        .withCreate(Option(self.create).map(_.toScala))
        .withDelete(Option(self.delete).map(_.toScala))
    }

  }

}
