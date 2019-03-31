// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ BucketLifecycleConfiguration => ScalaBucketLifecycleConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ BucketLifecycleConfiguration => JavaBucketLifecycleConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BucketLifecycleConfigurationOps {

  implicit class ScalaBucketLifecycleConfigurationOps(val self: ScalaBucketLifecycleConfiguration) extends AnyVal {

    def toJava: JavaBucketLifecycleConfiguration = {
      val result = JavaBucketLifecycleConfiguration.builder()
      self.rules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LifecycleRuleOps._; result.rules(v.map(_.toJava).asJava)
      } // Seq[LifecycleRule]

      result.build()
    }

  }

  implicit class JavaBucketLifecycleConfigurationOps(val self: JavaBucketLifecycleConfiguration) extends AnyVal {

    def toScala: ScalaBucketLifecycleConfiguration = {
      ScalaBucketLifecycleConfiguration()
        .withRules(Option(self.rules).map { v =>
          import scala.collection.JavaConverters._, LifecycleRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[LifecycleRule]
    }

  }

}
