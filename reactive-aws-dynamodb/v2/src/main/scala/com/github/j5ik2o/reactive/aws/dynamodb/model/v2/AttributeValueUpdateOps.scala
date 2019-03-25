package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValueUpdate => ScalaAttributeValueUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeValueUpdate => JavaAttributeValueUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueUpdateOps {

  implicit class ScalaAttributeValueUpdateOps(val self: ScalaAttributeValueUpdate) extends AnyVal {

    def toJava: JavaAttributeValueUpdate = {
      val result = JavaAttributeValueUpdate.builder()
                                      self.value.foreach{ v => import AttributeValueOps._; result.value(v.toJava) } // AttributeValue, case Other
                      self.action.foreach{ v => import AttributeActionOps._; result.action(v.toJava) } // String, case Other

      result.build()
    }

  }

  implicit class JavaAttributeValueUpdateOps(val self: JavaAttributeValueUpdate) extends AnyVal {

     def toScala: ScalaAttributeValueUpdate = {
       ScalaAttributeValueUpdate()
            .withValue(Option(self.value).map{ v => import AttributeValueOps._; v.toScala}) // AttributeValue, Map-12
            .withAction(Option(self.action).map{ v => import AttributeActionOps._; v.toScala}) // String, Map-12
     }

   }

}