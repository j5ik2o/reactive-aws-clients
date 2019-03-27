// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeContinuousBackupsRequest => ScalaDescribeContinuousBackupsRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  DescribeContinuousBackupsRequest => JavaDescribeContinuousBackupsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeContinuousBackupsRequestOps {

  implicit class ScalaDescribeContinuousBackupsRequestOps(val self: ScalaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toJava: JavaDescribeContinuousBackupsRequest = {
      val result = new JavaDescribeContinuousBackupsRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String

      result
    }

  }

}
