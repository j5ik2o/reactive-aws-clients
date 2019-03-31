// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ MetricsFilter => ScalaMetricsFilter, _ }
import software.amazon.awssdk.services.s3.model.{ MetricsFilter => JavaMetricsFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MetricsFilterOps {

  implicit class ScalaMetricsFilterOps(val self: ScalaMetricsFilter) extends AnyVal {

    def toJava: JavaMetricsFilter = {
      val result = JavaMetricsFilter.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tag.foreach { v =>
        import TagOps._; result.tag(v.toJava)
      } // Tag
      self.and.foreach { v =>
        import MetricsAndOperatorOps._; result.and(v.toJava)
      } // MetricsAndOperator

      result.build()
    }

  }

  implicit class JavaMetricsFilterOps(val self: JavaMetricsFilter) extends AnyVal {

    def toScala: ScalaMetricsFilter = {
      ScalaMetricsFilter()
        .withPrefix(Option(self.prefix)) // String
        .withTag(Option(self.tag).map { v =>
          import TagOps._; v.toScala
        }) // Tag
        .withAnd(Option(self.and).map { v =>
          import MetricsAndOperatorOps._; v.toScala
        }) // MetricsAndOperator
    }

  }

}
