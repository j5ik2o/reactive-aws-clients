// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexUpdateOps {

  implicit class ScalaGlobalSecondaryIndexUpdateOps(val self: ScalaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexUpdate = {
      val result = new JavaGlobalSecondaryIndexUpdate()
      self.update.foreach { v =>
        import UpdateGlobalSecondaryIndexActionOps._; result.withUpdate(v.toJava)
      } // UpdateGlobalSecondaryIndexAction
      self.create.foreach { v =>
        import CreateGlobalSecondaryIndexActionOps._; result.withCreate(v.toJava)
      } // CreateGlobalSecondaryIndexAction
      self.delete.foreach { v =>
        import DeleteGlobalSecondaryIndexActionOps._; result.withDelete(v.toJava)
      } // DeleteGlobalSecondaryIndexAction

      result
    }

  }

  implicit class JavaGlobalSecondaryIndexUpdateOps(val self: JavaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexUpdate = {
      ScalaGlobalSecondaryIndexUpdate()
        .withUpdate(Option(self.getUpdate).map { v =>
          import UpdateGlobalSecondaryIndexActionOps._; v.toScala
        }) // UpdateGlobalSecondaryIndexAction
        .withCreate(Option(self.getCreate).map { v =>
          import CreateGlobalSecondaryIndexActionOps._; v.toScala
        }) // CreateGlobalSecondaryIndexAction
        .withDelete(Option(self.getDelete).map { v =>
          import DeleteGlobalSecondaryIndexActionOps._; v.toScala
        }) // DeleteGlobalSecondaryIndexAction
    }

  }

}
