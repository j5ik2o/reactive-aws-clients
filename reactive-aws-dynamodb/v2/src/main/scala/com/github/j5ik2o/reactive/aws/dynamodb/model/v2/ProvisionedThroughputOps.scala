package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProvisionedThroughput => ScalaProvisionedThroughput, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ProvisionedThroughput => JavaProvisionedThroughput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProvisionedThroughputOps {

  implicit class ScalaProvisionedThroughputOps(val self: ScalaProvisionedThroughput) extends AnyVal {

    def toJava: JavaProvisionedThroughput = {
      val result = JavaProvisionedThroughput.builder()
      self.readCapacityUnits.map(_.longValue).foreach(v => result.readCapacityUnits(v))   // Long, case Long
      self.writeCapacityUnits.map(_.longValue).foreach(v => result.writeCapacityUnits(v)) // Long, case Long

      result.build()
    }

  }

  implicit class JavaProvisionedThroughputOps(val self: JavaProvisionedThroughput) extends AnyVal {

    def toScala: ScalaProvisionedThroughput = {
      ScalaProvisionedThroughput()
        .withReadCapacityUnits(Option(self.readCapacityUnits).map(_.longValue)) // Long
        .withWriteCapacityUnits(Option(self.writeCapacityUnits).map(_.longValue)) // Long
    }

  }

}
