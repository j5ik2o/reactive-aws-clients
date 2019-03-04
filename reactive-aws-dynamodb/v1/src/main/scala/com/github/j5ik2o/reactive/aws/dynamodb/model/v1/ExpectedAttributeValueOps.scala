package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ExpectedAttributeValue => JavaExpectedAttributeValue }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ComparisonOperator,
  ExpectedAttributeValue => ScalaExpectedAttributeValue
}

import scala.collection.JavaConverters._

object ExpectedAttributeValueOps {
  import AttributeValueOps._

  implicit class ScalaExpectedAttributeValueOps(val self: ScalaExpectedAttributeValue) extends AnyVal {

    def toJava: JavaExpectedAttributeValue = {
      val result = new JavaExpectedAttributeValue
      self.value.map(_.toJava).foreach(result.setValue)
      self.exists.foreach(v => result.setExists(v))
      self.comparisonOperator.map(_.entryName).foreach(result.setComparisonOperator)
      self.attributeValueList.map(_.map(_.toJava).asJava).foreach(result.setAttributeValueList)
      result
    }

  }

  implicit class JavaExpectedAttributeValueOps(val self: JavaExpectedAttributeValue) extends AnyVal {

    def toScala: ScalaExpectedAttributeValue = {
      ScalaExpectedAttributeValue()
        .withValue(Option(self.getValue).map(_.toScala))
        .withExists(Option(self.getExists))
        .withComparisonOperator(Option(self.getComparisonOperator).map(ComparisonOperator.withName))
        .withAttributeValueList(Option(self.getAttributeValueList).map(_.asScala.map(_.toScala)))
    }
  }

}
