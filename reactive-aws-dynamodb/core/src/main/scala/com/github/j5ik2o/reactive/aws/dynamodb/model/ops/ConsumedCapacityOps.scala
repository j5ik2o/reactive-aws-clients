// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ConsumedCapacityBuilderOps(val self: ConsumedCapacity.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def capacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.capacityUnits(v)
    }
  }

  final def readCapacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  }

  final def writeCapacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  }

  final def tableAsScala(value: Option[Capacity]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.table(v)
    }
  }

  final def localSecondaryIndexesAsScala(value: Option[Map[String, Capacity]]): ConsumedCapacity.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    }
  }

  final def globalSecondaryIndexesAsScala(value: Option[Map[String, Capacity]]): ConsumedCapacity.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    }
  }

}

final class ConsumedCapacityOps(val self: ConsumedCapacity) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def capacityUnitsAsScala: Option[Double] = Option(self.capacityUnits)

  final def readCapacityUnitsAsScala: Option[Double] = Option(self.readCapacityUnits)

  final def writeCapacityUnitsAsScala: Option[Double] = Option(self.writeCapacityUnits)

  final def tableAsScala: Option[Capacity] = Option(self.table)

  final def localSecondaryIndexesAsScala: Option[Map[String, Capacity]] = Option(self.localSecondaryIndexes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def globalSecondaryIndexesAsScala: Option[Map[String, Capacity]] = Option(self.globalSecondaryIndexes).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumedCapacityOps {

  implicit def toConsumedCapacityBuilderOps(v: ConsumedCapacity.Builder): ConsumedCapacityBuilderOps =
    new ConsumedCapacityBuilderOps(v)

  implicit def toConsumedCapacityOps(v: ConsumedCapacity): ConsumedCapacityOps = new ConsumedCapacityOps(v)

}
