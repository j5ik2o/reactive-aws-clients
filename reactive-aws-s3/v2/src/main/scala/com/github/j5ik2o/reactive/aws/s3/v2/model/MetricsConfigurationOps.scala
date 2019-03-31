// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ MetricsConfiguration => ScalaMetricsConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ MetricsConfiguration => JavaMetricsConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MetricsConfigurationOps {

  implicit class ScalaMetricsConfigurationOps(val self: ScalaMetricsConfiguration) extends AnyVal {

    def toJava: JavaMetricsConfiguration = {
      val result = JavaMetricsConfiguration.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v)) // String
      self.filter.foreach { v =>
        import MetricsFilterOps._; result.filter(v.toJava)
      } // MetricsFilter

      result.build()
    }

  }

  implicit class JavaMetricsConfigurationOps(val self: JavaMetricsConfiguration) extends AnyVal {

    def toScala: ScalaMetricsConfiguration = {
      ScalaMetricsConfiguration()
        .withId(Option(self.id)) // String
        .withFilter(Option(self.filter).map { v =>
          import MetricsFilterOps._; v.toScala
        }) // MetricsFilter
    }

  }

}
