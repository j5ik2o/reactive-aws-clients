// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Condition => ScalaCondition, _ }
import com.amazonaws.services.dynamodbv2.model.{ Condition => JavaCondition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConditionOps {

  implicit class ScalaConditionOps(val self: ScalaCondition) extends AnyVal {

    def toJava: JavaCondition = {
      val result = new JavaCondition()
      self.attributeValueList.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withAttributeValueList(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]
      self.comparisonOperator.foreach { v =>
        import ComparisonOperatorOps._; result.withComparisonOperator(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaConditionOps(val self: JavaCondition) extends AnyVal {

    def toScala: ScalaCondition = {
      ScalaCondition()
        .withAttributeValueList(Option(self.getAttributeValueList).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
        .withComparisonOperator(Option(self.getComparisonOperator).map { v =>
          import ComparisonOperatorOps._; v.toScala
        }) // String
    }

  }

}
