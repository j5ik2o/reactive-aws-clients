// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MetricsName => ScalaMetricsName, _ }
import com.amazonaws.services.kinesis.model.{ MetricsName => JavaMetricsName }

object MetricsNameOps {

  implicit class ScalaMetricsNameOps(val self: ScalaMetricsName) extends AnyVal {

    def toJava: JavaMetricsName = {
      JavaMetricsName.valueOf(self.entryName)
    }

  }

  implicit class JavaMetricsNameOps(val self: String) extends AnyVal {

    def toScala: ScalaMetricsName = {
      ScalaMetricsName.withName(self)
    }

  }

}
