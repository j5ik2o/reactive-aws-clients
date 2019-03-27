// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConsumedCapacity => ScalaConsumedCapacity, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ConsumedCapacity => JavaConsumedCapacity }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConsumedCapacityOps {

  implicit class ScalaConsumedCapacityOps(val self: ScalaConsumedCapacity) extends AnyVal {

    def toJava: JavaConsumedCapacity = {
      val result = JavaConsumedCapacity.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                   // String
      self.capacityUnits.map(_.doubleValue).foreach(v => result.capacityUnits(v))           // Double
      self.readCapacityUnits.map(_.doubleValue).foreach(v => result.readCapacityUnits(v))   // Double
      self.writeCapacityUnits.map(_.doubleValue).foreach(v => result.writeCapacityUnits(v)) // Double
      self.table.foreach { v =>
        import CapacityOps._; result.table(v.toJava)
      } // Capacity
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CapacityOps._;
        result.localSecondaryIndexes(v.mapValues(_.toJava).asJava)
      } // Map[String, Capacity]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CapacityOps._;
        result.globalSecondaryIndexes(v.mapValues(_.toJava).asJava)
      } // Map[String, Capacity]

      result.build()
    }

  }

  implicit class JavaConsumedCapacityOps(val self: JavaConsumedCapacity) extends AnyVal {

    def toScala: ScalaConsumedCapacity = {
      ScalaConsumedCapacity()
        .withTableName(Option(self.tableName)) // String
        .withCapacityUnits(Option(self.capacityUnits).map(_.doubleValue)) // Double
        .withReadCapacityUnits(Option(self.readCapacityUnits).map(_.doubleValue)) // Double
        .withWriteCapacityUnits(Option(self.writeCapacityUnits).map(_.doubleValue)) // Double
        .withTable(Option(self.table).map { v =>
          import CapacityOps._; v.toScala
        }) // Capacity
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, CapacityOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, Capacity]
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, CapacityOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, Capacity]
    }

  }

}
