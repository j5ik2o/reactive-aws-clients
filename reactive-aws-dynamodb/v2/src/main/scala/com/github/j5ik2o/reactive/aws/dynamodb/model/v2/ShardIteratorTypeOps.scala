// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ShardIteratorType => ScalaShardIteratorType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ShardIteratorType => JavaShardIteratorType }

object ShardIteratorTypeOps {

  implicit class ScalaShardIteratorTypeOps(val self: ScalaShardIteratorType) extends AnyVal {

    def toJava: JavaShardIteratorType = {
      JavaShardIteratorType.valueOf(self.entryName)
    }

  }

  implicit class JavaShardIteratorTypeOps(val self: JavaShardIteratorType) extends AnyVal {

    def toScala: ScalaShardIteratorType = {
      ScalaShardIteratorType.withName(self.toString)
    }

  }

}
