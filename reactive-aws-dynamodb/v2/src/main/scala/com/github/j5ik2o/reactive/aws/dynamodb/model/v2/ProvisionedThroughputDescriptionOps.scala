package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ProvisionedThroughputDescription => ScalaProvisionedThroughputDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  ProvisionedThroughputDescription => JavaProvisionedThroughputDescription
}

object ProvisionedThroughputDescriptionOps {

  implicit class ScalaProvisionedThroughputDescriptionOps(val self: ScalaProvisionedThroughputDescription)
      extends AnyVal {
    def toJava: JavaProvisionedThroughputDescription = {
      val result = JavaProvisionedThroughputDescription.builder()
      self.lastIncreaseDateTime.foreach(result.lastIncreaseDateTime)
      self.lastDecreaseDateTime.foreach(result.lastDecreaseDateTime)
      self.numberOfDecreasesToday.foreach(v => result.numberOfDecreasesToday(v))
      self.readCapacityUnits.foreach(v => result.readCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.writeCapacityUnits(v))
      result.build()
    }
  }

  implicit class JavaProvisionedThroughputDescriptionOps(val self: JavaProvisionedThroughputDescription)
      extends AnyVal {

    def toScala: ScalaProvisionedThroughputDescription = {
      ScalaProvisionedThroughputDescription()
        .withLastIncreaseDateTime(Option(self.lastIncreaseDateTime))
        .withLastDecreaseDateTime(Option(self.lastDecreaseDateTime))
        .withNumberOfDecreasesToday(Option(self.numberOfDecreasesToday))
        .withReadCapacityUnits(Option(self.readCapacityUnits))
        .withWriteCapacityUnits(Option(self.writeCapacityUnits))
    }

  }

}
