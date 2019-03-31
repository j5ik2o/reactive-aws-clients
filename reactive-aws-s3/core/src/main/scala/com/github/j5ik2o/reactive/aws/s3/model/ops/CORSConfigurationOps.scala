// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CORSConfiguration => ScalaCORSConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ CORSConfiguration => JavaCORSConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CORSConfigurationOps {

  implicit class ScalaCORSConfigurationOps(val self: ScalaCORSConfiguration) extends AnyVal {

    def toJava: JavaCORSConfiguration = {
      val result = JavaCORSConfiguration.builder()
      self.corsRules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CORSRuleOps._; result.corsRules(v.map(_.toJava).asJava)
      } // Seq[CORSRule]

      result.build()
    }

  }

  implicit class JavaCORSConfigurationOps(val self: JavaCORSConfiguration) extends AnyVal {

    def toScala: ScalaCORSConfiguration = {
      ScalaCORSConfiguration()
        .withCorsRules(Option(self.corsRules).map { v =>
          import scala.collection.JavaConverters._, CORSRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[CORSRule]
    }

  }

}
