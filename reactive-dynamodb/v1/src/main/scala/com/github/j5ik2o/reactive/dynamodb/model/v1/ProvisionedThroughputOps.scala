package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ProvisionedThroughput => JavaProvisionedThroughput }
import com.github.j5ik2o.reactive.dynamodb.model.{ ProvisionedThroughput => ScalaProvisionedThroughput }

object ProvisionedThroughputOps {

  implicit class ScalaProvisionedThroughputOps(val self: ScalaProvisionedThroughput) extends AnyVal {

    def toJava: JavaProvisionedThroughput = {
      val result = new JavaProvisionedThroughput()
      self.readCapacityUnits.foreach(v => result.setReadCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.setWriteCapacityUnits(v))
      result
    }

  }

  implicit class JavaProvisionedThroughputOps(val self: JavaProvisionedThroughput) extends AnyVal {

    def toScala: ScalaProvisionedThroughput = {
      ScalaProvisionedThroughput()
        .withReadCapacityUnits(Option(self.getReadCapacityUnits)).withWriteCapacityUnits(
          Option(self.getWriteCapacityUnits)
        )
    }

  }

}
