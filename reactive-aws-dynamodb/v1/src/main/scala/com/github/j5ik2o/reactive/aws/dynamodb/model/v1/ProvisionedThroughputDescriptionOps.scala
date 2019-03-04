package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{
  ProvisionedThroughputDescription => JavaProvisionedThroughputDescription
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ProvisionedThroughputDescription => ScalaProvisionedThroughputDescription
}

object ProvisionedThroughputDescriptionOps {

  implicit class ScalaProvisionedThroughputDescriptionOps(val self: ScalaProvisionedThroughputDescription)
      extends AnyVal {

    def toJava: JavaProvisionedThroughputDescription = {
      val result = new JavaProvisionedThroughputDescription()
      self.lastIncreaseDateTime.map(Date.from).foreach(result.setLastIncreaseDateTime)
      self.lastDecreaseDateTime.map(Date.from).foreach(result.setLastDecreaseDateTime)
      self.numberOfDecreasesToday.foreach(v => result.setNumberOfDecreasesToday(v))
      self.readCapacityUnits.foreach(v => result.setReadCapacityUnits(v))
      self.writeCapacityUnits.foreach(v => result.setWriteCapacityUnits(v))
      result
    }

  }

  implicit class JavaProvisionedThroughputDescriptionOps(val self: JavaProvisionedThroughputDescription)
      extends AnyVal {

    def toScala: ScalaProvisionedThroughputDescription = {
      ScalaProvisionedThroughputDescription()
        .withLastIncreaseDateTime(Option(self.getLastIncreaseDateTime).map(_.toInstant))
        .withLastDecreaseDateTime(Option(self.getLastDecreaseDateTime).map(_.toInstant))
        .withNumberOfDecreasesToday(Option(self.getNumberOfDecreasesToday))
        .withReadCapacityUnits(Option(self.getReadCapacityUnits))
        .withWriteCapacityUnits(Option(self.getWriteCapacityUnits))
    }

  }

}
