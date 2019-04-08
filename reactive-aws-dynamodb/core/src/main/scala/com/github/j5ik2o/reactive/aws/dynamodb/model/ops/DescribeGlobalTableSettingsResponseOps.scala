// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeGlobalTableSettingsResponseBuilderOps(val self: DescribeGlobalTableSettingsResponse.Builder)
    extends AnyVal {

  final def globalTableNameAsScala(value: Option[String]): DescribeGlobalTableSettingsResponse.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

  final def replicaSettingsAsScala(
      value: Option[Seq[ReplicaSettingsDescription]]
  ): DescribeGlobalTableSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaSettings(v.asJava)
    } // Seq[ReplicaSettingsDescription]
  }

}

final class DescribeGlobalTableSettingsResponseOps(val self: DescribeGlobalTableSettingsResponse) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

  final def replicaSettingsAsScala: Option[Seq[ReplicaSettingsDescription]] = Option(self.replicaSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ReplicaSettingsDescription]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeGlobalTableSettingsResponseOps {

  implicit def toDescribeGlobalTableSettingsResponseBuilderOps(
      v: DescribeGlobalTableSettingsResponse.Builder
  ): DescribeGlobalTableSettingsResponseBuilderOps = new DescribeGlobalTableSettingsResponseBuilderOps(v)

  implicit def toDescribeGlobalTableSettingsResponseOps(
      v: DescribeGlobalTableSettingsResponse
  ): DescribeGlobalTableSettingsResponseOps = new DescribeGlobalTableSettingsResponseOps(v)

}
