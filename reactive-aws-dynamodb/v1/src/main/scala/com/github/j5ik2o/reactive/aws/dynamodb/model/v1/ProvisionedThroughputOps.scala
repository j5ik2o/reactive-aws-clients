// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProvisionedThroughput => ScalaProvisionedThroughput, _ }
import com.amazonaws.services.dynamodbv2.model.{ ProvisionedThroughput => JavaProvisionedThroughput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProvisionedThroughputOps {

  implicit class ScalaProvisionedThroughputOps(val self: ScalaProvisionedThroughput) extends AnyVal {

    def toJava: JavaProvisionedThroughput = {
      val result = new JavaProvisionedThroughput()
      self.readCapacityUnits.map(_.longValue).foreach(v => result.withReadCapacityUnits(v))   // Long
      self.writeCapacityUnits.map(_.longValue).foreach(v => result.withWriteCapacityUnits(v)) // Long

      result
    }

  }

  implicit class JavaProvisionedThroughputOps(val self: JavaProvisionedThroughput) extends AnyVal {

    def toScala: ScalaProvisionedThroughput = {
      ScalaProvisionedThroughput()
        .withReadCapacityUnits(Option(self.getReadCapacityUnits).map(_.longValue)) // Long
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits).map(_.longValue)) // Long
    }

  }

}
