// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsFilter => ScalaAnalyticsFilter, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsFilter => JavaAnalyticsFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AnalyticsFilterOps {

  implicit class ScalaAnalyticsFilterOps(val self: ScalaAnalyticsFilter) extends AnyVal {

    def toJava: JavaAnalyticsFilter = {
      val result = JavaAnalyticsFilter.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tag.foreach { v =>
        import TagOps._; result.tag(v.toJava)
      } // Tag
      self.and.foreach { v =>
        import AnalyticsAndOperatorOps._; result.and(v.toJava)
      } // AnalyticsAndOperator

      result.build()
    }

  }

  implicit class JavaAnalyticsFilterOps(val self: JavaAnalyticsFilter) extends AnyVal {

    def toScala: ScalaAnalyticsFilter = {
      ScalaAnalyticsFilter()
        .withPrefix(Option(self.prefix)) // String
        .withTag(Option(self.tag).map { v =>
          import TagOps._; v.toScala
        }) // Tag
        .withAnd(Option(self.and).map { v =>
          import AnalyticsAndOperatorOps._; v.toScala
        }) // AnalyticsAndOperator
    }

  }

}
