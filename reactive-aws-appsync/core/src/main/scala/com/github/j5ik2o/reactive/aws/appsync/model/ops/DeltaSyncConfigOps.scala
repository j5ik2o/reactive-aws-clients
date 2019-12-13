// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeltaSyncConfigBuilderOps(val self: DeltaSyncConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseTableTTLAsScala(value: Option[Long]): DeltaSyncConfig.Builder = {
    value.fold(self) { v =>
      self.baseTableTTL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deltaSyncTableNameAsScala(value: Option[String]): DeltaSyncConfig.Builder = {
    value.fold(self) { v =>
      self.deltaSyncTableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deltaSyncTableTTLAsScala(value: Option[Long]): DeltaSyncConfig.Builder = {
    value.fold(self) { v =>
      self.deltaSyncTableTTL(v)
    }
  }

}

final class DeltaSyncConfigOps(val self: DeltaSyncConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseTableTTLAsScala: Option[Long] = Option(self.baseTableTTL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deltaSyncTableNameAsScala: Option[String] = Option(self.deltaSyncTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deltaSyncTableTTLAsScala: Option[Long] = Option(self.deltaSyncTableTTL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeltaSyncConfigOps {

  implicit def toDeltaSyncConfigBuilderOps(v: DeltaSyncConfig.Builder): DeltaSyncConfigBuilderOps =
    new DeltaSyncConfigBuilderOps(v)

  implicit def toDeltaSyncConfigOps(v: DeltaSyncConfig): DeltaSyncConfigOps = new DeltaSyncConfigOps(v)

}
