package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Condition => JavaCondition }
import com.github.j5ik2o.reactive.dynamodb.model.{ ComparisonOperator, Condition => ScalaCondition }

import scala.collection.JavaConverters._

object ConditionOps {

  import AttributeValueOps._

  implicit class ScalaConditionOps(val self: ScalaCondition) extends AnyVal {

    def toJava: JavaCondition = {
      val result = new JavaCondition()
      self.attributeValueList.map(_.map(_.toJava).asJava).foreach(result.setAttributeValueList)
      self.comparisonOperator.map(_.entryName).foreach(result.setComparisonOperator)
      result
    }

  }

  implicit class JavaScalaConditionOps(val self: JavaCondition) extends AnyVal {

    def toScala: ScalaCondition = {
      ScalaCondition()
        .withAttributeValueList(Option(self.getAttributeValueList).map(_.asScala.map(_.toScala)))
        .withComparisonOperator(Option(self.getComparisonOperator).map(ComparisonOperator.withName))
    }

  }

}
