package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableRequest => ScalaDeleteTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteTableRequest => JavaDeleteTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteTableRequestOps {

  implicit class ScalaDeleteTableRequestOps(val self: ScalaDeleteTableRequest) extends AnyVal {

    def toJava: JavaDeleteTableRequest = {
      val result = JavaDeleteTableRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String

      result.build()
    }

  }

}
