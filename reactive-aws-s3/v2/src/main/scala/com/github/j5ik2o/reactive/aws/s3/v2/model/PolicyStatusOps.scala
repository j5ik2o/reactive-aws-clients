// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PolicyStatus => ScalaPolicyStatus, _ }
import software.amazon.awssdk.services.s3.model.{ PolicyStatus => JavaPolicyStatus }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PolicyStatusOps {

  implicit class ScalaPolicyStatusOps(val self: ScalaPolicyStatus) extends AnyVal {

    def toJava: JavaPolicyStatus = {
      val result = JavaPolicyStatus.builder()
      self.isPublic.map(_.booleanValue).foreach(v => result.isPublic(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaPolicyStatusOps(val self: JavaPolicyStatus) extends AnyVal {

    def toScala: ScalaPolicyStatus = {
      ScalaPolicyStatus()
        .withIsPublic(Option(self.isPublic).map(_.booleanValue)) // Boolean
    }

  }

}
