// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteGlobalSecondaryIndexActionOps {

  implicit class ScalaDeleteGlobalSecondaryIndexActionOps(val self: ScalaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaDeleteGlobalSecondaryIndexAction = {
      val result = JavaDeleteGlobalSecondaryIndexAction.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String

      result.build()
    }

  }

  implicit class JavaDeleteGlobalSecondaryIndexActionOps(val self: JavaDeleteGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaDeleteGlobalSecondaryIndexAction = {
      ScalaDeleteGlobalSecondaryIndexAction()
        .withIndexName(Option(self.indexName)) // String
    }

  }

}
