// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Condition => ScalaCondition, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Condition => JavaCondition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConditionOps {

  implicit class ScalaConditionOps(val self: ScalaCondition) extends AnyVal {

    def toJava: JavaCondition = {
      val result = JavaCondition.builder()
      self.attributeValueList.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.attributeValueList(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]
      self.comparisonOperator.foreach { v =>
        import ComparisonOperatorOps._; result.comparisonOperator(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaConditionOps(val self: JavaCondition) extends AnyVal {

    def toScala: ScalaCondition = {
      ScalaCondition()
        .withAttributeValueList(Option(self.attributeValueList).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
        .withComparisonOperator(Option(self.comparisonOperator).map { v =>
          import ComparisonOperatorOps._; v.toScala
        }) // String
    }

  }

}
