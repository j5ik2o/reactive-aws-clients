// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ S3KeyFilter => ScalaS3KeyFilter, _ }
import software.amazon.awssdk.services.s3.model.{ S3KeyFilter => JavaS3KeyFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object S3KeyFilterOps {

  implicit class ScalaS3KeyFilterOps(val self: ScalaS3KeyFilter) extends AnyVal {

    def toJava: JavaS3KeyFilter = {
      val result = JavaS3KeyFilter.builder()
      self.filterRules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, FilterRuleOps._; result.filterRules(v.map(_.toJava).asJava)
      } // Seq[FilterRule]

      result.build()
    }

  }

  implicit class JavaS3KeyFilterOps(val self: JavaS3KeyFilter) extends AnyVal {

    def toScala: ScalaS3KeyFilter = {
      ScalaS3KeyFilter()
        .withFilterRules(Option(self.filterRules).map { v =>
          import scala.collection.JavaConverters._, FilterRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[FilterRule]
    }

  }

}
