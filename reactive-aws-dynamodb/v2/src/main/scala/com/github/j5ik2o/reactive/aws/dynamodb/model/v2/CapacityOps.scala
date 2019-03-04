package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Capacity => ScalaCapacity }
import software.amazon.awssdk.services.dynamodb.model.{ Capacity => JavaCapacity }

object CapacityOps {

  implicit class ScalaCapacityOps(val self: ScalaCapacity) extends AnyVal {

    def toJava: JavaCapacity = {
      val result = JavaCapacity.builder()
      self.capacityUnits.foreach(v => result.capacityUnits(v))
      self.readCapacityUnits.foreach(v => result.readCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.writeCapacityUnits(v))
      result.build()
    }

  }

  implicit class JavaCapacityOps(val self: JavaCapacity) extends AnyVal {

    def toScala: ScalaCapacity = {
      ScalaCapacity()
        .withReadCapacityUnits(Option(self.readCapacityUnits))
        .withWriteCapacityUnits(Option(self.writeCapacityUnits))
        .withCapacityUnits(Option(self.capacityUnits))
    }

  }

}
