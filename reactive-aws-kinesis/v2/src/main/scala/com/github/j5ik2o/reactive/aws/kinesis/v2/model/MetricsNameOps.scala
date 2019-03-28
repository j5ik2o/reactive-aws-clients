// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MetricsName => ScalaMetricsName, _ }
import software.amazon.awssdk.services.kinesis.model.{ MetricsName => JavaMetricsName }

object MetricsNameOps {

  implicit class ScalaMetricsNameOps(val self: ScalaMetricsName) extends AnyVal {

    def toJava: JavaMetricsName = {
      JavaMetricsName.valueOf(self.entryName)
    }

  }

  implicit class JavaMetricsNameOps(val self: JavaMetricsName) extends AnyVal {

    def toScala: ScalaMetricsName = {
      ScalaMetricsName.withName(self.toString)
    }

  }

}
