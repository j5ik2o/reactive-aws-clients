package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ProvisionedThroughputDescription => ScalaProvisionedThroughputDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  ProvisionedThroughputDescription => JavaProvisionedThroughputDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProvisionedThroughputDescriptionOps {

  implicit class ScalaProvisionedThroughputDescriptionOps(val self: ScalaProvisionedThroughputDescription)
      extends AnyVal {

    def toJava: JavaProvisionedThroughputDescription = {
      val result = JavaProvisionedThroughputDescription.builder()
      self.lastIncreaseDateTime.foreach(v => result.lastIncreaseDateTime(v))                      // Instant
      self.lastDecreaseDateTime.foreach(v => result.lastDecreaseDateTime(v))                      // Instant
      self.numberOfDecreasesToday.map(_.longValue).foreach(v => result.numberOfDecreasesToday(v)) // Long, case Long
      self.readCapacityUnits.map(_.longValue).foreach(v => result.readCapacityUnits(v))           // Long, case Long
      self.writeCapacityUnits.map(_.longValue).foreach(v => result.writeCapacityUnits(v))         // Long, case Long

      result.build()
    }

  }

  implicit class JavaProvisionedThroughputDescriptionOps(val self: JavaProvisionedThroughputDescription)
      extends AnyVal {

    def toScala: ScalaProvisionedThroughputDescription = {
      ScalaProvisionedThroughputDescription()
        .withLastIncreaseDateTime(Option(self.lastIncreaseDateTime)) // Instant
        .withLastDecreaseDateTime(Option(self.lastDecreaseDateTime)) // Instant
        .withNumberOfDecreasesToday(Option(self.numberOfDecreasesToday).map(_.longValue)) // Long
        .withReadCapacityUnits(Option(self.readCapacityUnits).map(_.longValue)) // Long
        .withWriteCapacityUnits(Option(self.writeCapacityUnits).map(_.longValue)) // Long
    }

  }

}
