// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeContinuousBackupsRequest => ScalaDescribeContinuousBackupsRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeContinuousBackupsRequest => JavaDescribeContinuousBackupsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeContinuousBackupsRequestOps {

  implicit class ScalaDescribeContinuousBackupsRequestOps(val self: ScalaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toJava: JavaDescribeContinuousBackupsRequest = {
      val result = JavaDescribeContinuousBackupsRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String

      result.build()
    }

  }

}
