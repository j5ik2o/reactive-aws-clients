package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Capacity => JavaCapacity }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Capacity => ScalaCapacity }

object CapacityOps {

  implicit class ScalaCapacityOps(val self: ScalaCapacity) extends AnyVal {

    def toJava: JavaCapacity = {
      val result = new JavaCapacity()
      self.capacityUnits.foreach(v => result.setCapacityUnits(v))
      self.readCapacityUnits.foreach(v => result.setReadCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.setWriteCapacityUnits(v))
      result
    }

  }

  implicit class JavaCapacityOps(val self: JavaCapacity) extends AnyVal {

    def toScala: ScalaCapacity = {
      ScalaCapacity()
        .withReadCapacityUnits(Option(self.getReadCapacityUnits))
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits))
        .withCapacityUnits(Option(self.getCapacityUnits))
    }

  }

}
