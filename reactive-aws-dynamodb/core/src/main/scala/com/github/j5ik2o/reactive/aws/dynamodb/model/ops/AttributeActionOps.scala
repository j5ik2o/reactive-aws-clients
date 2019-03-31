// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeAction => ScalaAttributeAction, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeAction => JavaAttributeAction }

object AttributeActionOps {

  implicit class ScalaAttributeActionOps(val self: ScalaAttributeAction) extends AnyVal {

    def toJava: JavaAttributeAction = {
      JavaAttributeAction.valueOf(self.entryName)
    }

  }

  implicit class JavaAttributeActionOps(val self: JavaAttributeAction) extends AnyVal {

    def toScala: ScalaAttributeAction = {
      ScalaAttributeAction.withName(self.toString)
    }

  }

}
