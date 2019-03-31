// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsAndOperator => ScalaAnalyticsAndOperator, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsAndOperator => JavaAnalyticsAndOperator }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AnalyticsAndOperatorOps {

  implicit class ScalaAnalyticsAndOperatorOps(val self: ScalaAnalyticsAndOperator) extends AnyVal {

    def toJava: JavaAnalyticsAndOperator = {
      val result = JavaAnalyticsAndOperator.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

  implicit class JavaAnalyticsAndOperatorOps(val self: JavaAnalyticsAndOperator) extends AnyVal {

    def toScala: ScalaAnalyticsAndOperator = {
      ScalaAnalyticsAndOperator()
        .withPrefix(Option(self.prefix)) // String
        .withTags(Option(self.tags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
