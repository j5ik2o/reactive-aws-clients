// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ExpectedAttributeValue => ScalaExpectedAttributeValue, _ }
import com.amazonaws.services.dynamodbv2.model.{ ExpectedAttributeValue => JavaExpectedAttributeValue }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ExpectedAttributeValueOps {

  implicit class ScalaExpectedAttributeValueOps(val self: ScalaExpectedAttributeValue) extends AnyVal {

    def toJava: JavaExpectedAttributeValue = {
      val result = new JavaExpectedAttributeValue()
      self.value.foreach { v =>
        import AttributeValueOps._; result.withValue(v.toJava)
      } // AttributeValue
      self.exists.map(_.booleanValue).foreach(v => result.withExists(v)) // Boolean
      self.comparisonOperator.foreach { v =>
        import ComparisonOperatorOps._; result.withComparisonOperator(v.toJava)
      } // String
      self.attributeValueList.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withAttributeValueList(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]

      result
    }

  }

  implicit class JavaExpectedAttributeValueOps(val self: JavaExpectedAttributeValue) extends AnyVal {

    def toScala: ScalaExpectedAttributeValue = {
      ScalaExpectedAttributeValue()
        .withValue(Option(self.getValue).map { v =>
          import AttributeValueOps._; v.toScala
        }) // AttributeValue
        .withExists(Option(self.getExists).map(_.booleanValue)) // Boolean
        .withComparisonOperator(Option(self.getComparisonOperator).map { v =>
          import ComparisonOperatorOps._; v.toScala
        }) // String
        .withAttributeValueList(Option(self.getAttributeValueList).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
    }

  }

}
