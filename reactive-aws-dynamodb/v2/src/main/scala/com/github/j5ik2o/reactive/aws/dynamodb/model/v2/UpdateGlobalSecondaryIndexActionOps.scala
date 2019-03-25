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
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput

      result.build()
    }

  }

  implicit class JavaUpdateGlobalSecondaryIndexActionOps(val self: JavaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalSecondaryIndexAction = {
      ScalaUpdateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.indexName)) // String
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
    }

  }

}
