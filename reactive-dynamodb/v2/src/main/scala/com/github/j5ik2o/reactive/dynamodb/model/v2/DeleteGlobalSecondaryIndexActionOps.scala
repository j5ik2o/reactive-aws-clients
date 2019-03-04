package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction
}
import software.amazon.awssdk.services.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction
}

object DeleteGlobalSecondaryIndexActionOps {

  implicit class ScalaDeleteGlobalSecondaryIndexActionOps(val self: ScalaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaDeleteGlobalSecondaryIndexAction = {
      val result = JavaDeleteGlobalSecondaryIndexAction.builder()
      self.indexName.foreach(result.indexName)
      result.build()
    }

  }

  implicit class JavaDeleteGlobalSecondaryIndexActionOps(val self: JavaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaDeleteGlobalSecondaryIndexAction = {
      ScalaDeleteGlobalSecondaryIndexAction().withIndexName(Option(self.indexName))
    }

  }

}
