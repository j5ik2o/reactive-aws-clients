// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CommonPrefix => ScalaCommonPrefix, _ }
import software.amazon.awssdk.services.s3.model.{ CommonPrefix => JavaCommonPrefix }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CommonPrefixOps {

  implicit class ScalaCommonPrefixOps(val self: ScalaCommonPrefix) extends AnyVal {

    def toJava: JavaCommonPrefix = {
      val result = JavaCommonPrefix.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String

      result.build()
    }

  }

  implicit class JavaCommonPrefixOps(val self: JavaCommonPrefix) extends AnyVal {

    def toScala: ScalaCommonPrefix = {
      ScalaCommonPrefix()
        .withPrefix(Option(self.prefix)) // String
    }

  }

}
