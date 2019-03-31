// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsConfiguration => ScalaAnalyticsConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsConfiguration => JavaAnalyticsConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AnalyticsConfigurationOps {

  implicit class ScalaAnalyticsConfigurationOps(val self: ScalaAnalyticsConfiguration) extends AnyVal {

    def toJava: JavaAnalyticsConfiguration = {
      val result = JavaAnalyticsConfiguration.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v)) // String
      self.filter.foreach { v =>
        import AnalyticsFilterOps._; result.filter(v.toJava)
      } // AnalyticsFilter
      self.storageClassAnalysis.foreach { v =>
        import StorageClassAnalysisOps._; result.storageClassAnalysis(v.toJava)
      } // StorageClassAnalysis

      result.build()
    }

  }

  implicit class JavaAnalyticsConfigurationOps(val self: JavaAnalyticsConfiguration) extends AnyVal {

    def toScala: ScalaAnalyticsConfiguration = {
      ScalaAnalyticsConfiguration()
        .withId(Option(self.id)) // String
        .withFilter(Option(self.filter).map { v =>
          import AnalyticsFilterOps._; v.toScala
        }) // AnalyticsFilter
        .withStorageClassAnalysis(Option(self.storageClassAnalysis).map { v =>
          import StorageClassAnalysisOps._; v.toScala
        }) // StorageClassAnalysis
    }

  }

}
