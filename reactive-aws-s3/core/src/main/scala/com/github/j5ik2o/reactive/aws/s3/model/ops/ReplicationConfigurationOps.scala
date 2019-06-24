// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationConfigurationBuilderOps(val self: ReplicationConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): ReplicationConfiguration.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rulesAsScala(value: Option[Seq[ReplicationRule]]): ReplicationConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.rules(v.asJava)
    }
  }

}

final class ReplicationConfigurationOps(val self: ReplicationConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala: Option[String] = Option(self.role)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rulesAsScala: Option[Seq[ReplicationRule]] = Option(self.rules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationConfigurationOps {

  implicit def toReplicationConfigurationBuilderOps(
      v: ReplicationConfiguration.Builder
  ): ReplicationConfigurationBuilderOps = new ReplicationConfigurationBuilderOps(v)

  implicit def toReplicationConfigurationOps(v: ReplicationConfiguration): ReplicationConfigurationOps =
    new ReplicationConfigurationOps(v)

}
