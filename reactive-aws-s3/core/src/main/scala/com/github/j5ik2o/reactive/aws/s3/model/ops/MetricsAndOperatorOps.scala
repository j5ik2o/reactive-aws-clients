// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ MetricsAndOperator => ScalaMetricsAndOperator, _ }
import software.amazon.awssdk.services.s3.model.{ MetricsAndOperator => JavaMetricsAndOperator }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MetricsAndOperatorOps {

  implicit class ScalaMetricsAndOperatorOps(val self: ScalaMetricsAndOperator) extends AnyVal {

    def toJava: JavaMetricsAndOperator = {
      val result = JavaMetricsAndOperator.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

  implicit class JavaMetricsAndOperatorOps(val self: JavaMetricsAndOperator) extends AnyVal {

    def toScala: ScalaMetricsAndOperator = {
      ScalaMetricsAndOperator()
        .withPrefix(Option(self.prefix)) // String
        .withTags(Option(self.tags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
