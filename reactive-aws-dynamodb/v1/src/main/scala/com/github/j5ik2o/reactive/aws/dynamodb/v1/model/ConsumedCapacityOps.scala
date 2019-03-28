// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConsumedCapacity => ScalaConsumedCapacity, _ }
import com.amazonaws.services.dynamodbv2.model.{ ConsumedCapacity => JavaConsumedCapacity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumedCapacityOps {

  implicit class ScalaConsumedCapacityOps(val self: ScalaConsumedCapacity) extends AnyVal {

    def toJava: JavaConsumedCapacity = {
      val result = new JavaConsumedCapacity()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                   // String
      self.capacityUnits.map(_.doubleValue).foreach(v => result.withCapacityUnits(v))           // Double
      self.readCapacityUnits.map(_.doubleValue).foreach(v => result.withReadCapacityUnits(v))   // Double
      self.writeCapacityUnits.map(_.doubleValue).foreach(v => result.withWriteCapacityUnits(v)) // Double
      self.table.foreach { v =>
        import CapacityOps._; result.withTable(v.toJava)
      } // Capacity
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CapacityOps._;
        result.withLocalSecondaryIndexes(v.mapValues(_.toJava).asJava)
      } // Map[String, Capacity]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CapacityOps._;
        result.withGlobalSecondaryIndexes(v.mapValues(_.toJava).asJava)
      } // Map[String, Capacity]

      result
    }

  }

  implicit class JavaConsumedCapacityOps(val self: JavaConsumedCapacity) extends AnyVal {

    def toScala: ScalaConsumedCapacity = {
      ScalaConsumedCapacity()
        .withTableName(Option(self.getTableName)) // String
        .withCapacityUnits(Option(self.getCapacityUnits).map(_.doubleValue)) // Double
        .withReadCapacityUnits(Option(self.getReadCapacityUnits).map(_.doubleValue)) // Double
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits).map(_.doubleValue)) // Double
        .withTable(Option(self.getTable).map { v =>
          import CapacityOps._; v.toScala
        }) // Capacity
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, CapacityOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, Capacity]
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, CapacityOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, Capacity]
    }

  }

}
