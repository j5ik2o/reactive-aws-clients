package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Capacity => ScalaCapacity, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Capacity => JavaCapacity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CapacityOps {

  implicit class ScalaCapacityOps(val self: ScalaCapacity) extends AnyVal {

    def toJava: JavaCapacity = {
      val result = JavaCapacity.builder()
      self.readCapacityUnits.map(_.doubleValue).foreach(v => result.readCapacityUnits(v))   // Double
      self.writeCapacityUnits.map(_.doubleValue).foreach(v => result.writeCapacityUnits(v)) // Double
      self.capacityUnits.map(_.doubleValue).foreach(v => result.capacityUnits(v))           // Double

      result.build()
    }

  }

  implicit class JavaCapacityOps(val self: JavaCapacity) extends AnyVal {

    def toScala: ScalaCapacity = {
      ScalaCapacity()
        .withReadCapacityUnits(Option(self.readCapacityUnits).map(_.doubleValue)) // Double
        .withWriteCapacityUnits(Option(self.writeCapacityUnits).map(_.doubleValue)) // Double
        .withCapacityUnits(Option(self.capacityUnits).map(_.doubleValue)) // Double
    }

  }

}
