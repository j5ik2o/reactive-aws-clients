package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalSecondaryIndexAction => JavaUpdateGlobalSecondaryIndexAction
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => ScalaUpdateGlobalSecondaryIndexAction
}

object UpdateGlobalSecondaryIndexActionOps {

  import ProvisionedThroughputOps._

  implicit class ScalaUpdateGlobalSecondaryIndexActionOps(val self: ScalaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaUpdateGlobalSecondaryIndexAction = {
      val result = new JavaUpdateGlobalSecondaryIndexAction()
      self.indexName.foreach(result.setIndexName)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      result
    }

  }

  implicit class JavaUpdateGlobalSecondaryIndexActionOps(val self: JavaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalSecondaryIndexAction = {
      ScalaUpdateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.getIndexName)).withProvisionedThroughput(
          Option(self.getProvisionedThroughput).map(_.toScala)
        )
    }

  }

}
