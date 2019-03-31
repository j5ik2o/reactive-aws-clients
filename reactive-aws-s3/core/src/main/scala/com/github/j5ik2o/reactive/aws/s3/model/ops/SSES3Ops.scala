// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ SSES3 => ScalaSSES3, _ }
import software.amazon.awssdk.services.s3.model.{ SSES3 => JavaSSES3 }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SSES3Ops {

  implicit class ScalaSSES3Ops(val self: ScalaSSES3) extends AnyVal {

    def toJava: JavaSSES3 = {
      val result = JavaSSES3.builder()

      result.build()
    }

  }

  implicit class JavaSSES3Ops(val self: JavaSSES3) extends AnyVal {

    def toScala: ScalaSSES3 = {
      ScalaSSES3()
    }

  }

}
