// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LifecyclePolicyPreviewResultBuilderOps(val self: LifecyclePolicyPreviewResult.Builder) extends AnyVal {

  final def imageTagsAsScala(value: Option[Seq[String]]): LifecyclePolicyPreviewResult.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageTags(v.asJava)
    }
  }

  final def imageDigestAsScala(value: Option[String]): LifecyclePolicyPreviewResult.Builder = {
    value.fold(self) { v =>
      self.imageDigest(v)
    }
  }

  final def imagePushedAtAsScala(value: Option[java.time.Instant]): LifecyclePolicyPreviewResult.Builder = {
    value.fold(self) { v =>
      self.imagePushedAt(v)
    }
  }

  final def actionAsScala(value: Option[LifecyclePolicyRuleAction]): LifecyclePolicyPreviewResult.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def appliedRulePriorityAsScala(value: Option[Int]): LifecyclePolicyPreviewResult.Builder = {
    value.fold(self) { v =>
      self.appliedRulePriority(v)
    }
  }

}

final class LifecyclePolicyPreviewResultOps(val self: LifecyclePolicyPreviewResult) extends AnyVal {

  final def imageTagsAsScala: Option[Seq[String]] = Option(self.imageTags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def imageDigestAsScala: Option[String] = Option(self.imageDigest)

  final def imagePushedAtAsScala: Option[java.time.Instant] = Option(self.imagePushedAt)

  final def actionAsScala: Option[LifecyclePolicyRuleAction] = Option(self.action)

  final def appliedRulePriorityAsScala: Option[Int] = Option(self.appliedRulePriority)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecyclePolicyPreviewResultOps {

  implicit def toLifecyclePolicyPreviewResultBuilderOps(
      v: LifecyclePolicyPreviewResult.Builder
  ): LifecyclePolicyPreviewResultBuilderOps = new LifecyclePolicyPreviewResultBuilderOps(v)

  implicit def toLifecyclePolicyPreviewResultOps(v: LifecyclePolicyPreviewResult): LifecyclePolicyPreviewResultOps =
    new LifecyclePolicyPreviewResultOps(v)

}
