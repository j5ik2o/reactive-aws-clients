package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProvisionedThroughput => ScalaProvisionedThroughput }
import software.amazon.awssdk.services.dynamodb.model.{ ProvisionedThroughput => JavaProvisionedThroughput }

object ProvisionedThroughputOps {

  implicit class ScalaProvisionedThroughputOps(val self: ScalaProvisionedThroughput) extends AnyVal {

    def toJava: JavaProvisionedThroughput = {
      val result = JavaProvisionedThroughput.builder()
      self.readCapacityUnits.foreach(v => result.readCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.writeCapacityUnits(v))
      result.build()
    }

  }

  implicit class JavaProvisionedThroughputOps(val self: JavaProvisionedThroughput) extends AnyVal {

    def toScala: ScalaProvisionedThroughput = {
      ScalaProvisionedThroughput()
        .withReadCapacityUnits(Option(self.readCapacityUnits).map(_.longValue()))
        .withWriteCapacityUnits(Option(self.writeCapacityUnits).map(_.longValue()))
    }

  }

}
