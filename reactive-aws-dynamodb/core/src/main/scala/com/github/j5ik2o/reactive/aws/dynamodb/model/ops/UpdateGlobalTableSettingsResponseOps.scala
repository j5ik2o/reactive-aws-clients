// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableSettingsResponseBuilderOps(val self: UpdateGlobalTableSettingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala(value: Option[String]): UpdateGlobalTableSettingsResponse.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsAsScala(
      value: Option[Seq[ReplicaSettingsDescription]]
  ): UpdateGlobalTableSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaSettings(v.asJava)
    }
  }

}

final class UpdateGlobalTableSettingsResponseOps(val self: UpdateGlobalTableSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsAsScala: Option[Seq[ReplicaSettingsDescription]] = Option(self.replicaSettings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGlobalTableSettingsResponseOps {

  implicit def toUpdateGlobalTableSettingsResponseBuilderOps(
      v: UpdateGlobalTableSettingsResponse.Builder
  ): UpdateGlobalTableSettingsResponseBuilderOps = new UpdateGlobalTableSettingsResponseBuilderOps(v)

  implicit def toUpdateGlobalTableSettingsResponseOps(
      v: UpdateGlobalTableSettingsResponse
  ): UpdateGlobalTableSettingsResponseOps = new UpdateGlobalTableSettingsResponseOps(v)

}
