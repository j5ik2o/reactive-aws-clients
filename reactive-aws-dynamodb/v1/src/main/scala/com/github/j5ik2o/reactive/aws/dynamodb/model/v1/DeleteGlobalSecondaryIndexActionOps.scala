// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteGlobalSecondaryIndexActionOps {

  implicit class ScalaDeleteGlobalSecondaryIndexActionOps(val self: ScalaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaDeleteGlobalSecondaryIndexAction = {
      val result = new JavaDeleteGlobalSecondaryIndexAction()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String

      result
    }

  }

  implicit class JavaDeleteGlobalSecondaryIndexActionOps(val self: JavaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaDeleteGlobalSecondaryIndexAction = {
      ScalaDeleteGlobalSecondaryIndexAction()
        .withIndexName(Option(self.getIndexName)) // String
    }

  }

}
