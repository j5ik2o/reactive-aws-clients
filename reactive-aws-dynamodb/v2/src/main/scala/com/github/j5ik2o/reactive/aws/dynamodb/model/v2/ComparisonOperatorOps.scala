// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ComparisonOperator => ScalaComparisonOperator, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ComparisonOperator => JavaComparisonOperator }

object ComparisonOperatorOps {

  implicit class ScalaComparisonOperatorOps(val self: ScalaComparisonOperator) extends AnyVal {

    def toJava: JavaComparisonOperator = {
      JavaComparisonOperator.valueOf(self.entryName)
    }

  }

  implicit class JavaComparisonOperatorOps(val self: JavaComparisonOperator) extends AnyVal {

    def toScala: ScalaComparisonOperator = {
      ScalaComparisonOperator.withName(self.toString)
    }

  }

}
