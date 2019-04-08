// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationRuleAndOperatorBuilderOps(val self: ReplicationRuleAndOperator.Builder) extends AnyVal {

  final def prefixAsScala(value: Option[String]): ReplicationRuleAndOperator.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ReplicationRuleAndOperator.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ReplicationRuleAndOperatorOps(val self: ReplicationRuleAndOperator) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationRuleAndOperatorOps {

  implicit def toReplicationRuleAndOperatorBuilderOps(
      v: ReplicationRuleAndOperator.Builder
  ): ReplicationRuleAndOperatorBuilderOps = new ReplicationRuleAndOperatorBuilderOps(v)

  implicit def toReplicationRuleAndOperatorOps(v: ReplicationRuleAndOperator): ReplicationRuleAndOperatorOps =
    new ReplicationRuleAndOperatorOps(v)

}
