// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ShardIteratorType => ScalaShardIteratorType, _ }
import com.amazonaws.services.dynamodbv2.model.{ ShardIteratorType => JavaShardIteratorType }

object ShardIteratorTypeOps {

  implicit class ScalaShardIteratorTypeOps(val self: ScalaShardIteratorType) extends AnyVal {

    def toJava: JavaShardIteratorType = {
      JavaShardIteratorType.valueOf(self.entryName)
    }

  }

  implicit class JavaShardIteratorTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaShardIteratorType = {
      ScalaShardIteratorType.withName(self)
    }

  }

}
