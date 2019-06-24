// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ConsumedCapacityBuilderOps(val self: ConsumedCapacity.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.capacityUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala(value: Option[Double]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAsScala(value: Option[Capacity]): ConsumedCapacity.Builder = {
    value.fold(self) { v =>
      self.table(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexesAsScala(value: Option[Map[String, Capacity]]): ConsumedCapacity.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localSecondaryIndexes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala(value: Option[Map[String, Capacity]]): ConsumedCapacity.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava)
    }
  }

}

final class ConsumedCapacityOps(val self: ConsumedCapacity) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityUnitsAsScala: Option[Double] = Option(self.capacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala: Option[Double] = Option(self.readCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala: Option[Double] = Option(self.writeCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAsScala: Option[Capacity] = Option(self.table)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexesAsScala: Option[Map[String, Capacity]] = Option(self.localSecondaryIndexes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala: Option[Map[String, Capacity]] = Option(self.globalSecondaryIndexes).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumedCapacityOps {

  implicit def toConsumedCapacityBuilderOps(v: ConsumedCapacity.Builder): ConsumedCapacityBuilderOps =
    new ConsumedCapacityBuilderOps(v)

  implicit def toConsumedCapacityOps(v: ConsumedCapacity): ConsumedCapacityOps = new ConsumedCapacityOps(v)

}
