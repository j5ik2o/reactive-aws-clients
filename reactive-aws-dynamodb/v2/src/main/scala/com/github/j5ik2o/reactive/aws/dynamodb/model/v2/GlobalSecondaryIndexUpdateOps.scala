package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexUpdateOps {

  implicit class ScalaGlobalSecondaryIndexUpdateOps(val self: ScalaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexUpdate = {
      val result = JavaGlobalSecondaryIndexUpdate.builder()
      self.update.foreach { v =>
        result.update(v.toJava)
      } // UpdateGlobalSecondaryIndexAction, case Other
      self.create.foreach { v =>
        import CreateGlobalSecondaryIndexActionOps._; result.create(v.toJava)
      } // CreateGlobalSecondaryIndexAction, case Other
      self.delete.foreach { v =>
        import DeleteGlobalSecondaryIndexActionOps._; result.delete(v.toJava)
      } // DeleteGlobalSecondaryIndexAction, case Other

      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexUpdateOps(val self: JavaGlobalSecondaryIndexUpdate) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexUpdate = {
      ScalaGlobalSecondaryIndexUpdate()
        .withUpdate(Option(self.update).map { v =>
          v.toScala
        }) // UpdateGlobalSecondaryIndexAction, Map-12
        .withCreate(Option(self.create).map { v =>
          import CreateGlobalSecondaryIndexActionOps._; v.toScala
        }) // CreateGlobalSecondaryIndexAction, Map-12
        .withDelete(Option(self.delete).map { v =>
          import DeleteGlobalSecondaryIndexActionOps._; v.toScala
        }) // DeleteGlobalSecondaryIndexAction, Map-12
    }

  }

}
