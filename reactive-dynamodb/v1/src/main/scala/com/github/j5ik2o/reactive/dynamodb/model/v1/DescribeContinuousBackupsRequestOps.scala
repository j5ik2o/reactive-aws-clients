package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  DescribeContinuousBackupsRequest => JavaDescribeContinuousBackupsRequest
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  DescribeContinuousBackupsRequest => ScalaDescribeContinuousBackupsRequest
}

object DescribeContinuousBackupsRequestOps {

  implicit class ScalaDescribeContinuousBackupsRequestOps(val self: ScalaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toJava: JavaDescribeContinuousBackupsRequest = {
      val result = new JavaDescribeContinuousBackupsRequest
      self.tableName.foreach(result.setTableName)
      result
    }

  }

  implicit class JavaDescribeContinuousBackupsRequestOps(val self: JavaDescribeContinuousBackupsRequest)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsRequest = {
      ScalaDescribeContinuousBackupsRequest().withTableName(Option(self.getTableName))
    }

  }

}
