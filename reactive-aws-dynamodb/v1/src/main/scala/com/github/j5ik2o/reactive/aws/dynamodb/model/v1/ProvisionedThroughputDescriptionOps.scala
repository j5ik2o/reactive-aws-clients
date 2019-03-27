// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ProvisionedThroughputDescription => ScalaProvisionedThroughputDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  ProvisionedThroughputDescription => JavaProvisionedThroughputDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProvisionedThroughputDescriptionOps {

  implicit class ScalaProvisionedThroughputDescriptionOps(val self: ScalaProvisionedThroughputDescription)
      extends AnyVal {

    def toJava: JavaProvisionedThroughputDescription = {
      val result = new JavaProvisionedThroughputDescription()
      self.lastIncreaseDateTime.map(java.util.Date.from).foreach(v => result.withLastIncreaseDateTime(v)) // Instant
      self.lastDecreaseDateTime.map(java.util.Date.from).foreach(v => result.withLastDecreaseDateTime(v)) // Instant
      self.numberOfDecreasesToday.map(_.longValue).foreach(v => result.withNumberOfDecreasesToday(v))     // Long
      self.readCapacityUnits.map(_.longValue).foreach(v => result.withReadCapacityUnits(v))               // Long
      self.writeCapacityUnits.map(_.longValue).foreach(v => result.withWriteCapacityUnits(v))             // Long

      result
    }

  }

  implicit class JavaProvisionedThroughputDescriptionOps(val self: JavaProvisionedThroughputDescription)
      extends AnyVal {

    def toScala: ScalaProvisionedThroughputDescription = {
      ScalaProvisionedThroughputDescription()
        .withLastIncreaseDateTime(Option(self.getLastIncreaseDateTime).map(_.toInstant)) // Instant
        .withLastDecreaseDateTime(Option(self.getLastDecreaseDateTime).map(_.toInstant)) // Instant
        .withNumberOfDecreasesToday(Option(self.getNumberOfDecreasesToday).map(_.longValue)) // Long
        .withReadCapacityUnits(Option(self.getReadCapacityUnits).map(_.longValue)) // Long
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits).map(_.longValue)) // Long
    }

  }

}
