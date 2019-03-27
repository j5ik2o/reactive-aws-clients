// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ExpectedAttributeValue => ScalaExpectedAttributeValue, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ExpectedAttributeValue => JavaExpectedAttributeValue }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ExpectedAttributeValueOps {

  implicit class ScalaExpectedAttributeValueOps(val self: ScalaExpectedAttributeValue) extends AnyVal {

    def toJava: JavaExpectedAttributeValue = {
      val result = JavaExpectedAttributeValue.builder()
      self.value.foreach { v =>
        import AttributeValueOps._; result.value(v.toJava)
      } // AttributeValue
      self.exists.map(_.booleanValue).foreach(v => result.exists(v)) // Boolean
      self.comparisonOperator.foreach { v =>
        import ComparisonOperatorOps._; result.comparisonOperator(v.toJava)
      } // String
      self.attributeValueList.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.attributeValueList(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]

      result.build()
    }

  }

  implicit class JavaExpectedAttributeValueOps(val self: JavaExpectedAttributeValue) extends AnyVal {

    def toScala: ScalaExpectedAttributeValue = {
      ScalaExpectedAttributeValue()
        .withValue(Option(self.value).map { v =>
          import AttributeValueOps._; v.toScala
        }) // AttributeValue
        .withExists(Option(self.exists).map(_.booleanValue)) // Boolean
        .withComparisonOperator(Option(self.comparisonOperator).map { v =>
          import ComparisonOperatorOps._; v.toScala
        }) // String
        .withAttributeValueList(Option(self.attributeValueList).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
    }

  }

}
