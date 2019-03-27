// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeAction => ScalaAttributeAction, _ }
import com.amazonaws.services.dynamodbv2.model.{ AttributeAction => JavaAttributeAction }

object AttributeActionOps {

  implicit class ScalaAttributeActionOps(val self: ScalaAttributeAction) extends AnyVal {

    def toJava: JavaAttributeAction = {
      JavaAttributeAction.valueOf(self.entryName)
    }

  }

  implicit class JavaAttributeActionOps(val self: String) extends AnyVal {

    def toScala: ScalaAttributeAction = {
      ScalaAttributeAction.withName(self)
    }

  }

}
