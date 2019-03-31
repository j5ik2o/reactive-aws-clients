// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ LifecycleRule => ScalaLifecycleRule, _ }
import software.amazon.awssdk.services.s3.model.{ LifecycleRule => JavaLifecycleRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LifecycleRuleOps {

  implicit class ScalaLifecycleRuleOps(val self: ScalaLifecycleRule) extends AnyVal {

    def toJava: JavaLifecycleRule = {
      val result = JavaLifecycleRule.builder()
      self.expiration.foreach { v =>
        import LifecycleExpirationOps._; result.expiration(v.toJava)
      } // LifecycleExpiration
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.filter.foreach { v =>
        import LifecycleRuleFilterOps._; result.filter(v.toJava)
      } // LifecycleRuleFilter
      self.status.foreach { v =>
        import ExpirationStatusOps._; result.status(v.toJava)
      } // String
      self.transitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TransitionOps._; result.transitions(v.map(_.toJava).asJava)
      } // Seq[Transition]
      self.noncurrentVersionTransitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, NoncurrentVersionTransitionOps._;
        result.noncurrentVersionTransitions(v.map(_.toJava).asJava)
      } // Seq[NoncurrentVersionTransition]
      self.noncurrentVersionExpiration.foreach { v =>
        import NoncurrentVersionExpirationOps._; result.noncurrentVersionExpiration(v.toJava)
      } // NoncurrentVersionExpiration
      self.abortIncompleteMultipartUpload.foreach { v =>
        import AbortIncompleteMultipartUploadOps._; result.abortIncompleteMultipartUpload(v.toJava)
      } // AbortIncompleteMultipartUpload

      result.build()
    }

  }

  implicit class JavaLifecycleRuleOps(val self: JavaLifecycleRule) extends AnyVal {

    def toScala: ScalaLifecycleRule = {
      ScalaLifecycleRule()
        .withExpiration(Option(self.expiration).map { v =>
          import LifecycleExpirationOps._; v.toScala
        }) // LifecycleExpiration
        .withId(Option(self.id)) // String
        .withPrefix(Option(self.prefix)) // String
        .withFilter(Option(self.filter).map { v =>
          import LifecycleRuleFilterOps._; v.toScala
        }) // LifecycleRuleFilter
        .withStatus(Option(self.status).map { v =>
          import ExpirationStatusOps._; v.toScala
        }) // String
        .withTransitions(Option(self.transitions).map { v =>
          import scala.collection.JavaConverters._, TransitionOps._; v.asScala.map(_.toScala)
        }) // Seq[Transition]
        .withNoncurrentVersionTransitions(Option(self.noncurrentVersionTransitions).map { v =>
          import scala.collection.JavaConverters._, NoncurrentVersionTransitionOps._; v.asScala.map(_.toScala)
        }) // Seq[NoncurrentVersionTransition]
        .withNoncurrentVersionExpiration(Option(self.noncurrentVersionExpiration).map { v =>
          import NoncurrentVersionExpirationOps._; v.toScala
        }) // NoncurrentVersionExpiration
        .withAbortIncompleteMultipartUpload(Option(self.abortIncompleteMultipartUpload).map { v =>
          import AbortIncompleteMultipartUploadOps._; v.toScala
        }) // AbortIncompleteMultipartUpload
    }

  }

}
