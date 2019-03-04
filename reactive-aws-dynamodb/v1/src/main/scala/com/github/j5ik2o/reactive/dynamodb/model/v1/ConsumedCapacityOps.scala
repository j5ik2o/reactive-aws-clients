package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ConsumedCapacity => JavaConsumedCapacity }
import com.github.j5ik2o.reactive.dynamodb.model.{ ConsumedCapacity => ScalaConsumedCapacity }

import scala.collection.JavaConverters._

object ConsumedCapacityOps {

  import CapacityOps._

  implicit class ScalaConsumedCapacityOps(val self: ScalaConsumedCapacity) extends AnyVal {

    def toJava: JavaConsumedCapacity = {
      val result = new JavaConsumedCapacity()
      self.tableName.foreach(result.setTableName)
      self.capacityUnits.foreach(v => result.setCapacityUnits(v))
      self.readCapacityUnits.foreach(v => result.setReadCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.setWriteCapacityUnits(v))
      self.table.map(_.toJava).foreach(result.setTable)
      self.localSecondaryIndexes.map(_.mapValues(_.toJava).asJava).foreach(result.setLocalSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.mapValues(_.toJava).asJava).foreach(result.setGlobalSecondaryIndexes)
      result
    }

  }

  implicit class JavaConsumedCapacityOps(val self: JavaConsumedCapacity) extends AnyVal {

    def toScala: ScalaConsumedCapacity = {
      ScalaConsumedCapacity()
        .withTableName(Option(self.getTableName))
        .withCapacityUnits(Option(self.getCapacityUnits))
        .withReadCapacityUnits(Option(self.getReadCapacityUnits))
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits))
        .withTable(Option(self.getTable).map(_.toScala))
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
