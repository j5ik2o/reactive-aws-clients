package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => ScalaUpdateGlobalSecondaryIndexAction
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => JavaUpdateGlobalSecondaryIndexAction
}

object UpdateGlobalSecondaryIndexActionOps {

  import ProvisionedThroughputOps._

  implicit class ScalaUpdateGlobalSecondaryIndexActionOps(val self: ScalaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaUpdateGlobalSecondaryIndexAction = {
      val result = JavaUpdateGlobalSecondaryIndexAction.builder()
      self.indexName.foreach(result.indexName)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      result.build()
    }

  }

  implicit class JavaUpdateGlobalSecondaryIndexActionOps(val self: JavaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalSecondaryIndexAction = {
      ScalaUpdateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.indexName)).withProvisionedThroughput(
          Option(self.provisionedThroughput).map(_.toScala)
        )
    }

  }

}
