// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeGlobalTableSettingsResponseBuilderOps(val self: DescribeGlobalTableSettingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala(value: Option[String]): DescribeGlobalTableSettingsResponse.Builder = {
    value.fold(self) { v => self.globalTableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsAsScala(
      value: Option[Seq[ReplicaSettingsDescription]]
  ): DescribeGlobalTableSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaSettings(v.asJava)
    }
  }

}

final class DescribeGlobalTableSettingsResponseOps(val self: DescribeGlobalTableSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsAsScala: Option[Seq[ReplicaSettingsDescription]] =
    Option(self.replicaSettings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
