// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ShardIteratorType => ScalaShardIteratorType, _ }
import software.amazon.awssdk.services.kinesis.model.{ ShardIteratorType => JavaShardIteratorType }

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
