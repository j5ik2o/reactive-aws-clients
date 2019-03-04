package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeContinuousBackupsRequest => ScalaDescribeContinuousBackupsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeContinuousBackupsRequest => JavaDescribeContinuousBackupsRequest
}

object DescribeContinuousBackupsRequestOps {

  implicit class ScalaDescribeContinuousBackupsRequestOps(val self: ScalaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toJava: JavaDescribeContinuousBackupsRequest = {
      val result = JavaDescribeContinuousBackupsRequest.builder()
      self.tableName.foreach(result.tableName)
      result.build()
    }

  }

  implicit class JavaDescribeContinuousBackupsRequestOps(val self: JavaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsRequest = {
      ScalaDescribeContinuousBackupsRequest().withTableName(Option(self.tableName))
    }

  }

}
