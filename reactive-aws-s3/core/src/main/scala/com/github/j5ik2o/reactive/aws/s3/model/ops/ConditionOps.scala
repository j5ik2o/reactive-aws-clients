// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Condition => ScalaCondition, _ }
import software.amazon.awssdk.services.s3.model.{ Condition => JavaCondition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConditionOps {

  implicit class ScalaConditionOps(val self: ScalaCondition) extends AnyVal {

    def toJava: JavaCondition = {
      val result = JavaCondition.builder()
      self.httpErrorCodeReturnedEquals.filter(_.nonEmpty).foreach(v => result.httpErrorCodeReturnedEquals(v)) // String
      self.keyPrefixEquals.filter(_.nonEmpty).foreach(v => result.keyPrefixEquals(v))                         // String

      result.build()
    }

  }

  implicit class JavaConditionOps(val self: JavaCondition) extends AnyVal {

    def toScala: ScalaCondition = {
      ScalaCondition()
        .withHttpErrorCodeReturnedEquals(Option(self.httpErrorCodeReturnedEquals)) // String
        .withKeyPrefixEquals(Option(self.keyPrefixEquals)) // String
    }

  }

}
