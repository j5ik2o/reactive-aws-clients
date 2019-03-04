package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ComparisonOperator, Condition => ScalaCondition }
import software.amazon.awssdk.services.dynamodb.model.{ Condition => JavaCondition }

import scala.collection.JavaConverters._

object ConditionOps {

  import AttributeValueOps._

  implicit class ScalaConditionOps(val self: ScalaCondition) extends AnyVal {

    def toJava: JavaCondition = {
      val result = JavaCondition.builder()
      self.attributeValueList.map(_.map(_.toJava).asJava).foreach(result.attributeValueList)
      self.comparisonOperator.map(_.entryName).foreach(result.comparisonOperator)
      result.build()
    }

  }

  implicit class JavaScalaConditionOps(val self: JavaCondition) extends AnyVal {

    def toScala: ScalaCondition = {
      ScalaCondition()
        .withAttributeValueList(Option(self.attributeValueList).map(_.asScala.map(_.toScala)))
        .withComparisonOperator(Option(self.comparisonOperator).map(_.toString).map(ComparisonOperator.withName))
    }

  }

}
