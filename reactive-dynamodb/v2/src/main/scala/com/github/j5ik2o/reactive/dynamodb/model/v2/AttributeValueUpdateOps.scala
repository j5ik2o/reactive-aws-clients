package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ AttributeAction, AttributeValueUpdate => ScalaAttributeValueUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeValueUpdate => JavaAttributeValueUpdate }

object AttributeValueUpdateOps {

  import AttributeValueOps._

  implicit class ScalaAttributeValueUpdateOps(val self: ScalaAttributeValueUpdate) extends AnyVal {

    def toJava: JavaAttributeValueUpdate = {
      val result = JavaAttributeValueUpdate.builder()
      self.value.map(_.toJava).foreach(result.value)
      self.action.map(_.entryName).foreach(result.action)
      result.build()
    }

  }

  implicit class JavaAttributeValueUpdateOps(val self: JavaAttributeValueUpdate) extends AnyVal {

    def toScala: ScalaAttributeValueUpdate = {
      ScalaAttributeValueUpdate()
        .withValue(Option(self.value).map(_.toScala))
        .withAction(Option(self.action).map(_.toString).map(AttributeAction.withName))
    }

  }

}
