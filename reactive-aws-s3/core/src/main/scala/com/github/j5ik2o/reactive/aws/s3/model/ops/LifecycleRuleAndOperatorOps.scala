// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleAndOperatorBuilderOps(val self: LifecycleRuleAndOperator.Builder) extends AnyVal {

  final def withPrefixAsScala(value: Option[String]): LifecycleRuleAndOperator.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withTagsAsScala(value: Option[Seq[Tag]]): LifecycleRuleAndOperator.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

}

final class LifecycleRuleAndOperatorOps(val self: LifecycleRuleAndOperator) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleAndOperatorOps {

  implicit def toLifecycleRuleAndOperatorBuilderOps(
      v: LifecycleRuleAndOperator.Builder
  ): LifecycleRuleAndOperatorBuilderOps = new LifecycleRuleAndOperatorBuilderOps(v)

  implicit def toLifecycleRuleAndOperatorOps(v: LifecycleRuleAndOperator): LifecycleRuleAndOperatorOps =
    new LifecycleRuleAndOperatorOps(v)

}
