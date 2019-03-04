package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction
}

object DeleteGlobalSecondaryIndexActionOps {

  implicit class ScalaDeleteGlobalSecondaryIndexActionOps(val self: ScalaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaDeleteGlobalSecondaryIndexAction = {
      val result = new JavaDeleteGlobalSecondaryIndexAction()
      self.indexName.foreach(result.setIndexName)
      result
    }

  }

  implicit class JavaDeleteGlobalSecondaryIndexActionOps(val self: JavaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaDeleteGlobalSecondaryIndexAction = {
      ScalaDeleteGlobalSecondaryIndexAction().withIndexName(Option(self.getIndexName))
    }

  }

}
