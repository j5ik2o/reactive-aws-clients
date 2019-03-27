// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Capacity => ScalaCapacity, _ }
import com.amazonaws.services.dynamodbv2.model.{ Capacity => JavaCapacity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CapacityOps {

  implicit class ScalaCapacityOps(val self: ScalaCapacity) extends AnyVal {

    def toJava: JavaCapacity = {
      val result = new JavaCapacity()
      self.readCapacityUnits.map(_.doubleValue).foreach(v => result.withReadCapacityUnits(v))   // Double
      self.writeCapacityUnits.map(_.doubleValue).foreach(v => result.withWriteCapacityUnits(v)) // Double
      self.capacityUnits.map(_.doubleValue).foreach(v => result.withCapacityUnits(v))           // Double

      result
    }

  }

  implicit class JavaCapacityOps(val self: JavaCapacity) extends AnyVal {

    def toScala: ScalaCapacity = {
      ScalaCapacity()
        .withReadCapacityUnits(Option(self.getReadCapacityUnits).map(_.doubleValue)) // Double
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits).map(_.doubleValue)) // Double
        .withCapacityUnits(Option(self.getCapacityUnits).map(_.doubleValue)) // Double
    }

  }

}
