package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => ScalaUpdateGlobalSecondaryIndexAction,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => JavaUpdateGlobalSecondaryIndexAction
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalSecondaryIndexActionOps {

  implicit class ScalaUpdateGlobalSecondaryIndexActionOps(val self: ScalaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaUpdateGlobalSecondaryIndexAction = {
      val result = JavaUpdateGlobalSecondaryIndexAction.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String, case String
      self.provisionedThroughput.foreach { v =>
        result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput, case Other

      result.build()
    }

  }

  implicit class JavaUpdateGlobalSecondaryIndexActionOps(val self: JavaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalSecondaryIndexAction = {
      ScalaUpdateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.indexName)) // String
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          v.toScala
        }) // ProvisionedThroughput, Map-12
    }

  }

}
