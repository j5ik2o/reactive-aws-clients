// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableRequest => ScalaDeleteTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteTableRequest => JavaDeleteTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteTableRequestOps {

  implicit class ScalaDeleteTableRequestOps(val self: ScalaDeleteTableRequest) extends AnyVal {

    def toJava: JavaDeleteTableRequest = {
      val result = new JavaDeleteTableRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String

      result
    }

  }

}
