// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalSecondaryIndexAction => ScalaUpdateGlobalSecondaryIndexAction,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalSecondaryIndexAction => JavaUpdateGlobalSecondaryIndexAction
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalSecondaryIndexActionOps {

  implicit class ScalaUpdateGlobalSecondaryIndexActionOps(val self: ScalaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaUpdateGlobalSecondaryIndexAction = {
      val result = new JavaUpdateGlobalSecondaryIndexAction()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughput

      result
    }

  }

  implicit class JavaUpdateGlobalSecondaryIndexActionOps(val self: JavaUpdateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalSecondaryIndexAction = {
      ScalaUpdateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.getIndexName)) // String
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
    }

  }

}
