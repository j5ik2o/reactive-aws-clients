package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ AttributeValueUpdate => JavaAttributeValueUpdate }
import com.github.j5ik2o.reactive.dynamodb.model.{ AttributeAction, AttributeValueUpdate => ScalaAttributeValueUpdate }

object AttributeValueUpdateOps {

  import AttributeValueOps._

  implicit class ScalaAttributeValueUpdateOps(val self: ScalaAttributeValueUpdate) extends AnyVal {

    def toJava: JavaAttributeValueUpdate = {
      val result = new JavaAttributeValueUpdate()
      self.value.map(_.toJava).foreach(result.setValue)
      self.action.map(_.entryName).foreach(result.setAction)
      result
    }

  }

  implicit class JavaAttributeValueUpdateOps(val self: JavaAttributeValueUpdate) extends AnyVal {

    def toScala: ScalaAttributeValueUpdate = {
      ScalaAttributeValueUpdate()
        .withValue(Option(self.getValue).map(_.toScala))
        .withAction(Option(self.getAction).map(AttributeAction.withName))
    }

  }

}
