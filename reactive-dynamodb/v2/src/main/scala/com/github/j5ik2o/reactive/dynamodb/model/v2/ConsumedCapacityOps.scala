package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ConsumedCapacity => ScalaConsumedCapacity }
import software.amazon.awssdk.services.dynamodb.model.{ ConsumedCapacity => JavaConsumedCapacity }

import scala.collection.JavaConverters._

object ConsumedCapacityOps {

  import CapacityOps._

  implicit class ScalaConsumedCapacityOps(val self: ScalaConsumedCapacity) extends AnyVal {

    def toJava: JavaConsumedCapacity = {
      val result = JavaConsumedCapacity.builder()
      self.tableName.foreach(result.tableName)
      self.capacityUnits.foreach(v => result.capacityUnits(v))
      self.readCapacityUnits.foreach(v => result.readCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.writeCapacityUnits(v))
      self.table.map(_.toJava).foreach(result.table)
      self.localSecondaryIndexes.map(_.mapValues(_.toJava).asJava).foreach(result.localSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.mapValues(_.toJava).asJava).foreach(result.globalSecondaryIndexes)
      result.build()
    }

  }

  implicit class JavaConsumedCapacityOps(val self: JavaConsumedCapacity) extends AnyVal {

    def toScala: ScalaConsumedCapacity = {
      ScalaConsumedCapacity()
        .withTableName(Option(self.tableName))
        .withCapacityUnits(Option(self.capacityUnits))
        .withReadCapacityUnits(Option(self.readCapacityUnits))
        .withWriteCapacityUnits(Option(self.writeCapacityUnits))
        .withTable(Option(self.table).map(_.toScala))
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
