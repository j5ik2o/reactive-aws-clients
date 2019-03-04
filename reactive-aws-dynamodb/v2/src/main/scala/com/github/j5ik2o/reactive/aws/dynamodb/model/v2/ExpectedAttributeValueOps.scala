package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ComparisonOperator,
  ExpectedAttributeValue => ScalaExpectedAttributeValue
}
import software.amazon.awssdk.services.dynamodb.model.{ ExpectedAttributeValue => JavaExpectedAttributeValue }

import scala.collection.JavaConverters._

object ExpectedAttributeValueOps {
  import AttributeValueOps._

  implicit class ScalaExpectedAttributeValueOps(val self: ScalaExpectedAttributeValue) extends AnyVal {

    def toJava: JavaExpectedAttributeValue = {
      val result = JavaExpectedAttributeValue.builder()
      self.value.map(_.toJava).foreach(result.value)
      self.exists.foreach(v => result.exists(v))
      self.comparisonOperator.map(_.entryName).foreach(result.comparisonOperator)
      self.attributeValueList.map(_.map(_.toJava).asJava).foreach(result.attributeValueList)
      result.build()
    }

  }

  implicit class JavaExpectedAttributeValueOps(val self: JavaExpectedAttributeValue) extends AnyVal {

    def toScala: ScalaExpectedAttributeValue = {
      ScalaExpectedAttributeValue()
        .withValue(Option(self.value).map(_.toScala))
        .withExists(Option(self.exists))
        .withComparisonOperator(Option(self.comparisonOperator).map(_.toString).map(ComparisonOperator.withName))
        .withAttributeValueList(Option(self.attributeValueList).map(_.asScala.map(_.toScala)))
    }
  }

}
