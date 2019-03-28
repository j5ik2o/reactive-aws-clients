// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValueUpdate => ScalaAttributeValueUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ AttributeValueUpdate => JavaAttributeValueUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueUpdateOps {

  implicit class ScalaAttributeValueUpdateOps(val self: ScalaAttributeValueUpdate) extends AnyVal {

    def toJava: JavaAttributeValueUpdate = {
      val result = new JavaAttributeValueUpdate()
      self.value.foreach { v =>
        import AttributeValueOps._; result.withValue(v.toJava)
      } // AttributeValue
      self.action.foreach { v =>
        import AttributeActionOps._; result.withAction(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaAttributeValueUpdateOps(val self: JavaAttributeValueUpdate) extends AnyVal {

    def toScala: ScalaAttributeValueUpdate = {
      ScalaAttributeValueUpdate()
        .withValue(Option(self.getValue).map { v =>
          import AttributeValueOps._; v.toScala
        }) // AttributeValue
        .withAction(Option(self.getAction).map { v =>
          import AttributeActionOps._; v.toScala
        }) // String
    }

  }

}
