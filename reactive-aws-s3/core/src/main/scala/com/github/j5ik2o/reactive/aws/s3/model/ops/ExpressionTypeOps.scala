// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ExpressionType => ScalaExpressionType, _ }
import software.amazon.awssdk.services.s3.model.{ ExpressionType => JavaExpressionType }

object ExpressionTypeOps {

  implicit class ScalaExpressionTypeOps(val self: ScalaExpressionType) extends AnyVal {

    def toJava: JavaExpressionType = {
      JavaExpressionType.valueOf(self.entryName)
    }

  }

  implicit class JavaExpressionTypeOps(val self: JavaExpressionType) extends AnyVal {

    def toScala: ScalaExpressionType = {
      ScalaExpressionType.withName(self.toString)
    }

  }

}
